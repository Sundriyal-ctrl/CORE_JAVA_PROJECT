package ResultSetOperation.savepoint;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SavePoint {
    static final String DB_URL = "jdbc:mysql://localhost:3306/anuj";
    static final String USER = "root";
    static final String PASS = "root";
    static final String QUERY = "SELECT id,name FROM teacher";
    static final String DELETE_QUERY = "DELETE FROM teacher WHERE ID = 3";
    static final String DELETE_QUERY_1 = "DELETE FROM teacher WHERE ID = 2";

    public static void printResultSet(ResultSet rs) throws SQLException{
        // Ensure we start with first row
        rs.beforeFirst();
        while(rs.next()){
            // Display values
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", name: " + rs.getString("name"));

        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
        ) {

            conn.setAutoCommit(false);
            ResultSet rs = stmt.executeQuery(QUERY);
            System.out.println("List result set for reference....");
            printResultSet(rs);

            // delete row having ID = 3
            // But save point before doing so.
            Savepoint savepoint1 = conn.setSavepoint("ROWS_DELETED_1");
            System.out.println("Deleting row....");
            stmt.executeUpdate(DELETE_QUERY);
            // Rollback the changes after save point 1.
            conn.rollback(savepoint1);

            // delete rows having ID = 3
            // But save point before doing so.
            conn.setSavepoint("ROWS_DELETED_2");
            System.out.println("Deleting row....");

            stmt.executeUpdate(DELETE_QUERY_1);

            rs = stmt.executeQuery(QUERY);
            System.out.println("List result set for reference....");
            printResultSet(rs);

            // Clean-up environment
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
/*
output
List result set for reference....
ID: 1, name: LataID: 2, name: LatikaID: 3, name: anuj
Deleting row....
Deleting row....
List result set for reference....
ID: 1, name: LataID: 3, name: anuj
Wed Aug 31 23:47:23 IST 2022 WARN: Caught while disconnecting...

EXCEPTION STACK TRACE:



** BEGIN NESTED EXCEPTION **

javax.net.ssl.SSLException
MESSAGE: closing inbound before receiving peer's close_notify

STACKTRACE:

javax.net.ssl.SSLException: closing inbound before receiving peer's close_notify
	at sun.security.ssl.SSLSocketImpl.shutdownInput(SSLSocketImpl.java:740)
	at sun.security.ssl.SSLSocketImpl.shutdownInput(SSLSocketImpl.java:719)
	at com.mysql.cj.protocol.a.NativeProtocol.quit(NativeProtocol.java:1284)
	at com.mysql.cj.NativeSession.quit(NativeSession.java:182)
	at com.mysql.cj.jdbc.ConnectionImpl.realClose(ConnectionImpl.java:1911)
	at com.mysql.cj.jdbc.ConnectionImpl.close(ConnectionImpl.java:730)
	at ResultSetOperation.savepoint.SavePoint.main(SavePoint.java:65)


** END NESTED EXCEPTION **
 */
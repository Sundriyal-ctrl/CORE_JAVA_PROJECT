package Day16;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * Explore this code execute t,pass the argument for CLI
 * add code for case :
 * if access granted print that file data in console
 *
 * @Author anuj sundriyal
 */
class PracticeDriver {
    public static void main(String args[]) {
        try {
            String logFileName = args[0];
            File f = new File(logFileName+".txt");
            boolean access_granted = false;
            String password = "";

            if (args.length == 2) {
                System.out.println("Checking command-line password");
                password = password + args[1];

                if (password.equals("3dTAqb.7")) {
                    access_granted = true;
                    System.out.println("Password matches.");
                } else {
                    System.out.println("Command-1ine password does not match");
                }
            }//end i
            if (access_granted) {
                System.out.println("Access granted!");

                PrintWriter out = new PrintWriter(new FileOutputStream(f, true));
                out.println();
                out.print("Updated...");
                out.println();
                out.flush();
                out.close();
            }
        }//end try
        catch (Exception e) {
            System.out.println("an error has occured.");
        }
    }
}
/*
OUTPUT
Checking command-line password
Password matches.
Access granted!
 */
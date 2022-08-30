package jdbcDay2.EmployeeManupulation;

import java.util.Date;

public class EmployeeData {
    private int id;
    private String name;
    private String designation;
    private Date dateOfJoining;
    private int experience;
    private int salary;
    private String status;
    public EmployeeData()
    {}
    public EmployeeData(int id, String name, String designation, Date dateOfJoining, int experience, int salary, String status) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.dateOfJoining = dateOfJoining;
        this.experience = experience;
        this.salary = salary;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

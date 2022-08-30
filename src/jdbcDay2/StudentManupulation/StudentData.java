package jdbcDay2.StudentManupulation;

public class StudentData {
    private int id;
    private String name;
    private int year;
    private int percentage;
    private String city;
    private String gender;
   public  StudentData(){}
    public StudentData(int id, String name, int year, int percentage, String city) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.percentage = percentage;
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

package Day12;
class BuilderPattern
{
    private String name;
    private String address;
    private String email;
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
    private BuilderPattern(Builder b){
        this.address=b.address;
        this.email=b.email;
        this.name=b.name;
    }
   public static class Builder
   {
       private String name;
       private String address;
       private String email;
       public Builder(String name, String address) {
           this.name = name;
           this.address = address;
       }



   }

}
public class in {
    public static void main(String[] args) {

    }
}

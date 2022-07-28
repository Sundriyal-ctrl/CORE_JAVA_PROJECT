package Day3;
class CalculatorCase {
    public void Choices(String choice)
    {
        switch(choice)
        {
            case "Addition":
                System.out.println("Case for Addition");
                break;

            case "Subtraction":
                System.out.println("case for Subtraction");
                break;

            case "Multiplication":
                System.out.println("Case for Multiplication");
                break;
            case "Division":
                System.out.println("Case for Division");
                break;

            default:
                System.out.println("Default Case");
                break;
        }
    }
}
public class SwitchCases {
    public static void main(String[] args) {
        CalculatorCase c =  new CalculatorCase();
        c.Choices("Multiplication");
    }

}

package DAY_2_20_07_2022_JAVA;
class CPU {
    double price;
    //nested class
    class Processor{
        //member of nested class
        double cores;
        String manufacturer;

        double getCatch(){
            return 4.3;
        }
        public String toString()
        {
            return "cores : "+cores+" \n manufacturer : "+manufacturer;
        }
    }
    //nested protected class
    protected class RAM{
        //member of protected nested class
        double memory;
        String manufacturer;

        double getClockSpeed(){
            return 5.5;
        }
        public String toString()
        {
            return "memory : "+memory+" \n manufacturer : "+manufacturer;
        }
    }
}
//driver class
public class CpuCaller {
    public static void main(String a[]) {
        CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor();
        processor.manufacturer="SAMSUNG";
        processor.cores=4;
        System.out.println(processor);
        System.out.println("Processor class detail : "+processor.getCatch());
        CPU.RAM ram = cpu.new RAM();
        ram.manufacturer="WD";
        ram.memory=4;
        System.out.println(ram);
        System.out.println("Ram class detail : "+ram.getClockSpeed());
    }
}

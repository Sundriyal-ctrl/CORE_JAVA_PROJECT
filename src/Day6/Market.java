package Day6;

abstract class SuperMarket {
    int NumberOfFloor;
    static String Category[] = new String[]{"Mens Floor","Women Floor","Kids Floor"};
    String name;
    long PhoneNumber;
    abstract public void PaymentMethod();
    abstract public void TrialRoom();
    abstract public void feedback();
    abstract public void Discount(int percent);
}
class H extends SuperMarket{

    @Override
    public void PaymentMethod() {

    }

    @Override
    public void TrialRoom() {

    }

    @Override
    public void feedback() {

    }

    @Override
    public void Discount(int percent) {

    }
}

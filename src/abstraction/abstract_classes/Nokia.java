package abstraction.abstract_classes;

public class Nokia extends Phone implements Camera, Bluetooth{

    public static final String OS = "Android";

    public Nokia(){

    }

    public Nokia(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    @Override
    public void call() {
        System.out.println("Nokia calls");
    }

    @Override
    public void ring() {
        System.out.println("Nokia rings");
    }

    @Override
    public void text() {
        System.out.println("Nokia texts");
    }

    @Override
    public boolean isConvertible() {
        return false;
    }

    @Override
    public void takesPhoto() {
        System.out.println("Nokia takes photos");
    }

    @Override
    public void connectBluetooth() {
        System.out.println("Nokia can connect to bluetooth");
    }
}

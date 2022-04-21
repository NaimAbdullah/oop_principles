package abstraction.abstract_classes;

public interface Bluetooth {
    void connectBluetooth();

    //Methods that has body - later versions of Java

    //Static method
    static int getYear(){
        return 2022;
    }

    //Default method (non-static method that has body)
    default boolean isConnected(){
        return true;
    }
}

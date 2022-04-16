package encapsulation;

public class Car {

    //instance variables
    public String make;
    private int year;
    private double price; // Requires a password
    private boolean isConvertable = true; //

    //Providing indirect access to year to set and get info
    //Setting
    public void setYear(int year){
        this.year = year;
    }
    //Getting
    public int getYear(){
        return year;
    }

    //Providing indirect access to price to set and get info
    //Setting
    public void setPrice(double price, String adminPassword){
        if(adminPassword.equals("abcd1234")) this.price = price;
        else throw new RuntimeException("The password entered is not valid");
    }
    //Getting
    public double getPrice(){
        return price;
    }

    public boolean getIsConvertable(){
        return getIsConvertable();
    }

}

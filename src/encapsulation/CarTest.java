package encapsulation;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();

        //Setting info for make
        car1.make = "BMW";
        //Getting info of make
        System.out.println(car1.make); //BMW

        //Setting info for year
        car1.setYear(2020);
        //Getting info of  year
        System.out.println(car1.getYear());

        //Setting price with password
        car1.setPrice(5000, "abcd1234");
        //Getting price
        System.out.println(car1.getPrice());

        System.out.println(car1.getIsConvertable());
    }
}

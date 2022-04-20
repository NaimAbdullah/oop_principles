package abstraction.abstract_classes;

import java.util.ArrayList;
import java.util.List;

public class TestAbstraction {
    public static void main(String[] args) {

        /*
        Create an object of Samsung called s1
        info it will have it below

        Samsung
        Black
        64
        700
         */

        Samsung s1 = new Samsung("Samsung", "Black", 64, 700);
        Nokia n1 = new Nokia("Nokia", "Blue", 4, 100);
        Iphone i1 = new Iphone("Apple", "Silver", 128, 1000);

        List<Phone> phones = new ArrayList<>();
        phones.add(s1);
        phones.add(n1);
        phones.add(i1);

        /*
        Print all objects
        Find and print the most expensive one with the message, "The most expensive phone is = Iphone"
        Find and print how many phones are convertible -> 2
         */

        int countConvertible = 0;
        int max = Integer.MIN_VALUE;
        Phone mostExpensive = null;

        for (Phone phone : phones) {
            System.out.println(phone);
            if(phone.isConvertible()) countConvertible++;
            if(phone.price > max) mostExpensive = phone;
        }

        System.out.println(countConvertible);
        System.out.println("The most expensive phone is = " + mostExpensive.getClass().getSimpleName());


    }
}


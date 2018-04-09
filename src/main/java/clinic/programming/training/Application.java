package clinic.programming.trainning;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static List<String> names;

    {
        names = new ArrayList<>();
        names.add("Fred");
        names.add("Jim");
    }

    public void greetFriends(List<String> nameList){


        for (String s : nameList) {
            System.out.println("hello " + s);
        }
    }
    public Application() {

        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
    	new Application().greetFriends(names);

    }
}
package clinic.programming.trainning;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;


public class Application {
    public static List<String> names;

    {
        names = new ArrayList<>();
        names.add("Fred");
        names.add("Jim");
    }

    public int countWords(String line){
        String[] words = StringUtils.split(line," ");
        int len = (words == null) ? 0:words.length;
        return len;
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
    	new Application().countWords("how many words is ther e?");

    }
}
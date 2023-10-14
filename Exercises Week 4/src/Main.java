
/* // Long version
public class Main {
    public static void main(String[] args) {
        java.util.Random rand = new java.util.Random();
        int i = rand.nextInt();
        System.out.println(i);
        i = rand.nextInt();
        System.out.println(i);
    }
}
 */

// Import it to make the random variable creation shorter and more readable
/*
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random(100);
        Random rand2 = new Random(100);
        int i = rand.nextInt(100);
        System.out.println(i);
        i = rand.nextInt(i);
        System.out.println(i);
        i = rand2.nextInt(i);
        System.out.println(i);
    }
}

*/


/*
 *
 * nexInt(900) + 100 = range of 0 - 999
 * (900-1)+100
 * nextInt(6) + 1 = range 1 - 6
 * */

import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        for (int e = 0; e <=999; e++) {
            Random rand = new Random();
            int i = rand.nextInt(50) + 50; // rage 1 to 6
            array.add(i);
        //System.out.println(i);
        }
        Collections.sort(array);
        System.out.println(array.get(0));
        System.out.println(array.get(array.size()-1));
    }
}
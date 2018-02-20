package basictypes;

import java.util.*;

public class Seven {
    public static void main(String[] args) {
        Random z = new Random();
        int x = z.nextInt(70);
        if (x % 10 == 7) {
            System.out.println(x + " является цифрой 7");
        } else {
            System.out.println(x + " не является цифрой 7");
        }
    }
}

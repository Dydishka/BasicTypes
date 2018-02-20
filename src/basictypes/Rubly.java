package basictypes;

import java.util.Random;

public class Rubly {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(2000);
        int b = a % 10;
        int c = a % 100;
        if ((b == 0) || (b == 5) || (b == 6) || (b == 7) || (b == 8) || (b == 9) || (c == 11) || (c == 12)
                || (c == 13) || (c == 14)) System.out.println(a + " Рублей");
        else if (b == 1) System.out.println(a + " Рубль");
        else if ((b == 2) || (b == 3) || (b == 4)) System.out.println(a + " Рубля");
    }
}
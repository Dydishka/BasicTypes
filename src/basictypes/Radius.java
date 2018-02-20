package basictypes;

import java.util.*;

public class Radius {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(50) + 1;
        int b = random.nextInt(50) + 1;
        int r = random.nextInt(40) + 1;
        System.out.println(a + " " + b + " " + r);
        int z;
        if (a >= b) z = a;
        else z = b;
        if (2 * r >= z) {
            System.out.println("Прямоугольник полность закрыт кругом с радиусом "+ r );
        } else {
            System.out.println("Прямоугольник не закрыт кругом с радиусом "+ r );
        }
    }
}

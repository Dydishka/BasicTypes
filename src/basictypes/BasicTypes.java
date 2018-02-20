package basictypes;

public class BasicTypes {
    public static void main(String[] args) {
        String a = new String("Добро пожаловать в реальный мир");
        System.out.println("Длина строки: " + a.length());
        int line = a.length() / 2;
        String x1 = a.substring(0, line);
        String x2 = a.substring(line);
        System.out.println(x1);
        System.out.println(x2);





    }
}
public class exercise1 {
    public static void main(String[] args) {
        double a = 15.123;
        double b = 9.563;
        double z = 0.717;

        double x = Math.pow(b, 1.0/4.0) + Math.pow(a - 1, 1.0/3.0);

        double y = Math.abs(a - b * (Math.pow(Math.sin(z), 2) + Math.tan(z)));

        System.out.println("Значение x: " + x);
        System.out.println("Значение y: " + y);
    }
}
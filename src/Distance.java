import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println("Distance from (" + (int) x + ", " + (int) y + ") to (0, 0) is " + Math.sqrt(x*x + y*y));
    }
}
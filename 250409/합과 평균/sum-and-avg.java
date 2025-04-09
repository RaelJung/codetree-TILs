import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B;

        A = sc.nextDouble();
        B = sc.nextDouble();

        System.out.printf("%.0f %.1f", A+B, ((A+B)/2.0));
    }
}
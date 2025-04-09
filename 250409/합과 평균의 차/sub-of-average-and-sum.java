import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int sum = a+b+c;
        int avg = sum/3;

        sb.append(sum+"\n");
        sb.append(avg+"\n");
        sb.append((sum-avg));

        System.out.println(sb.toString());
    }
}
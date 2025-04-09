import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();

        sb.append(((A>=B)?1:0)+"\n");
        sb.append(((A>B)?1:0)+"\n");
        sb.append(((B>=A)?1:0)+"\n");
        sb.append(((B>A)?1:0)+"\n");
        sb.append(((A==B)?1:0)+"\n");
        sb.append(((A!=B)?1:0));

        System.out.println(sb.toString());
    }
}
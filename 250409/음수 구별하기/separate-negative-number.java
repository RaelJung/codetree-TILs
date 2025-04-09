import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N;

        N = sc.nextInt();

        sb.append(N);
        if(N<0){
            sb.append("\nminus");
        }

        System.out.println(sb.toString());
    }
}
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double avg=0;
        boolean isOver = false;

        for(int i=0; i<10; i++){
            int num = sc.nextInt();
            if(num>=250){
                isOver = true;
                avg = sum / (i * 1.0);
                break;
            }
            sum += num;
        }

        if(!isOver){ 
            avg = sum / 10.0;
        }

        System.out.printf("%d %.1f", sum, avg);
    }
}
package Assignment_6;
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        int N=sc1.nextInt();
        System.out.println(triangle(N));
    }
    public static int triangle(int N){
        int sum=N;

        if(N==1){
            return 1;
        }
        else{
            return sum+triangle(N-1);
        }
    }
}

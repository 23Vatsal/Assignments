package Assignment_6;
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        int N=sc1.nextInt();
        print(N);

    }
    public static int pascal(int i,int j){
        if(j==1 || j==i){
            return 1;
        }
        else{
            return pascal(i-1,j-1) + pascal(i-1,j);
        }

    }
    public static void print(int N) {
    for(int i=1;i<=N;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" "+pascal(i,j));
        }
        System.out.println();
    }
    }
}

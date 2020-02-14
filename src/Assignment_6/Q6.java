package Assignment_6;
import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        int N=sc1.nextInt();
        int a[]=new int[N];
        for(int j=0;j<N;j++)
            a[j]=sc1.nextInt();
        int i=0;
        check(i,N,a);
    }
    public static void check(int i,int N,int a[]){
        if(i==N-1) {
            System.out.println("sorted");
            return;
        }
        if(a[i]>a[i+1]){
            System.out.println("not sorted");
            return;
        }
        check(i+1,N,a);




    }
}

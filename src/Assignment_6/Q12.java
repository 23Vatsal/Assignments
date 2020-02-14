package Assignment_6;
import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        int N=sc1.nextInt();
        int a[]=new int[N];
        int b[]=new int[N];
        int i=N-1;
        for(int j=0;j<N;j++)
            a[j]=sc1.nextInt();
        reverse(a,b,N,i);
    }

    public static void reverse(int a[],int b[],int N,int i){
        if(i==0) {
            System.out.println(Arrays.toString(b));
            return;
        }
        b[N-1-i]=a[i];
        b[N-1]=a[0];
        reverse(a,b,N,i-1);

    }
}

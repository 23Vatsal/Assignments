package Assignment_6;
import java.util.*;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        int N=sc1.nextInt();
        int a[]=new int[N];
        int b[]=new int[N];
        int i=0;
        for(int j=0;j<N;j++)
            a[j]=sc1.nextInt();
        System.out.println("Enter element");
        int M= sc1.nextInt();
        allIndex(a,b,i,M,N);
        System.out.println(Arrays.toString(b));
    }
    public static int[] allIndex(int a[],int b[],int i,int M,int N){
        if(i==N-1) {
            return b;
        }
        if(a[i]==M) {
            b[i]=1;
        }
        if(a[N-1]==M)
            b[N-1]=1;
            return allIndex(a,b,i+1,M,N);

    }

}

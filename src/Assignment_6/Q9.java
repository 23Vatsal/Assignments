package Assignment_6;
import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        int N=sc1.nextInt();
        int a[]=new int[N];
        int i=N-1;
        for(int j=0;j<N;j++)
            a[j]=sc1.nextInt();
        System.out.println("Enter element");
        int M= sc1.nextInt();
        System.out.println("Element found at index: "+lastIndex(a,i,M,N));
    }
    public static int lastIndex(int a[],int i,int M,int N){
        if(i==0){
            return -1;
        }
        if(a[i]==M){
            return N-i;
        }
        else{
           return lastIndex(a,i-1,M,N);
        }
    }
}

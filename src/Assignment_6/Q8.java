package Assignment_6;
import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        int N=sc1.nextInt();
        int a[]=new int[N];
        int i=0;
        for(int j=0;j<N;j++)
            a[j]=sc1.nextInt();
        System.out.println("Enter element");
        int M= sc1.nextInt();
        search(a,i,M,N);
    }
    public static void search(int a[],int i,int M,int N){
        if(i==N-1){
            System.out.println("Element not found");
            return;
        }
        if(a[i]==M){
            System.out.printf("Element found at %d",i+1);
            return;
        }
        search(a,i+1,M,N);
    }
}

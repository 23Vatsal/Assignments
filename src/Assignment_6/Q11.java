package Assignment_6;
import java.util.*;
public class Q11 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        int N=sc1.nextInt();
        int a[]=new int[N];
        int i=0;
        for(int j=0;j<N;j++)
            a[j]=sc1.nextInt();
        palindrome(i,N,a);
    }
    public static void palindrome(int i,int N,int a[]){
        if(i==N/2){
            System.out.println("palindrome");
            return;
        }
        if(a[N-1-i]==a[i]){
            palindrome(i+1,N,a);
        }
        else{
            System.out.println("Not a palindrome");
            return;
        }


    }
}

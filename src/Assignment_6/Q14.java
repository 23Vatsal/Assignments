package Assignment_6;
import  java.util.*;
public class Q14 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        int N=sc1.nextInt();
        int a[]=new int[N];
        int i=0;
        int j=N-1;
        for(int k=0;k<N;k++)
            a[k]=sc1.nextInt();
        bubble(i,j,a,N);
    }
    public static void bubble(int i,int j,int a[],int N){
        if(j==0){
            System.out.println(Arrays.toString(a));
            return;
        }
        if(i==j ){
            bubble(0,j-1,a,N);
        }
        if(i<=N-2 && a[i]>a[i+1]){
            int temp=a[i+1];
            a[i+1]=a[i];
            a[i]=temp;
        }
        bubble(i+1,j,a,N);

    }
}

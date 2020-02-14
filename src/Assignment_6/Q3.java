package Assignment_6;

import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        int N=sc1.nextInt();
        int row=N;
        int col=0;
        pattern(row,col,N);
    }
    public static void pattern(int row,int col,int N){
        if(row==0)
            return;
        if(col==row){
            System.out.println();
            pattern(row-1,0,N);
        }
        else{
            System.out.print("*");
            pattern(row,col+1,N);
        }
    }
}

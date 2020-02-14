package Assignment_6;

import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        int N=sc1.nextInt();
        int row=1;
        int col=0;
        pattern(row,col,N);
    }
    public static void pattern(int row,int col,int N){
        if(row==N+1){
            return;
        }
        if(row==col){
            System.out.println();
             pattern(row+1,0,N);
        }
        else {
            System.out.print("*");
            pattern(row, col + 1, N);
        }
    }
}

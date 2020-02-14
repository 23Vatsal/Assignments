package Assignment_6;

import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        int N=7;
        printdec(N);

    }
    public static void printdec(int N){
        if(N==0) {
            return;
        }
        if(N%2!=0){
            System.out.printf("%d ",N);
        }
        printdec(N-1);
        if(N%2==0){
            System.out.printf("%d ",N);
        }


    }

    }


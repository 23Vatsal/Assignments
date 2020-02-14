package Assignment_7;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        String unproc="1345";
        int proc=0;
        sum(proc,unproc);
    }
    public static void sum(int proc,String unproc){
        if(unproc.isEmpty()){
            System.out.println(proc);
            return;
        }
        int ch=unproc.charAt(0)-'0';
        unproc=unproc.substring(1);
        sum(proc+ch,unproc);
    }
}

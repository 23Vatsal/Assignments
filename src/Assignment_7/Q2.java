package Assignment_7;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        String unproc="1234";
        int proc=0;
        int r=unproc.length();
        change_int(proc,unproc,r);
    }
    public static void change_int(int proc,String unproc,int r){
        if(unproc.isEmpty()){
            System.out.println(proc);
            return;
        }
        int ch=unproc.charAt(0)-'0';
        unproc=unproc.substring(1);
        change_int(proc+ch*(int)Math.pow(10,r-1),unproc,r-1);
    }
}

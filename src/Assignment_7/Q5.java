package Assignment_7;
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        String unproc="hhllaabc";
        String proc="";
        int i=0;
        addStar(proc,unproc,i);
    }
    public static void addStar(String proc,String unproc,int i){
        char ch=unproc.charAt(0);
        unproc=unproc.substring(1);
        if(unproc.isEmpty()){
            proc=proc+ch;
            System.out.println(proc);
            return;
        }
        char ch1=unproc.charAt(0);
        if(ch==ch1){
            addStar(proc+ch+'*',unproc,i);
        }
        else
            addStar(proc+ch,unproc,i);
    }
}

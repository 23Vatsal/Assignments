package Assignment_7;
import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        String str="ahixyhiz";
        String pro="";
        int i=0;
        count_hi(pro,str,i);
        remove_hi(pro,str);

    }
    public static void count_hi(String pro,String str, int i){
        if(i==str.length()-1) {
            System.out.println("Number of 'hi' are: "+pro.length()/2);
            return;
        }
        if(str.charAt(i)=='h'){
            if(str.charAt(i+1)=='i'){
                count_hi(pro+"hi",str,i+1);
            }
        }
        else
            count_hi(pro,str,i+1);
    }
    public static void remove_hi(String pro,String str){

        if(str.isEmpty()) {
            System.out.println("After removing hi: "+pro);
            return;
        }
        char ch=str.charAt(0);
        str=str.substring(1);

        if(ch=='h' && str.charAt(0)=='i' ){

                str=str.substring(1);
                remove_hi(pro,str);

        }
        else
            remove_hi(pro+ch,str);

    }
}

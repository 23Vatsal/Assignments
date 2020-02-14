package Assignment_7;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        String s1="abc";
        String s2="cbz";
        int i=0;
        int j=s1.length()-1;
        System.out.println(checkRev(s1,s2,i,j));
    }
    public static int checkRev(String s1,String s2, int i,int j){
        if(i==s1.length()-1){
            return 1;
        }
        else if(s1.charAt(i)==s2.charAt(j)){
            return checkRev(s1,s2,i+1,j-1);
        }
        else
            return 0;
    }
}

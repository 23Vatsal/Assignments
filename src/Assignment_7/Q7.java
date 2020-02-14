/* Take as input str, a string. Write a recursive function which moves all ‘x’ from the
string to its end. E.g. for “abexexdexed” return “abeedeedxxx”.*/
package Assignment_7;
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        String unproc="abexexdexed";
        String proc="";
        String countx="";
        int count=0;
        for(int i=0;i<unproc.length();i++){
            if(unproc.charAt(i)=='x')
                count++;
        }
        for(int i=0;i<count;i++)
            countx+='x';
        removeX(proc,unproc,countx);
    }
    public static void removeX(String proc,String unproc, String countx){
        if(unproc.isEmpty()){
            System.out.println(proc+countx);
            return;
        }
        char ch=unproc.charAt(0);
        unproc=unproc.substring(1);
        if(ch=='x')
            removeX(proc,unproc,countx);
        else
            removeX(proc+ch,unproc,countx);
    }
}

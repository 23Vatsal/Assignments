/*Take as input str, a string. Write a recursive function which returns a new string in
        which all duplicate consecutive characters are reduced to a single char. E.g. for
        “hello” return “helo”.*/
package Assignment_7;
import java.util.*;
public class Q6 {
    public static void main(String[] args) {
            String unproc="hlhlll";
            String proc="";

            int i=0;
            removeDuplicate(proc,unproc,i);
    }
        public static void removeDuplicate(String proc,String unproc,int i){

            if(i==unproc.length()-1){
                char ch=unproc.charAt(i);
                proc=proc+ch;
                System.out.println(proc);
                return;
            }
            char ch=unproc.charAt(i);
            if(unproc.charAt(i)==unproc.charAt(i+1)){
                removeDuplicate(proc,unproc,i+1);
                return;
            }
            else
                removeDuplicate(proc+ch,unproc,i+1);

        }
}

package newpackage;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Testtt {

    public static void Main(String arg){
        String input="Abcde";
        //
        char [] temp=input.toCharArray();
        Stack st= new Stack<>();
        for(int i=temp.length-1;i>=0;i--){
            st.add(temp[i]);
        }
        System.out.println(st);
    }
}

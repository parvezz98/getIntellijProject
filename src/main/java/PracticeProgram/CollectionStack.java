package PracticeProgram;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionStack {
    public static void main(String [] arg){
        Stack stk= new Stack();
        stk.push("Jax");
        stk.push("You");
        stk.push("Raunak");
        System.out.println(stk);
        System.out.println(stk.peek());
        stk.pop();
        System.out.println(stk);
        System.out.println(stk.peek());
        stk.push("Max");
        stk.push("VW");
        System.out.println(stk);
        Collections.sort(stk);
        //Comparator
        //Comparable


        System.out.println(stk);

    }
}

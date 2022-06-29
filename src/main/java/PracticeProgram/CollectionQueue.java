package PracticeProgram;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CollectionQueue {
    public static void main(String [] args){
        Queue qu=new LinkedList();
// Queue is opposite of Stack, Its FIFO
        int i=0;
        int d=3;
       for (int y=0;y<9;y++) {
           qu.offer(i++);
       }
       qu.add(9);


        System.out.println(qu);
        System.out.println(qu.peek());
        qu.poll();
        System.out.println(qu.peek());
       }
    }


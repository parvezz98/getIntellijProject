package PracticeProgram;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StartsWithInCollectionArrayList {
    public static void main(String [] arg){
        List lst= Arrays.asList("Jax","Mango", "Doctor", "Luck", "Yoi", "Hong","Solana","Japan","Jumbo");
        System.out.println(lst);

        String first= (String) lst.get(1);
        System.out.println(first.startsWith("j"));
        for(int i=0;i<lst.size();i++){
            if(lst.get(i).toString().startsWith("J")){
                System.out.println(lst.get(i));
            }


    }
        System.out.println("+++++++++++++++++++++++++++");
        for(int k=0;k<lst.size();k++){
            if(lst.get(k).toString().endsWith("o")){
                System.out.println(lst.get(k));
            }
}
        System.out.println("+++++++++++++++++++++++++++");
        Iterator itr=lst.iterator();
        System.out.println(itr.hasNext());
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }}

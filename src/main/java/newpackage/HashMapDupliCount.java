package newpackage;

import java.util.HashMap;
import java.util.Map;

public class HashMapDupliCount {
    public static void main(String [] ar) {
        int[] input = {2, 4, 6, 4, 6, 6, 7, 9,4};

        int count=0;
        int seq=1;
        HashMap<Integer, Integer> hp= new HashMap<Integer, Integer>();
        for(int i=0;i<input.length;i++){

            for(int k=0;k<input.length;k++){
                if(input[i]==input[k]){
                    if(i!=k) {
                        seq++;
                        hp.put(input[i],seq);
                        input[i] = 0;
                        count++;
                       // hp.put(input[i],count);
                    }
                }

            }
            if(input[i]!=0) {
                System.out.print(input[i]);
            }
        }
        System.out.println();
        for (Map.Entry m:hp.entrySet()) {
            System.out.println(m.getKey() +" "+m.getValue());
        }
    }
}

package newpackage;

import java.util.Arrays;
import java.util.Scanner;

public class NewClass {
    public static  void main(String [] args) {
        int [] input={1, 3, 6, 3,4,4,1,3,4,7,4,0,9,6,2};
      // Arrays.sort(input);
        int count=0;
        for(int i=0;i<input.length;i++){

            for(int k=0;k<input.length;k++){
                if(input[i]==input[k]){
                    if(i!=k) {
                        input[i] = 0;
                        count++;
                    }
                }

            }
            if(input[i]!=0) {
                System.out.print(input[i]);
            }
        }

    }
}

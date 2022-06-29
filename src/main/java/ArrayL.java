import org.junit.Test;

import java.util.Arrays;

public class ArrayL {
    @Test
    public void ArD(){
        String [] str={"Test","Jax","Rain","Jax","Sol","Test"};
        String [] fin= new String[str.length];

        for(int i=0;i<str.length;i++){
            for(int k=i+1;k< str.length;k++){
                if(str[i]==str[k]){
                    System.out.println((str[i]));
                }
            }
        }


    }
}

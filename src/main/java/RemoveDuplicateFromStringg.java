import com.google.common.annotations.VisibleForTesting;
import org.junit.Test;

import java.lang.annotation.Target;

public class RemoveDuplicateFromStringg {
    @Test
    public void m1(){

        String dataa="Staticjaxthe";
        String temp="";
        for(int i=0;i<dataa.length();i++){
            if(temp.indexOf(dataa.charAt(i))==-1){
                temp=temp+dataa.charAt(i);
            }
        }
        System.out.println(temp);
    }

}

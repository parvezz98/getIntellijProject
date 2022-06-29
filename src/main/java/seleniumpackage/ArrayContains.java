package seleniumpackage;

import java.util.Arrays;

public class ArrayContains {
    public static void main(String []args){

         String [] str= new String[2];

            //System.out.println(nameKey+" is friend of "+friendName);
            str[0]="Jax";
            str[1]="Rain";
            System.out.println(Arrays.asList(str).contains("jax"));
    }
}

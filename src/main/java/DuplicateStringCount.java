import java.util.Arrays;

public class DuplicateStringCount {
    public static void main(String [] args){
        String given="Count the dUplicate dupLicate string com string com duplicate duplicate";
        given=given.toLowerCase();
        String [] strAr=given.split(" ");
        String temp= "";
        for (String u: strAr) {
           // System.out.println(u);
        }

        for(int i=0;i<strAr.length;i++){
            for(int j=i;j< strAr.length;j++){
                if(strAr[i].equals(strAr[j]) && (i!=j))
                   //mm System.out.println(strAr[j]);
                 temp=strAr[j];

            }

            }
        boolean flag= Arrays.stream(strAr).anyMatch("the"::equals);
      System.out.println(temp);
        }

    }

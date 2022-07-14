package newpackage;

public class RecusrionMethod {
    static  int i=1;
    public static void main(String []ar){

       // int i=1;
        if(i<101){

         // i++;
            System.out.println(i++);
            main(null);
        }
    }
}

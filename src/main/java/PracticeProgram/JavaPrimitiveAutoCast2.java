package PracticeProgram;

public class JavaPrimitiveAutoCast2 {
    public static void main(String []a){
        int u=93333;
        byte bt=22;
       double r=u+34.5;
       float f=u;
       long l=u; //autocasting
        System.out.println("Doube- "+r);
        System.out.println("Long- "+l);
        System.out.println("float- "+f);
        int y=(int)r;
        System.out.println("Double to int "+y);
        System.out.println("Byte "+bt);

    }
}

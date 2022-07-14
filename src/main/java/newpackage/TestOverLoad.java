package newpackage;

public class TestOverLoad {
    public static void m1(int a){
        System.out.println("Static int method");
    }
    public static void m1(String a){
        System.out.println("Static String method");
    }
    public void m1(char r){
        System.out.println("Non Static char Method");
    }
    public void m1(){
        System.out.println("Non STatic No ARgument");
    }
}

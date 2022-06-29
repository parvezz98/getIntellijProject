public class StaticMethodNonStaticOverloadandOverride {
    public static int g=89;
    public static void m1(){
        System.out.println( "Static No Overload");
    }
    public void m1try(){
        System.out.println( "non Static No Override");
    }
    public static void m1(int u){
        System.out.println(" Static int overload");
    }
    public static void m1(String y){
        System.out.println("Static String overload");
    }
    public void Nonm1(String y){
        System.out.println("Non Static String Overload");
    }
    public void Nonm2(int y){
        System.out.println("Non Static int overload");
    }
}

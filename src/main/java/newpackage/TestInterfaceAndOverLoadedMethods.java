package newpackage;

public class TestInterfaceAndOverLoadedMethods implements TestInterface {
    public void m1(){
        System.out.println("M1 Impemeted");
    }
    @Override
    public void m2(){
        System.out.println("M2 Impemeted");
    }

    public void m3(){
        System.out.println("M3 Impemeted");
    }
    public static void main(String [] aa){

        TestInterface ti=new TestInterfaceAndOverLoadedMethods();
        ti.m1();
        ti.m2();
        TestInterface.m4();
        TestOverLoad.m1(7);
        TestOverLoad.m1("Jax");
        TestOverLoad vs=new TestOverLoad();
        vs.m1();
    }
}

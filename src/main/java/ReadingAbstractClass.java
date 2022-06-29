public class ReadingAbstractClass extends AbstractclassPractive implements InterfacePractice{
    @Override
    protected void m1() {
        System.out.println("So M1 is Implemented in Child class ReadingAbstractClass");
    }
    @Override
    public void nonm1(){
        System.out.println("Non Abstract Method nonm1 in Child class ReadingAbstractClass");
    }

    @Override
    public void m33() {
        System.out.println("Interface Method m33 in Child class ReadingAbstractClass");

    }

    @Override
    public String Gj() {
        System.out.println("Interface Method Gj in Child class ReadingAbstractClass");
        return "Jax";
    }
}

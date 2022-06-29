public class ReadAndOverride extends StaticMethodNonStaticOverloadandOverride
{
    public static int g=8;
    @Override
  public void m1try(){
      System.out.println( "Jax");

  }

    public static void main(String [] args){
        m1();
        m1();
        //Nonm1("u");
        StaticMethodNonStaticOverloadandOverride re=new StaticMethodNonStaticOverloadandOverride();
        re.m1();
        re.m1(7);
        re.Nonm1("u");

        System.out.println("*******************************************");
        ReadAndOverride ro=new ReadAndOverride();
        ro.m1try();
        re.m1try();

        StaticMethodNonStaticOverloadandOverride sm= new ReadAndOverride();
        sm.m1try();
        sm.m1(3);


        //ReadAndOverride childtoParent= (ReadAndOverride) new StaticMethodNonStaticOverloadandOverride();

    }
}

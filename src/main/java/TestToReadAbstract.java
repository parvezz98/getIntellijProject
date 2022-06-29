public class TestToReadAbstract {
    public static void main(String []args){
        ReadingAbstractClass rd= new ReadingAbstractClass();
        rd.m1();
        rd.nonm1();
        AbstractclassPractive ab= new AbstractclassPractive() {

            @Override
            protected void m1() {

            }
        };
        ab.nonm1();
        rd.m33();
        rd.Gj();
    }
}

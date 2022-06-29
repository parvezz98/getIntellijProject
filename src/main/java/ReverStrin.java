import org.junit.Test;

public class ReverStrin
{
    @Test
    public void ms(){
        String s="Raiden";
        String rever="";
        for(int i=s.length()-1;i>=0;i--){
            rever=rever+s.charAt(i);

        }
        System.out.println(rever);
    }
}

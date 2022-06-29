import org.junit.Test;

public class SumOfArr
{
    @Test
    public  void t1(){
        int u []= {2,4,5,6,3,22,3};
        int sum=0;
        for (int i:u){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}

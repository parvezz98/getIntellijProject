public class FabonacciSerieswithoutUsingRecursion {
    public static void main(String[]args){
        //int j=0;
        int n1=0;
        int n2=1;
        int n3;
        System.out.print(n1+" "+n2);
        for(int i=2;i<30;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
    }


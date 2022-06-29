import java.util.Arrays;

public class ArraySortt
{
    public static void main(String [] at){
        int a[]= {3,5,2,7,1};
        int temp=0;
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            for(int k=i+1;k<a.length;k++){
                if(a[i]>a[k]){
                    temp=a[i];
                    a[i]=a[k];
                    a[k]=temp;
                }
            }
            System.out.print(a[i]);
        }
       System.out.println(Arrays.toString(a));
    }
}

import java.util.ArrayList;
import java.util.List;

public class TwoDArrayList {
    public static void main(String []args){
    List<Integer> ls= new ArrayList<>();
    List<Integer> ls2= new ArrayList<>();
        List<Integer> ls3= new ArrayList<>();
    ls.add(3);
    ls.add(20);
    ls.add(66);

    ls2.add(4);
    ls2.add(1);
    ls2.add(22);

        ls3.add(22);
        ls3.add(1);
        ls3.add(0);
        List<List<Integer>> arr=new ArrayList<>();
        arr.add(ls);
        arr.add(ls2);
        arr.add(ls3);
        int yf=0;
        int zf=0;
       System.out.println(arr.get(0));
       System.out.println(arr.get(1));
        System.out.println(arr.get(2));
       int diff;
       int t=0;
      /// int y=(arr.get(0).get(0))+ (arr.get(1).get(1))+ (arr.get(2).get(2));
       // int z=(arr.get(2).get(0))+ (arr.get(1).get(1))+ (arr.get(0).get(2));
      //  System.out.println(y);
        for (int i=0;i<arr.size();i++){
             yf=yf+(arr.get(i).get(i));
        }

        for (int i=arr.size()-1;i>=0;i--){
            zf=zf+(arr.get(i).get(t));
            t++;
        }
        System.out.println("yf >"+yf);
        if(yf>zf){
            diff = yf-zf;
        }
        else {
            diff=zf-yf;
        }
        System.out.println("Difference is  > "+diff);

    }
}

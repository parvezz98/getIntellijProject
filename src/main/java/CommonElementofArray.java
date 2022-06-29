import java.util.ArrayList;
import java.util.List;

public class CommonElementofArray {
    public static void main(String []args){
        List<Integer> a=new ArrayList<>();
       // 7 1 3 4 1 7
        a.add(7);
        a.add(1);
        a.add(3);
        a.add(4);
        a.add(1);
        a.add(0);
        int x=0;
        int firstset=0;
        int secondset=0;
        int diff;
       // System.out.println(li.get(2));
       for(int i=0;i< a.size();i++){
            for(int j=+i+1;j< a.size();j++){
                if(a.get(i)==a.get(j)){
                    if(x==1){
                        secondset=j-i;
                    }
                    else {
                        firstset = j - i;
                        System.out.println(firstset);
                    }
                    }
                else{
                   diff=-1;
                }
                    x++;


                }
            }
        }
      //  diff= firstset-secondset;

       // System.out.println("Difference is  > "+diff);
     //  System.out.println(firstset);
      //  System.out.println(secondset);

    }


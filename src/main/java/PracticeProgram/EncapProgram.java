package PracticeProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class EncapProgram {
    public static void main(String [] arg){
    EpamEmployee ep1= new EpamEmployee();
        EpamEmployee ep2= new EpamEmployee();
        EpamEmployee ep3= new EpamEmployee();
        EpamEmployee ep4= new EpamEmployee();
        ArrayList<EpamEmployee> ar= new ArrayList();
        ar.add(ep1);
        ar.add(ep2);
        ar.add(ep3);
        ar.add(ep4);
        Iterator<EpamEmployee> itr=ar.iterator();
        ar.get(0).setAge(30);
        ar.get(1).setAge(31);
        ar.get(2).setAge(43);
        ar.get(3).setAge(10);

        int arr[]= {ar.get(0).getAge(),ar.get(1).getAge(),ar.get(2).getAge(),ar.get(3).getAge() };
        int total=0;
        for(int d:arr)
        {
            total+=d;
        }
        System.out.println("size is ="+ar.size());
        System.out.println("Average is ="+total/ar.size());


    }
}

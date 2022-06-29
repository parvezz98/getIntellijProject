package PracticeProgram;

import io.netty.handler.codec.serialization.ObjectEncoder;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestArrayList {
    public static void main(String [] args){
        ArrayList arl=new ArrayList<>();
        arl.add(7);
        arl.add("tt");
        arl.add("tJaxt");
        arl.add(new String());
        arl.remove(2);
        arl.add(2,"Tom");
        System.out.println(arl);

        ArrayList neww= new ArrayList<>();
        neww.add("CYRAX");
        neww.add("SEKTOR");
        arl.add(neww);
        System.out.println(arl.get(4)+"*******"+arl);
        System.out.println(arl.contains("tt"));


    }
}

package PracticeProgram;

import org.junit.Test;

import java.util.Random;
import java.util.Scanner;

public class RandomClass {
    @Test
    public void mainn(){
        Random rm= new Random();
       int random= rm.nextInt(500,600);

        System.out.println(random);
        var y=800;
        int e=y;
        Scanner sc= new Scanner(System.in);
        String input = sc.next();
        System.out.println(input);
    }
}

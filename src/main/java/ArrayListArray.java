import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ArrayListArray {
    public static void main(String[] args)   {
        int rowSize = 3;
        int colSize = 3;
        int x = 4;
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        for (int i = 0; i < rowSize; i++) {
            List<Integer> arrRow = new ArrayList<Integer>();
            for (int j = 0; j < colSize; j++) {

                arrRow.add(x);
                x++;
            }
            arr.add(arrRow);
        }
        System.out.println(arr.get(0).get(1));
       for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
               // System.out.print(arr.get(i).get(j) + " ");
            }

        }
    }

}

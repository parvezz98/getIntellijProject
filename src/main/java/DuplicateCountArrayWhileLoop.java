public class DuplicateCountArrayWhileLoop {
    public static void main(String[] args) {
        int i = 0, j, dup_count = 0;
        String[] Dup_Count_arr = {"Jax", "Java", "Jax", "Rain", "Java","Java"};
        while(i < Dup_Count_arr.length)
        {j = i + 1;
            while(j < Dup_Count_arr.length)
            {if(Dup_Count_arr[i] == Dup_Count_arr[j]) {
                    dup_count++;
                System.out.println(Dup_Count_arr[i]);// Printing Duplicate Words
                    break;
                }
                j++;
            }
            i++;}
        System.out.println("The Total Number of Duplicates  = " + dup_count);// Printing Duplicate Count
    }
}

public class DuplicateArrayStringOtherApproach {
    public static void main(String[] args)
    {
        String[] my_array = {"Cyrax", "Jax", "Jade", "Cyrax","Jade",  "Cyrax"};
        String temp="";

        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if( (my_array[i].equals(my_array[j])) && (i != j) )
                {
                   // System.out.println("Duplicate Element is : "+my_array[j]);
                }
                else{
                    temp+=my_array[j];
                }
            }
        }
        System.out.println(temp);
    }
}

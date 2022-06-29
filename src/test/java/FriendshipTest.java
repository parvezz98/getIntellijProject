
import org.testng.Assert;
import java.util.ArrayList;

public class FriendshipTest {
    public static void main(String []args){
        Friendship friendship = new Friendship();
        friendship.makeFriend("Aaron", "Bella");

        ArrayList<String> expected = new ArrayList<String>();
        expected.add("Bella");
        System.out.println(friendship.getDirectFriends("Aaron"));
       // Assert.Equal
     // assertResults(expected, friendship.getDirectFriends("Aaron"));
    }
}

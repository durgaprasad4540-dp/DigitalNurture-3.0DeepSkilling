import java.util.*;

public class UserRegistration {

    TreeSet<String> names = new TreeSet<>();

    public void registerUser(String userName)
    {
        names.add(userName);
    }

    public void removeUser(String userName)
    {
        names.remove(userName);
    }

    public void displayUsers()
    {
        Iterator<String> itr = names.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        
        UserRegistration user = new UserRegistration();

        user.registerUser("PwC");
        user.registerUser("Deloitte");
        user.registerUser("Ey");
        user.registerUser("Kpmg");

        user.displayUsers();

        user.removeUser("Ey");

        System.out.println();

        user.displayUsers();

    }






    
}

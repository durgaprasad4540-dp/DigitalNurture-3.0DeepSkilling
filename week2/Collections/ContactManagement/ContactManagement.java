package ContactManagement;
import java.util.*;

public class ContactManagement {


    Hashtable<Integer, Contact> table = new Hashtable<>();

    public void addContact(Contact c)
    {
        table.put(c.getId(), c);
    }

    public void removeContact(int contactId)
    {
        if(table.containsKey(contactId))
        {
            table.remove(contactId);
        }
    }

    public void displayContacts()
    {
        for(Contact c : table.values())
        {
            System.out.println(c);
        }
    }

    
}

class Contact
{
    int id;
    String name;
    String phoneno;

    public Contact(int id, String name, String phoneno)
    {
        this.id = id;
        this.name = name;
        this.phoneno = phoneno;
    }

    public int getId()
    {
        return id;
    }

    @Override

    public String toString() {
        return "id: " + id + ", name: " + name + ", phone number: " + phoneno;
    }

}

class ContactManagementTest {
    public static void main(String[] args) {
        
        ContactManagement cm = new ContactManagement();

        cm.addContact(new Contact(1, "aparna", "989898989"));
        cm.addContact(new Contact(2, "aman", "9010909090"));
        cm.addContact(new Contact(3,"chandana", "6301223221"));

        cm.displayContacts();
        System.out.println();

        cm.removeContact(2);
        cm.displayContacts();


    }
}

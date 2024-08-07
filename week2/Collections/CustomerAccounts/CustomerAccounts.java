package CustomerAccounts;

import java.util.*;

public class CustomerAccounts {

    TreeMap<Integer, Customer> map = new TreeMap<>();

    public void addCustomer(Customer c)
    {
        map.put(c.getId(), c);

    }

    public void removeCustomer(int customerId)
    {
        if(map.containsKey(customerId))
        {
            map.remove(customerId);
        }
        else{
            System.out.println("Customer not exist.");
        }
    }

    public void displayCustomers()
    {
        for(Customer c: map.values())
        {
            System.out.println(c);
        }
    }
}

class Customer {
    
    int id;
    String name;
    String email;

    public Customer(int id, String name, String email)
    {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId()
    {
        return id;
    }

    @Override

    public String toString()
    {
        return "id: " + id + ", name: " + name + ", email: " + email; 
    }

}

class CustomerAccountsTest
{
    public static void main(String[] args) {

    CustomerAccounts cus = new CustomerAccounts();

    cus.addCustomer(new Customer(110, "asdf1", "asdf1@gitam.in"));
    cus.addCustomer(new Customer(105, "asdf2", "asdf2@gitam.in"));
    cus.addCustomer(new Customer(100, "asdff3", "sdf3@gitam.in"));
    cus.addCustomer(new Customer(69, "asdf4t", "sasdf45@salad.in"));
    cus.addCustomer(new Customer(88, "asdf5", "sdf5@sald.in"));

    cus.displayCustomers();
    System.out.println();

    cus.removeCustomer(88);
    cus.displayCustomers();
    

        
    }
    

}


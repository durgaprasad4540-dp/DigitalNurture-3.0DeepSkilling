package OrderTracking;
import java.util.*;


public class OrderTracking {

    LinkedList<Order> list = new LinkedList<>();

    public void addOrder(Order o)
    {
        list.add(o);
    }

    public Order processOrder()
    {

        if(!list.isEmpty())
        {
            return list.removeFirst();
        }
        else{
            System.out.println("List is empty");
            return null;
        }

    }

    public void displayOrders()
    {
        Iterator<Order> itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
    
}

class Order{
    int orderId;
    String orderDetails;

    public Order(int orderId, String orderDetails)
    {
        this.orderId = orderId;
        this.orderDetails = orderDetails;
    }

    @Override

    public String toString()
    {
        return "Order Id: " + orderId + " orderDetails: " + orderDetails;

    }

}

class OrderTrackingTest {
    public static void main(String[] args) {
        
        OrderTracking o = new OrderTracking();
        o.addOrder(new Order(101, "asdf"));
        o.addOrder(new Order(102, "sdf4"));
        o.addOrder(new Order(103, "Sasdf5e"));

        o.displayOrders();
        System.out.println();

       System.out.println(o.processOrder());
       System.out.println();

       o.displayOrders();

    }
}

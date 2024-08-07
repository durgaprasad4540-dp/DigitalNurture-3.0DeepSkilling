package InventoryManagement;
import java.util.*;

public class InventoryManagement {

    HashMap<Integer, Product> map = new HashMap<>();

    public void addProduct(Product p)
    {
        map.put(p.getId(), p);
    }

    public void removeProduct(int productId)
    {
        if(map.containsKey(productId))
        {
            map.remove(productId);
        }
        else{
            System.out.println("Product doesnot exist.");
        }
    }

    public void updateProductQuantity(int productId, int newQuantity)
    {
       
        if(map.containsKey(productId))
        {
            Product p = map.get(productId);
            p.setQuantity(newQuantity);
        }
        else{
            System.out.println("Product does not exist.");
        }
    }
    
    public void displayProducts()
    {
        for(Product p: map.values())
        {
            System.out.println(p);
        }

    }

    
}

class Product
{
    int id;
    String name;
    int quantity;

    public Product(int id, String name, int quantity)
    {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public int getId()
    {
        return id;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    @Override
    public String toString()
    {
        return "id: " + id + ", name: " + name + ", quantity: " + quantity;
    }

}

class InventoryManagementTest{

    public static void main(String[] args) {
        
        InventoryManagement im = new InventoryManagement();

        im.addProduct(new Product(101, "milk",2));
        im.addProduct(new Product(102, "curd", 1));
        im.addProduct(new Product(103, "water", 5));
        im.addProduct(new Product(104, "Biscuits", 3));

        im.displayProducts();
        System.out.println();

        im.removeProduct(103);
        im.displayProducts();
        System.out.println();

        im.updateProductQuantity(104, 2);
        im.displayProducts();

    }
}

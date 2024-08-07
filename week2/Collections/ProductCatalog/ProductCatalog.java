import java.util.*;

class ProductCatalog {


    HashSet<String> products = new HashSet<>();


    public void addProduct(String items)
    {

        products.add(items);

      
    }

    public void removeProduct(String items)
    {
        products.remove(items);
    }

    public boolean searchProduct(String items)
    {
        if(products.contains(items))
        {
            return true;
        }
        else{
            return false;
        }
    }

    public void displayProducts()
    {

    Iterator<String> itr = products.iterator();
        while(itr.hasNext())
        {
             System.out.println(itr.next());

        }
    }

    public static void main(String[] args) {

        ProductCatalog p = new ProductCatalog();

        p.addProduct("Audi");
        p.addProduct("BMW");
        p.addProduct("Caddilac");
        p.addProduct("Dodge");
        p.addProduct("Ford");
        p.addProduct("Audi"); //added duplicate

        p.displayProducts();

        System.out.println();

        p.removeProduct("Caddilac");
        p.removeProduct("Dodge");

        p.displayProducts();

        System.out.println();

       boolean isFound = p.searchProduct("Skoda");
       System.out.println(isFound);

        System.out.println();

        p.displayProducts();

        
    }


    

}
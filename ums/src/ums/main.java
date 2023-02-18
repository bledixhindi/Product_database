package ums;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1,"Produkti 1" , 10,12));
        products.add(new Product(2,"Produkti 2" , 50,13));
        products.add(new Product(4,"Produkti 3" , 2,110));
        products.add(new Product(5,"Produkti 4" , 55,55));
        products.add(new Product(6,"Produkti 5" , 65,36));
        products.add(new Product(7,"Produkti 7" , 1,14));
        products.add(new Product(8,"Produkti 8" , 2,110));
        products.add(new Product(9,"Produkti 9" , 55,55));
        products.add(new Product(10,"Produkti 10" , 65,36));
        products.add(new Product(11,"Produkti 11" , 1,14));

        
        DumpToFile dumper = new DumpToFile();
        try {
            dumper.dumpToFile(products, "Product_File.txt");
            System.out.println("Product_File u shkruajt me sukses!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


package section3;

import java.util.Scanner;

public class ProductMain {
    
    public static void main(String[] args) {
        long id;
        String productName;
        String supplierName;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the product id");
        id=sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the product name");
        productName=sc.nextLine();
        System.out.println("Enter the supplier name");
        supplierName=sc.nextLine();
        display(id, productName, supplierName);
        Product obj1=new Product(id, productName, supplierName);
        
        System.out.println("Enter the product id");
        id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the product name");
        productName=sc.nextLine();
        System.out.println("Enter the supplier name");
        supplierName=sc.nextLine();
        display(id, productName, supplierName);
        Product obj2=new Product(id, productName, supplierName);
        if(obj1.equals(obj2)){
            System.out.println("The two products are the same");
        }else {
            System.out.println("The two products are different");
        }
        sc.close();

    }
    public static void display(Long id,String productName,String supplierName) {
        System.out.println("Product Id is "+id);
        System.out.println("Product Name is "+productName);
        System.out.println("Supplier Name is "+supplierName);
    }

}

package section3;

import java.util.Scanner;

public class ProductDetailsMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product id");
        Long id = sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the product name");
        String productName = sc.nextLine();
        System.out.println("Enter theb supplier name");
        String supplierName = sc.nextLine();
        ProductDetails pd = new ProductDetails(id, productName, supplierName);
        System.out.println(pd);
        System.out.println("Invoking getclass() method : class " + pd.getClass().getSimpleName());
        sc.close();
    }

}

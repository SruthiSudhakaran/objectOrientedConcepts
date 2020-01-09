package section4;

import java.util.Scanner;

public class DivideNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the 2 numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b == 0) {
                throw new DivideByZeroException();
            } else {
                int c = a / b;
                System.out.println("The quotient of " + a + "/" + b + "=" + c);
            }

        } catch (DivideByZeroException e) {
            System.out.println(e+" caught");
        } finally {
            System.out.println("Inside finally block");
            sc.close();
        }

    }

}

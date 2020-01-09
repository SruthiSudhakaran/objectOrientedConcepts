package section2;

import java.util.Scanner;

public class DeliveryMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu\n1.Player details of the delivery\n2.Run details of the delivery");
        int choice = sc.nextInt();
        sc.nextLine();
        Delivery d = new Delivery();

        if (choice == 1) {
            System.out.println("Enter the bowler name");
            String bowler[] = sc.nextLine().split(" ");
            int bl = bowler.length;
            System.out.println("Enter the batsman name");
            String batsman[] = sc.nextLine().split(" ");
            int bt = batsman.length;
            d.displayDeliveryDetails(bowler[bl - 1], batsman[bt - 1]);
        }
        if (choice == 2) {
            System.out.println("Enter the number of runs");
            long runs = sc.nextLong();
            if (runs == 4 || runs == 6) {
                d.displayDeliveryDetails(runs);
            } else {
                System.out.println("Number of runs scored in the delivery :" + runs);
            }
        }
        sc.close();
    }
}

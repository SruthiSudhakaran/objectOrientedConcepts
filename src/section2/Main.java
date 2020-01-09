package section2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the Card\n1.Payback Card\n2.Membership Card");
        int ch = sc.nextInt();
        sc.nextLine();
        String holderName, cardName, expiryDate;
        if (ch == 1) {
            System.out.println("Enter the Card Details:");
            String val[] = sc.nextLine().split("\\|");
            holderName = val[0];
            cardName = val[1];
            expiryDate = val[2];
            System.out.println("Enter points in card");
            int pointsEarned = sc.nextInt();
            System.out.println("Enter Amount");
            double totalAmount = sc.nextDouble();
            PaybackCard p = new PaybackCard(holderName, cardName, expiryDate, pointsEarned,
                    totalAmount);
            p.display();
        }
        if (ch == 2) {
            System.out.println("Enter the Card Details:");
            String val2[] = sc.nextLine().split("\\|");
            holderName = val2[0];
            cardName = val2[1];
            expiryDate = val2[2];
            System.out.println("Enter rating in card");
            int rating = sc.nextInt();
            MembershipCard m = new MembershipCard(holderName, cardName, expiryDate, rating);
            m.display();
        }
        sc.close();
    }

}

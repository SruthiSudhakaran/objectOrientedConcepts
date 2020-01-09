package section2;

public class Delivery {
void displayDeliveryDetails(String bowler,String batsman) {
    System.out.println("Player details of the delivery:");
    System.out.println("Bowler : "+bowler);
    System.out.println("Batsman :"+batsman);
}
void displayDeliveryDetails(Long runs) {
    System.out.println("Number of runs scored in the delivery :" +runs);
    System.out.println("It is a boundary.");
}
}

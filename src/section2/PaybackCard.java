 package section2;

public class PaybackCard extends Card {
    private int pointsEarned;
    private double totalAmount;
    
    public PaybackCard(String holderName, String cardName, String expiryDate, int pointsEarned,
            double totalAmount) {
        super(holderName, cardName, expiryDate);
        this.pointsEarned = pointsEarned;
        this.totalAmount = totalAmount;
    }

    public int getPointsEarned() {
        return pointsEarned;
    }

    public void setPointsEarned(int pointsEarned) {
        this.pointsEarned = pointsEarned;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    void display() {
        System.out.println(holderName + "'s Payback Card Details:");
        System.out.println("Card Number " + cardName);
        System.out.println("Points Earned " + pointsEarned);
        System.out.println("Total Amount " + totalAmount);
    }

}

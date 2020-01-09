package section2;

public class MembershipCard extends Card{
    private int rating;
    
    public MembershipCard(String holderName, String cardName, String expiryDate, int rating) {
        super(holderName, cardName, expiryDate);
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    void display() {
        System.out.println(holderName + "'s Membership Card Details:");
        System.out.println("Card Number " + cardName);
        System.out.println("Rating " + rating);
    }
    

}

package be.cegeka.domain.customer;

public class Customer {

    private String name;
    private LoyaltyCard loyaltyCard;

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name,LoyaltyCard loyaltyCard) {
        this.name = name;
        this.loyaltyCard = loyaltyCard;
    }

    public String getName() {
        return name;
    }

    public LoyaltyCard getLoyaltyCard() {
        return loyaltyCard;
    }
}

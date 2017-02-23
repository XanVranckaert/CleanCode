package be.cegeka.domain.customer;

public class LoyaltyCard {

    private String barCode;
    private int bonusPoints;

    public LoyaltyCard(String barCode,int bonusPoints){
        this.barCode = barCode;
        this.bonusPoints = bonusPoints;
    }

    public String getBarCode() {
        return barCode;
    }

    public int getBonusPoints() {
        return bonusPoints;
    }
}

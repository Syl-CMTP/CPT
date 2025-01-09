package NaturaPrima;

public class Player {
    private String[] selectedTreatments;
    private double budget;

    public Player(String[] selectedTreatments, double budget) {
        this.selectedTreatments = selectedTreatments;
        this.budget = budget;
    }

    public void choose_treatment() {
        // Implementation of choose_treatment method goes here
    }

    public void view_treatments() {
        // Implementation of view_treatments method goes here
    }

    public void spend_money(double cost) {
        budget -= cost;
    }
}

package NaturaPrima;

public class Player {
    private String[] selectedTreatments;
    private int budget;

    public Player(String[] selectedTreatments, int budget) {
        this.selectedTreatments = selectedTreatments;
        this.budget = 25000;
    }

    public void choose_treatment() {
        // Implementation of choose_treatment method goes here
    }

    public void view_treatments() {
        // Implementation of view_treatments method goes here
    }

    public void spend_money(int cost) {
        budget -= cost;
    }

    public String[] getSelectedTreatments() {
        return selectedTreatments;
    }

    public void setSelectedTreatments(String[] selectedTreatments) {
        this.selectedTreatments = selectedTreatments;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}

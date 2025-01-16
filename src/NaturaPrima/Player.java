



// Thinking I should delete this class, it's not really doing anything




package NaturaPrima;

import java.util.ArrayList;

public class Player {
    private ArrayList<Treatment> selectedTreatments = new ArrayList<Treatment>();
    private int budget;

    public Player(ArrayList<Treatment> selectedTreatments, int budget) {
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

    public ArrayList<Treatment> getSelectedTreatments() {
        return selectedTreatments;
    }

    public void setSelectedTreatments(ArrayList<Treatment> selectedTreatments) {
        this.selectedTreatments = selectedTreatments;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}

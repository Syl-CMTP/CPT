package NaturaPrima;

import java.util.ArrayList;

public class Ecosystem {
    private String status;
    private ArrayList<Treatment> selectedTreatments = new ArrayList<Treatment>();
    private int currentTurn;

    public Ecosystem(String status, ArrayList<Treatment> treatments) {
        this.status = status;
        this.selectedTreatments = treatments;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Treatment> getSelectedTreatments() {
        return selectedTreatments;
    }

    public void setSelectedTreatments(ArrayList<Treatment> selectedTreatments) {
        this.selectedTreatments = selectedTreatments;
    }
}

package NaturaPrima;

import java.util.ArrayList;

public class Ecosystem {
    private String status;
    private ArrayList<Treatment> selectedTreatments = new ArrayList<Treatment>();
    private int finalHerbivoreScore;
    private int finalCarnivoreScore;
    private int finalOmnivoreScore;
    private int finalPlantScore;
    private int finalPollinatorScore;
    private int finalSoilHealthScore;
    private int finalEcoTourismScore;
    private int finalPollutionScore;
    
    public Ecosystem(String status, ArrayList<Treatment> selectedTreatments, int finalHerbivoreScore, int finalCarnivoreScore, int finalOmnivoreScore, 
            int finalPlantScore, int finalPollinatorScore, int finalSoilHealthScore, int finalEcoTourismScore, int finalPollutionScore) {
        this.status = status;
        this.selectedTreatments = selectedTreatments;
        this.finalHerbivoreScore = finalHerbivoreScore;
        this.finalCarnivoreScore = finalCarnivoreScore;
        this.finalOmnivoreScore = finalOmnivoreScore;
        this.finalPlantScore = finalPlantScore;
        this.finalPollinatorScore = finalPollinatorScore;
        this.finalSoilHealthScore = finalSoilHealthScore;
        this.finalEcoTourismScore = finalEcoTourismScore;
        this.finalPollutionScore = finalPollutionScore;
    }

    public String getStatus() {

        if (finalHerbivoreScore > 0 && finalCarnivoreScore > 0 && finalOmnivoreScore > 0 && finalPlantScore > 0 && finalPollinatorScore > 0 && finalSoilHealthScore > 0 && finalEcoTourismScore > 0 && finalPollutionScore > 0) {
            return status = "water wonderland";
        } else if (finalHerbivoreScore > 0 && finalCarnivoreScore > 0 && finalOmnivoreScore > 0 && finalPlantScore > 0 && finalPollinatorScore > 0 && finalSoilHealthScore > 0 && finalEcoTourismScore > 0 && finalPollutionScore > 0) {
            return status = "thriving";
        } else if (finalHerbivoreScore > 0 && finalCarnivoreScore > 0 && finalOmnivoreScore > 0 && finalPlantScore > 0 && finalPollinatorScore > 0 && finalSoilHealthScore > 0 && finalEcoTourismScore > 0 && finalPollutionScore > 0) {
            return status = "struggling";
        } else {
            return status = "barren";
        }
    }

    public ArrayList<Treatment> getSelectedTreatments() {
        return selectedTreatments;
    }

    public void setSelectedTreatments(ArrayList<Treatment> selectedTreatments) {
        this.selectedTreatments = selectedTreatments;
    }
}

package NaturaPrima;

/**
 * author: Carl Palad
 * date: 19/01/2025
 * EcoSystem class
 */

import java.util.ArrayList;

public class Ecosystem {
    // Color Codes
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";

    private ArrayList<Treatment> selectedTreatments;
    private String status;
    private int finalHerbivoreScore;
    private int finalCarnivoreScore;
    private int finalOmnivoreScore;
    private int finalPlantScore;
    private int finalPollinatorScore;
    private int finalSoilHealthScore;
    private int finalEcoTourismScore;
    
    public Ecosystem() {
        this.selectedTreatments = new ArrayList<>();
        this.status = "barren";
        this.finalHerbivoreScore = 0;
        this.finalCarnivoreScore = 0;
        this.finalOmnivoreScore = 0;
        this.finalPlantScore = 0;
        this.finalPollinatorScore = 0;
        this.finalSoilHealthScore = 0;
        this.finalEcoTourismScore = 0;
    }

    public ArrayList<Treatment> getSelectedTreatments() {
        return selectedTreatments;
    }

    public void setSelectedTreatments(ArrayList<Treatment> selectedTreatments) {
        this.selectedTreatments = selectedTreatments;
    }

    public int getFinalHerbivoreScore() {
        for (int i = 0; i < selectedTreatments.size(); i++) {
            finalHerbivoreScore = finalHerbivoreScore + selectedTreatments.get(i).getHerbivoreScore();
        }
        return finalHerbivoreScore;
    }  

    public int getFinalCarnivoreScore() {
        for (int i = 0; i < selectedTreatments.size(); i++) {
            finalCarnivoreScore = finalCarnivoreScore + selectedTreatments.get(i).getCarnivoreScore();
        }
        return finalCarnivoreScore;
    }

    public int getFinalOmnivoreScore() {
        for (int i = 0; i < selectedTreatments.size(); i++) {
            finalOmnivoreScore = finalOmnivoreScore + selectedTreatments.get(i).getOmnivoreScore();
        }
        return finalOmnivoreScore;
    }

    public int getFinalPlantScore() {
        for (int i = 0; i < selectedTreatments.size(); i++) {
            finalPlantScore = finalPlantScore + selectedTreatments.get(i).getPlantScore();
        }
        return finalPlantScore;
    }

    public int getFinalPollinatorScore() {
        for (int i = 0; i < selectedTreatments.size(); i++) {
            finalPollinatorScore = finalPollinatorScore + selectedTreatments.get(i).getPollinatorScore();
        }
        return finalPollinatorScore;
    }

    public int getFinalSoilHealthScore() {
        for (int i = 0; i < selectedTreatments.size(); i++) {
            finalSoilHealthScore = finalSoilHealthScore + selectedTreatments.get(i).getSoilHealthScore();
        }
        return finalSoilHealthScore;
    }

    public int getFinalEcoTourismScore() {
        for (int i = 0; i < selectedTreatments.size(); i++) {
            finalEcoTourismScore = finalEcoTourismScore + selectedTreatments.get(i).getEcoTourismScore();
        }
        return finalEcoTourismScore;
    }

    public String getStatus(int finalHerbivoreScore, int finalCarnivoreScore, int finalOmnivoreScore, int finalPlantScore, int finalPollinatorScore, int finalSoilHealthScore, int finalEcoTourismScore) {
        if (finalHerbivoreScore > 5 && finalCarnivoreScore > 5 && finalOmnivoreScore > 5 && finalPlantScore > 5 && finalPollinatorScore > 5 && finalSoilHealthScore > 5 && finalEcoTourismScore > 5) {
            status = ANSI_RED + "struggling" + ANSI_RESET;
        } else if (finalHerbivoreScore > 10 && finalCarnivoreScore > 10 && finalOmnivoreScore > 10 && finalPlantScore > 10 && finalPollinatorScore > 10 && finalSoilHealthScore > 10 && finalEcoTourismScore > 10) {
            status = ANSI_YELLOW + "alright" + ANSI_RESET;
        } else if (finalHerbivoreScore > 15 && finalCarnivoreScore > 15 && finalOmnivoreScore > 15 && finalPlantScore > 15 && finalPollinatorScore > 15 && finalSoilHealthScore > 15 && finalEcoTourismScore > 15) {
            status = ANSI_GREEN + "thriving" + ANSI_RESET;
        } else {
            status = ANSI_RED + "barren" + ANSI_RESET;
        }
        return status;
    }
}

package NaturaPrima;

public class Treatment {
    private String treatmentName;
    private double cost;
    private String info;
    private int herbivoreScore;
    private int carnivoreScore;
    private int omnivoreScore;
    private int plantScore;
    private int pollinatorScore;
    private int soilHealthScore;
    private int ecoTourismScore;
    private int pollutionScore;

    public Treatment(String treatmentName, double cost, String info, int herbivoreScore, int carnivoreScore, int omnivoreScore, int plantScore,
            int pollinatorScore, int soilHealthScore, int ecoTourismScore, int pollutionScore) {
        this.treatmentName = treatmentName;
        this.cost = cost;
        this.info = info;
        this.herbivoreScore = herbivoreScore;
        this.carnivoreScore = carnivoreScore;
        this.omnivoreScore = omnivoreScore;
        this.plantScore = plantScore;
        this.pollinatorScore = pollinatorScore;
        this.soilHealthScore = soilHealthScore;
        this.ecoTourismScore = ecoTourismScore;
        this.pollutionScore = pollutionScore;
    }

    public String getTreatmentName() {
        return treatmentName;
    }

    public double getCost() {
        return cost;
    }

    public String getInfo() {
        return info;
    }

    public int getHerbivoreScore() {
        return herbivoreScore;
    }

    public int getCarnivoreScore() {
        return carnivoreScore;
    }

    public int getOmnivoreScore() {
        return omnivoreScore;
    }

    public int getPlantScore() {
        return plantScore;
    }

    public int getPollinatorScore() {
        return pollinatorScore;
    }

    public int getSoilHealthScore() {
        return soilHealthScore;
    }

    public int getEcoTourismScore() {
        return ecoTourismScore;
    }

    public int getPollutionScore() {
        return pollutionScore;
    }

    public String toString() {
        return "Treatment Name: " + treatmentName;
    }

}

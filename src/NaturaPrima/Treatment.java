package NaturaPrima;

public class Treatment {
    private String treatmentName;
    private double cost;
    private String info;
    private String pros;
    private String cons;

    public Treatment(String treatmentName, double cost, String info, String pros, String cons) {
        this.treatmentName = treatmentName;
        this.cost = cost;
        this.info = info;
        this.pros = pros;
        this.cons = cons;
    }

    public double getCost() {
        return cost;
    }

    public String getInfo() {
        return info;
    }

    public String getPros() {
        return pros;
    }

    public String getCons() {
        return cons;
    }

    public String getTreatmentName() {
        return treatmentName;
    }

    public String toString() {
        return "Treatment Name: " + treatmentName + "\nCost: " + cost;
    }

}

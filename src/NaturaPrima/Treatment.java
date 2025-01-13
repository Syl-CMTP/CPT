package NaturaPrima;

public class Treatment {
    private String treatmentName;
    private double cost;
    private String pros;
    private String cons;

    public Treatment(String treatmentName, double cost, String pros, String cons) {
        this.treatmentName = treatmentName;
        this.cost = cost;
        this.pros = pros;
        this.cons = cons;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getPros() {
        return pros;
    }

    public void setPros(String pros) {
        this.pros = pros;
    }

    public String getCons() {
        return cons;
    }
    
    public void setCons(String cons) {
        this.cons = cons;
    }

    public String getTreatmentName() {
        return treatmentName;
    }

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }
}

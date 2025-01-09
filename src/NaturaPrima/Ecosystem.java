package NaturaPrima;

public class Ecosystem {
    private String status;
    private int budget;
    private String treatments;

    public Ecosystem(String status, String treatments) {
        this.status = status;
        this.budget = 10000;
        this.treatments = treatments;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getTreatments() {
        return treatments;
    }

    public void setTreatments(String treatments) {
        this.treatments = treatments;
    }
}

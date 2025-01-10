package NaturaPrima;

public class Ecosystem {
    private String status;
    private String treatments;
    private int currentTurn;

    public Ecosystem(String status, String treatments) {
        this.status = status;
        this.treatments = treatments;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getTreatments() {
        return treatments;
    }

    public void setTreatments(String treatments) {
        this.treatments = treatments;
    }
}

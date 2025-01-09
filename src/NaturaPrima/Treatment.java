package NaturaPrima;

public class Treatment {
    private double cost;
    private String[] pros;
    private String[] cons;

    public Treatment(double cost, String[] pros, String[] cons) {
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

    public String[] getPros() {
        return pros;
    }

    public void setPros(String[] pros) {
        this.pros = pros;
    }

    public String[] getCons() {
        return cons;
    }
    
    public void setCons(String[] cons) {
        this.cons = cons;
    }

    public void displayPros() {
        for (String pro : pros) {
            System.out.println(pro);
        }
    }

    public void displayCons() {
        for (String con : cons) {
            System.out.println(con);
        }
    }
}

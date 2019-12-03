package Model;

public class Travel {
    private  Transport transport;
    private int Cost;
    private int Days;
    private Food food;

    public Travel(Transport tr, int cost, int days, Food fd){
        this.transport = tr;
        this.Cost = cost;
        this.Days = days;
        this.food = fd;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int cost) {
        Cost = cost;
    }

    public int getDays() {
        return Days;
    }

    public void setDays(int days) {
        Days = days;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}

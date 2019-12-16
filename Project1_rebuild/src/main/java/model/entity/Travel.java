package model.entity;

public interface Travel {
    public Transport transport();
    public int cost();
    public int days();
    public Food food();
    public String toUAString();
}

public abstract class Delivery {
    private int id;
    private String recipientName;
    private String recipientPhone;
    private double cost;

    public Delivery(int id, String recipientName, String recipientPhone, double cost) {
        this.id = id;
        this.recipientName = recipientName;
        this.recipientPhone = recipientPhone;
        this.cost = cost;
    }

    // Абстрактний метод, який нащадок реалізує сам
    public abstract void deliver();

    // Геттери/сеттери
    public int getId() { return id; }
    public String getRecipientName() { return recipientName; }
    public String getRecipientPhone() { return recipientPhone; }
    public double getCost() { return cost; }
}
public class CourierDelivery extends Delivery {
    private String address;
    private String deliveryTime;

    public CourierDelivery(int id, String recipientName, String recipientPhone,
                           double cost, String address, String deliveryTime) {
        super(id, recipientName, recipientPhone, cost);
        this.address = address;
        this.deliveryTime = deliveryTime;
    }

    @Override
    public void deliver() {
        System.out.println("Кур'єр вирушив за адресою: " + address +
                " для " + getRecipientName() + " (Час: " + deliveryTime + ")");
    }
}
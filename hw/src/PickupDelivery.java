public class PickupDelivery extends Delivery {
    private String storeAddress;

    public PickupDelivery(int id, String recipientName, String recipientPhone,
                          double cost, String storeAddress) {
        super(id, recipientName, recipientPhone, cost);
        this.storeAddress = storeAddress;
    }

    @Override
    public void deliver() {
        System.out.println("Замовлення готове до видачі в магазині за адресою: " +
                storeAddress + ". Очікує клієнта: " + getRecipientName());
    }
}
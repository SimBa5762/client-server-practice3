public class PostDelivery extends Delivery {
    private String city;
    private int postalOfficeNumber;

    public PostDelivery(int id, String recipientName, String recipientPhone,
                        double cost, String city, int postalOfficeNumber) {
        super(id, recipientName, recipientPhone, cost);
        this.city = city;
        this.postalOfficeNumber = postalOfficeNumber;
    }

    @Override
    public void deliver() {
        System.out.println("Посилку " + getId() + " відправлено до відділення №" +
                postalOfficeNumber + " у місті " + city + " для " + getRecipientName());
    }
}
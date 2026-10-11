public class Main {
    public static void main(String[] args)
    {
        Delivery delivery1 = new CourierDelivery(1, "Андрій", "+380651219874", 65, "Василя Стуса 32Б", "45" );
        Delivery delivery2 = new PickupDelivery(1, "Андрій", "+380651219874", 10, "Василя Стуса 5А");
        Delivery delivery3 = new PostDelivery(1, "Андрій", "+380651219874", 43, "Київ", 6234 );

        OrderService orderService = new OrderService();
        orderService.processDelivery(delivery1);
        orderService.processDelivery(delivery2);
        orderService.processDelivery(delivery3);

    }
}


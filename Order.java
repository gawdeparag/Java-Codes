// Given below is an example of Nested class

public class Order {
    private int orderId;
    private String customerName;

    // Nested class has to have a "static" keyword
    // It can exist without an outer class instance
    public static class Item {
        private int itemId;
        private String itemName;
        private double itemPrice;

        public Item(int itemId, String itemName, double itemPrice) {
            this.itemId = itemId;
            this.itemName = itemName;
            this.itemPrice = itemPrice;
        }

        public int getItemId() {
            return itemId;
        }

        public String getItemName() {
            return itemName;
        }

        public double getItemPrice() {
            return itemPrice;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "itemId=" + itemId +
                    ", itemName='" + itemName + '\'' +
                    ", itemPrice=" + itemPrice +
                    '}';
        }
    }

    public Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                '}';
    }

    public void displayOrder(Item[] items) {
        System.out.println(this.toString());
        System.out.println("Order items: ");
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    public static void main(String[] args) {
        Order order = new Order(1, "John Doe");

        Order.Item item1 = new Order.Item(1, "Item 1", 10.0);
        Order.Item item2 = new Order.Item(2, "Item 2", 20.0);

        Item[] items = { item1, item2 };
        order.displayOrder(items);
    }
}

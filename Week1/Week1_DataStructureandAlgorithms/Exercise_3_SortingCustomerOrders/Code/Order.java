package Week1.Week1_DataStructureandAlgorithms.Exercise_3_SortingCustomerOrders.Code;

public class Order {
    int orderId;
    String customerName;
    double totalPrice;

    public Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        // Using custom toString method to make the order more readable
        return "Order{" + "orderId =" + orderId + ", customerName=" + customerName +
                ", totalPrice=" + totalPrice + '}';
    }
}

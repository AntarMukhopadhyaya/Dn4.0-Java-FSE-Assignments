package Week1.DSA.SortingCustomerOrders;

public class TestSorting {
    public static void main(String[] args) {
        // Creating an array of Order objects
        Order[] orders = {
                new Order(101, "Antar", 250.0),
                new Order(102, "Ram", 150.0),
                new Order(103, "Shyam", 300.0),
                new Order(104, "Sita", 99.99),
        };
        System.out.println("Original Orders:");
        for (Order o : orders)
            System.out.println(o);
        System.out.println("\n Sorting Orders by Total Price using Bubble Sort:");
        BubbleSort.sort(orders);
        for (Order o : orders)
            System.out.println(o);

        orders = new Order[] {
                new Order(101, "Antar", 250.0),
                new Order(102, "Ram", 150.0),
                new Order(103, "Shyam", 300.0),
                new Order(104, "Sita", 99.99),
        };
        System.out.println("\nSorting Orders by Total Price using Quick Sort:");
        QuickSort.sort(orders, 0, orders.length - 1);
        for (Order o : orders)
            System.out.println(o);

    }

}

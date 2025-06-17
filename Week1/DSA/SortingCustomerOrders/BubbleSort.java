package Week1.DSA.SortingCustomerOrders;
// BubbleSort
// Time Complexity: O(n^2)
// Space Complexity: O(1)
 
public class BubbleSort {
    public static void sort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    // Swap orders[j] and orders[j + 1]
                    // Using a temporary variable to hold the order
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;

                }
            }
        }
    }
}

package Week1.Week1_DataStructureandAlgorithms.Exercise_3_SortingCustomerOrders.Code;

// QuickSort.java
//Time Complexity: O(n log n) on average, O(n^2) in the worst case'
//Space Complexity: O(log n) due to recursive stack space
public class QuickSort {
    public static void sort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            sort(orders, low, pi - 1); // Recursively sort elements before partition
            sort(orders, pi + 1, high); // Recursively sort elements after partition
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice; // Choosing the last element as pivot.
        int i = (low - 1); // Index of smaller element
        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice < pivot) {
                i++;

                Order temp = orders[i]; // Swap orders[i] and orders[j]
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high]; // Swap orders[i + 1] and orders[high] (or pivot)
        orders[high] = temp;
        return i + 1; // Returning the index of the pivot element
    }
}

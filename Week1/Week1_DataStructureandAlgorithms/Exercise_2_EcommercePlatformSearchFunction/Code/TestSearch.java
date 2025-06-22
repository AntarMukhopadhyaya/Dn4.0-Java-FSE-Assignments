package Week1.Week1_DataStructureandAlgorithms.Exercise_2_EcommercePlatformSearchFunction.Code;

public class TestSearch {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Mouse", "Electronics"),
            new Product(2, "Keyboard", "Electronics"),
            new Product(3, "Shirt", "Clothing"),
            new Product(4, "Shoes", "Footwear"),
            new Product(5, "Phone", "Electronics")
        };

        System.out.println(" Linear Search:");
        Product result1 = SearchFunction.linearSearch(products, "Shirt");
        System.out.println(result1 != null ? result1 : "Product not found");

        System.out.println("\n Binary Search:");
        SearchFunction.sortProductsByName(products); // Must sort first
        Product result2 = SearchFunction.binarySearch(products, "Phone");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}

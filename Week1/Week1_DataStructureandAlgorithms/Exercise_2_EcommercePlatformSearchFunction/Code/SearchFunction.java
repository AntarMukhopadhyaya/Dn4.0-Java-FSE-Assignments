package Week1.Week1_DataStructureandAlgorithms.Exercise_2_EcommercePlatformSearchFunction.Code;

public class SearchFunction {
    public static Product linearSearch(Product[] products, String name){
        for(Product p: products){
            if(p.productName.equalsIgnoreCase(name)){
                return p;
            }
        }
        return null; // Return null if product not found
    }
    public static Product binarySearch(Product[] products,String name){
        int low = 0;
        int high = products.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);
            if(cmp == 0) {
                return products[mid]; // Product found
            } else if(cmp < 0) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }
        return null; // Return null if product not found
    }
    public static void sortProductsByName(Product[] products){
        for(int i = 0; i< products.length - 1; i++){
            for (int j = 0; j < products.length - i - 1; j++){
                if(products[j].productName.compareToIgnoreCase(products[j+1].productName) > 0){
                    // Swap products[j] and products[j+1]
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }
    }
    
}

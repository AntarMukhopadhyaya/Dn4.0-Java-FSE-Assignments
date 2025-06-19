package Week1.DSA.FinancialForecasting;

public class TestForecast {
    
    public static void main(String[] args){
        double baseValue = 1000.0; // Intial investment
        double annualGrowthRate = 0.05; // 5% annual growth rate
        int years = 10; // Forecasting for 10 years

        System.out.println("Recursive: $"  + Forecast.predictFutureValue(baseValue, annualGrowthRate, years));
        System.out.println("Tail Recursive: $" + Forecast.predictFutureValueTail(baseValue, annualGrowthRate, years));
        System.out.println("Iterative: $" + Forecast.predictFutureValueIterative(baseValue, annualGrowthRate, years));
    }
}

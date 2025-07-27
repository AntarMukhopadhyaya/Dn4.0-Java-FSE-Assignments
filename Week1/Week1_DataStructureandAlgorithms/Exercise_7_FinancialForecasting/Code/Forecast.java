package Week1.Week1_DataStructureandAlgorithms.Exercise_7_FinancialForecasting.Code;
// This class is used to forecast financial data based on a base value 

// an annual growth rate and the number of years to forecast.
// It uses the following formula:
// Future Value = Future Value of Previous Year * ( 1   + Annual Growth Rate )

public class Forecast {
    public static double predictFutureValue(double baseValue, double annualGrowthRate, int years) {
        if (years == 0) {
            return baseValue;
        }
        return predictFutureValue(baseValue, annualGrowthRate, years - 1) * (1 + annualGrowthRate);
    }
    // Optimized version using tail recursion
    public static double predictFutureValueTail(double baseValue,double annualGrowthRate,int years){
        return predictFutureHelper(baseValue,annualGrowthRate,years,0);
    }
    // Helper method used for tail recursion
    public static double predictFutureHelper(double baseValue,double annualGrowthRate, int years,int currentYear){
        if(currentYear == years){
            return baseValue;
        }
        return predictFutureHelper(baseValue * (1 + annualGrowthRate),annualGrowthRate,years,currentYear + 1);
    }
    // Iterative version of Predict Future Value much more efficient and faster than recursive approach
    public static double predictFutureValueIterative(double baseValue,double annualGrowthRate,int years){
        for(int i = 0; i < years; i++){
            baseValue *= (1 + annualGrowthRate);
        }
        return baseValue;
    }

}
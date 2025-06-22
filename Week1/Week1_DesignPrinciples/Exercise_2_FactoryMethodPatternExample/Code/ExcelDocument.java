package Week1.Week1_DesignPrinciples.Exercise_2_FactoryMethodPatternExample.Code;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel document");
    }
    @Override
    public void close() {
        System.out.println("Closing Excel document");
    }
}

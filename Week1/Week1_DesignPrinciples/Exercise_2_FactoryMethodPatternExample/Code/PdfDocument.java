package Week1.Week1_DesignPrinciples.Exercise_2_FactoryMethodPatternExample.Code;

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF document");
    }

    @Override
    public void close() {
        System.out.println("Closing PDF document");
    }

}

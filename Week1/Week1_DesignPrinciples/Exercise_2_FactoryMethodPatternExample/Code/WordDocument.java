package Week1.Week1_DesignPrinciples.Exercise_2_FactoryMethodPatternExample.Code;

public class WordDocument implements Document {
    @Override 
    public void open(){
        System.out.println("Opening word document");
    }
    @Override
    public void close(){
        System.out.println("Closing word document");
    }
}

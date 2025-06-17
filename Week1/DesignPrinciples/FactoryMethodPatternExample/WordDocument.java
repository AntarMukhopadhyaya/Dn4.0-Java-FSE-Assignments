package Week1.DesignPrinciples.FactoryMethodPatternExample;

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

package Week1.Week1_DesignPrinciples.Exercise_2_FactoryMethodPatternExample.Code;



public class WordFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
    
}

package Week1.DesignPrinciples.FactoryMethodPatternExample;

public class WordFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
    
}

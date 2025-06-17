package Week1.DesignPrinciples.FactoryMethodPatternExample;

public class ExcelFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
    
}

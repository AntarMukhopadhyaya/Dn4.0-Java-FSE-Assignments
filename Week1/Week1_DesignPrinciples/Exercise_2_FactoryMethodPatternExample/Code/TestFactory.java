package Week1.Week1_DesignPrinciples.Exercise_2_FactoryMethodPatternExample.Code;

public class TestFactory {
    public static void main(String[] args) {
        System.out.println("Testing Word Document Factory");

        DocumentFactory wordFactory = new WordFactory();
        Document wordDocument = wordFactory.createDocument();
        wordDocument.open();
        wordDocument.close();
        System.out.println();

        System.out.println("Testing PDF Document Factory");
        DocumentFactory pdfFactory = new PdfFactory();
        Document pdfDocument = pdfFactory.createDocument();
        pdfDocument.open();
        pdfDocument.close();
        System.out.println();

        System.out.println("Testing Excel Document Factory");
        DocumentFactory excelFactory = new ExcelFactory();
        Document excelDocument = excelFactory.createDocument();
        excelDocument.open();
        excelDocument.close();
        System.out.println();


    }
}

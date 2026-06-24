public class FactoryDesignTest{
    public static void main(String args[]){
        DocumentFactory wordFactory=new WordDocumentFactory();
        DocumentFactory pdfFactory=new PdfDocumentFactory();
        DocumentFactory excelFactory=new ExcelDocumentFactory();
        Document wordDoc=wordFactory.createDocument();
        wordDoc.open();
        System.out.println();
        Document pdfDoc=pdfFactory.createDocument();
        pdfDoc.open();
        pdfDoc.close();
        System.out.println();
        Document excelDoc=excelFactory.createDocument();
        excelDoc.open();
        excelDoc.close();
    }
}

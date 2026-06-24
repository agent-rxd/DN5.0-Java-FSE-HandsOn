public interface Document{
    void open();
    void close();
}

abstract class DocumentFactory{
    public abstract Document createDocument();
}


class PdfDocumentFactory extends DocumentFactory{
    public Document createDocument(){
        return new PdfDocument();
    }

}
class WordDocumentFactory extends DocumentFactory {
    public Document createDocument(){
        return new WordDocument();
    }

}
class ExcelDocumentFactory extends DocumentFactory{
    public Document createDocument(){
        return new ExcelDocument();
    }

}

class PdfDocument implements Document {
        public void open(){
            System.out.println("Opening PDF document");
        }
        public void close(){
            System.out.println("Closing PDF document");
        }
}

class WordDocument implements Document {
        public void open(){
            System.out.println("Opening Word document");
        }
        public void close(){
            System.out.println("Closing Word document");
        }
} 

class ExcelDocument implements Document {
        public void open(){
            System.out.println("Opening Excel document");
        }
        public void close(){
            System.out.println("Closing Excel document");
        }
}

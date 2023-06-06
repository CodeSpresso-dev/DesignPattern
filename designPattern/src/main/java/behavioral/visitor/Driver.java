package behavioral.visitor;

public class Driver {
    public static void main(String[] args) {
        HeadingNode headingNode = new HeadingNode();
        AnchorNode anchorNode = new AnchorNode();

        HtmlDocument htmlDocument = new HtmlDocument();
        htmlDocument.addNode(headingNode);
        htmlDocument.addNode(anchorNode);

        HighlightOperation highlightOperation = new HighlightOperation();
        PlainTextOperation plainTextOperation = new PlainTextOperation();
        htmlDocument.execute(plainTextOperation);
    }
}

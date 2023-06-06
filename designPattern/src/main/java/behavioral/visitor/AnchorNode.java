package behavioral.visitor;

public class AnchorNode implements HtmlNode{
    public void execute(Operation operation) {
        operation.apply(this);
    }
}

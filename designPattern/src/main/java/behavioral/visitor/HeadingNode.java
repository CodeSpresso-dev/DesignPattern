package behavioral.visitor;

public class HeadingNode implements HtmlNode{
    public void execute(Operation operation) {
        operation.apply(this);
    }
}

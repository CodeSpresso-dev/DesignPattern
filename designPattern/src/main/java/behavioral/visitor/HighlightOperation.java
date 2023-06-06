package behavioral.visitor;

public class HighlightOperation implements Operation {
    public void apply(HeadingNode headingNode) {
        System.out.println("highlight-heading");
    }

    public void apply(AnchorNode anchorNode) {
        System.out.println("highlight-anchor");
    }
}

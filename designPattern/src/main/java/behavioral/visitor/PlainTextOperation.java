package behavioral.visitor;

public class PlainTextOperation implements Operation {
    public void apply(HeadingNode headingNode) {
        System.out.println("plainText-heading");
    }

    public void apply(AnchorNode anchorNode) {
        System.out.println("plainText-anchor");
    }
}

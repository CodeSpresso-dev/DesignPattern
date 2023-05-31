package behavioral.strategy.imageStore.filter;

public class HighContrastFilter implements ImageFilter {
    public void apply(String filename) {
        System.out.println("using HighContrast to filter images");
    }
}

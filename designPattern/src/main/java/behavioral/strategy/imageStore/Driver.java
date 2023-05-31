package behavioral.strategy.imageStore;

import behavioral.strategy.imageStore.compressor.JpegImageCompressor;
import behavioral.strategy.imageStore.compressor.PDFImageCompressor;
import behavioral.strategy.imageStore.filter.HighContrastFilter;

public class Driver {
    public static void main(String[] args) {
        ImageStore imageStore = new ImageStore();
        imageStore.store("images", new PDFImageCompressor(), new HighContrastFilter());
        imageStore.store("images", new JpegImageCompressor(), new HighContrastFilter());
    }
}

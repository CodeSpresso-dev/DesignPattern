package behavioral.strategy.imageStore.compressor;

public class PDFImageCompressor implements ImageCompressor {
    public void compress(String filename) {
        System.out.println("Using PDFCompressor");
    }
}

package behavioral.strategy.imageStore.compressor;

public class JpegImageCompressor implements ImageCompressor {
    public void compress(String filename) {
        System.out.println("using JpegCompressor");
    }
}

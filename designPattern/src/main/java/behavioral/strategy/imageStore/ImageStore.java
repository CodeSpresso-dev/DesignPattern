package behavioral.strategy.imageStore;

import behavioral.strategy.imageStore.compressor.ImageCompressor;
import behavioral.strategy.imageStore.filter.ImageFilter;

public class ImageStore {
    public void store(String filename, ImageCompressor imageCompressor, ImageFilter imageFilter) {
        imageCompressor.compress(filename);
        imageFilter.apply(filename);
    }
}

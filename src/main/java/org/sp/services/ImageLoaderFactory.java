package org.sp.services;

public class ImageLoaderFactory {

    public ImageLoader create(String url) {
        if(url.endsWith(".bmp")) {
            return new BMPImageLoader();
        }

        if(url.endsWith(".jpg")) {
            return new JPGImageLoader();
        }

        throw new RuntimeException("Cannot create ImageLoader from url: " + url);
    }
}

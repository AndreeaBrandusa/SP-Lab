package org.sp.services;

import org.sp.models.ImageContent;

import java.util.concurrent.TimeUnit;

public class BMPImageLoader implements ImageLoader {
    @Override
    public ImageContent create(String url) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new ImageContent();
    }
}

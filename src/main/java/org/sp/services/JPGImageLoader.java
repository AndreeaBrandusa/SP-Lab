package org.sp.services;

import org.sp.models.ImageContent;

import java.util.concurrent.TimeUnit;

public class JPGImageLoader implements ImageLoader {
    @Override
    public ImageContent create(String url) {
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new ImageContent();
    }
}

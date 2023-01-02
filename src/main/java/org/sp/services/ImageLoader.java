package org.sp.services;

import org.sp.models.ImageContent;

public interface ImageLoader {
    ImageContent create(String url);
}

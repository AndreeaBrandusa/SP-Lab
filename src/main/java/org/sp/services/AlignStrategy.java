package org.sp.services;

import org.sp.models.Context;
import org.sp.models.Paragraph;

public interface AlignStrategy {
    void render(Paragraph p, Context c);
}

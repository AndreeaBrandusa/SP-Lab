package org.sp.services;

import org.sp.models.TextAlignment;

public class AlignmentStrategyFactory {
    TextAlignment strategiesPrototypes;

    public AlignStrategy create(TextAlignment alignment) {
        AlignStrategy alignStrategy;

        switch (alignment) {
            case LEFT_ALIGNMENT: {
                alignStrategy = new AlignLeft();
                break;
            }
            case CENTER_ALIGNMENT: {
                alignStrategy = new AlignCenter();
                break;
            }
            case RIGHT_ALIGNMENT: {
                alignStrategy = new AlignRight();
                break;
            }
            default: {
                throw new RuntimeException("No alignment of this type can be created!");
            }
        }

        return alignStrategy;
    }
}

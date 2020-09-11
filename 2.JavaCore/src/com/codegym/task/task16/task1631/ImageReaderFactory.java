package com.codegym.task.task16.task1631;

import com.codegym.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes val) {
        if (val instanceof ImageTypes) { // 4
            if (val.equals(ImageTypes.BMP)) {
                return new BmpReader(); // 1
            }
            else if (val.equals(ImageTypes.JPG)) {
                return new JpgReader(); // 2
            }
            else {
                return new PngReader(); // 3
            }
        }
        else {
            throw new IllegalArgumentException("Unknown image type");
        }

    }
}

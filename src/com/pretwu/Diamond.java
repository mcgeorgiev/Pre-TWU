package com.pretwu;

public class Diamond {

    public String drawIsosceles(int n) {
        return drawTriangle(n, n, true);

    }

    public String drawDiamond(int n) {
        return drawTriangle(n, n, true) + drawTriangle(n, n-1, false);
    }
    

    public String drawTriangle(int width, int height, boolean upright) {
        int maxWidth = (width * 2) - 1;
        int maxBlankLength = (upright) ? maxWidth/2 : width-height;
        StringBuilder triangle = new StringBuilder();

        for (int row = 0; row < height; row++) {
            for (int i = 0; i < maxWidth; i++) {
                if (i < maxBlankLength || (i >= maxWidth - maxBlankLength)) {
                    triangle.append(" ");
                } else {
                    triangle.append("*");
                }
            }
            triangle.append("\n");

            if (upright) {
                maxBlankLength--;
            } else {
                maxBlankLength++;
            }
        }
        return triangle.toString();
    }
}

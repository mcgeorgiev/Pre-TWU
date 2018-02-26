package com.pretwu;

public class Diamond {

    public String drawIsosceles(int n) {
        return drawTriangle(n, n);

    }

    public String drawDiamond(int n) {
        return drawTriangle(n, n) + drawUpsideDownTriangle(n-1, n);
    }


    public String drawTriangle(int height, int width) {
        // if prints single n ca
        int maxWidth = (width*2) - 1;
        int maxBlankLength = height - 1;
        StringBuilder triangle = new StringBuilder();
        for (int row = 0; row < height; row++) {
            for (int i = 0; i < maxWidth; i++) {
                if ((i < maxBlankLength) || ( i >= maxWidth-maxBlankLength)) {
                    triangle.append(" ");
                } else {
                    triangle.append("*");
                }
            }
            triangle.append("\n");
            maxBlankLength--;

        }
        return triangle.toString();
    }



    public String drawUpsideDownTriangle(int height, int width) {
        int maxWidth = (width*2) - 1;
        int maxBlankLength = height -1;
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
            maxBlankLength ++;
        }
        return triangle.toString();

    }
}

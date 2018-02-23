package com.pretwu;

public class Diamond {
    public String drawIsosceles(int n) {
        // if prints single n ca
        int maxWidth = (n*2) - 1;
        int maxBlankLength = n - 1;
        StringBuilder triangle = new StringBuilder();
        for (int row = 0; row < n; row++) {
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
}

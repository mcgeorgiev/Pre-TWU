package com.pretwu;

public class Triangle {
    public void easiestExerciseEver() {
        System.out.println("*");
    }

    public void drawHorizontalLine(Integer n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public void drawRightTriangle(Integer n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

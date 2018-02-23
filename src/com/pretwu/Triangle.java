package com.pretwu;

public class Triangle {
    public void easiestExerciseEver() {
        System.out.println("*");
    }

    public void drawHorizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public void drawRightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

package com.pretwu;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> get(int n) {
        List<Integer> primeFactors = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while(n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }
        return primeFactors;
    }
}

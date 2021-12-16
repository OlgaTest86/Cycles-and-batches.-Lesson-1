package ru.netology.sqr;

public class SQRService {
    public int sqrtCalculate(int initialBoundary, int endBoundary) {
        int counter = 0;
        for (int i = 10; i < 100; i++) {
            if (initialBoundary <= (i * i)) {
                if ((i * i) <= endBoundary) {
                    counter++;
                }
            }
        }
        return (counter);
    }


}

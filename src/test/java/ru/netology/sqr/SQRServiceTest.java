package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void shouldSqrtCalculate() {
       SQRService service = new SQRService();

        int initialBoundary = 200;
        int endBoundary = 300;
        int expected = 3;

        int actual = service.sqrtCalculate(initialBoundary,endBoundary);
        
        assertEquals( expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldSqrtCalculate2 () {
        SQRService service = new SQRService();

        int initialBoundary = 1;
        int endBoundary = 100;
        int expected = 1;
        int actual = service.sqrtCalculate(initialBoundary,endBoundary);

        assertEquals( expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldSqrtCalculate3 () {
        SQRService service = new SQRService();

        int initialBoundary = 1;
        int endBoundary = 99;
        int expected = 0;
        int actual = service.sqrtCalculate(initialBoundary, endBoundary);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldSqrtCalculate4 () {
        SQRService service = new SQRService();

        int initialBoundary = 100;
        int endBoundary = 10000;
        int expected = 90;
        int actual = service.sqrtCalculate(initialBoundary, endBoundary);

        assertEquals(expected, actual);
    }



    }

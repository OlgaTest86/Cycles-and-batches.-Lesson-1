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


    }

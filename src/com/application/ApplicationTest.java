package com.application;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.when;

class ApplicationTest {
    @Mock
    CalculateServices calcService;

    @InjectMocks
    Application app = new Application();

    @Test
    void add() {
        when(calcService.add(10, 20)).thenReturn(30);
        int a = 10;
        int b = 20;
        int actual = app.add(10, 20);
        int expected = 30;
        Assert.assertEquals(expected, actual);
    }

    @Test
    void sub() {
    }
}
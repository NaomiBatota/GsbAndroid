package com.julien.bts_e4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by julien on 24/05/2017.
 */
public class CalcFragmentTest {
    @Test
    public void plusClick() throws Exception {
        assertEquals(4, 2+2);
    }

    @Test
    public void moinsClick() throws Exception {
        assertEquals(0, 2-2);
    }

    @Test
    public void mulClick() throws Exception {
        assertEquals(100, 10*10);
    }

    @Test
    public void divClick() throws Exception {
        assertEquals(9, 81/9);
    }

}
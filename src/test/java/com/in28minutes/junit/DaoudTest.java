package com.in28minutes.junit;

import org.junit.Assert;
import org.junit.Test;



public class DaoudTest {

    @Test
    public void sum3numbers(){
        Assert.assertEquals(6,6);
    }


    @Test
    public void badResult(){
        Assert.assertNotEquals(5,6);
    }
}

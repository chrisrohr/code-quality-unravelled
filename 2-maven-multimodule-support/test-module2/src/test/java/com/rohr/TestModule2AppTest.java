package com.rohr;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class TestModule2AppTest {
    @Test
    public void testRun() {
        assertThat(new TestModule2App().runCode(4), is("method1"));
        assertThat(new TestModule2App().runCode(5), is("method2"));
    }
}

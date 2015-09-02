package com.rohr;

import java.util.Random;

public class TestModule1App {
    /**
     *
     * @param input
     *
     */
    public String runCode(int input) {
        //TODO: What is this?
        if (input %2 == 0) {
            method1();
            return "method1";
        } else {
            method2();
            return "method2";
        }
    }

    private void method1() {
        System.out.println("Running method1");
    }

    private void method2() {
        System.out.println("Running method2");
    }
}

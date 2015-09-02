package com.rohr;

public class TestModule2App {
    public String runCode(int input) {
        if (input %2 == 0) {
            method1();
            //FIXME: OMG
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

package com.rao.study.apm.agent.demo.pre_main.simple;

import com.rao.study.apm.agent.demo.agent_main.TimeTest;

public class PreMainTest {
    public static void main(String[] args) throws InterruptedException {
        test();
    }

    public static void test(){
        System.out.println("this is agent-demo output");
    }
}

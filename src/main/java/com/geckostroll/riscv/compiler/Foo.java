package com.geckostroll.riscv.compiler;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

/**
 * @author yan
 * @version Foo.java, v 0.1 2022年01月26日 1:24 AM yan
 */
public class Foo {

    public static void main(String[] args) {
        System.out.println("Hello, Compiler!");
        System.out.println(Joiner.on(',').join(Lists.newArrayList("abc", "cde")));
    }
}

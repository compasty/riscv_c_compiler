/*
 * Ant Group
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.geckostroll.riscv.compiler.utils;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 命令行参数工具类
 *
 * @author yan
 * @version OptionUtils.java, v 0.1 2022年01月26日 1:57 PM yan
 */
public class OptionUtils {

    private final static Logger LOGGER = LoggerFactory.getLogger(OptionUtils.class);

    public static CommandLine parseArgs(String[] args) {
        try {
            // 解析命令行参数
            CommandLineParser parser = new DefaultParser();
            return parser.parse(OptionUtils.defaultOptions(), args);
        } catch (ParseException e) {
            LOGGER.error("Compile program,N,", e);
        }
        return null;
    }

    /**
     * 编译器程序的命令行参数选项
     * @return Options
     */
    public static Options defaultOptions() {
        Options options = new Options();
        options.addOption("t", false, "display current time");
        options.addOption("v", false, "verbose");
        return options;
    }
}
package com.geckostroll.riscv.compiler;

import com.geckostroll.riscv.compiler.utils.OptionUtils;
import com.google.common.base.Preconditions;
import org.apache.commons.cli.CommandLine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 编译器程序入口
 *
 * @author yan
 * @version Foo.java, v 0.1 2022年01月26日 1:24 AM yan
 */
public class Compiler {

    private final static Logger LOGGER = LoggerFactory.getLogger(Compiler.class);

    public static void main(String[] args) {
        LOGGER.info("Start compile...");
        // 解析命令行
        CommandLine cmd = Preconditions.checkNotNull(OptionUtils.parseArgs(args), "Parse compile options error.");

    }
}

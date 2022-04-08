package com.study.java.rwsd.chapter_02;

import com.study.java.rwsd.chapter_02.domain.BankTransaction;

import java.util.List;

public interface BankStatementParser {
    BankTransaction parseFrom(String line);
    List<BankTransaction> parseLinesFrom(List<String> lines);
}

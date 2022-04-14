package com.study.java.rwsd.chapter_03;

import com.study.java.rwsd.chapter_03.domain.BankTransaction;

@FunctionalInterface
public interface BankTransactionSummarizer {
    double summarize(double accumulator, BankTransaction bankTransaction);
}

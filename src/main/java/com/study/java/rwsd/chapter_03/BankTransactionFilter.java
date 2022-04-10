package com.study.java.rwsd.chapter_03;

import com.study.java.rwsd.chapter_03.domain.BankTransaction;

@FunctionalInterface
public interface BankTransactionFilter {
    boolean test(BankTransaction bankTransaction);
}

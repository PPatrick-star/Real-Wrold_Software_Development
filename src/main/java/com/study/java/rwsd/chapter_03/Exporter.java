package com.study.java.rwsd.chapter_03;

import com.study.java.rwsd.chapter_03.domain.SummaryStatistics;

public interface Exporter {
    String export(SummaryStatistics summaryStatistics);
}

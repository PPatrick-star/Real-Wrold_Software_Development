package com.study.java.rwsd.chapter_4;

import java.io.File;

class ReportImporter implements Importer{
    @Override
    public Document importFile(final File file) {

        return new Document(null);
    }
}

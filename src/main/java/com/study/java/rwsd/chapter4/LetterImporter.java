package com.study.java.rwsd.chapter4;

import java.io.File;

class LetterImporter implements Importer{
    @Override
    public Document importFile(final File file) {

        return new Document(null);
    }
}

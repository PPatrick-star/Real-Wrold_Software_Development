package com.study.java.rwsd.chapter4;

import com.study.java.rwsd.chapter_02.MainApplication;

import java.util.Map;

public class Document {
    private final Map<String, String> attributes;

    Document(final Map<String,String> attributes) {
        this.attributes = attributes;
    }

    public String getAttribute(final String attributeName) {
        return attributes.get(attributeName);
    }
}

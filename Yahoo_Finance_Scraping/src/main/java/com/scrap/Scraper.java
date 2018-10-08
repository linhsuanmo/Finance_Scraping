package com.scrap;

import org.jsoup.nodes.Document;

import java.io.IOException;

public interface Scraper {
    Document connection(String URL) throws IOException;
    String parse(Document document);
}

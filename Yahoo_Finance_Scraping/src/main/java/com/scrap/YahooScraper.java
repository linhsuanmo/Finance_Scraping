package com.scrap;

import org.jsoup.nodes.Document;

import java.io.IOException;

public interface YahooScraper extends Scraper{
    Document connection(String URL) throws IOException;
    String parse(Document document);
    String getHeader();
    String parseDate(Document document);
}

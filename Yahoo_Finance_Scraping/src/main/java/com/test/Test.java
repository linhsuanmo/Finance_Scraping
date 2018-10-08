package com.test;

import com.main.YahooStock;
import com.utils.WriterUtil;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        final String URL = "https://tw.stock.yahoo.com/s/list.php?c=%A4%F4%AAd&rr=0.50949300%201538625676";

        YahooStock ys = new YahooStock();
        WriterUtil writer = new WriterUtil();
        StringBuilder result = new StringBuilder();



        String header = ys.getHeader();
        Document document = ys.connection(URL);
        String scrap = ys.parse(document);

        result.append(header).append(scrap);

        writer.WriteToTxt("D:\\test\\ttt.txt", result.toString());
        System.out.println(result.toString());

    }
}

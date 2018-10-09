package com.main;

import com.utils.WriterUtil;
import com.yahoo.YahooStockAPI;
import com.yahoo.YahooStockURL;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class YahooStock extends YahooStockAPI {
    public static void main(String[] args) throws IOException {
        // 製作一個介面，提供組"表頭"，"爬資料"等功能
        YahooStockAPI yahooStockAPI = new YahooStockAPI();

        // 專門寫出檔案的類別
        WriterUtil writer = new WriterUtil();

        // 把所有 yahoo 的網址放入一個陣列中
        String[] URL = YahooStockURL.getStockURL();

        // 存放結果
        StringBuilder result = new StringBuilder();

        // 日期轉字串
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        String strDate = simpleDateFormat.format(new Date());

        // 檔名
        String fileName = "D:\\奇摩股市\\YahooStock_" + strDate + ".txt";

        String parse = null;
        String parseDate = null;

        // 把 yahoo 的網址，一筆一筆抓出來 parse
        for (String url : URL) {
            if (url != null) {
                System.out.println(url);
                Document document = yahooStockAPI.connection(url);
                parse = yahooStockAPI.parse(document);
            }
        }

        Document document = yahooStockAPI.connection(URL[0]);

        String header = yahooStockAPI.getHeader();
        parseDate = yahooStockAPI.parseDate(document);
        result.append(header).append(parse).append(parseDate);

        writer.WriteToTxt(fileName, result.toString());
        System.out.println(result.toString());

    }
}

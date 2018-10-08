package com.yahoo;

import com.scrap.Scraper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class YahooStockAPI implements Scraper {

    // 欄位資訊
    private StringBuilder header = new StringBuilder();
    private String stockDate;
    private String stock;
    private String strPrice;
    private String strBuyIn;
    private String strSellOut;
    private String upAndDown;
    private String sheet;
    private String yesterdayClosingPrice;
    private String openingPrice;
    private String dayHigh;
    private String dayLow;

    // 放入結果
    public StringBuilder result = new StringBuilder();

    // 抓出要爬蟲網頁的整頁資訊
    public Document connection(String URL) throws IOException {
        final Document document = Jsoup.connect(URL).get();
        if (document == null){
            return null;
        }
        return document;
    }

    public String parse(Document document)  {

        /* 只抓取 table.yui-text-left tr 開頭的 */
        /* yui-text-left : table class */
        /* tr : table 底下的元素，table row */
        for (Element row : document.select("table.yui-text-left tr")) {

            // 股票代號
            /* 抓取 > td:nth-of-type(2) 元素 */
            /* > td:nth-of-type(2) : CSS tag*/
            if (row.select("> td:nth-of-type(2)").text().equals("")) {
                continue;
            } else {
                stock = row.select("> td:nth-of-type(2)").text();

                //final String href = row.select("td[nowrap]").text();
                //System.out.println(href);
            }

            // 成交
            if (row.select("> td:nth-of-type(4)").text().equals("")) {
                continue;
            } else {
                strPrice = row.select("> td:nth-of-type(4)").text();
                //price = Double.parseDouble(strPrice);
            }


            // 買進
            if (row.select("> td:nth-of-type(5)").text().equals("")) {
                continue;
            } else {
                strBuyIn = row.select("> td:nth-of-type(5)").text();
                //buy_in = Double.parseDouble(strBuyIn);
            }

            // 賣出
            if (row.select("> td:nth-of-type(6)").text().equals("")) {
                continue;
            } else {
                strSellOut = row.select("> td:nth-of-type(6)").text();
            }

            // 漲跌
            if (row.select("> td:nth-of-type(7)").text().equals("")) {
                continue;
            } else {
                upAndDown = row.select("> td:nth-of-type(7)").text();
                if(upAndDown.indexOf("▽") >= 0){
                    upAndDown = upAndDown.replace("▽", "-");
                }

                if(upAndDown.indexOf("△") >= 0){
                    upAndDown = upAndDown.replace("△", "+");
                }

            }

            // 張數
            if (row.select("> td:nth-of-type(8)").text().equals("")) {
                continue;
            } else {
                sheet = row.select("> td:nth-of-type(8)").text();
                if(sheet.indexOf(",") >= 0){
                    sheet = sheet.replace(",", ".");
                }



            }

            // 昨收
            if (row.select("> td:nth-of-type(9)").text().equals("")) {
                continue;
            } else {
                yesterdayClosingPrice = row.select("> td:nth-of-type(9)").text();

            }


            // 開盤
            if (row.select("> td:nth-of-type(10)").text().equals("")) {
                continue;
            } else {
                openingPrice = row.select("> td:nth-of-type(10)").text();

            }

            // 最高
            if (row.select("> td:nth-of-type(11)").text().equals("")) {
                continue;
            } else {
                dayHigh = row.select("> td:nth-of-type(11)").text();
            }


            // 最低
            if (row.select("> td:nth-of-type(11)").text().equals("")) {
                continue;
            } else {
                dayLow = row.select("> td:nth-of-type(11)").text();
            }

            result.append(stock).append(",");
            result.append(strPrice).append(",");
            result.append(strBuyIn).append(",");
            result.append(strSellOut).append(",");
            result.append(upAndDown).append(",");
            result.append(sheet).append(",");
            result.append(yesterdayClosingPrice).append(",");
            result.append(openingPrice).append(",");
            result.append(dayHigh).append(",");
            result.append(dayLow).append("\n");
        }

        return result.toString();
    }


    public String parseDate(Document document)  {
        // 資料日期
        for (Element row : document.select("table.yui-text-left tr")){
            if (row.select("tr:nth-of-type(1) > td > table > tbody > tr > .yui-text-right > font").text().equals("")){
                continue;
            }else {
                stockDate = row.select("tr:nth-of-type(1) > td > table > tbody > tr > .yui-text-right > font").text();
            }
            //System.out.println(stockDate);
            result.append(stockDate);
        }

        return result.toString();
    }

    public String getHeader(){

        header.append("股票代號,");
        header.append("成交,");
        header.append("買進,");
        header.append("賣出,");
        header.append("漲跌,");
        header.append("張數,");
        header.append("昨收,");
        header.append("開盤,");
        header.append("最高,");
        header.append("最低").append("\n");

        return header.toString();
    }
}

package com.test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class ScraperTest {
    public static void main(String[] args) throws IOException {
        final Document document = Jsoup.connect("https://tw.stock.yahoo.com/s/list.php?c=%A4%F4%AAd&rr=0.50949300%201538625676").get();
        //System.out.println(document);

        String stockDate;
        String stock;
        String strPrice;
        //Double price;

        String strBuyIn;
        //Double buy_in;

        String strSellOut;
        String upAndDown;
        String sheet;
        String yesterdayClosingPrice;
        String openingPrice;
        String dayHigh;
        String dayLow;

        System.out.print("股票代號" + ","+ "成交" + ","+ "買進" + ","+ "賣出" + ",");
        System.out.print("漲跌" + ","+ "張數" + ","+ "昨收" + ","+ "開盤" + ",");
        System.out.println("最高" + ","+ "最低");
        System.out.println("===========================================================");

        for (Element row : document.select("table.yui-text-left tr")) {


            // 股票代號
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

            System.out.print(stock + "," + strPrice + "," + strBuyIn + "," + strSellOut + "," + upAndDown + ",");
            System.out.println(sheet + "," + yesterdayClosingPrice + "," + openingPrice + "," + dayHigh + "," + dayLow);
        }




        // 資料日期
        for (Element row : document.select("table.yui-text-left tr")){
            if (row.select("tr:nth-of-type(1) > td > table > tbody > tr > .yui-text-right > font").text().equals("")){
                continue;
            }else {
                stockDate = row.select("tr:nth-of-type(1) > td > table > tbody > tr > .yui-text-right > font").text();
            }
            System.out.println(stockDate);
        }
    }
}

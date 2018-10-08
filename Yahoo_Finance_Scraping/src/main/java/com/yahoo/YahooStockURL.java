package com.yahoo;

public class YahooStockURL {
    public static String[] URL;

    static {
        URL = new String[100];
    }

    // 把所有 yahoo 的網址放入一個陣列中
    public static String[] getStockURL(){
        int i = 0;

        // 水泥，食品，塑膠，紡織
        URL[i]   = "https://tw.stock.yahoo.com/s/list.php?c=%A4%F4%AAd&rr=0.37786300%201538706424";
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%AD%B9%AB%7E&rr=0.76319500%201538709435";
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%B6%EC%BD%A6&rr=0.47311000%201538710667";
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%AF%BC%C2%B4&rr=0.47311100%201538710667";

        // 電機，電器電纜，化學，生技醫療
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%B9q%BE%F7&rr=0.47311300%201538710667";
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%B9q%BE%B9%B9q%C6l&rr=0.47311500%201538710667";
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%A4%C6%BE%C7&rr=0.47311600%201538710667";
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%A5%CD%A7%DE%C2%E5%C0%F8&rr=0.47311800%201538710667";

        // 玻璃，造紙，鋼鐵，橡膠
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%AC%C1%BC%FE&rr=0.47311900%201538710667";
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%B3y%AF%C8&rr=0.47312100%201538710667";
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%BF%FB%C5K&rr=0.47312200%201538710667";
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%BE%F3%BD%A6&rr=0.47312400%201538710667";

        // 汽車，半導體，電腦週邊，光電
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%A8T%A8%AE&rr=0.47312500%201538710667";
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%A5b%BE%C9%C5%E9&rr=0.47312600%201538710667";
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%B9q%B8%A3%B6g%C3%E4&rr=0.47312700%201538710667";
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%A5%FA%B9q&rr=0.47312800%201538710667";

        // 通信網路，電子零組件，電子通路，資訊服務
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%B3q%ABH%BA%F4%B8%F4&rr=0.47313000%201538710667";
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%B9q%A4l%B9s%B2%D5%A5%F3&rr=0.47313100%201538710667";
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%B9q%A4l%B3q%B8%F4&rr=0.47313200%201538710667";
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%B8%EA%B0T%AAA%B0%C8&rr=0.47313400%201538710667";

        // 其它電子，營建，航運，觀光
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%A8%E4%A5%A6%B9q%A4l&rr=0.47313500%201538710667";
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%C0%E7%AB%D8&rr=0.47313700%201538710667";
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%AF%E8%B9B&rr=0.47313800%201538710667";
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%C6%5B%A5%FA&rr=0.47314600%201538710667";

        // 金融，貿易百貨，油電燃氣，其他
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%AA%F7%BF%C4&rr=0.47314900%201538710667";
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%B6T%A9%F6%A6%CA%B3f&rr=0.47315000%201538710667";
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%AAo%B9q%BFU%AE%F0&rr=0.47315200%201538710667";
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%A8%E4%A5L&rr=0.47315400%201538710667";

        // 存託憑證，市認購，市認售，指數類
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%A6s%B0U%BE%CC%C3%D2&rr=0.47315500%201538710667";
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%A5%AB%BB%7B%C1%CA&rr=0.47315700%201538710667";
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%A5%AB%BB%7B%B0%E2&rr=0.47315800%201538710667";
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%AB%FC%BC%C6%C3%FE&rr=0.47316000%201538710667";

        // ETF，受益證券
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=ETF&rr=0.47316100%201538710667";
        URL[++i] = "https://tw.stock.yahoo.com/s/list.php?c=%A8%FC%AFq%C3%D2%A8%E9&rr=0.47316300%201538710667";


        return URL;
    }

}

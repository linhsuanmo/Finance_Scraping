package com.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriterUtil {

    // 放入 "檔名"，"字串" 參數
    public void WriteToTxt(String path, String str) throws IOException {
        FileWriter fw = new FileWriter(path);
        fw.write(str);
        fw.flush();
        fw.close();
    }

    // 放入 "檔名"，"字串陣列" 參數
    public void WriteToTxt(String path, String[] strs) throws IOException {
        FileWriter fw = new FileWriter(path);
        for (String str : strs){
            fw.write(str.toString());
            fw.flush();
        }
        fw.close();
    }

    // 放入 "檔名"，"List" 參數
    public void WriteToTxt(String path, List list) throws IOException {
        FileWriter fw = new FileWriter(path);
        fw.write(String.valueOf(list));
        fw.flush();
        fw.close();
    }



}

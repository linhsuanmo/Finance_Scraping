package com.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriterUtil {

    // 放入 "檔名"，"字串" 參數
    public void WriteToTxt(String fileName, String str) throws IOException {
        createFolder(fileName);

        FileWriter fw = new FileWriter(fileName);
        fw.write(str);
        fw.flush();
        fw.close();
    }

    // 放入 "檔名"，"字串陣列" 參數
    public void WriteToTxt(String fileName, String[] strs) throws IOException {
        createFolder(fileName);

        FileWriter fw = new FileWriter(fileName);
        for (String str : strs){
            fw.write(str.toString());
            fw.flush();
        }
        fw.close();
    }

    // 放入 "檔名"，"List" 參數
    public void WriteToTxt(String fileName, List list) throws IOException {
        createFolder(fileName);

        FileWriter fw = new FileWriter(fileName);
        fw.write(String.valueOf(list));
        fw.flush();
        fw.close();
    }

    public void createFolder(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()){
            file.getParentFile().mkdirs();
        }
        file.createNewFile();
    }

}

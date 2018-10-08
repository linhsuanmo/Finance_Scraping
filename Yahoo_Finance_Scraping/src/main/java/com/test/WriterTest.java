package com.test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class WriterTest {
    public static void main(String[] args) throws IOException {
        String a = "1";
        String b = "2";
        String c = "3";


        StringBuilder sb = new StringBuilder();
        sb.append(a).append(",").append(b).append(",").append(c);

        List<String> result = new ArrayList<String>();
        result.add(a);
        result.add(b);
        result.add(c);

        for (String str : result){
            System.out.print(str);
        }

        FileWriter fw = new FileWriter("D:\\test\\test.txt");
        //fw.write(String.valueOf(result));
        fw.write(sb.toString());
        fw.flush();
        fw.close();


    }
}


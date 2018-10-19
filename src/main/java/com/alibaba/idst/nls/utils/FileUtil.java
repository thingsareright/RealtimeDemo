package com.alibaba.idst.nls.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    public static List<String> toArrayByFileReader(String name) {
        // 使用ArrayList来存储每行读取到的字符串
        ArrayList<String> arrayList = new ArrayList();
        try {
            FileReader fr = new FileReader(name);
            BufferedReader bf = new BufferedReader(fr);
            String str;
            // 按行读取字符串
            while ((str = bf.readLine()) != null) {
                arrayList.add(str);
            }
            bf.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 返回数组
        return arrayList;
    }

    public static void main(String[] args) {
        List<String> strings = toArrayByFileReader("C:\\Users\\DELL\\Downloads\\RealtimeDemo\\RealtimeDemo\\src\\main\\resources\\scenic_spot.txt");
        for (String s :
                strings) {
            System.out.println(s);
        }
    }
}

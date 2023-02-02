package com.gushi.jsonpro;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gushi.domain.Info;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2022/9/15 16:16
 */
public class AnalysisJson {

    public static void analysisJson(String filePath) {
        File file = new File(filePath);
        BufferedInputStream bufferedInputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            int len = 0;
            byte[] bytes = new byte[Integer.parseInt(Long.toString(file.length()))];
            bufferedInputStream.read(bytes);
//            while ((len = bufferedInputStream.read(bytes,0, len)) != -1) {
//
//            }
            String string = new String(bytes);
//            List<Info> infos = JSONObject.parseArray(string, Info.class);
            JSONObject object = JSONObject.parseObject(string);
            JSONArray data = object.getJSONArray("data");
            Iterator iterator = data.stream().iterator();
            HashSet<String> mobile = new HashSet<>();
            while (iterator.hasNext()) {
                JSONObject next = (JSONObject)iterator.next();
                mobile.add(next.getString("mobile"));
            }
            System.out.println(mobile.size());
            System.out.println(object);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void main(String[] args) {
        String filePath = "D:\\Study_Code\\SB-multi-modules-pro\\json-pro\\doc\\湖南51脏数据.json";
        analysisJson(filePath);
    }
}

package com.java;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;

import java.util.*;
import java.io.*;

public class excel2json extends ReadExcel{
    File file1;
    public void jsonFile() throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Name Your File with .json");
        String filename1 = scan.nextLine();
        String directory = System.getProperty("user.dir");
        String path;
        path = directory + File.separator + filename1;
        System.out.println("Filepath is " + path);

        this.file1 = new File(path);
        boolean result1;
        try {
            result1 = file1.createNewFile();
            if (result1) {
                System.out.println("File Generated Successfully" + file1.getCanonicalPath());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("list",list);
        FileWriter myWriter = new FileWriter(file1);
        myWriter.write(jsonObject.toJSONString());
        myWriter.close();
    }}

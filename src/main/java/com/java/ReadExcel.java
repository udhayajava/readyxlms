package com.java;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ReadExcel extends RunExcel {
    String value;
    File file1;
    List list;
    Workbook workbook;
    public void read() throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(filename));
            workbook = new XSSFWorkbook(filename);
            DataFormatter dft = new DataFormatter();
            Iterator<Sheet> sheets = workbook.sheetIterator();
            list = new ArrayList();
            while (sheets.hasNext()){
                Sheet sht = sheets.next();
                System.out.println("Sheet name =====>" +sht.getSheetName());
                System.out.println("---------------------------------------------------");
                Iterator<Row>iterator = sht.iterator();
                while (iterator.hasNext()){
                    Row row = iterator.next();
                    Iterator<Cell>cellIterator = row.iterator();
                    while (cellIterator.hasNext()){
                        Cell cell = cellIterator.next();
                        value= dft.formatCellValue(cell);
//                        System.out.print("\t"+value+"\t");
                    }
//                    System.out.println();
                }
              list.add(value);
                System.out.println(list);
            }
            workbook.close();
        }catch(Exception exception){
            exception.printStackTrace();}}

        }

package com.java;

import java.io.IOException;

public class RunExcel {
    public String filename="C:\\Users\\Udhayakumar\\Desktop\\exls.xlsx";
    public void fileHandling(){
        System.out.println(filename);
    }

    public static void main(String[] args) throws IOException {
        RunExcel re = new RunExcel();
        ReadExcel readExcel = new ReadExcel();
        re.fileHandling();
        readExcel.read();
        excel2json e2j = new excel2json();
        e2j.jsonFile();

    }
}

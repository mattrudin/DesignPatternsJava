package design.patterns;

import design.patterns.factory.*;

public class Main {

    public static void main(String[] args) {
        DocumentFactory word = new WordFactory();
        Document wordFile = word.generateDocument();
        System.out.println(wordFile.getType());

        DocumentFactory excel = new ExcelFactory();
        Document excelFile = excel.generateDocument();
        System.out.println(excelFile.getType());

        DocumentFactory txt = new TXTFactory();
        Document txtFile = txt.generateDocument();
        System.out.println(txtFile.getType());

    }
}

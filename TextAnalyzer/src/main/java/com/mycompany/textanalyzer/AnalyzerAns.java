/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.textanalyzer;

/**
 *
 * @author user
 */
public class AnalyzerAns {
    private int wordCountUnique = 0;
    private int wordCount = 0;
    private int spaceCount = 0;
    private int lengthCount = 0;
    private int linesCount = 0;
    private int UniqueCharCount = 0;
    private int tabsCount = 0;

    public int getSpaceCount() {
        return spaceCount;
    }

    public int getUniqueCharCount() {
        return UniqueCharCount;
    }

    public int getWordCount() {
        return wordCount;
    }
    
     public int getWordCountUnique() {
        return wordCountUnique;
    }
     
    public int getLengthCount() {
        return lengthCount;
    }

    public int getLinesCount() {
        return linesCount;
    }

    public int getTabsCount() {
        return tabsCount;
    }

    public AnalyzerAns(String text, String c,String word) {
        analyze(text, c,word);
    }
      public AnalyzerAns(String text) {
        analyze(text);
    }

    void analyze(String text, String c,String word) {
        this.wordCount = wordCount(text);
        this.tabsCount = tabsCount(text);
        this.UniqueCharCount = charCount(text, c);
        this.linesCount = linesCount(text);
        this.lengthCount = lengthCount(text);
        this.spaceCount = spaceCount(text);
        this.wordCountUnique=countUnique(text,word);
    }

    void analyze(String text) {
        this.wordCount = wordCount(text);
        this.tabsCount = tabsCount(text);
        this.linesCount = linesCount(text);
        this.lengthCount = lengthCount(text);
        this.spaceCount = spaceCount(text);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Analyze{");
        sb.append("wordCount=").append(wordCount);
        sb.append(", spaceCount=").append(spaceCount);
        sb.append(", lengthCount=").append(lengthCount);
        sb.append(", linesCount=").append(linesCount);
        sb.append(", UniqueCharCount=").append(UniqueCharCount);
        sb.append(", tabsCount=").append(tabsCount);
        sb.append('}');
        return sb.toString();
    }
    public static void main(String[] args) {
       AnalyzerAns an=new AnalyzerAns("getUniqueCharCountgetUniqueCharCount","C","get");
        System.out.println(an);
    }

    public int wordCount(String Text) {
        String[] arr = Text.split("[\\n\\s\\t]");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].isBlank()) {
                count++;
            }
        }
        return count;
    }

    public int linesCount(String Text) {
        String[] arr = Text.split("[\\n]");
        if (arr.length == 1 && arr[0].isBlank()) {
            return 0;
        }
        return arr.length;
    }

    public int lengthCount(String Text) {
        return Text.length();
    }

    public int spaceCount(String Text) {
        int count = 0;
        for (int i = 0; i < Text.length(); i++) {
            if (Text.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public int charCount(String Text, String c) {
        int count = 0;
        for (int i = 0; i < Text.length(); i++) {
            if ((""+Text.charAt(i)).equals(c)) {
                count++;
            }
        }
        return count;
    }

    public int tabsCount(String Text) {
        String[] arr = Text.split("[\\t]");
        if (arr.length == 1 && arr[0].isBlank()) {
            return 0;
        }
        return arr.length - 1;
    }
    public char[] charArray(String Text){
        int count=0;
        for(int i=0; i<Text.length();i++){
            if(Character.isAlphabetic(Text.charAt(i))||Character.isDigit(Text.charAt(i))){
                count++;
            }
        }
        char[]arr=new char[count];
        count=0;
         for(int i=0; i<Text.length();i++){
            if(Character.isAlphabetic(Text.charAt(i))||Character.isDigit(Text.charAt(i))&&count<arr.length){
                arr[count]=Text.charAt(i);
                count++;
            }
        }
        return arr;
    }
    public int countUnique(String text,String Word){
        int count=0;
          String[] arr = text.split("[\\n\\s\\t]");
          for(int i=0;i<arr.length;i++){
              if(arr[i].equals(Word)){
                  count++;
              }
          }
          return count;
          
    }

}

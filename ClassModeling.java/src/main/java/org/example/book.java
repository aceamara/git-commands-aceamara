package org.example;

public class book {

    private int chapters;
    private String editor;
    private String publisher;
    private int wordCount;
    private boolean publishStatus;

    public void setChapters(int chapters){
        this.chapters=chapters;
    }
    public int getChapters(){
        return chapters;
    }
    public void setEditor(String editor){
        this.editor=editor;
    }
    public String getEditor(){
        return editor;
    }
    public void setPublisher(String publisher){
        this.publisher=publisher;
    }
    public String getPublisher(){
        return publisher;
    }
    public void setWordCount(int wordCount){
        this.wordCount=wordCount;
    }
    public int getWordCount(){
        return wordCount;
    }
    public void setPublishStatus(boolean publishStatus){
        this.publishStatus=publishStatus;
    }
    public boolean getPublisherStatus(){
        return publishStatus;
    }
}

package com.example.myapplication.models;

public class Notes {
    private String title;
    private String content;
    private String Timestamp;

    public Notes(String title, String content, String timestamp) {
        this.title = title;
        this.content = content;
        Timestamp = timestamp;
    }

    public Notes() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(String timestamp) {
        Timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", Timestamp='" + Timestamp + '\'' +
                '}';
    }
}

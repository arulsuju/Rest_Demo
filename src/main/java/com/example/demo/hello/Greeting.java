package com.example.demo.hello;

public class Greeting {
    private long Id;
    private String content;

    public Greeting(long id, String content) {
        Id = id;
        this.content = content;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "Id=" + Id +
                ", content='" + content + '\'' +
                '}';
    }
}

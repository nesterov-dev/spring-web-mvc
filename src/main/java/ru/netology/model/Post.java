package ru.netology.model;

public class Post {
    private long id;
    private String content;
    private boolean removed;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isRemoved() {
        return removed;
    }

    public void remove() {
        removed = true;
    }
}
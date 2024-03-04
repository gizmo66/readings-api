package com.adam.web;

public class ReadingDTO {

    private String path;
    private String row;

    public ReadingDTO() {
    }

    public ReadingDTO(String path, String row) {
        this.path = path;
        this.row = row;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

}

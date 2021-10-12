package com.example.listview;

public class BookDetails {
    private String bookName;
    private int imageId;

    public BookDetails(String vBookName, int vImageId){
        bookName = vBookName;
        imageId = vImageId;
    }

    public String getBookName(){
        return bookName;
    }

    public int getImageId(){
        return imageId;
    }
}

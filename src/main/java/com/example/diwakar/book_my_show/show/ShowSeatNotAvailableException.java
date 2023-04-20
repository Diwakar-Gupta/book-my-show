package com.example.diwakar.book_my_show.show;

public class ShowSeatNotAvailableException extends Exception{
    public ShowSeatNotAvailableException(Long id){
        super("Show with id: "+id+" not available");
    }
}

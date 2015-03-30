package com.duranovic.albumapp;

// Arnej Duranovic
// 03/30/2015


public class Album {
    private String name;
    private String artist;
    private String trackCount;
    private String year;
    private String publisher;

    public Album(String name, String artist, String trackCount, String year, String publisher) {
        this.name = name;
        this.artist = artist;
        this.trackCount = trackCount;
        this.year = year;
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getTrackCount() {
        return trackCount;
    }

    public String getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }

}
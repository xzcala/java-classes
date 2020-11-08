/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcbrzfsongs;

/**
 *
 * @author Jon
 */
public class Song {
    private String name;
    private String artist;
    private String album;
    private int releaseYear;
    private Genre genre;
    private int version;
    public static int numberOfSongs = 0;
    
    public Song(){
        this.name="";
        this.artist="";
        ++numberOfSongs;
    }
    
    public Song(String name, String artist) {
        this.name=name;
        this.artist=artist;
        ++numberOfSongs;
        this.version=0;
    }
    
    public Song(String name, String artist, String album, int releaseYear, Genre genre) {
        this.name=name;
        this.artist=artist;
        this.album=album;
        this.releaseYear=releaseYear;
        this.genre=genre;
        this.version=1;
        ++numberOfSongs;
    }
    
    public void setName(String name){
        this.name=name;
        ++this.version;
    }
    
    public void setAlbum(String album){
        this.album=album;
        ++this.version;
    }
    
    public void setReleaseYear(int releaseYear){
        this.releaseYear=releaseYear;
        ++this.version;
    }
    
    public void setGenre(Genre genre){
        this.genre=genre;
    }
    
    public String getName(){
        return name;
    }

    public String getArtist(){
        return artist;
    }
    
    public String getAlbum(){
        return album;
    }
    
    public int getReleaseYear(){
        return releaseYear;
    }
    
    public Genre getGenre(){
        return genre;
    }
    
    public int getVersion(){
        return version;
    }
    
}

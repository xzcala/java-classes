/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcbrzfsongs;

import static jcbrzfsongs.Genre.*; 
import static jcbrzfsongs.Song.numberOfSongs;

/**
 *
 * @author Jon
 */
public class JcbrzfSongs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Song song1 = new Song("My Heart Will Go On","Celine Dion");
        song1.setAlbum("Let's Talk About Love");
        song1.setReleaseYear(1997);
        song1.setGenre(POP);
        
        Song song2 = new Song("Hotel California","Eagles","Hotel California",1976,ROCK);
        
        System.out.println("Song 1:\nName: "+song1.getName()+"\nArtist: "+song1.getArtist()+"\nAlbum: "+song1.getAlbum()+"\nRelease Year: "+song1.getReleaseYear()+"\nVersion: "+song1.getVersion());
        System.out.println();
        System.out.println("Song 2:\nName: "+song2.getName()+"\nArtist: "+song2.getArtist()+"\nAlbum: "+song2.getAlbum()+"\nRelease Year: "+song2.getReleaseYear()+"\nVersion: "+song2.getVersion());
        System.out.println();
        System.out.println("Number of Songs: " +numberOfSongs);
    }
    
}

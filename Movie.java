/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stuff;

import java.util.Date;

public class Movie {
    private String imdbId;
    private String title;
    private String description;
    private double rating;
    private String genre;
    private int year;
    private Date lastModified;
    
    public Movie(String imdbId, String title, String description, double rating, String genre, int year, Date lastModified) {
        this.imdbId = imdbId;
        this.title = title;
        this.description = description;
        this.rating = rating;
        this.genre = genre;
        this.year = year;
        this.lastModified = lastModified;
    }

    // Getter for imdbId
    public String getImdbId() {
        return imdbId;
    }

    // Setter for imdbId
    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter for rating
    public double getRating() {
        return rating;
    }

    // Setter for rating
    public void setRating(double rating) {
        this.rating = rating;
    }

    // Getter for genre
    public String getGenre() {
        return genre;
    }

    // Setter for genre
    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Setter for year
    public void setYear(int year) {
        this.year = year;
    }

    // Getter for lastModified
    public Date getLastModified() {
        return lastModified;
    }

    // Setter for lastModified
    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }
    
    @Override
    public String toString() {
    return "IMDb ID: " + getImdbId() + "\n" +
           "Title: " + getTitle() + "\n" +
           "Description: " + getDescription() + "\n" +
           "Rating: " + getRating() + "\n" +
           "Genre: " + getGenre() + "\n" +
           "Year: " + getYear() + "\n" +
           "Last Modified: " + getLastModified();
}

}
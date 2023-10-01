/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package stuff;

import java.util.Date;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import java.util.ArrayList;
import javax.ws.rs.core.MediaType;



@Path("rest")
public class RestResource {
    
    // in-memory arrayList that holds all movies;
    static private ArrayList<Movie> allMovies = new ArrayList<>();
    
    // date object used for updating/creating new movies
    Date lastModified = new Date();
    

    @Context
    private UriInfo context;

    public RestResource() {
        
    }
    
    @GET
    @Path("list")
    @Produces(MediaType.TEXT_PLAIN)
    public String getAllMovies() {
        
        if (allMovies.size() == 0){return "Movie List is empty.";}
        
        StringBuilder movieList = new StringBuilder();
        
        for (Movie movie: allMovies){
            movieList.append(movie.toString()+"\n");
        }
        return "Total Movies : "+ allMovies.size()+"\n"+movieList.toString();
    }
    
    @GET
    @Path("get")
    @Produces(MediaType.TEXT_PLAIN)
    public String getMovieById(@QueryParam("ID") String ID) {
        if (ID != null) {
            for (Movie movie : allMovies) {
                if (movie.getImdbId().equals(ID)) {
                    return "Found the movie with ID " + ID + "\n" + movie.toString();
                }
            }
        }
        return "No movie found with ID " + ID;
    }
    
    @POST
    @Path("post")
    @Consumes(MediaType.TEXT_PLAIN)
    public void createMovie(String movieData) {
        //pase the string input into parts to construct the movie object
        String[] parts = movieData.split(",");
        if (parts.length == 6) {
            String imdbId = parts[0];
            String title = parts[1];
            String description = parts[2];
            double rating = Double.parseDouble(parts[3]);
            String genre = parts[4];
            int year = Integer.parseInt(parts[5]);
            
            Movie newMovie = new Movie(imdbId, title, description, rating, genre, year, lastModified);

            // Add the new Movie object to your movies list or data structure
            allMovies.add(newMovie);
        }
    }
   
    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    @Path("put")
    public String updateMovieByID(@QueryParam("ID") String ID,
            @QueryParam("newID") String newID,
            @QueryParam("newTitle") String newTitle,
            @QueryParam("newDescription") String newDescription,
            @QueryParam("newRating") Double newRating,
            @QueryParam("newGenre") String newGenre,
            @QueryParam("newYear") Integer newYear) {
        
        if (ID != null) {
            for (Movie movie : allMovies) {
                if (movie.getImdbId().equals(ID)) {
                    if(newID!=null){movie.setImdbId(newID);};
                    if(newTitle!=null){movie.setTitle(newTitle);}
                    if(newDescription!=null){movie.setDescription(newDescription);}
                    if(newRating!=null){movie.setRating(newRating);}
                    if(newGenre!=null){movie.setGenre(newGenre);}
                    if(newYear!=null){movie.setYear(newYear);}
                    movie.setLastModified(lastModified);
                    return "Successfully updated Movie " + ID;
                }
            }
        }
        return "No movie found with ID " + ID;
    }
   
    @DELETE
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    @Path("delete")
    public String deleteMovieByID(@QueryParam("ID") String ID){
        if (ID != null) {
            
            for (Movie movie : allMovies) {
                if (movie.getImdbId().equals(ID)) {
                    allMovies.remove(movie);
                    return "Movie ID " + ID +" Successfuly Deleted.";
                }
            }
        }
        
        return "No movie found with ID " + ID;
    }

    
    
    // Extra just for fun
    @GET
    @Path("thanks")
    @Produces(MediaType.TEXT_PLAIN + ";charset=UTF-8")
    public String thankYou(){return ".▀█▀.█▄█.█▀█.█▄.█.█▄▀　█▄█.█▀█.█─█"+"\n"+"─.█.─█▀█.█▀█.█.▀█.█▀▄　─█.─█▄█.█▄█";}
    
}

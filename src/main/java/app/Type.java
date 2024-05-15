package app;

/**
 * Class represeting a Movie from the Movies database
 * For simplicity this uses public fields
 * You could use private fields with getters to be safer
 *
 * @author Timothy Wiley, 2023. email: timothy.wiley@rmit.edu.au
 */
public class Type {
   // Movie id
   public int id;

   // Movie name
   public String name;

   // Year the movie was made
   public int year;

   // String representing the movie genre
   public String genre;

   public String types;

   /**
    * Create a movie withou setting any of the fields,
    * Fields will have default "empty" values
    */
   public Type() {
   }

   /**
    * Create a movie setting all of the fields
    */
   public Type(String types) {
     this.types = types;
   }

   
}

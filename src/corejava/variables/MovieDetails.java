package corejava.variables;

/**
 * Topic: Variables
 * Program: Movie Details
 * Description: Stores and displays movie details using local variables.
 * Author: Siddhesh
 */

public class MovieDetails {

	public static void main(String[] args) {
		
		String movieName = "Dhamaal";
		int releaseYear = 2007;
		String genre = "Comedy";
		String language = "Hindi";
		String director = "Indra Kumar";
		String leadActor = "Sanjay Dutt, Riteish Deshmukh, Arshad Warsi, Jaaved Jaaferi";
		int duration = 137;
		double imdbRating = 7.5;
		boolean isAvailableOnOtt = true;
		
		System.out.println("=====================================================================================");
		System.out.println("                                   MOVIE DETAILS                                     ");
		System.out.println("=====================================================================================");
		System.out.println();
		
		System.out.println("Name                : " + movieName);
		System.out.println("Release Year        : " + releaseYear);
		System.out.println("Genre               : " + genre);
		System.out.println("Language            : " + language);
		System.out.println("Director            : " + director);
		System.out.println("Lead Actor          : " + leadActor);
		System.out.println("Duration            : " + duration + " minutes");
		System.out.println("IMDb Rating         : " + imdbRating);
		System.out.println("Is Available on OTT : " + isAvailableOnOtt);
		System.out.println();
		System.out.println("=====================================================================================");
	}

}

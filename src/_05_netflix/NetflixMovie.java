package _05_netflix;

public class NetflixMovie {
public static void main(String[] args) {
	Movie movie= new Movie("Pie", 5);
	Movie movie1= new Movie("Chicken", 4);
	Movie movie2= new Movie("Peas", 4);
	Movie movie3= new Movie("Carrots", 4);
	Movie movie4=new Movie("Gravy", 3);
	NetflixQueue queue=new NetflixQueue();
	queue.addMovie(movie);
	queue.addMovie(movie1);
	queue.addMovie(movie2);
	queue.addMovie(movie3);
	queue.addMovie(movie4);
	queue.printMovies();
	System.out.println("The best movie is "+ queue.getBestMovie()+".");
	queue.sortMoviesByRating();
	System.out.println("The second best movie is "+ queue.getMovie(1));
}
}

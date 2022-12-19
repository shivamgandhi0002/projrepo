package question2;

public class Movie {
	
	private String title;
	private String studio;
	private String rating;
	
	public Movie(String title, String studio, String rating) {
		super();
		this.title = title;
		this.studio = studio;
		this.rating = rating;
		
		
		
	}

	public Movie(String title, String studio) {
		super();
		this.title = title;
		this.studio = studio;
		rating="PG";
	}
	
	

}

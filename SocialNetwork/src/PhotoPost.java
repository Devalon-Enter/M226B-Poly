import java.util.ArrayList;

/**
 * This class represents photo posts.
 * It is currently only a prototype but could be extended to show photos.
 * 
 * @author based on ObjectsFirst book
 *
 */

public class PhotoPost {
	
	
	private String username;
	private String filename;
	private String caption;
	private long timestamp;
	private int likes;
	private ArrayList<String> comments;
	
	
	/**
	 * Constructor for objects of class PhotoPost
	 * @param author
	 * @param filename
	 * @param caption
	 */
	public PhotoPost(String author, String filename, String caption) {
		
		username= author;
		this.filename = filename;
		this.caption = caption;
		timestamp = System.currentTimeMillis();
		likes = 0;
		comments = new ArrayList<>();
	}
	
	
	public void like() {
		likes++;
	}
	
	
	public void unlike() {
		if (likes > 0){
			likes--;
		}
	}
	
	public void addComment(String text) {
		comments.add(text);
	}
	
	public String getImageFile() {
		return filename;
	}
	
	
	public String getCaption() {
		return caption;
	}


	public long getTimeStamp() {
		return timestamp;
	}
	
	/**
	 * Simulate display for the time being
	 */
	public void display() {
		
		System.out.println("Username " + username);
		System.out.println("FileName " + "{" + filename + "}");
		System.out.println("Caption " + caption);
		System.out.println("Posted " + timeString());
		
		if (likes > 0) {
			System.out.println(likes + " people like this.");
		} else {
			System.out.println();
		}
		if (comments.isEmpty()) {
			System.out.println("No Comments yet...");
			
		} else {
			System.out.println("   " + comments.size() + " comment(s). Press C to view");
		}
	}



	private String timeString() {
		
		long current = System.currentTimeMillis();
		long pastMillis = current - timestamp;
		long seconds = pastMillis/1000;
		long minutes = seconds/60;
		long hours = minutes/60;
		if (minutes > 0) {
			return minutes + " minutes ago";
		} else if(hours > 0){
			return hours + " hours ago";
		} else {
			return seconds + " seconds ago";
		}
		
	}

}

import java.util.ArrayList;

/**
 * This class stores information about a post in a social network.
 * The main attribute is the message, however it also stores some other data such
 * as the author, possible comments and likes.
 * 
 * @author based on example in ObjectsFirst
 *
 */


public class MessagePost extends Post {

	private String message;
	
	
	/**
	 * Constructor for objects of class MessagePost
	 */
	public MessagePost(String message, String userName) {
		super(userName);
		this.message = message;
	}

	public String getText() {
		return message;
	}

	/**
	 * Displays details of post
	 */
	public void display() {
		System.out.println("Message " + message);
		super.display();
	}

}

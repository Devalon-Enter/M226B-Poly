
public class Starter {

	public static void main(String[] args) {
		
		
		NewsFeed news = new NewsFeed();
		
		MessagePost post1 = new MessagePost("Had a great day up in Zermatt!");
		post1.like();
		post1.like();
		
		news.addMessagePost(post1);
		news.show();
		

	}

}

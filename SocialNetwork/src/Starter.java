
public class Starter {

	public static void main(String[] args) {
		
		
		NewsFeed news = new NewsFeed();
		
		MessagePost post1 = new MessagePost("John", "Had a great day up in Zermatt!");
		post1.like();
		post1.like();
		post1.addComments(new Comment("daniel", "This is not sick!"));
		
		news.addPost(post1);
		news.show();
		

	}

}

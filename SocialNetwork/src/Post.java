import java.util.ArrayList;

public class Post extends NewsFeed{

    private String userName;
    private long timeStamp;
    private int likes;
    private ArrayList<String> comments;


    public Post() {

    }

    public Post(String userName, int likes, ArrayList<String> comments) {
        this.userName = userName;
        this.timeStamp = System.currentTimeMillis();
        this.likes = likes;
        this.comments = comments;
    }


    public void like() {
        likes++;
    }

    public void unlike() {
        if (likes > 0){
            likes--;
        }
    }

    public void addComments(String text) {
        comments.add(text);
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    /**
     * Displays details of post
     */
    public void display() {
        System.out.println("Username " + userName);
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
        long pastMillis = current - timeStamp;
        long seconds = pastMillis/1000;
        long minutes = seconds/60;
        long hours = minutes/60;
        if (minutes > 0) {
            return minutes + " minutes ago";
        } else if(hours > 0){
            return hours + " hours ago";
        } else {
            return "a few seconds ago";
        }

    }
}
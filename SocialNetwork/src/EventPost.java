import java.util.ArrayList;

public class EventPost extends Post {

    private int pages;

    public EventPost(int pages, String userName) {
        super(userName);
        this.pages = pages;
    }

    /**
     * Displays details of post
     */
    public void display() {
        System.out.println("Pages: " + pages);
        super.display();
    }
}

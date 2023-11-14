public class Comment extends Post{

    private String content;

    public Comment(String username, String content) {
        super(username);
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}

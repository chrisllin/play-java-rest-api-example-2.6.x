package v1.post;

/**
 * Resource for the API.  This is a presentation class for frontend work.
 */
public class PostResource {
    private String id;
    private String link;
    private String title;
    private String body;
    private String author;

    public PostResource() {
    }

    public PostResource(String id, String link, String title, String body, String author) {
        this.id = id;
        this.link = link;
        this.title = title;
        this.body = body;
        this.author = author;
    }

    public PostResource(PostData data, String link) {
        this.id = data.id.toString();
        this.link = link;
        this.title = data.title;
        this.body = data.body;
        this.author = data.author;
    }

    public String getId() {
        return id;
    }

    public String getLink() {
        return link;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

}

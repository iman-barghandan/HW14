package domains;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    @Column(nullable = false)
    private String text;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false, updatable = false)
    private Date createDate;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(nullable = false, name = "fk_post")
    private Post post;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(nullable = false, name = "fk_account")
    private Account account;

    public Comment() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }


}

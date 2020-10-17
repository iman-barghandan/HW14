package domains;

import javax.persistence.*;

@Entity
@Table(name = "like_tb")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(nullable = false, name = "fk_post")
    private Post post;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(nullable = false, name = "fk_account")
    private Account account;

    public Like() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

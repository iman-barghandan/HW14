package domains;

import javax.persistence.*;
import java.util.*;


@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String password;

    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false, updatable = false)
    private Date createDate;

    @OneToMany(mappedBy = "account")
    private List<Comment> commentList = new ArrayList<>();

    @OneToMany(mappedBy = "account")
    private List<Like> likeList = new ArrayList<>();

    @OneToMany(mappedBy = "account")
    private List<Post> postList = new ArrayList<>();


    @ManyToMany()
    @JoinTable(
            name = "follower",
            joinColumns = {@JoinColumn(name = "account_Id")},
            inverseJoinColumns = {@JoinColumn(name = "follower_accountId")})
    private Set<Account> followers = new HashSet<>();

    public Account() {
    }

    public Set<Account> getFollowers() {
        return followers;
    }

    public void setFollowers(Set<Account> followers) {
        this.followers = followers;
    }

    public void addFollower(Account account) {
        this.followers.add(account);
    }

    public void deleteFollower(Account account) {
        this.followers.remove(account);
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public List<Like> getLikeList() {
        return likeList;
    }

    public void setLikeList(List<Like> likeList) {
        this.likeList = likeList;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    public void addPost(Post post) {
        this.postList.add(post);
    }


}

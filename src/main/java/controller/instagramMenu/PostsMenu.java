package controller.instagramMenu;

import domains.Account;
import scanner.ScannerClass;
import services.CommentService;
import services.LikeService;
import services.PostService;

public class PostsMenu {
    public static void show(Account account) {
        PostService postService = new PostService();
        int selectedNumber;
        while (true) {
            postService.selectPosts(account);
            System.out.println("############\n" +
                    "(1) Like\n" +
                    "(2) Comment\n" +
                    "(3) Back Menu\n" +
                    "############");
            selectedNumber = ScannerClass.getNumber(1, 3);
            if (selectedNumber == 1) {
                System.out.println("Input Post ID: ");
                long postId = ScannerClass.getNumber();

                LikeService likeService = new LikeService();
                likeService.likeComment(account, postId);
            } else if (selectedNumber == 2) {
                System.out.println("Input Post ID: ");
                long postId = ScannerClass.getNumber();

                System.out.println("Input your Comment:");
                String commentText = ScannerClass.getString();

                CommentService commentService = new CommentService();
                commentService.addComment(account, postId, commentText);
            } else {
                break;
            }
        }
    }
}

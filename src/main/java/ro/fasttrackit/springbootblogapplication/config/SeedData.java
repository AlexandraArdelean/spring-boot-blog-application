package ro.fasttrackit.springbootblogapplication.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ro.fasttrackit.springbootblogapplication.model.Image;
import ro.fasttrackit.springbootblogapplication.model.Post;
import ro.fasttrackit.springbootblogapplication.service.PostService;

import java.util.List;

@Component
public class SeedData implements CommandLineRunner {
    private final PostService postService;

    public SeedData(PostService postService) {
        this.postService = postService;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Post> posts = postService.getAll();
        if (posts.size() == 0) {
            Post post1 = new Post();
            post1.setTitle("Algarve, Portugal");
            post1.setBody("There’s no shortage of high quality beaches either. Sandy stretches as far as the eye can see," +
                    " framed by golden cliffs, virtually deserted islands marking the boundary between " +
                    "Ria Formosa and the sea, and small coves sheltered by the rocks." +
                    " The ocean, in every shade of blue and mostly calm and warm, invites you for long swims.");
            post1.setImages(postImage1());


            Post post2 = new Post();
            post2.setTitle("Bali, Indonesia");
            post2.setBody("Also known as the Land of the Gods, Bali appeals through its sheer natural beauty " +
                    "of looming volcanoes and lush terraced rice fields that exude peace and serenity.");
            post2.setImages(postImage2());


            Post post3 = new Post();
            post3.setTitle("Croatia, Europe");
            post3.setBody("Croatia's extraordinary island-speckled coastline is indisputably its main attraction." +
                    "The first thing that strikes you is the remarkable clarity of the water. " +
                    "When it's set against a dazzling white pebbly beach, the water sparkles with" +
                    " a jewel-like intensity in shades of emerald and sapphire.");

            post3.setImages(postImage3());


            Post post4 = new Post();
            post4.setTitle("Philippines");
            post4.setBody("The best beaches in the Philippines, idyllic islands in turquoise waters, the world’s " +
                    "most perfect cone volcano, the smallest primate, world-class surfing spots, " +
                    "and centuries-old Spanish fortresses.");
            post4.setImages(postImage4());



            Post post5 = new Post();
            post5.setTitle("Santorini, Greece");
            post5.setBody("Even if you’ve never been to this Cyclades island in the Aegean Sea, you’d still recognize " +
                    "it immediately—its candy-colored houses carved into cliffs, sapphire waters,and chalk-white " +
                    "buildings topped with cobalt-blue domes. " +
                    "Roam the peaceful black-sand beaches or wander the streets of a provincial village");
            post5.setImages(postImage5());



            postService.save(post1);
            postService.save(post2);
            postService.save(post3);
            postService.save(post4);
            postService.save(post5);
        }
    }

    private List<Image> postImage5() {
        return List.of(new Image("/images/santorini2.jpeg"));
    }


    private List<Image> postImage4() {
        return List.of(new Image("/images/philippines2.jpg"));
    }


    private List<Image> postImage3() {
        return List.of(new Image("images/croatia2.jpg"));
    }


    private List<Image> postImage2() {
        return List.of(new Image("images/bali1.jpg"));
    }


    private List<Image> postImage1() {
        return List.of(new Image("/images/algarve/algarve2.jpg"));
    }

}

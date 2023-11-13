package TwiterTask.TwiterTask;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TweetController {
    @GetMapping("/search-tweet-user")
    @PreAuthorize("isAuthenticated()")
    public String searchTweetUser() {
        // Your implementation here.
        return "Search Tweet User API";
    }

    @GetMapping("/get-tweets")
    @PreAuthorize("isAuthenticated()")
    public String getTweets() {
        // Your implementation here.
        return "Get Tweets API";
    }
}
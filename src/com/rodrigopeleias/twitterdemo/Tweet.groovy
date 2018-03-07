package com.rodrigopeleias.twitterdemo

/**
 * Created by rodrigopeleias on 06/03/18.
 */
@groovy.transform.ToString
class Tweet2 {

    String username
    String text
    Integer retwees
    Integer favorites
    Date createdOn

    public Tweet(String user, String tweet) {
        username = user
        text = tweet
        retwees = 0
        favorites = 0
        createdOn = new Date()
    }

    void addToRetweets() {
        retwees += 1
    }

    void addToFavorites() {
        favorites += 1
    }
}

def tweet = new Tweet("@rpeleias", "Hello, Twitter!")
tweet.addToFavorites()
println tweet


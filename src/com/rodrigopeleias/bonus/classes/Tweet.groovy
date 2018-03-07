package com.rodrigopeleias.bonus.classes

@groovy.transform.ToString
class Tweet {

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

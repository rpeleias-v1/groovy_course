package com.rodrigopeleias.groovybeans.exercise

@groovy.transform.ToString
class TweetDemo {

    String post
    String username
    Date postDateTime

    private List favorites = []
    private List retweets = []
    private List mentions = []
    private List hastags = []

    void favorite(String username) {
        favorites << username
    }

    List getFavorites() {
        favorites
    }

    void retweet(String username) {
        retweets << username
    }

    List getRetweets() {
        retweets
    }

    List getMentions() {
        String pattern = /\B@[a-z0-0_-]+/
        post.findAll(pattern)
    }

    List getHashTags() {
        String pattern = /\B@[a-z0-0_-]+/
        post.findAll(pattern)
    }

}

package com.rodrigopeleias.groovybeans.exercise

TweetDemo tweet = new TweetDemo(post: "Groovy Course.", username: "@rpeleias", postDateTime: new Date())
println tweet

tweet.favorite("@ApacheGroovy")
tweet.retweet("@ApacheGroovy")

println tweet.getFavorites()
println tweet.getRetweets()

println tweet.getMentions()
println tweet.getHashTags()
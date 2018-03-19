package com.rodrigopeleias.closure

def log = { String type, Date createdOn, String msg ->
    println "$createdOn [$type] - $msg"
}

log("DEBUG", new Date(), "This is my first debug element...")

def debugLog = log.curry("DEBUG")
debugLog(new Date(), "This is another debug statement...")
debugLog(new Date(), "This is one more...")


def todayDebugLog = log.curry("DEBUG", new Date())
todayDebugLog("This is today's debug msg")

// right curry
def crazyPersonLog = log.rcurry("Why am I logging this why")
crazyPersonLog("ERROR", new Date())

// indexed based currying
def typeMsgLog = log.ncurry(1, new Date())
typeMsgLog("ERROR", "This is using ncurry...")
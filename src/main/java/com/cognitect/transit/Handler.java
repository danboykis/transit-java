package com.cognitect.transit;

public interface Handler {

    String tag(Object o);
    Object rep(Object o);
    String stringRep(Object o);
}
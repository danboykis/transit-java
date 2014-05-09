// Copyright (c) Cognitect, Inc.
// All rights reserved.

package com.cognitect.transit.impl.handler;

import com.cognitect.transit.Handler;
import com.cognitect.transit.impl.TaggedValue;

public class SetHandler implements Handler {

    @Override
    public String tag(Object ignored) {
        return "set";
    }

    @Override
    public Object rep(Object o) {
        return new TaggedValue("array", o, null);
    }

    @Override
    public String stringRep(Object o) {
        return null;
    }
}

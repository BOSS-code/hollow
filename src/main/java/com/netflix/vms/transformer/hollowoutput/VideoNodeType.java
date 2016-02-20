package com.netflix.vms.transformer.hollowoutput;

import java.util.Arrays;

public class VideoNodeType {

    public char[] value = null;

    public VideoNodeType() { }

    public VideoNodeType(char[] value) {
        this.value = value;
    }

    public VideoNodeType(String value) {
        this.value = value.toCharArray();
    }

    public boolean equals(Object other) {
        if(other == this)  return true;
        if(!(other instanceof VideoNodeType))
            return false;

        VideoNodeType o = (VideoNodeType) other;
        if(!Arrays.equals(o.value, value)) return false;
        return true;
    }

    @SuppressWarnings("unused")
    private int __assigned_ordinal = -1;
}
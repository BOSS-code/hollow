package com.netflix.vms.transformer.hollowoutput;

import java.util.Arrays;

public class PassthroughString {

    public char[] value = null;

    public PassthroughString() { }

    public PassthroughString(char[] value) {
        this.value = value;
    }

    public PassthroughString(String value) {
        this.value = value.toCharArray();
    }

    public boolean equals(Object other) {
        if(other == this)  return true;
        if(!(other instanceof PassthroughString))
            return false;

        PassthroughString o = (PassthroughString) other;
        if(!Arrays.equals(o.value, value)) return false;
        return true;
    }

    @SuppressWarnings("unused")
    private int __assigned_ordinal = -1;
}
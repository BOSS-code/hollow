package com.netflix.vms.transformer.hollowoutput;


public class Float {

    public float val = java.lang.Float.NaN;

    public Float() { }

    public Float(float value) {
        this.val = value;
    }

    public boolean equals(Object other) {
        if(other == this)  return true;
        if(!(other instanceof Float))
            return false;

        Float o = (Float) other;
        if(o.val != val) return false;
        return true;
    }

    @SuppressWarnings("unused")
    private int __assigned_ordinal = -1;
}
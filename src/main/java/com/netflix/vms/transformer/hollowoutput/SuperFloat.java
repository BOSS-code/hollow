package com.netflix.vms.transformer.hollowoutput;


public class SuperFloat {

    public float value = java.lang.Float.NaN;

    public SuperFloat() { }

    public SuperFloat(float value) {
        this.value = value;
    }

    public boolean equals(Object other) {
        if(other == this)  return true;
        if(!(other instanceof SuperFloat))
            return false;

        SuperFloat o = (SuperFloat) other;
        if(o.value != value) return false;
        return true;
    }

    @SuppressWarnings("unused")
    private int __assigned_ordinal = -1;
}
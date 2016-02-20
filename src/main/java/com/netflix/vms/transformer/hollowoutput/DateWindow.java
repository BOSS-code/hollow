package com.netflix.vms.transformer.hollowoutput;


public class DateWindow {

    public long startDateTimestamp = java.lang.Long.MIN_VALUE;
    public long endDateTimestamp = java.lang.Long.MIN_VALUE;

    public boolean equals(Object other) {
        if(other == this)  return true;
        if(!(other instanceof DateWindow))
            return false;

        DateWindow o = (DateWindow) other;
        if(o.startDateTimestamp != startDateTimestamp) return false;
        if(o.endDateTimestamp != endDateTimestamp) return false;
        return true;
    }

    @SuppressWarnings("unused")
    private int __assigned_ordinal = -1;
}
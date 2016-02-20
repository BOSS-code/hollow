package com.netflix.vms.transformer.hollowoutput;


public class CertificationSystem {

    public int id = java.lang.Integer.MIN_VALUE;
    public Strings officialURL = null;
    public ISOCountry country = null;

    public boolean equals(Object other) {
        if(other == this)  return true;
        if(!(other instanceof CertificationSystem))
            return false;

        CertificationSystem o = (CertificationSystem) other;
        if(o.id != id) return false;
        if(o.officialURL == null) {
            if(officialURL != null) return false;
        } else if(!o.officialURL.equals(officialURL)) return false;
        if(o.country == null) {
            if(country != null) return false;
        } else if(!o.country.equals(country)) return false;
        return true;
    }

    @SuppressWarnings("unused")
    private int __assigned_ordinal = -1;
}
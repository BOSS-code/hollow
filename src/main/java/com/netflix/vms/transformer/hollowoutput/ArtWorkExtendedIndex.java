package com.netflix.vms.transformer.hollowoutput;

import java.util.List;

public class ArtWorkExtendedIndex {

    public List<ArtWorkDescriptor> artWorkList = null;

    public ArtWorkExtendedIndex() { }

    public ArtWorkExtendedIndex(List<ArtWorkDescriptor> value) {
        this.artWorkList = value;
    }

    public boolean equals(Object other) {
        if(other == this)  return true;
        if(!(other instanceof ArtWorkExtendedIndex))
            return false;

        ArtWorkExtendedIndex o = (ArtWorkExtendedIndex) other;
        if(o.artWorkList == null) {
            if(artWorkList != null) return false;
        } else if(!o.artWorkList.equals(artWorkList)) return false;
        return true;
    }

    @SuppressWarnings("unused")
    private int __assigned_ordinal = -1;
}
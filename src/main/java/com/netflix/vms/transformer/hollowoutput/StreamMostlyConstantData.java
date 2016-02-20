package com.netflix.vms.transformer.hollowoutput;

import java.util.Arrays;
import java.util.List;

public class StreamMostlyConstantData {

    public int deploymentLabel = java.lang.Integer.MIN_VALUE;
    public int conformingGroupId = java.lang.Integer.MIN_VALUE;
    public char[] s3FullPath = null;
    public ImageSubtitleIndexByteRange imageSubtitleIndexByteRange = null;
    public List<Strings> tags = null;
    public int deploymentPriority = java.lang.Integer.MIN_VALUE;

    public boolean equals(Object other) {
        if(other == this)  return true;
        if(!(other instanceof StreamMostlyConstantData))
            return false;

        StreamMostlyConstantData o = (StreamMostlyConstantData) other;
        if(o.deploymentLabel != deploymentLabel) return false;
        if(o.conformingGroupId != conformingGroupId) return false;
        if(!Arrays.equals(o.s3FullPath, s3FullPath)) return false;
        if(o.imageSubtitleIndexByteRange == null) {
            if(imageSubtitleIndexByteRange != null) return false;
        } else if(!o.imageSubtitleIndexByteRange.equals(imageSubtitleIndexByteRange)) return false;
        if(o.tags == null) {
            if(tags != null) return false;
        } else if(!o.tags.equals(tags)) return false;
        if(o.deploymentPriority != deploymentPriority) return false;
        return true;
    }

    @SuppressWarnings("unused")
    private int __assigned_ordinal = -1;
}
package com.lumini.challenge.commons;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public abstract class Model {

    public Model() {
    }

    public final boolean equals(final Object that) {
        return EqualsBuilder.reflectionEquals(this, that, new String[0]);
    }

    public final int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, new String[0]);
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

package org.simpleframework.xml.core;

/* loaded from: classes2.dex */
public interface Creator {
    Object getInstance();

    Object getInstance(Criteria criteria);

    double getScore(Criteria criteria);

    Signature getSignature();

    Class getType();
}

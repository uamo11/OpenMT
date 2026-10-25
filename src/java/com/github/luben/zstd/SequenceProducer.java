package com.github.luben.zstd;

/* loaded from: classes.dex */
public interface SequenceProducer {
    long createState();

    void freeState(long j);

    long getFunctionPointer();
}

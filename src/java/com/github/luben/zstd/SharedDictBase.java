package com.github.luben.zstd;

/* loaded from: classes.dex */
public abstract class SharedDictBase extends AutoCloseBase {
    public void finalize() {
        close();
    }
}

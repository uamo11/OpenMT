package com.amazonaws.internal;

import com.amazonaws.AbortedException;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import l.C0794;
import l.InterfaceC14905;

/* loaded from: classes.dex */
public abstract class SdkInputStream extends InputStream implements MetricAware, InterfaceC14905 {
    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* renamed from: ᩳ */
    public abstract InputStream mo215();

    @Override // com.amazonaws.internal.MetricAware
    @Deprecated
    /* renamed from: ֫ */
    public final boolean mo279() {
        Closeable mo215 = mo215();
        if (mo215 instanceof MetricAware) {
            return ((MetricAware) mo215).mo279();
        }
        return false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m282() {
        if (Thread.interrupted()) {
            throw new AbortedException();
        }
    }
}

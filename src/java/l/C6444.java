package l;

import java.io.IOException;

/* compiled from: S4DD */
/* renamed from: l.ۜ֫֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6444 extends RuntimeException {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public IOException f19925;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public IOException f19926;

    public C6444(IOException iOException) {
        super(iOException);
        this.f19925 = iOException;
        this.f19926 = iOException;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final IOException m17799() {
        return this.f19925;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final IOException m17801() {
        return this.f19926;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17800(IOException iOException) {
        C20032.m46180((Throwable) this.f19925, iOException);
        this.f19926 = iOException;
    }
}

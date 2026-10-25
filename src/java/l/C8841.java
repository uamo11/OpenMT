package l;

import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: D70T */
/* renamed from: l.ۡۧܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8841 implements AutoCloseable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C16059 f26920;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f26921;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18177 f26922;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f26923;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC18883 f26924;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC18883 f26925;

    public C8841(C18177 c18177, InterfaceC18883 interfaceC18883, InterfaceC18883 interfaceC188832, C16059 c16059, boolean z, long j) {
        this.f26922 = c18177;
        this.f26925 = interfaceC18883;
        this.f26924 = interfaceC188832;
        this.f26920 = c16059;
        this.f26923 = z;
        this.f26921 = j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m22843() {
        return this.f26920.m37965();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22844(DataOutputStream dataOutputStream) {
        C16059 c16059 = this.f26920;
        c16059.m37969();
        C18177.m42319(dataOutputStream, this.f26925, c16059, this.f26923);
        c16059.m37969();
        C18177.m42327(this.f26922, this);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        try {
            this.f26920.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        try {
            this.f26924.close();
        } catch (IOException e2) {
            if (e == null) {
                e = e2;
            } else {
                e.addSuppressed(e2);
            }
        }
        if (e != null) {
            throw e;
        }
    }
}

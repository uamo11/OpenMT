package l;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: N8HI */
/* renamed from: l.ᩴܶ֫, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18832 implements InterfaceC21449 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f59406;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21449 f59407;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Uri f59408;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Map f59409;

    public C18832(InterfaceC21449 interfaceC21449) {
        interfaceC21449.getClass();
        this.f59407 = interfaceC21449;
        this.f59408 = Uri.EMPTY;
        this.f59409 = Collections.EMPTY_MAP;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m43509() {
        this.f59406 = 0L;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m43508() {
        return this.f59406;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Uri m43510() {
        return this.f59408;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Map m43507() {
        return this.f59409;
    }

    @Override // l.InterfaceC21449
    /* renamed from: ֫ */
    public final long mo1620(C3104 c3104) {
        InterfaceC21449 interfaceC21449 = this.f59407;
        this.f59408 = c3104.f9711;
        this.f59409 = Collections.EMPTY_MAP;
        try {
            return interfaceC21449.mo1620(c3104);
        } finally {
            Uri mo1621 = interfaceC21449.mo1621();
            if (mo1621 != null) {
                this.f59408 = mo1621;
            }
            this.f59409 = interfaceC21449.mo5936();
        }
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.f59407.read(bArr, i, i2);
        if (read != -1) {
            this.f59406 += read;
        }
        return read;
    }

    @Override // l.InterfaceC21449
    /* renamed from: ܿ */
    public final Uri mo1621() {
        return this.f59407.mo1621();
    }

    @Override // l.InterfaceC21449
    /* renamed from: ֫ */
    public final Map mo5936() {
        return this.f59407.mo5936();
    }

    @Override // l.InterfaceC21449
    public final void close() {
        this.f59407.close();
    }

    @Override // l.InterfaceC21449
    /* renamed from: ֫ */
    public final void mo5937(InterfaceC0486 interfaceC0486) {
        interfaceC0486.getClass();
        this.f59407.mo5937(interfaceC0486);
    }
}

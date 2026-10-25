package l;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: L8KW */
/* renamed from: l.ۙ۠֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4515 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f14348;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Uri f14349;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f14350;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f14351;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f14352;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f14353;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Map f14354;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f14355;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f14356;

    public C4515() {
        this.f14352 = 1;
        this.f14354 = Collections.EMPTY_MAP;
        this.f14351 = -1L;
    }

    public C4515(C3104 c3104) {
        this.f14349 = c3104.f9711;
        this.f14355 = c3104.f9717;
        this.f14352 = c3104.f9714;
        this.f14350 = c3104.f9712;
        this.f14354 = c3104.f9716;
        this.f14356 = c3104.f9718;
        this.f14351 = c3104.f9713;
        this.f14353 = c3104.f9715;
        this.f14348 = c3104.f9710;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m13287(String str) {
        this.f14349 = Uri.parse(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13281(Uri uri) {
        this.f14349 = uri;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m13288(long j) {
        this.f14355 = j;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m13285(int i) {
        this.f14352 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13284(byte[] bArr) {
        this.f14350 = bArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13283(Map map) {
        this.f14354 = map;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m13286(long j) {
        this.f14356 = j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13280(long j) {
        this.f14351 = j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13282(String str) {
        this.f14353 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13279(int i) {
        this.f14348 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3104 m13278() {
        if (this.f14349 == null) {
            throw new IllegalStateException("The uri must be set.");
        }
        return new C3104(this.f14349, this.f14355, this.f14352, this.f14350, this.f14354, this.f14356, this.f14351, this.f14353, this.f14348, 0);
    }
}

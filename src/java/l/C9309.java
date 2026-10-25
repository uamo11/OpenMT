package l;

import java.util.LinkedList;

/* compiled from: Y5SH */
/* renamed from: l.ۢۗ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9309 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f28202;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f28203;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C9309 f28205;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C9309 f28206;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8603 f28207;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public LinkedList f28204 = new LinkedList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f28201 = -1;

    public C9309(C8603 c8603, int i, int i2) {
        this.f28207 = c8603;
        this.f28205 = null;
        this.f28206 = null;
        this.f28203 = i;
        this.f28202 = i2;
        this.f28205 = null;
        this.f28206 = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23895(C9309 c9309) {
        C9309 c93092 = this.f28205;
        c93092.f28206 = c9309;
        c9309.f28205 = c93092;
        this.f28205 = c9309;
        c9309.f28206 = this;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9309 m23894(int i) {
        C9309 c9309 = new C9309(this.f28207, i, this.f28202);
        c9309.f28201 = this.f28201;
        c9309.f28204.addAll(this.f28204);
        C9309 c93092 = this.f28206;
        c93092.f28205 = c9309;
        c9309.f28206 = c93092;
        this.f28206 = c9309;
        c9309.f28205 = this;
        this.f28202 = i;
        return c9309;
    }
}

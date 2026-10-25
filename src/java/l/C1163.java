package l;

import java.util.ArrayList;

/* compiled from: XAZX */
/* renamed from: l.֨ܰᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1163 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C5397 f4201;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f4202;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f4203;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f4204;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f4205 = -1;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f4206;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21625 f4207;

    public C1163(C21625 c21625) {
        this.f4207 = c21625;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m3964(int i) {
        int i2;
        int i3;
        int m48851;
        ArrayList arrayList;
        int m48847;
        int i4;
        if (i < 0) {
            return false;
        }
        C21625 c21625 = this.f4207;
        i2 = c21625.f69418;
        if (i >= i2) {
            return false;
        }
        int i5 = this.f4205;
        i3 = c21625.f69417;
        if (i5 != i3 || i < this.f4203 || i >= this.f4204) {
            m48851 = c21625.m48851(i);
            this.f4202 = m48851;
            arrayList = c21625.f69419;
            this.f4201 = (C5397) arrayList.get(this.f4202);
            m48847 = c21625.m48847(this.f4202);
            this.f4203 = m48847;
            this.f4204 = m48847 + this.f4201.f16805;
            i4 = c21625.f69417;
            this.f4205 = i4;
        }
        this.f4206 = i - this.f4203;
        return true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m3963() {
        return this.f4201.f16802[this.f4206] & 65535;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char m3959() {
        return (char) (this.f4201.f16802[this.f4206] >>> 16);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m3961() {
        return this.f4201.m15403(this.f4206) - this.f4201.m15405(this.f4206);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m3962(int i) {
        C5397 c5397 = this.f4201;
        return c5397.f16803[C11003.checkIndex(i, m3961()) + c5397.m15405(this.f4206)];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m3960(int i) {
        int m15403 = this.f4201.m15403(this.f4206);
        for (int m15405 = this.f4201.m15405(this.f4206); m15405 < m15403; m15405++) {
            if (this.f4201.f16803[m15405] == i) {
                return true;
            }
        }
        return false;
    }
}

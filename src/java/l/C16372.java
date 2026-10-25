package l;

import android.view.View;

/* compiled from: K4ND */
/* renamed from: l.ܽۗۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16372 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f50363;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f50364;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC2262 f50365;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f50366;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f50367;

    public C16372() {
        m38536();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38536() {
        this.f50367 = -1;
        this.f50363 = Integer.MIN_VALUE;
        this.f50364 = false;
        this.f50366 = false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38534() {
        int mo7478;
        if (this.f50364) {
            mo7478 = this.f50365.mo7476();
        } else {
            mo7478 = this.f50365.mo7478();
        }
        this.f50363 = mo7478;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f50367 + ", mCoordinate=" + this.f50363 + ", mLayoutFromEnd=" + this.f50364 + ", mValid=" + this.f50366 + '}';
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38537(int i, View view) {
        int m7475 = this.f50365.m7475();
        if (m7475 >= 0) {
            m38535(i, view);
            return;
        }
        this.f50367 = i;
        if (this.f50364) {
            int mo7476 = (this.f50365.mo7476() - m7475) - this.f50365.mo7473(view);
            this.f50363 = this.f50365.mo7476() - mo7476;
            if (mo7476 > 0) {
                int mo7477 = this.f50363 - this.f50365.mo7477(view);
                int mo7478 = this.f50365.mo7478();
                int min = mo7477 - (Math.min(this.f50365.mo7485(view) - mo7478, 0) + mo7478);
                if (min < 0) {
                    this.f50363 = Math.min(mo7476, -min) + this.f50363;
                    return;
                }
                return;
            }
            return;
        }
        int mo7485 = this.f50365.mo7485(view);
        int mo74782 = mo7485 - this.f50365.mo7478();
        this.f50363 = mo7485;
        if (mo74782 > 0) {
            int mo74762 = (this.f50365.mo7476() - Math.min(0, (this.f50365.mo7476() - m7475) - this.f50365.mo7473(view))) - (this.f50365.mo7477(view) + mo7485);
            if (mo74762 < 0) {
                this.f50363 -= Math.min(mo74782, -mo74762);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38535(int i, View view) {
        if (this.f50364) {
            this.f50363 = this.f50365.m7475() + this.f50365.mo7473(view);
        } else {
            this.f50363 = this.f50365.mo7485(view);
        }
        this.f50367 = i;
    }
}

package l;

import java.io.IOException;

/* compiled from: N17O */
/* renamed from: l.ۚ᩶ܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5585 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f17294;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19697 f17295;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f17296;

    public C5585(C19697 c19697, int i) {
        this.f17295 = c19697;
        this.f17296 = i;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m15865() {
        if (this.f17294) {
            throw new IOException("Stream closed");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m15866(byte[] bArr, int i, int i2) {
        int m45299;
        m15865();
        C19697 c19697 = this.f17295;
        int i3 = this.f17296;
        C13408 c13408 = new C13408(c19697, i3, i2, i, bArr);
        c19697.f63633.lock();
        try {
            if (!c19697.f63631.get()) {
                throw new IOException("Connection closed");
            }
            if (c19697.f63632.mo14298() && C10975.m27284()) {
                try {
                    m45299 = ((Integer) C1802.f6208.submit(new CallableC13903(1, c13408)).get()).intValue();
                } finally {
                    C22518.m50482(th);
                }
            } else {
                m45299 = C19697.m45299(c19697, i3, i2, i, bArr);
            }
            return m45299;
        } finally {
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15871(byte[] bArr, int i, int i2) {
        m15865();
        this.f17295.m45374(this.f17296, bArr, i, i2);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m15872() {
        m15865();
        this.f17295.m45382(this.f17296);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15867() {
        if (this.f17294) {
            return;
        }
        this.f17294 = true;
        this.f17295.m45352(this.f17296);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m15873() {
        m15865();
        return this.f17295.m45386(this.f17296);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15868(long j) {
        m15865();
        this.f17295.m45353(this.f17296, j);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m15869() {
        m15865();
        return this.f17295.m45370(this.f17296);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15870(long j) {
        m15865();
        this.f17295.m45373(this.f17296, j);
    }
}

package l;

/* compiled from: CBJ0 */
/* renamed from: l.ۤܿܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC10438 extends AbstractC4793 {
    @Override // l.AbstractC4793
    /* renamed from: ۧ */
    public final int mo2084() {
        return m13994().m32168().mo7129();
    }

    @Override // l.AbstractC4793
    /* renamed from: ֫ */
    public final void mo2082(C18241 c18241) {
        m13994().m32168().mo7132(c18241, this);
    }

    @Override // l.AbstractC4793
    /* renamed from: ۧ */
    public final AbstractC4793 mo3994(int i) {
        return mo2081(m13993().m46259(i));
    }

    @Override // l.AbstractC4793
    /* renamed from: ܺ */
    public final String mo2085() {
        AbstractC11849 m32168 = m13994().m32168();
        m32168.getClass();
        String m32170 = m13994().m32170();
        String mo7130 = m32168.mo7130(this);
        String mo7133 = m32168.mo7133(this);
        StringBuilder m32307 = C13325.m32307(100, m32170);
        if (mo7130.length() != 0) {
            m32307.append(' ');
            m32307.append(mo7130);
        }
        if (mo7133.length() != 0) {
            m32307.append(" // ");
            m32307.append(mo7133);
        }
        return m32307.toString();
    }
}

package l;

import java.io.IOException;

/* compiled from: 08E3 */
/* renamed from: l.ۧ᩵ۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11199 extends AbstractC23898 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C8355 f33615;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C11178 f33616;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27767(C11178 c11178) {
        this.f33616 = c11178;
    }

    @Override // l.AbstractC23898
    /* renamed from: ۧ */
    public final void mo6591() {
        double[] m38020 = this.f33615.m38020(0);
        double[] m380202 = this.f33615.m38020(1);
        C11178 c11178 = this.f33616;
        if (c11178 != null) {
            for (int i = 0; i < 8; i++) {
                try {
                    c11178.m27718(m38020[i]);
                    c11178.m27718(m380202[i]);
                } catch (IOException unused) {
                    return;
                }
            }
        }
    }
}

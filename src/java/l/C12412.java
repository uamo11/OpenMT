package l;

import java.util.List;

/* compiled from: 28WH */
/* renamed from: l.۫۫ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12412 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C15859 f37382 = new C15859();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C22686 f37383;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f37384;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f37385;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f37386;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C20736 f37387;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f37388;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f37389;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC7785 f37390;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30580(C12392 c12392, List list) {
        C20736 c20736;
        int i;
        int i2;
        return this.f37386 && this.f37390 == c12392.m30436() && this.f37389 == this.f37390.mo26548() && this.f37384 == list && this.f37383 == c12392.f37245 && (c20736 = this.f37387) == c12392.f37258.f9998 && c20736 != null && (i = this.f37385) >= 0 && i <= (i2 = this.f37388) && i2 < c20736.size();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30579(InterfaceC0467 interfaceC0467, boolean z, float[] fArr, int i) {
        int mo2066 = interfaceC0467.mo2066(z);
        int mo2070 = interfaceC0467.mo2070(z);
        int m47348 = this.f37387.m47348(mo2066);
        if (m47348 != -1) {
            float m24484 = this.f37383.m24484();
            int m47366 = this.f37387.m47366(m47348);
            if (mo2066 == mo2070) {
                float m24491 = this.f37383.m24491() / 16.0f;
                float f = m47366 * m24484;
                fArr[i] = f - m24491;
                fArr[i + 1] = f + m24491;
                return true;
            }
            if (mo2070 > mo2066 + 1 && (m47348 = this.f37387.m47348(mo2070 - 1)) == -1) {
                return false;
            }
            int m47365 = this.f37387.m47365(m47348);
            fArr[i] = m47366 * m24484;
            fArr[i + 1] = (m47365 + 1) * m24484;
            return true;
        }
        if (mo2066 != this.f37387.m47368().f35064 + 1) {
            return false;
        }
        float m244912 = this.f37383.m24491() / 16.0f;
        float size = this.f37387.size() * this.f37383.m24484();
        fArr[i] = (size - m244912) - m244912;
        fArr[i + 1] = size;
        return true;
    }
}

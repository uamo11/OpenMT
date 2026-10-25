package l;

import java.io.OutputStream;

/* compiled from: 195F */
/* renamed from: l.ܰᩳ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13992 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f41713;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f41714;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f41715;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7643 f41716;

    public C13992(C7643 c7643, AbstractC15440 abstractC15440, String str) {
        this.f41716 = c7643;
        this.f41715 = abstractC15440;
        this.f41714 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final OutputStream m33472(int i, int i2) {
        String m20442;
        m20442 = C7643.m20442(i, i2, this.f41714);
        this.f41716.mo11520(m20442);
        AbstractC15440 m36524 = this.f41715.m36524(m20442);
        this.f41713 = m36524;
        return m36524.mo23555(false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m33474() {
        AbstractC15440 abstractC15440 = this.f41713;
        if (abstractC15440 != null) {
            this.f41716.f23608.add(abstractC15440.getName());
            this.f41713 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33473() {
        AbstractC15440 abstractC15440 = this.f41713;
        if (abstractC15440 != null) {
            abstractC15440.mo23552();
            this.f41713 = null;
        }
    }
}

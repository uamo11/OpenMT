package l;

import java.util.LinkedHashSet;

/* compiled from: D445 */
/* renamed from: l.᩸ۡ۠, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21475 extends C14190 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f69097 = new LinkedHashSet();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f69098;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4541 f69099;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1755 f69100;

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
        C4541 c4541 = this.f69099;
        boolean z = false;
        for (AbstractC4308 m17562 = c4541.f14480.m17562(c5557.f17186.f17560); !z && m17562.m12913(EnumC9454.CLASS); m17562 = c4541.f14480.m17562(m17562)) {
            C1755 m33123 = c4541.f14426.m33123(m17562.f13890.mo955());
            if (m33123 != null && this.f69100 != m33123) {
                if (this.f69097.add(m33123)) {
                    boolean z2 = this.f69098;
                    try {
                        mo10758(m33123.f6074);
                    } finally {
                        this.f69098 = z2;
                    }
                }
                z = true;
            }
        }
        super.mo1215(c5557);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1217(C14169 c14169) {
        this.f69098 = true;
        super.mo1217(c14169);
    }

    @Override // l.C14190, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1391(C9232 c9232) {
        this.f69098 = true;
        super.mo1391(c9232);
    }

    public C21475(C4541 c4541, C1755 c1755) {
        this.f69099 = c4541;
        this.f69100 = c1755;
    }
}

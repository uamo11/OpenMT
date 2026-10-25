package l;

/* compiled from: 412K */
/* renamed from: l.ۤ֡ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9945 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f30027;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f30028;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f30029;

    public C9945(AbstractC15440 abstractC15440) {
        boolean z = C4925.f15523.getBoolean("generate_backup_file", true);
        this.f30027 = abstractC15440;
        String lowerCase = abstractC15440.mo23544().toLowerCase();
        if (z && (lowerCase.startsWith("/dev/") || lowerCase.startsWith("/proc/") || abstractC15440.getParent() == null)) {
            z = false;
        }
        if (z && abstractC15440.mo27911() && abstractC15440.mo27935() == null) {
            this.f30028 = true;
            AbstractC15440 m36520 = abstractC15440.m36520(".tmp");
            try {
                if ((abstractC15440.mo36530() && !(abstractC15440 instanceof C11893)) || (abstractC15440.mo27917() && abstractC15440.mo27925().m27916())) {
                    this.f30029 = m36520;
                } else if (m36520.mo23545()) {
                    this.f30029 = m36520;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25070(InterfaceC2889 interfaceC2889) {
        AbstractC15440 abstractC15440 = null;
        AbstractC15440 abstractC154402 = this.f30027;
        AbstractC15440 abstractC154403 = this.f30029;
        if (abstractC154403 == null) {
            if (abstractC154402.mo27917() || !abstractC154402.mo27911() || abstractC154402.mo27935() != null) {
                interfaceC2889.mo8487(abstractC154402);
                return;
            }
            if (abstractC154402.mo23120() && !abstractC154402.mo23113()) {
                AbstractC15440 m36520 = abstractC154402.m36520(".rollback");
                if (abstractC154402.mo23551(m36520)) {
                    abstractC15440 = m36520;
                }
            }
            try {
                interfaceC2889.mo8487(abstractC154402);
                if (abstractC15440 != null) {
                    abstractC15440.mo23552();
                    return;
                }
                return;
            } catch (Throwable th) {
                if (abstractC15440 != null && abstractC15440.mo23120()) {
                    if (abstractC154402.mo23120()) {
                        abstractC154402.mo23552();
                    }
                    abstractC15440.mo23551(abstractC154402);
                }
                throw th;
            }
        }
        try {
            interfaceC2889.mo8487(abstractC154403);
            if (this.f30028) {
                abstractC154402.m36529();
            } else {
                abstractC154402.mo23552();
            }
            abstractC154403.m36498(abstractC154402, (Runnable) null);
            C16999.m39870(abstractC154402);
        } catch (Throwable th2) {
            abstractC154403.mo23552();
            throw th2;
        }
    }
}

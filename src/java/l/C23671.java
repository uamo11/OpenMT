package l;

import android.content.res.Resources;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* compiled from: P8ZS */
/* renamed from: l.᩻ۨۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23671 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C5327 f76680;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ExecutorService f76681;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f76682;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f76683 = new HashMap(3);

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f76684 = new HashMap(3);

    public C23671() {
        m52218(C7443.m19976());
        m52218(new C17653());
        C14830 m35236 = C14830.m35236();
        if (this.f76682) {
            throw new IllegalStateException("ImagesPlugin has already been configured and cannot be modified any further");
        }
        m35236.getClass();
        Iterator it = Collections.singleton("image/svg+xml").iterator();
        while (it.hasNext()) {
            this.f76684.put((String) it.next(), m35236);
        }
        if (AbstractC18359.m42790()) {
            C16947 m39777 = C16947.m39777();
            if (this.f76682) {
                throw new IllegalStateException("ImagesPlugin has already been configured and cannot be modified any further");
            }
            m39777.getClass();
            Iterator it2 = Collections.singleton("image/gif").iterator();
            while (it2.hasNext()) {
                this.f76684.put((String) it2.next(), m39777);
            }
        }
        this.f76680 = new C5327(Resources.getSystem());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52218(AbstractC12382 abstractC12382) {
        if (!this.f76682) {
            Iterator it = abstractC12382.mo19977().iterator();
            while (it.hasNext()) {
                this.f76683.put((String) it.next(), abstractC12382);
            }
            return;
        }
        throw new IllegalStateException("ImagesPlugin has already been configured and cannot be modified any further");
    }
}

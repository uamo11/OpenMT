package l;

import android.database.DataSetObserver;

/* compiled from: B7KV */
/* renamed from: l.᩻۠ۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC23567 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52036(AbstractC4311 abstractC4311, C0452 c0452) {
        C11233.m27805(abstractC4311, "baseDotsIndicator");
        C11233.m27805(c0452, "attachable");
        AbstractC12014 m2032 = c0452.m2032();
        if (m2032 == null) {
            throw new IllegalStateException("Please set an adapter to the view pager (1 or 2) or the recycler before initializing the dots indicator");
        }
        m2032.m29379((DataSetObserver) new C9457(new C17217(abstractC4311)));
        abstractC4311.m12958(new C20746(c0452));
        abstractC4311.m12968();
    }
}

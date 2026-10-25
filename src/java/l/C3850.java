package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: 87IM */
/* renamed from: l.ۘۢ֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3850 extends IOException implements Iterable {
    public static final long serialVersionUID = 1;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f12283 = 0;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f12284;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3850(java.lang.String r4, java.util.List r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L5
            goto L1e
        L5:
            if (r5 == 0) goto Lc
            int r4 = r5.size()
            goto Ld
        Lc:
            r4 = 0
        Ld:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r4
            r2[r0] = r5
            java.lang.String r4 = "%,d exception(s): %s"
            java.lang.String r4 = java.lang.String.format(r4, r2)
        L1e:
            if (r5 == 0) goto L25
            int r2 = r5.size()
            goto L26
        L25:
            r2 = 0
        L26:
            if (r2 != 0) goto L29
            goto L2a
        L29:
            r0 = 0
        L2a:
            if (r0 == 0) goto L2e
            r0 = 0
            goto L34
        L2e:
            java.lang.Object r0 = r5.get(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
        L34:
            r3.<init>(r4, r0)
            if (r5 != 0) goto L3b
            java.util.List r5 = java.util.Collections.EMPTY_LIST
        L3b:
            r3.f12284 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3850.<init>(java.lang.String, java.util.List):void");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ArrayList(this.f12284).iterator();
    }
}

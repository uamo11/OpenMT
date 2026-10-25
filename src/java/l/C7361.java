package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: Y5SH */
/* renamed from: l.۟ۡۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7361 implements Iterator {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C11095 f22600;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18150 f22601;

    public C7361(C18150 c18150) {
        C11095 c11095;
        this.f22601 = c18150;
        c11095 = c18150.f56443;
        this.f22600 = c11095;
        this.f22600 = m19787();
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x0014 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C11095 m19787() {
        /*
            r5 = this;
            l.ۧܺۚ r0 = r5.f22600
            l.ۧܺۚ r0 = r0.f33304
            l.ᩳܺۚ r1 = r5.f22601
            l.ۧܺۚ r2 = l.C18150.m42258(r1)
            if (r0 != r2) goto Le
            r0 = 0
            return r0
        Le:
            l.ۧܺۚ r2 = r0.f33304
            l.ۧܺۚ r3 = l.C18150.m42258(r1)
            if (r2 == r3) goto L39
            int r2 = r0.f33302
            l.ۧܺۚ r3 = r0.f33304
            int r4 = r3.f33305
            if (r2 != r4) goto L39
            java.util.ArrayList r2 = r0.f33303
            java.util.ArrayList r3 = r3.f33303
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L39
            l.ۧܺۚ r2 = r0.f33304
            int r3 = r2.f33302
            r0.f33302 = r3
            l.ۧܺۚ r3 = r2.f33304
            l.ۧܺۚ r4 = r2.f33306
            r3.f33306 = r4
            l.ۧܺۚ r2 = r2.f33306
            r2.f33304 = r3
            goto Le
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7361.m19787():l.ۧܺۚ");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22600 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C11095 c11095 = this.f22600;
        this.f22600 = m19787();
        return c11095;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

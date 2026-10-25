package l;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: 770P */
/* renamed from: l.ܽ֫᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16340 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f50304;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f50305;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C23461 f50306;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2346 f50307;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashSet f50308;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f50309;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f50310;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        if (r1.containsKey(m38483(r5)) != false) goto L20;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean m38488(l.AbstractC15440 r5) {
        /*
            r4 = this;
            r0 = r4
            monitor-enter(r0)
            l.C11003.requireNonNull(r5)     // Catch: java.lang.Throwable -> L40
            r4.m38485()     // Catch: java.lang.Throwable -> L40
            java.util.LinkedHashSet r1 = r4.f50310     // Catch: java.lang.Throwable -> L40
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L40
            r2 = 0
            if (r1 == 0) goto L13
            monitor-exit(r0)
            return r2
        L13:
            java.lang.String r5 = r5.mo23554()     // Catch: java.lang.Throwable -> L40
            java.util.LinkedHashSet r1 = r4.f50310     // Catch: java.lang.Throwable -> L40
            boolean r1 = r1.contains(r5)     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L20
            goto L3d
        L20:
            l.᩻ۙ֨ r1 = r4.f50306     // Catch: java.lang.Throwable -> L40
            boolean r1 = r1.test(r5)     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L2b
            java.util.HashMap r1 = r4.f50304     // Catch: java.lang.Throwable -> L40
            goto L2d
        L2b:
            java.util.HashMap r1 = r4.f50309     // Catch: java.lang.Throwable -> L40
        L2d:
            boolean r3 = r1.isEmpty()     // Catch: java.lang.Throwable -> L40
            if (r3 != 0) goto L3e
            java.lang.String r5 = m38483(r5)     // Catch: java.lang.Throwable -> L40
            boolean r5 = r1.containsKey(r5)     // Catch: java.lang.Throwable -> L40
            if (r5 == 0) goto L3e
        L3d:
            r2 = 1
        L3e:
            monitor-exit(r0)
            return r2
        L40:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16340.m38488(l.ܶ᩵ܿ):boolean");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m38489(AbstractC15440 abstractC15440) {
        C11003.requireNonNull(abstractC15440);
        String mo23554 = abstractC15440.mo23554();
        if (this.f50310.remove(mo23554)) {
            String m38483 = m38483(mo23554);
            HashMap hashMap = this.f50304;
            int intValue = ((Integer) hashMap.get(m38483)).intValue();
            if (intValue == 1) {
                hashMap.remove(m38483);
            } else {
                hashMap.put(m38483, Integer.valueOf(intValue - 1));
            }
            if (this.f50308.remove(mo23554)) {
                HashMap hashMap2 = this.f50309;
                int intValue2 = ((Integer) hashMap2.get(m38483)).intValue();
                if (intValue2 == 1) {
                    hashMap2.remove(m38483);
                } else {
                    hashMap2.put(m38483, Integer.valueOf(intValue2 - 1));
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m38487(AbstractC15440 abstractC15440, byte[] bArr) {
        m38486(abstractC15440);
        if (bArr == null || bArr.length == 0) {
            return;
        }
        try {
            C12951 c12951 = new C12951(bArr);
            int readInt = c12951.readInt();
            int length = (bArr.length - 4) / 9;
            if (readInt <= 0 || readInt > length) {
                throw new IOException("Invalid ZIP split volume count: " + readInt);
            }
            AbstractC15440 m36514 = abstractC15440.m36514();
            for (int i = 0; i < readInt; i++) {
                m38486(m36514.m36526(c12951.m31506()));
                c12951.skipBytes(8);
            }
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            throw new IOException("Invalid ZIP split metadata", e);
        }
    }

    public C16340() {
        C23461 c23461 = new C23461(1);
        this.f50310 = new LinkedHashSet();
        this.f50308 = new HashSet();
        this.f50304 = new HashMap();
        this.f50309 = new HashMap();
        this.f50305 = Long.MIN_VALUE;
        this.f50306 = c23461;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16340 m38484(AbstractC13921 abstractC13921) {
        C11003.requireNonNull(abstractC13921);
        C16340 c16340 = new C16340();
        if (abstractC13921 instanceof C19247) {
            C19247 c19247 = (C19247) abstractC13921;
            c16340.m38487(c19247.m44380(), c19247.m44388());
            return c16340;
        }
        if (abstractC13921 instanceof C17626) {
            C17626 c17626 = (C17626) abstractC13921;
            c16340.m38486(c17626.m41201());
            c16340.m38486(c17626.m41207());
            return c16340;
        }
        if (abstractC13921 instanceof C2346) {
            c16340.f50307 = (C2346) abstractC13921;
            c16340.m38485();
            return c16340;
        }
        if (abstractC13921 instanceof C11518) {
            c16340.m38486(((C11518) abstractC13921).m28350());
            return c16340;
        }
        if (abstractC13921 instanceof C5031) {
            C5031 c5031 = (C5031) abstractC13921;
            if (!c5031.m14529()) {
                c16340.m38486(c5031.m14533());
            }
        }
        return c16340;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38485() {
        C2346 c2346 = this.f50307;
        if (c2346 == null) {
            return;
        }
        long m7656 = c2346.m7656();
        if (this.f50305 == m7656) {
            return;
        }
        Iterator it = this.f50307.m7655().iterator();
        while (it.hasNext()) {
            m38486((AbstractC15440) it.next());
        }
        this.f50305 = m7656;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m38483(String str) {
        StringBuilder sb = null;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            char lowerCase = Character.toLowerCase(Character.toUpperCase(charAt));
            if (sb == null && lowerCase != charAt) {
                sb = new StringBuilder(str.length());
                sb.append((CharSequence) str, 0, i);
            }
            if (sb != null) {
                sb.append(lowerCase);
            }
        }
        return sb == null ? str : sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m38486(AbstractC15440 abstractC15440) {
        C11003.requireNonNull(abstractC15440);
        String mo23554 = abstractC15440.mo23554();
        if (this.f50310.add(mo23554)) {
            String m38483 = m38483(mo23554);
            C13843.merge(this.f50304, m38483, 1, new C10697());
            if (this.f50306.test(mo23554)) {
                this.f50308.add(mo23554);
                C13843.merge(this.f50309, m38483, 1, new C10697());
            }
        }
    }
}

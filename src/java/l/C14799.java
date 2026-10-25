package l;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: G6RC */
/* renamed from: l.ܳ᩸ᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C14799 implements AutoCloseable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f45184;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7744 f45185;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CharSequence f45186;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C23077 f45187;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final List f45188;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f45189;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f45190;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C22749 f45191;

    static {
        ApplicationC12518.m30701(114);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public native void m35203(AbstractC3322 abstractC3322);

    public C14799(CharSequence charSequence, C7744 c7744, String str, C23077 c23077, int i, List list) {
        this.f45186 = charSequence;
        this.f45185 = c7744;
        this.f45189 = str;
        this.f45187 = c23077;
        this.f45184 = i;
        this.f45188 = list;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14799 m35198(InterfaceC7785 interfaceC7785, String str, C23077 c23077) {
        return m35197(interfaceC7785, str, c23077, -1, null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14799 m35199(C11915 c11915, String str, C23077 c23077) {
        C14799 m35197 = m35197(c11915.f35630, str, c23077, -1, null);
        C13576 c13576 = c11915.f35628;
        if (c13576 == null || c13576.m32656() <= 1) {
            return m35197;
        }
        try {
            m35197.f45191 = c11915.f35628.m32649(c11915.f35631, m35197.f45186, c11915.f35622.f77236);
            return m35197;
        } catch (Error | RuntimeException e) {
            m35197.close();
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35202() {
        m35200();
        C22749 c22749 = this.f45191;
        if (c22749 != null) {
            c22749.m50828();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14799 m35197(CharSequence charSequence, String str, C23077 c23077, int i, ArrayList arrayList) {
        List unmodifiableList;
        C23077 m51238 = c23077.m51238();
        if (arrayList == null) {
            unmodifiableList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (Object obj : arrayList) {
                C11003.requireNonNull(obj);
                arrayList2.add(obj);
            }
            unmodifiableList = C20195.unmodifiableList(arrayList2);
        }
        if (unmodifiableList != null && (i < 0 || i >= unmodifiableList.size())) {
            throw new IllegalArgumentException("Invalid saving page index");
        }
        try {
            r9 = charSequence instanceof InterfaceC20445 ? ((InterfaceC20445) charSequence).mo26562() : null;
            return new C14799(r9 == null ? charSequence : r9, r9, str, m51238, i, unmodifiableList);
        } catch (Error | RuntimeException e) {
            if (r9 != null) {
                r9.close();
            }
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35204(AbstractC15440 abstractC15440) {
        m35200();
        C22749 c22749 = this.f45191;
        C23077 c23077 = this.f45187;
        String str = this.f45189;
        if (c22749 == null) {
            C1394.m4887(abstractC15440, this.f45186, str, c23077.f74223);
        } else {
            C1394.m4885(abstractC15440, str, c23077.f74223, c22749);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13963 m35201(int i) {
        m35200();
        C13963 c13963 = new C13963();
        C22749 c22749 = this.f45191;
        CharSequence charSequence = this.f45186;
        if (c22749 == null) {
            c13963.m33413(i, charSequence);
            return c13963;
        }
        for (int i2 = 0; i2 < this.f45191.f73465.m32656(); i2++) {
            if (i2 == this.f45191.m50825()) {
                c13963.m33413(i, charSequence);
            } else {
                C7744 m50826 = this.f45191.m50826(i2);
                try {
                    c13963.m33413(-1, m50826);
                    m50826.close();
                } catch (Throwable th) {
                    try {
                        m50826.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        return c13963;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m35205(C23077 c23077) {
        int i;
        C23077 c230772 = this.f45187;
        Map map = c230772.f74225;
        if (c23077 != null) {
            Map map2 = c23077.f74225;
            if (c230772.f74226 == c23077.f74226 && c230772.f74223 == c23077.f74223 && c230772.f74224 == c23077.f74224 && c230772.f74222 == c23077.f74222 && c230772.f74221 == c23077.f74221 && C11003.equals(c230772.f74220, c23077.f74220)) {
                if (map == null || map2 == null) {
                    if (map == map2) {
                        return true;
                    }
                } else if (map.keySet().equals(map2.keySet())) {
                    for (Map.Entry entry : map.entrySet()) {
                        C16809 c16809 = (C16809) entry.getValue();
                        C16809 c168092 = (C16809) map2.get(entry.getKey());
                        int i2 = c16809.f51608;
                        C14692[] c14692Arr = c16809.f51607;
                        int i3 = c168092.f51608;
                        C14692[] c14692Arr2 = c168092.f51607;
                        if (i2 == i3 && c16809.f51604 == c168092.f51604 && C11003.equals(c16809.f51605, c168092.f51605) && c14692Arr.length == c14692Arr2.length) {
                            while (i < c14692Arr.length) {
                                C14692 c14692 = c14692Arr[i];
                                C14692 c146922 = c14692Arr2[i];
                                i = (c14692.f44876 == c146922.f44876 && c14692.f44877 == c146922.f44877 && C11003.equals(c14692.f44875, c146922.f44875)) ? i + 1 : 0;
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m35200() {
        if (this.f45190) {
            throw new IllegalStateException("Saving request is closed");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f45190) {
            return;
        }
        this.f45190 = true;
        try {
            C7744 c7744 = this.f45185;
            if (c7744 != null) {
                c7744.close();
            }
        } finally {
            C22749 c22749 = this.f45191;
            if (c22749 != null) {
                c22749.close();
            }
        }
    }
}

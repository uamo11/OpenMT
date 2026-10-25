package l;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: 99PI */
/* renamed from: l.ۢۖۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9291 extends AbstractC0823 implements InterfaceC13292 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C5057 f28162;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f28163;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C2235[] f28164;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public HashMap f28165;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C2235[] f28166;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C23233 f28167;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f28168;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ReferenceQueue f28169;

    @Override // l.AbstractC0823
    /* renamed from: ۢ */
    public final InterfaceC23338 mo1132() {
        return this.f28167;
    }

    @Override // l.AbstractC0823
    public final String getName() {
        return this.f28167.getName();
    }

    @Override // l.AbstractC0823
    /* renamed from: ܿ */
    public final String mo1141() {
        return this.f28168;
    }

    @Override // l.AbstractC0823
    /* renamed from: ۧ */
    public final C5057 mo1134() {
        return this.f28162;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List m23854() {
        return C20195.unmodifiableList(Arrays.asList(this.f28164));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2235 m23852(String str) {
        C23401 c23401 = this.f28162.f15895;
        String str2 = this.f28168 + '.' + str;
        c23401.getClass();
        AbstractC0823 m51848 = c23401.m51848(str2, EnumC14228.ALL_SYMBOLS);
        if (m51848 instanceof C2235) {
            return (C2235) m51848;
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2235 m23853(int i) {
        int i2;
        C2235 c2235;
        C2235 m23851 = m23851(i);
        if (m23851 != null) {
            return m23851;
        }
        synchronized (this) {
            if (this.f28169 == null) {
                this.f28169 = new ReferenceQueue();
                this.f28165 = new HashMap();
            } else {
                while (true) {
                    C20580 c20580 = (C20580) this.f28169.poll();
                    if (c20580 == null) {
                        break;
                    }
                    HashMap hashMap = this.f28165;
                    i2 = c20580.f66264;
                    hashMap.remove(Integer.valueOf(i2));
                }
            }
            WeakReference weakReference = (WeakReference) this.f28165.get(Integer.valueOf(i));
            c2235 = weakReference == null ? null : (C2235) weakReference.get();
            if (c2235 == null) {
                c2235 = new C2235(this, Integer.valueOf(i));
                this.f28165.put(Integer.valueOf(i), new C20580(i, c2235));
            }
        }
        return c2235;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9291(l.C23233 r6, l.C5057 r7, l.C17757 r8) {
        /*
            r5 = this;
            r0 = 0
            r5.<init>(r0)
            r1 = 0
            r5.f28165 = r1
            r5.f28169 = r1
            if (r8 != 0) goto Le
            r5.f2993 = r7
            goto L10
        Le:
            r5.f2993 = r8
        L10:
            r5.f28167 = r6
            java.lang.String r2 = r6.getName()
            java.lang.String r8 = l.C21991.m49472(r7, r8, r2)
            r5.f28168 = r8
            r5.f28162 = r7
            int r8 = r6.m51559()
            if (r8 == 0) goto L87
            int r8 = r6.m51559()
            l.ۖۖۖ[] r8 = new l.C2235[r8]
            r5.f28164 = r8
            r8 = 0
        L2d:
            int r2 = r6.m51559()
            if (r8 >= r2) goto L43
            l.ۖۖۖ[] r2 = r5.f28164
            l.ۖۖۖ r3 = new l.ۖۖۖ
            l.ᩳۢۖ r4 = r6.m51556(r8)
            r3.<init>(r4, r7, r5, r8)
            r2[r8] = r3
            int r8 = r8 + 1
            goto L2d
        L43:
            l.ۖۖۖ[] r8 = r5.f28164
            java.lang.Object r8 = r8.clone()
            l.ۖۖۖ[] r8 = (l.C2235[]) r8
            r5.f28166 = r8
            java.util.Comparator r2 = l.C2235.f7298
            java.util.Arrays.sort(r8, r2)
            r8 = 1
        L53:
            int r2 = r6.m51559()
            if (r8 >= r2) goto L72
            l.ۖۖۖ[] r2 = r5.f28166
            r3 = r2[r0]
            r2 = r2[r8]
            int r3 = r3.getNumber()
            int r4 = r2.getNumber()
            if (r3 == r4) goto L6f
            l.ۖۖۖ[] r3 = r5.f28166
            int r0 = r0 + 1
            r3[r0] = r2
        L6f:
            int r8 = r8 + 1
            goto L53
        L72:
            int r0 = r0 + 1
            r5.f28163 = r0
            l.ۖۖۖ[] r8 = r5.f28166
            int r6 = r6.m51559()
            java.util.Arrays.fill(r8, r0, r6, r1)
            l.᩻ۖۖ r6 = l.C5057.m14575(r7)
            r6.m51849(r5)
            return
        L87:
            l.ۜۖۖ r6 = new l.ۜۖۖ
            java.lang.String r7 = "Enums must contain at least one value."
            r6.<init>(r5, r7, r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9291.<init>(l.᩺᩷ۖ, l.ۚۖۖ, l.ᩳۖۖ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23849(C9291 c9291) {
        c9291.m3070(c9291.f28167.m51557().m5804());
        for (C2235 c2235 : c9291.f28164) {
            C2235.m7417(c2235);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2235 m23851(int i) {
        int i2 = this.f28163 - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            C2235 c2235 = this.f28166[i4];
            int number = c2235.getNumber();
            if (i < number) {
                i2 = i4 - 1;
            } else {
                if (i <= number) {
                    return c2235;
                }
                i3 = i4 + 1;
            }
        }
        return null;
    }
}

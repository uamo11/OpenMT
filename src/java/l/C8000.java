package l;

/* compiled from: XAQ5 */
/* renamed from: l.۠ۜ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C8000 extends AbstractC16466 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC16466 f24706;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f24707;

    @Override // l.AbstractC16466
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int mo21317() {
        return 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8000 m21314(AbstractC16466 abstractC16466, int i) {
        if (i == Integer.MAX_VALUE && abstractC16466 == null) {
            return C21198.f68319;
        }
        return new C8000(abstractC16466, i);
    }

    @Override // l.AbstractC16466
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC16466 mo21315(int i) {
        return this.f24706;
    }

    @Override // l.AbstractC16466
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int mo21316(int i) {
        return this.f24707;
    }

    @Override // l.AbstractC16466
    public boolean equals(Object obj) {
        AbstractC16466 abstractC16466;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8000)) {
            return false;
        }
        if (this.f50608 != ((AbstractC16466) obj).f50608) {
            return false;
        }
        C8000 c8000 = (C8000) obj;
        return this.f24707 == c8000.f24707 && (abstractC16466 = this.f24706) != null && abstractC16466.equals(c8000.f24706);
    }

    public String toString() {
        AbstractC16466 abstractC16466 = this.f24706;
        String obj = abstractC16466 != null ? abstractC16466.toString() : "";
        int length = obj.length();
        int i = this.f24707;
        if (length == 0) {
            return i == Integer.MAX_VALUE ? "$" : String.valueOf(i);
        }
        return String.valueOf(i) + " " + obj;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C8000(l.AbstractC16466 r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            if (r3 == 0) goto L11
            int r0 = l.C2093.m6874(r0, r3)
            int r0 = l.C2093.m6876(r0, r4)
            r1 = 2
            int r0 = l.C2093.m6873(r0, r1)
            goto L16
        L11:
            r1 = 0
            int r0 = l.C2093.m6873(r0, r1)
        L16:
            r2.<init>(r0)
            r2.f24706 = r3
            r2.f24707 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8000.<init>(l.ܽۜ֡, int):void");
    }
}

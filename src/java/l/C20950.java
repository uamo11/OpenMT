package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: B5TO */
/* renamed from: l.᩷ܶۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20950 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f67710;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C5637 f67712;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18316 f67714;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f67715;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList[] f67716;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C23771[] f67718;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int[] f67719;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public HashMap f67720 = new HashMap();

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ArrayList f67713 = new ArrayList();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public HashMap f67711 = new HashMap();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f67717 = true;

    /* JADX WARN: Removed duplicated region for block: B:219:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x049d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C5637 m47765(boolean r18, l.C7338 r19, l.C18316 r20) {
        /*
            Method dump skipped, instructions count: 1852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20950.m47765(boolean, l.۟۠ۖ, l.ᩳ᩸ۖ):l.ۚ᩹ۖ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18274 m47767(C6838 c6838) {
        C18274 c18274 = c6838.f21169;
        if (c18274 != null) {
            return c18274;
        }
        C18274 m47763 = m47763();
        c6838.f21169 = m47763;
        return m47763;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47769(C23771 c23771, int i) {
        C23771[] c23771Arr = this.f67718;
        C23771 c237712 = c23771Arr[i];
        if (c237712 == null) {
            c237712 = new C23771(this.f67714.f56947);
            c23771Arr[i] = c237712;
        }
        if (this.f67719[i] <= 1) {
            c237712.f5017 = c23771.f5017;
            Object[] objArr = c23771.f5018;
            Object[] objArr2 = c237712.f5018;
            System.arraycopy(objArr, 0, objArr2, 0, objArr2.length);
            return;
        }
        for (int i2 = 0; i2 < c23771.f5018.length; i2++) {
            C6838 c6838 = (C6838) c23771.m4866(i2);
            C6838 c68382 = (C6838) c237712.m4866(i2);
            if (c6838 != null) {
                if (c68382 == null) {
                    c68382 = new C6838();
                    c237712.m4867(i2, c68382);
                }
                C6838 c68383 = c68382.f21171;
                if (c68383 == null) {
                    c68382.f21171 = c6838;
                } else if (c68383 != c6838) {
                    if (c68382.f21170 == null) {
                        c68382.f21170 = new HashSet(5);
                    }
                    c68382.f21170.add(c6838);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18274 m47763() {
        C18274 c18274 = new C18274(this.f67712.f17415.size());
        this.f67712.f17415.add(c18274);
        return c18274;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47768(AbstractC1591 abstractC1591) {
        this.f67710.add(abstractC1591);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13334 m47766(C11572 c11572) {
        HashMap hashMap = this.f67711;
        C13334 c13334 = (C13334) hashMap.get(c11572);
        if (c13334 != null) {
            return c13334;
        }
        C13334 c133342 = new C13334();
        hashMap.put(c11572, c133342);
        return c133342;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m47770(C11572 c11572) {
        return ((C22549) this.f67720.get(c11572)).f65929;
    }
}

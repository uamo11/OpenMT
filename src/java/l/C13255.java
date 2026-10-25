package l;

import java.util.ArrayList;
import java.util.List;

/* compiled from: Y6RB */
/* renamed from: l.۬ܿۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13255 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f39685;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final CharSequence f39686;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ArrayList f39687;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int[] f39688;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ArrayList f39689;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int[] f39690;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean[] f39691;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f39692;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C23735 f39693;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2569 f39694;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean[] f39695;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean[] f39696;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List f39697;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f39698;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int[] f39699;

    /* JADX WARN: Removed duplicated region for block: B:152:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x044d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C13255(java.lang.CharSequence r20, java.util.List r21, l.C8931 r22, l.C2569 r23) {
        /*
            Method dump skipped, instructions count: 1105
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13255.<init>(java.lang.CharSequence, java.util.List, l.ۡܳ֡, l.ۖܰۢ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01be, code lost:
    
        if (r0 == 100) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x016a, code lost:
    
        r0 = r5.f72672;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a4, code lost:
    
        if (((l.InterfaceC0463) r7.get(r0)).getType() == 99) goto L116;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m32165(boolean r22, int r23, l.C19012 r24) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13255.m32165(boolean, int, l.ᩴ᩷ܿ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m32163(ArrayList arrayList, int i, int i2, String str) {
        if ((C2732.m8477(this.f39686, false, i, str, str.length()) && i2 - i == str.length()) || m32164(i, i2)) {
            return;
        }
        arrayList.add(new C4789(i, i2, str));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m32164(int i, int i2) {
        int i3;
        int i4;
        int i5;
        ArrayList arrayList = this.f39689;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            int i7 = (i6 + size) >>> 1;
            i5 = ((C3378) arrayList.get(i7)).f10675;
            if (i5 <= i) {
                i6 = i7 + 1;
            } else {
                size = i7;
            }
        }
        if (i6 < arrayList.size()) {
            C3378 c3378 = (C3378) arrayList.get(i6);
            i3 = c3378.f10676;
            if (i < i3) {
                i4 = c3378.f10676;
                if (i2 > i4) {
                }
            }
            return true;
        }
        return false;
    }
}

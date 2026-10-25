package l;

import java.util.ArrayList;

/* compiled from: V6OB */
/* renamed from: l.᩻ۤۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23634 implements CharSequence {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CharSequence f76573;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f76574 = new ArrayList();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f76575;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m52124(char c) {
        if (c == '_') {
            return true;
        }
        if (c < 'a' || c > 'z') {
            return (c >= 'A' && c <= 'Z') || c >= 128;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x0233, code lost:
    
        if (m52122(r6.charAt(r7 - 1)) != false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x02ac, code lost:
    
        r7 = r6.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0167, code lost:
    
        if (r6.charAt(r8) != r5) goto L145;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C23634(java.lang.CharSequence r17) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23634.<init>(java.lang.CharSequence):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m52125(int i) {
        CharSequence charSequence = this.f76573;
        return C2732.m8477(charSequence, false, i, "{$", 2) || C2732.m8477(charSequence, false, i, "${", 2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m52127() {
        return this.f76574.isEmpty() ? this.f76573 : this;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m52128(int i, int i2) {
        ArrayList arrayList = this.f76574;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = (i3 + size) >>> 1;
            if (((C14461) arrayList.get(i4)).f44311 <= i) {
                i3 = i4 + 1;
            } else {
                size = i4;
            }
        }
        return i3 < arrayList.size() && ((C14461) arrayList.get(i3)).f44312 < i2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m52126(int i) {
        while (true) {
            CharSequence charSequence = this.f76573;
            if (i >= charSequence.length() || !(charSequence.charAt(i) == ' ' || charSequence.charAt(i) == '\t')) {
                break;
            }
            m52123();
            i++;
        }
        return i;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        if (i >= 0) {
            CharSequence charSequence = this.f76573;
            if (i < charSequence.length()) {
                if (m52128(i, i + 1)) {
                    return 'x';
                }
                return charSequence.charAt(i);
            }
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f76573.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C13130(i, i2, this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52122(char c) {
        if (m52124(c)) {
            return true;
        }
        return c >= '0' && c <= '9';
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m52123() {
        int i = this.f76575 + 1;
        this.f76575 = i;
        if ((i & 1023) == 0) {
            C20813.m47630();
        }
    }
}

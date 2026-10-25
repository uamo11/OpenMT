package l;

import android.text.GetChars;
import android.text.Spannable;
import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* compiled from: B6O0 */
/* renamed from: l.ܶ۟ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15089 implements InterfaceC23008, Spannable, GetChars {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20445 f46089;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f46091;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f46093;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public char[] f46092 = new char[10];

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f46090 = -1;

    public C15089(InterfaceC7785 interfaceC7785) {
        this.f46089 = interfaceC7785;
    }

    public final int indexOf(char c, int i) {
        return indexOf(c, i, this.f46089.length());
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f46089.length();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m35702(int i, int i2) {
        int i3 = i2 - i;
        if (this.f46092.length < i3) {
            this.f46092 = new char[i3];
        }
        try {
            this.f46089.mo26559(i, i2, this.f46092, 0);
            this.f46091 = i;
            this.f46093 = i2;
        } catch (RuntimeException e) {
            this.f46093 = 0;
            this.f46091 = 0;
            throw e;
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        int i2 = this.f46091;
        if (i >= i2 && i < this.f46093) {
            return this.f46092[i - i2];
        }
        int i3 = this.f46090;
        this.f46090 = i;
        int max = (i3 == -1 || i3 <= i) ? i : Math.max(i - 1024, 0);
        InterfaceC20445 interfaceC20445 = this.f46089;
        int length = interfaceC20445.length();
        if (i < 0 || i >= length) {
            return interfaceC20445.charAt(i);
        }
        m35702(max, (int) Math.min(i + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS, length));
        return this.f46092[i - max];
    }

    @Override // l.InterfaceC23008
    public final int indexOf(char c, int i, int i2) {
        int i3;
        int max = Math.max(i, 0);
        int min = Math.min(i2, this.f46089.length());
        if (max >= min) {
            return -1;
        }
        if (max >= this.f46091 && max < (i3 = this.f46093)) {
            char[] cArr = this.f46092;
            int min2 = Math.min(min, i3);
            int i4 = this.f46091;
            int i5 = min2 - i4;
            for (int i6 = max - i4; i6 < i5; i6++) {
                if (cArr[i6] == c) {
                    return this.f46091 + i6;
                }
            }
            max = this.f46093;
        }
        while (max < min) {
            m35702(max, (int) Math.min(max + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS, min));
            char[] cArr2 = this.f46092;
            int i7 = this.f46093 - max;
            for (int i8 = 0; i8 < i7; i8++) {
                if (cArr2[i8] == c) {
                    return max + i8;
                }
            }
            max += i7;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005f -> B:18:0x0061). Please report as a decompilation issue!!! */
    @Override // l.InterfaceC23008
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int lastIndexOf(char r7, int r8, int r9) {
        /*
            r6 = this;
            r0 = 0
            int r8 = java.lang.Math.max(r8, r0)
            int r9 = r9 + (-1)
            l.᩶᩸ᩳ r1 = r6.f46089
            int r1 = r1.length()
            int r1 = r1 + (-1)
            int r9 = java.lang.Math.min(r9, r1)
            r1 = -1
            if (r9 >= r8) goto L17
            return r1
        L17:
            int r2 = r6.f46091
            if (r9 < r2) goto L3a
            int r3 = r6.f46093
            if (r9 >= r3) goto L3a
            char[] r3 = r6.f46092
            int r2 = r8 - r2
            int r2 = java.lang.Math.max(r0, r2)
            int r4 = r6.f46091
            int r9 = r9 - r4
        L2a:
            if (r9 < r2) goto L36
            char r4 = r3[r9]
            if (r4 != r7) goto L33
            int r7 = r6.f46091
            goto L5d
        L33:
            int r9 = r9 + (-1)
            goto L2a
        L36:
            int r9 = r6.f46091
            r2 = r6
            goto L61
        L3a:
            r2 = r6
        L3b:
            if (r9 < r8) goto L64
            int r3 = r9 + (-1023)
            int r3 = java.lang.Math.max(r3, r8)
            int r9 = r9 + 1
            r2.m35702(r3, r9)
            char[] r3 = r2.f46092
            int r4 = r2.f46091
            int r9 = r9 - r4
            int r4 = r8 - r4
            int r4 = java.lang.Math.max(r0, r4)
        L53:
            int r9 = r9 + (-1)
            if (r9 < r4) goto L5f
            char r5 = r3[r9]
            if (r5 != r7) goto L53
            int r7 = r2.f46091
        L5d:
            int r7 = r7 + r9
            return r7
        L5f:
            int r9 = r2.f46091
        L61:
            int r9 = r9 + (-1)
            goto L3b
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15089.lastIndexOf(char, int, int):int");
    }

    public final int count(int i, int i2, char c) {
        int i3;
        int i4;
        int i5 = this.f46091;
        if (i < i5 || i >= (i4 = this.f46093)) {
            i3 = 0;
        } else {
            char[] cArr = this.f46092;
            int min = Math.min(i2, i4) - this.f46091;
            i3 = 0;
            for (int i6 = i - i5; i6 < min; i6++) {
                if (cArr[i6] == c) {
                    i3++;
                }
            }
            i = this.f46093;
        }
        while (i < i2) {
            m35702(i, (int) Math.min(i + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS, i2));
            char[] cArr2 = this.f46092;
            int i7 = this.f46093 - i;
            for (int i8 = 0; i8 < i7; i8++) {
                if (cArr2[i8] == c) {
                    i3++;
                }
            }
            i += i7;
        }
        return i3;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        int i3 = this.f46091;
        if (i3 <= i && i2 <= this.f46093) {
            int i4 = i - i3;
            return new String(this.f46092, i4, (i2 - i3) - i4);
        }
        int i5 = i2 - i;
        char[] cArr = new char[i5];
        this.f46089.mo26559(i, i2, cArr, 0);
        return new C22561(cArr, 0, i5);
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        int i4 = this.f46091;
        if (i4 > i || i2 > this.f46093) {
            this.f46089.mo26559(i, i2, cArr, i3);
            return;
        }
        int i5 = i - i4;
        System.arraycopy(this.f46092, i5, cArr, i3, (i2 - i4) - i5);
    }

    public final void reset() {
        this.f46093 = 0;
        this.f46091 = 0;
        this.f46090 = -1;
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f46089.getSpans(i, i2, cls);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f46089.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f46089.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f46089.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f46089.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        this.f46089.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        this.f46089.removeSpan(obj);
    }
}

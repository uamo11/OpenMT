package l;

import android.text.Editable;
import android.text.Selection;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import java.util.Iterator;
import java.util.Set;

/* compiled from: RB0P */
/* renamed from: l.᩸ᩳ֫, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21738 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC11155 f69704;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23148 f69705;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23854 f69706;

    public C21738(C23148 c23148, C1982 c1982, InterfaceC11155 interfaceC11155, Set set) {
        this.f69706 = c1982;
        this.f69705 = c23148;
        this.f69704 = interfaceC11155;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m49061(str, 0, str.length(), 1, true, new C8332(str));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008e, code lost:
    
        if (r0 != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:44:0x000e, B:47:0x0013, B:49:0x0017, B:51:0x0024, B:8:0x0039, B:10:0x0041, B:12:0x0044, B:14:0x0048, B:16:0x0054, B:18:0x0057, B:23:0x0066, B:26:0x006d, B:28:0x0082, B:6:0x002f), top: B:43:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #0 {all -> 0x002c, blocks: (B:44:0x000e, B:47:0x0013, B:49:0x0017, B:51:0x0024, B:8:0x0039, B:10:0x0041, B:12:0x0044, B:14:0x0048, B:16:0x0054, B:18:0x0057, B:23:0x0066, B:26:0x006d, B:28:0x0082, B:6:0x002f), top: B:43:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence m49065(java.lang.CharSequence r9, int r10, int r11, boolean r12) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof l.C7626
            if (r0 == 0) goto La
            r1 = r9
            l.۟ᩳ֫ r1 = (l.C7626) r1
            r1.m20421()
        La:
            java.lang.Class<l.᩹ᩳ֫> r1 = l.AbstractC22443.class
            if (r0 != 0) goto L2f
            boolean r2 = r9 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L13
            goto L2f
        L13:
            boolean r2 = r9 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L2a
            r2 = r9
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch: java.lang.Throwable -> L2c
            int r3 = r10 + (-1)
            int r4 = r11 + 1
            int r2 = r2.nextSpanTransition(r3, r4, r1)     // Catch: java.lang.Throwable -> L2c
            if (r2 > r11) goto L2a
            l.ܳܿ֫ r2 = new l.ܳܿ֫     // Catch: java.lang.Throwable -> L2c
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L2c
            goto L37
        L2a:
            r2 = 0
            goto L37
        L2c:
            r10 = move-exception
            goto L9a
        L2f:
            l.ܳܿ֫ r2 = new l.ܳܿ֫     // Catch: java.lang.Throwable -> L2c
            r3 = r9
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch: java.lang.Throwable -> L2c
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2c
        L37:
            if (r2 == 0) goto L62
            java.lang.Object[] r1 = r2.getSpans(r10, r11, r1)     // Catch: java.lang.Throwable -> L2c
            l.᩹ᩳ֫[] r1 = (l.AbstractC22443[]) r1     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L62
            int r3 = r1.length     // Catch: java.lang.Throwable -> L2c
            if (r3 <= 0) goto L62
            int r3 = r1.length     // Catch: java.lang.Throwable -> L2c
            r4 = 0
        L46:
            if (r4 >= r3) goto L62
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L2c
            int r6 = r2.getSpanStart(r5)     // Catch: java.lang.Throwable -> L2c
            int r7 = r2.getSpanEnd(r5)     // Catch: java.lang.Throwable -> L2c
            if (r6 == r11) goto L57
            r2.removeSpan(r5)     // Catch: java.lang.Throwable -> L2c
        L57:
            int r10 = java.lang.Math.min(r6, r10)     // Catch: java.lang.Throwable -> L2c
            int r11 = java.lang.Math.max(r7, r11)     // Catch: java.lang.Throwable -> L2c
            int r4 = r4 + 1
            goto L46
        L62:
            r3 = r10
            r4 = r11
            if (r3 == r4) goto L91
            int r10 = r9.length()     // Catch: java.lang.Throwable -> L2c
            if (r3 < r10) goto L6d
            goto L91
        L6d:
            l.ۚᩳ֫ r7 = new l.ۚᩳ֫     // Catch: java.lang.Throwable -> L2c
            l.᩻ᩳ֫ r10 = r8.f69706     // Catch: java.lang.Throwable -> L2c
            r7.<init>(r2, r10)     // Catch: java.lang.Throwable -> L2c
            r5 = 2147483647(0x7fffffff, float:NaN)
            r1 = r8
            r2 = r9
            r6 = r12
            java.lang.Object r10 = r1.m49061(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2c
            l.ܳܿ֫ r10 = (l.C14660) r10     // Catch: java.lang.Throwable -> L2c
            if (r10 == 0) goto L8e
            android.text.Spannable r10 = r10.m34948()     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L8d
            l.۟ᩳ֫ r9 = (l.C7626) r9
            r9.m20422()
        L8d:
            return r10
        L8e:
            if (r0 == 0) goto L99
            goto L93
        L91:
            if (r0 == 0) goto L99
        L93:
            r10 = r9
            l.۟ᩳ֫ r10 = (l.C7626) r10
            r10.m20422()
        L99:
            return r9
        L9a:
            if (r0 == 0) goto La1
            l.۟ᩳ֫ r9 = (l.C7626) r9
            r9.m20422()
        La1:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21738.m49065(java.lang.CharSequence, int, int, boolean):java.lang.CharSequence");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Object m49061(CharSequence charSequence, int i, int i2, int i3, boolean z, InterfaceC1276 interfaceC1276) {
        int i4;
        C15386 c15386 = new C15386(this.f69705.m51328());
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        loop0: while (true) {
            int i6 = codePointAt;
            i4 = i;
            while (i4 < i2 && i5 < i3 && z2) {
                int m36422 = c15386.m36422(i6);
                if (m36422 == 1) {
                    i += Character.charCount(Character.codePointAt(charSequence, i));
                    if (i < i2) {
                        codePointAt = Character.codePointAt(charSequence, i);
                    }
                } else if (m36422 == 2) {
                    i4 += Character.charCount(i6);
                    if (i4 < i2) {
                        i6 = Character.codePointAt(charSequence, i4);
                    }
                } else if (m36422 == 3) {
                    if (z || !m49064(charSequence, i, i4, c15386.m36424())) {
                        z2 = interfaceC1276.mo4338(charSequence, i, i4, c15386.m36424());
                        i5++;
                    }
                    i = i4;
                }
                codePointAt = i6;
            }
        }
        if (c15386.m36425() && i5 < i3 && z2 && (z || !m49064(charSequence, i, i4, c15386.m36423()))) {
            interfaceC1276.mo4338(charSequence, i, i4, c15386.m36423());
        }
        return interfaceC1276.mo4337();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m49062(Editable editable, int i, KeyEvent keyEvent) {
        boolean m49063;
        if (i == 67) {
            m49063 = m49063(editable, keyEvent, false);
        } else {
            m49063 = i != 112 ? false : m49063(editable, keyEvent, true);
        }
        if (!m49063) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m49063(Editable editable, KeyEvent keyEvent, boolean z) {
        AbstractC22443[] abstractC22443Arr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (abstractC22443Arr = (AbstractC22443[]) editable.getSpans(selectionStart, selectionEnd, AbstractC22443.class)) != null && abstractC22443Arr.length > 0) {
                for (AbstractC22443 abstractC22443 : abstractC22443Arr) {
                    int spanStart = editable.getSpanStart(abstractC22443);
                    int spanEnd = editable.getSpanEnd(abstractC22443);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m49064(CharSequence charSequence, int i, int i2, C1961 c1961) {
        if (c1961.m6460() == 0) {
            c1961.m6458(((C6173) this.f69704).m17078(i, i2, c1961.m6463(), charSequence));
        }
        return c1961.m6460() == 2;
    }
}

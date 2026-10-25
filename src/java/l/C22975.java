package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: YAH9 */
/* renamed from: l.᩺ۨᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22975 {
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m51127(C12392 c12392, boolean z) {
        int lastIndexOf = TextUtils.lastIndexOf(c12392.m30436(), '\n', c12392.m30448() - 1) + 1;
        if (z) {
            c12392.mo25922(c12392.m30444(), lastIndexOf);
        } else {
            c12392.mo25919(lastIndexOf);
            c12392.m30400();
        }
        c12392.m30349(lastIndexOf, false);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m51125(C12392 c12392, boolean z) {
        InterfaceC7785 m30436 = c12392.m30436();
        int indexOf = TextUtils.indexOf((CharSequence) m30436, '\n', c12392.m30448());
        if (indexOf == -1) {
            indexOf = m30436.length();
        }
        if (z) {
            c12392.mo25922(c12392.m30444(), indexOf);
        } else {
            c12392.mo25919(indexOf);
            c12392.m30400();
        }
        c12392.m30349(indexOf, false);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m51129(C12392 c12392, boolean z) {
        if (z) {
            c12392.mo25922(c12392.m30444(), 0);
        } else {
            c12392.mo25919(0);
            c12392.m30400();
        }
        c12392.m30349(0, false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m51122(C12392 c12392, boolean z) {
        int m30526 = c12392.m30526();
        if (z) {
            c12392.mo25922(c12392.m30444(), m30526);
        } else {
            c12392.mo25919(m30526);
            c12392.m30400();
        }
        c12392.m30349(m30526, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51114(C12392 c12392) {
        InterfaceC7785 m30436 = c12392.m30436();
        int[] m30369 = c12392.m30369();
        int i = m30369[0];
        int i2 = m30369[1];
        int lastIndexOf = TextUtils.lastIndexOf(m30436, '\n', i - 1) + 1;
        int indexOf = TextUtils.indexOf((CharSequence) m30436, '\n', i2);
        if (indexOf == -1) {
            indexOf = m30436.length();
        }
        c12392.mo25922(lastIndexOf, indexOf);
        String mo26557 = m30436.mo26557(lastIndexOf, indexOf);
        if (!mo26557.endsWith("\n")) {
            mo26557 = mo26557.concat("\n");
        }
        C4925.m14314((CharSequence) mo26557);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m51121(C12392 c12392) {
        InterfaceC7785 m30436 = c12392.m30436();
        int[] m30369 = c12392.m30369();
        int i = m30369[0];
        int i2 = m30369[1];
        int lastIndexOf = TextUtils.lastIndexOf(m30436, '\n', i - 1) + 1;
        int indexOf = TextUtils.indexOf((CharSequence) m30436, '\n', i2) + 1;
        if (indexOf == 0) {
            indexOf = m30436.length();
        }
        String mo26557 = m30436.mo26557(lastIndexOf, indexOf);
        if (!mo26557.endsWith("\n")) {
            mo26557 = mo26557.concat("\n");
        }
        C4925.m14314((CharSequence) mo26557);
        m30436.delete(lastIndexOf, indexOf);
        c12392.mo25919(lastIndexOf);
        c12392.m30400();
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m51130(C12392 c12392) {
        String m14330 = C4925.m14330();
        if (m14330 == null) {
            C21374.m48457(R.string.MT_Protector_res_0x7f120a7f);
            return;
        }
        if (!m14330.endsWith("\n")) {
            m14330 = m14330.concat("\n");
        }
        InterfaceC7785 m30436 = c12392.m30436();
        int[] m30369 = c12392.m30369();
        int i = m30369[0];
        int i2 = m30369[1];
        int lastIndexOf = TextUtils.lastIndexOf(m30436, '\n', i - 1) + 1;
        int indexOf = TextUtils.indexOf((CharSequence) m30436, '\n', i2) + 1;
        if (indexOf == 0) {
            indexOf = m30436.length();
        }
        m30436.replace(lastIndexOf, indexOf, m14330);
        c12392.mo25919(m14330.length() + lastIndexOf);
        c12392.m30400();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m51126(C12392 c12392) {
        int i;
        InterfaceC7785 m30436 = c12392.m30436();
        int[] m30369 = c12392.m30369();
        int i2 = m30369[0];
        int i3 = m30369[1];
        int lastIndexOf = TextUtils.lastIndexOf(m30436, '\n', i2 - 1) + 1;
        int indexOf = TextUtils.indexOf((CharSequence) m30436, '\n', i3) + 1;
        if (indexOf == 0) {
            indexOf = m30436.length();
            m30436.append('\n');
            i = m30436.length();
            m30369[0] = m30369[0] + 1;
            m30369[1] = m30369[1] + 1;
        } else {
            i = indexOf;
        }
        int i4 = indexOf - lastIndexOf;
        m30436.insert(i, m30436.mo26557(lastIndexOf, indexOf));
        c12392.mo25922(m30369[0] + i4, m30369[1] + i4);
        c12392.m30501(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r5 > 0) goto L11;
     */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m51128(l.C12392 r6) {
        /*
            l.۟᩺ᩳ r0 = r6.m30436()
            int r1 = r0.length()
            if (r1 != 0) goto Lb
            return
        Lb:
            int[] r1 = r6.m30369()
            r2 = 0
            r2 = r1[r2]
            r3 = 1
            r1 = r1[r3]
            int r2 = r2 - r3
            r4 = 10
            int r2 = android.text.TextUtils.lastIndexOf(r0, r4, r2)
            int r5 = r2 + 1
            int r1 = android.text.TextUtils.indexOf(r0, r4, r1)
            int r1 = r1 + r3
            if (r1 != 0) goto L2c
            int r1 = r0.length()
            if (r5 <= 0) goto L2c
            goto L2d
        L2c:
            r2 = r5
        L2d:
            r0.delete(r2, r1)
            r6.mo25919(r2)
            r6.m30400()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22975.m51128(l.۫ۨᩳ):void");
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m51123(C12392 c12392) {
        InterfaceC7785 m30436 = c12392.m30436();
        int[] m30369 = c12392.m30369();
        int i = m30369[0];
        int i2 = m30369[1];
        int lastIndexOf = TextUtils.lastIndexOf(m30436, '\n', i - 1) + 1;
        int indexOf = TextUtils.indexOf((CharSequence) m30436, '\n', i2) + 1;
        if (indexOf == 0) {
            indexOf = m30436.length();
        }
        int i3 = 0;
        for (int i4 = lastIndexOf; i4 < indexOf; i4++) {
            if (m30436.charAt(i4) == '\n') {
                i3++;
            }
        }
        int i5 = indexOf == m30436.length() ? lastIndexOf + i3 : (lastIndexOf + i3) - 1;
        m30436.replace(lastIndexOf, indexOf, C9679.m24607('\n', i3));
        c12392.mo25919(i5);
        c12392.m30501(false);
        c12392.m30400();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51116(C12392 c12392, boolean z) {
        InterfaceC7785 m30436 = c12392.m30436();
        int[] m30369 = c12392.m30369();
        int i = m30369[0];
        int i2 = m30369[1];
        if (i == i2) {
            C21374.m48463(R.string.MT_Protector_res_0x7f1205bf);
            return;
        }
        String mo26557 = m30436.mo26557(i, i2);
        m30436.replace(i, i2, z ? mo26557.toUpperCase() : mo26557.toLowerCase());
        c12392.m30501(false);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m51131(C12392 c12392) {
        InterfaceC7785 m30436 = c12392.m30436();
        int[] m30369 = c12392.m30369();
        int i = m30369[0];
        int i2 = m30369[1];
        int m24485 = c12392.f37245.m24485();
        String str = "\t";
        if (i == i2) {
            if (c12392.m30529()) {
                m30436.insert(i, "\t");
                return;
            }
            int i3 = 0;
            for (int m51120 = m51120(i, m30436); m51120 < i; m51120++) {
                i3 = m30436.charAt(m51120) == '\t' ? 0 : i3 + 1;
            }
            char[] cArr = new char[m24485 - (i3 % m24485)];
            Arrays.fill(cArr, ' ');
            m30436.insert(i, new String(cArr));
            return;
        }
        if (!c12392.m30529()) {
            char[] cArr2 = new char[m24485];
            Arrays.fill(cArr2, ' ');
            str = new String(cArr2);
        }
        m30436.insert(m51120(i, m30436), str);
        int length = str.length() + i;
        int length2 = str.length() + i2;
        int m51112 = m51112(length, m30436);
        while (true) {
            int i4 = m51112 + 1;
            if (i4 <= length2) {
                m30436.insert(i4, str);
                m51112 = m51112(i4, m30436);
                length2 += str.length();
            } else {
                c12392.mo25922(length, length2);
                c12392.m30501(false);
                return;
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m51124(C12392 c12392) {
        InterfaceC7785 m30436 = c12392.m30436();
        int[] m30369 = c12392.m30369();
        int i = m30369[0];
        int i2 = m30369[1];
        int m24485 = c12392.f37245.m24485();
        int m51120 = m51120(i, m30436);
        int m51113 = m51113(m30436, m51120, m24485);
        int m51112 = m51112(m51120, m30436);
        int i3 = m51120 + m51113;
        int i4 = i >= i3 ? i - m51113 : m51120;
        if (i2 >= i3) {
            m51120 = i2 - m51113;
        }
        while (true) {
            int i5 = m51112 + 1;
            if (i5 <= m51120) {
                int m511132 = m51113(m30436, i5, m24485);
                m51112 = m51112(i5, m30436);
                m51120 = m51120 >= i5 + m511132 ? m51120 - m511132 : i5;
            } else {
                c12392.mo25922(i4, m51120);
                c12392.m30501(false);
                return;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m51113(InterfaceC7785 interfaceC7785, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 < i2) {
                int i5 = i + i3;
                if (i5 >= interfaceC7785.length()) {
                    break;
                }
                char charAt = interfaceC7785.charAt(i5);
                if (charAt == ' ') {
                    i4++;
                    i3++;
                } else if (charAt == '\t') {
                    i4++;
                }
            } else {
                break;
            }
        }
        if (i4 != 0) {
            interfaceC7785.delete(i, i + i4);
        }
        return i4;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51115(final C12392 c12392, final C13409 c13409) {
        InterfaceC19449 interfaceC19449;
        final InterfaceC7785 m30436 = c12392.m30436();
        final int m30444 = c12392.m30444();
        try {
            if (!m30436.mo1596(new Runnable() { // from class: l.ۤۨᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C12392 c123922 = C12392.this;
                    c123922.m30501(true);
                    InterfaceC7785 interfaceC7785 = m30436;
                    int length = interfaceC7785.length();
                    C13409 c134092 = c13409;
                    interfaceC7785.replace(0, length, c134092);
                    c123922.mo25919(Math.min(m30444, c134092.length()));
                    c123922.m30501(false);
                }
            })) {
                throw new IllegalStateException("Text editor is not ready for formatted output");
            }
            c12392.m30400();
        } finally {
            if (c12392.m30436() == m30436 && (interfaceC19449 = c12392.f37301) != null) {
                interfaceC19449.mo2704(c12392.m30383(), c12392.m30296());
            }
        }
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static void m51118(C12392 c12392) {
        List arrayList;
        InterfaceC19221 interfaceC19221;
        boolean z;
        List m30398 = c12392.m30398();
        if (m30398.isEmpty()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f120a86);
            return;
        }
        InterfaceC7785 m30436 = c12392.m30436();
        int[] m30369 = c12392.m30369();
        int i = m30369[0];
        boolean z2 = i == m30369[1];
        int m51120 = m51120(i, m30436);
        int m51112 = m51112(m30369[0], m30436);
        C15859 c15859 = new C15859();
        C15859 c158592 = new C15859();
        c15859.add(m51120);
        c158592.add(m51112);
        int i2 = 1;
        while (true) {
            int i3 = m51112 + 1;
            if (i3 > m30369[1]) {
                break;
            }
            int m511122 = m51112(i3, m30436);
            c15859.add(i3);
            c158592.add(m511122);
            i2++;
            m51112 = m511122;
        }
        if (m30398.size() == 1) {
            arrayList = m30398;
        } else {
            arrayList = new ArrayList(m30398);
            Collections.sort(arrayList);
        }
        Iterator it = arrayList.iterator();
        loop1: while (true) {
            if (!it.hasNext()) {
                interfaceC19221 = null;
                z = false;
                break;
            }
            interfaceC19221 = (InterfaceC19221) it.next();
            for (int i4 = 0; i4 < i2; i4++) {
                if (!interfaceC19221.mo1301(m30436, c15859.getInt(i4), c158592.getInt(i4))) {
                    break;
                }
            }
            z = true;
            break loop1;
        }
        if (interfaceC19221 == null) {
            Iterator it2 = m30398.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC19221 interfaceC192212 = (InterfaceC19221) it2.next();
                if (interfaceC192212 instanceof C0169) {
                    interfaceC19221 = interfaceC192212;
                    break;
                }
            }
            if (interfaceC19221 == null) {
                interfaceC19221 = (InterfaceC19221) m30398.get(0);
            }
        }
        C21856 m20809 = m30436.m20809();
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = c15859.getInt(i6) + i5;
            int i8 = c158592.getInt(i6) + i5;
            if (z) {
                i5 -= interfaceC19221.mo1300(m20809, i7, i8, m30369);
            } else {
                i5 = interfaceC19221.mo1302(m20809, i7, i8, m30369) + i5;
            }
            if (i2 % 500 == 0) {
                m20809.m49244();
            }
        }
        m20809.m49244();
        if (z2) {
            int i9 = m30369[0];
            int m511123 = m51112(i9, m30436) + 1;
            c12392.mo25919(Math.min((i9 - m51120(i9, m30436)) + m511123, m51112(m511123, m30436)));
            c12392.m30400();
        } else {
            c12392.mo25922(m30369[0], m30369[1]);
        }
        c12392.m30501(false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m51120(int i, CharSequence charSequence) {
        return TextUtils.lastIndexOf(charSequence, '\n', i - 1) + 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m51112(int i, CharSequence charSequence) {
        int indexOf = TextUtils.indexOf(charSequence, '\n', i);
        return indexOf == -1 ? charSequence.length() : indexOf;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static void m51117(C12392 c12392) {
        InterfaceC17186 m18596 = c12392.f37235.m18596();
        if (m18596 == null) {
            C21374.m48457(R.string.MT_Protector_res_0x7f1207fe);
        } else {
            new C6042(c12392, (AbstractActivityC3346) C5350.m15313(c12392.getContext()), m18596).m20274();
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static void m51119(C12392 c12392) {
        InterfaceC6603 m18592 = c12392.f37235.m18592();
        if (m18592 == null) {
            C21374.m48457(R.string.MT_Protector_res_0x7f120978);
        } else {
            new C11687(c12392, (AbstractActivityC3346) C5350.m15313(c12392.getContext()), m18592).m20274();
        }
    }
}

package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: L6P4 */
/* renamed from: l.ۨ᩶ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11930 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f35662;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean[] f35663;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ArrayList f35664 = new ArrayList();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean[] f35665;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C19012 f35666;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean[] f35667;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f35668;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f35669;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final CharSequence f35670;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f35671;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f35672;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f35673;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f35674;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f35675;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m29111(int i) {
        return i == 15 || i == 19 || i == 8 || i == 17;
    }

    public C11930(CharSequence charSequence, C1875 c1875, C8931 c8931, C3463 c3463, C12635 c12635, boolean z, C19012 c19012) {
        String str;
        this.f35670 = charSequence;
        this.f35668 = z;
        if (c3463.m10602()) {
            str = "\t";
        } else {
            int max = Math.max(0, c3463.m10601());
            if (max < 0) {
                throw new IllegalArgumentException(C19370.m44628(max, "count is negative: "));
            }
            if (max == 0) {
                str = "";
            } else if (max == 1) {
                str = " ";
            } else {
                if (1 > Integer.MAX_VALUE / max) {
                    throw new OutOfMemoryError(C18307.m42645(max, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                }
                StringBuilder sb = new StringBuilder(max);
                for (int i = 0; i < max; i++) {
                    sb.append(" ");
                }
                str = sb.toString();
            }
        }
        this.f35672 = str;
        this.f35662 = c12635.m30896();
        this.f35675 = c12635.m30897().isEmpty() ? C20813.m47629(charSequence) : c12635.m30897();
        this.f35669 = c12635.m30898();
        this.f35666 = c19012;
        int[] iArr = new int[c1875.size()];
        Arrays.fill(iArr, -1);
        Iterator it = c1875.m6210().iterator();
        while (it.hasNext()) {
            InterfaceC0463 interfaceC0463 = (InterfaceC0463) it.next();
            C20813.m47630();
            if (interfaceC0463.mo2050() == 0 && interfaceC0463.getType() != -1) {
                iArr[interfaceC0463.mo2052()] = this.f35664.size();
                this.f35664.add(interfaceC0463);
            }
        }
        int[] iArr2 = new int[this.f35664.size()];
        this.f35674 = iArr2;
        Arrays.fill(iArr2, -1);
        int size = this.f35664.size() + 1;
        this.f35673 = new int[size];
        this.f35671 = new int[size];
        this.f35667 = new boolean[size];
        this.f35665 = new boolean[this.f35664.size()];
        this.f35663 = new boolean[this.f35664.size()];
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c8931);
        while (!arrayDeque.isEmpty()) {
            C20813.m47630();
            InterfaceC16174 interfaceC16174 = (InterfaceC16174) arrayDeque.pop();
            if (interfaceC16174 instanceof C8931) {
                C8931 c89312 = (C8931) interfaceC16174;
                int mo1085 = c89312.mo1085();
                if (mo1085 == 5 || mo1085 == 6 || mo1085 == 7 || mo1085 == 8) {
                    InterfaceC0463 interfaceC04632 = c89312.f27156;
                    InterfaceC0463 interfaceC04633 = c89312.f27155;
                    if (interfaceC04632 != null && interfaceC04633 != null && interfaceC04632.mo2052() >= 0 && interfaceC04633.mo2052() >= 0) {
                        int i2 = iArr[interfaceC04632.mo2052()];
                        int i3 = iArr[interfaceC04633.mo2052()];
                        if (i2 >= 0 && i3 > i2) {
                            int m29113 = m29113(i2);
                            int m291132 = m29113(i3);
                            if ((m29113 == 15 && m291132 == 16) || ((m29113 == 17 && m291132 == 18) || ((m29113 == 8 || m29113 == 19) && m291132 == 20))) {
                                int[] iArr3 = this.f35674;
                                iArr3[i2] = i3;
                                iArr3[i3] = i2;
                            }
                        }
                    }
                }
                for (int childCount = c89312.getChildCount() - 1; childCount >= 0; childCount--) {
                    arrayDeque.push(c89312.mo23040(childCount));
                }
            }
        }
        for (int i4 = 0; i4 < this.f35664.size(); i4++) {
            C20813.m47630();
            if (m29111(m29113(i4)) && this.f35674[i4] < 0) {
                m29108(i4, this.f35664.size() + 1);
                return;
            }
            if (m29113(i4) == 7) {
                this.f35667[i4 + 1] = true;
            }
            if (m29113(i4) == 24 && ((InterfaceC0463) this.f35664.get(i4)).getText().equals("\\")) {
                this.f35667[i4 + 1] = true;
            }
            int m291133 = m29113(i4);
            if ((m291133 == 16 || m291133 == 20 || m291133 == 18) && this.f35674[i4] < 0) {
                boolean[] zArr = this.f35667;
                zArr[i4 + 1] = true;
                zArr[i4] = true;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29115(EnumC13340 enumC13340) {
        ArrayList arrayList = this.f35664;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int[] iArr = this.f35673;
        iArr[size] = 1;
        iArr[0] = 1;
        if (enumC13340 != EnumC13340.COMPONENT_VALUES) {
            m29109(0, arrayList.size(), 0, enumC13340 == EnumC13340.DECLARATION_LIST);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0083, code lost:
    
        m29108(r4, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0086, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        r6 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04e9  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m29109(int r21, int r22, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 1516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11930.m29109(int, int, int, boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29114() {
        int i = 0;
        int i2 = 0;
        InterfaceC0463 interfaceC0463 = null;
        while (true) {
            ArrayList arrayList = this.f35664;
            int size = arrayList.size();
            CharSequence charSequence = this.f35670;
            if (i < size) {
                C20813.m47630();
                InterfaceC0463 interfaceC04632 = (InterfaceC0463) arrayList.get(i);
                if (this.f35665[i]) {
                    m29110(C2732.m8476(i2, interfaceC04632.mo2054(), charSequence), i, interfaceC0463, (InterfaceC0463) null);
                    i2 = interfaceC04632.mo2053() + 1;
                } else {
                    m29110(C2732.m8476(i2, interfaceC04632.mo2054(), charSequence), i, interfaceC0463, interfaceC04632);
                    C19012 c19012 = this.f35666;
                    if (c19012.length() == 0 && !this.f35668) {
                        c19012.append((CharSequence) this.f35662);
                    }
                    c19012.m43854(interfaceC04632.mo2054(), interfaceC04632.mo2053() + 1, charSequence);
                    if (this.f35663[i]) {
                        c19012.append(';');
                    }
                    i2 = interfaceC04632.mo2053() + 1;
                    interfaceC0463 = interfaceC04632;
                }
                i++;
            } else {
                m29110(C2732.m8476(i2, charSequence.length(), charSequence), arrayList.size(), interfaceC0463, (InterfaceC0463) null);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
    
        if (r4.contains("@preserve") == false) goto L39;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m29110(java.lang.String r11, int r12, l.InterfaceC0463 r13, l.InterfaceC0463 r14) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11930.m29110(java.lang.String, int, l.֡ܳ֡, l.֡ܳ֡):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m29112(InterfaceC0463 interfaceC0463) {
        C19012 c19012 = this.f35666;
        int length = c19012.length();
        return interfaceC0463 != null && length >= 2 && c19012.charAt(length + (-2)) == '<' && c19012.charAt(length - 1) == '!' && interfaceC0463.getText().startsWith("--");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m29108(int i, int i2) {
        boolean[] zArr = this.f35667;
        Arrays.fill(zArr, i, Math.min(zArr.length, i2), true);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m29113(int i) {
        return ((InterfaceC0463) this.f35664.get(i)).getType();
    }
}

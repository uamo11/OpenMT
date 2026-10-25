package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: JAK2 */
/* renamed from: l.֫ۙ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1607 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f5663;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f5664;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16560 f5665;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f5666;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C10738 f5667;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f5668;

    public C1607(C16560 c16560, List list) {
        this.f5665 = c16560;
        this.f5667 = (C10738) c16560.m39044();
        this.f5666 = list;
        boolean z = false;
        this.f5668 = list.size() > 1;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            if (interfaceC17889.isDirectory() && !interfaceC17889.mo36978()) {
                z = true;
                break;
            }
        }
        this.f5663 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002d, code lost:
    
        if (r4.mo27924() != false) goto L13;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5473(l.RunnableC14306 r13) {
        /*
            r12 = this;
            java.util.List r0 = r12.f5666
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Le1
            l.ۧۗ᩻ r1 = r12.f5667
            java.lang.String r2 = r1.m26937()
            r3 = 0
            java.lang.String[] r4 = new java.lang.String[r3]
            l.ܶ᩵ܿ r4 = l.C16999.m39866(r2, r4)
            r12.f5664 = r4
            boolean r4 = r4.mo27924()
            r8 = 1
            l.ܽۢܳ r5 = r12.f5665
            if (r4 == 0) goto L30
            l.ܶ᩵ܿ r4 = r12.f5664
            l.ܶ᩵ܿ r4 = r4.m36536()
            l.C11003.requireNonNull(r4)
            boolean r4 = r4.mo27924()
            if (r4 == 0) goto L30
            goto L49
        L30:
            boolean r4 = l.C9255.m23780()
            if (r4 != 0) goto L49
            bin.mt.plus.Main r0 = r5.m39056()
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r3] = r2
            r2 = 2131889037(0x7f120b8d, float:1.9412726E38)
            java.lang.String r1 = l.C4925.m14306(r2, r1)
            r0.m10221(r1, r3)
            return
        L49:
            bin.mt.plus.Main r2 = r5.m39056()
            r4 = 2131558861(0x7f0d01cd, float:1.874305E38)
            android.view.View r2 = r2.m10216(r4)
            r6 = r2
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r2 = 2131361908(0x7f0a0074, float:1.8343582E38)
            android.view.View r2 = r6.findViewById(r2)
            r4 = r2
            android.widget.CheckBox r4 = (android.widget.CheckBox) r4
            r2 = 2131361909(0x7f0a0075, float:1.8343584E38)
            android.view.View r2 = r6.findViewById(r2)
            android.widget.CheckBox r2 = (android.widget.CheckBox) r2
            r4.setChecked(r8)
            r7 = 8
            r2.setVisibility(r7)
            boolean r7 = r1.m26936()
            boolean r1 = r12.f5668
            if (r1 == 0) goto L7f
            long r0 = java.lang.System.currentTimeMillis()
            goto L89
        L7f:
            java.lang.Object r0 = r0.get(r3)
            l.۫᩶᩻ r0 = (l.C12645) r0
            long r0 = r0.getTime()
        L89:
            java.lang.String r9 = l.C17283.m40576(r0)
            if (r7 == 0) goto L96
            l.ܶ᩵ܿ r0 = r12.f5664
            java.lang.String r0 = l.C22263.m49978(r0)
            goto L97
        L96:
            r0 = 0
        L97:
            r10 = r0
            l.ۛ᩶᩻ r11 = new l.ۛ᩶᩻
            bin.mt.plus.Main r2 = r5.m39056()
            r0 = r11
            r1 = r12
            r3 = r7
            r5 = r6
            r6 = r10
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = 2131887595(0x7f1205eb, float:1.9409802E38)
            r11.m31258(r0)
            r11.m31250(r9)
            java.lang.String r0 = l.C17283.m40571()
            r11.m31265(r0)
            r11.m31244()
            r0 = 6
            r11.m31279(r0)
            r0 = 4
            r11.m31276(r0)
            l.֫֫᩻ r1 = new l.֫֫᩻
            r1.<init>(r8)
            r11.m31249(r1)
            r11.m31266(r8)
            android.widget.Button r1 = r11.m31282()
            l.ۢ᩷ᩳ r2 = new l.ۢ᩷ᩳ
            r2.<init>(r0, r11)
            r1.setOnClickListener(r2)
            l.֡ۚۢ r0 = r11.m31278()
            l.C8960.m23097(r0)
            return
        Le1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1607.m5473(l.ܳۙ᩻):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5467(C1607 c1607, RunnableC14306 runnableC14306, long j, boolean z, C11667 c11667, boolean z2) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet2 = new HashSet();
        for (InterfaceC17889 interfaceC17889 : c1607.f5666) {
            String substring = interfaceC17889.getPath().substring(1);
            if (interfaceC17889.isDirectory()) {
                arrayList.add(substring + "/");
            } else {
                hashSet.add(substring);
            }
        }
        new C7706(c1607, c11667, z2, hashSet, arrayList, z, j, hashSet2, runnableC14306).m20274();
    }
}

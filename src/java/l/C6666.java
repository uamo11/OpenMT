package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: LAW9 */
/* renamed from: l.ۜۡᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6666 extends AbstractC17955 {

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC5471 f20721;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C6666(l.C17249 r4, l.InterfaceC5276 r5, l.InterfaceC5471 r6) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.List r1 = r6.mo3565()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r1.next()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.append(r2)
            goto Ld
        L1d:
            java.lang.String r0 = r0.toString()
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            r3.f20721 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6666.<init>(l.ܿۡᩳ, l.ۚۢᩳ, l.ۚܽۚ):void");
    }

    @Override // l.AbstractC17955, l.AbstractC16543
    /* renamed from: ֫ */
    public final List mo3535(C17249 c17249) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c17249.f52880.values().iterator();
        while (it.hasNext()) {
            for (C1032 c1032 : ((C0657) it.next()).mo2696()) {
                if (EnumC15657.STATIC.m36866(c1032.mo3567()) && c1032.equals(this.f20721)) {
                    arrayList.add(c1032);
                }
            }
        }
        arrayList.isEmpty();
        return arrayList;
    }

    @Override // l.AbstractC23599
    /* renamed from: ֫ */
    public final String mo1729() {
        return "CustomMethodDecryptor[" + this.f20721 + "]";
    }

    @Override // l.AbstractC16543
    /* renamed from: ֫ */
    public final String mo15148(int i, String str) {
        str.getClass();
        return (str.equals("Ljava/lang/CharSequence;") || str.equals("Ljava/lang/Object;")) ? "Ljava/lang/String;" : str;
    }
}

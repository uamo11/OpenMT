package l;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: M1ME */
/* renamed from: l.᩻ܿۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23835 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f77126 = new ArrayList();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1879 f77127;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CharSequence f77128;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CharSequence f77129;

    public C23835(InterfaceC1879 interfaceC1879, CharSequence charSequence, CharSequence charSequence2) {
        this.f77127 = interfaceC1879;
        this.f77128 = charSequence;
        this.f77129 = charSequence2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1879 m52531() {
        Iterator mo6220 = this.f77127.mo6218().f41655.mo6220();
        while (true) {
            boolean hasNext = mo6220.hasNext();
            ArrayList arrayList = this.f77126;
            CharSequence charSequence = this.f77129;
            CharSequence charSequence2 = this.f77128;
            if (hasNext) {
                C22340 c22340 = (C22340) mo6220.next();
                int i = c22340.f72397;
                int i2 = c22340.f72398;
                int i3 = c22340.f72395;
                int i4 = c22340.f72396;
                if (C21014.m47827(i, charSequence2)) {
                    i = C3374.m10309(i, i3, charSequence2);
                }
                if (C21014.m47827(i3 - 1, charSequence2)) {
                    i3 = C3374.m10305(i, i3, charSequence2);
                }
                if (C21014.m47827(i2, charSequence)) {
                    i2 = C3374.m10309(i2, i4, charSequence);
                }
                if (C21014.m47827(i4 - 1, charSequence)) {
                    i4 = C3374.m10305(i2, i4, charSequence);
                }
                C22340 c223402 = new C22340(i, i3, i2, i4);
                if (!c223402.m50072() && !C8313.m21915(charSequence2.subSequence(i, i3), charSequence.subSequence(i2, i4), EnumC5491.DEFAULT)) {
                    arrayList.add(c223402);
                }
            } else {
                return C23751.m52400(arrayList, charSequence2.length(), charSequence.length());
            }
        }
    }
}

package l;

import java.util.ArrayList;
import java.util.List;

/* compiled from: L1LP */
/* renamed from: l.ۘܿۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4080 extends AbstractC18897 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final CharSequence f13001;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CharSequence f13002;

    public C4080(InterfaceC6818 interfaceC6818, CharSequence charSequence, CharSequence charSequence2, ArrayList arrayList, ArrayList arrayList2) {
        super(arrayList, arrayList2, interfaceC6818);
        this.f13002 = charSequence;
        this.f13001 = charSequence2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m12275(CharSequence charSequence, List list, int i, int i2, boolean z) {
        InterfaceC18191 interfaceC18191;
        InterfaceC18191 interfaceC181912;
        int i3 = 0;
        while (i3 < i2) {
            if (z) {
                int i4 = i + i3;
                interfaceC18191 = (InterfaceC18191) list.get(i4);
                interfaceC181912 = (InterfaceC18191) list.get(i4 + 1);
            } else {
                int i5 = i - i3;
                interfaceC18191 = (InterfaceC18191) list.get(i5 - 1);
                interfaceC181912 = (InterfaceC18191) list.get(i5);
            }
            i3++;
            if (m12276(charSequence, interfaceC18191, interfaceC181912)) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m12276(CharSequence charSequence, InterfaceC18191 interfaceC18191, InterfaceC18191 interfaceC181912) {
        if ((interfaceC18191 instanceof C14662) || (interfaceC181912 instanceof C14662)) {
            return true;
        }
        int mo18689 = interfaceC181912.mo18689();
        for (int mo18688 = interfaceC18191.mo18688(); mo18688 < mo18689; mo18688++) {
            if (C11250.m27828(charSequence.charAt(mo18688))) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC18897
    /* renamed from: ֫ */
    public final int mo8364(EnumC20224 enumC20224, int i, int i2, C22340 c22340, C22340 c223402) {
        List list = (List) enumC20224.m46467((Object) this.f59562, (Object) this.f59563);
        C11003.requireNonNull(list);
        CharSequence charSequence = (CharSequence) enumC20224.m46467(this.f13002, this.f13001);
        C11003.requireNonNull(charSequence);
        int m46474 = enumC20224.m46474(c223402.f72397, c223402.f72398);
        int i3 = m46474 - 1;
        if (!m12276(charSequence, (InterfaceC18191) list.get(i3), (InterfaceC18191) list.get(m46474))) {
            int m12275 = m12275(charSequence, list, m46474, i, true);
            if (m12275 > 0) {
                return m12275;
            }
            int m122752 = m12275(charSequence, list, i3, i2, false);
            if (m122752 > 0) {
                return -m122752;
            }
        }
        return 0;
    }
}

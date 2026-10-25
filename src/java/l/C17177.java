package l;

import java.util.Iterator;
import java.util.List;

/* compiled from: Y4M0 */
/* renamed from: l.ܿۜۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17177 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int f52645 = (EnumC15657.STATIC.getValue() | EnumC15657.PRIVATE.getValue()) | EnumC15657.CONSTRUCTOR.getValue();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC18842 f52643 = new C16471();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC18842 f52644 = new C17883();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m40412(InterfaceC18444 interfaceC18444) {
        return (interfaceC18444.mo3567() & f52645) != 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m40411(List list, boolean z) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            char charAt = ((CharSequence) it.next()).charAt(0);
            i = (charAt == 'J' || charAt == 'D') ? i + 2 : i + 1;
        }
        return !z ? i + 1 : i;
    }
}

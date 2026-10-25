package l;

import java.lang.reflect.Type;

/* compiled from: 0AV8 */
/* renamed from: l.ۙ֫ܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4340 implements InterfaceC16602 {
    @Override // l.InterfaceC16602
    /* renamed from: ֫ */
    public final void mo3046(C5751 c5751, Object obj, Object obj2, Type type) {
        C6725 c6725 = c5751.f17696;
        if ((c6725.f20878 & EnumC20837.WriteEnumUsingToString.f67472) != 0) {
            String str = ((Enum) obj).toString();
            if ((c6725.f20878 & EnumC20837.UseSingleQuotes.f67472) != 0) {
                c6725.m18302(str);
                return;
            } else {
                c6725.m18298(str, (char) 0, false);
                return;
            }
        }
        c6725.writeInt(((Enum) obj).ordinal());
    }
}

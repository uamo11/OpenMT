package l;

import java.lang.reflect.Type;
import java.util.Collection;

/* compiled from: O878 */
/* renamed from: l.ۙܿۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4784 implements InterfaceC15387 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20328 f15172;

    public C4784(C20328 c20328) {
        this.f15172 = c20328;
    }

    @Override // l.InterfaceC15387
    /* renamed from: ֫ */
    public final AbstractC8333 mo8743(C12524 c12524, C16469 c16469) {
        Type m38779 = c16469.m38779();
        Class m38778 = c16469.m38778();
        if (!Collection.class.isAssignableFrom(m38778)) {
            return null;
        }
        Type m17129 = C6216.m17129(m38778, m38779);
        return new C20307(new C21634(c12524, c12524.m30728(C16469.m38776(m17129)), m17129), this.f15172.m46639(c16469, false));
    }
}

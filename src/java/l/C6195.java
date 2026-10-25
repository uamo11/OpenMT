package l;

/* compiled from: 47S6 */
/* renamed from: l.ۛܿۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C6195 implements InterfaceC15387 {
    @Override // l.InterfaceC15387
    /* renamed from: ֫ */
    public final AbstractC8333 mo8743(C12524 c12524, C16469 c16469) {
        Class m38778 = c16469.m38778();
        if (!Enum.class.isAssignableFrom(m38778) || m38778 == Enum.class) {
            return null;
        }
        if (!m38778.isEnum()) {
            m38778 = m38778.getSuperclass();
        }
        return new C11840(m38778);
    }
}

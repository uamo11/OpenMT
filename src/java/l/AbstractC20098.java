package l;

/* compiled from: F5I3 */
/* renamed from: l.᩶ۤ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC20098 implements InterfaceC15157 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC22214 f65094;

    /* renamed from: ֫ */
    public abstract boolean mo13434();

    public AbstractC20098(InterfaceC22214 interfaceC22214) {
        this.f65094 = interfaceC22214;
    }

    @Override // l.InterfaceC15157
    /* renamed from: ֫ */
    public final boolean mo35861(int i, CharSequence charSequence) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        InterfaceC22214 interfaceC22214 = this.f65094;
        if (interfaceC22214 == null) {
            return mo13434();
        }
        int mo48678 = interfaceC22214.mo48678(i, charSequence);
        if (mo48678 == 0) {
            return true;
        }
        if (mo48678 != 1) {
            return mo13434();
        }
        return false;
    }
}

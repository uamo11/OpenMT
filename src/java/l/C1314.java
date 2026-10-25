package l;

/* compiled from: M7HK */
/* renamed from: l.֨ᩴ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1314 implements InterfaceC18650, InterfaceC20767 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f4718;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f4719;

    public C1314(String str, String str2) {
        this.f4719 = str;
        this.f4718 = str2;
    }

    @Override // l.InterfaceC18650
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo4548() {
        return this.f4718;
    }

    @Override // l.InterfaceC18650
    public final String getPassword() {
        return this.f4719;
    }

    @Override // l.InterfaceC18650
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo4550() {
        return this.f4719 != null;
    }

    @Override // l.InterfaceC18650
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo4551() {
        return this.f4718 != null;
    }

    @Override // l.InterfaceC20767
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String[] mo4549(String[] strArr) {
        String str = this.f4719;
        if (str == null || strArr.length <= 0) {
            return null;
        }
        return new String[]{str};
    }
}

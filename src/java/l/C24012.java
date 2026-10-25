package l;

/* compiled from: 964V */
/* renamed from: l.᩻᩺ܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C24012 extends AbstractC7079 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f77820;

    public C24012(int i, int i2, InterfaceC17066 interfaceC17066) {
        super((int) C9902.m25004(i, i2, 0), interfaceC17066);
        this.f77820 = i2;
    }

    @Override // l.AbstractC7079
    /* renamed from: ֫ */
    public final void mo7067(int i) {
        char[] cArr;
        char[] cArr2;
        int i2 = this.f21774;
        StringBuilder sb = this.f21772;
        if (i2 != 0 && i2 % this.f77820 == 0) {
            sb.append('\n');
        }
        cArr = C9902.f29952;
        sb.append(cArr[i >>> 4]);
        cArr2 = C9902.f29952;
        sb.append(cArr2[i & 15]);
        sb.append(' ');
    }

    @Override // l.AbstractC7079
    public final String finish() {
        StringBuilder sb = this.f21772;
        C9902.m25006(sb);
        return sb.toString();
    }
}

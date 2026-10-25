package l;

/* compiled from: 44TS */
/* renamed from: l.ᩴۧܿ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18722 implements InterfaceC22747 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19428 f59186;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7744 f59187;

    @Override // l.InterfaceC22747
    /* renamed from: ֫ */
    public final void mo21388() {
    }

    public C18722(C19428 c19428, C7744 c7744) {
        this.f59186 = c19428;
        this.f59187 = c7744;
    }

    @Override // l.InterfaceC22747
    public final CharSequence getText() {
        return this.f59187;
    }

    @Override // l.InterfaceC22747
    public final int start(int i) {
        int[] iArr;
        iArr = this.f59186.f62849;
        return iArr[i * 2];
    }

    @Override // l.InterfaceC22747
    public final int end(int i) {
        int[] iArr;
        iArr = this.f59186.f62849;
        return iArr[(i * 2) + 1];
    }

    @Override // l.InterfaceC22747
    public final int groupCount() {
        int i;
        i = this.f59186.f62848;
        return i;
    }

    @Override // l.InterfaceC22747
    public final C11459 pattern() {
        C11459 c11459;
        c11459 = this.f59186.f62850;
        return c11459;
    }

    @Override // l.InterfaceC22747
    public final String group(int i) {
        int i2;
        if (i < 0) {
            return "";
        }
        i2 = this.f59186.f62848;
        if (i > i2) {
            return "";
        }
        int start = start(i);
        int end = end(i);
        return (start < 0 || end < 0) ? "" : this.f59187.subSequence(start, end);
    }
}

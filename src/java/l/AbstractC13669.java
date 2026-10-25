package l;

/* compiled from: A7FF */
/* renamed from: l.ܰ۟ۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC13669 implements InterfaceC1800 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC17734 f40749;

    /* renamed from: ֫ */
    public abstract String mo9436();

    @Override // l.InterfaceC1800
    /* renamed from: ۧ */
    public final /* synthetic */ boolean mo2829() {
        return true;
    }

    /* renamed from: ܽ */
    public abstract String mo9438();

    public AbstractC13669(EnumC17734 enumC17734) {
        this.f40749 = enumC17734;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m32836() {
        String mo9436 = mo9436();
        int length = mo9436.length();
        int i = 0;
        while (true) {
            EnumC17734 enumC17734 = this.f40749;
            if (i >= length) {
                return C4860.m14172(" { ", enumC17734.m41545(), " } ");
            }
            int codePointAt = mo9436.codePointAt(i);
            if (!Character.isWhitespace(codePointAt)) {
                return C20087.m46306(" { ", enumC17734.m41545(), " ", mo9436, " } ");
            }
            i += Character.charCount(codePointAt);
        }
    }

    public final String toString() {
        return C22870.m50967(this.f40749.m41547().m38466(), "_target ", mo9438());
    }
}

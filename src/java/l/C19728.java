package l;

import java.util.ArrayList;
import java.util.List;

/* compiled from: H528 */
/* renamed from: l.᩵᩸ۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19728 extends C2732 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public List[] f63746;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7338 f63747;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C18316 f63748;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f63749;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f63750;

    @Override // l.InterfaceC19043
    /* renamed from: ֫ */
    public final C11261 mo8631(String str, EnumC16715 enumC16715) {
        if (this.f63750 == null) {
            this.f63750 = new ArrayList(5);
        }
        C11261 c11261 = new C11261(str, enumC16715);
        this.f63750.add(c11261);
        return c11261;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19043 m45439(int i) {
        C7338 c7338 = this.f63747;
        if (this.f63746 == null) {
            this.f63746 = new List[c7338.m19704().length];
        }
        if (i >= this.f63746.length) {
            System.err.println("WARN: parameter out-of-range in " + c7338);
            return null;
        }
        return new C19022(this, i);
    }
}

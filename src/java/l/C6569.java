package l;

import java.util.Iterator;

/* compiled from: M605 */
/* renamed from: l.ۜۛ֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6569 implements Iterable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20266;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f20267;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f20268;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7980 f20269;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC10844 f20270;

    public C6569(C7980 c7980, AbstractC10844 abstractC10844, int i, Iterator it, boolean z) {
        this.f20269 = c7980;
        this.f20270 = abstractC10844;
        this.f20266 = i;
        this.f20268 = it;
        this.f20267 = z;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i;
        InterfaceC13848 mo5672 = this.f20270.mo5672();
        C7980 c7980 = this.f20269;
        AbstractC15781 m37191 = AbstractC15781.m37191(c7980.f24648, this.f20266);
        C12918 c12918 = c7980.f24648;
        i = c7980.f24644;
        return new C23502(this, c12918, i, m37191, mo5672);
    }
}

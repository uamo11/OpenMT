package l;

import android.text.style.RelativeSizeSpan;

/* compiled from: A924 */
/* renamed from: l.֡᩻ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0743 extends C6986 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20500 f2792;

    public C0743(C20500 c20500) {
        this.f2792 = c20500;
    }

    @Override // l.C6986, l.InterfaceC22508
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2859(InterfaceC3458 interfaceC3458, AbstractC0197 abstractC0197) {
        if (interfaceC3458.length() > 0) {
            interfaceC3458.mo10589();
            float mo19821 = this.f2792.mo19821(abstractC0197);
            C17820 builder = interfaceC3458.builder();
            int length = interfaceC3458.length();
            builder.setSpan(new RelativeSizeSpan(mo19821), length - 1, length, 33);
        }
    }
}

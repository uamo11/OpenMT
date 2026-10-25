package l;

import java.util.Iterator;

/* compiled from: C2RY */
/* renamed from: l.ۘ᩻ۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4269 implements Iterable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f13812;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC18380 f13813;

    public C4269(Iterable iterable, InterfaceC18380 interfaceC18380) {
        this.f13812 = iterable;
        this.f13813 = interfaceC18380;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2858(this, this.f13812.iterator());
    }
}

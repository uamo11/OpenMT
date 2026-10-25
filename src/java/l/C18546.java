package l;

import java.util.Iterator;

/* compiled from: V9PU */
/* renamed from: l.ᩴۚۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18546 extends C15016 {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21368 f57476;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18546(C21368 c21368) {
        super(c21368);
        this.f57476 = c21368;
    }

    @Override // l.C15016, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C3729(this.f57476);
    }
}

package l;

import java.util.Iterator;
import java.util.Set;

/* compiled from: P7M1 */
/* renamed from: l.ۚۘ֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5096 implements Iterable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f15979;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f15980;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7814 f15981;

    public /* synthetic */ C5096(C19914 c19914, Iterable iterable, C7814 c7814, Set set) {
        this.f15980 = iterable;
        this.f15981 = c7814;
        this.f15979 = set;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0862(this.f15980, this.f15981, this.f15979);
    }
}

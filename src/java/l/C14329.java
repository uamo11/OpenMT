package l;

import java.util.AbstractList;

/* compiled from: M605 */
/* renamed from: l.ܳۛ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14329 extends AbstractList {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43216;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7980 f43217;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43218;

    public C14329(C7980 c7980, int i, int i2) {
        this.f43217 = c7980;
        this.f43218 = i;
        this.f43216 = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        C12918 c12918 = this.f43217.f24648;
        return c12918.m31401(c12918.m31418().m11936((i * 2) + this.f43218 + 4));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f43216;
    }
}

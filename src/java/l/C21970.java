package l;

import java.util.Collection;
import java.util.List;

/* compiled from: 97QO */
/* renamed from: l.᩹֫ۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21970 implements InterfaceC21438 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21265 f70364;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f70365;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f70366;

    public C21970(List list, C21265 c21265, List list2) {
        this.f70366 = AbstractC14545.copyOf((Collection) list);
        this.f70364 = c21265;
        this.f70365 = AbstractC14545.copyOf((Collection) list2);
    }

    @Override // l.InterfaceC21438
    /* renamed from: ֫ */
    public final InterfaceC15086 mo48557() {
        return this.f70364;
    }

    @Override // l.InterfaceC21438
    /* renamed from: ֫ */
    public final C21265 mo48557() {
        return this.f70364;
    }

    @Override // l.InterfaceC21438
    /* renamed from: ۧ */
    public final AbstractC14545 mo48558() {
        return this.f70366;
    }

    @Override // l.InterfaceC21438
    /* renamed from: ܽ */
    public final AbstractC14545 mo48559() {
        return this.f70365;
    }

    public final String toString() {
        C8964 m37871 = C16018.m37871(this);
        m37871.m23110(this.f70364, "tok");
        m37871.m23110(this.f70366, "toksBefore");
        m37871.m23110(this.f70365, "toksAfter");
        return m37871.toString();
    }
}

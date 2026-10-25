package l;

import java.util.Collection;

/* compiled from: 0C0V */
/* renamed from: l.ۧᩳᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public interface InterfaceC11169 extends Collection, InterfaceC0584 {
    boolean add(float f);

    @Override // java.util.Collection, l.InterfaceC11169
    @Deprecated
    boolean contains(Object obj);

    @Override // java.util.Collection, java.lang.Iterable, l.InterfaceC0584
    InterfaceC1290 iterator();

    @Override // l.InterfaceC11169, l.InterfaceC1144
    @Deprecated
    /* renamed from: parallelStream */
    InterfaceC17664 mo42463parallelStream();

    @Override // java.util.Collection, l.InterfaceC11169
    @Deprecated
    boolean remove(Object obj);

    @Override // java.util.Collection, java.lang.Iterable
    InterfaceC16791 spliterator();

    @Override // l.InterfaceC11169, l.InterfaceC1144
    @Deprecated
    /* renamed from: stream */
    InterfaceC17664 mo42464stream();

    /* renamed from: ֫ */
    boolean mo12231(InterfaceC23162 interfaceC23162);

    @Deprecated
    /* renamed from: ۧ */
    boolean mo12232(Float f);

    /* renamed from: ܳ */
    boolean mo17038(float f);

    /* renamed from: ܿ */
    boolean mo4106(float f);
}

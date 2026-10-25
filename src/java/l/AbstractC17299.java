package l;

import java.util.Comparator;

/* compiled from: 17QI */
/* renamed from: l.ܿۧۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC17299 implements Comparable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f53000 = 0;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Comparator f53001 = C8200.comparingInt(new C16593());

    /* renamed from: ֫ */
    public abstract InterfaceC22900 mo26811();

    /* renamed from: ۧ */
    public abstract EnumC18005 mo26812();

    /* renamed from: ܿ */
    public abstract InterfaceC15086 mo38472();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return f53001.compare(this, (AbstractC17299) obj);
    }
}

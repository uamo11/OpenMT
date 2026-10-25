package l;

import java.util.List;
import java.util.Set;

/* compiled from: Z5Z9 */
/* renamed from: l.ۧ۟֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC10844 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC10844 f32593 = new C10322();

    /* renamed from: ֫ */
    public abstract Set mo5671();

    /* renamed from: ۧ */
    public abstract InterfaceC13848 mo5672();

    /* renamed from: ܽ */
    public abstract InterfaceC13848 mo5673();

    /* renamed from: ᩳ */
    public abstract InterfaceC13848 mo5674();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC10844 m27108(C12918 c12918, int i) {
        if (i == 0) {
            return f32593;
        }
        return new C1671(c12918, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Set m27106(C12918 c12918, int i) {
        if (i != 0) {
            return new C6088(c12918, i, c12918.m31418().mo11935(i));
        }
        return AbstractC6079.of();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static List m27107(C12918 c12918, int i) {
        if (i > 0) {
            return new C11733(c12918, i, c12918.m31418().mo11935(i));
        }
        return AbstractC14545.of();
    }
}

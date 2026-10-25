package l;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: R9OM */
/* renamed from: l.ᩳۘۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C17798 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C17798 f54419 = new C17798(0);

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static volatile C17798 f54420;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Map f54421;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17798 m41731() {
        C17798 c17798;
        C17798 c177982 = f54420;
        if (c177982 != null) {
            return c177982;
        }
        synchronized (C17798.class) {
            c17798 = f54420;
            if (c17798 == null) {
                Class cls = C10743.f32364;
                C17798 c177983 = null;
                if (cls != null) {
                    try {
                        c177983 = (C17798) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                    } catch (Exception unused) {
                    }
                }
                c17798 = c177983 != null ? c177983 : f54419;
                f54420 = c17798;
            }
        }
        return c17798;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1298 m41732(int i, InterfaceC8522 interfaceC8522) {
        return (C1298) this.f54421.get(new C16386(i, interfaceC8522));
    }

    public C17798() {
        this.f54421 = new HashMap();
    }

    public C17798(C17798 c17798) {
        if (c17798 == f54419) {
            this.f54421 = Collections.EMPTY_MAP;
        } else {
            this.f54421 = C20195.unmodifiableMap(c17798.f54421);
        }
    }

    public C17798(int i) {
        this.f54421 = Collections.EMPTY_MAP;
    }
}

package l;

import java.util.HashMap;

/* compiled from: K66W */
/* renamed from: l.ۗ֨۠, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2903 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f9244 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f9243 = new HashMap();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f9245 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8841(C4314 c4314, Object obj) {
        if (obj instanceof InterfaceC19837) {
            throw new AssertionError("T extends Context.Factory");
        }
        HashMap hashMap = this.f9244;
        if (hashMap != null) {
            Object put = hashMap.put(c4314, obj);
            if (put != null && !(put instanceof InterfaceC19837) && put != obj && obj != null) {
                throw new AssertionError("duplicate context value");
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m8837(Class cls) {
        return m8838(m8843(cls));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8839(Class cls, Object obj) {
        m8841(m8843(cls), obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8840(Class cls, InterfaceC19837 interfaceC19837) {
        m8842(m8843(cls), interfaceC19837);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m8838(C4314 c4314) {
        HashMap hashMap = this.f9244;
        if (hashMap != null) {
            Object obj = hashMap.get(c4314);
            if (!(obj instanceof InterfaceC19837)) {
                return obj;
            }
            Object mo12282 = ((InterfaceC19837) obj).mo12282(this);
            if (mo12282 instanceof InterfaceC19837) {
                throw new AssertionError("T extends Context.Factory");
            }
            C12171.m29642(hashMap.get(c4314) == mo12282);
            return mo12282;
        }
        throw new IllegalStateException();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8842(C4314 c4314, InterfaceC19837 interfaceC19837) {
        HashMap hashMap = this.f9244;
        if (hashMap != null) {
            if (hashMap.put(c4314, interfaceC19837) != null) {
                throw new AssertionError("duplicate context value");
            }
            HashMap hashMap2 = this.f9243;
            if (hashMap2 != null) {
                hashMap2.put(c4314, interfaceC19837);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C4314 m8843(Class cls) {
        HashMap hashMap = this.f9245;
        if (hashMap != null) {
            C4314 c4314 = (C4314) hashMap.get(cls);
            if (c4314 != null) {
                return c4314;
            }
            C4314 c43142 = new C4314();
            hashMap.put(cls, c43142);
            return c43142;
        }
        throw new IllegalStateException();
    }
}

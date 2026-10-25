package l;

import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: V3XC */
/* renamed from: l.᩹ۗۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22016 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TreeMap f70570 = new TreeMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f70571 = new ConcurrentMapC10942();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC11606 f70572 = C7372.f22644;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49535(C2966 c2966) {
        this.f70570.put(c2966.m45794(), c2966);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m49538(String str) {
        return this.f70570.containsKey(str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC19900 m49539(String str) {
        return (AbstractC19900) this.f70570.get(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49537(InterfaceC8898 interfaceC8898) {
        Iterator it = this.f70570.values().iterator();
        while (it.hasNext()) {
            ((AbstractC19900) it.next()).mo9073(interfaceC8898);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49536(C5961 c5961) {
        this.f70572 = c5961;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC11606 m49534() {
        return this.f70572;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m49540(String str) {
        if (str == null) {
            return null;
        }
        ConcurrentMapC10942 concurrentMapC10942 = this.f70571;
        String str2 = (String) concurrentMapC10942.get(str);
        if (str2 != null) {
            return str2;
        }
        String str3 = (String) concurrentMapC10942.putIfAbsent(str, str);
        return str3 == null ? str : str3;
    }
}

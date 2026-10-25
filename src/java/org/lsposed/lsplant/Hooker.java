package org.lsposed.lsplant;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import l.InterfaceC23277;

/* loaded from: classes2.dex */
public class Hooker {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Method f77898;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Method f77899;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC23277 f77900;

    private native boolean check();

    private native Method doHook(Member member, Method method);

    private native boolean doUnhook(Member member);

    static {
        try {
            System.loadLibrary("hook");
            f77898 = Hooker.class.getDeclaredMethod("֫", Object[].class);
        } catch (Throwable unused) {
            f77898 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object m52898(Object[] objArr) {
        return this.f77900.mo4063(this.f77899, objArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52897(Method method, InterfaceC23277 interfaceC23277) {
        Method doHook;
        Method method2 = f77898;
        if (method2 == null) {
            return;
        }
        Hooker hooker = new Hooker();
        if (hooker.check() && (doHook = hooker.doHook(method, method2)) != null) {
            hooker.f77899 = doHook;
            hooker.f77900 = interfaceC23277;
        }
    }
}

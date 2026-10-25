package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.net.ssl.SSLSocket;

/* compiled from: N4E9 */
/* renamed from: l.ۘܽ֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4055 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f12879;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Class[] f12880;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Class f12881;

    public C4055(Class cls, String str, Class... clsArr) {
        this.f12881 = cls;
        this.f12879 = str;
        this.f12880 = clsArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m12177(SSLSocket sSLSocket) {
        return m12174(sSLSocket.getClass()) != null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12176(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method m12174 = m12174(sSLSocket.getClass());
            if (m12174 == null) {
                return;
            }
            try {
                m12174.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m12175(Object obj, Object... objArr) {
        Method m12174 = m12174(obj.getClass());
        if (m12174 == null) {
            throw new AssertionError("Method " + this.f12879 + " not supported for object " + obj);
        }
        try {
            return m12174.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + m12174);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        if ((r4.getModifiers() & 1) == 0) goto L9;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.reflect.Method m12174(java.lang.Class r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.f12879
            java.lang.Class[] r1 = r3.f12880
            r2 = 0
            java.lang.reflect.Method r4 = r4.getMethod(r0, r1)     // Catch: java.lang.NoSuchMethodException -> L14
            int r0 = r4.getModifiers()     // Catch: java.lang.NoSuchMethodException -> L12
            r0 = r0 & 1
            if (r0 != 0) goto L15
            goto L14
        L12:
            goto L15
        L14:
            r4 = r2
        L15:
            if (r4 == 0) goto L26
            java.lang.Class r0 = r3.f12881
            if (r0 == 0) goto L26
            java.lang.Class r1 = r4.getReturnType()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L26
            goto L27
        L26:
            r2 = r4
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4055.m12174(java.lang.Class):java.lang.reflect.Method");
    }
}

package l;

import com.alipay.sdk.m.p.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: I4F2 */
/* renamed from: l.ܳܽ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14637 extends AbstractC1232 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Method f44753;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f44754;

    public final int hashCode() {
        return 0;
    }

    public C14637(Object obj, Method method) {
        this.f44754 = obj;
        this.f44753 = method;
    }

    @Override // l.AbstractC1232
    /* renamed from: ֫ */
    public final List mo2244(String str, List list) {
        try {
            return (List) this.f44753.invoke(this.f44754, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), d.a, str);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof C14637;
    }
}

package com.alipay.android.phone.mrpc.core;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.ResetCookie;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class aa {
    public static final ThreadLocal a = new ThreadLocal();
    public static final ThreadLocal b = new ThreadLocal();
    public byte c = 0;
    public AtomicInteger d = new AtomicInteger();
    public y e;

    public aa(y yVar) {
        this.e = yVar;
    }

    private void a(Object obj, Class cls, Method method, Object[] objArr, Annotation[] annotationArr) {
    }

    private void a(Object obj, byte[] bArr, Class cls, Method method, Object[] objArr, Annotation[] annotationArr) {
    }

    private void a(Object obj, byte[] bArr, Class cls, Method method, Object[] objArr, Annotation[] annotationArr, RpcException rpcException) {
        throw rpcException;
    }

    private byte[] a(Method method, Object[] objArr, String str, int i, boolean z) {
        com.alipay.android.phone.mrpc.core.a.f a2 = a(i, str, objArr);
        ThreadLocal threadLocal = b;
        if (threadLocal.get() != null) {
            a2.a(threadLocal.get());
        }
        byte[] bArr = (byte[]) a(method, i, str, a2.a(), z).a();
        threadLocal.set(null);
        return bArr;
    }

    public com.alipay.android.phone.mrpc.core.a.c a(Type type, byte[] bArr) {
        return new com.alipay.android.phone.mrpc.core.a.d(type, bArr);
    }

    public com.alipay.android.phone.mrpc.core.a.f a(int i, String str, Object[] objArr) {
        return new com.alipay.android.phone.mrpc.core.a.e(i, str, objArr);
    }

    public w a(Method method, int i, String str, byte[] bArr, boolean z) {
        return new j(this.e.a(), method, i, str, bArr, z);
    }

    public Object a(Object obj, Class cls, Method method, Object[] objArr) {
        byte[] bArr;
        if (ac.a()) {
            throw new IllegalThreadStateException("can't in main thread call rpc .");
        }
        OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
        boolean z = method.getAnnotation(ResetCookie.class) != null;
        Type genericReturnType = method.getGenericReturnType();
        Annotation[] annotations = method.getAnnotations();
        ThreadLocal threadLocal = a;
        byte[] bArr2 = null;
        threadLocal.set(null);
        b.set(null);
        if (operationType == null) {
            throw new IllegalStateException("OperationType must be set.");
        }
        String value = operationType.value();
        int incrementAndGet = this.d.incrementAndGet();
        a(obj, cls, method, objArr, annotations);
        try {
            if (this.c == 0) {
                bArr2 = a(method, objArr, value, incrementAndGet, z);
                Object a2 = a(genericReturnType, bArr2).a();
                if (genericReturnType != Void.TYPE) {
                    threadLocal.set(a2);
                }
            }
            bArr = bArr2;
        } catch (RpcException e) {
            e.setOperationType(value);
            bArr = bArr2;
            a(obj, bArr, cls, method, objArr, annotations, e);
        }
        a(obj, bArr, cls, method, objArr, annotations);
        return a.get();
    }
}

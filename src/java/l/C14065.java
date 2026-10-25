package l;

import android.os.Parcelable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: 046D */
/* renamed from: l.ܰ᩷ۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C14065 implements InvocationHandler {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Parcelable.Creator f42491;

    static {
        ApplicationC12518.m30701(109);
    }

    @Override // java.lang.reflect.InvocationHandler
    public native Object invoke(Object obj, Method method, Object[] objArr);

    public C14065(Parcelable.Creator creator) {
        this.f42491 = creator;
    }
}

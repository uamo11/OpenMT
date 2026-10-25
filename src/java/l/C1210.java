package l;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: J62F */
/* renamed from: l.֨ܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1210 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Field f4357;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Method f4358;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Field f4359;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Field f4360;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Field f4361;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final boolean f4362;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    static {
        /*
            r0 = 1
            r1 = 0
            r2 = 0
            java.lang.String r3 = "android.graphics.Insets"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
            java.lang.String r5 = "getOpticalInsets"
            java.lang.reflect.Method r4 = r4.getMethod(r5, r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r5 = "left"
            java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r6 = "top"
            java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r7 = "right"
            java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r8 = "bottom"
            java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L31
            r8 = 1
            goto L33
        L2b:
            r7 = r1
            goto L31
        L2d:
            r4 = r1
        L2e:
            r5 = r1
        L2f:
            r6 = r1
            r7 = r6
        L31:
            r8 = 0
            r3 = r1
        L33:
            if (r8 == 0) goto L42
            l.C1210.f4358 = r4
            l.C1210.f4360 = r5
            l.C1210.f4359 = r6
            l.C1210.f4361 = r7
            l.C1210.f4357 = r3
            l.C1210.f4362 = r0
            goto L4e
        L42:
            l.C1210.f4358 = r1
            l.C1210.f4360 = r1
            l.C1210.f4359 = r1
            l.C1210.f4361 = r1
            l.C1210.f4357 = r1
            l.C1210.f4362 = r2
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1210.<clinit>():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Rect m4050(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29 && f4362) {
            try {
                Object invoke = f4358.invoke(drawable, null);
                if (invoke != null) {
                    return new Rect(f4360.getInt(invoke), f4359.getInt(invoke), f4361.getInt(invoke), f4357.getInt(invoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return C15320.f46973;
    }
}

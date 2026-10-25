package l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* compiled from: Z1XI */
/* renamed from: l.᩸ۚۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21374 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static WeakReference f68858;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Toast f68859;

    public C21374(Toast toast) {
        this.f68859 = toast;
        if (Build.VERSION.SDK_INT == 25) {
            try {
                Field declaredField = Toast.class.getDeclaredField("mTN");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(toast);
                Field declaredField2 = obj.getClass().getDeclaredField("mHandler");
                declaredField2.setAccessible(true);
                declaredField2.set(obj, new HandlerC15022((Handler) declaredField2.get(obj)));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21374 m48459(CharSequence charSequence) {
        C21374 m48458 = m48458(0, charSequence);
        m48458.m48468();
        return m48458;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r5.length() > 60) goto L17;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m48460(java.lang.String r5) {
        /*
            java.lang.String r0 = "\\w"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r0.matcher(r5)
            r1 = 0
            r2 = 0
        Lc:
            boolean r3 = r0.find()
            if (r3 == 0) goto L15
            int r2 = r2 + 1
            goto Lc
        L15:
            r0 = 40
            if (r2 <= r0) goto L1a
            goto L39
        L1a:
            java.lang.String r2 = "[\\u4e00-\\u9fa5]"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.util.regex.Matcher r2 = r2.matcher(r5)
            r3 = 0
        L25:
            boolean r4 = r2.find()
            if (r4 == 0) goto L2e
            int r3 = r3 + 1
            goto L25
        L2e:
            if (r3 <= r0) goto L31
            goto L39
        L31:
            int r0 = r5.length()
            r2 = 60
            if (r0 <= r2) goto L3a
        L39:
            r1 = 1
        L3a:
            l.᩸ۚۢ r5 = m48458(r1, r5)
            r5.m48468()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21374.m48460(java.lang.String):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21374 m48457(int i) {
        C21374 m48462 = m48462(i, 0);
        m48462.m48468();
        return m48462;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m48464(CharSequence charSequence) {
        m48458(1, charSequence).m48468();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m48463(int i) {
        m48462(i, 1).m48468();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21374 m48458(int i, CharSequence charSequence) {
        Toast makeText;
        try {
            makeText = Toast.makeText(C4925.m14335(), "", i);
            makeText.setText(charSequence);
        } catch (RuntimeException unused) {
            makeText = Toast.makeText(C4925.m14335(), charSequence, i);
        }
        return new C21374(makeText);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C21374 m48462(int i, int i2) {
        Toast makeText;
        try {
            makeText = Toast.makeText(C4925.m14335(), "", i2);
            makeText.setText(i);
        } catch (RuntimeException unused) {
            makeText = Toast.makeText(C4925.m14335(), i, i2);
        }
        return new C21374(makeText);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m48465() {
        WeakReference weakReference = f68858;
        Toast toast = null;
        if (weakReference != null) {
            Toast toast2 = (Toast) weakReference.get();
            f68858 = null;
            toast = toast2;
        }
        if (toast != null) {
            try {
                toast.cancel();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48468() {
        RunnableC7968 runnableC7968 = new RunnableC7968(0, this);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnableC7968.run();
        } else {
            C4925.m14315(runnableC7968);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48461(C21374 c21374) {
        Toast toast = c21374.f68859;
        m48465();
        try {
            toast.show();
            f68858 = new WeakReference(toast);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48467(int i, int i2) {
        this.f68859.setGravity(i, 0, i2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48466() {
        try {
            this.f68859.cancel();
        } catch (Throwable unused) {
        }
    }
}

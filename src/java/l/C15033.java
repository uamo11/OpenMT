package l;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import bin.mt.plus.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: C23A */
/* renamed from: l.ܶۛ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15033 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f45814;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Method f45815;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean f45816;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Field f45817;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m35557(View view, KeyEvent keyEvent) {
        int i = C17648.f53953;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        int i2 = C18354.f57033;
        C18354 c18354 = (C18354) view.getTag(R.id.MT_Protector_res_0x7f0a05b4);
        if (c18354 == null) {
            c18354 = new C18354();
            view.setTag(R.id.MT_Protector_res_0x7f0a05b4, c18354);
        }
        return c18354.m42776(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x012a, code lost:
    
        if (r10 == false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m35558(l.InterfaceC7979 r9, android.view.View r10, android.view.Window.Callback r11, android.view.KeyEvent r12) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15033.m35558(l.۠ۛ, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }
}

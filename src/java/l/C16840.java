package l;

import java.util.HashSet;

/* compiled from: R8MQ */
/* renamed from: l.ܽ᩵֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16840 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashSet f51694 = new HashSet();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String f51695 = "media3.common";

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized String m39614() {
        String str;
        synchronized (C16840.class) {
            str = f51695;
        }
        return str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m39615(String str) {
        synchronized (C16840.class) {
            if (f51694.add(str)) {
                f51695 += ", " + str;
            }
        }
    }
}

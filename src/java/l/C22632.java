package l;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: D8D9 */
/* renamed from: l.᩺֡֫, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22632 {
    @Pure
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50631(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @Pure
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50630(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    @Pure
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50627(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Pure
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m50634(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    @Pure
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m50633(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m50632(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50628(Object obj) {
        obj.getClass();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50629(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}

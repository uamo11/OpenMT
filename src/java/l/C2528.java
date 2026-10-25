package l;

import android.graphics.Typeface;
import android.util.LruCache;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: 28V5 */
/* renamed from: l.ۖ۫ۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2528 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final int f8015;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final LruCache f8016;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f8017 = 0;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final char[] f8018;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f8019;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15932 f8020;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AtomicIntegerArray f8021;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Typeface f8022;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m8036(char c) {
        return ('a' > c || c > 'z') ? ('A' > c || c > 'Z') ? c + 4 : c - '\'' : c - 'a';
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized C2528 m8037(Typeface typeface) {
        C2528 c2528;
        synchronized (C2528.class) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            LruCache lruCache = f8016;
            c2528 = (C2528) lruCache.get(typeface);
            if (c2528 == null) {
                c2528 = new C2528(typeface);
                lruCache.put(typeface, c2528);
            }
        }
        return c2528;
    }

    static {
        char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        f8018 = charArray;
        f8015 = charArray.length;
        f8016 = new LruCache(8);
    }

    public C2528(Typeface typeface) {
        Typeface typeface2 = Typeface.MONOSPACE;
        C15932 c15932 = typeface2.equals(typeface) ? null : new C15932(typeface);
        int i = f8015;
        this.f8021 = new AtomicIntegerArray(i * i);
        this.f8022 = typeface;
        this.f8020 = c15932;
        this.f8019 = typeface2.equals(typeface);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m8040(char c, char c2) {
        if (!this.f8019) {
            int i = ((('a' > c || c > 'z') ? ('A' > c || c > 'Z') ? c + 4 : c - '\'' : c - 'a') * f8015) + (('a' > c2 || c2 > 'z') ? ('A' > c2 || c2 > 'Z') ? c2 + 4 : c2 - '\'' : c2 - 'a');
            AtomicIntegerArray atomicIntegerArray = this.f8021;
            int i2 = atomicIntegerArray.get(i);
            if (i2 == 0) {
                int i3 = 2;
                try {
                    if (this.f8020.m37709(c, c2)) {
                        i3 = 1;
                    }
                } catch (RuntimeException unused) {
                }
                if (!atomicIntegerArray.compareAndSet(i, 0, i3)) {
                    i3 = atomicIntegerArray.get(i);
                }
                return i3 == 1;
            }
            if (i2 != 1) {
                return false;
            }
        }
        return true;
    }
}

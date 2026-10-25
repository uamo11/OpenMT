package l;

import java.io.Closeable;
import java.util.Arrays;

/* compiled from: 2AQI */
/* renamed from: l.֡ۛۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0225 implements Closeable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile int f1485;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object[] f1486;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f1487;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m1477(Object obj) {
        if (this.f1487) {
            return false;
        }
        if (this.f1485 < this.f1486.length) {
            synchronized (this) {
                int i = this.f1485;
                Object[] objArr = this.f1486;
                if (i < objArr.length) {
                    int i2 = this.f1485;
                    this.f1485 = i2 + 1;
                    objArr[i2] = obj;
                }
            }
            return true;
        }
        return false;
    }

    public C0225() {
        this((int) (C17615.f53826 * 1.5f));
    }

    public C0225(int i) {
        this.f1486 = new Object[i];
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object m1479() {
        if (this.f1485 > 0) {
            synchronized (this) {
                if (this.f1485 > 0) {
                    int i = this.f1485 - 1;
                    this.f1485 = i;
                    Object[] objArr = this.f1486;
                    Object obj = objArr[i];
                    objArr[i] = null;
                    return obj;
                }
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m1476() {
        return !this.f1487 && this.f1485 < this.f1486.length;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m1478() {
        synchronized (this) {
            Arrays.fill(this.f1486, (Object) null);
            this.f1485 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f1487 = true;
    }
}

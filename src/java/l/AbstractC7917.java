package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: YAH1 */
/* renamed from: l.۠ۘ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC7917 implements Iterator {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19913 f24507;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f24508;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C22029 f24509;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C22029 f24510;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract C22029 mo21200();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract C22029 mo21201(C22029 c22029);

    public AbstractC7917(C19913 c19913) {
        C0861 c0861;
        C0861 c08612;
        this.f24507 = c19913;
        c0861 = c19913.f64323;
        c0861.lock();
        try {
            C22029 mo21200 = mo21200();
            this.f24510 = mo21200;
            this.f24508 = mo21200 == null ? null : mo21200.f70619;
        } finally {
            c08612 = c19913.f64323;
            c08612.unlock();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24510 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0861 c0861;
        C0861 c08612;
        C22029 mo21201;
        Object obj;
        C22029 c22029 = this.f24510;
        if (c22029 == null) {
            throw new NoSuchElementException();
        }
        this.f24509 = c22029;
        Object obj2 = this.f24508;
        C19913 c19913 = this.f24507;
        c0861 = c19913.f64323;
        c0861.lock();
        try {
            C22029 c220292 = this.f24510;
            while (true) {
                mo21201 = mo21201(c220292);
                obj = null;
                if (mo21201 != null) {
                    if (mo21201.f70619 != null) {
                        break;
                    }
                    if (mo21201 == c220292) {
                        mo21201 = mo21200();
                        break;
                    }
                    c220292 = mo21201;
                } else {
                    mo21201 = null;
                    break;
                }
            }
            this.f24510 = mo21201;
            if (mo21201 != null) {
                obj = mo21201.f70619;
            }
            this.f24508 = obj;
            return obj2;
        } finally {
            c08612 = c19913.f64323;
            c08612.unlock();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C0861 c0861;
        C0861 c08612;
        C22029 c22029 = this.f24509;
        if (c22029 == null) {
            throw new IllegalStateException();
        }
        this.f24509 = null;
        C19913 c19913 = this.f24507;
        c0861 = c19913.f64323;
        c0861.lock();
        try {
            if (c22029.f70619 != null) {
                c19913.m45810(c22029);
            }
        } finally {
            c08612 = c19913.f64323;
            c08612.unlock();
        }
    }
}

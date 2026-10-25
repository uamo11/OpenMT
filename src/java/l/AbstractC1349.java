package l;

import java.util.NoSuchElementException;

/* compiled from: Q64S */
/* renamed from: l.֨᩶ܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC1349 extends AbstractC20151 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object f4899;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public EnumC5583 f4900 = EnumC5583.NOT_READY;

    /* renamed from: ֫ */
    public abstract Object mo1890();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m4715() {
        this.f4900 = EnumC5583.DONE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        EnumC5583 enumC5583 = this.f4900;
        EnumC5583 enumC55832 = EnumC5583.FAILED;
        C4025.m12116(enumC5583 != enumC55832);
        int ordinal = this.f4900.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal != 2) {
            this.f4900 = enumC55832;
            this.f4899 = mo1890();
            if (this.f4900 != EnumC5583.DONE) {
                this.f4900 = EnumC5583.READY;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f4900 = EnumC5583.NOT_READY;
        Object obj = this.f4899;
        this.f4899 = null;
        return obj;
    }
}

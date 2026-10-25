package l;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;

/* compiled from: L5VS */
/* renamed from: l.ۨ᩺ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC12014 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final DataSetObservable f35966 = new DataSetObservable();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public DataSetObserver f35967;

    /* renamed from: ֫ */
    public CharSequence mo11912(int i) {
        return null;
    }

    /* renamed from: ֫ */
    public void mo13214() {
    }

    /* renamed from: ֫ */
    public void mo13215(Object obj) {
    }

    /* renamed from: ֫ */
    public void mo13216(C0452 c0452) {
    }

    /* renamed from: ֫ */
    public abstract boolean mo11915(View view, Object obj);

    /* renamed from: ۧ */
    public abstract int mo11916();

    /* renamed from: ֫ */
    public Object mo11913(C0452 c0452, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    /* renamed from: ֫ */
    public void mo11914(C0452 c0452, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m29381() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f35967;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f35966.notifyChanged();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29379(DataSetObserver dataSetObserver) {
        this.f35966.registerObserver(dataSetObserver);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m29382(DataSetObserver dataSetObserver) {
        this.f35966.unregisterObserver(dataSetObserver);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29380(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f35967 = dataSetObserver;
        }
    }
}

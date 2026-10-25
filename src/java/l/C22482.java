package l;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: G58P */
/* renamed from: l.᩹᩵, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22482 implements Iterator, Map.Entry {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC4843 f72795;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f72797;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f72798 = false;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f72796 = -1;

    public C22482(AbstractC4843 abstractC4843) {
        this.f72795 = abstractC4843;
        this.f72797 = abstractC4843.mo12419() - 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f72796 < this.f72797;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f72796++;
        this.f72798 = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f72798) {
            throw new IllegalStateException();
        }
        this.f72795.mo12415(this.f72796);
        this.f72796--;
        this.f72797--;
        this.f72798 = false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (!this.f72798) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f72795.mo12412(this.f72796, 0);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (!this.f72798) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f72795.mo12412(this.f72796, 1);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!this.f72798) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.f72795.mo12413(this.f72796, obj);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f72798) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.f72796;
        AbstractC4843 abstractC4843 = this.f72795;
        Object mo12412 = abstractC4843.mo12412(i, 0);
        if (key != mo12412 && (key == null || !key.equals(mo12412))) {
            return false;
        }
        Object value = entry.getValue();
        Object mo124122 = abstractC4843.mo12412(this.f72796, 1);
        return value == mo124122 || (value != null && value.equals(mo124122));
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f72798) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.f72796;
        AbstractC4843 abstractC4843 = this.f72795;
        Object mo12412 = abstractC4843.mo12412(i, 0);
        Object mo124122 = abstractC4843.mo12412(this.f72796, 1);
        return (mo12412 == null ? 0 : mo12412.hashCode()) ^ (mo124122 != null ? mo124122.hashCode() : 0);
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}

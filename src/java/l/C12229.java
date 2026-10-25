package l;

import java.util.Arrays;

/* compiled from: AAYE */
/* renamed from: l.۫ۛ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C12229 {
    public volatile /* synthetic */ int _size = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC10113[] f36472;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29728(AbstractRunnableC3968 abstractRunnableC3968) {
        synchronized (this) {
            if (abstractRunnableC3968.m12006() != null) {
                m29726(abstractRunnableC3968.m12009());
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10113 m29730() {
        InterfaceC10113 m29725;
        synchronized (this) {
            m29725 = m29725();
        }
        return m29725;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10113 m29731() {
        InterfaceC10113 m29726;
        synchronized (this) {
            m29726 = this._size > 0 ? m29726(0) : null;
        }
        return m29726;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m29729() {
        return this._size == 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC10113 m29725() {
        InterfaceC10113[] interfaceC10113Arr = this.f36472;
        if (interfaceC10113Arr != null) {
            return interfaceC10113Arr[0];
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (((java.lang.Comparable) r5).compareTo(r6) < 0) goto L18;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.InterfaceC10113 m29726(int r8) {
        /*
            r7 = this;
            l.ۤۛ᩵[] r0 = r7.f36472
            l.C11233.m27799(r0)
            int r1 = r7._size
            r2 = -1
            int r1 = r1 + r2
            r7._size = r1
            int r1 = r7._size
            if (r8 >= r1) goto L73
            int r1 = r7._size
            r7.m29723(r8, r1)
            int r1 = r8 + (-1)
            int r1 = r1 / 2
            if (r8 <= 0) goto L33
            r3 = r0[r8]
            l.C11233.m27799(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            l.C11233.m27799(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L33
            r7.m29723(r8, r1)
            r7.m29724(r1)
            goto L73
        L33:
            int r1 = r8 * 2
            int r3 = r1 + 1
            int r4 = r7._size
            if (r3 < r4) goto L3c
            goto L73
        L3c:
            l.ۤۛ᩵[] r4 = r7.f36472
            l.C11233.m27799(r4)
            int r1 = r1 + 2
            int r5 = r7._size
            if (r1 >= r5) goto L5a
            r5 = r4[r1]
            l.C11233.m27799(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            r6 = r4[r3]
            l.C11233.m27799(r6)
            int r5 = r5.compareTo(r6)
            if (r5 >= 0) goto L5a
            goto L5b
        L5a:
            r1 = r3
        L5b:
            r3 = r4[r8]
            l.C11233.m27799(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r4[r1]
            l.C11233.m27799(r4)
            int r3 = r3.compareTo(r4)
            if (r3 > 0) goto L6e
            goto L73
        L6e:
            r7.m29723(r8, r1)
            r8 = r1
            goto L33
        L73:
            int r8 = r7._size
            r8 = r0[r8]
            l.C11233.m27799(r8)
            r1 = 0
            r8.mo12008(r1)
            r8.mo12007(r2)
            int r2 = r7._size
            r0[r2] = r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12229.m29726(int):l.ۤۛ᩵");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29727(AbstractRunnableC3968 abstractRunnableC3968) {
        abstractRunnableC3968.mo12008(this);
        InterfaceC10113[] interfaceC10113Arr = this.f36472;
        if (interfaceC10113Arr == null) {
            interfaceC10113Arr = new InterfaceC10113[4];
            this.f36472 = interfaceC10113Arr;
        } else if (this._size >= interfaceC10113Arr.length) {
            Object[] copyOf = Arrays.copyOf(interfaceC10113Arr, this._size * 2);
            C11233.m27803(copyOf, "copyOf(this, newSize)");
            interfaceC10113Arr = (InterfaceC10113[]) copyOf;
            this.f36472 = interfaceC10113Arr;
        }
        int i = this._size;
        this._size = i + 1;
        interfaceC10113Arr[i] = abstractRunnableC3968;
        abstractRunnableC3968.mo12007(i);
        m29724(i);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private final void m29724(int i) {
        while (i > 0) {
            InterfaceC10113[] interfaceC10113Arr = this.f36472;
            C11233.m27799(interfaceC10113Arr);
            int i2 = (i - 1) / 2;
            InterfaceC10113 interfaceC10113 = interfaceC10113Arr[i2];
            C11233.m27799(interfaceC10113);
            InterfaceC10113 interfaceC101132 = interfaceC10113Arr[i];
            C11233.m27799(interfaceC101132);
            if (((Comparable) interfaceC10113).compareTo(interfaceC101132) <= 0) {
                return;
            }
            m29723(i, i2);
            i = i2;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m29723(int i, int i2) {
        InterfaceC10113[] interfaceC10113Arr = this.f36472;
        C11233.m27799(interfaceC10113Arr);
        InterfaceC10113 interfaceC10113 = interfaceC10113Arr[i2];
        C11233.m27799(interfaceC10113);
        InterfaceC10113 interfaceC101132 = interfaceC10113Arr[i];
        C11233.m27799(interfaceC101132);
        interfaceC10113Arr[i] = interfaceC10113;
        interfaceC10113Arr[i2] = interfaceC101132;
        interfaceC10113.mo12007(i);
        interfaceC101132.mo12007(i2);
    }
}

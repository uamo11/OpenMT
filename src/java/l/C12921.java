package l;

import java.util.ArrayList;

/* compiled from: T9JB */
/* renamed from: l.۬ۛۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12921 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f38792 = new ArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31431(C23670 c23670, C0097 c0097) {
        c0097.m26096(2);
        byte m26095 = c0097.m26095();
        c0097.m26096(1);
        int m26099 = c0097.m26099();
        if (m26095 > 0) {
            for (int i = 0; i < m26095; i++) {
                c0097.m26099();
                c0097.m26096(4);
                m31429(c23670, c0097);
            }
            return;
        }
        if (m26099 > 0) {
            m31429(c23670, c0097);
        } else {
            if (m26099 != 0 || c0097.m26092() <= 0) {
                return;
            }
            c0097.m26096(1);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m31429(C23670 c23670, C0097 c0097) {
        long m52202 = c23670.m52202();
        long value = EnumC7462.STATUS_BUFFER_TOO_SMALL.getValue();
        ArrayList arrayList = this.f38792;
        if (m52202 == value) {
            C19978 c19978 = new C19978();
            c0097.m26082();
            arrayList.add(c19978);
        } else if (m52202 == EnumC7462.STATUS_STOPPED_ON_SYMLINK.getValue()) {
            C3044 c3044 = new C3044();
            C3044.m9297(c3044, c0097);
            arrayList.add(c3044);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m31430() {
        return this.f38792;
    }
}

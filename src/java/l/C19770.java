package l;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: 69DQ */
/* renamed from: l.᩵᩺ۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19770 extends AbstractC1424 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f63834;

    public C19770() {
        super(EnumC8480.SMB2_COMPRESSION_CAPABILITIES);
        this.f63834 = new ArrayList();
    }

    @Override // l.AbstractC1424
    /* renamed from: ᩳ */
    public final int mo2824(C0097 c0097) {
        ArrayList arrayList = this.f63834;
        if (arrayList == null) {
            throw new IllegalStateException("Cannot write a null compressionAlgorithms array");
        }
        c0097.m26086(arrayList.size());
        c0097.m1080();
        c0097.m1081();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c0097.m26086((int) ((EnumC3915) it.next()).getValue());
        }
        return (arrayList.size() * 2) + 8;
    }

    @Override // l.AbstractC1424
    /* renamed from: ۧ */
    public final void mo2823(C0097 c0097) {
        int m26100 = c0097.m26100();
        c0097.m26096(2);
        c0097.m26096(4);
        for (int i = 0; i < m26100; i++) {
            int m261002 = c0097.m26100();
            EnumC3915 enumC3915 = (EnumC3915) C15262.m36279(m261002, EnumC3915.class, null);
            if (enumC3915 == null) {
                throw new IllegalStateException(String.format("Unknown SMB3CompressionAlgorithm with value '%d'", Integer.valueOf(m261002)));
            }
            this.f63834.add(enumC3915);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList m45460() {
        return this.f63834;
    }
}

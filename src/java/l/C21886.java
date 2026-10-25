package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Q9F8 */
/* renamed from: l.᩸᩺ۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21886 extends AbstractC1424 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f70067;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f70068;

    public C21886() {
        super(EnumC8480.SMB2_PREAUTH_INTEGRITY_CAPABILITIES);
        this.f70067 = new ArrayList();
    }

    public C21886(byte[] bArr, List list) {
        super(EnumC8480.SMB2_PREAUTH_INTEGRITY_CAPABILITIES);
        this.f70067 = list;
        this.f70068 = (byte[]) bArr.clone();
    }

    @Override // l.AbstractC1424
    /* renamed from: ᩳ */
    public final int mo2824(C0097 c0097) {
        List list = this.f70067;
        if (list == null) {
            throw new IllegalStateException("There should be at least 1 hash algorithm provided");
        }
        if (this.f70068 == null) {
            throw new IllegalStateException("A salt should be provided");
        }
        c0097.m26086(list.size());
        c0097.m26086(this.f70068.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c0097.m26086((int) ((EnumC5326) it.next()).getValue());
        }
        byte[] bArr = this.f70068;
        c0097.m26077(bArr.length, bArr);
        return (list.size() * 2) + 4 + this.f70068.length;
    }

    @Override // l.AbstractC1424
    /* renamed from: ۧ */
    public final void mo2823(C0097 c0097) {
        int m26100 = c0097.m26100();
        int m261002 = c0097.m26100();
        for (int i = 0; i < m26100; i++) {
            int m261003 = c0097.m26100();
            EnumC5326 enumC5326 = (EnumC5326) C15262.m36279(m261003, EnumC5326.class, null);
            if (enumC5326 == null) {
                throw new IllegalStateException(String.format("Unknown SMB3HashAlgorithm with value '%d'", Integer.valueOf(m261003)));
            }
            this.f70067.add(enumC5326);
        }
        byte[] bArr = new byte[m261002];
        c0097.m26087(m261002, bArr);
        this.f70068 = bArr;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m49271() {
        return this.f70067;
    }
}

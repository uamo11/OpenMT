package l;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: R9DK */
/* renamed from: l.ۧ۫ۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10991 extends AbstractC3955 {
    @Override // l.AbstractC3955
    /* renamed from: ֫ */
    public final /* bridge */ /* synthetic */ AbstractC5366 mo1923(AbstractC11716 abstractC11716, byte[] bArr) {
        return m27304(bArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18046 m27304(byte[] bArr) {
        HashSet hashSet = new HashSet();
        try {
            C8894 c8894 = new C8894(this.f12580, bArr);
            try {
                Iterator it = c8894.iterator();
                while (it.hasNext()) {
                    hashSet.add((AbstractC5366) it.next());
                }
                c8894.close();
                return new C18046(hashSet, bArr);
            } finally {
            }
        } catch (IOException e) {
            throw new C2544(e, "Could not parse ASN.1 SET contents.", new Object[0]);
        }
    }
}

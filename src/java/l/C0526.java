package l;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: 64DG */
/* renamed from: l.֡ܽ֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0526 extends AbstractC1232 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC15342 f2186;

    public C0526(InterfaceC15342 interfaceC15342) {
        this.f2186 = interfaceC15342;
    }

    @Override // l.AbstractC1232
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List mo2244(String str, List list) {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) C18566.m43105(arrayList, 1);
            X509Certificate mo15566 = this.f2186.mo15566(x509Certificate);
            if (mo15566 == null) {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused) {
                        }
                    }
                }
                if (!z) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(mo15566)) {
                arrayList.add(mo15566);
            }
            if (mo15566.getIssuerDN().equals(mo15566.getSubjectDN())) {
                try {
                    mo15566.verify(mo15566.getPublicKey());
                    return arrayList;
                } catch (GeneralSecurityException unused2) {
                }
            }
            z = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final int hashCode() {
        return this.f2186.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0526) && ((C0526) obj).f2186.equals(this.f2186);
    }
}

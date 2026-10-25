package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: 18AW */
/* renamed from: l.ۛ۟ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5914 implements InterfaceC23094 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f18148;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7325 f18149;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IOException[] f18150;

    public C5914(C7325 c7325, HashMap hashMap, IOException[] iOExceptionArr) {
        this.f18149 = c7325;
        this.f18148 = hashMap;
        this.f18150 = iOExceptionArr;
    }

    @Override // l.InterfaceC23094
    /* renamed from: ֫ */
    public final void mo8530(InterfaceC17889 interfaceC17889, InputStream inputStream) {
        boolean m19667;
        InterfaceC11559 interfaceC11559;
        C0393 c0393;
        C15249 c15249;
        boolean z;
        C13674 c13674;
        HashSet hashSet;
        InterfaceC11559 interfaceC115592;
        InterfaceC11559 interfaceC115593;
        C15249 c152492;
        C15249 c152493;
        C5373 c5373 = (C5373) this.f18148.get(interfaceC17889);
        C11003.requireNonNull(c5373);
        C7325 c7325 = this.f18149;
        if (inputStream == null) {
            c152493 = c7325.f22508;
            c152493.m47715();
            return;
        }
        try {
            c7325.m19670(c5373);
            m19667 = c7325.m19667(c5373, interfaceC17889);
            if (!m19667) {
                interfaceC115592 = c7325.f22504;
                if (!((C10604) interfaceC115592).f31824.mo1526()) {
                    c7325.m19662(inputStream, interfaceC17889.getSize(), true);
                    interfaceC115593 = c7325.f22504;
                    if (!((C10604) interfaceC115593).f31824.mo1526()) {
                        c152492 = c7325.f22508;
                        c152492.m47708(c5373.m3913());
                    }
                }
                inputStream.close();
                return;
            }
            AbstractC15440 m3892 = c5373.m3892();
            m3892.m36494(inputStream, interfaceC17889.getSize(), new C10148(this));
            interfaceC11559 = c7325.f22504;
            if (((C10604) interfaceC11559).f31824.mo1526()) {
                m3892.mo27929();
                inputStream.close();
                return;
            }
            if (c5373.m3904() != null) {
                C17558 c17558 = new C17558();
                c17558.m41048(c5373.m3904());
                c17558.m41052(m3892);
            }
            c0393 = c7325.f22512;
            c0393.m1888(c5373.m3898(), m3892.getName());
            c15249 = c7325.f22508;
            c15249.m47708(c5373.m3913());
            C14463.m34554(c5373.m3900(), true);
            if (c5373.m3893() != null) {
                hashSet = c7325.f22509;
                hashSet.add((String) c5373.m3893());
            }
            z = c7325.f22505;
            if (z && c5373.m3887() > 0 && m3892.mo27912()) {
                c13674 = c7325.f22511;
                c13674.m32889(m3892, c5373.m3887());
            }
            inputStream.close();
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.InterfaceC23094
    /* renamed from: ֫ */
    public final boolean mo8531(IOException iOException) {
        this.f18150[0] = iOException;
        return false;
    }

    @Override // l.InterfaceC17066
    /* renamed from: ᩻ */
    public final boolean mo1526() {
        InterfaceC11559 interfaceC11559;
        interfaceC11559 = this.f18149.f22504;
        return ((C10604) interfaceC11559).mo1526();
    }
}

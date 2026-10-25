package l;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: V4E2 */
/* renamed from: l.ܰ᩺᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14136 {

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final String f42638;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final String f42639;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f42640;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f42641;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C10338 f42642;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13159 f42643;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f42644;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f42645;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f42646;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC14386 f42647;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f42648;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C10338 f42649;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33748(C8743 c8743, C18621 c18621) {
        if (!this.f42648.equals(c8743.f26640.toString()) || !this.f42644.equals(c8743.f26643)) {
            return false;
        }
        int i = C0799.f2925;
        for (String str : C0799.m3018(c18621.f57742)) {
            if (!C20032.m46183(this.f42642.m26141(str), c8743.f26641.m26141(str))) {
                return false;
            }
        }
        return true;
    }

    static {
        C18872.m43580().getClass();
        f42639 = "OkHttp-Sent-Millis";
        C18872.m43580().getClass();
        f42638 = "OkHttp-Received-Millis";
    }

    public C14136(InterfaceC1274 interfaceC1274) {
        EnumC0981 enumC0981;
        try {
            InterfaceC6171 m52567 = C23852.m52567(interfaceC1274);
            this.f42648 = m52567.mo12300();
            this.f42644 = m52567.mo12300();
            C12454 c12454 = new C12454();
            int m20810 = C7787.m20810(m52567);
            for (int i = 0; i < m20810; i++) {
                c12454.m30613(m52567.mo12300());
            }
            this.f42642 = new C10338(c12454);
            C21967 m49454 = C21967.m49454(m52567.mo12300());
            this.f42647 = m49454.f70362;
            this.f42640 = m49454.f70360;
            this.f42645 = m49454.f70361;
            C12454 c124542 = new C12454();
            int m208102 = C7787.m20810(m52567);
            for (int i2 = 0; i2 < m208102; i2++) {
                c124542.m30613(m52567.mo12300());
            }
            String str = f42639;
            String m30615 = c124542.m30615(str);
            String str2 = f42638;
            String m306152 = c124542.m30615(str2);
            c124542.m30617(str);
            c124542.m30617(str2);
            this.f42641 = m30615 != null ? Long.parseLong(m30615) : 0L;
            this.f42646 = m306152 != null ? Long.parseLong(m306152) : 0L;
            this.f42649 = new C10338(c124542);
            if (this.f42648.startsWith("https://")) {
                String mo12300 = m52567.mo12300();
                if (mo12300.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + mo12300 + "\"");
                }
                C20922 m47749 = C20922.m47749(m52567.mo12300());
                List m33744 = m33744(m52567);
                List m337442 = m33744(m52567);
                if (!m52567.mo12308()) {
                    enumC0981 = EnumC0981.m3446(m52567.mo12300());
                } else {
                    enumC0981 = EnumC0981.SSL_3_0;
                }
                this.f42643 = C13159.m31887(enumC0981, m47749, m33744, m337442);
            } else {
                this.f42643 = null;
            }
        } finally {
            interfaceC1274.close();
        }
    }

    public C14136(C18621 c18621) {
        C10338 c10338;
        C8743 c8743 = c18621.f57743;
        this.f42648 = c8743.f26640.toString();
        int i = C0799.f2925;
        C10338 c103382 = c18621.f57739.f57743.f26641;
        C10338 c103383 = c18621.f57742;
        Set m3018 = C0799.m3018(c103383);
        if (!m3018.isEmpty()) {
            C12454 c12454 = new C12454();
            int m26139 = c103382.m26139();
            for (int i2 = 0; i2 < m26139; i2++) {
                String m26136 = c103382.m26136(i2);
                if (m3018.contains(m26136)) {
                    c12454.m30614(m26136, c103382.m26140(i2));
                }
            }
            c10338 = new C10338(c12454);
        } else {
            c10338 = new C10338(new C12454());
        }
        this.f42642 = c10338;
        this.f42644 = c8743.f26643;
        this.f42647 = c18621.f57740;
        this.f42640 = c18621.f57736;
        this.f42645 = c18621.f57741;
        this.f42649 = c103383;
        this.f42643 = c18621.f57735;
        this.f42641 = c18621.f57738;
        this.f42646 = c18621.f57747;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33747(C13680 c13680) {
        InterfaceC10405 m52568 = C23852.m52568(c13680.m32917(0));
        String str = this.f42648;
        m52568.mo26251(str);
        m52568.writeByte(10);
        m52568.mo26251(this.f42644);
        m52568.writeByte(10);
        C10338 c10338 = this.f42642;
        m52568.mo26249(c10338.m26139());
        m52568.writeByte(10);
        int m26139 = c10338.m26139();
        for (int i = 0; i < m26139; i++) {
            m52568.mo26251(c10338.m26136(i));
            m52568.mo26251(": ");
            m52568.mo26251(c10338.m26140(i));
            m52568.writeByte(10);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f42647 == EnumC14386.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f42640);
        String str2 = this.f42645;
        if (str2 != null) {
            sb.append(' ');
            sb.append(str2);
        }
        m52568.mo26251(sb.toString());
        m52568.writeByte(10);
        C10338 c103382 = this.f42649;
        m52568.mo26249(c103382.m26139() + 2);
        m52568.writeByte(10);
        int m261392 = c103382.m26139();
        for (int i2 = 0; i2 < m261392; i2++) {
            m52568.mo26251(c103382.m26136(i2));
            m52568.mo26251(": ");
            m52568.mo26251(c103382.m26140(i2));
            m52568.writeByte(10);
        }
        m52568.mo26251(f42639);
        m52568.mo26251(": ");
        m52568.mo26249(this.f42641);
        m52568.writeByte(10);
        m52568.mo26251(f42638);
        m52568.mo26251(": ");
        m52568.mo26249(this.f42646);
        m52568.writeByte(10);
        if (str.startsWith("https://")) {
            m52568.writeByte(10);
            C13159 c13159 = this.f42643;
            m52568.mo26251(c13159.m31888().f67678);
            m52568.writeByte(10);
            m33745(m52568, c13159.m31890());
            m33745(m52568, c13159.m31889());
            m52568.mo26251(c13159.m31891().m3447());
            m52568.writeByte(10);
        }
        m52568.close();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m33744(InterfaceC6171 interfaceC6171) {
        int m20810 = C7787.m20810(interfaceC6171);
        if (m20810 == -1) {
            return Collections.EMPTY_LIST;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(m20810);
            for (int i = 0; i < m20810; i++) {
                String mo12300 = interfaceC6171.mo12300();
                C12521 c12521 = new C12521();
                c12521.m30710(C11816.m28896(mo12300));
                arrayList.add(certificateFactory.generateCertificate(c12521.mo12307()));
            }
            return arrayList;
        } catch (CertificateException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33745(InterfaceC10405 interfaceC10405, List list) {
        try {
            interfaceC10405.mo26249(list.size());
            interfaceC10405.writeByte(10);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                interfaceC10405.mo26251(C11816.m28897(((Certificate) list.get(i)).getEncoded()).mo2326());
                interfaceC10405.writeByte(10);
            }
        } catch (CertificateEncodingException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18621 m33746(C1505 c1505) {
        C10338 c10338 = this.f42649;
        String m26137 = c10338.m26137("Content-Type");
        String m261372 = c10338.m26137("Content-Length");
        C9449 c9449 = new C9449();
        c9449.m24282(this.f42648);
        c9449.m24277(this.f42644, (AbstractC2393) null);
        c9449.f28651 = this.f42642.m26138();
        C8743 m24274 = c9449.m24274();
        C3804 c3804 = new C3804();
        c3804.f11993 = m24274;
        c3804.f12001 = this.f42647;
        c3804.f11998 = this.f42640;
        c3804.f11996 = this.f42645;
        c3804.f11999 = c10338.m26138();
        c3804.f11991 = new C23309(c1505, m26137, m261372);
        c3804.f12000 = this.f42643;
        c3804.f11997 = this.f42641;
        c3804.f11994 = this.f42646;
        return c3804.m11474();
    }
}

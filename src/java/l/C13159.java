package l;

import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: H4CZ */
/* renamed from: l.۬ܰ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13159 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20922 f39345;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f39346;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f39347;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC0981 f39348;

    public C13159(EnumC0981 enumC0981, C20922 c20922, List list, List list2) {
        this.f39348 = enumC0981;
        this.f39345 = c20922;
        this.f39347 = list;
        this.f39346 = list2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13159 m31886(SSLSession sSLSession) {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        C20922 m47749 = C20922.m47749(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        EnumC0981 m3446 = EnumC0981.m3446(protocol);
        try {
            certificateArr = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            certificateArr = null;
        }
        if (certificateArr != null) {
            list = C20032.m46176(certificateArr);
        } else {
            list = Collections.EMPTY_LIST;
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            list2 = C20032.m46176(localCertificates);
        } else {
            list2 = Collections.EMPTY_LIST;
        }
        return new C13159(m3446, m47749, list, list2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13159 m31887(EnumC0981 enumC0981, C20922 c20922, List list, List list2) {
        if (enumC0981 == null) {
            throw new NullPointerException("tlsVersion == null");
        }
        return new C13159(enumC0981, c20922, C20032.m46175(list), C20032.m46175(list2));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC0981 m31891() {
        return this.f39348;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20922 m31888() {
        return this.f39345;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m31890() {
        return this.f39347;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m31889() {
        return this.f39346;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13159)) {
            return false;
        }
        C13159 c13159 = (C13159) obj;
        return this.f39348.equals(c13159.f39348) && this.f39345.equals(c13159.f39345) && this.f39347.equals(c13159.f39347) && this.f39346.equals(c13159.f39346);
    }

    public final int hashCode() {
        return this.f39346.hashCode() + ((this.f39347.hashCode() + ((this.f39345.hashCode() + ((this.f39348.hashCode() + 527) * 31)) * 31)) * 31);
    }
}

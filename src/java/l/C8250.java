package l;

import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: 51RR */
/* renamed from: l.۠ܶۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8250 implements InterfaceC4722 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f25388;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f25389;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f25390;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f25391;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f25392;

    public C8250(HttpURLConnection httpURLConnection, String str, int i, int i2, int i3, String str2) {
        this.f25388 = str;
        this.f25389 = i;
        this.f25390 = i2;
        this.f25392 = i3;
        this.f25391 = str2;
        HashMap hashMap = new HashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        if (headerFields != null) {
            hashMap.putAll(headerFields);
        }
    }

    @Override // l.InterfaceC4722
    public final String a() {
        return this.f25388;
    }

    @Override // l.InterfaceC4722
    public final int b() {
        return this.f25389;
    }

    @Override // l.InterfaceC4722
    public final int c() {
        return this.f25390;
    }

    @Override // l.InterfaceC4722
    public final int d() {
        return this.f25392;
    }

    public final String toString() {
        return "c@" + hashCode() + "\ncontent = [" + this.f25388 + "]\nresponseSize = " + this.f25389 + "\nrequestSize = " + this.f25390 + "\nresultCode = " + this.f25392 + "\nerrorMsg = " + this.f25391;
    }
}

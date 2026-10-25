package com.amazonaws.http;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import l.C20195;

/* loaded from: classes.dex */
public class HttpResponse {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InputStream f198;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map f199;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InputStream f200;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f201;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f202;

    public HttpResponse(String str, int i, Map map, InputStream inputStream) {
        this.f201 = str;
        this.f202 = i;
        this.f199 = map;
        this.f200 = inputStream;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map m267() {
        return this.f199;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream m266() {
        if (this.f198 == null) {
            synchronized (this) {
                if (this.f200 != null && "gzip".equals(this.f199.get("Content-Encoding"))) {
                    this.f198 = new GZIPInputStream(this.f200);
                } else {
                    this.f198 = this.f200;
                }
            }
        }
        return this.f198;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InputStream m268() {
        return this.f200;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m269() {
        return this.f201;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m270() {
        return this.f202;
    }

    public class Builder {

        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
        public InputStream f203;

        /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
        public final HashMap f204 = new HashMap();

        /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
        public int f205;

        /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
        public String f206;

        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final void m274(String str) {
            this.f206 = str;
        }

        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final void m272(int i) {
            this.f205 = i;
        }

        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final void m273(InputStream inputStream) {
            this.f203 = inputStream;
        }

        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final void m275(String str, String str2) {
            this.f204.put(str, str2);
        }

        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final HttpResponse m271() {
            return new HttpResponse(this.f206, this.f205, C20195.unmodifiableMap(this.f204), this.f203);
        }
    }
}

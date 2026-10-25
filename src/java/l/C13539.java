package l;

import com.amazonaws.services.s3.model.S3ObjectSummary;

/* compiled from: Q87M */
/* renamed from: l.ܰۖ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13539 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f40413;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f40414;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final S3ObjectSummary f40415;

    public C13539(String str) {
        this.f40413 = str;
        this.f40415 = null;
        if (str.endsWith("/")) {
            this.f40414 = C15472.m36561(1, str.lastIndexOf(47, str.length() - 2) + 1, str);
        } else {
            this.f40414 = str.substring(str.lastIndexOf(47) + 1);
        }
    }

    public C13539(S3ObjectSummary s3ObjectSummary) {
        this.f40413 = null;
        this.f40415 = s3ObjectSummary;
        String m659 = s3ObjectSummary.m659();
        this.f40414 = m659.substring(m659.lastIndexOf(47) + 1);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7895 m32580() {
        String str = this.f40413;
        if (str == null) {
            return C7895.m21181(this.f40415);
        }
        return C7895.m21182(str);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m32582() {
        return this.f40413 != null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m32581() {
        return this.f40414;
    }
}

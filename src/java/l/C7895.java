package l;

import com.amazonaws.services.s3.model.S3ObjectSummary;

/* compiled from: T82Y */
/* renamed from: l.۠ۖ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C7895 extends AbstractC17191 {

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final S3ObjectSummary f24460;

    public C7895(String str, String str2, long j, long j2, S3ObjectSummary s3ObjectSummary) {
        super(str, str2, null, j, j2, s3ObjectSummary != null);
        this.f24460 = s3ObjectSummary;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C7895 m21182(String str) {
        int length = str.endsWith("/") ? str.length() - 1 : str.length();
        int lastIndexOf = str.lastIndexOf(47, length - 1) + 1;
        return new C7895(str.substring(lastIndexOf, length), "/" + str.substring(0, lastIndexOf), -1L, -1L, null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7895 m21181(S3ObjectSummary s3ObjectSummary) {
        String m659 = s3ObjectSummary.m659();
        int lastIndexOf = m659.lastIndexOf(47) + 1;
        return new C7895(m659.substring(lastIndexOf), "/" + m659.substring(0, lastIndexOf), s3ObjectSummary.m666(), s3ObjectSummary.m664().getTime(), s3ObjectSummary);
    }

    @Override // l.C15688, l.InterfaceC17889
    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CharSequence mo21183() {
        if (this.f24460 != null) {
            return null;
        }
        return "-";
    }
}

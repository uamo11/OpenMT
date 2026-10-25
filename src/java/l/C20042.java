package l;

import android.net.Uri;
import java.util.Map;

/* compiled from: B74J */
/* renamed from: l.᩶۠ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20042 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f64936;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f64937;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Boolean f64938;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f64939;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f64940;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f64941;

    public C20042(boolean z, String str, String str2, long j, String str3, Boolean bool) {
        this.f64940 = z;
        this.f64936 = str;
        this.f64939 = str2;
        this.f64941 = j;
        this.f64937 = str3;
        this.f64938 = bool;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20042 m46234(C23770 c23770) {
        String m9478;
        String m94782;
        Map map = c23770.f76940;
        m9478 = C3108.m9478("ETag", map);
        m94782 = C3108.m9478("Last-Modified", map);
        Uri uri = c23770.f76939;
        return new C20042(true, m9478, m94782, -1L, uri == null ? null : C3108.m9477(uri), null);
    }
}

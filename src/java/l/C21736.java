package l;

import com.alipay.sdk.m.w.a;
import java.nio.charset.Charset;

/* compiled from: R5PD */
/* renamed from: l.᩸ᩳ֡, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21736 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Charset f69703 = Charset.forName(a.D);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49060(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder m31106 = C12803.m31106("size=", " offset=", j);
            m31106.append(j2);
            m31106.append(" byteCount=");
            m31106.append(j3);
            throw new ArrayIndexOutOfBoundsException(m31106.toString());
        }
    }
}

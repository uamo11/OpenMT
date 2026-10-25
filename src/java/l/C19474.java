package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.io.InputStream;

/* compiled from: P5Z7 */
/* renamed from: l.᩵۬, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C19474 {
    /* renamed from: ֫ */
    public Typeface mo8053(Context context, C9308 c9308, Resources resources, int i) {
        throw null;
    }

    /* renamed from: ֫ */
    public Typeface mo8054(Context context, C17275[] c17275Arr, int i) {
        throw null;
    }

    public C19474() {
        new ConcurrentMapC10942();
    }

    /* renamed from: ֫ */
    public C17275 mo8055(int i, C17275[] c17275Arr) {
        C3951 c3951 = new C3951();
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        C17275 c17275 = null;
        int i3 = Integer.MAX_VALUE;
        for (C17275 c172752 : c17275Arr) {
            int abs = (Math.abs(c3951.mo11996(c172752) - i2) * 2) + (c3951.mo11995(c172752) == z ? 0 : 1);
            if (c17275 == null || i3 > abs) {
                c17275 = c172752;
                i3 = abs;
            }
        }
        return c17275;
    }

    /* renamed from: ֫ */
    public Typeface mo8052(Context context, InputStream inputStream) {
        File m1946 = C0422.m1946(context);
        if (m1946 == null) {
            return null;
        }
        try {
            if (C0422.m1950(m1946, inputStream)) {
                return Typeface.createFromFile(m1946.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m1946.delete();
        }
    }

    /* renamed from: ֫ */
    public Typeface mo8051(Context context, Resources resources, int i, String str, int i2) {
        File m1946 = C0422.m1946(context);
        if (m1946 == null) {
            return null;
        }
        try {
            if (C0422.m1949(m1946, resources, i)) {
                return Typeface.createFromFile(m1946.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m1946.delete();
        }
    }
}

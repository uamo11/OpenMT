package l;

import android.content.res.Configuration;

/* compiled from: 422Y */
/* renamed from: l.᩻ܳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23746 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52392(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        i = configuration.colorMode;
        int i7 = i & 3;
        i2 = configuration2.colorMode;
        int i8 = i2 & 3;
        if (i7 != i8) {
            i6 = configuration3.colorMode;
            configuration3.colorMode = i6 | i8;
        }
        i3 = configuration.colorMode;
        int i9 = i3 & 12;
        i4 = configuration2.colorMode;
        int i10 = i4 & 12;
        if (i9 != i10) {
            i5 = configuration3.colorMode;
            configuration3.colorMode = i5 | i10;
        }
    }
}

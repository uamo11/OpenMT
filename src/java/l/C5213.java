package l;

import android.os.Bundle;
import java.io.IOException;
import java.io.UncheckedIOException;

/* compiled from: N6QO */
/* renamed from: l.ۚ۟ᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5213 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m14989(Bundle bundle, String str) {
        return bundle.containsKey(str) || bundle.containsKey(str.concat("Path"));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m14990(Bundle bundle, String str) {
        byte[] byteArray = bundle.getByteArray(str);
        if (byteArray != null) {
            return byteArray;
        }
        String string = bundle.getString(str.concat("Path"));
        if (string == null) {
            throw new IllegalArgumentException("Missing memory view state");
        }
        AbstractC15440 m39866 = C16999.m39866(string, new String[0]);
        try {
            return m39866.m36506();
        } catch (IOException e) {
            if (m39866.mo23120()) {
                throw new UncheckedIOException(e);
            }
            return null;
        }
    }
}

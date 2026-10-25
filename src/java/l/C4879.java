package l;

import java.io.IOException;

/* compiled from: B7G8 */
/* renamed from: l.ۙ᩶ܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4879 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14234(String str, byte[] bArr) {
        if (bArr.length + 1 > 4097) {
            throw new IOException(str.concat(" too long"));
        }
        for (byte b : bArr) {
            if (b == 0) {
                throw new IOException(str.concat(" contains NUL"));
            }
        }
    }
}

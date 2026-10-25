package l;

import java.nio.charset.CharsetEncoder;

/* compiled from: N673 */
/* renamed from: l.᩻᩹ᩴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23994 extends CharsetEncoder {
    public C17022 a;

    public C23994(C7061 c7061) {
        super(c7061, 1.1f, 3.0f);
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean canEncode(char c) {
        return !Character.isSurrogate(c);
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean isLegalReplacement(byte[] bArr) {
        return (bArr.length == 1 && bArr[0] >= 0) || super.isLegalReplacement(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3 A[SYNTHETIC] */
    @Override // java.nio.charset.CharsetEncoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.nio.charset.CoderResult encodeLoop(java.nio.CharBuffer r19, java.nio.ByteBuffer r20) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23994.encodeLoop(java.nio.CharBuffer, java.nio.ByteBuffer):java.nio.charset.CoderResult");
    }
}

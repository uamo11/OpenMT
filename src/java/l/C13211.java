package l;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

/* compiled from: T6Y0 */
/* renamed from: l.۬ܺۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13211 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20268 m32047(String str, byte[] bArr) {
        C17095 m33925;
        byte[] copyOf = Arrays.copyOf(bArr, Math.min(bArr.length, 32768));
        if (str.isEmpty()) {
            m33925 = C14272.m33920("", copyOf);
        } else {
            m33925 = C14272.m33925(str);
            if (!m33925.m40112(copyOf)) {
                throw new C22384("Encoding token BOM does not match the current file");
            }
        }
        CharsetDecoder newDecoder = m33925.f52402.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        CharsetDecoder onUnmappableCharacter = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        int i = m33925.f52401;
        return new C20268(onUnmappableCharacter.decode(ByteBuffer.wrap(bArr, i, bArr.length - i)).toString(), m33925.f52403);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4745 m32046(int i, String str, String str2) {
        C17095 m33925 = C14272.m33925(str2);
        Charset charset = m33925.f52402;
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer encode = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str));
        byte[] m40113 = m33925.m40113();
        long length = m40113.length + encode.remaining();
        if (length > i) {
            throw new C3334(length);
        }
        int i2 = (int) length;
        byte[] bArr = new byte[i2];
        System.arraycopy(m40113, 0, bArr, 0, m40113.length);
        encode.get(bArr, m40113.length, i2 - m40113.length);
        return new C4745(bArr, charset.name());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32048(C4745 c4745) {
        String str;
        int min = Math.min(c4745.f15051.length, 32768);
        byte[] bArr = c4745.f15051;
        str = c4745.f15052;
        C16398.m38653(str, min, bArr);
    }
}

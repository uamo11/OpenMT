package l;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: X8O6 */
/* renamed from: l.۫ۡۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12305 extends AbstractC15126 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Pattern f36635 = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CharsetDecoder f36637 = StandardCharsets.UTF_8.newDecoder();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharsetDecoder f36636 = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // l.AbstractC15126
    /* renamed from: ֫ */
    public final C23896 mo4059(C8072 c8072, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f36636;
        CharsetDecoder charsetDecoder2 = this.f36637;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new C23896(new C5955(null, bArr, null));
        }
        Matcher matcher = f36635.matcher(str);
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String m35799 = C15107.m35799(group);
                m35799.getClass();
                if (m35799.equals("streamurl")) {
                    str3 = group2;
                } else if (m35799.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new C23896(new C5955(str2, bArr, str3));
    }
}

package l;

import java.nio.charset.Charset;

/* compiled from: L7IG */
/* renamed from: l.᩶ۢ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public enum EnumC20078 {
    CR("\r"),
    CRLF("\r\n"),
    LF("\n");


    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f65018;

    EnumC20078(String str) {
        C11003.requireNonNull(str, "lineSeparator");
        this.f65018 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] m46271(Charset charset) {
        return this.f65018.getBytes(charset);
    }

    public String getString() {
        return this.f65018;
    }
}

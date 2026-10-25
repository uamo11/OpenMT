package l;

import java.io.IOException;

/* compiled from: R4FB */
/* renamed from: l.ܳ۟᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum EnumC14386 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f43348;

    EnumC14386(String str) {
        this.f43348 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC14386 m34359(String str) {
        EnumC14386 enumC14386 = HTTP_1_0;
        if (str.equals(enumC14386.f43348)) {
            return enumC14386;
        }
        EnumC14386 enumC143862 = HTTP_1_1;
        if (str.equals(enumC143862.f43348)) {
            return enumC143862;
        }
        EnumC14386 enumC143863 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(enumC143863.f43348)) {
            return enumC143863;
        }
        EnumC14386 enumC143864 = HTTP_2;
        if (str.equals(enumC143864.f43348)) {
            return enumC143864;
        }
        EnumC14386 enumC143865 = SPDY_3;
        if (str.equals(enumC143865.f43348)) {
            return enumC143865;
        }
        EnumC14386 enumC143866 = QUIC;
        if (str.equals(enumC143866.f43348)) {
            return enumC143866;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f43348;
    }
}

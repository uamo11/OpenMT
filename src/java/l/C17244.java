package l;

import java.util.Collections;

/* compiled from: U8QL */
/* renamed from: l.ܿۡۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17244 extends AbstractC20773 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int[] f52858 = {5512, 11025, 22050, 44100};

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f52859;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f52860;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f52861;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40528(C17714 c17714) {
        if (!this.f52861) {
            int m41456 = c17714.m41456();
            int i = (m41456 >> 4) & 15;
            this.f52859 = i;
            InterfaceC19383 interfaceC19383 = this.f67280;
            if (i == 2) {
                int i2 = f52858[(m41456 >> 2) & 3];
                C1297 c1297 = new C1297();
                c1297.m4462("video/x-flv");
                c1297.m4465("audio/mpeg");
                c1297.m4472(1);
                c1297.m4456(i2);
                interfaceC19383.mo8456(c1297.m4440());
                this.f52860 = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                C1297 c12972 = new C1297();
                c12972.m4462("video/x-flv");
                c12972.m4465(str);
                c12972.m4472(1);
                c12972.m4456(8000);
                interfaceC19383.mo8456(c12972.m4440());
                this.f52860 = true;
            } else if (i != 10) {
                throw new C6661("Audio format not supported: " + this.f52859);
            }
            this.f52861 = true;
            return true;
        }
        c17714.m41478(1);
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40527(long j, C17714 c17714) {
        int i = this.f52859;
        InterfaceC19383 interfaceC19383 = this.f67280;
        if (i == 2) {
            int m41457 = c17714.m41457();
            interfaceC19383.mo8453(m41457, c17714);
            this.f67280.mo8455(j, 1, m41457, 0, null);
            return true;
        }
        int m41456 = c17714.m41456();
        if (m41456 == 0 && !this.f52860) {
            int m414572 = c17714.m41457();
            byte[] bArr = new byte[m414572];
            c17714.m41461(0, m414572, bArr);
            C12948 m29741 = C12243.m29741(new C16302(bArr, m414572), false);
            C1297 c1297 = new C1297();
            c1297.m4462("video/x-flv");
            c1297.m4465("audio/mp4a-latm");
            c1297.m4445(m29741.f38845);
            c1297.m4472(m29741.f38844);
            c1297.m4456(m29741.f38846);
            c1297.m4446(Collections.singletonList(bArr));
            interfaceC19383.mo8456(c1297.m4440());
            this.f52860 = true;
            return false;
        }
        if (this.f52859 == 10 && m41456 != 1) {
            return false;
        }
        int m414573 = c17714.m41457();
        interfaceC19383.mo8453(m414573, c17714);
        this.f67280.mo8455(j, 1, m414573, 0, null);
        return true;
    }
}

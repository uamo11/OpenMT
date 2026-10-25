package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: T7YQ */
/* renamed from: l.ᩴۢۘ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18671 extends C4185 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f59000;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f59001;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19377 f59002;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f59003;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18671(C19377 c19377, String str, String str2, int i, byte[] bArr, String str3) {
        super(i, str, str2, str3, bArr);
        this.f59002 = c19377;
        this.f59003 = false;
        this.f59000 = null;
        this.f59001 = null;
        if (!this.f13633.startsWith("|1|") || this.f13633.substring(3).indexOf("|") <= 0) {
            return;
        }
        String substring = this.f13633.substring(3);
        String substring2 = substring.substring(0, substring.indexOf("|"));
        String substring3 = substring.substring(substring.indexOf("|") + 1);
        Charset charset = StandardCharsets.UTF_8;
        this.f59000 = C19356.m44598(0, substring2.length(), C19356.m44592(substring2, charset));
        this.f59001 = C19356.m44598(0, substring3.length(), C19356.m44592(substring3, charset));
        int blockSize = c19377.f62719.getBlockSize();
        if (this.f59000.length != blockSize || this.f59001.length != blockSize) {
            this.f59000 = null;
            this.f59001 = null;
        } else {
            this.f59003 = true;
        }
    }

    @Override // l.C4185
    /* renamed from: ֫ */
    public final boolean mo12631(String str) {
        C20413 c20413;
        boolean m44591;
        if (!this.f59003) {
            return super.mo12631(str);
        }
        try {
            synchronized (this.f59002.f62719) {
                this.f59002.f62719.init(this.f59000);
                byte[] m44592 = C19356.m44592(str, StandardCharsets.UTF_8);
                this.f59002.f62719.mo3561(m44592.length, m44592);
                byte[] bArr = new byte[this.f59002.f62719.getBlockSize()];
                this.f59002.f62719.mo3563(0, bArr);
                m44591 = C19356.m44591(this.f59001, bArr);
            }
            return m44591;
        } catch (Exception unused) {
            c20413 = this.f59002.f62720;
            c20413.m46777().getClass();
            return false;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m43289() {
        return this.f59003;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m43288() {
        C20413 c20413;
        Charset charset;
        if (this.f59003) {
            return;
        }
        if (this.f59000 == null) {
            InterfaceC22198 interfaceC22198 = C7381.f22654;
            synchronized (interfaceC22198) {
                int blockSize = this.f59002.f62719.getBlockSize();
                byte[] bArr = new byte[blockSize];
                this.f59000 = bArr;
                interfaceC22198.mo3071(0, blockSize, bArr);
            }
        }
        try {
            synchronized (this.f59002.f62719) {
                this.f59002.f62719.init(this.f59000);
                String str = this.f13633;
                charset = StandardCharsets.UTF_8;
                byte[] m44592 = C19356.m44592(str, charset);
                this.f59002.f62719.mo3561(m44592.length, m44592);
                byte[] bArr2 = new byte[this.f59002.f62719.getBlockSize()];
                this.f59001 = bArr2;
                this.f59002.f62719.mo3563(0, bArr2);
            }
            StringBuilder sb = new StringBuilder("|1|");
            byte[] bArr3 = this.f59000;
            byte[] m44593 = C19356.m44593(bArr3, bArr3.length, true);
            sb.append(new String(m44593, 0, m44593.length, charset));
            sb.append("|");
            byte[] bArr4 = this.f59001;
            byte[] m445932 = C19356.m44593(bArr4, bArr4.length, true);
            sb.append(new String(m445932, 0, m445932.length, charset));
            this.f13633 = sb.toString();
            this.f59003 = true;
        } catch (Exception unused) {
            c20413 = this.f59002.f62720;
            c20413.m46777().getClass();
            this.f59000 = null;
            this.f59001 = null;
        }
    }
}

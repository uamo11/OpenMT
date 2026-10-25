package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: R7W4 */
/* renamed from: l.۠᩻ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C8501 extends AbstractC19791 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final byte[] f25993;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public String f25994;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public String f25995 = "127.0.0.1";

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f25996 = 0;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f25997;

    static {
        byte[] bArr = C19356.f62660;
        f25993 = C19356.m44592("direct-tcpip", StandardCharsets.UTF_8);
    }

    public C8501() {
        this.f63912 = f25993;
        this.f63924 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f63913 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f63925 = 16384;
    }

    @Override // l.AbstractC19791
    /* renamed from: ۜ */
    public final void mo5591() {
        this.f63917 = new C19708();
    }

    @Override // l.AbstractC19791
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo22199(int i) {
        this.f63916 = 0;
        try {
            C7381 m45497 = m45497();
            if (!m45497.m19868()) {
                throw new C12651("session is down");
            }
            if (this.f63917.f63666 != null) {
                ThreadFactoryC5970 m19879 = m45497.m19879();
                Runnable runnable = new Runnable() { // from class: l.֨᩻ۘ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8501.this.mo2847();
                    }
                };
                m19879.getClass();
                Thread thread = new Thread(runnable);
                this.f63908 = thread;
                thread.setName("DirectTCPIP thread " + m45497.f22687);
                this.f63908.start();
                return;
            }
            m45494();
        } catch (Exception e) {
            this.f63917.m45399();
            this.f63917 = null;
            C7381 c7381 = this.f63923;
            if (c7381 != null) {
                c7381.m19865(this);
            }
            if (e instanceof C12651) {
                throw ((C12651) e);
            }
        }
    }

    @Override // l.AbstractC19791
    /* renamed from: ۡ */
    public final void mo2847() {
        C19708 c19708;
        InputStream inputStream;
        try {
            m45494();
            C16261 c16261 = new C16261(this.f63911);
            C8087 c8087 = new C8087(c16261);
            C7381 m45497 = m45497();
            while (true) {
                if (!m45489() || this.f63908 == null || (c19708 = this.f63917) == null || (inputStream = c19708.f63666) == null) {
                    break;
                }
                byte[] bArr = c16261.f50016;
                int read = inputStream.read(bArr, 14, (bArr.length - 14) - m45497.m19874());
                if (read <= 0) {
                    m45495();
                    break;
                }
                c8087.m21457();
                c16261.m38234((byte) 94);
                c16261.m38245(this.f63918);
                c16261.m38245(read);
                c16261.m38251(read);
                synchronized (this) {
                    if (this.f63909) {
                        break;
                    } else {
                        m45497.m19862(c8087, this, read);
                    }
                }
            }
            m45495();
            m45490();
        } catch (Exception unused) {
            if (!this.f63919) {
                this.f63919 = true;
            }
            m45490();
        }
    }

    @Override // l.AbstractC19791
    /* renamed from: ܿ */
    public C8087 mo15984() {
        C16261 c16261 = new C16261(this.f25995.length() + this.f25994.length() + 50 + this.f63923.m19874());
        C8087 c8087 = new C8087(c16261);
        c8087.m21457();
        c16261.m38234((byte) 90);
        c16261.m38256(this.f63912);
        c16261.m38245(this.f63920);
        c16261.m38245(this.f63913);
        c16261.m38245(this.f63925);
        String str = this.f25994;
        Charset charset = StandardCharsets.UTF_8;
        c16261.m38256(C19356.m44592(str, charset));
        c16261.m38245(this.f25997);
        c16261.m38256(C19356.m44592(this.f25995, charset));
        c16261.m38245(this.f25996);
        return c8087;
    }
}

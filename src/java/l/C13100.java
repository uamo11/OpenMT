package l;

import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPOutputStream;
import org.bouncycastle.util.encoders.UTF8;

/* compiled from: V1EH */
/* renamed from: l.۬ۨ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13100 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f39223;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f39226;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final BufferedOutputStream f39229;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10130 f39222 = new C10130();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C0521 f39225 = new C0521();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C0521 f39228 = new C0521();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C0521 f39227 = new C0521();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f39224 = new byte[4];

    public C13100(boolean z, BufferedOutputStream bufferedOutputStream, AtomicInteger atomicInteger) {
        this.f39226 = z;
        this.f39229 = bufferedOutputStream;
        this.f39223 = atomicInteger;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31764(C4634 c4634) {
        this.f39222.m25440();
        this.f39225.m2232();
        C10130 c10130 = this.f39222;
        C19220 c19220 = c4634.f14717;
        if (c19220 != null) {
            c19220.m44344(c10130);
        } else {
            InputStream mo27926 = c4634.f14710.mo27926();
            try {
                byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
                while (true) {
                    int read = mo27926.read(bArr);
                    if (read == -1) {
                        break;
                    } else {
                        c10130.write(bArr, 0, read);
                    }
                }
                mo27926.close();
            } catch (Throwable th) {
                if (mo27926 != null) {
                    try {
                        mo27926.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        c4634.m13580(this.f39225);
        if (this.f39226) {
            this.f39228.m2232();
            C0521 c0521 = this.f39228;
            byte[] m25438 = this.f39222.m25438();
            int size = this.f39222.size();
            int i = C3878.f12396;
            try {
                C10007 c10007 = new C10007(c0521);
                try {
                    c10007.write(m25438, 0, size);
                    c10007.close();
                    this.f39227.m2232();
                    C0521 c05212 = this.f39227;
                    C0521 c05213 = this.f39225;
                    byte[] bArr2 = c05213.f2176;
                    int i2 = c05213.f2177;
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(c05212);
                        try {
                            gZIPOutputStream.write(bArr2, 0, i2);
                            gZIPOutputStream.close();
                        } finally {
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } finally {
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        synchronized (this.f39229) {
            if (this.f39226) {
                C15972.m37746(0, this.f39228.f2177, this.f39224);
                this.f39229.write(this.f39224);
                BufferedOutputStream bufferedOutputStream = this.f39229;
                C0521 c05214 = this.f39228;
                bufferedOutputStream.write(c05214.f2176, 0, c05214.f2177);
                c4634.f14712 = this.f39223.getAndAdd(this.f39228.f2177 + 4);
                C15972.m37746(0, this.f39227.f2177, this.f39224);
                this.f39229.write(this.f39224);
                BufferedOutputStream bufferedOutputStream2 = this.f39229;
                C0521 c05215 = this.f39227;
                bufferedOutputStream2.write(c05215.f2176, 0, c05215.f2177);
                c4634.f14711 = this.f39223.getAndAdd(this.f39227.f2177 + 4);
            } else {
                C15972.m37746(0, this.f39222.size(), this.f39224);
                this.f39229.write(this.f39224);
                this.f39229.write(this.f39222.m25438(), 0, this.f39222.size());
                c4634.f14712 = this.f39223.getAndAdd(this.f39222.size() + 4);
                C0521 c05216 = this.f39225;
                byte[] bArr3 = c05216.f2176;
                int i3 = c05216.f2177;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (bArr3[i4] == 0) {
                        bArr3[i4] = UTF8.S_CS3;
                    }
                }
                this.f39229.write(bArr3, 0, i3);
                this.f39229.write(0);
                c4634.f14711 = this.f39223.getAndAdd(i3 + 1);
            }
        }
        if (this.f39222.m25438().length > 20480) {
            this.f39222.m25440();
            this.f39222.m25443();
        }
        C0521 c05217 = this.f39225;
        if (c05217.f2176.length > 20480) {
            c05217.m2232();
            this.f39225.m2233();
        }
        C0521 c05218 = this.f39228;
        if (c05218.f2176.length > 20480) {
            c05218.m2232();
            this.f39228.m2233();
        }
        C0521 c05219 = this.f39227;
        if (c05219.f2176.length > 20480) {
            c05219.m2232();
            this.f39227.m2233();
        }
        c4634.f14713 = null;
        C19220 c192202 = c4634.f14717;
        if (c192202 != null) {
            c192202.m44349();
            c4634.f14717 = null;
        }
    }
}

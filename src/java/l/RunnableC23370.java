package l;

import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: LAQJ */
/* renamed from: l.᩻֨ܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class RunnableC23370 implements Runnable {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f75069;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f75070;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14197 f75071;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3545 f75072;

    public RunnableC23370(C14197 c14197, C3545 c3545, AbstractC15440 abstractC15440, boolean z) {
        this.f75071 = c14197;
        this.f75072 = c3545;
        this.f75070 = abstractC15440;
        this.f75069 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC15440 abstractC15440 = this.f75070;
        C14197 c14197 = this.f75071;
        boolean z = c14197.f42854;
        AtomicReference atomicReference = c14197.f42853;
        if (z || atomicReference.get() != null) {
            return;
        }
        C19277 c19277 = c14197.f42855;
        try {
            abstractC15440.mo35195();
            try {
                InputStream m42189 = c14197.f42856.m34753().m42189(this.f75072);
                try {
                    OutputStream mo23555 = abstractC15440.mo23555(false);
                    try {
                        byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
                        do {
                            int read = m42189.read(bArr);
                            if (read == -1) {
                                if (this.f75069) {
                                    try {
                                        c14197.f42857.put(this);
                                    } catch (InterruptedException unused) {
                                    }
                                }
                                if (mo23555 != null) {
                                    mo23555.close();
                                }
                                m42189.close();
                                return;
                            }
                            c19277.m44460(read);
                            mo23555.write(bArr, 0, read);
                            if (c14197.f42854) {
                                break;
                            }
                        } while (atomicReference.get() == null);
                        mo23555.close();
                        m42189.close();
                    } finally {
                    }
                } finally {
                }
            } catch (Exception e) {
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
        } catch (IOException e2) {
            while (!atomicReference.compareAndSet(null, e2) && atomicReference.get() == null) {
            }
        }
    }
}

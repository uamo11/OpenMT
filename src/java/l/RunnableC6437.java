package l;

import android.content.pm.PackageInstaller;
import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: LAQJ */
/* renamed from: l.ۜ֨ܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class RunnableC6437 implements Runnable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final PackageInstaller.Session f19915;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C14197 f19916;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3545 f19917;

    public RunnableC6437(C14197 c14197, C3545 c3545, PackageInstaller.Session session) {
        this.f19916 = c14197;
        this.f19917 = c3545;
        this.f19915 = session;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3545 c3545 = this.f19917;
        C14197 c14197 = this.f19916;
        boolean z = c14197.f42854;
        AtomicReference atomicReference = c14197.f42853;
        if (z || atomicReference.get() != null) {
            return;
        }
        C19277 c19277 = c14197.f42855;
        try {
            InputStream m42189 = c14197.f42856.m34753().m42189(c3545);
            try {
                OutputStream openWrite = this.f19915.openWrite(c3545.m10810(), 0L, c3545.getSize());
                try {
                    byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
                    do {
                        int read = m42189.read(bArr);
                        if (read == -1) {
                            this.f19915.fsync(openWrite);
                            if (openWrite != null) {
                                openWrite.close();
                            }
                            m42189.close();
                            try {
                                c14197.f42857.put(this);
                                return;
                            } catch (InterruptedException unused) {
                                return;
                            }
                        }
                        c19277.m44460(read);
                        openWrite.write(bArr, 0, read);
                        if (c14197.f42854) {
                            break;
                        }
                    } while (atomicReference.get() == null);
                    openWrite.close();
                    m42189.close();
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
        }
    }
}

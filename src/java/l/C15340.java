package l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;

/* compiled from: 5AG2 */
/* renamed from: l.ܶܺ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15340 extends BufferedInputStream implements InterfaceC14905 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f47006;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13224 f47007;

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f47006) {
            return;
        }
        this.f47006 = true;
        super.close();
        ExecutorService executorService = C1802.f6208;
        final InterfaceC13224 interfaceC13224 = this.f47007;
        executorService.submit(new Runnable() { // from class: l.۠ܺ᩻
            @Override // java.lang.Runnable
            public final void run() {
                int m32078;
                InterfaceC13224 interfaceC132242 = interfaceC13224;
                try {
                    m32078 = interfaceC132242.m32078();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    interfaceC132242.m32072(0L);
                    int i = C4758.f15106;
                    C13019.m31601(interfaceC132242);
                    throw th;
                }
                if (m32078 < 100 || m32078 >= 300) {
                    interfaceC132242.mo26245();
                    throw null;
                }
                interfaceC132242.m32072(0L);
                int i2 = C4758.f15106;
                C13019.m31601(interfaceC132242);
            }
        });
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15340(C4758 c4758, InputStream inputStream, InterfaceC13224 interfaceC13224) {
        super(inputStream);
        this.f47007 = interfaceC13224;
    }

    public final void finalize() {
        super.finalize();
        close();
    }
}

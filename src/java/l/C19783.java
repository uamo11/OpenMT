package l;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import net.sf.sevenzipjbinding.IOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* compiled from: WB6R */
/* renamed from: l.᩵᩺᩵, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19783 implements IOutStream, Closeable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f63886;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23411 f63887;

    public C19783(AbstractC15440 abstractC15440) {
        C23411 m36513 = abstractC15440.m36513("rw");
        this.f63887 = m36513;
        m36513.setLength(0L);
    }

    public C19783(final AbstractC15440 abstractC15440, long j, final InterfaceC13041 interfaceC13041) {
        final C18683 c18683 = new C18683();
        this.f63887 = C0127.m1200(C19885.m45716(abstractC15440.getName(), j, new InterfaceC22001() { // from class: l.ᩴ᩺᩵
            @Override // l.InterfaceC22001
            /* renamed from: ۧ */
            public final InterfaceC2245 mo17661(int i) {
                StringBuilder sb = new StringBuilder(AbstractC15440.this.mo23554());
                sb.append('.');
                int i2 = i + 1;
                if (i2 < 100) {
                    sb.append('0');
                }
                if (i2 < 10) {
                    sb.append('0');
                }
                sb.append(i2);
                AbstractC15440 m39866 = C16999.m39866(sb.toString(), new String[0]);
                InterfaceC2245 mo23557 = m39866.mo23557("rw");
                if (c18683.add(i2)) {
                    mo23557.setLength(0L);
                    interfaceC13041.accept(m39866);
                }
                return mo23557;
            }
        }));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f63886) {
            return;
        }
        this.f63887.close();
        this.f63886 = true;
    }

    @Override // net.sf.sevenzipjbinding.IOutStream
    public final void setSize(long j) {
        if (this.f63886) {
            throw new SevenZipException("Closed");
        }
        try {
            this.f63887.setLength(j);
        } catch (IOException e) {
            throw new SevenZipException(e);
        }
    }

    @Override // net.sf.sevenzipjbinding.ISeekableStream
    public final long seek(long j, int i) {
        if (this.f63886) {
            throw new SevenZipException("Closed");
        }
        C23411 c23411 = this.f63887;
        try {
            if (i == 0) {
                c23411.seek(j);
            } else if (i == 1) {
                c23411.seek(c23411.getFilePointer() + j);
            } else if (i == 2) {
                c23411.seek(c23411.length() + j);
            } else {
                throw new RuntimeException("Seek: unknown origin: " + i);
            }
            return c23411.getFilePointer();
        } catch (IOException e) {
            throw new SevenZipException("Error while seek operation", e);
        }
    }

    @Override // net.sf.sevenzipjbinding.ISequentialOutStream
    public final int write(ByteBuffer byteBuffer) {
        if (this.f63886) {
            throw new SevenZipException("Closed");
        }
        try {
            return this.f63887.write(byteBuffer);
        } catch (IOException e) {
            throw new SevenZipException(e);
        }
    }
}

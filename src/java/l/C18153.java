package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: 53XL */
/* renamed from: l.ᩳܺۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18153 implements Closeable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC11098 f56450;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InputStream f56451;

    public C18153(InterfaceC11098 interfaceC11098) {
        this.f56450 = interfaceC11098;
        InputStream mo10616 = interfaceC11098.mo10616();
        this.f56451 = mo10616;
        mo10616.mark(1048576);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream m42261(boolean z) {
        InputStream inputStream = this.f56451;
        if (inputStream != null) {
            try {
                inputStream.reset();
            } catch (IOException unused) {
                close();
            }
        }
        if (this.f56451 == null) {
            this.f56451 = this.f56450.mo10616();
        }
        this.f56451.mark(z ? 1048576 : 0);
        return this.f56451;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.f56451;
        this.f56451 = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }
}

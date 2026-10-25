package l;

import android.system.ErrnoException;
import android.system.Os;
import java.io.IOException;

/* compiled from: A16O */
/* renamed from: l.ۡ֡ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8533 extends AbstractC21087 {
    @Override // l.AbstractC21087
    /* renamed from: ֫ */
    public final long mo7023() {
        return -1L;
    }

    @Override // l.AbstractC21087
    /* renamed from: ֫ */
    public final void mo7025(long j) {
    }

    @Override // l.AbstractC21087
    /* renamed from: ۧ */
    public final int mo7026() {
        try {
            return Os.lstat(this.f68007.mo23544()).st_mode & 4095;
        } catch (ErrnoException e) {
            throw new IOException(e);
        }
    }

    @Override // l.AbstractC21087
    /* renamed from: ֫ */
    public final void mo7024(int i) {
        try {
            Os.chmod(this.f68007.mo23544(), i);
        } catch (ErrnoException unused) {
        }
    }
}

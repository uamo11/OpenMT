package l;

import java.io.IOException;
import net.sf.sevenzipjbinding.IOutCreateCallback;
import net.sf.sevenzipjbinding.IOutItemBase;
import net.sf.sevenzipjbinding.ISequentialInStream;
import net.sf.sevenzipjbinding.SevenZipException;
import net.sf.sevenzipjbinding.impl.OutItemFactory;

/* compiled from: 4B3Z */
/* renamed from: l.᩸ܳᩳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C21646 implements IOutCreateCallback {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f69477;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f69478 = -1;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ISequentialInStream f69479 = null;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC4712 f69480;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f69481;

    public C21646(InterfaceC4712 interfaceC4712) {
        this.f69480 = interfaceC4712;
    }

    @Override // net.sf.sevenzipjbinding.IOutCreateCallback
    public IOutItemBase getItemInformation(int i, OutItemFactory outItemFactory) {
        InterfaceC4712 interfaceC4712 = this.f69480;
        if (interfaceC4712.mo1526()) {
            throw new SevenZipException("Canceled");
        }
        return interfaceC4712.getItemInformation(i, outItemFactory);
    }

    @Override // net.sf.sevenzipjbinding.IOutCreateCallback
    public final ISequentialInStream getStream(int i) {
        InterfaceC4712 interfaceC4712 = this.f69480;
        if (interfaceC4712.mo1526()) {
            throw new SevenZipException("Canceled");
        }
        try {
            ISequentialInStream stream = interfaceC4712.getStream(i);
            this.f69479 = stream;
            return stream;
        } catch (IOException e) {
            throw new SevenZipException(e);
        }
    }

    @Override // net.sf.sevenzipjbinding.IOutCreateCallback
    public final void setOperationResult(boolean z) {
        C0349.m1793(this.f69479);
        this.f69479 = null;
        if (!z) {
            throw new SevenZipException();
        }
    }

    @Override // net.sf.sevenzipjbinding.IProgress
    public final void setTotal(long j) {
        this.f69477 = j;
        m48912(this.f69481, j);
    }

    @Override // net.sf.sevenzipjbinding.IProgress
    public final void setCompleted(long j) {
        this.f69481 = j;
        m48912(j, this.f69477);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48912(long j, long j2) {
        if (this.f69480.mo1526()) {
            throw new SevenZipException("Canceled");
        }
        final int m44456 = C19277.m44456(j, j2);
        if (m44456 != this.f69478) {
            this.f69478 = m44456;
            C4925.m14315(new Runnable() { // from class: l.۠ܳᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C21646.this.f69480.mo9860(m44456);
                }
            });
        }
    }
}

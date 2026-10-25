package l;

import net.sf.sevenzipjbinding.ExtractAskMode;
import net.sf.sevenzipjbinding.ExtractOperationResult;
import net.sf.sevenzipjbinding.IArchiveExtractCallback;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.PropID;

/* compiled from: NB79 */
/* renamed from: l.᩶ۛܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19985 implements IArchiveExtractCallback {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IInArchive f64702;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3051 f64703;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C20488 f64704;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C4462 f64705;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f64706;

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final void prepareOperation(ExtractAskMode extractAskMode) {
    }

    @Override // net.sf.sevenzipjbinding.IProgress
    public final void setCompleted(long j) {
    }

    @Override // net.sf.sevenzipjbinding.IProgress
    public final void setTotal(long j) {
    }

    public C19985(C3051 c3051, IInArchive iInArchive) {
        this.f64703 = c3051;
        this.f64702 = iInArchive;
    }

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final ISequentialOutStream getStream(int i, ExtractAskMode extractAskMode) {
        boolean z;
        ConcurrentMapC10942 concurrentMapC10942;
        int i2;
        C3051 c3051 = this.f64703;
        z = c3051.f9596;
        if (z) {
            return null;
        }
        boolean booleanValue = ((Boolean) this.f64702.getProperty(i, PropID.IS_FOLDER)).booleanValue();
        this.f64706 = booleanValue;
        if (booleanValue || extractAskMode != ExtractAskMode.EXTRACT) {
            return null;
        }
        concurrentMapC10942 = c3051.f9595;
        C4462 c4462 = (C4462) concurrentMapC10942.get(Integer.valueOf(i));
        this.f64705 = c4462;
        if (c4462 == null) {
            return null;
        }
        i2 = c4462.f14227;
        C20488 c20488 = new C20488(i2);
        this.f64704 = c20488;
        return c20488;
    }

    @Override // net.sf.sevenzipjbinding.IArchiveExtractCallback
    public final void setOperationResult(ExtractOperationResult extractOperationResult) {
        String str;
        ConcurrentMapC10942 concurrentMapC10942;
        int i;
        int i2;
        String str2;
        ConcurrentMapC10942 concurrentMapC109422;
        int i3;
        String str3;
        if (this.f64706) {
            return;
        }
        if (extractOperationResult == ExtractOperationResult.OK) {
            C7364 c7364 = new C7364(this.f64704.m46943());
            i2 = this.f64705.f14225;
            if (i2 == 1 || i2 == 2) {
                str2 = this.f64705.f14224;
                C3695.m11250(str2, C19883.f64215, true, new C21847(c7364));
            } else if (i2 == 3) {
                str3 = this.f64705.f14224;
                C3695.m11250(str3, C19883.f64196, true, new C2949(3, c7364));
            } else {
                throw new RuntimeException();
            }
            synchronized (this.f64705) {
                this.f64705.notifyAll();
            }
            concurrentMapC109422 = this.f64703.f9595;
            i3 = this.f64705.f14226;
            concurrentMapC109422.remove(Integer.valueOf(i3));
            return;
        }
        C4462 c4462 = this.f64705;
        if (c4462 != null) {
            str = c4462.f14224;
            C3695.m11256(str);
            synchronized (this.f64705) {
                this.f64705.notifyAll();
            }
            concurrentMapC10942 = this.f64703.f9595;
            i = this.f64705.f14226;
            concurrentMapC10942.remove(Integer.valueOf(i));
        }
    }
}

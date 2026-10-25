package l;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.IOException;

/* compiled from: M799 */
/* renamed from: l.ۗۗۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2965 implements InterfaceC12842 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C4376 f9411;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10850 f9412;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12053 f9413;

    @Override // l.InterfaceC12842
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean mo9070() {
        return false;
    }

    @Override // l.InterfaceC12842
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo9071() {
    }

    @Override // l.InterfaceC12842
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bitmap mo9068(long j, int i, int i2, InterfaceC19899 interfaceC19899) {
        MediaMetadataRetriever mediaMetadataRetriever;
        Bitmap m29565;
        interfaceC19899.mo21195();
        C10850 c10850 = this.f9412;
        int m27112 = c10850.m27112(j);
        try {
            mediaMetadataRetriever = m9067(m27112).f14057;
            m29565 = C12137.m29565(mediaMetadataRetriever, c10850.m27116(m27112), i, i2);
            return m29565;
        } catch (Throwable unused) {
            C4376 c4376 = this.f9411;
            this.f9411 = null;
            if (c4376 != null) {
                C4376.m13100(c4376);
            }
            return null;
        }
    }

    public C2965(C12053 c12053, C10850 c10850) {
        this.f9413 = c12053;
        this.f9412 = c10850;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2965 m9066(C12053 c12053) {
        if (Build.VERSION.SDK_INT >= 23) {
            InterfaceC7505 m29433 = c12053.m29433();
            if (m29433 != null) {
                try {
                    C10850 m1537 = C0265.m1537(m29433);
                    if (m1537 != null && m1537.m27111() != 0) {
                        C2965 c2965 = new C2965(c12053, m1537);
                        m29433.close();
                        return c2965;
                    }
                    m29433.close();
                    return null;
                } catch (Throwable th) {
                    try {
                        m29433.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (m29433 != null) {
                m29433.close();
            }
        }
        return null;
    }

    @Override // l.InterfaceC12842
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C13547 mo9072() {
        MediaMetadataRetriever mediaMetadataRetriever;
        C13547 m29566;
        try {
            C4376 c4376 = this.f9411;
            if (c4376 == null) {
                return null;
            }
            mediaMetadataRetriever = c4376.f14057;
            m29566 = C12137.m29566(mediaMetadataRetriever);
            return m29566;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C4376 m9067(int i) {
        int i2;
        C10850 c10850 = this.f9412;
        C4376 c4376 = this.f9411;
        if (c4376 != null) {
            i2 = c4376.f14055;
            if (i2 == i) {
                return c4376;
            }
        }
        C4376 c43762 = this.f9411;
        C17137 c17137 = null;
        this.f9411 = null;
        if (c43762 != null) {
            C4376.m13100(c43762);
        }
        InterfaceC7505 m29433 = this.f9413.m29433();
        if (m29433 == null) {
            throw new IOException("Missing fragmented MP4 preview metadata handle");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            C17137 c171372 = new C17137(m29433, c10850.m27115(), c10850.m27113(i), c10850.m27114(i));
            try {
                mediaMetadataRetriever.setDataSource(c171372);
                C4376 c43763 = new C4376(i, mediaMetadataRetriever, c171372);
                this.f9411 = c43763;
                return c43763;
            } catch (Throwable th) {
                th = th;
                c17137 = c171372;
                try {
                    mediaMetadataRetriever.release();
                } catch (Throwable unused) {
                }
                C0349.m1793(c17137);
                if (c17137 == null) {
                    C0349.m1793(m29433);
                }
                if (th instanceof IOException) {
                    throw th;
                }
                throw new IOException("Failed to open fragmented MP4 preview chunk", th);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // l.InterfaceC12842
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9069() {
        C4376 c4376 = this.f9411;
        this.f9411 = null;
        if (c4376 != null) {
            C4376.m13100(c4376);
        }
    }
}

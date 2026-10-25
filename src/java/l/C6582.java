package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import bin.mt.plus.R;
import java.io.OutputStream;

/* compiled from: Q7Z8 */
/* renamed from: l.ۜۛܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6582 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20289;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20694 f20290;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20291;

    public C6582(C20694 c20694, int i, int i2) {
        this.f20290 = c20694;
        this.f20289 = i;
        this.f20291 = i2;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f20290.f66667.f28549.m39056(), R.string.MT_Protector_res_0x7f120b85);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i = this.f20289;
        int i2 = this.f20291;
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(4, 131));
        C20694 c20694 = this.f20290;
        canvas.scale(i / c20694.f66666, i2 / c20694.f66665);
        C9405 c9405 = c20694.f66667;
        c9405.f28550.m38401(canvas);
        OutputStream mo23555 = c9405.f28548.mo23555(false);
        try {
            createBitmap.compress(Bitmap.CompressFormat.PNG, 100, mo23555);
            if (mo23555 != null) {
                mo23555.close();
            }
        } catch (Throwable th) {
            if (mo23555 != null) {
                try {
                    mo23555.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C9405 c9405 = this.f20290.f66667;
        c9405.f28549.m39005(c9405.f28548);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f20290.f66667.f28549.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
        C15528.m36596();
    }
}

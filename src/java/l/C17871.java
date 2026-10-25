package l;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import bin.mt.plus.R;
import java.io.OutputStream;

/* compiled from: Q7Z8 */
/* renamed from: l.ᩳۛܿ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17871 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f54581;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17165 f54582;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f54583;

    public C17871(C17165 c17165, int i, int i2) {
        this.f54582 = c17165;
        this.f54581 = i;
        this.f54583 = i2;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f54582.f52592.f43248, R.string.MT_Protector_res_0x7f120b85);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i = this.f54581;
        int i2 = this.f54583;
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(4, 131));
        C14342 c14342 = this.f54582.f52592;
        c14342.f43250.setBounds(0, 0, i, i2);
        c14342.f43250.draw(canvas);
        OutputStream mo23555 = c14342.f43252.mo23555(false);
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
        C14342 c14342 = this.f54582.f52592;
        c14342.f43249.m39005(c14342.f43252);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f54582.f52592.f43248.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
        C15528.m36596();
    }
}

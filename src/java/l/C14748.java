package l;

import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import bin.mt.plus.R;

/* compiled from: K5ZN */
/* renamed from: l.ܳ᩶ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14748 implements InterfaceC19689 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6988 f45031;

    public C14748(C6988 c6988) {
        this.f45031 = c6988;
    }

    @Override // l.InterfaceC19689
    /* renamed from: ֫ */
    public final void mo2594(C11197 c11197, C15495 c15495, long j) {
        Object obj;
        int i;
        int i2 = 0;
        C6988 c6988 = this.f45031;
        c6988.f21571 = c11197;
        Handler m14324 = C4925.m14324();
        obj = C6988.f21566;
        m14324.removeCallbacksAndMessages(obj);
        C6988.m18902(c15495);
        C6988.m18900(j);
        C23921 c23921 = c6988.f21575;
        if (c23921 != null) {
            c6988.f21575 = null;
        }
        if (c23921 != null) {
            i = C6988.m18906(c23921.position());
        } else {
            int i3 = c6988.f21570;
            if (i3 > 0) {
                if (j <= 0 || i3 < j) {
                    i2 = i3;
                } else {
                    c6988.f21570 = 0;
                    if (c6988.f21577) {
                        C8399.m22004(c6988.f21568);
                    }
                }
            }
            i = i2;
        }
        if (!c6988.f21572) {
            c6988.f21570 = -1;
        }
        if (i > 0) {
            C6988.m18903(i);
            C23921 c239212 = new C23921(c11197, i);
            c6988.f21575 = c239212;
            c6988.f21578.mo15847(i, new RunnableC16865(c6988, c239212, c11197));
            return;
        }
        C21100.f68051.mo1669((Object) 0);
        C21100.f68054.mo1669((Object) 0);
        if (c6988.f21573) {
            C6988.m18905(c6988);
        }
    }

    @Override // l.InterfaceC19689
    /* renamed from: ֫ */
    public final void mo2592(long j) {
        C6988.m18900(j);
    }

    @Override // l.InterfaceC19689
    /* renamed from: ۧ */
    public final void mo2597(C11197 c11197, Exception exc) {
        Object obj;
        exc.getClass();
        Handler m14324 = C4925.m14324();
        obj = C6988.f21566;
        m14324.removeCallbacksAndMessages(obj);
        boolean m7191 = C2175.m7191(exc);
        C6988 c6988 = this.f45031;
        if (m7191) {
            long j = c6988.f21569;
            c6988.m18912(true);
            Application m14335 = C4925.m14335();
            int i = ServiceC4166.f13587;
            m14335.startService(new Intent(m14335, (Class<?>) ServiceC4166.class).setAction("bin.mt.media.MusicPlayerService.ACTION_EXIT").putExtra("playbackSessionId", j));
            return;
        }
        C21100.f68048.mo1669(c11197.f33614);
        String message = exc.getMessage();
        if (TextUtils.isEmpty(message)) {
            message = exc.toString();
        }
        C21100.f68057.mo1669(message);
        C21100.f68052.mo1669(message);
        C21100.f68055.mo1669((Object) 0);
        C21100.f68045.mo1669((Object) 0);
        C21100.f68051.mo1669((Object) 0);
        C21100.f68054.mo1669((Object) 0);
        C21100.f68044.mo1669(Boolean.FALSE);
        c6988.f21573 = false;
        Drawable m15923 = C5619.m15923();
        C21100.f68046.mo1669(m15923);
        Bitmap.Config config = Bitmap.Config.RGB_565;
        Bitmap createBitmap = Bitmap.createBitmap(256, 256, config);
        m15923.setBounds(0, 0, 256, 256);
        m15923.draw(new Canvas(createBitmap));
        C21100.f68047.mo1669(createBitmap);
        Bitmap createBitmap2 = Bitmap.createBitmap(256, 256, config);
        new Canvas(createBitmap2).drawColor(C19883.f64200.mo1197());
        C21100.f68049.mo1669(createBitmap2);
    }

    @Override // l.InterfaceC19689
    /* renamed from: ֫ */
    public final void mo2593(C11197 c11197, Exception exc) {
        String message = exc.getMessage();
        if (TextUtils.isEmpty(message)) {
            message = exc.toString();
        }
        C21100.f68057.mo1669(message);
        C21100.f68052.mo1669(message);
        C21100.f68044.mo1669(Boolean.FALSE);
        this.f45031.f21573 = false;
    }

    @Override // l.InterfaceC19689
    /* renamed from: ۧ */
    public final void mo2596(int i) {
        if (this.f45031.f21574) {
            return;
        }
        int i2 = i / 50;
        C5242 c5242 = C21100.f68051;
        Integer num = (Integer) c5242.m1662();
        C11003.requireNonNull(num);
        if (i2 != num.intValue()) {
            c5242.mo1669(Integer.valueOf(i2));
        }
        int m48011 = C21100.m48011(i);
        C5242 c52422 = C21100.f68054;
        Integer num2 = (Integer) c52422.m1662();
        C11003.requireNonNull(num2);
        if (m48011 != num2.intValue()) {
            c52422.mo1669(Integer.valueOf(m48011));
        }
    }

    @Override // l.InterfaceC19689
    /* renamed from: ֫ */
    public final void mo2591(int i) {
        C21100.f68052.mo1669(C4925.m14327(R.string.MT_Protector_res_0x7f120528) + " " + i + "%");
    }

    @Override // l.InterfaceC19689
    /* renamed from: ۧ */
    public final void mo2598(boolean z) {
        if (z) {
            C6988 c6988 = this.f45031;
            if (c6988.f21572) {
                c6988.f21570 = -1;
                c6988.f21572 = false;
                if (c6988.f21577) {
                    C8399.m22004(c6988.f21568);
                }
            }
        }
        C21100.f68044.mo1669(Boolean.valueOf(z));
    }

    @Override // l.InterfaceC19689
    /* renamed from: ֫ */
    public final void mo2590() {
        C6988 c6988 = this.f45031;
        C18340 c18340 = c6988.f21576;
        InterfaceC5577 interfaceC5577 = c6988.f21578;
        if (c6988.f21574) {
            return;
        }
        int m42758 = C18340.m42758();
        if (m42758 == 1) {
            interfaceC5577.mo15849();
            return;
        }
        if (m42758 == 3) {
            interfaceC5577.mo15852();
            c6988.f21573 = false;
            C21100.f68044.mo1669(Boolean.FALSE);
            C21100.f68054.mo1669((Object) 0);
            C21100.f68051.mo1669((Object) 0);
            C5242 c5242 = C21100.f68046;
            c5242.mo1669((Drawable) c5242.m1662());
            return;
        }
        if (c18340.size() == 1) {
            interfaceC5577.mo15849();
        } else {
            c18340.mo16332();
            c6988.m18899();
        }
    }
}

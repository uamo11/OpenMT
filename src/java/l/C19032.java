package l;

import android.content.ContextWrapper;
import android.content.Intent;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: G1PO */
/* renamed from: l.ᩴ᩸ܽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C19032 extends AbstractC6138 {

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public C11271 f59953;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public C18090 f59954;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f59955;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public boolean f59956;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public C18090 f59957;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public C8918 f59958;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f59960;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public AtomicInteger f59959 = new AtomicInteger();

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public C0225 f59961 = new C0225(C17615.f53826 * 2);

    static {
        ApplicationC12518.m30701(141);
    }

    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    public native C17222 mo2780();

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76965;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector_res_0x7f120a2d, m11517("saveAsPath"), C4925.m14327(R.string.MT_Protector_res_0x7f1205b9));
    }

    @Override // l.AbstractC3817
    /* renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector_res_0x7f1205b9);
        m11555(R.string.MT_Protector_res_0x7f120528);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43880(final C19032 c19032, final BufferedOutputStream bufferedOutputStream, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C11787 c11787, C7742 c7742) {
        boolean z6;
        AtomicInteger atomicInteger = c19032.f59959;
        final String str = c11787.f35174;
        C16914 c16914 = c11787.f35171;
        C7980 c7980 = c16914.f51975;
        if (c7980 != null && c16914.f51976 == null) {
            if (!z5 || !str.matches(".*/R\\$[a-z]+")) {
                final C11418 m43884 = c19032.m43884(c16914.f51975);
                c7742.m20752(new InterfaceC14091() { // from class: l.ۡ᩸ܽ
                    @Override // l.InterfaceC14091
                    public final void run() {
                        C19032.m43883(C19032.this, str, bufferedOutputStream, m43884);
                    }
                });
                atomicInteger.incrementAndGet();
                return;
            } else {
                ((C17620) c16914.f51975.f24648.m31395()).m41180();
                try {
                    if (C19738.m45447(c16914.f51975)) {
                        System.out.println("Skip R class: ".concat(str));
                    }
                    return;
                } finally {
                }
            }
        }
        if (c7980 == null && c16914.f51976 != null) {
            if (!z5 || !str.matches(".*/R\\$[a-z]+")) {
                final C11418 m438842 = c19032.m43884(c16914.f51976);
                c7742.m20752(new InterfaceC14091() { // from class: l.ܺ᩸ܽ
                    @Override // l.InterfaceC14091
                    public final void run() {
                        C19032.m43881(C19032.this, str, bufferedOutputStream, m438842);
                    }
                });
                atomicInteger.incrementAndGet();
                return;
            } else {
                ((C17620) c16914.f51976.f24648.m31395()).m41180();
                try {
                    if (C19738.m45447(c16914.f51976)) {
                        System.out.println("Skip R class: ".concat(str));
                    }
                    return;
                } finally {
                }
            }
        }
        c19032.mo11520(str);
        C12918 c12918 = c16914.f51975.f24648;
        C12918 c129182 = c16914.f51976.f24648;
        C17620 c17620 = (C17620) c12918.m31395();
        c17620 = (C17620) c129182.m31395();
        boolean z7 = false;
        try {
            c17620.m41180();
            z6 = true;
            try {
                c17620.m41180();
                try {
                    if (!c16914.f51975.m21296(c16914.f51976, z, z2, z3, z4, z5)) {
                        if (z5 && C19738.m45447(c16914.f51975) && C19738.m45447(c16914.f51976)) {
                            System.out.println("Skip R class: " + str);
                            c17620.m41181();
                            return;
                        }
                        final C11418 m438843 = c19032.m43884(c16914.f51975);
                        final C11418 m438844 = c19032.m43884(c16914.f51976);
                        if (m438843.equals(m438844)) {
                            c19032.m43879(m438843);
                            c19032.m43879(m438844);
                            c17620.m41181();
                            return;
                        }
                        c7742.m20752(new InterfaceC14091() { // from class: l.ۖ᩸ܽ
                            @Override // l.InterfaceC14091
                            public final void run() {
                                C19032.m43882(C19032.this, str, bufferedOutputStream, m438843, m438844);
                            }
                        });
                        atomicInteger.incrementAndGet();
                    }
                    c17620.m41181();
                } catch (Throwable th) {
                    th = th;
                    z7 = true;
                    if (z7) {
                    }
                    if (z6) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            z6 = false;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43883(C19032 c19032, String str, BufferedOutputStream bufferedOutputStream, C11418 c11418) {
        try {
            c19032.f59958.m23012("a/" + str);
            C5773.m16236(bufferedOutputStream, c11418);
            bufferedOutputStream.flush();
        } finally {
            c19032.m43879(c11418);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43881(C19032 c19032, String str, BufferedOutputStream bufferedOutputStream, C11418 c11418) {
        try {
            c19032.f59958.m23012("b/" + str);
            C5773.m16236(bufferedOutputStream, c11418);
            bufferedOutputStream.flush();
        } finally {
            c19032.m43879(c11418);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m43882(C19032 c19032, String str, BufferedOutputStream bufferedOutputStream, C11418 c11418, C11418 c114182) {
        try {
            c19032.f59958.m23012("a/" + str);
            C5773.m16236(bufferedOutputStream, c11418);
            bufferedOutputStream.flush();
            c19032.f59958.m23012("b/" + str);
            C5773.m16236(bufferedOutputStream, c114182);
            bufferedOutputStream.flush();
        } finally {
            c19032.m43879(c11418);
            c19032.m43879(c114182);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11418 m43884(C7980 c7980) {
        C0225 c0225 = this.f59961;
        C22357 c22357 = this.f59953.get();
        C12918 c12918 = c7980.f24648;
        C17620 c17620 = (C17620) c12918.m31395();
        c22357.f72435 = c12918.mo27437().f24463;
        c17620.m41180();
        try {
            try {
                C11418 c11418 = (C11418) c0225.m1479();
                if (c11418 == null) {
                    c11418 = new C11418();
                } else {
                    c11418.m28185(0);
                }
                C21652.m48913(new C4215(new C22706(c11418)), c7980, c22357);
                return c11418;
            } finally {
                c17620.m41181();
            }
        } catch (IOException | Error | RuntimeException e) {
            C11418 c114182 = (C11418) c0225.m1479();
            if (c114182 == null) {
                c114182 = new C11418();
            } else {
                c114182.m28185(0);
            }
            c114182.m28186(C3939.m11987(e));
            return c114182;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43879(C11418 c11418) {
        this.f59961.m1477(c11418);
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        this.f59956 = true;
        m43878(main, c17222);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43878(ContextWrapper contextWrapper, C17222 c17222) {
        C8918 c8918 = this.f59958;
        if (c8918 != null) {
            C0349.m1793(c8918);
            this.f59958 = null;
        }
        if (c17222.m40526()) {
            if (this.f59959.get() == 0) {
                this.f59960.mo23552();
                C21374.m48463(R.string.MT_Protector_res_0x7f120272);
            } else {
                Intent intent = new Intent(contextWrapper, (Class<?>) ActivityC22006.class);
                intent.setData(this.f59960.m36522());
                intent.putExtra("savedAsPath", m11556("saveAsPath"));
                contextWrapper.startActivity(intent);
            }
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        AbstractC15440 abstractC15440;
        if (!this.f59956) {
            m43878(C4925.m14335(), c17222);
        }
        C0349.m1793(this.f59957);
        C0349.m1793(this.f59954);
        C8918 c8918 = this.f59958;
        if (c8918 != null) {
            C0349.m1793(c8918);
        }
        if (!c17222.m40526() && (abstractC15440 = this.f59960) != null) {
            abstractC15440.mo23552();
        }
        AbstractC15440 abstractC154402 = this.f59955;
        if (abstractC154402 != null) {
            abstractC154402.mo23552();
        }
        C15528.m36596();
    }
}

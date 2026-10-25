package l;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.alipay.sdk.m.t0.b;
import com.google.android.material.slider.BasicLabelFormatter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: V8T2 */
/* renamed from: l.᩶ۙ֫, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19936 implements Handler.Callback, InterfaceC20835, InterfaceC0557, InterfaceC4372, InterfaceC23274, InterfaceC10017, InterfaceC22569, InterfaceC22618 {

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public static final long f64538 = C3603.m11037(10000L);

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final C15449 f64539;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public final C12133 f64540;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f64541;

    /* renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f64542;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public C18273 f64543;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13257 f64544;

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final long f64545;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final C22485 f64546;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f64547;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public C22052 f64548;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final Looper f64549;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f64550;

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public long f64551;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f64552;

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC5497 f64553;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f64554;

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public boolean f64555;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f64557;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public C22052 f64558;

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public final C20369 f64559;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1263 f64560;

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public long f64561;

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public boolean f64563;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f64564;

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public final boolean[] f64565;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f64566;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18065[] f64567;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC16427 f64568;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public boolean f64569;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f64570;

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public int f64571;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final C2961 f64572;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public boolean f64573;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public final C13830 f64574;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f64575;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC12879 f64576;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C14101 f64578;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public C9599 f64579;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC10058 f64580;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public boolean f64581;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public C12838 f64582;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public C14995 f64583;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20453 f64584;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public final C6488 f64585;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC19477 f64588;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC19251 f64590;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC19251 f64592;

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public final C14536[] f64593;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public int f64594;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public boolean f64595;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public long f64591 = -9223372036854775807L;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public boolean f64586 = false;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public C2751 f64589 = C2751.f8557;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public float f64587 = 1.0f;

    /* renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public C20888 f64577 = C20888.f67585;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public long f64556 = -9223372036854775807L;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public long f64562 = -9223372036854775807L;

    @Override // l.InterfaceC19588
    /* renamed from: ֫ */
    public final void mo11119(InterfaceC0536 interfaceC0536) {
        this.f64592.mo17757(9, (InterfaceC9546) interfaceC0536).mo43089();
    }

    public C19936(Context context, InterfaceC1837[] interfaceC1837Arr, InterfaceC1837[] interfaceC1837Arr2, AbstractC5497 abstractC5497, C1263 c1263, InterfaceC10058 interfaceC10058, InterfaceC13257 interfaceC13257, int i, boolean z, InterfaceC19477 interfaceC19477, C9599 c9599, C10575 c10575, long j, Looper looper, C14185 c14185, C15449 c15449, C13830 c13830, final InterfaceC22618 interfaceC22618) {
        this.f64539 = c15449;
        this.f64553 = abstractC5497;
        this.f64560 = c1263;
        this.f64580 = interfaceC10058;
        this.f64544 = interfaceC13257;
        this.f64571 = i;
        this.f64595 = z;
        this.f64579 = c9599;
        this.f64576 = c10575;
        this.f64545 = j;
        this.f64568 = c14185;
        this.f64574 = c13830;
        this.f64588 = interfaceC19477;
        this.f64547 = interfaceC10058.mo25242();
        this.f64542 = interfaceC10058.mo25240();
        AbstractC4846 abstractC4846 = AbstractC4846.f15313;
        C12838 m31224 = C12838.m31224(c1263);
        this.f64582 = m31224;
        this.f64583 = new C14995(m31224);
        this.f64567 = new InterfaceC18065[interfaceC1837Arr.length];
        this.f64565 = new boolean[interfaceC1837Arr.length];
        InterfaceC16653 mo15627 = abstractC5497.mo15627();
        this.f64593 = new C14536[interfaceC1837Arr.length];
        boolean z2 = false;
        for (int i2 = 0; i2 < interfaceC1837Arr.length; i2++) {
            interfaceC1837Arr[i2].mo6086(i2, c13830, c14185);
            this.f64567[i2] = interfaceC1837Arr[i2].mo6093();
            if (mo15627 != null) {
                ((AbstractC4930) this.f64567[i2]).m14358(mo15627);
            }
            InterfaceC1837 interfaceC1837 = interfaceC1837Arr2[i2];
            if (interfaceC1837 != null) {
                interfaceC1837.mo6086(i2, c13830, c14185);
                z2 = true;
            }
            this.f64593[i2] = new C14536(interfaceC1837Arr[i2], interfaceC1837Arr2[i2], i2);
        }
        this.f64570 = z2;
        this.f64578 = new C14101(this, c14185);
        this.f64557 = new ArrayList();
        this.f64559 = new C20369();
        this.f64546 = new C22485();
        abstractC5497.m15622(this, interfaceC13257);
        this.f64566 = true;
        InterfaceC19251 mo33832 = c14185.mo33832(looper, null);
        this.f64590 = mo33832;
        this.f64585 = new C6488(interfaceC19477, mo33832, new C18524(this));
        this.f64572 = new C2961(this, interfaceC19477, mo33832, c13830);
        C12133 c12133 = new C12133();
        this.f64540 = c12133;
        Looper m29552 = c12133.m29552();
        this.f64549 = m29552;
        InterfaceC19251 mo338322 = c14185.mo33832(m29552, this);
        this.f64592 = mo338322;
        this.f64584 = new C20453(context, m29552, this);
        mo338322.mo17757(35, new InterfaceC22618() { // from class: l.᩵ۙ֫
            @Override // l.InterfaceC22618
            /* renamed from: ֫ */
            public final void mo24148(long j2, long j3, C8353 c8353, MediaFormat mediaFormat) {
                C19936 c19936 = C19936.this;
                c19936.getClass();
                interfaceC22618.mo24148(j2, j3, c8353, mediaFormat);
                c19936.mo24148(j2, j3, c8353, mediaFormat);
            }
        }).mo43089();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m45969(C11428 c11428) {
        synchronized (c11428) {
        }
        try {
            c11428.m28239().mo13450(c11428.m28241(), c11428.m28238());
        } finally {
            c11428.m28237(true);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17071 m45927(C19936 c19936, C14248 c14248, long j) {
        InterfaceC18065[] interfaceC18065Arr = c19936.f64567;
        AbstractC5497 abstractC5497 = c19936.f64553;
        C12552 mo25245 = c19936.f64580.mo25245();
        C2961 c2961 = c19936.f64572;
        C1263 c1263 = c19936.f64560;
        c19936.f64589.getClass();
        return new C17071(interfaceC18065Arr, j, abstractC5497, mo25245, c2961, c14248, c1263);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m46015() {
        this.f64592.mo17754(29).mo43089();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45999(int i, int i2, boolean z) {
        this.f64592.mo17755(1, z ? 1 : 0, i | (i2 << 4)).mo43089();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46010(int i) {
        this.f64592.mo17755(11, i, 0).mo43089();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46012(boolean z) {
        this.f64592.mo17755(12, z ? 1 : 0, 0).mo43089();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46003(AbstractC4846 abstractC4846, int i, long j) {
        this.f64592.mo17757(3, new C22052(abstractC4846, i, j)).mo43089();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46011(C2730 c2730) {
        this.f64592.mo17757(4, c2730).mo43089();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46007(boolean z) {
        this.f64592.mo17757(36, Boolean.valueOf(z)).mo43089();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46006(C20888 c20888) {
        this.f64592.mo17757(38, c20888).mo43089();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m46009() {
        this.f64592.mo17754(6).mo43089();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46000(int i, long j, InterfaceC1242 interfaceC1242, ArrayList arrayList) {
        this.f64592.mo17757(17, new C5118(i, j, interfaceC1242, arrayList)).mo43089();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46001(int i, InterfaceC1242 interfaceC1242) {
        this.f64592.mo17756(20, i, interfaceC1242).mo43089();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46005(C18231 c18231) {
        this.f64592.mo17756(31, 0, c18231).mo43089();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m45978(int i) {
        C12838 c12838 = this.f64582;
        m45929(i, c12838.f38568, c12838.f38579, c12838.f38571);
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m45959() {
        float f = this.f64587;
        this.f64587 = f;
        float m46852 = f * this.f64584.m46852();
        for (C14536 c14536 : this.f64593) {
            c14536.m34693(m46852);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45952(InterfaceC22618 interfaceC22618) {
        for (C14536 c14536 : this.f64593) {
            c14536.m34705(interfaceC22618);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46004(C11428 c11428) {
        if (this.f64569 || !this.f64549.getThread().isAlive()) {
            C19956.m46037("Ignoring messages sent after release.");
            c11428.m28237(false);
        } else {
            this.f64592.mo17757(14, c11428).mo43089();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m46008(long j, Object obj) {
        if (this.f64569 || !this.f64549.getThread().isAlive()) {
            return true;
        }
        C14310 c14310 = new C14310(this.f64568);
        this.f64592.mo17757(30, new Pair(obj, c14310)).mo43089();
        if (j != -9223372036854775807L) {
            return c14310.m34148(j);
        }
        return true;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m46013() {
        if (this.f64569 || !this.f64549.getThread().isAlive()) {
            return true;
        }
        this.f64569 = true;
        C14310 c14310 = new C14310(this.f64568);
        this.f64592.mo17757(7, c14310).mo43089();
        return c14310.m34148(this.f64545);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Looper m46014() {
        return this.f64549;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m46016() {
        InterfaceC19251 interfaceC19251 = this.f64592;
        interfaceC19251.mo17765(2);
        interfaceC19251.mo17763(22);
    }

    @Override // l.InterfaceC20835
    /* renamed from: ֫ */
    public final void mo11120(InterfaceC9546 interfaceC9546) {
        this.f64592.mo17757(8, interfaceC9546).mo43089();
    }

    @Override // l.InterfaceC0557
    /* renamed from: ֫ */
    public final void mo2303() {
        this.f64592.mo17763(10);
    }

    @Override // l.InterfaceC0557
    /* renamed from: ۧ */
    public final void mo2304() {
        this.f64592.mo17763(26);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46002(C2730 c2730) {
        this.f64592.mo17757(16, c2730).mo43089();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m46017() {
        this.f64592.mo17763(34);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45998(int i) {
        this.f64592.mo17755(33, i, 0).mo43089();
    }

    @Override // l.InterfaceC22618
    /* renamed from: ֫ */
    public final void mo24148(long j, long j2, C8353 c8353, MediaFormat mediaFormat) {
        if (this.f64581) {
            this.f64592.mo17754(37).mo43089();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C18273 c18273;
        int i;
        C15894 c15894;
        C17071 m17917;
        try {
            int i2 = message.what;
            C20453 c20453 = this.f64584;
            switch (i2) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i3 = message.arg2;
                    this.f64583.m35523(1);
                    m45929(c20453.m46853(this.f64582.f38569, z), i3 >> 4, i3 & 15, z);
                    break;
                case 2:
                    m45977();
                    break;
                case 3:
                    m45951((C22052) message.obj, true);
                    break;
                case 4:
                    m45980((C2730) message.obj);
                    break;
                case 5:
                    m45944((C9599) message.obj);
                    break;
                case 6:
                    m45954(false, true);
                    break;
                case 7:
                    m45945((C14310) message.obj);
                    return true;
                case 8:
                    m45981((InterfaceC9546) message.obj);
                    break;
                case 9:
                    m45968((InterfaceC9546) message.obj);
                    break;
                case 10:
                    m45964();
                    break;
                case 11:
                    m45985(message.arg1);
                    break;
                case 12:
                    m45997(message.arg1 != 0);
                    break;
                case 13:
                    m45953(message.arg1 != 0, (C14310) message.obj);
                    break;
                case 14:
                    m45982((C11428) message.obj);
                    break;
                case 15:
                    m45988((C11428) message.obj);
                    break;
                case 16:
                    C2730 c2730 = (C2730) message.obj;
                    m45937(c2730, c2730.f8510, true, false);
                    break;
                case 17:
                    m45942((C5118) message.obj);
                    break;
                case 18:
                    m45943((C5118) message.obj, message.arg1);
                    break;
                case 19:
                    m45935((C0884) message.obj);
                    break;
                case 20:
                    m45931(message.arg1, message.arg2, (InterfaceC1242) message.obj);
                    break;
                case 21:
                    m45936((InterfaceC1242) message.obj);
                    break;
                case 22:
                    m45963();
                    break;
                case 23:
                    m45986(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    m45966();
                    break;
                case 26:
                    m45964();
                    m45989(true);
                    break;
                case 27:
                    m45930(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    m45938((C2751) message.obj);
                    break;
                case 29:
                    m45918();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    m45934(pair.first, (C14310) pair.second);
                    break;
                case 31:
                    m45948((C18231) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    float floatValue = ((Float) message.obj).floatValue();
                    this.f64587 = floatValue;
                    float m46852 = floatValue * c20453.m46852();
                    for (C14536 c14536 : this.f64593) {
                        c14536.m34693(m46852);
                    }
                    break;
                case 33:
                    m45978(message.arg1);
                    break;
                case 34:
                    m45959();
                    break;
                case 35:
                    m45952((InterfaceC22618) message.obj);
                    break;
                case 36:
                    m45975(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.f64581 = false;
                    C22052 c22052 = this.f64548;
                    if (c22052 != null) {
                        m45951(c22052, false);
                        this.f64548 = null;
                        break;
                    }
                    break;
                case 38:
                    m45970((C20888) message.obj);
                    break;
            }
        } catch (C9080 e) {
            boolean z2 = e.f27517;
            int i4 = e.f27518;
            if (i4 == 1) {
                r2 = z2 ? 3001 : 3003;
            } else if (i4 == 4) {
                r2 = z2 ? 3002 : 3004;
            }
            m45933(e, r2);
        } catch (C19272 e2) {
            m45933(e2, e2.f60648);
        } catch (IOException e3) {
            m45933(e3, 2000);
        } catch (RuntimeException e4) {
            C18273 m42604 = C18273.m42604(e4, ((e4 instanceof IllegalStateException) || (e4 instanceof IllegalArgumentException)) ? 1004 : 1000);
            C19956.m46034("Playback error", m42604);
            m45954(true, false);
            this.f64582 = this.f64582.m31233(m42604);
        } catch (C8571 e5) {
            m45933(e5, b.c);
        } catch (C18273 e6) {
            C18273 c182732 = e6;
            int i5 = c182732.f56812;
            C6488 c6488 = this.f64585;
            if (i5 == 1 && (m17917 = c6488.m17917()) != null && c182732.f56811 == null) {
                c182732 = c182732.m42606(m17917.f52336.f42930);
            }
            int i6 = c182732.f56812;
            InterfaceC19251 interfaceC19251 = this.f64592;
            if (i6 == 1 && (c15894 = c182732.f56811) != null && m45957(c182732.f56814, c15894)) {
                this.f64554 = true;
                m45965();
                C17071 m17906 = c6488.m17906();
                C17071 m17911 = c6488.m17911();
                if (c6488.m17911() != m17906) {
                    while (m17911 != null && m17911.m40068() != m17906) {
                        m17911 = m17911.m40068();
                    }
                }
                c6488.m17897(m17911);
                if (this.f64582.f38569 != 4) {
                    m45991();
                    interfaceC19251.mo17763(2);
                }
            } else {
                C18273 c182733 = this.f64543;
                if (c182733 != null) {
                    c182733.addSuppressed(c182732);
                    c182732 = this.f64543;
                }
                C18273 c182734 = c182732;
                if (c182734.f56812 != 1 || c6488.m17911() == c6488.m17917()) {
                    c18273 = c182734;
                } else {
                    while (c6488.m17911() != c6488.m17917()) {
                        c6488.m17901();
                    }
                    C17071 m179112 = c6488.m17911();
                    C22632.m50628(m179112);
                    m45917();
                    C14248 c14248 = m179112.f52336;
                    C15894 c158942 = c14248.f42930;
                    long j = c14248.f42927;
                    c18273 = c182734;
                    this.f64582 = m45926(c158942, j, c14248.f42933, j, true, 0);
                }
                if (c18273.f56816 && (this.f64543 == null || (i = c18273.f49707) == 5004 || i == 5003)) {
                    C19956.m46036("Recoverable renderer error", c18273);
                    if (this.f64543 == null) {
                        this.f64543 = c18273;
                    }
                    interfaceC19251.mo17761(interfaceC19251.mo17757(25, c18273));
                } else {
                    C19956.m46034("Playback error", c18273);
                    m45954(true, false);
                    this.f64582 = this.f64582.m31233(c18273);
                }
            }
        } catch (C22154 e7) {
            m45933(e7, e7.f71901);
        }
        m45917();
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45933(IOException iOException, int i) {
        C18273 m42603 = C18273.m42603(iOException, i);
        C17071 m17911 = this.f64585.m17911();
        if (m17911 != null) {
            m42603 = m42603.m42606(m17911.f52336.f42930);
        }
        C19956.m46034("Playback error", m42603);
        m45954(false, false);
        this.f64582 = this.f64582.m31233(m42603);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m45974(int i) {
        C12838 c12838 = this.f64582;
        if (c12838.f38569 != i) {
            if (i != 2) {
                this.f64556 = -9223372036854775807L;
            }
            if (i != 3 && c12838.f38576) {
                this.f64582 = c12838.m31236(false);
            }
            this.f64582 = this.f64582.m31227(i);
        }
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m45917() {
        boolean z;
        this.f64583.m35524(this.f64582);
        z = this.f64583.f45745;
        if (z) {
            C15700.m37021(this.f64539.f47307, this.f64583);
            this.f64583 = new C14995(this.f64582);
        }
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m45918() {
        this.f64583.m35523(1);
        m45955(false, false, false, true);
        this.f64580.mo25239(this.f64574);
        m45974(this.f64582.f38560.m14110() ? 4 : 2);
        C12838 c12838 = this.f64582;
        boolean z = c12838.f38571;
        m45929(this.f64584.m46853(c12838.f38569, z), c12838.f38568, c12838.f38579, z);
        this.f64572.m9057(this.f64544.mo28942());
        this.f64592.mo17763(2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45942(C5118 c5118) {
        int i;
        List list;
        InterfaceC1242 interfaceC1242;
        List list2;
        InterfaceC1242 interfaceC12422;
        int i2;
        long j;
        this.f64583.m35523(1);
        i = c5118.f16037;
        if (i != -1) {
            list2 = c5118.f16034;
            interfaceC12422 = c5118.f16036;
            C13543 c13543 = new C13543(list2, interfaceC12422);
            i2 = c5118.f16037;
            j = c5118.f16035;
            this.f64558 = new C22052(c13543, i2, j);
        }
        list = c5118.f16034;
        interfaceC1242 = c5118.f16036;
        m45941(this.f64572.m9054(list, interfaceC1242), false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45943(C5118 c5118, int i) {
        List list;
        InterfaceC1242 interfaceC1242;
        this.f64583.m35523(1);
        C2961 c2961 = this.f64572;
        if (i == -1) {
            i = c2961.m9061();
        }
        list = c5118.f16034;
        interfaceC1242 = c5118.f16036;
        m45941(c2961.m9053(i, list, interfaceC1242), false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45935(C0884 c0884) {
        this.f64583.m35523(1);
        c0884.getClass();
        m45941(this.f64572.m9062(), false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45931(int i, int i2, InterfaceC1242 interfaceC1242) {
        this.f64583.m35523(1);
        m45941(this.f64572.m9052(i, i2, interfaceC1242), false);
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m45963() {
        m45941(this.f64572.m9050(), true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45936(InterfaceC1242 interfaceC1242) {
        this.f64583.m35523(1);
        m45941(this.f64572.m9055(interfaceC1242), false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45930(int i, int i2, List list) {
        this.f64583.m35523(1);
        m45941(this.f64572.m9051(i, i2, list), false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45948(C18231 c18231, boolean z) {
        this.f64553.mo15625(c18231);
        if (!z) {
            c18231 = null;
        }
        C20453 c20453 = this.f64584;
        c20453.m46854(c18231);
        C12838 c12838 = this.f64582;
        boolean z2 = c12838.f38571;
        m45929(c20453.m46853(c12838.f38569, z2), c12838.f38568, c12838.f38579, z2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45929(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = 0;
        }
        C12838 c12838 = this.f64582;
        if (c12838.f38571 == z2 && c12838.f38568 == i2 && c12838.f38579 == i3) {
            return;
        }
        this.f64582 = c12838.m31228(i3, i2, z2);
        m45971(false, false);
        C6488 c6488 = this.f64585;
        for (C17071 m17911 = c6488.m17911(); m17911 != null; m17911 = m17911.m40068()) {
            for (InterfaceC9731 interfaceC9731 : m17911.m40070().f4478) {
                if (interfaceC9731 != null) {
                    interfaceC9731.mo2379(z2);
                }
            }
        }
        if (!m45995()) {
            m45993();
            m45960();
            C12838 c128382 = this.f64582;
            if (c128382.f38576) {
                this.f64582 = c128382.m31236(false);
            }
            c6488.m17904(this.f64551);
            return;
        }
        int i4 = this.f64582.f38569;
        InterfaceC19251 interfaceC19251 = this.f64592;
        if (i4 == 3) {
            this.f64578.m33714();
            m45996();
            interfaceC19251.mo17763(2);
        } else if (i4 == 2) {
            interfaceC19251.mo17763(2);
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m45986(boolean z) {
        this.f64586 = z;
        m45976();
        if (this.f64575) {
            C6488 c6488 = this.f64585;
            if (c6488.m17917() != c6488.m17911()) {
                m45989(true);
                m45984(false);
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m45985(int i) {
        this.f64571 = i;
        int m17894 = this.f64585.m17894(this.f64582.f38560, i);
        if ((m17894 & 1) != 0) {
            m45989(true);
        } else if ((m17894 & 2) != 0) {
            m45965();
        }
        m45984(false);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m45997(boolean z) {
        this.f64595 = z;
        int m17896 = this.f64585.m17896(this.f64582.f38560, z);
        if ((m17896 & 1) != 0) {
            m45989(true);
        } else if ((m17896 & 2) != 0) {
            m45965();
        }
        m45984(false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45938(C2751 c2751) {
        this.f64589 = c2751;
        this.f64585.m17905(this.f64582.f38560, c2751);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m45989(boolean z) {
        C15894 c15894 = this.f64585.m17911().f52336.f42930;
        long m45922 = m45922(c15894, this.f64582.f38563, true, false);
        if (m45922 != this.f64582.f38563) {
            C12838 c12838 = this.f64582;
            this.f64582 = m45926(c15894, m45922, c12838.f38564, c12838.f38570, z, 5);
        }
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m45996() {
        C17071 m17911 = this.f64585.m17911();
        if (m17911 == null) {
            return;
        }
        C1263 m40070 = m17911.m40070();
        int i = 0;
        while (true) {
            C14536[] c14536Arr = this.f64593;
            if (i >= c14536Arr.length) {
                return;
            }
            if (m40070.m4319(i)) {
                c14536Arr[i].m34709();
            }
            i++;
        }
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private void m45993() {
        this.f64578.m33717();
        for (C14536 c14536 : this.f64593) {
            c14536.m34707();
        }
    }

    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, l.ۢۧۧ] */
    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m45960() {
        C17071 m17911 = this.f64585.m17911();
        if (m17911 == null) {
            return;
        }
        long mo11122 = m17911.f52341 ? m17911.f52337.mo11122() : -9223372036854775807L;
        if (mo11122 != -9223372036854775807L) {
            if (!m17911.m40077()) {
                this.f64585.m17897(m17911);
                m45984(false);
                m45991();
            }
            m45967(mo11122);
            if (mo11122 != this.f64582.f38563) {
                C12838 c12838 = this.f64582;
                this.f64582 = m45926(c12838.f38574, mo11122, c12838.f38564, mo11122, true, 5);
            }
        } else {
            long m33713 = this.f64578.m33713(m17911 != this.f64585.m17917());
            this.f64551 = m33713;
            long m40072 = m17911.m40072(m33713);
            long j = this.f64582.f38563;
            if (!this.f64557.isEmpty() && !this.f64582.f38574.m37669()) {
                if (this.f64566) {
                    j--;
                    this.f64566 = false;
                }
                C12838 c128382 = this.f64582;
                int mo14098 = c128382.f38560.mo14098(c128382.f38574.f49112);
                int min = Math.min(this.f64594, this.f64557.size());
                C7940 c7940 = min > 0 ? (C7940) this.f64557.get(min - 1) : null;
                while (c7940 != null && (mo14098 < 0 || (mo14098 == 0 && 0 > j))) {
                    int i = min - 1;
                    c7940 = i > 0 ? (C7940) this.f64557.get(min - 2) : null;
                    min = i;
                }
                if (min < this.f64557.size()) {
                }
                this.f64594 = min;
            }
            if (this.f64578.mo13463()) {
                boolean z = !this.f64583.f45747;
                C12838 c128383 = this.f64582;
                this.f64582 = m45926(c128383.f38574, m40072, c128383.f38564, m40072, z, 6);
            } else {
                C12838 c128384 = this.f64582;
                c128384.f38563 = m40072;
                c128384.f38572 = SystemClock.elapsedRealtime();
            }
        }
        this.f64582.f38562 = this.f64585.m17915().m40058();
        C12838 c128385 = this.f64582;
        c128385.f38565 = m45920(c128385.f38562);
        C12838 c128386 = this.f64582;
        if (c128386.f38571 && c128386.f38569 == 3 && m45958(c128386.f38560, c128386.f38574)) {
            C12838 c128387 = this.f64582;
            if (c128387.f38578.f8510 == 1.0f) {
                float m26567 = ((C10575) this.f64576).m26567(m45921(c128387.f38560, c128387.f38574.f49112, c128387.f38563), this.f64582.f38565);
                if (this.f64578.mo13468().f8510 != m26567) {
                    C2730 c2730 = new C2730(m26567, this.f64582.f38578.f8508);
                    this.f64592.mo17765(16);
                    this.f64578.mo13455(c2730);
                    m45937(this.f64582.f38578, this.f64578.mo13468().f8510, false, false);
                }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m45980(C2730 c2730) {
        this.f64592.mo17765(16);
        C14101 c14101 = this.f64578;
        c14101.mo13455(c2730);
        C2730 mo13468 = c14101.mo13468();
        m45937(mo13468, mo13468.f8510, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01d3, code lost:
    
        if (r13[r1].m34719() != (-2)) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ea, code lost:
    
        if (l.C9786.m24798(r3[r1].mo2382().f25614, r3[r1].mo2382().f25619) != false) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f2, code lost:
    
        if (r13[r1].m34716() != false) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f4, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f6, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01f9, code lost:
    
        if (r0 != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01fb, code lost:
    
        r0 = r15.m40074();
        r2 = r13.length;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0201, code lost:
    
        if (r3 >= r2) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0203, code lost:
    
        r13[r3].m34695(r0);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x020f, code lost:
    
        if (r15.m40077() != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0211, code lost:
    
        r14.m17897(r15);
        m45984(false);
        m45991();
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x01bd, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x01b1, code lost:
    
        if (r15.f52337.mo11122() != r2) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a1, code lost:
    
        if (r27.f64591 == (-9223372036854775807L)) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b3, code lost:
    
        r27.f64591 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b5, code lost:
    
        if (r8 == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b9, code lost:
    
        if (r27.f64554 != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bb, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01be, code lost:
    
        if (r0 == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c0, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c2, code lost:
    
        if (r1 >= r13.length) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c4, code lost:
    
        r2 = r7.m4319(r1);
        r3 = r7.f4478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ca, code lost:
    
        if (r2 == false) goto L413;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0390 A[LOOP:7: B:193:0x038e->B:194:0x0390, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0565  */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX WARN: Type inference failed for: r1v71, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object, l.ۢۧۧ] */
    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m45977() {
        /*
            Method dump skipped, instructions count: 1641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19936.m45977():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45932(final int i, final boolean z) {
        boolean[] zArr = this.f64565;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.f64590.mo17760(new Runnable() { // from class: l.ۖۙ֫
                @Override // java.lang.Runnable
                public final void run() {
                    r2.f64588.mo44870(r0, C19936.this.f64593[i].m34719(), z);
                }
            });
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m45921(AbstractC4846 abstractC4846, Object obj, long j) {
        long elapsedRealtime;
        C22485 c22485 = this.f64546;
        int i = abstractC4846.mo14105(obj, c22485).f72806;
        C20369 c20369 = this.f64559;
        abstractC4846.m14106(i, c20369);
        if (c20369.f65762 == -9223372036854775807L || !c20369.m46687() || !c20369.f65759) {
            return -9223372036854775807L;
        }
        long j2 = c20369.f65758;
        if (j2 == -9223372036854775807L) {
            elapsedRealtime = System.currentTimeMillis();
        } else {
            elapsedRealtime = j2 + SystemClock.elapsedRealtime();
        }
        return C3603.m11014(elapsedRealtime - c20369.f65762) - (j + c22485.f72804);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m45958(AbstractC4846 abstractC4846, C15894 c15894) {
        if (c15894.m37669() || abstractC4846.m14110()) {
            return false;
        }
        int i = abstractC4846.mo14105(c15894.f49112, this.f64546).f72806;
        C20369 c20369 = this.f64559;
        abstractC4846.m14106(i, c20369);
        return c20369.m46687() && c20369.f65759 && c20369.f65762 != -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c1 A[Catch: all -> 0x0189, TryCatch #1 {all -> 0x0189, blocks: (B:11:0x00b7, B:13:0x00c1, B:19:0x00c8, B:21:0x00ce, B:22:0x00d1, B:23:0x00d6, B:25:0x00e0, B:27:0x00e8, B:31:0x00f0, B:35:0x00fe, B:36:0x0103, B:37:0x010b, B:39:0x011b, B:43:0x0125, B:45:0x0132, B:48:0x0141, B:51:0x0152), top: B:10:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c5  */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, l.ۢۧۧ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m45951(l.C22052 r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19936.m45951(l.᩹ۙ֫, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, l.ۢۧۧ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m45922(C15894 c15894, long j, boolean z, boolean z2) {
        C14536[] c14536Arr;
        m45993();
        m45971(false, true);
        if (z2 || this.f64582.f38569 == 3) {
            m45974(2);
        }
        C6488 c6488 = this.f64585;
        C17071 m17911 = c6488.m17911();
        C17071 c17071 = m17911;
        while (c17071 != null && !c15894.equals(c17071.f52336.f42930)) {
            c17071 = c17071.m40068();
        }
        if (z || m17911 != c17071 || (c17071 != null && c17071.m40075(j) < 0)) {
            int i = 0;
            while (true) {
                c14536Arr = this.f64593;
                if (i >= c14536Arr.length) {
                    break;
                }
                int m34711 = c14536Arr[i].m34711();
                c14536Arr[i].m34700(this.f64578);
                m45932(i, false);
                this.f64550 -= m34711;
                i++;
            }
            this.f64591 = -9223372036854775807L;
            if (c17071 != null) {
                while (c6488.m17911() != c17071) {
                    c6488.m17901();
                }
                c6488.m17897(c17071);
                c17071.m40069(BasicLabelFormatter.TRILLION);
                m45956(new boolean[c14536Arr.length], c6488.m17917().m40074());
                c17071.f52327 = true;
            }
        }
        m45965();
        if (c17071 != null) {
            ?? r10 = c17071.f52337;
            c6488.m17897(c17071);
            if (!c17071.f52341) {
                c17071.f52336 = c17071.f52336.m33893(j);
            } else if (c17071.f52333) {
                j = r10.mo11114(j);
                r10.mo11117(j - this.f64547, this.f64542);
            }
            m45967(j);
            m45991();
        } else {
            c6488.m17916();
            m45967(j);
        }
        m45984(false);
        this.f64592.mo17763(2);
        return j;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m45967(long j) {
        C17071 m17911 = this.f64585.m17911();
        long m40075 = m17911 == null ? j + BasicLabelFormatter.TRILLION : m17911.m40075(j);
        this.f64551 = m40075;
        this.f64578.m33715(m40075);
        for (C14536 c14536 : this.f64593) {
            c14536.m34701(m17911, this.f64551);
        }
        for (C17071 m179112 = r0.m17911(); m179112 != null; m179112 = m179112.m40068()) {
            for (InterfaceC9731 interfaceC9731 : m179112.m40070().f4478) {
                if (interfaceC9731 != null) {
                    interfaceC9731.mo2387();
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45944(C9599 c9599) {
        this.f64579 = c9599;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m45975(boolean z) {
        if (!z) {
            this.f64581 = false;
            this.f64592.mo17765(37);
            C22052 c22052 = this.f64548;
            if (c22052 != null) {
                m45951(c22052, false);
                this.f64548 = null;
            }
        }
        this.f64563 = z;
        for (C14536 c14536 : this.f64593) {
            c14536.m34704(this.f64563 ? this.f64577 : null);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m45970(C20888 c20888) {
        this.f64577 = c20888;
        for (C14536 c14536 : this.f64593) {
            c14536.m34704(this.f64563 ? this.f64577 : null);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45953(boolean z, C14310 c14310) {
        if (this.f64564 != z) {
            this.f64564 = z;
            if (!z) {
                for (C14536 c14536 : this.f64593) {
                    c14536.m34710();
                }
            }
        }
        if (c14310 != null) {
            c14310.m34151();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45934(Object obj, C14310 c14310) {
        for (C14536 c14536 : this.f64593) {
            c14536.m34696(obj);
        }
        int i = this.f64582.f38569;
        if (i == 3 || i == 2) {
            this.f64592.mo17763(2);
        }
        if (c14310 != null) {
            c14310.m34151();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45954(boolean z, boolean z2) {
        m45955(z || !this.f64564, false, true, false);
        this.f64583.m35523(z2 ? 1 : 0);
        this.f64580.mo25246(this.f64574);
        this.f64584.m46853(1, this.f64582.f38571);
        m45974(1);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45945(C14310 c14310) {
        C12133 c12133 = this.f64540;
        InterfaceC19251 interfaceC19251 = this.f64592;
        try {
            m45955(true, false, true, false);
            C14536[] c14536Arr = this.f64593;
            for (int i = 0; i < c14536Arr.length; i++) {
                ((AbstractC4930) this.f64567[i]).m14354();
                c14536Arr[i].m34725();
            }
            this.f64580.mo25243(this.f64574);
            this.f64584.m46855();
            this.f64553.mo15628();
            m45974(1);
        } finally {
            interfaceC19251.mo17762();
            c12133.m29553();
            c14310.m34151();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c3  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m45955(boolean r33, boolean r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19936.m45955(boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Pair m45924(AbstractC4846 abstractC4846) {
        long j = 0;
        if (abstractC4846.m14110()) {
            return Pair.create(C12838.m31225(), 0L);
        }
        int mo14099 = abstractC4846.mo14099(this.f64595);
        Pair m14100 = abstractC4846.m14100(this.f64559, this.f64546, mo14099, -9223372036854775807L);
        C15894 m17900 = this.f64585.m17900(abstractC4846, m14100.first, 0L);
        long longValue = ((Long) m14100.second).longValue();
        if (m17900.m37669()) {
            Object obj = m17900.f49112;
            C22485 c22485 = this.f64546;
            abstractC4846.mo14105(obj, c22485);
            if (m17900.f49109 == c22485.m50436(m17900.f49108)) {
                c22485.f72800.getClass();
            }
        } else {
            j = longValue;
        }
        return Pair.create(m17900, Long.valueOf(j));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m45982(C11428 c11428) {
        c11428.getClass();
        Looper m28234 = c11428.m28234();
        Looper looper = this.f64549;
        InterfaceC19251 interfaceC19251 = this.f64592;
        if (m28234 == looper) {
            m45969(c11428);
            int i = this.f64582.f38569;
            if (i == 3 || i == 2) {
                interfaceC19251.mo17763(2);
                return;
            }
            return;
        }
        interfaceC19251.mo17757(15, c11428).mo43089();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m45988(final C11428 c11428) {
        Looper m28234 = c11428.m28234();
        if (!m28234.getThread().isAlive()) {
            C19956.m46037("Trying to send message on a dead thread.");
            c11428.m28237(false);
        } else {
            this.f64568.mo33832(m28234, null).mo17760(new Runnable() { // from class: l.ۘۙ֫
                @Override // java.lang.Runnable
                public final void run() {
                    C19936.m45950(C19936.this, c11428);
                }
            });
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45950(C19936 c19936, C11428 c11428) {
        try {
            m45969(c11428);
        } catch (C18273 e) {
            C19956.m46034("Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45939(AbstractC4846 abstractC4846, AbstractC4846 abstractC48462) {
        if (abstractC4846.m14110() && abstractC48462.m14110()) {
            return;
        }
        ArrayList arrayList = this.f64557;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            ((C7940) arrayList.get(size)).getClass();
            throw null;
        }
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m45965() {
        if (this.f64570 && m45994()) {
            for (C14536 c14536 : this.f64593) {
                int m34711 = c14536.m34711();
                c14536.m34714(this.f64578);
                this.f64550 -= m34711 - c14536.m34711();
            }
            this.f64591 = -9223372036854775807L;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m45957(int i, C15894 c15894) {
        C6488 c6488 = this.f64585;
        if (c6488.m17906() == null || !c6488.m17906().f52336.f42930.equals(c15894)) {
            return false;
        }
        return this.f64593[i].m34722(c6488.m17906());
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m45966() {
        m45964();
        m45989(true);
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m45964() {
        float f = this.f64578.mo13468().f8510;
        C17071 m17911 = this.f64585.m17911();
        C17071 m17917 = this.f64585.m17917();
        C1263 c1263 = null;
        boolean z = true;
        while (m17911 != null && m17911.f52341) {
            C12838 c12838 = this.f64582;
            C1263 m40067 = m17911.m40067(f, c12838.f38560, c12838.f38571);
            C1263 c12632 = m17911 == this.f64585.m17911() ? m40067 : c1263;
            C1263 m40070 = m17911.m40070();
            InterfaceC9731[] interfaceC9731Arr = m40067.f4478;
            if (m40070 != null && m40070.f4478.length == interfaceC9731Arr.length) {
                for (int i = 0; i < interfaceC9731Arr.length; i++) {
                    if (m40067.m4320(m40070, i)) {
                    }
                }
                if (m17911 == m17917) {
                    z = false;
                }
                m17911 = m17911.m40068();
                c1263 = c12632;
            }
            if (z) {
                C17071 m179112 = this.f64585.m17911();
                boolean z2 = (this.f64585.m17897(m179112) & 1) != 0;
                boolean[] zArr = new boolean[this.f64593.length];
                c12632.getClass();
                long m40060 = m179112.m40060(c12632, this.f64582.f38563, z2, zArr);
                C12838 c128382 = this.f64582;
                boolean z3 = (c128382.f38569 == 4 || m40060 == c128382.f38563) ? false : true;
                C12838 c128383 = this.f64582;
                this.f64582 = m45926(c128383.f38574, m40060, c128383.f38564, c128383.f38570, z3, 5);
                if (z3) {
                    m45967(m40060);
                }
                m45965();
                boolean[] zArr2 = new boolean[this.f64593.length];
                int i2 = 0;
                while (true) {
                    C14536[] c14536Arr = this.f64593;
                    if (i2 >= c14536Arr.length) {
                        break;
                    }
                    int m34711 = c14536Arr[i2].m34711();
                    zArr2[i2] = this.f64593[i2].m34727();
                    this.f64593[i2].m34703(m179112.f52335[i2], this.f64578, this.f64551, zArr[i2]);
                    if (m34711 - this.f64593[i2].m34711() > 0) {
                        m45932(i2, false);
                    }
                    this.f64550 -= m34711 - this.f64593[i2].m34711();
                    i2++;
                }
                m45956(zArr2, this.f64551);
                m179112.f52327 = true;
            } else {
                this.f64585.m17897(m17911);
                if (m17911.f52341) {
                    long max = Math.max(m17911.f52336.f42927, m17911.m40072(this.f64551));
                    if (this.f64570 && m45994() && this.f64585.m17906() == m17911) {
                        m45965();
                    }
                    m17911.m40059(m40067, max);
                }
            }
            m45984(true);
            if (this.f64582.f38569 != 4) {
                m45991();
                m45960();
                this.f64592.mo17763(2);
                return;
            }
            return;
        }
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private boolean m45961() {
        C17071 m17911 = this.f64585.m17911();
        long j = m17911.f52336.f42925;
        if (m17911.f52341) {
            return j == -9223372036854775807L || this.f64582.f38563 < j || !m45995();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02cb A[Catch: all -> 0x02d8, TryCatch #1 {all -> 0x02d8, blocks: (B:82:0x02c3, B:84:0x02cb, B:85:0x02d0, B:87:0x02d4, B:22:0x02e2, B:24:0x02ec, B:26:0x02f4, B:28:0x02fe, B:30:0x030b, B:33:0x0310, B:36:0x0321), top: B:20:0x0280 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d0 A[Catch: all -> 0x02d8, TryCatch #1 {all -> 0x02d8, blocks: (B:82:0x02c3, B:84:0x02cb, B:85:0x02d0, B:87:0x02d4, B:22:0x02e2, B:24:0x02ec, B:26:0x02f4, B:28:0x02fe, B:30:0x030b, B:33:0x0310, B:36:0x0321), top: B:20:0x0280 }] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m45941(l.AbstractC4846 r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19936.m45941(l.ۙ᩵֫, boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45940(AbstractC4846 abstractC4846, C15894 c15894, AbstractC4846 abstractC48462, C15894 c158942, long j, boolean z) {
        boolean m45958 = m45958(abstractC4846, c15894);
        Object obj = c15894.f49112;
        if (!m45958) {
            C2730 c2730 = c15894.m37669() ? C2730.f8507 : this.f64582.f38578;
            C14101 c14101 = this.f64578;
            if (c14101.mo13468().equals(c2730)) {
                return;
            }
            this.f64592.mo17765(16);
            c14101.mo13455(c2730);
            m45937(this.f64582.f38578, c2730.f8510, false, false);
            return;
        }
        C22485 c22485 = this.f64546;
        int i = abstractC4846.mo14105(obj, c22485).f72806;
        C20369 c20369 = this.f64559;
        abstractC4846.m14106(i, c20369);
        C6236 c6236 = c20369.f65763;
        C10575 c10575 = (C10575) this.f64576;
        c10575.m26570(c6236);
        if (j != -9223372036854775807L) {
            c10575.m26569(m45921(abstractC4846, obj, j));
            return;
        }
        if (!C11003.equals(!abstractC48462.m14110() ? abstractC48462.mo14103(abstractC48462.mo14105(c158942.f49112, c22485).f72806, c20369, 0L).f65761 : null, c20369.f65761) || z) {
            c10575.m26569(-9223372036854775807L);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m45923(C17071 c17071) {
        if (c17071 == null) {
            return 0L;
        }
        long m40071 = c17071.m40071();
        if (!c17071.f52341) {
            return m40071;
        }
        int i = 0;
        while (true) {
            C14536[] c14536Arr = this.f64593;
            if (i >= c14536Arr.length) {
                return m40071;
            }
            if (c14536Arr[i].m34717(c17071)) {
                long m34712 = c14536Arr[i].m34712(c17071);
                if (m34712 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                m40071 = Math.max(m34712, m40071);
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.֡ܽۧ, l.ۢۧۧ] */
    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m45992() {
        C6488 c6488 = this.f64585;
        c6488.m17908();
        C17071 m17918 = c6488.m17918();
        if (m17918 != null) {
            ?? r1 = m17918.f52337;
            if ((!m17918.f52330 || m17918.f52341) && !r1.mo2264()) {
                AbstractC4846 abstractC4846 = this.f64582.f38560;
                if (m17918.f52341) {
                    r1.mo2266();
                }
                if (this.f64580.mo25247()) {
                    if (!m17918.f52330) {
                        long j = m17918.f52336.f42927;
                        m17918.f52330 = true;
                        r1.mo11121(this, j);
                    } else {
                        C5824 c5824 = new C5824();
                        c5824.m16330(m17918.m40072(this.f64551));
                        c5824.m16328(this.f64578.mo13468().f8510);
                        c5824.m16329(this.f64562);
                        m17918.m40063(new C11469(c5824));
                    }
                }
            }
        }
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m45976() {
        C17071 m17911 = this.f64585.m17911();
        this.f64575 = m17911 != null && m17911.f52336.f42934 && this.f64586;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m45981(InterfaceC9546 interfaceC9546) {
        C6488 c6488 = this.f64585;
        boolean m17910 = c6488.m17910(interfaceC9546);
        C14101 c14101 = this.f64578;
        if (m17910) {
            C17071 m17915 = c6488.m17915();
            m17915.getClass();
            if (!m17915.f52341) {
                float f = c14101.mo13468().f8510;
                C12838 c12838 = this.f64582;
                m17915.m40061(f, c12838.f38560, c12838.f38571);
            }
            m45946(m17915.f52336.f42930, m17915.m40073(), m17915.m40070());
            if (m17915 == c6488.m17911()) {
                m45967(m17915.f52336.f42927);
                m45956(new boolean[this.f64593.length], c6488.m17917().m40074());
                m17915.f52327 = true;
                C12838 c128382 = this.f64582;
                C15894 c15894 = c128382.f38574;
                long j = m17915.f52336.f42927;
                this.f64582 = m45926(c15894, j, c128382.f38564, j, false, 5);
            }
            m45991();
            return;
        }
        C17071 m17902 = c6488.m17902(interfaceC9546);
        if (m17902 != null) {
            C22632.m50634(true ^ m17902.f52341);
            float f2 = c14101.mo13468().f8510;
            C12838 c128383 = this.f64582;
            m17902.m40061(f2, c128383.f38560, c128383.f38571);
            if (c6488.m17914(interfaceC9546)) {
                m45992();
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m45968(InterfaceC9546 interfaceC9546) {
        C6488 c6488 = this.f64585;
        if (c6488.m17910(interfaceC9546)) {
            c6488.m17904(this.f64551);
            m45991();
        } else if (c6488.m17914(interfaceC9546)) {
            m45992();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45937(C2730 c2730, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.f64583.m35523(1);
            }
            this.f64582 = this.f64582.m31229(c2730);
        }
        float f2 = c2730.f8510;
        C17071 m17911 = this.f64585.m17911();
        while (true) {
            i = 0;
            if (m17911 == null) {
                break;
            }
            InterfaceC9731[] interfaceC9731Arr = m17911.m40070().f4478;
            int length = interfaceC9731Arr.length;
            while (i < length) {
                InterfaceC9731 interfaceC9731 = interfaceC9731Arr[i];
                if (interfaceC9731 != null) {
                    interfaceC9731.mo2378(f2);
                }
                i++;
            }
            m17911 = m17911.m40068();
        }
        C14536[] c14536Arr = this.f64593;
        int length2 = c14536Arr.length;
        while (i < length2) {
            c14536Arr[i].m34694(f, c2730.f8510);
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, l.ۢۧۧ] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, l.֡ܽۧ] */
    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m45991() {
        long m40072;
        boolean z = false;
        if (m45972(this.f64585.m17915())) {
            C17071 m17915 = this.f64585.m17915();
            long m45920 = m45920(!m17915.f52341 ? 0L : m17915.f52337.mo2267());
            if (m17915 == this.f64585.m17911()) {
                m40072 = m17915.m40072(this.f64551);
            } else {
                m40072 = m17915.m40072(this.f64551) - m17915.f52336.f42927;
            }
            long j = m40072;
            long m26568 = m45958(this.f64582.f38560, m17915.f52336.f42930) ? ((C10575) this.f64576).m26568() : -9223372036854775807L;
            C13830 c13830 = this.f64574;
            AbstractC4846 abstractC4846 = this.f64582.f38560;
            C15894 c15894 = m17915.f52336.f42930;
            float f = this.f64578.mo13468().f8510;
            boolean z2 = this.f64582.f38571;
            C12174 c12174 = new C12174(c13830, abstractC4846, c15894, j, m45920, f, this.f64541, m26568);
            boolean mo25244 = this.f64580.mo25244(c12174);
            C17071 m17911 = this.f64585.m17911();
            if (mo25244 || !m17911.f52341 || m45920 >= 500000 || (this.f64547 <= 0 && !this.f64542)) {
                z = mo25244;
            } else {
                m17911.f52337.mo11117(this.f64582.f38563, false);
                z = this.f64580.mo25244(c12174);
            }
        }
        this.f64573 = z;
        if (z) {
            C17071 m179152 = this.f64585.m17915();
            m179152.getClass();
            C5824 c5824 = new C5824();
            c5824.m16330(m179152.m40072(this.f64551));
            c5824.m16328(this.f64578.mo13468().f8510);
            c5824.m16329(this.f64562);
            m179152.m40063(new C11469(c5824));
        }
        m45962();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.֡ܽۧ, l.ۢۧۧ] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m45972(C17071 c17071) {
        if (c17071 != null) {
            try {
                ?? r1 = c17071.f52337;
                if (!c17071.f52341) {
                    r1.mo11124();
                } else {
                    for (InterfaceC18882 interfaceC18882 : c17071.f52335) {
                        if (interfaceC18882 != null) {
                            interfaceC18882.mo6411();
                        }
                    }
                }
                if ((!c17071.f52341 ? 0L : r1.mo2267()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, l.֡ܽۧ] */
    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m45962() {
        C17071 m17915 = this.f64585.m17915();
        boolean z = this.f64573 || (m17915 != null && m17915.f52337.mo2264());
        C12838 c12838 = this.f64582;
        if (z != c12838.f38573) {
            this.f64582 = c12838.m31234(z);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12838 m45926(C15894 c15894, long j, long j2, long j3, boolean z, int i) {
        List list;
        C17071 m17911;
        boolean z2;
        this.f64566 = (!this.f64566 && j == this.f64582.f38563 && c15894.equals(this.f64582.f38574)) ? false : true;
        m45976();
        C12838 c12838 = this.f64582;
        C6181 c6181 = c12838.f38561;
        C1263 c1263 = c12838.f38567;
        List list2 = c12838.f38577;
        if (this.f64572.m9063()) {
            C17071 m179112 = this.f64585.m17911();
            if (m179112 == null) {
                c6181 = C6181.f18976;
            } else {
                c6181 = m179112.m40073();
            }
            if (m179112 == null) {
                c1263 = this.f64560;
            } else {
                c1263 = m179112.m40070();
            }
            InterfaceC9731[] interfaceC9731Arr = c1263.f4478;
            C1846 c1846 = new C1846();
            boolean z3 = false;
            for (InterfaceC9731 interfaceC9731 : interfaceC9731Arr) {
                if (interfaceC9731 != null) {
                    C23896 c23896 = interfaceC9731.mo2377(0).f25612;
                    if (c23896 == null) {
                        c1846.m16264(new C23896(new InterfaceC14723[0]));
                    } else {
                        c1846.m16264(c23896);
                        z3 = true;
                    }
                }
            }
            AbstractC14545 m6131 = z3 ? c1846.m6131() : AbstractC14545.of();
            if (m179112 != null) {
                C14248 c14248 = m179112.f52336;
                if (c14248.f42933 != j2) {
                    m179112.f52336 = c14248.m33892(j2);
                }
            }
            C14536[] c14536Arr = this.f64593;
            C6488 c6488 = this.f64585;
            if (c6488.m17911() == c6488.m17917() && (m17911 = c6488.m17911()) != null) {
                C1263 m40070 = m17911.m40070();
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= c14536Arr.length) {
                        z2 = true;
                        break;
                    }
                    if (m40070.m4319(i2)) {
                        if (c14536Arr[i2].m34719() != 1) {
                            z2 = false;
                            break;
                        }
                        if (m40070.f4476[i2].f53167 != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.f64552) {
                    this.f64552 = z5;
                    if (!z5 && this.f64582.f38576) {
                        this.f64592.mo17763(2);
                    }
                }
            }
            list = m6131;
        } else {
            if (!c15894.equals(this.f64582.f38574)) {
                c6181 = C6181.f18976;
                c1263 = this.f64560;
                list2 = AbstractC14545.of();
            }
            list = list2;
        }
        C6181 c61812 = c6181;
        C1263 c12632 = c1263;
        if (z) {
            this.f64583.m35525(i);
        }
        C12838 c128382 = this.f64582;
        return c128382.m31232(c15894, j, j2, j3, m45920(c128382.f38562), c61812, c12632, list);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45956(boolean[] zArr, long j) {
        C14536[] c14536Arr;
        C17071 m17917 = this.f64585.m17917();
        C1263 m40070 = m17917.m40070();
        int i = 0;
        while (true) {
            c14536Arr = this.f64593;
            if (i >= c14536Arr.length) {
                break;
            }
            if (!m40070.m4319(i)) {
                c14536Arr[i].m34710();
            }
            i++;
        }
        for (int i2 = 0; i2 < c14536Arr.length; i2++) {
            if (m40070.m4319(i2) && !c14536Arr[i2].m34717(m17917)) {
                m45947(m17917, i2, zArr[i2], j);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45947(C17071 c17071, int i, boolean z, long j) {
        C14536 c14536 = this.f64593[i];
        if (c14536.m34727()) {
            return;
        }
        boolean z2 = c17071 == this.f64585.m17911();
        C1263 m40070 = c17071.m40070();
        C17359 c17359 = m40070.f4476[i];
        InterfaceC9731 interfaceC9731 = m40070.f4478[i];
        boolean z3 = m45995() && this.f64582.f38569 == 3;
        boolean z4 = !z && z3;
        this.f64550++;
        c14536.m34702(c17359, interfaceC9731, c17071.f52335[i], this.f64551, z4, z2, j, c17071.m40071(), c17071.f52336.f42930, this.f64578);
        c14536.m34697(new C0178(this), c17071);
        if (z3 && z2) {
            c14536.m34709();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m45984(boolean z) {
        long m40058;
        C17071 m17915 = this.f64585.m17915();
        C15894 c15894 = m17915 == null ? this.f64582.f38574 : m17915.f52336.f42930;
        boolean equals = this.f64582.f38575.equals(c15894);
        if (!equals) {
            this.f64582 = this.f64582.m31231(c15894);
        }
        C12838 c12838 = this.f64582;
        if (m17915 == null) {
            m40058 = c12838.f38563;
        } else {
            m40058 = m17915.m40058();
        }
        c12838.f38562 = m40058;
        C12838 c128382 = this.f64582;
        c128382.f38565 = m45920(c128382.f38562);
        if ((!equals || z) && m17915 != null && m17915.f52341) {
            m45946(m17915.f52336.f42930, m17915.m40073(), m17915.m40070());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m45920(long j) {
        C17071 m17915 = this.f64585.m17915();
        if (m17915 == null) {
            return 0L;
        }
        return Math.max(0L, j - m17915.m40072(this.f64551));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45946(C15894 c15894, C6181 c6181, C1263 c1263) {
        long m40072;
        C6488 c6488 = this.f64585;
        C17071 m17915 = c6488.m17915();
        m17915.getClass();
        if (m17915 == c6488.m17911()) {
            m40072 = m17915.m40072(this.f64551);
        } else {
            m40072 = m17915.m40072(this.f64551) - m17915.f52336.f42927;
        }
        long j = m40072;
        long m45920 = m45920(m17915.m40058());
        long m26568 = m45958(this.f64582.f38560, m17915.f52336.f42930) ? ((C10575) this.f64576).m26568() : -9223372036854775807L;
        AbstractC4846 abstractC4846 = this.f64582.f38560;
        float f = this.f64578.mo13468().f8510;
        boolean z = this.f64582.f38571;
        this.f64580.mo25238(new C12174(this.f64574, abstractC4846, c15894, j, m45920, f, this.f64541, m26568), c1263.f4478);
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m45995() {
        C12838 c12838 = this.f64582;
        return c12838.f38571 && c12838.f38568 == 0;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m45987(int i) {
        C14536 c14536 = this.f64593[i];
        try {
            C17071 m17911 = this.f64585.m17911();
            m17911.getClass();
            c14536.m34726(m17911);
        } catch (IOException | RuntimeException e) {
            int m34719 = c14536.m34719();
            if (m34719 == 3 || m34719 == 5) {
                C1263 m40070 = this.f64585.m17911().m40070();
                C19956.m46034("Disabling track due to error: " + C8353.m21947(m40070.f4478[i].mo2382()), e);
                C1263 c1263 = new C1263((C17359[]) m40070.f4476.clone(), (InterfaceC9731[]) m40070.f4478.clone(), m40070.f4477, m40070.f4474);
                c1263.f4476[i] = null;
                c1263.f4478[i] = null;
                C14536[] c14536Arr = this.f64593;
                int m34711 = c14536Arr[i].m34711();
                c14536Arr[i].m34700(this.f64578);
                m45932(i, false);
                this.f64550 -= m34711;
                this.f64585.m17911().m40059(c1263, this.f64582.f38563);
                return;
            }
            throw e;
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m45994() {
        if (!this.f64570) {
            return false;
        }
        for (C14536 c14536 : this.f64593) {
            if (c14536.m34716()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m45979(long j) {
        boolean z = this.f64563;
        long j2 = f64538;
        if (z && this.f64577.f67588) {
            r1 = this.f64582.f38569 != 3 ? j2 : 1000L;
            for (C14536 c14536 : this.f64593) {
                r1 = Math.min(r1, C3603.m11037(c14536.m34691(this.f64551, this.f64561)));
            }
            if (this.f64582.m31237()) {
                C6488 c6488 = this.f64585;
                if ((c6488.m17911() != null ? c6488.m17911().m40068() : null) != null) {
                    if ((C3603.m11014(r1) * this.f64582.f38578.f8510) + this.f64551 >= r0.m40074()) {
                        r1 = Math.min(r1, j2);
                    }
                }
            }
        } else if (this.f64582.f38569 != 3 || m45995()) {
            r1 = j2;
        }
        this.f64592.mo17759(j + r1);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m45990(C19936 c19936) {
        return c19936.f64563 && c19936.f64577.f67588;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m45971(boolean z, boolean z2) {
        this.f64541 = z;
        this.f64562 = (!z || z2) ? -9223372036854775807L : this.f64568.mo33834();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Pair m45925(AbstractC4846 abstractC4846, C22052 c22052, boolean z, int i, boolean z2, C20369 c20369, C22485 c22485) {
        int m45919;
        AbstractC4846 abstractC48462 = c22052.f70683;
        if (abstractC4846.m14110()) {
            return null;
        }
        AbstractC4846 abstractC48463 = abstractC48462.m14110() ? abstractC4846 : abstractC48462;
        try {
            Pair m14100 = abstractC48463.m14100(c20369, c22485, c22052.f70684, c22052.f70685);
            if (!abstractC4846.equals(abstractC48463)) {
                if (abstractC4846.mo14098(m14100.first) == -1) {
                    if (!z || (m45919 = m45919(c20369, c22485, i, z2, m14100.first, abstractC48463, abstractC4846)) == -1) {
                        return null;
                    }
                    return abstractC4846.m14100(c20369, c22485, m45919, -9223372036854775807L);
                }
                if (abstractC48463.mo14105(m14100.first, c22485).f72805 && abstractC48463.mo14103(c22485.f72806, c20369, 0L).f65760 == abstractC48463.mo14098(m14100.first)) {
                    return abstractC4846.m14100(c20369, c22485, abstractC4846.mo14105(m14100.first, c22485).f72806, c22052.f70685);
                }
            }
            return m14100;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m45919(C20369 c20369, C22485 c22485, int i, boolean z, Object obj, AbstractC4846 abstractC4846, AbstractC4846 abstractC48462) {
        Object obj2 = abstractC4846.mo14103(abstractC4846.mo14105(obj, c22485).f72806, c20369, 0L).f65761;
        for (int i2 = 0; i2 < abstractC48462.mo14107(); i2++) {
            if (abstractC48462.mo14103(i2, c20369, 0L).f65761.equals(obj2)) {
                return i2;
            }
        }
        int mo14098 = abstractC4846.mo14098(obj);
        int mo14095 = abstractC4846.mo14095();
        int i3 = mo14098;
        int i4 = -1;
        for (int i5 = 0; i5 < mo14095 && i4 == -1; i5++) {
            i3 = abstractC4846.m14097(i3, c22485, c20369, i, z);
            if (i3 == -1) {
                break;
            }
            i4 = abstractC48462.mo14098(abstractC4846.mo14102(i3));
        }
        if (i4 == -1) {
            return -1;
        }
        return abstractC48462.mo14104(i4, c22485, false).f72806;
    }
}

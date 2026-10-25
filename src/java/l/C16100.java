package l;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import com.umeng.analytics.pro.am;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: 18KG */
/* renamed from: l.ܺᩳۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16100 extends AbstractC4930 implements Handler.Callback {

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9046 f49598;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public boolean f49599;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public long f49600;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public AbstractC17533 f49601;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final Handler f49602;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC17512 f49603;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public C8353 f49604;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final C3002 f49605;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public long f49606;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final C4400 f49607;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public AbstractC17533 f49608;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f49609;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f49610;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public C18239 f49611;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public boolean f49612;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public int f49613;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public InterfaceC7222 f49614;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9752 f49615;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final C21843 f49616;

    @Override // l.InterfaceC1837, l.InterfaceC18065
    public final String getName() {
        return "TextRenderer";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16100(InterfaceC9046 interfaceC9046, Looper looper) {
        super(3);
        InterfaceC9752 interfaceC9752 = InterfaceC9752.f29520;
        this.f49598 = interfaceC9046;
        this.f49602 = looper == null ? null : new Handler(looper, this);
        this.f49615 = interfaceC9752;
        this.f49607 = new C4400();
        this.f49616 = new C21843(1, 0);
        this.f49605 = new C3002();
        this.f49606 = -9223372036854775807L;
        this.f49600 = -9223372036854775807L;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m37992(long j) {
        C22632.m50634(mo6100());
        this.f49606 = j;
    }

    @Override // l.AbstractC4930
    /* renamed from: ֫ */
    public final void mo14359(C8353[] c8353Arr, long j, long j2, C15894 c15894) {
        InterfaceC17512 c6929;
        C8353 c8353 = c8353Arr[0];
        this.f49604 = c8353;
        if (!C11003.equals(c8353.f25614, "application/x-media3-cues")) {
            m37987();
            if (this.f49614 != null) {
                this.f49613 = 1;
                return;
            }
            this.f49612 = true;
            C8353 c83532 = this.f49604;
            c83532.getClass();
            InterfaceC7222 m47870 = ((C21041) this.f49615).m47870(c83532);
            this.f49614 = m47870;
            m47870.mo4864(m14371());
            return;
        }
        if (this.f49604.f25611 == 1) {
            c6929 = new C23862();
        } else {
            c6929 = new C6929();
        }
        this.f49603 = c6929;
    }

    @Override // l.AbstractC4930
    /* renamed from: ֫ */
    public final void mo13451(long j, boolean z) {
        this.f49600 = j;
        InterfaceC17512 interfaceC17512 = this.f49603;
        if (interfaceC17512 != null) {
            interfaceC17512.clear();
        }
        m37988();
        this.f49609 = false;
        this.f49599 = false;
        this.f49606 = -9223372036854775807L;
        C8353 c8353 = this.f49604;
        if (c8353 == null || C11003.equals(c8353.f25614, "application/x-media3-cues")) {
            return;
        }
        if (this.f49613 == 0) {
            m37991();
            InterfaceC7222 interfaceC7222 = this.f49614;
            interfaceC7222.getClass();
            interfaceC7222.flush();
            interfaceC7222.mo4864(m14371());
            return;
        }
        m37991();
        InterfaceC7222 interfaceC72222 = this.f49614;
        interfaceC72222.getClass();
        interfaceC72222.mo12();
        this.f49614 = null;
        this.f49613 = 0;
        this.f49612 = true;
        C8353 c83532 = this.f49604;
        c83532.getClass();
        InterfaceC7222 m47870 = ((C21041) this.f49615).m47870(c83532);
        this.f49614 = m47870;
        m47870.mo4864(m14371());
    }

    @Override // l.InterfaceC1837
    /* renamed from: ֫ */
    public final void mo6088(long j, long j2) {
        boolean z;
        StringBuilder sb;
        long j3;
        if (mo6100()) {
            long j4 = this.f49606;
            if (j4 != -9223372036854775807L && j >= j4) {
                m37991();
                this.f49599 = true;
            }
        }
        if (this.f49599) {
            return;
        }
        C8353 c8353 = this.f49604;
        c8353.getClass();
        boolean equals = C11003.equals(c8353.f25614, "application/x-media3-cues");
        InterfaceC9046 interfaceC9046 = this.f49598;
        Handler handler = this.f49602;
        C3002 c3002 = this.f49605;
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (equals) {
            this.f49603.getClass();
            if (!this.f49609) {
                C21843 c21843 = this.f49616;
                if (m14355(c3002, c21843, 0) == -4) {
                    if (c21843.m12697()) {
                        this.f49609 = true;
                    } else {
                        c21843.m49229();
                        ByteBuffer byteBuffer = c21843.f69995;
                        byteBuffer.getClass();
                        long j5 = c21843.f69997;
                        byte[] array = byteBuffer.array();
                        int arrayOffset = byteBuffer.arrayOffset();
                        int limit = byteBuffer.limit();
                        this.f49607.getClass();
                        Parcel obtain = Parcel.obtain();
                        obtain.unmarshall(array, arrayOffset, limit);
                        obtain.setDataPosition(0);
                        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                        obtain.recycle();
                        ArrayList parcelableArrayList = readBundle.getParcelableArrayList(am.aF);
                        parcelableArrayList.getClass();
                        int i = AbstractC14545.f44556;
                        C1846 c1846 = new C1846();
                        for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                            Bundle bundle = (Bundle) parcelableArrayList.get(i2);
                            bundle.getClass();
                            c1846.m16264(C19811.m45555(bundle));
                        }
                        C12866 c12866 = new C12866(j5, readBundle.getLong("d"), c1846.m6131());
                        c21843.mo7();
                        z2 = this.f49603.mo18737(c12866, j);
                    }
                }
            }
            long mo18739 = this.f49603.mo18739(this.f49600);
            if (mo18739 == Long.MIN_VALUE && this.f49609 && !z2) {
                this.f49599 = true;
            }
            if (mo18739 != Long.MIN_VALUE && mo18739 <= j) {
                z2 = true;
            }
            if (z2) {
                AbstractC14545 mo18736 = this.f49603.mo18736(j);
                long mo18738 = this.f49603.mo18738(j);
                m37990(mo18738);
                C4288 c4288 = new C4288(mo18736);
                if (handler != null) {
                    handler.obtainMessage(1, c4288).sendToTarget();
                } else {
                    interfaceC9046.mo23343(c4288.f13839);
                    interfaceC9046.mo23344(c4288);
                }
                this.f49603.mo18740(mo18738);
            }
            this.f49600 = j;
            return;
        }
        m37987();
        this.f49600 = j;
        AbstractC17533 abstractC17533 = this.f49601;
        InterfaceC9752 interfaceC9752 = this.f49615;
        if (abstractC17533 == null) {
            InterfaceC7222 interfaceC7222 = this.f49614;
            interfaceC7222.getClass();
            interfaceC7222.mo14072(j);
            try {
                InterfaceC7222 interfaceC72222 = this.f49614;
                interfaceC72222.getClass();
                this.f49601 = (AbstractC17533) interfaceC72222.mo4863();
            } catch (C2011 e) {
                e = e;
                sb = new StringBuilder("Subtitle decoding failed. streamFormat=");
                sb.append(this.f49604);
                C19956.m46034(sb.toString(), e);
                m37988();
                m37991();
                InterfaceC7222 interfaceC72223 = this.f49614;
                interfaceC72223.getClass();
                interfaceC72223.mo12();
                this.f49614 = null;
                this.f49613 = 0;
                this.f49612 = true;
                C8353 c83532 = this.f49604;
                c83532.getClass();
                InterfaceC7222 m47870 = ((C21041) interfaceC9752).m47870(c83532);
                this.f49614 = m47870;
                m47870.mo4864(m14371());
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f49608 != null) {
            long m37989 = m37989();
            z = false;
            while (m37989 <= j) {
                this.f49610++;
                m37989 = m37989();
                z = true;
            }
        } else {
            z = false;
        }
        AbstractC17533 abstractC175332 = this.f49601;
        if (abstractC175332 != null) {
            if (abstractC175332.m12697()) {
                if (!z && m37989() == C13132.FOREVER_NS) {
                    if (this.f49613 == 2) {
                        m37991();
                        InterfaceC7222 interfaceC72224 = this.f49614;
                        interfaceC72224.getClass();
                        interfaceC72224.mo12();
                        this.f49614 = null;
                        this.f49613 = 0;
                        this.f49612 = true;
                        C8353 c83533 = this.f49604;
                        c83533.getClass();
                        InterfaceC7222 m478702 = ((C21041) interfaceC9752).m47870(c83533);
                        this.f49614 = m478702;
                        m478702.mo4864(m14371());
                    } else {
                        m37991();
                        this.f49599 = true;
                    }
                }
            } else if (abstractC175332.f65926 <= j) {
                AbstractC17533 abstractC175333 = this.f49608;
                if (abstractC175333 != null) {
                    abstractC175333.mo8();
                }
                this.f49610 = abstractC175332.mo4659(j);
                this.f49608 = abstractC175332;
                this.f49601 = null;
                z = true;
            }
        }
        if (z) {
            this.f49608.getClass();
            int mo4659 = this.f49608.mo4659(j);
            if (mo4659 == 0 || this.f49608.mo4658() == 0) {
                j3 = this.f49608.f65926;
            } else if (mo4659 == -1) {
                AbstractC17533 abstractC175334 = this.f49608;
                j3 = abstractC175334.mo4660(abstractC175334.mo4658() - 1);
            } else {
                j3 = this.f49608.mo4660(mo4659 - 1);
            }
            m37990(j3);
            C4288 c42882 = new C4288(this.f49608.mo4661(j));
            if (handler != null) {
                handler.obtainMessage(1, c42882).sendToTarget();
            } else {
                interfaceC9046.mo23343(c42882.f13839);
                interfaceC9046.mo23344(c42882);
            }
        }
        if (this.f49613 == 2) {
            return;
        }
        while (!this.f49609) {
            try {
                C18239 c18239 = this.f49611;
                if (c18239 == null) {
                    InterfaceC7222 interfaceC72225 = this.f49614;
                    interfaceC72225.getClass();
                    c18239 = (C18239) interfaceC72225.mo4865();
                    if (c18239 == null) {
                        return;
                    } else {
                        this.f49611 = c18239;
                    }
                }
                if (this.f49613 == 1) {
                    c18239.m12693(4);
                    InterfaceC7222 interfaceC72226 = this.f49614;
                    interfaceC72226.getClass();
                    interfaceC72226.mo4862(c18239);
                    this.f49611 = null;
                    this.f49613 = 2;
                    return;
                }
                int m14355 = m14355(c3002, c18239, 0);
                if (m14355 == -4) {
                    if (c18239.m12697()) {
                        this.f49609 = true;
                        this.f49612 = false;
                    } else {
                        C8353 c83534 = c3002.f9455;
                        if (c83534 == null) {
                            return;
                        }
                        c18239.f56684 = c83534.f25620;
                        c18239.m49229();
                        this.f49612 &= !c18239.m12690();
                    }
                    if (!this.f49612) {
                        InterfaceC7222 interfaceC72227 = this.f49614;
                        interfaceC72227.getClass();
                        interfaceC72227.mo4862(c18239);
                        this.f49611 = null;
                    }
                } else if (m14355 == -3) {
                    return;
                }
            } catch (C2011 e2) {
                e = e2;
                sb = new StringBuilder("Subtitle decoding failed. streamFormat=");
                sb.append(this.f49604);
                C19956.m46034(sb.toString(), e);
                m37988();
                m37991();
                InterfaceC7222 interfaceC722232 = this.f49614;
                interfaceC722232.getClass();
                interfaceC722232.mo12();
                this.f49614 = null;
                this.f49613 = 0;
                this.f49612 = true;
                C8353 c835322 = this.f49604;
                c835322.getClass();
                InterfaceC7222 m478703 = ((C21041) interfaceC9752).m47870(c835322);
                this.f49614 = m478703;
                m478703.mo4864(m14371());
                return;
            }
        }
    }

    @Override // l.AbstractC4930
    /* renamed from: ۤ */
    public final void mo13464() {
        this.f49604 = null;
        this.f49606 = -9223372036854775807L;
        m37988();
        this.f49600 = -9223372036854775807L;
        if (this.f49614 != null) {
            m37991();
            InterfaceC7222 interfaceC7222 = this.f49614;
            interfaceC7222.getClass();
            interfaceC7222.mo12();
            this.f49614 = null;
            this.f49613 = 0;
        }
    }

    @Override // l.AbstractC4930, l.InterfaceC1837
    /* renamed from: ۧ */
    public final boolean mo6098() {
        return this.f49599;
    }

    @Override // l.InterfaceC1837
    /* renamed from: ܿ */
    public final boolean mo6101() {
        C8353 c8353 = this.f49604;
        if (c8353 != null) {
            if (C11003.equals(c8353.f25614, "application/x-media3-cues")) {
                InterfaceC17512 interfaceC17512 = this.f49603;
                interfaceC17512.getClass();
                if (interfaceC17512.mo18739(this.f49600) == Long.MIN_VALUE) {
                    try {
                        mo6096();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (!this.f49599) {
                    if (this.f49609) {
                        AbstractC17533 abstractC17533 = this.f49608;
                        long j = this.f49600;
                        if (abstractC17533 == null || abstractC17533.mo4658() <= 0 || abstractC17533.mo4660(abstractC17533.mo4658() - 1) <= j) {
                            AbstractC17533 abstractC175332 = this.f49601;
                            long j2 = this.f49600;
                            if ((abstractC175332 == null || abstractC175332.mo4658() <= 0 || abstractC175332.mo4660(abstractC175332.mo4658() - 1) <= j2) && this.f49611 != null) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    private void m37991() {
        this.f49611 = null;
        this.f49610 = -1;
        AbstractC17533 abstractC17533 = this.f49608;
        if (abstractC17533 != null) {
            abstractC17533.mo8();
            this.f49608 = null;
        }
        AbstractC17533 abstractC175332 = this.f49601;
        if (abstractC175332 != null) {
            abstractC175332.mo8();
            this.f49601 = null;
        }
    }

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    private long m37989() {
        if (this.f49610 == -1) {
            return C13132.FOREVER_NS;
        }
        this.f49608.getClass();
        return this.f49610 >= this.f49608.mo4658() ? C13132.FOREVER_NS : this.f49608.mo4660(this.f49610);
    }

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    private void m37988() {
        AbstractC14545 of = AbstractC14545.of();
        m37990(this.f49600);
        C4288 c4288 = new C4288(of);
        Handler handler = this.f49602;
        if (handler != null) {
            handler.obtainMessage(1, c4288).sendToTarget();
            return;
        }
        AbstractC14545 abstractC14545 = c4288.f13839;
        InterfaceC9046 interfaceC9046 = this.f49598;
        interfaceC9046.mo23343(abstractC14545);
        interfaceC9046.mo23344(c4288);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            C4288 c4288 = (C4288) message.obj;
            AbstractC14545 abstractC14545 = c4288.f13839;
            InterfaceC9046 interfaceC9046 = this.f49598;
            interfaceC9046.mo23343(abstractC14545);
            interfaceC9046.mo23344(c4288);
            return true;
        }
        throw new IllegalStateException();
    }

    @SideEffectFree
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private long m37990(long j) {
        C22632.m50634(j != -9223372036854775807L);
        return j - m14360();
    }

    @RequiresNonNull({"streamFormat"})
    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    private void m37987() {
        C22632.m50633("Legacy decoding is disabled, can't handle " + this.f49604.f25614 + " samples (expected application/x-media3-cues).", C11003.equals(this.f49604.f25614, "application/cea-608") || C11003.equals(this.f49604.f25614, "application/x-mp4-cea-608") || C11003.equals(this.f49604.f25614, "application/cea-708"));
    }

    @Override // l.InterfaceC18065
    /* renamed from: ֫ */
    public final int mo16568(C8353 c8353) {
        if (C11003.equals(c8353.f25614, "application/x-media3-cues") || ((C21041) this.f49615).m47871(c8353)) {
            return C11010.m27348(c8353.f25632 == 0 ? 4 : 2, 0, 0, 0);
        }
        return C9786.m24809(c8353.f25614) ? C11010.m27348(1, 0, 0, 0) : C11010.m27348(0, 0, 0, 0);
    }
}

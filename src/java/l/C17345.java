package l;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* compiled from: H6OP */
/* renamed from: l.ܿ۫ۢ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17345 implements InterfaceC2770 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f53131;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f53133;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C16639 f53135;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f53132 = new ArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f53130 = new IdentityHashMap();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f53134 = new IdentityHashMap();

    public C17345(boolean z, boolean z2, boolean z3) {
        this.f53133 = z;
        this.f53131 = z2;
        this.f53135 = z3 ? new C16639() : null;
    }

    @Override // l.InterfaceC2770
    /* renamed from: ۧ */
    public final void mo8544(C8931 c8931) {
        int mo1085;
        C18757.m43430();
        C16639 c16639 = this.f53135;
        if (c16639 != null) {
            c16639.m39171(c8931);
        }
        if (this.f53131) {
            if (this.f53133) {
                if (c8931 instanceof C13836) {
                    mo1085 = -2;
                } else {
                    if (c8931 instanceof C6076) {
                        mo1085 = -3;
                    }
                    mo1085 = -1;
                }
            } else {
                mo1085 = c8931.mo1085();
                if (mo1085 != 1 && mo1085 != 2 && mo1085 != 8 && mo1085 != 9 && mo1085 != 14 && mo1085 != 15 && mo1085 != 17 && mo1085 != 18 && mo1085 != 40 && mo1085 != 41 && mo1085 != 50 && mo1085 != 51 && mo1085 != 54 && mo1085 != 55 && mo1085 != 30 && mo1085 != 34 && mo1085 != 43 && mo1085 != 47 && mo1085 != 72) {
                    switch (mo1085) {
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (mo1085) {
                                case 57:
                                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                case 60:
                                    break;
                                default:
                                    switch (mo1085) {
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                            break;
                                        default:
                                            mo1085 = -1;
                                            break;
                                    }
                            }
                    }
                }
            }
            if (mo1085 == -1) {
                return;
            }
            C2529 c2529 = new C2529(mo1085, c8931);
            this.f53132.add(c2529);
            this.f53130.put(c8931, c2529);
        }
    }

    @Override // l.InterfaceC2770
    /* renamed from: ֫ */
    public final void mo8541(C8931 c8931) {
        C2529 c2529;
        InterfaceC0463 interfaceC0463;
        C18757.m43430();
        C16639 c16639 = this.f53135;
        if (c16639 != null) {
            c16639.m39173(c8931);
        }
        IdentityHashMap identityHashMap = this.f53130;
        C2529 c25292 = (C2529) identityHashMap.remove(c8931);
        if (c25292 != null && (interfaceC0463 = c8931.f27155) != null) {
            c25292.f8030 = interfaceC0463.mo2052();
        }
        C8931 c89312 = c8931.f63075;
        C2529 c25293 = (C2529) identityHashMap.get(c89312);
        if ((c8931 instanceof C13590) && c25293 != null) {
            c25293.f8023 = true;
        }
        if ((c8931 instanceof C1843) && (c89312 instanceof C11016) && c25293 != null && c25293.f8025 < 0) {
            c25293.f8025 = c8931.f27156.mo2052();
        }
        IdentityHashMap identityHashMap2 = this.f53134;
        if (c25292 != null && c25292.f8031) {
            identityHashMap2.put(c89312, c25292);
        }
        if ((c8931 instanceof C21353) && (c2529 = (C2529) identityHashMap2.get(c89312)) != null) {
            c2529.f8031 = false;
        }
        if (c8931 instanceof C21312) {
            identityHashMap2.remove(c8931);
        }
        c8931.f27154 = null;
    }

    @Override // l.InterfaceC2770
    /* renamed from: ֫ */
    public final void mo8543(C18998 c18998) {
        InterfaceC0463 interfaceC0463 = c18998.f59877;
        C8931 c8931 = (C8931) c18998.f59876;
        C2529 c2529 = (C2529) this.f53130.get(c8931);
        if (c2529 != null) {
            c2529.m8043(interfaceC0463);
        }
        C16639 c16639 = this.f53135;
        if (c16639 != null) {
            c16639.m39172(c8931, interfaceC0463);
        }
        c8931.f27154.clear();
    }

    @Override // l.InterfaceC2770
    /* renamed from: ֫ */
    public final void mo8542(C9120 c9120) {
        mo8543((C18998) c9120);
    }
}

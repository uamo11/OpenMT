package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* compiled from: M664 */
/* renamed from: l.ۜ᩶ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6987 extends AbstractC23920 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C3459 f21534;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C7755 f21535;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f21536;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f21537;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int[] f21538;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f21539;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C7755 f21540;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f21541;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C16864 f21542;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f21543;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C7755 f21544;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C3459 f21545;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C21804 f21546;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f21547;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f21548;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C18276 f21549;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f21550;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f21551;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f21552;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C7755 f21553;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C18276 f21554;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f21555;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C18276 f21556;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f21557;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C18982 f21558;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C21804 f21559;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C18276 f21560;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C18982 f21561;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C20393 f21562;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f21563;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C6281 f21564;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f21565;

    @Override // l.AbstractC23920
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo18882() {
    }

    public C6987(int i) {
        super(null);
        this.f21564 = new C6281(this);
        if ((i & 2) != 0) {
            this.f21557 = 4;
        } else if ((i & 1) != 0) {
            this.f21557 = 1;
        } else {
            this.f21557 = 0;
        }
    }

    @Override // l.AbstractC23920
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo18883(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.f21543 = i;
        this.f21555 = i2;
        int i3 = i & 65535;
        C6281 c6281 = this.f21564;
        this.f21551 = c6281.m17315(i3, str);
        if (str2 != null) {
            this.f21547 = c6281.m17326(str2);
        }
        this.f21548 = str3 == null ? 0 : c6281.m17309(str3).f39901;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.f21536 = length;
            this.f21538 = new int[length];
            for (int i4 = 0; i4 < this.f21536; i4++) {
                this.f21538[i4] = c6281.m17309(strArr[i4]).f39901;
            }
        }
        if (this.f21557 != 1 || i3 < 51) {
            return;
        }
        this.f21557 = 2;
    }

    @Override // l.AbstractC23920
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo18886(String str, String str2) {
        if (str != null) {
            this.f21541 = this.f21564.m17326(str);
        }
        if (str2 != null) {
            C18276 c18276 = new C18276();
            c18276.m42612(0, Integer.MAX_VALUE, str2);
            this.f21556 = c18276;
        }
    }

    @Override // l.AbstractC23920
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC22509 mo18881(int i, String str, String str2) {
        C6281 c6281 = this.f21564;
        C20393 c20393 = new C20393(c6281, c6281.m17318(str).f39901, i, str2 == null ? 0 : c6281.m17326(str2));
        this.f21562 = c20393;
        return c20393;
    }

    @Override // l.AbstractC23920
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo18884(String str) {
        this.f21563 = this.f21564.m17309(str).f39901;
    }

    @Override // l.AbstractC23920
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo18887(String str, String str2, String str3) {
        C6281 c6281 = this.f21564;
        this.f21552 = c6281.m17309(str).f39901;
        if (str2 == null || str3 == null) {
            return;
        }
        this.f21565 = c6281.m17301(str2, str3);
    }

    @Override // l.AbstractC23920
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14104 mo18879(String str, boolean z) {
        C6281 c6281 = this.f21564;
        if (z) {
            C7755 m20785 = C7755.m20785(c6281, str, this.f21544);
            this.f21544 = m20785;
            return m20785;
        }
        C7755 m207852 = C7755.m20785(c6281, str, this.f21540);
        this.f21540 = m207852;
        return m207852;
    }

    @Override // l.AbstractC23920
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14104 mo18878(int i, C23214 c23214, String str, boolean z) {
        C6281 c6281 = this.f21564;
        if (z) {
            C7755 m20784 = C7755.m20784(c6281, i, c23214, str, this.f21553);
            this.f21553 = m20784;
            return m20784;
        }
        C7755 m207842 = C7755.m20784(c6281, i, c23214, str, this.f21535);
        this.f21535 = m207842;
        return m207842;
    }

    @Override // l.AbstractC23920
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo18888(C16864 c16864) {
        c16864.f51744 = this.f21542;
        this.f21542 = c16864;
    }

    @Override // l.AbstractC23920
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo18890(String str) {
        if (this.f21560 == null) {
            this.f21560 = new C18276();
        }
        this.f21537++;
        this.f21560.m42618(this.f21564.m17309(str).f39901);
    }

    @Override // l.AbstractC23920
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo18892(String str) {
        if (this.f21549 == null) {
            this.f21549 = new C18276();
        }
        this.f21550++;
        this.f21549.m42618(this.f21564.m17309(str).f39901);
    }

    @Override // l.AbstractC23920
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo18885(String str, int i, String str2, String str3) {
        if (this.f21554 == null) {
            this.f21554 = new C18276();
        }
        C6281 c6281 = this.f21564;
        C12631 m17309 = c6281.m17309(str);
        if (m17309.f39903 == 0) {
            this.f21539++;
            this.f21554.m42618(m17309.f39901);
            this.f21554.m42618(str2 == null ? 0 : c6281.m17309(str2).f39901);
            this.f21554.m42618(str3 != null ? c6281.m17326(str3) : 0);
            this.f21554.m42618(i);
            m17309.f39903 = this.f21539;
        }
    }

    @Override // l.AbstractC23920
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4870 mo18889(String str, String str2, String str3) {
        C3459 c3459 = new C3459(this.f21564, str, str2, str3);
        if (this.f21545 == null) {
            this.f21545 = c3459;
        } else {
            this.f21534.f15392 = c3459;
        }
        this.f21534 = c3459;
        return c3459;
    }

    @Override // l.AbstractC23920
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4165 mo18877(int i, String str, String str2, String str3, Object obj) {
        C18982 c18982 = new C18982(this.f21564, i, str, str2, str3, obj);
        if (this.f21561 == null) {
            this.f21561 = c18982;
        } else {
            this.f21558.f13586 = c18982;
        }
        this.f21558 = c18982;
        return c18982;
    }

    @Override // l.AbstractC23920
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15452 mo18880(int i, String str, String str2, String str3, String[] strArr) {
        C21804 c21804 = new C21804(this.f21564, i, str, str2, str3, strArr, this.f21557);
        if (this.f21546 == null) {
            this.f21546 = c21804;
        } else {
            this.f21559.f47311 = c21804;
        }
        this.f21559 = c21804;
        return c21804;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] m18891() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = (this.f21536 * 2) + 24;
        int i8 = 0;
        for (C18982 c18982 = this.f21561; c18982 != null; c18982 = (C18982) c18982.f13586) {
            i8++;
            i7 += c18982.m43817();
        }
        int i9 = 0;
        for (C21804 c21804 = this.f21546; c21804 != null; c21804 = (C21804) c21804.f47311) {
            i9++;
            i7 += c21804.m49150();
        }
        C18276 c18276 = this.f21554;
        C6281 c6281 = this.f21564;
        if (c18276 != null) {
            i7 += c18276.f56819 + 8;
            c6281.m17326("InnerClasses");
            i = 1;
        } else {
            i = 0;
        }
        if (this.f21552 != 0) {
            i++;
            i7 += 10;
            c6281.m17326("EnclosingMethod");
        }
        if ((this.f21555 & 4096) != 0 && (this.f21543 & 65535) < 49) {
            i++;
            i7 += 6;
            c6281.m17326("Synthetic");
        }
        if (this.f21547 != 0) {
            i++;
            i7 += 8;
            c6281.m17326("Signature");
        }
        if (this.f21541 != 0) {
            i++;
            i7 += 8;
            c6281.m17326("SourceFile");
        }
        C18276 c182762 = this.f21556;
        if (c182762 != null) {
            i++;
            i7 += c182762.f56819 + 6;
            c6281.m17326("SourceDebugExtension");
        }
        if ((this.f21555 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            i++;
            i7 += 6;
            c6281.m17326("Deprecated");
        }
        C7755 c7755 = this.f21544;
        if (c7755 != null) {
            i++;
            i7 += c7755.m20794("RuntimeVisibleAnnotations");
        }
        C7755 c77552 = this.f21540;
        if (c77552 != null) {
            i++;
            i7 += c77552.m20794("RuntimeInvisibleAnnotations");
        }
        C7755 c77553 = this.f21553;
        if (c77553 != null) {
            i++;
            i7 += c77553.m20794("RuntimeVisibleTypeAnnotations");
        }
        C7755 c77554 = this.f21535;
        if (c77554 != null) {
            i++;
            i7 += c77554.m20794("RuntimeInvisibleTypeAnnotations");
        }
        if (c6281.m17298() > 0) {
            i++;
            i7 += c6281.m17298();
        }
        C20393 c20393 = this.f21562;
        if (c20393 != null) {
            i += c20393.m46704();
            i7 += this.f21562.m46703();
        }
        if (this.f21563 != 0) {
            i++;
            i7 += 8;
            c6281.m17326("NestHost");
        }
        C18276 c182763 = this.f21560;
        if (c182763 != null) {
            i++;
            i7 += c182763.f56819 + 8;
            c6281.m17326("NestMembers");
        }
        C18276 c182764 = this.f21549;
        if (c182764 != null) {
            i++;
            i7 += c182764.f56819 + 8;
            c6281.m17326("PermittedSubclasses");
        }
        if ((this.f21555 & 65536) == 0 && this.f21545 == null) {
            i2 = 0;
            i3 = 0;
        } else {
            i2 = 0;
            int i10 = 0;
            for (C3459 c3459 = this.f21545; c3459 != null; c3459 = (C3459) c3459.f15392) {
                i10++;
                i2 += c3459.m10599();
            }
            i++;
            i7 += i2 + 8;
            c6281.m17326("Record");
            i3 = i10;
        }
        C16864 c16864 = this.f21542;
        if (c16864 != null) {
            int i11 = 0;
            while (c16864 != null) {
                i11++;
                c16864 = c16864.f51744;
            }
            i += i11;
            i7 += this.f21542.m39636(c6281);
        }
        int m17325 = i7 + c6281.m17325();
        if (c6281.m17320() > 65535) {
            throw new C14747(C20094.m46315("Class too large: ", c6281.m17316()));
        }
        C18276 c182765 = new C18276();
        c182765.f56818 = new byte[m17325];
        c182765.m42616(-889275714);
        c182765.m42616(this.f21543);
        c6281.m17319(c182765);
        c182765.m42618((~((this.f21543 & 65535) < 49 ? 4096 : 0)) & this.f21555);
        c182765.m42618(this.f21551);
        c182765.m42618(this.f21548);
        c182765.m42618(this.f21536);
        for (int i12 = 0; i12 < this.f21536; i12++) {
            c182765.m42618(this.f21538[i12]);
        }
        c182765.m42618(i8);
        for (C18982 c189822 = this.f21561; c189822 != null; c189822 = (C18982) c189822.f13586) {
            c189822.m43816(c182765);
        }
        c182765.m42618(i9);
        boolean z = false;
        boolean z2 = false;
        for (C21804 c218042 = this.f21546; c218042 != null; c218042 = (C21804) c218042.f47311) {
            z |= c218042.m49147();
            z2 |= c218042.m49149();
            c218042.m49145(c182765);
        }
        c182765.m42618(i);
        if (this.f21554 != null) {
            c182765.m42618(c6281.m17326("InnerClasses"));
            c182765.m42616(this.f21554.f56819 + 2);
            c182765.m42618(this.f21539);
            C18276 c182766 = this.f21554;
            c182765.m42613(0, c182766.f56819, c182766.f56818);
        }
        if (this.f21552 != 0) {
            c182765.m42618(c6281.m17326("EnclosingMethod"));
            c182765.m42616(4);
            c182765.m42618(this.f21552);
            c182765.m42618(this.f21565);
        }
        if ((this.f21555 & 4096) != 0 && (this.f21543 & 65535) < 49) {
            c182765.m42618(c6281.m17326("Synthetic"));
            c182765.m42616(0);
        }
        if (this.f21547 != 0) {
            c182765.m42618(c6281.m17326("Signature"));
            i4 = 2;
            c182765.m42616(2);
            c182765.m42618(this.f21547);
        } else {
            i4 = 2;
        }
        if (this.f21541 != 0) {
            c182765.m42618(c6281.m17326("SourceFile"));
            c182765.m42616(i4);
            c182765.m42618(this.f21541);
        }
        C18276 c182767 = this.f21556;
        if (c182767 != null) {
            int i13 = c182767.f56819;
            c182765.m42618(c6281.m17326("SourceDebugExtension"));
            c182765.m42616(i13);
            i5 = 0;
            c182765.m42613(0, i13, this.f21556.f56818);
        } else {
            i5 = 0;
        }
        if ((this.f21555 & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
            c182765.m42618(c6281.m17326("Deprecated"));
            c182765.m42616(i5);
        }
        C7755.m20787(this.f21564, this.f21544, this.f21540, this.f21553, this.f21535, c182765);
        c6281.m17314(c182765);
        C20393 c203932 = this.f21562;
        if (c203932 != null) {
            c203932.m46702(c182765);
        }
        if (this.f21563 != 0) {
            c182765.m42618(c6281.m17326("NestHost"));
            i6 = 2;
            c182765.m42616(2);
            c182765.m42618(this.f21563);
        } else {
            i6 = 2;
        }
        if (this.f21560 != null) {
            c182765.m42618(c6281.m17326("NestMembers"));
            c182765.m42616(this.f21560.f56819 + i6);
            c182765.m42618(this.f21537);
            C18276 c182768 = this.f21560;
            c182765.m42613(0, c182768.f56819, c182768.f56818);
        }
        if (this.f21549 != null) {
            c182765.m42618(c6281.m17326("PermittedSubclasses"));
            c182765.m42616(this.f21549.f56819 + 2);
            c182765.m42618(this.f21550);
            C18276 c182769 = this.f21549;
            c182765.m42613(0, c182769.f56819, c182769.f56818);
        }
        if ((this.f21555 & 65536) != 0 || this.f21545 != null) {
            c182765.m42618(c6281.m17326("Record"));
            c182765.m42616(i2 + 2);
            c182765.m42618(i3);
            for (C3459 c34592 = this.f21545; c34592 != null; c34592 = (C3459) c34592.f15392) {
                c34592.m10598(c182765);
            }
        }
        C16864 c168642 = this.f21542;
        if (c168642 != null) {
            c168642.m39639(c6281, c182765);
        }
        if (!z2) {
            return c182765.f56818;
        }
        byte[] bArr = c182765.f56818;
        C11221 c11221 = new C11221();
        c11221.m27786(this.f21542);
        for (C18982 c189823 = this.f21561; c189823 != null; c189823 = (C18982) c189823.f13586) {
            c189823.m43815(c11221);
        }
        for (C21804 c218043 = this.f21546; c218043 != null; c218043 = (C21804) c218043.f47311) {
            c218043.m49144(c11221);
        }
        for (C3459 c34593 = this.f21545; c34593 != null; c34593 = (C3459) c34593.f15392) {
            c34593.m10596(c11221);
        }
        C16864[] m27787 = c11221.m27787();
        this.f21561 = null;
        this.f21558 = null;
        this.f21546 = null;
        this.f21559 = null;
        this.f21544 = null;
        this.f21540 = null;
        this.f21553 = null;
        this.f21535 = null;
        this.f21562 = null;
        this.f21563 = 0;
        this.f21537 = 0;
        this.f21560 = null;
        this.f21550 = 0;
        this.f21549 = null;
        this.f21545 = null;
        this.f21534 = null;
        this.f21542 = null;
        this.f21557 = z ? 3 : 0;
        new C17570(bArr, false).m41072(this, m27787, (z ? 8 : 0) | 256);
        return m18891();
    }
}

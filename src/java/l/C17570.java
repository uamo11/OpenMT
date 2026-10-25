package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.bo;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* compiled from: Z5U8 */
/* renamed from: l.ܿ᩶ۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17570 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f53688;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f53689;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f53690;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21099[] f53691;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int[] f53692;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String[] f53693;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f53694;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C17570(byte[] bArr, boolean z) {
        int i;
        this.f53689 = bArr;
        if (z && m41078(6) > 70) {
            throw new IllegalArgumentException(C19370.m44628(m41078(6), "Unsupported class file major version "));
        }
        int m41077 = m41077(8);
        this.f53692 = new int[m41077];
        this.f53693 = new String[m41077];
        int i2 = 10;
        int i3 = 1;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            int i5 = 4;
            if (i3 >= m41077) {
                this.f53694 = i4;
                this.f53690 = i2;
                int[] iArr = null;
                this.f53691 = z2 ? new C21099[m41077] : null;
                if (z3) {
                    char[] cArr = new char[i4];
                    int m41069 = m41069();
                    for (int m410772 = m41077(m41069 - 2); m410772 > 0; m410772--) {
                        String m41074 = m41074(cArr, m41069);
                        int m41073 = m41073(m41069 + 2);
                        int i6 = m41069 + 6;
                        if ("BootstrapMethods".equals(m41074)) {
                            int m410773 = m41077(i6);
                            int[] iArr2 = new int[m410773];
                            int i7 = m41069 + 8;
                            for (int i8 = 0; i8 < m410773; i8++) {
                                iArr2[i8] = i7;
                                i7 += (m41077(i7 + 2) * 2) + 4;
                            }
                            iArr = iArr2;
                        } else {
                            m41069 = i6 + m41073;
                        }
                    }
                    throw new IllegalArgumentException();
                }
                this.f53688 = iArr;
                return;
            }
            int i9 = i3 + 1;
            int i10 = i2 + 1;
            this.f53692[i3] = i10;
            switch (bArr[i2]) {
                case 1:
                    i5 = m41077(i10) + 3;
                    if (i5 > i4) {
                        i4 = i5;
                    }
                    i = i5;
                    i2 += i;
                    i3 = i9;
                case 2:
                case 13:
                case 14:
                default:
                    throw new IllegalArgumentException();
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                    i = 5;
                    i2 += i;
                    i3 = i9;
                case 5:
                case 6:
                    i9 = i3 + 2;
                    i = 9;
                    i2 += i;
                    i3 = i9;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    i = 3;
                    i2 += i;
                    i3 = i9;
                case 15:
                    i = i5;
                    i2 += i;
                    i3 = i9;
                case 17:
                    z2 = true;
                    z3 = true;
                    i = 5;
                    i2 += i;
                    i3 = i9;
                case 18:
                    z3 = true;
                    i = 5;
                    i2 += i;
                    i3 = i9;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C17570(java.io.InputStream r8) {
        /*
            r7 = this;
            int r0 = r8.available()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 >= r1) goto Lb
            r0 = 4096(0x1000, float:5.74E-42)
            goto L11
        Lb:
            r1 = 1048576(0x100000, float:1.469368E-39)
            int r0 = java.lang.Math.min(r0, r1)
        L11:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L3a
            r3 = 0
            r4 = 0
        L1a:
            int r5 = r8.read(r2, r3, r0)     // Catch: java.lang.Throwable -> L3a
            r6 = -1
            if (r5 == r6) goto L27
            r1.write(r2, r3, r5)     // Catch: java.lang.Throwable -> L3a
            int r4 = r4 + 1
            goto L1a
        L27:
            r1.flush()     // Catch: java.lang.Throwable -> L3a
            r8 = 1
            if (r4 != r8) goto L2e
            goto L32
        L2e:
            byte[] r2 = r1.toByteArray()     // Catch: java.lang.Throwable -> L3a
        L32:
            r1.close()
            int r0 = r2.length
            r7.<init>(r2, r8)
            return
        L3a:
            r8 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L3e
        L3e:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17570.<init>(java.io.InputStream):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41072(AbstractC23920 abstractC23920, C16864[] c16864Arr, int i) {
        AbstractC23920 abstractC239202;
        String str;
        int i2;
        String str2;
        C9104 c9104;
        String str3;
        String str4;
        String str5;
        String str6;
        C17570 c17570;
        String str7;
        String str8;
        String str9;
        int i3;
        String str10;
        String str11;
        int i4;
        String str12;
        String str13;
        int i5;
        String str14;
        int i6;
        String[] strArr;
        int i7;
        String[] strArr2;
        int i8;
        int i9;
        String str15;
        int i10;
        String str16;
        String str17;
        int i11;
        C9104 c91042 = new C9104();
        c91042.f27582 = c16864Arr;
        c91042.f27581 = i;
        char[] cArr = new char[this.f53694];
        c91042.f27589 = cArr;
        int i12 = this.f53690;
        int m41077 = m41077(i12);
        String m41068 = m41068(cArr, i12 + 2);
        String m410682 = m41068(cArr, i12 + 4);
        int m410772 = m41077(i12 + 6);
        String[] strArr3 = new String[m410772];
        int i13 = i12 + 8;
        for (int i14 = 0; i14 < m410772; i14++) {
            strArr3[i14] = m41068(cArr, i13);
            i13 += 2;
        }
        int m41069 = m41069();
        String str18 = null;
        int m410773 = m41077(m41069 - 2);
        String str19 = null;
        String str20 = null;
        C16864 c16864 = null;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = m41077;
        int i26 = 0;
        String str21 = null;
        String str22 = null;
        while (true) {
            C9104 c91043 = c91042;
            int i27 = i13;
            String str23 = m410682;
            if (m410773 > 0) {
                String str24 = str19;
                String m41074 = m41074(cArr, m41069);
                int i28 = i26;
                int m41073 = m41073(m41069 + 2);
                int i29 = m41069 + 6;
                String str25 = str22;
                if ("SourceFile".equals(m41074)) {
                    str21 = m41074(cArr, i29);
                } else if ("InnerClasses".equals(m41074)) {
                    i22 = i29;
                } else if ("EnclosingMethod".equals(m41074)) {
                    i15 = i29;
                } else if ("NestHost".equals(m41074)) {
                    str20 = m41068(cArr, i29);
                } else if ("NestMembers".equals(m41074)) {
                    i20 = i29;
                } else if ("PermittedSubclasses".equals(m41074)) {
                    i21 = i29;
                } else if ("Signature".equals(m41074)) {
                    str18 = m41074(cArr, i29);
                } else if ("RuntimeVisibleAnnotations".equals(m41074)) {
                    i16 = i29;
                } else if ("RuntimeVisibleTypeAnnotations".equals(m41074)) {
                    i18 = i29;
                } else if ("Deprecated".equals(m41074)) {
                    i25 |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                } else if ("Synthetic".equals(m41074)) {
                    i25 |= 4096;
                } else if ("SourceDebugExtension".equals(m41074)) {
                    if (m41073 > this.f53689.length - i29) {
                        throw new IllegalArgumentException();
                    }
                    str22 = m41063(new char[m41073], i29, m41073);
                    str19 = str24;
                    i8 = i29;
                    i9 = m41073;
                    i10 = i27;
                    i26 = i28;
                    m41069 = i8 + i9;
                    m410773--;
                    i13 = i10;
                    c91042 = c91043;
                    m410682 = str23;
                } else if ("RuntimeInvisibleAnnotations".equals(m41074)) {
                    i17 = i29;
                } else if ("RuntimeInvisibleTypeAnnotations".equals(m41074)) {
                    i19 = i29;
                } else if ("Record".equals(m41074)) {
                    i25 |= 65536;
                    i23 = i29;
                } else if ("Module".equals(m41074)) {
                    i24 = i29;
                } else if ("ModuleMainClass".equals(m41074)) {
                    str19 = m41068(cArr, i29);
                    str22 = str25;
                    i8 = i29;
                    i9 = m41073;
                    i10 = i27;
                    i26 = i28;
                    m41069 = i8 + i9;
                    m410773--;
                    i13 = i10;
                    c91042 = c91043;
                    m410682 = str23;
                } else if ("ModulePackages".equals(m41074)) {
                    i28 = i29;
                } else {
                    if ("BootstrapMethods".equals(m41074)) {
                        i8 = i29;
                        i9 = m41073;
                        str15 = str21;
                        i10 = i27;
                        str16 = str24;
                        str17 = str25;
                        i11 = i25;
                    } else {
                        i8 = i29;
                        i9 = m41073;
                        str16 = str24;
                        str17 = str25;
                        str15 = str21;
                        i11 = i25;
                        i10 = i27;
                        C16864 m41065 = m41065(c16864Arr, m41074, i8, i9, cArr, -1, null);
                        m41065.f51744 = c16864;
                        c16864 = m41065;
                    }
                    str19 = str16;
                    str22 = str17;
                    i25 = i11;
                    i26 = i28;
                    str21 = str15;
                    m41069 = i8 + i9;
                    m410773--;
                    i13 = i10;
                    c91042 = c91043;
                    m410682 = str23;
                }
                str19 = str24;
                str22 = str25;
                i8 = i29;
                i9 = m41073;
                i10 = i27;
                i26 = i28;
                m41069 = i8 + i9;
                m410773--;
                i13 = i10;
                c91042 = c91043;
                m410682 = str23;
            } else {
                String str26 = str21;
                int i30 = i26;
                int[] iArr = this.f53692;
                String str27 = "Synthetic";
                String str28 = str19;
                String str29 = str22;
                String str30 = str18;
                String str31 = "Deprecated";
                abstractC23920.mo18883(m41073(iArr[1] - 7), i25, m41068, str30, str23, strArr3);
                String str32 = "RuntimeVisibleTypeAnnotations";
                if ((i & 2) != 0 || (str26 == null && str29 == null)) {
                    abstractC239202 = abstractC23920;
                    str = "RuntimeInvisibleAnnotations";
                } else {
                    abstractC239202 = abstractC23920;
                    str = "RuntimeInvisibleAnnotations";
                    abstractC239202.mo18886(str26, str29);
                }
                int i31 = i24;
                if (i31 != 0) {
                    c9104 = c91043;
                    char[] cArr2 = c9104.f27589;
                    i2 = i27;
                    str2 = "RuntimeInvisibleTypeAnnotations";
                    int i32 = i31 + 6;
                    AbstractC22509 mo18881 = abstractC239202.mo18881(m41077(i31 + 2), m41068(cArr2, i31), m41074(cArr2, i31 + 4));
                    if (mo18881 != null) {
                        if (str28 != null) {
                            mo18881.mo41755(str28);
                        }
                        if (i30 != 0) {
                            int m410774 = m41077(i30);
                            int i33 = i30 + 2;
                            while (true) {
                                int i34 = m410774 - 1;
                                if (m410774 <= 0) {
                                    break;
                                }
                                mo18881.mo41758(m41068(cArr2, i33));
                                i33 += 2;
                                m410774 = i34;
                            }
                        }
                        int m410775 = m41077(i32);
                        int i35 = i31 + 8;
                        while (true) {
                            int i36 = m410775 - 1;
                            if (m410775 <= 0) {
                                break;
                            }
                            String m410683 = m41068(cArr2, i35);
                            int m410776 = m41077(i35 + 2);
                            String m410742 = m41074(cArr2, i35 + 4);
                            i35 += 6;
                            mo18881.mo41754(m410776, m410683, m410742);
                            m410775 = i36;
                        }
                        int m410777 = m41077(i35);
                        int i37 = i35 + 2;
                        while (true) {
                            int i38 = m410777 - 1;
                            if (m410777 <= 0) {
                                break;
                            }
                            String m410684 = m41068(cArr2, i37);
                            int m410778 = m41077(i37 + 2);
                            int m410779 = m41077(i37 + 4);
                            i37 += 6;
                            if (m410779 != 0) {
                                strArr2 = new String[m410779];
                                i7 = i38;
                                for (int i39 = 0; i39 < m410779; i39++) {
                                    strArr2[i39] = m41068(cArr2, i37);
                                    i37 += 2;
                                }
                            } else {
                                i7 = i38;
                                strArr2 = null;
                            }
                            mo18881.mo41756(m410684, m410778, strArr2);
                            m410777 = i7;
                        }
                        int m4107710 = m41077(i37);
                        int i40 = i37 + 2;
                        while (true) {
                            int i41 = m4107710 - 1;
                            if (m4107710 <= 0) {
                                break;
                            }
                            String m410685 = m41068(cArr2, i40);
                            int m4107711 = m41077(i40 + 2);
                            int m4107712 = m41077(i40 + 4);
                            i40 += 6;
                            if (m4107712 != 0) {
                                strArr = new String[m4107712];
                                i6 = i41;
                                for (int i42 = 0; i42 < m4107712; i42++) {
                                    strArr[i42] = m41068(cArr2, i40);
                                    i40 += 2;
                                }
                            } else {
                                i6 = i41;
                                strArr = null;
                            }
                            mo18881.mo41759(m410685, m4107711, strArr);
                            m4107710 = i6;
                        }
                        int m4107713 = m41077(i40);
                        int i43 = i40 + 2;
                        while (true) {
                            int i44 = m4107713 - 1;
                            if (m4107713 <= 0) {
                                break;
                            }
                            mo18881.mo41760(m41068(cArr2, i43));
                            i43 += 2;
                            m4107713 = i44;
                        }
                        int m4107714 = m41077(i43);
                        int i45 = i43 + 2;
                        while (true) {
                            int i46 = m4107714 - 1;
                            if (m4107714 <= 0) {
                                break;
                            }
                            String m410686 = m41068(cArr2, i45);
                            int m4107715 = m41077(i45 + 2);
                            i45 += 4;
                            String[] strArr4 = new String[m4107715];
                            for (int i47 = 0; i47 < m4107715; i47++) {
                                strArr4[i47] = m41068(cArr2, i45);
                                i45 += 2;
                            }
                            mo18881.mo41757(m410686, strArr4);
                            m4107714 = i46;
                        }
                        mo18881.mo46701();
                    }
                } else {
                    i2 = i27;
                    str2 = "RuntimeInvisibleTypeAnnotations";
                    c9104 = c91043;
                }
                String str33 = str20;
                if (str33 != null) {
                    abstractC239202.mo18884(str33);
                }
                int i48 = i15;
                if (i48 != 0) {
                    String m410687 = m41068(cArr, i48);
                    int m4107716 = m41077(i48 + 2);
                    abstractC239202.mo18887(m410687, m4107716 == 0 ? null : m41074(cArr, iArr[m4107716]), m4107716 == 0 ? null : m41074(cArr, iArr[m4107716] + 2));
                }
                int i49 = i16;
                if (i49 != 0) {
                    int m4107717 = m41077(i49);
                    int i50 = i49 + 2;
                    while (true) {
                        int i51 = m4107717 - 1;
                        if (m4107717 <= 0) {
                            break;
                        }
                        i50 = m41061(abstractC239202.mo18879(m41074(cArr, i50), true), i50 + 2, true, cArr);
                        m4107717 = i51;
                    }
                }
                int i52 = i17;
                if (i52 != 0) {
                    int m4107718 = m41077(i52);
                    int i53 = i52 + 2;
                    while (true) {
                        int i54 = m4107718 - 1;
                        if (m4107718 <= 0) {
                            break;
                        }
                        i53 = m41061(abstractC239202.mo18879(m41074(cArr, i53), false), i53 + 2, true, cArr);
                        m4107718 = i54;
                    }
                }
                int i55 = i18;
                if (i55 != 0) {
                    int m4107719 = m41077(i55);
                    int i56 = i55 + 2;
                    while (true) {
                        int i57 = m4107719 - 1;
                        if (m4107719 <= 0) {
                            break;
                        }
                        int m41059 = m41059(c9104, i56);
                        i56 = m41061(abstractC239202.mo18878(c9104.f27580, c9104.f27585, m41074(cArr, m41059), true), m41059 + 2, true, cArr);
                        m4107719 = i57;
                    }
                }
                int i58 = i19;
                if (i58 != 0) {
                    int m4107720 = m41077(i58);
                    int i59 = i58 + 2;
                    while (true) {
                        int i60 = m4107720 - 1;
                        if (m4107720 <= 0) {
                            break;
                        }
                        int m410592 = m41059(c9104, i59);
                        i59 = m41061(abstractC239202.mo18878(c9104.f27580, c9104.f27585, m41074(cArr, m410592), false), m410592 + 2, true, cArr);
                        m4107720 = i60;
                    }
                }
                C16864 c168642 = c16864;
                while (c168642 != null) {
                    C16864 c168643 = c168642.f51744;
                    c168642.f51744 = null;
                    abstractC239202.mo18888(c168642);
                    c168642 = c168643;
                }
                int i61 = i20;
                if (i61 != 0) {
                    int m4107721 = m41077(i61);
                    int i62 = i61 + 2;
                    while (true) {
                        int i63 = m4107721 - 1;
                        if (m4107721 <= 0) {
                            break;
                        }
                        abstractC239202.mo18890(m41068(cArr, i62));
                        i62 += 2;
                        m4107721 = i63;
                    }
                }
                int i64 = i21;
                if (i64 != 0) {
                    int m4107722 = m41077(i64);
                    int i65 = i64 + 2;
                    while (true) {
                        int i66 = m4107722 - 1;
                        if (m4107722 <= 0) {
                            break;
                        }
                        abstractC239202.mo18892(m41068(cArr, i65));
                        i65 += 2;
                        m4107722 = i66;
                    }
                }
                int i67 = i22;
                if (i67 != 0) {
                    int m4107723 = m41077(i67);
                    int i68 = i67 + 2;
                    while (true) {
                        int i69 = m4107723 - 1;
                        if (m4107723 <= 0) {
                            break;
                        }
                        abstractC239202.mo18885(m41068(cArr, i68), m41077(i68 + 6), m41068(cArr, i68 + 2), m41074(cArr, i68 + 4));
                        i68 += 8;
                        m4107723 = i69;
                    }
                }
                int i70 = i23;
                if (i70 != 0) {
                    int m4107724 = m41077(i70);
                    C17570 c175702 = this;
                    int i71 = i70 + 2;
                    while (true) {
                        int i72 = m4107724 - 1;
                        if (m4107724 <= 0) {
                            break;
                        }
                        char[] cArr3 = c9104.f27589;
                        String m410743 = c175702.m41074(cArr3, i71);
                        String m410744 = c175702.m41074(cArr3, i71 + 2);
                        int m4107725 = c175702.m41077(i71 + 4);
                        i71 += 6;
                        String str34 = null;
                        C16864 c168644 = null;
                        int i73 = 0;
                        int i74 = 0;
                        int i75 = 0;
                        int i76 = 0;
                        while (true) {
                            int i77 = m4107725 - 1;
                            if (m4107725 <= 0) {
                                break;
                            }
                            String m410745 = c175702.m41074(cArr3, i71);
                            int i78 = i73;
                            int m410732 = c175702.m41073(i71 + 2);
                            i73 = i71 + 6;
                            if ("Signature".equals(m410745)) {
                                str34 = c175702.m41074(cArr3, i73);
                            } else if ("RuntimeVisibleAnnotations".equals(m410745)) {
                                i74 = i73;
                            } else if (str32.equals(m410745)) {
                                i75 = i73;
                            } else {
                                if (str.equals(m410745)) {
                                    i4 = i73;
                                    str12 = str;
                                    i5 = i72;
                                    str11 = str2;
                                    str14 = str27;
                                    str13 = str32;
                                } else {
                                    str10 = str2;
                                    if (str10.equals(m410745)) {
                                        i76 = i73;
                                        str11 = str10;
                                        i4 = i73;
                                        str12 = str;
                                        str13 = str32;
                                        i73 = i78;
                                        i5 = i72;
                                        str14 = str27;
                                    } else {
                                        str11 = str10;
                                        i4 = i73;
                                        str12 = str;
                                        str13 = str32;
                                        i5 = i72;
                                        str14 = str27;
                                        C16864 m410652 = m41065(c9104.f27582, m410745, i73, m410732, cArr3, -1, null);
                                        m410652.f51744 = c168644;
                                        c175702 = this;
                                        c168644 = m410652;
                                        i74 = i74;
                                        i73 = i78;
                                    }
                                }
                                i71 = i4 + m410732;
                                abstractC239202 = abstractC23920;
                                str27 = str14;
                                str32 = str13;
                                m4107725 = i77;
                                str2 = str11;
                                str = str12;
                                i72 = i5;
                            }
                            str10 = str2;
                            str11 = str10;
                            i4 = i73;
                            str12 = str;
                            str13 = str32;
                            i73 = i78;
                            i5 = i72;
                            str14 = str27;
                            i71 = i4 + m410732;
                            abstractC239202 = abstractC23920;
                            str27 = str14;
                            str32 = str13;
                            m4107725 = i77;
                            str2 = str11;
                            str = str12;
                            i72 = i5;
                        }
                        int i79 = i73;
                        String str35 = str;
                        int i80 = i74;
                        int i81 = i72;
                        String str36 = str2;
                        String str37 = str27;
                        C16864 c168645 = c168644;
                        String str38 = str32;
                        AbstractC23920 abstractC239203 = abstractC239202;
                        AbstractC4870 mo18889 = abstractC239203.mo18889(m410743, m410744, str34);
                        if (mo18889 != null) {
                            if (i80 != 0) {
                                int m4107726 = c175702.m41077(i80);
                                int i82 = i80 + 2;
                                while (true) {
                                    int i83 = m4107726 - 1;
                                    if (m4107726 <= 0) {
                                        break;
                                    }
                                    i82 = c175702.m41061(mo18889.mo10594(c175702.m41074(cArr3, i82), true), i82 + 2, true, cArr3);
                                    m4107726 = i83;
                                }
                            }
                            if (i79 != 0) {
                                int m4107727 = c175702.m41077(i79);
                                int i84 = i79 + 2;
                                while (true) {
                                    int i85 = m4107727 - 1;
                                    if (m4107727 <= 0) {
                                        break;
                                    }
                                    i84 = c175702.m41061(mo18889.mo10594(c175702.m41074(cArr3, i84), false), i84 + 2, true, cArr3);
                                    m4107727 = i85;
                                }
                            }
                            int i86 = i75;
                            if (i86 != 0) {
                                int m4107728 = c175702.m41077(i86);
                                int i87 = i86 + 2;
                                while (true) {
                                    int i88 = m4107728 - 1;
                                    if (m4107728 <= 0) {
                                        break;
                                    }
                                    int m410593 = c175702.m41059(c9104, i87);
                                    i87 = c175702.m41061(mo18889.mo10593(c9104.f27580, c9104.f27585, c175702.m41074(cArr3, m410593), true), m410593 + 2, true, cArr3);
                                    m4107728 = i88;
                                }
                            }
                            int i89 = i76;
                            if (i89 != 0) {
                                int m4107729 = c175702.m41077(i89);
                                int i90 = i89 + 2;
                                while (true) {
                                    int i91 = m4107729 - 1;
                                    if (m4107729 <= 0) {
                                        break;
                                    }
                                    int m410594 = c175702.m41059(c9104, i90);
                                    i90 = c175702.m41061(mo18889.mo10593(c9104.f27580, c9104.f27585, c175702.m41074(cArr3, m410594), false), m410594 + 2, true, cArr3);
                                    m4107729 = i91;
                                }
                            }
                            while (c168645 != null) {
                                C16864 c168646 = c168645.f51744;
                                c168645.f51744 = null;
                                mo18889.mo10597(c168645);
                                c168645 = c168646;
                            }
                            mo18889.mo10595();
                        }
                        m4107724 = i81;
                        abstractC239202 = abstractC239203;
                        str27 = str37;
                        str32 = str38;
                        str2 = str36;
                        str = str35;
                    }
                    str3 = str;
                    str4 = str2;
                    str5 = str27;
                    str6 = str32;
                    c17570 = c175702;
                } else {
                    str3 = str;
                    str4 = str2;
                    str5 = str27;
                    str6 = str32;
                    c17570 = this;
                }
                int i92 = i2;
                int m4107730 = c17570.m41077(i92);
                int i93 = i92 + 2;
                while (true) {
                    int i94 = m4107730 - 1;
                    if (m4107730 <= 0) {
                        break;
                    }
                    char[] cArr4 = c9104.f27589;
                    int m4107731 = c17570.m41077(i93);
                    String m410746 = c17570.m41074(cArr4, i93 + 2);
                    String m410747 = c17570.m41074(cArr4, i93 + 4);
                    int m4107732 = c17570.m41077(i93 + 6);
                    int i95 = i93 + 8;
                    C16864 c168647 = null;
                    String str39 = null;
                    Object obj = null;
                    int i96 = 0;
                    int i97 = 0;
                    int i98 = 0;
                    int i99 = 0;
                    while (true) {
                        int i100 = m4107732 - 1;
                        if (m4107732 <= 0) {
                            break;
                        }
                        String m410748 = c17570.m41074(cArr4, i95);
                        int i101 = i97;
                        int m410733 = c17570.m41073(i95 + 2);
                        int i102 = i95 + 6;
                        int i103 = i99;
                        if ("ConstantValue".equals(m410748)) {
                            int m4107733 = c17570.m41077(i102);
                            obj = m4107733 == 0 ? null : c17570.m41071(cArr4, m4107733);
                            str7 = str31;
                        } else {
                            if ("Signature".equals(m410748)) {
                                str39 = c17570.m41074(cArr4, i102);
                                i3 = i96;
                                str8 = str6;
                            } else {
                                str7 = str31;
                                if (str7.equals(m410748)) {
                                    m4107731 |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
                                } else if (str5.equals(m410748)) {
                                    m4107731 |= 4096;
                                } else if ("RuntimeVisibleAnnotations".equals(m410748)) {
                                    i3 = i96;
                                    str31 = str7;
                                    i98 = i102;
                                    i99 = i103;
                                    i95 = i102 + m410733;
                                    i96 = i3;
                                    m4107732 = i100;
                                    i97 = i101;
                                } else {
                                    str31 = str7;
                                    str8 = str6;
                                    if (str8.equals(m410748)) {
                                        i3 = i102;
                                    } else {
                                        str6 = str8;
                                        String str40 = str3;
                                        if (str40.equals(m410748)) {
                                            str3 = str40;
                                            i103 = i102;
                                            str9 = str4;
                                            i3 = i96;
                                            str4 = str9;
                                            i99 = i103;
                                            i95 = i102 + m410733;
                                            i96 = i3;
                                            m4107732 = i100;
                                            i97 = i101;
                                        } else {
                                            str3 = str40;
                                            str9 = str4;
                                            if (str9.equals(m410748)) {
                                                i101 = i102;
                                                i3 = i96;
                                                str4 = str9;
                                                i99 = i103;
                                                i95 = i102 + m410733;
                                                i96 = i3;
                                                m4107732 = i100;
                                                i97 = i101;
                                            } else {
                                                str4 = str9;
                                                C16864 m410653 = c17570.m41065(c9104.f27582, m410748, i102, m410733, cArr4, -1, null);
                                                m410653.f51744 = c168647;
                                                c168647 = m410653;
                                                i99 = i103;
                                                i3 = i96;
                                                i95 = i102 + m410733;
                                                i96 = i3;
                                                m4107732 = i100;
                                                i97 = i101;
                                            }
                                        }
                                    }
                                }
                            }
                            str6 = str8;
                            str9 = str4;
                            str4 = str9;
                            i99 = i103;
                            i95 = i102 + m410733;
                            i96 = i3;
                            m4107732 = i100;
                            i97 = i101;
                        }
                        str31 = str7;
                        str9 = str4;
                        i3 = i96;
                        str4 = str9;
                        i99 = i103;
                        i95 = i102 + m410733;
                        i96 = i3;
                        m4107732 = i100;
                        i97 = i101;
                    }
                    int i104 = i99;
                    int i105 = i97;
                    AbstractC4165 mo18877 = abstractC23920.mo18877(m4107731, m410746, m410747, str39, obj);
                    if (mo18877 != null) {
                        if (i98 != 0) {
                            int m4107734 = c17570.m41077(i98);
                            int i106 = i98 + 2;
                            while (true) {
                                int i107 = m4107734 - 1;
                                if (m4107734 <= 0) {
                                    break;
                                }
                                i106 = c17570.m41061(mo18877.mo5447(c17570.m41074(cArr4, i106), true), i106 + 2, true, cArr4);
                                m4107734 = i107;
                            }
                        }
                        if (i104 != 0) {
                            int m4107735 = c17570.m41077(i104);
                            int i108 = i104 + 2;
                            while (true) {
                                int i109 = m4107735 - 1;
                                if (m4107735 <= 0) {
                                    break;
                                }
                                i108 = c17570.m41061(mo18877.mo5447(c17570.m41074(cArr4, i108), false), i108 + 2, true, cArr4);
                                m4107735 = i109;
                            }
                        }
                        if (i96 != 0) {
                            int i110 = i96;
                            int m4107736 = c17570.m41077(i110);
                            int i111 = i110 + 2;
                            while (true) {
                                int i112 = m4107736 - 1;
                                if (m4107736 <= 0) {
                                    break;
                                }
                                int m410595 = c17570.m41059(c9104, i111);
                                i111 = c17570.m41061(mo18877.mo5446(c9104.f27580, c9104.f27585, c17570.m41074(cArr4, m410595), true), m410595 + 2, true, cArr4);
                                m4107736 = i112;
                            }
                        }
                        if (i105 != 0) {
                            int m4107737 = c17570.m41077(i105);
                            int i113 = i105 + 2;
                            while (true) {
                                int i114 = m4107737 - 1;
                                if (m4107737 <= 0) {
                                    break;
                                }
                                int m410596 = c17570.m41059(c9104, i113);
                                i113 = c17570.m41061(mo18877.mo5446(c9104.f27580, c9104.f27585, c17570.m41074(cArr4, m410596), false), m410596 + 2, true, cArr4);
                                m4107737 = i114;
                            }
                        }
                        while (c168647 != null) {
                            C16864 c168648 = c168647.f51744;
                            c168647.f51744 = null;
                            mo18877.mo12600(c168647);
                            c168647 = c168648;
                        }
                        mo18877.mo12599();
                    }
                    m4107730 = i94;
                    i93 = i95;
                }
                int m4107738 = c17570.m41077(i93);
                int i115 = i93 + 2;
                while (true) {
                    int i116 = m4107738 - 1;
                    if (m4107738 <= 0) {
                        abstractC23920.mo18882();
                        return;
                    } else {
                        i115 = c17570.m41062(abstractC23920, c9104, i115);
                        m4107738 = i116;
                    }
                }
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m41062(l.AbstractC23920 r45, l.C9104 r46, int r47) {
        /*
            Method dump skipped, instructions count: 4590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17570.m41062(l.᩻᩶ۚ, l.ۡ᩶ۚ, int):int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1342 m41064(int i, C1342[] c1342Arr) {
        if (c1342Arr[i] == null) {
            c1342Arr[i] = new C1342();
        }
        C1342 c1342 = c1342Arr[i];
        c1342.f4880 = (short) (c1342.f4880 & (-2));
        return c1342;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int[] m41067(l.AbstractC15452 r12, l.C9104 r13, int r14, boolean r15) {
        /*
            r11 = this;
            char[] r0 = r13.f27589
            int r1 = r11.m41077(r14)
            int[] r2 = new int[r1]
            r3 = 2
            int r14 = r14 + r3
            r4 = 0
        Lb:
            if (r4 >= r1) goto L83
            r2[r4] = r14
            int r5 = r11.m41073(r14)
            int r6 = r5 >>> 24
            r7 = 23
            if (r6 == r7) goto L4d
            switch(r6) {
                case 16: goto L4d;
                case 17: goto L4d;
                case 18: goto L4d;
                default: goto L1c;
            }
        L1c:
            switch(r6) {
                case 64: goto L28;
                case 65: goto L28;
                case 66: goto L4d;
                case 67: goto L4d;
                case 68: goto L4d;
                case 69: goto L4d;
                case 70: goto L4d;
                case 71: goto L25;
                case 72: goto L25;
                case 73: goto L25;
                case 74: goto L25;
                case 75: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            throw r12
        L25:
            int r14 = r14 + 4
            goto L4f
        L28:
            int r7 = r14 + 1
            int r7 = r11.m41077(r7)
            int r14 = r14 + 3
        L30:
            int r8 = r7 + (-1)
            if (r7 <= 0) goto L4f
            int r7 = r11.m41077(r14)
            int r9 = r14 + 2
            int r9 = r11.m41077(r9)
            int r14 = r14 + 6
            l.֨᩶ۚ[] r10 = r13.f27595
            m41064(r7, r10)
            int r7 = r7 + r9
            l.֨᩶ۚ[] r9 = r13.f27595
            m41064(r7, r9)
            r7 = r8
            goto L30
        L4d:
            int r14 = r14 + 3
        L4f:
            int r7 = r11.m41070(r14)
            r8 = 66
            r9 = 0
            r10 = 1
            if (r6 != r8) goto L77
            if (r7 != 0) goto L5c
            goto L63
        L5c:
            l.᩺᩶ۚ r9 = new l.᩺᩶ۚ
            byte[] r6 = r11.f53689
            r9.<init>(r6, r14)
        L63:
            int r14 = l.C23202.m51496(r7, r3, r10, r14)
            java.lang.String r6 = r11.m41074(r0, r14)
            int r14 = r14 + r3
            r5 = r5 & (-256(0xffffffffffffff00, float:NaN))
            l.ܰ᩹ۚ r5 = r12.mo26976(r5, r9, r6, r15)
            int r14 = r11.m41061(r5, r14, r10, r0)
            goto L80
        L77:
            r5 = 3
            int r14 = l.C23202.m51496(r7, r3, r5, r14)
            int r14 = r11.m41061(r9, r14, r10, r0)
        L80:
            int r4 = r4 + 1
            goto Lb
        L83:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17570.m41067(l.ܶ᩶ۚ, l.ۡ᩶ۚ, int, boolean):int[]");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m41057(int i, int[] iArr) {
        if (iArr == null || i >= iArr.length || m41070(iArr[i]) < 67) {
            return -1;
        }
        return m41077(iArr[i] + 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0025  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m41059(l.C9104 r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.m41073(r11)
            int r1 = r0 >>> 24
            r2 = 1
            if (r1 == 0) goto L70
            if (r1 == r2) goto L70
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            switch(r1) {
                case 16: goto L25;
                case 17: goto L25;
                case 18: goto L25;
                case 19: goto L19;
                case 20: goto L19;
                case 21: goto L19;
                case 22: goto L70;
                case 23: goto L25;
                default: goto L10;
            }
        L10:
            switch(r1) {
                case 64: goto L2a;
                case 65: goto L2a;
                case 66: goto L25;
                case 67: goto L23;
                case 68: goto L23;
                case 69: goto L23;
                case 70: goto L23;
                case 71: goto L1c;
                case 72: goto L1c;
                case 73: goto L1c;
                case 74: goto L1c;
                case 75: goto L1c;
                default: goto L13;
            }
        L13:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>()
            throw r10
        L19:
            r0 = r0 & r3
            int r11 = r11 + r2
            goto L75
        L1c:
            r1 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r0 = r0 & r1
            int r11 = r11 + 4
            goto L75
        L23:
            r0 = r0 & r3
            goto L27
        L25:
            r0 = r0 & (-256(0xffffffffffffff00, float:NaN))
        L27:
            int r11 = r11 + 3
            goto L75
        L2a:
            r0 = r0 & r3
            int r1 = r11 + 1
            int r1 = r9.m41077(r1)
            int r11 = r11 + 3
            l.֨᩶ۚ[] r3 = new l.C1342[r1]
            r10.f27591 = r3
            l.֨᩶ۚ[] r3 = new l.C1342[r1]
            r10.f27588 = r3
            int[] r3 = new int[r1]
            r10.f27587 = r3
            r3 = 0
        L40:
            if (r3 >= r1) goto L75
            int r4 = r9.m41077(r11)
            int r5 = r11 + 2
            int r5 = r9.m41077(r5)
            int r6 = r11 + 4
            int r6 = r9.m41077(r6)
            int r11 = r11 + 6
            l.֨᩶ۚ[] r7 = r10.f27591
            l.֨᩶ۚ[] r8 = r10.f27595
            l.֨᩶ۚ r8 = m41064(r4, r8)
            r7[r3] = r8
            l.֨᩶ۚ[] r7 = r10.f27588
            int r4 = r4 + r5
            l.֨᩶ۚ[] r5 = r10.f27595
            l.֨᩶ۚ r4 = m41064(r4, r5)
            r7[r3] = r4
            int[] r4 = r10.f27587
            r4[r3] = r6
            int r3 = r3 + 1
            goto L40
        L70:
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r1
            int r11 = r11 + 2
        L75:
            r10.f27580 = r0
            int r0 = r9.m41070(r11)
            if (r0 != 0) goto L7f
            r1 = 0
            goto L86
        L7f:
            l.᩺᩶ۚ r1 = new l.᩺᩶ۚ
            byte[] r3 = r9.f53689
            r1.<init>(r3, r11)
        L86:
            r10.f27585 = r1
            int r11 = r11 + r2
            int r0 = r0 * 2
            int r0 = r0 + r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17570.m41059(l.ۡ᩶ۚ, int):int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m41066(AbstractC15452 abstractC15452, C9104 c9104, int i, boolean z) {
        int i2 = i + 1;
        int i3 = this.f53689[i] & 255;
        abstractC15452.mo28283(i3, z);
        char[] cArr = c9104.f27589;
        for (int i4 = 0; i4 < i3; i4++) {
            int m41077 = m41077(i2);
            i2 += 2;
            while (true) {
                int i5 = m41077 - 1;
                if (m41077 > 0) {
                    i2 = m41061(abstractC15452.mo26964(i4, m41074(cArr, i2), z), i2 + 2, true, cArr);
                    m41077 = i5;
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m41061(AbstractC14104 abstractC14104, int i, boolean z, char[] cArr) {
        int m41077 = m41077(i);
        int i2 = i + 2;
        if (!z) {
            while (true) {
                int i3 = m41077 - 1;
                if (m41077 <= 0) {
                    break;
                }
                i2 = m41060(abstractC14104, i2, (String) null, cArr);
                m41077 = i3;
            }
        } else {
            while (true) {
                int i4 = m41077 - 1;
                if (m41077 <= 0) {
                    break;
                }
                i2 = m41060(abstractC14104, i2 + 2, m41074(cArr, i2), cArr);
                m41077 = i4;
            }
        }
        if (abstractC14104 != null) {
            abstractC14104.mo20790();
        }
        return i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m41060(AbstractC14104 abstractC14104, int i, String str, char[] cArr) {
        Object obj;
        byte[] bArr = this.f53689;
        int i2 = 0;
        if (abstractC14104 == null) {
            int i3 = bArr[i] & 255;
            if (i3 == 64) {
                return m41061((AbstractC14104) null, i + 3, true, cArr);
            }
            if (i3 != 91) {
                return i3 != 101 ? i + 3 : i + 5;
            }
            return m41061((AbstractC14104) null, i + 1, false, cArr);
        }
        int i4 = i + 1;
        int i5 = bArr[i] & 255;
        if (i5 != 64) {
            if (i5 != 70) {
                int[] iArr = this.f53692;
                if (i5 == 83) {
                    abstractC14104.mo20792(Short.valueOf((short) m41073(iArr[m41077(i4)])), str);
                    return i + 3;
                }
                if (i5 == 99) {
                    abstractC14104.mo20792(C11926.m29091(m41074(cArr, i4)), str);
                    return i + 3;
                }
                if (i5 == 101) {
                    abstractC14104.mo20793(str, m41074(cArr, i4), m41074(cArr, i + 3));
                    return i + 5;
                }
                if (i5 == 115) {
                    abstractC14104.mo20792(m41074(cArr, i4), str);
                    return i + 3;
                }
                if (i5 != 73 && i5 != 74) {
                    if (i5 == 90) {
                        if (m41073(iArr[m41077(i4)]) == 0) {
                            obj = Boolean.FALSE;
                        } else {
                            obj = Boolean.TRUE;
                        }
                        abstractC14104.mo20792(obj, str);
                        return i + 3;
                    }
                    if (i5 != 91) {
                        switch (i5) {
                            case 66:
                                abstractC14104.mo20792(Byte.valueOf((byte) m41073(iArr[m41077(i4)])), str);
                                return i + 3;
                            case 67:
                                abstractC14104.mo20792(Character.valueOf((char) m41073(iArr[m41077(i4)])), str);
                                return i + 3;
                            case 68:
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    } else {
                        int m41077 = m41077(i4);
                        int i6 = i + 3;
                        if (m41077 == 0) {
                            return m41061(abstractC14104.mo20788(str), i4, false, cArr);
                        }
                        int i7 = bArr[i6] & 255;
                        if (i7 == 70) {
                            float[] fArr = new float[m41077];
                            while (i2 < m41077) {
                                fArr[i2] = Float.intBitsToFloat(m41073(iArr[m41077(i6 + 1)]));
                                i6 += 3;
                                i2++;
                            }
                            abstractC14104.mo20792(fArr, str);
                            return i6;
                        }
                        if (i7 == 83) {
                            short[] sArr = new short[m41077];
                            while (i2 < m41077) {
                                sArr[i2] = (short) m41073(iArr[m41077(i6 + 1)]);
                                i6 += 3;
                                i2++;
                            }
                            abstractC14104.mo20792(sArr, str);
                            return i6;
                        }
                        if (i7 == 90) {
                            boolean[] zArr = new boolean[m41077];
                            for (int i8 = 0; i8 < m41077; i8++) {
                                zArr[i8] = m41073(iArr[m41077(i6 + 1)]) != 0;
                                i6 += 3;
                            }
                            abstractC14104.mo20792(zArr, str);
                            return i6;
                        }
                        if (i7 == 73) {
                            int[] iArr2 = new int[m41077];
                            while (i2 < m41077) {
                                iArr2[i2] = m41073(iArr[m41077(i6 + 1)]);
                                i6 += 3;
                                i2++;
                            }
                            abstractC14104.mo20792(iArr2, str);
                            return i6;
                        }
                        if (i7 != 74) {
                            switch (i7) {
                                case 66:
                                    byte[] bArr2 = new byte[m41077];
                                    while (i2 < m41077) {
                                        bArr2[i2] = (byte) m41073(iArr[m41077(i6 + 1)]);
                                        i6 += 3;
                                        i2++;
                                    }
                                    abstractC14104.mo20792(bArr2, str);
                                    return i6;
                                case 67:
                                    char[] cArr2 = new char[m41077];
                                    while (i2 < m41077) {
                                        cArr2[i2] = (char) m41073(iArr[m41077(i6 + 1)]);
                                        i6 += 3;
                                        i2++;
                                    }
                                    abstractC14104.mo20792(cArr2, str);
                                    return i6;
                                case 68:
                                    double[] dArr = new double[m41077];
                                    while (i2 < m41077) {
                                        dArr[i2] = Double.longBitsToDouble(m41075(iArr[m41077(i6 + 1)]));
                                        i6 += 3;
                                        i2++;
                                    }
                                    abstractC14104.mo20792(dArr, str);
                                    return i6;
                                default:
                                    return m41061(abstractC14104.mo20788(str), i4, false, cArr);
                            }
                        }
                        long[] jArr = new long[m41077];
                        while (i2 < m41077) {
                            jArr[i2] = m41075(iArr[m41077(i6 + 1)]);
                            i6 += 3;
                            i2++;
                        }
                        abstractC14104.mo20792(jArr, str);
                        return i6;
                    }
                }
            }
            abstractC14104.mo20792(m41071(cArr, m41077(i4)), str);
            return i + 3;
        }
        return m41061(abstractC14104.mo20789(str, m41074(cArr, i4)), i + 3, true, cArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m41058(int i, Object[] objArr, int i2, char[] cArr, C1342[] c1342Arr) {
        int i3 = i + 1;
        switch (this.f53689[i] & 255) {
            case 0:
                objArr[i2] = 0;
                return i3;
            case 1:
                objArr[i2] = 1;
                return i3;
            case 2:
                objArr[i2] = 2;
                return i3;
            case 3:
                objArr[i2] = 3;
                return i3;
            case 4:
                objArr[i2] = 4;
                return i3;
            case 5:
                objArr[i2] = 5;
                return i3;
            case 6:
                objArr[i2] = 6;
                return i3;
            case 7:
                objArr[i2] = m41068(cArr, i3);
                break;
            case 8:
                objArr[i2] = m41064(m41077(i3), c1342Arr);
                break;
            default:
                throw new IllegalArgumentException();
        }
        return i + 3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41069() {
        int i = this.f53690;
        int m41077 = (m41077(i + 6) * 2) + i + 8;
        int m410772 = m41077(m41077);
        int i2 = m41077 + 2;
        while (true) {
            int i3 = m410772 - 1;
            if (m410772 <= 0) {
                break;
            }
            int m410773 = m41077(i2 + 6);
            i2 += 8;
            while (true) {
                int i4 = m410773 - 1;
                if (m410773 > 0) {
                    i2 += m41073(i2 + 2) + 6;
                    m410773 = i4;
                }
            }
            m410772 = i3;
        }
        int m410774 = m41077(i2);
        int i5 = i2 + 2;
        while (true) {
            int i6 = m410774 - 1;
            if (m410774 <= 0) {
                return i5 + 2;
            }
            int m410775 = m41077(i5 + 6);
            i5 += 8;
            while (true) {
                int i7 = m410775 - 1;
                if (m410775 > 0) {
                    i5 += m41073(i5 + 2) + 6;
                    m410775 = i7;
                }
            }
            m410774 = i6;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C16864 m41065(C16864[] c16864Arr, String str, int i, int i2, char[] cArr, int i3, C1342[] c1342Arr) {
        if (i2 > this.f53689.length - i) {
            throw new IllegalArgumentException();
        }
        for (C16864 c16864 : c16864Arr) {
            if (c16864.f51745.equals(str)) {
                return c16864.m39637(this, i, i2, cArr);
            }
        }
        return new C16864(str).m39637(this, i, i2, (char[]) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41070(int i) {
        return this.f53689[i] & 255;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m41077(int i) {
        byte[] bArr = this.f53689;
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final short m41078(int i) {
        byte[] bArr = this.f53689;
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m41073(int i) {
        byte[] bArr = this.f53689;
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m41075(int i) {
        return (m41073(i) << 32) | (m41073(i + 4) & 4294967295L);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m41074(char[] cArr, int i) {
        int m41077 = m41077(i);
        if (i == 0 || m41077 == 0) {
            return null;
        }
        return m41076(cArr, m41077);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m41076(char[] cArr, int i) {
        String[] strArr = this.f53693;
        String str = strArr[i];
        if (str != null) {
            return str;
        }
        int i2 = this.f53692[i];
        String m41063 = m41063(cArr, i2 + 2, m41077(i2));
        strArr[i] = m41063;
        return m41063;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m41063(char[] cArr, int i, int i2) {
        int i3;
        int i4 = i2 + i;
        int i5 = 0;
        while (i < i4) {
            int i6 = i + 1;
            byte[] bArr = this.f53689;
            byte b = bArr[i];
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                cArr[i5] = (char) (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
                i5++;
                i = i6;
            } else {
                if ((b & bo.k) == 192) {
                    i3 = i5 + 1;
                    i += 2;
                    cArr[i5] = (char) (((b & bo.j) << 6) + (bArr[i6] & 63));
                } else {
                    i3 = i5 + 1;
                    int i7 = i + 2;
                    i += 3;
                    cArr[i5] = (char) (((b & 15) << 12) + ((bArr[i6] & 63) << 6) + (bArr[i7] & 63));
                }
                i5 = i3;
            }
        }
        return new String(cArr, 0, i5);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private String m41068(char[] cArr, int i) {
        return m41074(cArr, this.f53692[m41077(i)]);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m41071(char[] cArr, int i) {
        int[] iArr = this.f53692;
        int i2 = iArr[i];
        byte[] bArr = this.f53689;
        byte b = bArr[i2 - 1];
        switch (b) {
            case 3:
                return Integer.valueOf(m41073(i2));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(m41073(i2)));
            case 5:
                return Long.valueOf(m41075(i2));
            case 6:
                return Double.valueOf(Double.longBitsToDouble(m41075(i2)));
            case 7:
                return C11926.m29095(m41074(cArr, i2));
            case 8:
                return m41074(cArr, i2);
            default:
                switch (b) {
                    case 15:
                        int m41070 = m41070(i2);
                        int i3 = iArr[m41077(i2 + 1)];
                        int i4 = iArr[m41077(i3 + 2)];
                        return new C0636(m41070, m41068(cArr, i3), m41074(cArr, i4), m41074(cArr, i4 + 2), bArr[i3 - 1] == 11);
                    case 16:
                        return C11926.m29096(m41074(cArr, i2));
                    case 17:
                        C21099[] c21099Arr = this.f53691;
                        C21099 c21099 = c21099Arr[i];
                        if (c21099 != null) {
                            return c21099;
                        }
                        int i5 = iArr[m41077(i2 + 2)];
                        String m41074 = m41074(cArr, i5);
                        String m410742 = m41074(cArr, i5 + 2);
                        int i6 = this.f53688[m41077(i2)];
                        C0636 c0636 = (C0636) m41071(cArr, m41077(i6));
                        int m41077 = m41077(i6 + 2);
                        Object[] objArr = new Object[m41077];
                        int i7 = i6 + 4;
                        for (int i8 = 0; i8 < m41077; i8++) {
                            objArr[i8] = m41071(cArr, m41077(i7));
                            i7 += 2;
                        }
                        C21099 c210992 = new C21099(m41074, m410742, c0636, objArr);
                        c21099Arr[i] = c210992;
                        return c210992;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }
}

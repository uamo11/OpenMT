package l;

/* compiled from: 78KJ */
/* renamed from: l.ۤۖۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10004 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25169(int i, C23896 c23896, C1297 c1297, C23896 c238962, C23896... c23896Arr) {
        if (c238962 == null) {
            c238962 = new C23896(new InterfaceC14723[0]);
        }
        if (c23896 != null) {
            for (int i2 = 0; i2 < c23896.m52639(); i2++) {
                InterfaceC14723 m52640 = c23896.m52640(i2);
                if (m52640 instanceof C0074) {
                    C0074 c0074 = (C0074) m52640;
                    if (!c0074.f988.equals("com.android.capture.fps")) {
                        c238962 = c238962.m52643(c0074);
                    } else if (i == 2) {
                        c238962 = c238962.m52643(c0074);
                    }
                }
            }
        }
        for (C23896 c238963 : c23896Arr) {
            c238962 = c238962.m52642(c238963);
        }
        if (c238962.m52639() > 0) {
            c1297.m4449(c238962);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC14626 m25171(C17714 c17714) {
        int m41493 = c17714.m41493() + c17714.m41485();
        int m414932 = c17714.m41493();
        int i = (m414932 >> 24) & 255;
        AbstractC14626 abstractC14626 = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = 16777215 & m414932;
                if (i2 == 6516084) {
                    int m414933 = c17714.m41493();
                    if (c17714.m41493() == 1684108385) {
                        c17714.m41478(8);
                        String m41473 = c17714.m41473(m414933 - 16);
                        abstractC14626 = new C1927("und", m41473, m41473);
                    } else {
                        C19956.m46037("Failed to parse comment attribute: " + AbstractC14891.m35327(m414932));
                    }
                    return abstractC14626;
                }
                if (i2 == 7233901 || i2 == 7631467) {
                    return m25170(m414932, c17714, "TIT2");
                }
                if (i2 == 6516589 || i2 == 7828084) {
                    return m25170(m414932, c17714, "TCOM");
                }
                if (i2 == 6578553) {
                    return m25170(m414932, c17714, "TDRC");
                }
                if (i2 == 4280916) {
                    return m25170(m414932, c17714, "TPE1");
                }
                if (i2 == 7630703) {
                    return m25170(m414932, c17714, "TSSE");
                }
                if (i2 == 6384738) {
                    return m25170(m414932, c17714, "TALB");
                }
                if (i2 == 7108978) {
                    return m25170(m414932, c17714, "USLT");
                }
                if (i2 == 6776174) {
                    return m25170(m414932, c17714, "TCON");
                }
                if (i2 == 6779504) {
                    return m25170(m414932, c17714, "TIT1");
                }
            } else {
                if (m414932 == 1735291493) {
                    String m52477 = C23799.m52477(m25172(c17714) - 1);
                    if (m52477 != null) {
                        abstractC14626 = new C8983("TCON", null, AbstractC14545.of((Object) m52477));
                    } else {
                        C19956.m46037("Failed to parse standard genre code");
                    }
                    return abstractC14626;
                }
                if (m414932 == 1684632427) {
                    return m25166(m414932, c17714, "TPOS");
                }
                if (m414932 == 1953655662) {
                    return m25166(m414932, c17714, "TRCK");
                }
                if (m414932 == 1953329263) {
                    return m25168(m414932, "TBPM", c17714, true, false);
                }
                if (m414932 == 1668311404) {
                    return m25168(m414932, "TCMP", c17714, true, true);
                }
                if (m414932 == 1668249202) {
                    return m25167(c17714);
                }
                if (m414932 == 1631670868) {
                    return m25170(m414932, c17714, "TPE2");
                }
                if (m414932 == 1936682605) {
                    return m25170(m414932, c17714, "TSOT");
                }
                if (m414932 == 1936679276) {
                    return m25170(m414932, c17714, "TSOA");
                }
                if (m414932 == 1936679282) {
                    return m25170(m414932, c17714, "TSOP");
                }
                if (m414932 == 1936679265) {
                    return m25170(m414932, c17714, "TSO2");
                }
                if (m414932 == 1936679791) {
                    return m25170(m414932, c17714, "TSOC");
                }
                if (m414932 == 1920233063) {
                    return m25168(m414932, "ITUNESADVISORY", c17714, false, false);
                }
                if (m414932 == 1885823344) {
                    return m25168(m414932, "ITUNESGAPLESS", c17714, false, true);
                }
                if (m414932 == 1936683886) {
                    return m25170(m414932, c17714, "TVSHOWSORT");
                }
                if (m414932 == 1953919848) {
                    return m25170(m414932, c17714, "TVSHOW");
                }
                if (m414932 == 757935405) {
                    int i3 = -1;
                    int i4 = -1;
                    String str = null;
                    String str2 = null;
                    while (c17714.m41485() < m41493) {
                        int m41485 = c17714.m41485();
                        int m414934 = c17714.m41493();
                        int m414935 = c17714.m41493();
                        c17714.m41478(4);
                        if (m414935 == 1835360622) {
                            str = c17714.m41473(m414934 - 12);
                        } else if (m414935 == 1851878757) {
                            str2 = c17714.m41473(m414934 - 12);
                        } else {
                            if (m414935 == 1684108385) {
                                i3 = m41485;
                                i4 = m414934;
                            }
                            c17714.m41478(m414934 - 12);
                        }
                    }
                    if (str != null && str2 != null && i3 != -1) {
                        c17714.m41484(i3);
                        c17714.m41478(16);
                        abstractC14626 = new C6866(str, str2, c17714.m41473(i4 - 16));
                    }
                    return abstractC14626;
                }
            }
            C19956.m46031("Skipped unknown metadata entry: " + AbstractC14891.m35327(m414932));
            return null;
        } finally {
            c17714.m41484(m41493);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0074 m25165(C23896 c23896, String str) {
        for (int i = 0; i < c23896.m52639(); i++) {
            InterfaceC14723 m52640 = c23896.m52640(i);
            if (m52640 instanceof C0074) {
                C0074 c0074 = (C0074) m52640;
                if (c0074.f988.equals(str)) {
                    return c0074;
                }
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C8983 m25170(int i, C17714 c17714, String str) {
        int m41493 = c17714.m41493();
        if (c17714.m41493() == 1684108385) {
            c17714.m41478(8);
            return new C8983(str, null, AbstractC14545.of((Object) c17714.m41473(m41493 - 16)));
        }
        C19956.m46037("Failed to parse text attribute: " + AbstractC14891.m35327(i));
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC14626 m25168(int i, String str, C17714 c17714, boolean z, boolean z2) {
        int m25172 = m25172(c17714);
        if (z2) {
            m25172 = Math.min(1, m25172);
        }
        if (m25172 >= 0) {
            if (z) {
                return new C8983(str, null, AbstractC14545.of((Object) Integer.toString(m25172)));
            }
            return new C1927("und", str, Integer.toString(m25172));
        }
        C19956.m46037("Failed to parse uint8 attribute: " + AbstractC14891.m35327(i));
        return null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m25172(C17714 c17714) {
        int m41493 = c17714.m41493();
        if (c17714.m41493() == 1684108385) {
            c17714.m41478(8);
            int i = m41493 - 16;
            if (i == 1) {
                return c17714.m41456();
            }
            if (i == 2) {
                return c17714.m41464();
            }
            if (i == 3) {
                return c17714.m41491();
            }
            if (i == 4 && (c17714.m41477() & 128) == 0) {
                return c17714.m41492();
            }
        }
        C19956.m46037("Failed to parse data atom to int");
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8983 m25166(int i, C17714 c17714, String str) {
        int m41493 = c17714.m41493();
        if (c17714.m41493() == 1684108385 && m41493 >= 22) {
            c17714.m41478(10);
            int m41464 = c17714.m41464();
            if (m41464 > 0) {
                String m44628 = C19370.m44628(m41464, "");
                int m414642 = c17714.m41464();
                if (m414642 > 0) {
                    m44628 = m44628 + "/" + m414642;
                }
                return new C8983(str, null, AbstractC14545.of((Object) m44628));
            }
        }
        C19956.m46037("Failed to parse index/count attribute: " + AbstractC14891.m35327(i));
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11600 m25167(C17714 c17714) {
        int m41493 = c17714.m41493();
        if (c17714.m41493() != 1684108385) {
            C19956.m46037("Failed to parse cover art attribute");
            return null;
        }
        int m414932 = c17714.m41493();
        int i = C21998.f70423;
        int i2 = m414932 & 16777215;
        String str = i2 == 13 ? "image/jpeg" : i2 == 14 ? "image/png" : null;
        if (str == null) {
            C8083.m21451(i2, "Unrecognized cover art flags: ");
            return null;
        }
        c17714.m41478(4);
        int i3 = m41493 - 16;
        byte[] bArr = new byte[i3];
        c17714.m41461(0, i3, bArr);
        return new C11600(3, str, null, bArr);
    }
}

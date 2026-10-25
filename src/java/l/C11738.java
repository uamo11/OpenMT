package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: 64JA */
/* renamed from: l.ۨܰۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11738 extends C1860 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C20911 f35013;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C22301 f35017;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C8815 f35018;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7776 f35021;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23298 f35022;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C5660 f35023;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23732 f35025;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList f35016 = new ArrayList();

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C3046 f35012 = null;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C13813 f35026 = null;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f35011 = null;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f35015 = "";

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public ArrayList f35024 = null;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f35019 = null;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ArrayList f35014 = null;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f35020 = false;

    public C11738(C3917 c3917, C22301 c22301) {
        this.f6339 = c3917;
        this.f6341 = new C6615(c3917);
        this.f6340 = this;
        C23732 c23732 = new C23732(this);
        this.f35025 = c23732;
        this.f35022 = new C23298(this);
        this.f35013 = new C20911(this, c23732);
        C7776 c7776 = new C7776();
        c7776.f6339 = this.f6339;
        c7776.f6341 = this.f6341;
        c7776.f6340 = this;
        this.f35021 = c7776;
        this.f35017 = C22301.m50033(c22301);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m28694() {
        this.f6341.getClass();
        this.f35025.getClass();
        this.f35022.getClass();
        this.f35013.getClass();
        this.f35021.getClass();
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private C6491 m28675() {
        C6615 c6615 = this.f6341;
        if (c6615.f20355 == EnumC15204.f46542) {
            c6615.m18126();
            C6615 c66152 = this.f6341;
            EnumC15204 enumC15204 = c66152.f20355;
            EnumC15204 enumC152042 = EnumC15204.f46543;
            if (enumC15204 == enumC152042) {
                int i = c66152.f20360;
                c66152.m18126();
                C6615 c66153 = this.f6341;
                if (c66153.f20355 == EnumC15204.f46597) {
                    c66153.m18126();
                    C6615 c66154 = this.f6341;
                    if (c66154.f20355 == enumC152042) {
                        int i2 = c66154.f20360;
                        this.f35026.f41195.m50037(i, i2);
                        this.f6341.m18126();
                        "parseVersion: ".concat(this.f35026.f41195.m50035());
                        return new C6491(Integer.valueOf(i), Integer.valueOf(i2));
                    }
                }
            }
        }
        throw C19462.m44860(this.f6339, this.f6341.f20363, "class file version expected", new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v10, types: [l.ܳۤۚ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m28684(l.EnumC15536 r17) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11738.m28684(l.ܶ᩺ۚ):void");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6739 m28692() {
        C6615 c6615 = this.f6341;
        if (c6615.f20355 != EnumC15204.f46543) {
            throw C19462.m44860(this.f6339, c6615.f20363, "A valid index into the local variable array of the current frame expected", new Object[0]);
        }
        int i = c6615.f20360;
        c6615.m18126();
        return new C6739(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b1  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m28689(l.EnumC15536 r17) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11738.m28689(l.ܶ᩺ۚ):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28688(C5868 c5868) {
        C6615 c6615 = this.f6341;
        if (c6615.f20355 == EnumC15204.f46579) {
            int i = c6615.f20360;
            C10102 c10102 = new C10102();
            c10102.f30409 = null;
            c10102.f30408 = i;
            c5868.m16430(c10102);
            this.f6341.m18126();
            return;
        }
        C15869 m28690 = m28690();
        this.f6341.m18132(EnumC15204.f46597);
        C15869 m9314 = this.f35012.m9314((AbstractC2465) new C0929(m28690, m28690()));
        C10102 c101022 = new C10102();
        c101022.f30408 = -1;
        c101022.f30409 = m9314;
        c5868.m16430(c101022);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28683(C5868 c5868) {
        EnumC10932 enumC10932;
        EnumC15204 enumC15204;
        EnumC13833 m20107 = C7484.m20107(this.f6341.f20360, C16646.empty());
        C6615 c6615 = this.f6341;
        EnumC15204 enumC152042 = c6615.f20355;
        int i = c6615.f20360;
        String str = c6615.f20350;
        c6615.m18126();
        int i2 = C13148.f39311[enumC152042.ordinal()];
        C15869 c15869 = null;
        if (i2 == 1) {
            enumC10932 = null;
        } else if (i2 == 2) {
            m20107 = EnumC13833.ITEM_Object;
            enumC10932 = EnumC10932.f32947;
        } else if (i2 == 3) {
            m20107 = EnumC13833.ITEM_Object;
            c15869 = this.f35012.m9311(i);
            enumC10932 = null;
        } else {
            if (i2 != 4) {
                enumC10932 = null;
            } else {
                m20107 = EnumC13833.m33189(str);
                enumC10932 = C17987.m42035(str);
                if (m20107 != null) {
                    if (enumC10932 != null && (enumC15204 = this.f6341.f20355) != EnumC15204.f46479 && enumC15204 != EnumC15204.f46591) {
                        m20107 = EnumC13833.ITEM_Object;
                    }
                } else if (enumC10932 != null) {
                    m20107 = EnumC13833.ITEM_Object;
                }
            }
            m20107 = EnumC13833.ITEM_Bogus;
            this.f6339.mo11946("StackMap entry type expected instead of {0}", "<" + enumC152042.m35962() + ">");
        }
        int i3 = C13148.f39309[m20107.ordinal()];
        if (i3 == 1) {
            if (c15869 == null) {
                c15869 = this.f35012.m9314(this.f35025.m52381(enumC10932));
            }
            c5868.f18006.add(new C18610(m20107, c15869));
        } else {
            if (i3 == 2) {
                c5868.f18006.add(new C18610(m20107, this.f35013.m47746()));
                return;
            }
            C3793 c3793 = new C3793();
            c3793.f11968 = m20107;
            c5868.f18006.add(c3793);
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C15869 m28690() {
        C6615 c6615 = this.f6341;
        EnumC15204 enumC15204 = c6615.f20355;
        if (enumC15204 == EnumC15204.f46579) {
            int i = c6615.f20360;
            c6615.m18126();
            return this.f35012.m9311(i);
        }
        if (enumC15204 == EnumC15204.f46647) {
            String str = c6615.f20350;
            c6615.m18126();
            return this.f35012.m9312(str);
        }
        if (enumC15204.m35964()) {
            C6615 c66152 = this.f6341;
            String str2 = c66152.f20357;
            c66152.m18126();
            return this.f35012.m9312(str2);
        }
        throw C19462.m44860(this.f6339, this.f6341.f20363, "Either name or Constant Pool index expected, got {0}", new Object[]{"\"" + this.f6341.f20355 + "\""});
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15869 m28681(EnumC16575 enumC16575) {
        int i = C13148.f39310[enumC16575.ordinal()];
        C23732 c23732 = this.f35025;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                return this.f35012.m9314(c23732.m52381(EnumC10932.f32924));
            case 5:
            case 6:
                c23732.m52385(true);
                EnumC10932 enumC10932 = EnumC10932.f32936;
                C15869 m52383 = c23732.m52383(enumC10932, EnumC10932.f32941, false);
                c23732.m52385(false);
                m28649(this.f6339.m11948(), enumC10932, null);
                return m52383;
            case 7:
            case 8:
                EnumC10932 enumC109322 = EnumC10932.f32936;
                EnumC10932 enumC109323 = EnumC10932.f32941;
                if (this.f35026.f41195.m50045() >= 52 && EnumC6073.m16948(this.f35026.f37140)) {
                    enumC109323 = enumC109322;
                    enumC109322 = enumC109323;
                }
                c23732.m52385(true);
                C15869 m523832 = c23732.m52383(enumC109322, enumC109323, false);
                c23732.m52385(false);
                m28649(this.f6339.m11948(), enumC109322, enumC109323);
                return m523832;
            case 9:
                c23732.m52385(true);
                EnumC10932 enumC109324 = EnumC10932.f32941;
                C15869 m523833 = c23732.m52383(enumC109324, EnumC10932.f32936, false);
                c23732.m52385(false);
                m28649(this.f6339.m11948(), enumC109324, null);
                return m523833;
            default:
                throw new C12136();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28649(long j, EnumC10932 enumC10932, EnumC10932 enumC109322) {
        if (this.f6341.f20355.m35961(EnumC15204.f46597, EnumC15204.f46479, EnumC15204.f46591)) {
            return;
        }
        if (enumC109322 != null) {
            this.f6339.mo9065(j, "Wrong tag: Either {0} or {1} expected", enumC10932.m27257(), enumC109322.m27257());
        } else {
            this.f6339.mo9065(j, "Wrong tag: {0} expected", enumC10932.m27257());
        }
        C12136 c12136 = new C12136();
        c12136.m29561();
        throw c12136;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final EnumC16575 m28695() {
        EnumC16575 m42033;
        int i = C13148.f39311[this.f6341.f20355.ordinal()];
        if (i != 1) {
            m42033 = i != 4 ? null : C17987.m42034(this.f6341.f20350);
        } else {
            m42033 = C17987.m42033(this.f6341.f20360);
        }
        if (m42033 == null) {
            this.f6339.mo11946("Subtag expected", new Object[0]);
            throw new C12136();
        }
        this.f6341.m18126();
        return m42033;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15869 m28691() {
        C6615 c6615 = this.f6341;
        EnumC15204 enumC15204 = c6615.f20355;
        if (enumC15204 == EnumC15204.f46579) {
            int i = c6615.f20360;
            c6615.m18126();
            return this.f35012.m9311(i);
        }
        if (enumC15204 == EnumC15204.f46647 || enumC15204.m35964()) {
            C6615 c66152 = this.f6341;
            String str = c66152.f20350;
            c66152.m18126();
            C3046 c3046 = this.f35012;
            c3046.getClass();
            return c3046.m9314((AbstractC2465) new C17157(EnumC10932.f32916, c3046.m9312(str)));
        }
        m28650("Either package name or Constant Pool index expected, got {0}");
        throw null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15869 m28687() {
        C6615 c6615 = this.f6341;
        EnumC15204 enumC15204 = c6615.f20355;
        if (enumC15204 == EnumC15204.f46579) {
            int i = c6615.f20360;
            c6615.m18126();
            return this.f35012.m9311(i);
        }
        if (enumC15204 == EnumC15204.f46647 || enumC15204.m35968()) {
            C6615 c66152 = this.f6341;
            String str = c66152.f20350;
            c66152.m18126();
            C3046 c3046 = this.f35012;
            c3046.getClass();
            return c3046.m9314((AbstractC2465) new C17157(EnumC10932.f32946, c3046.m9312(str)));
        }
        m28650("Either a module name or Constant Pool index expected, got {0}");
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15869 m28682(boolean z) {
        C6615 c6615 = this.f6341;
        EnumC15204 enumC15204 = c6615.f20355;
        if (enumC15204 == EnumC15204.f46579) {
            int i = c6615.f20360;
            c6615.m18126();
            return this.f35012.m9311(i);
        }
        if (enumC15204 != EnumC15204.f46647 && !enumC15204.m35964()) {
            m28650("Either a class name or Constant Pool index expected, got {0}");
            throw null;
        }
        C6615 c66152 = this.f6341;
        String str = c66152.f20350;
        c66152.m18126();
        if ((z || this.f6341.f20355 == EnumC15204.f46599) && !str.contains("/") && !str.contains("[")) {
            str = C9045.m23341(new StringBuilder(), this.f35015, str);
        }
        return this.f35012.m9312(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28650(String str) {
        EnumC10932 m42030 = C17987.m42030(this.f6341.f20355.m35965());
        this.f6339.m45778("Unrecognized token %s: %s", this.f6341.f20355.toString(), m42030 == null ? "null" : m42030.m27257());
        throw C19462.m44860(this.f6339, this.f6341.f20364, str, new Object[]{C21639.m48906(this.f6341.f20355, new StringBuilder("\""), "\"")});
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6739 m28680(int i, String str) {
        C6615 c6615 = this.f6341;
        if (c6615.f20355 == EnumC15204.f46572) {
            c6615.m18126();
        }
        C6615 c66152 = this.f6341;
        if (c66152.f20355 != EnumC15204.f46543) {
            throw C19462.m44860(this.f6339, c66152.f20363, "Integer expected", new Object[0]);
        }
        int i2 = c66152.f20360 * c66152.f20353;
        if (i != 1) {
            if (i != 2) {
                throw new InternalError(C18307.m42645(i, "parseInt(", MotionUtils.EASING_TYPE_FORMAT_END));
            }
            if (i2 > 65535 || i2 < -32768) {
                throw C19462.m44860(this.f6339, c66152.f20363, "{0} value {1} does not fit in {2}", new Object[]{str, Integer.valueOf(i2), "2 bytes"});
            }
        } else if (i2 > 255 || i2 < -128) {
            throw C19462.m44860(this.f6339, c66152.f20363, "{0} value {1} does not fit in {2}", new Object[]{str, Integer.valueOf(i2), "1 byte"});
        }
        c66152.m18126();
        return new C6739(i2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6739 m28679(int i) {
        C6615 c6615 = this.f6341;
        if (c6615.f20355 != EnumC15204.f46543) {
            throw C19462.m44860(this.f6339, c6615.f20363, "Integer expected", new Object[0]);
        }
        if (c6615.f20353 == -1) {
            throw C19462.m44860(this.f6339, c6615.f20363, "Negative integer is not allowed", new Object[0]);
        }
        int i2 = c6615.f20360;
        if (i != 1) {
            if (i != 2) {
                throw new InternalError(C18307.m42645(i, "parseUInt(", MotionUtils.EASING_TYPE_FORMAT_END));
            }
            if (i2 > 65535) {
                throw C19462.m44860(this.f6339, c6615.f20363, "{0} value {1} does not fit in {2}", new Object[]{"ushort", Integer.valueOf(i2), "2 bytes"});
            }
        } else if (i2 > 255) {
            throw C19462.m44860(this.f6339, c6615.f20363, "{0} value {1} does not fit in {2}", new Object[]{"ubyte", Integer.valueOf(i2), "1 byte"});
        }
        c6615.m18126();
        return new C6739(i2);
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m28657() {
        while (true) {
            C6615 c6615 = this.f6341;
            if (c6615.f20355 == EnumC15204.f46579) {
                int i = c6615.f20360;
                c6615.m18126();
                this.f6341.m18132(EnumC15204.f46608);
                String.format("\ncpIndex: %d", Integer.valueOf(i));
                this.f35012.m9317(i, this.f35025.m52387());
                C6615 c66152 = this.f6341;
                if (c66152.f20355 != EnumC15204.f46591) {
                    c66152.m18132(EnumC15204.f46479);
                    return;
                }
                c66152.m18126();
            } else {
                this.f6339.mo11946("Constant declaration expected", new Object[0]);
                throw new C12136();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00eb A[SYNTHETIC] */
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m28686() {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11738.m28686():int");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m28670(int i) {
        C13813 c13813 = this.f35026;
        long j = this.f6341.f20364;
        C3917 c3917 = (C3917) c13813.m30112();
        int m16950 = EnumC6073.m16950(i, EnumC6073.f18592, EnumC6073.f18612);
        if (EnumC6073.m16948(c13813.f37140)) {
            int i2 = EnumC6073.m16941(m16950) ? (~EnumC6073.f18595.m16978()) & m16950 : m16950;
            if (EnumC6073.m16971(i2)) {
                i2 &= ~EnumC6073.f18608.m16978();
            }
            if (!EnumC6073.m16958(i2, EnumC6073.f18637, EnumC6073.f18603, EnumC6073.f18613)) {
                c3917.mo11949(j, "\"{0}\": Interface field must be ACC_PUBLIC, ACC_STATIC, and ACC_FINAL only and may have ACC_STRICT_INIT or ACC_SYNTHETIC flag set", EnumC6073.m16951(m16950, EnumC20185.FIELD));
            }
            if (!EnumC6073.m16928(m16950)) {
                c3917.mo11949(j, "\"{0}\": Interface field must be ACC_PUBLIC, ACC_STATIC, and ACC_FINAL only and may have ACC_STRICT_INIT or ACC_SYNTHETIC flag set", EnumC6073.m16951(m16950, EnumC20185.FIELD));
            }
        } else {
            if (EnumC6073.m16960() == EnumC20185.VALUE_OBJECTS && !EnumC6073.m16970(c13813.f37140) && !EnumC6073.m16938(m16950, EnumC6073.f18603, EnumC6073.f18608)) {
                c3917.mo11949(j, "\"{0}\": Each field of a value class must have at least one of its ACC_STATIC or ACC_STRICT_INIT flags set", EnumC6073.m16951(m16950, EnumC20185.FIELD));
            }
            int m16965 = EnumC6073.m16965(m16950, EnumC6073.f18631);
            if (m16965 != 0) {
                c3917.mo11949(j, "Invalid modifier(s) for a field {0}", EnumC6073.m16951(m16965, EnumC20185.FIELD));
            }
            if (!EnumC6073.m16974(m16950, EnumC6073.f18637, EnumC6073.f18626, EnumC6073.f18621)) {
                c3917.mo11949(j, "\"{0}\": Each field of a class may have at most one of its ACC_PUBLIC, ACC_PRIVATE, and ACC_PROTECTED flags set", EnumC6073.m16951(m16950, EnumC20185.FIELD));
            }
            if (EnumC6073.m16937(m16950, EnumC6073.f18613, EnumC6073.f18600)) {
                c3917.mo11949(j, "\"{0}\": Each field of a class must not have both its ACC_FINAL and ACC_VOLATILE flags set", EnumC6073.m16951(m16950, EnumC20185.FIELD));
            }
        }
        while (true) {
            C15869 m28690 = m28690();
            C6615 c6615 = this.f6341;
            EnumC15204 enumC15204 = EnumC15204.f46597;
            c6615.m18132(enumC15204);
            C15869 m286902 = m28690();
            C13813 c138132 = this.f35026;
            c138132.getClass();
            C14499 m33150 = c138132.m33150(i, new C20686(m28690, m286902));
            ArrayList arrayList = this.f35014;
            if (arrayList != null) {
                m33150.m30109(arrayList);
            }
            C6615 c66152 = this.f6341;
            if (c66152.f20355 == enumC15204) {
                c66152.m18126();
                C6615 c66153 = this.f6341;
                if (c66153.f20355 == EnumC15204.f46530) {
                    c66153.m18126();
                }
                m33150.m30110(m28690());
            }
            C6615 c66154 = this.f6341;
            if (c66154.f20355 == EnumC15204.f46608) {
                c66154.m18126();
                m33150.m34594(this.f35025.m52383(null, null, false));
            }
            C6615 c66155 = this.f6341;
            if (c66155.f20355 == enumC15204) {
                c66155.m18126();
                EnumC4662 enumC4662 = EnumC4662.f14797;
                m33150.getClass();
                if (C17322.f53049[enumC4662.ordinal()] != 1) {
                    throw new IllegalStateException(C19462.m44858("Unexpected attribute: ", enumC4662.m13646(), " in ", m33150.f37148.name()));
                }
                if (m33150.f37141 != null) {
                    this.f6339.mo11949(this.f6341.f20363, "Signature attribute repeated", new Object[0]);
                }
                C6615 c66156 = this.f6341;
                if (c66156.f20355 == EnumC15204.f46530) {
                    c66156.m18126();
                }
                m33150.m30110(m28690());
            }
            C6615 c66157 = this.f6341;
            if (c66157.f20355 != EnumC15204.f46591) {
                c66157.m18132(EnumC15204.f46479);
                return;
            }
            c66157.m18126();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x0375, code lost:
    
        if (r7.m18130(l.EnumC15204.f46530, l.EnumC15204.f46440) != false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0411, code lost:
    
        if (r5.m18130(l.EnumC15204.f46564, l.EnumC15204.f46601, l.EnumC15204.f46642) != false) goto L167;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:46:0x01fc. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x049c  */
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m28667(int r20) {
        /*
            Method dump skipped, instructions count: 1874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11738.m28667(int):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0501, code lost:
    
        if (r12 <= 0) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0503, code lost:
    
        r2 = r7.f6339;
        r3 = r7.f6341.f20363;
        r6 = new java.lang.Object[r8];
        r6[0] = l.EnumC15204.f46442.m35967();
        r2.m11951(r3, "\"{0}\" token is expected", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0517, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0518, code lost:
    
        r3 = r7.f6339;
        r4 = r7.f6341.f20363;
        r7 = new java.lang.Object[r8];
        r7[0] = l.C4860.m14172("\"", l.EnumC15204.f46581.m35967(), "\"");
        r3.m11951(r4, "{0} is expected", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0530, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0596, code lost:
    
        if (r12 <= 0) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0598, code lost:
    
        r7.f6339.m11951(r7.f6341.f20363, "\"{0}\" token is expected", l.EnumC15204.f46442.m35967());
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x05ac, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x05ad, code lost:
    
        r7.f6339.m11951(r7.f6341.f20363, "{0} is expected", l.C4860.m14172("\"", l.EnumC15204.f46581.m35967(), "\""));
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x05c5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0931, code lost:
    
        r1.m22778(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x06f6, code lost:
    
        r7.f6339.m11951(r7.f6341.f20363, "{0} is expected", l.C4860.m14172("\"", r0.m35967(), "\""));
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x070e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x07bd, code lost:
    
        if (r12 <= 0) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x07bf, code lost:
    
        r7.f6339.m11951(r7.f6341.f20363, "\"{0}\" token is expected", l.EnumC15204.f46442.m35967());
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x07d5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x07d6, code lost:
    
        r7.f6339.m11951(r7.f6341.f20363, "{0} is expected", l.C4860.m14172("\"", l.EnumC15204.f46581.m35967(), "\""));
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x07f0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x03da, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x03da, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x03df, code lost:
    
        if (r3 == null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x03e1, code lost:
    
        r2.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x03e4, code lost:
    
        r1.m22778(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x00e1, code lost:
    
        r3 = r1.f26854;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x00e3, code lost:
    
        if (r3 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x00e5, code lost:
    
        r3.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x00fb, code lost:
    
        r1.f26854.addAll(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x00e9, code lost:
    
        r3 = new l.C7279(r1.f26855.f37150, l.EnumC4662.f14786);
        r1.f26854 = r3;
        r1.f26859.m16430(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x006b, code lost:
    
        r7.f6339.m11951(r7.f6341.f20363, "The LineNumberTable format is incorrect; \"{0}\" is expected", "line  line_number:  start_pc");
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0078, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:260:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x08b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04e0 A[SYNTHETIC] */
    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m28655() {
        /*
            Method dump skipped, instructions count: 2402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11738.m28655():void");
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m28669() {
        this.f6341.m18126();
        this.f6341.m18132(EnumC15204.f46642);
        int i = 1;
        Object[] objArr = {EnumC15204.f46543};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        C11003.requireNonNull(obj);
        arrayList.add(obj);
        List unmodifiableList = C20195.unmodifiableList(arrayList);
        int i2 = 10;
        ArrayList arrayList2 = new ArrayList(10);
        Throwable th = null;
        C15869 c15869 = null;
        while (true) {
            int i3 = C13148.f39311[this.f6341.f20355.ordinal()];
            if (i3 != i) {
                if (i3 != 32) {
                    if (i3 != 33) {
                        String str = (String) C5378.stream(unmodifiableList).map(new C4563(i2)).collect(C22976.joining(", "));
                        C3917 c3917 = this.f6339;
                        long j = this.f6341.f20363;
                        String str2 = unmodifiableList.size() != i ? "One of {0} tokens is expected" : "\"{0}\" token is expected";
                        Object[] objArr2 = new Object[i];
                        objArr2[0] = str;
                        c3917.m11951(j, str2, objArr2);
                        throw th;
                    }
                    if (unmodifiableList.contains(this.f6341.f20355)) {
                        if (c15869 != null) {
                            this.f35026.m33156(new C9582(c15869, arrayList2));
                        }
                        this.f6341.m18126();
                        return;
                    } else {
                        C3917 c39172 = this.f6339;
                        long j2 = this.f6341.f20363;
                        Object[] objArr3 = new Object[i];
                        objArr3[0] = EnumC15204.f46442.m35967();
                        c39172.m11951(j2, "\"{0}\" token is expected", objArr3);
                        throw th;
                    }
                }
                if (!unmodifiableList.contains(this.f6341.f20355)) {
                    Throwable th2 = th;
                    this.f6339.m11951(this.f6341.f20363, "\"{0}\" token is not expected", EnumC15204.f46450.m35967());
                    throw th2;
                }
                this.f6341.m18126();
                this.f6341.m18132(EnumC15204.f46597);
                C23732 c23732 = this.f35025;
                c23732.m52386();
                ArrayList arrayList3 = new ArrayList(i2);
                Object[] objArr4 = new Object[3];
                objArr4[0] = EnumC15204.f46579;
                objArr4[i] = EnumC15204.f46611;
                objArr4[2] = EnumC15204.f46533;
                ArrayList arrayList4 = new ArrayList(3);
                int i4 = 0;
                while (i4 < 3) {
                    Object obj2 = objArr4[i4];
                    i4 = C8954.m23073(obj2, arrayList4, obj2, i4, i);
                }
                List unmodifiableList2 = C20195.unmodifiableList(arrayList4);
                while (true) {
                    EnumC15204 enumC15204 = this.f6341.f20355;
                    EnumC15204 enumC152042 = EnumC15204.f46579;
                    EnumC15204 enumC152043 = EnumC15204.f46611;
                    if (!enumC15204.m35961(enumC152042, enumC152043, EnumC15204.f46533)) {
                        EnumC15204 enumC152044 = this.f6341.f20355;
                        EnumC15204 enumC152045 = EnumC15204.f46591;
                        if (enumC152044 != enumC152045) {
                            EnumC15204 enumC152046 = EnumC15204.f46479;
                            if (enumC152044 != enumC152046) {
                                if (arrayList3.isEmpty()) {
                                    this.f6339.m11951(this.f6341.f20363, "BootstrapMethod argument is expected", new Object[0]);
                                    throw null;
                                }
                                this.f6339.m11951(this.f6341.f20363, "One of {0} tokens is expected", (String) C5378.stream(unmodifiableList2).map(new C4563(10)).collect(C22976.joining(", ")));
                                throw null;
                            }
                            if (!unmodifiableList2.contains(enumC152044)) {
                                this.f6339.m11951(this.f6341.f20363, "\"{0}\" token is not expected", enumC152046.m35967());
                                throw null;
                            }
                            c23732.m52384();
                            this.f6341.m18126();
                            this.f35026.m33156(new C9582(c15869, arrayList3));
                            arrayList2 = new ArrayList(10);
                            Object[] objArr5 = {EnumC15204.f46543, EnumC15204.f46442};
                            ArrayList arrayList5 = new ArrayList(2);
                            int i5 = 0;
                            while (i5 < 2) {
                                Object obj3 = objArr5[i5];
                                i5 = C8954.m23073(obj3, arrayList5, obj3, i5, 1);
                            }
                            unmodifiableList = C20195.unmodifiableList(arrayList5);
                            i = 1;
                            i2 = 10;
                            th = null;
                            c15869 = null;
                        } else {
                            if (!unmodifiableList2.contains(enumC152044)) {
                                this.f6339.m11951(this.f6341.f20363, "\"{0}\" token is not expected", enumC152045.m35967());
                                throw null;
                            }
                            this.f6341.m18126();
                            Object[] objArr6 = {enumC152042, enumC152043};
                            ArrayList arrayList6 = new ArrayList(2);
                            int i6 = 0;
                            while (i6 < 2) {
                                Object obj4 = objArr6[i6];
                                i6 = C8954.m23073(obj4, arrayList6, obj4, i6, 1);
                            }
                            unmodifiableList2 = C20195.unmodifiableList(arrayList6);
                        }
                    } else {
                        if (!unmodifiableList2.contains(this.f6341.f20355)) {
                            this.f6339.m11951(this.f6341.f20363, "BootstrapMethod argument is not expected", new Object[0]);
                            throw null;
                        }
                        arrayList3.add(c23732.m52383(null, null, false));
                        Object[] objArr7 = {EnumC15204.f46591, EnumC15204.f46479};
                        ArrayList arrayList7 = new ArrayList(2);
                        int i7 = 0;
                        while (i7 < 2) {
                            Object obj5 = objArr7[i7];
                            i7 = C8954.m23073(obj5, arrayList7, obj5, i7, 1);
                        }
                        unmodifiableList2 = C20195.unmodifiableList(arrayList7);
                    }
                }
            } else {
                if (!unmodifiableList.contains(this.f6341.f20355)) {
                    this.f6339.m11951(this.f6341.f20363, "\"{0}\" token is expected", EnumC15204.f46543.m35967());
                    throw null;
                }
                if (c15869 != null) {
                    this.f35026.m33156(new C9582(c15869, arrayList2));
                }
                C6615 c6615 = this.f6341;
                EnumC15204 enumC152047 = EnumC15204.f46543;
                c6615.m18132(enumC152047);
                C6615 c66152 = this.f6341;
                int i8 = c66152.f20360;
                c66152.m18132(EnumC15204.f46597);
                c15869 = m28643();
                C6615 c66153 = this.f6341;
                if (c66153.f20355 == EnumC15204.f46579) {
                    c66153.m18126();
                    this.f6341.m18132(EnumC15204.f46479);
                }
                Object[] objArr8 = {EnumC15204.f46450, enumC152047, EnumC15204.f46442};
                ArrayList arrayList8 = new ArrayList(3);
                int i9 = 0;
                while (i9 < 3) {
                    Object obj6 = objArr8[i9];
                    i9 = C8954.m23073(obj6, arrayList8, obj6, i9, 1);
                }
                unmodifiableList = C20195.unmodifiableList(arrayList8);
                i = 1;
                th = null;
            }
        }
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m28661() {
        ArrayList arrayList = new ArrayList(256);
        C15869 m28643 = m28643();
        C6615 c6615 = this.f6341;
        EnumC15204 enumC15204 = c6615.f20355;
        EnumC15204 enumC152042 = EnumC15204.f46642;
        if (enumC15204 != enumC152042) {
            c6615.m18126();
        }
        C6615 c66152 = this.f6341;
        EnumC15204 enumC152043 = c66152.f20355;
        EnumC15204 enumC152044 = EnumC15204.f46479;
        C23732 c23732 = this.f35025;
        if (enumC152043 == enumC152044) {
            c66152.m18126();
            C6615 c66153 = this.f6341;
            if (c66153.f20355 == enumC152042) {
                c66153.m18126();
                c23732.m52386();
                if (this.f6341.f20355 == EnumC15204.f46442) {
                    this.f35026.m33156(new C9582(m28643, Collections.EMPTY_LIST));
                    this.f6341.m18126();
                    return;
                }
                while (true) {
                    arrayList.add(c23732.m52383(null, null, false));
                    EnumC15204 enumC152045 = this.f6341.f20355;
                    EnumC15204 enumC152046 = EnumC15204.f46591;
                    EnumC15204 enumC152047 = EnumC15204.f46479;
                    if (enumC152045.m35961(enumC152046, enumC152047)) {
                        this.f6341.m18126();
                        if (this.f6341.f20355 == EnumC15204.f46442) {
                            c23732.m52384();
                            this.f6341.m18126();
                            break;
                        }
                    } else {
                        C6615 c66154 = this.f6341;
                        EnumC15204 enumC152048 = c66154.f20355;
                        EnumC15204 enumC152049 = EnumC15204.f46442;
                        if (enumC152048 != enumC152049) {
                            this.f6339.m11951(c66154.f20363, "One of {0} tokens is expected", enumC152046.m35962() + ", " + enumC152047.m35962() + ", or " + enumC152049.m35962());
                            throw null;
                        }
                        c23732.m52384();
                        this.f6341.m18126();
                    }
                }
            }
            this.f35026.m33156(new C9582(m28643, arrayList));
        }
        C6615 c66155 = this.f6341;
        EnumC15204 enumC1520410 = c66155.f20355;
        if (enumC1520410 == EnumC15204.f46642) {
            c66155.m18126();
            c23732.m52386();
            if (this.f6341.f20355 == EnumC15204.f46442) {
                this.f35026.m33156(new C9582(m28643, Collections.EMPTY_LIST));
                this.f6341.m18126();
                return;
            }
            while (true) {
                arrayList.add(c23732.m52383(null, null, false));
                EnumC15204 enumC1520411 = this.f6341.f20355;
                EnumC15204 enumC1520412 = EnumC15204.f46591;
                EnumC15204 enumC1520413 = EnumC15204.f46479;
                if (enumC1520411.m35961(enumC1520412, enumC1520413)) {
                    this.f6341.m18126();
                    if (this.f6341.f20355 == EnumC15204.f46442) {
                        c23732.m52384();
                        this.f6341.m18126();
                        break;
                    }
                } else {
                    C6615 c66156 = this.f6341;
                    EnumC15204 enumC1520414 = c66156.f20355;
                    EnumC15204 enumC1520415 = EnumC15204.f46442;
                    if (enumC1520414 != enumC1520415) {
                        this.f6339.m11951(c66156.f20363, "One of {0} tokens is expected", enumC1520412.m35962() + ", " + enumC1520413.m35962() + ", or " + enumC1520415.m35962());
                        throw null;
                    }
                    c23732.m52384();
                    this.f6341.m18126();
                }
            }
            this.f35026.m33156(new C9582(m28643, arrayList));
            return;
        }
        if (enumC1520410 != EnumC15204.f46579) {
            return;
        }
        arrayList.add(this.f35012.m9311(c66155.f20360));
        this.f6341.m18126();
        while (true) {
            C6615 c66157 = this.f6341;
            EnumC15204 enumC1520416 = c66157.f20355;
            if (enumC1520416 == EnumC15204.f46479) {
                this.f35026.m33156(new C9582(m28643, arrayList));
                return;
            } else {
                if (enumC1520416 != EnumC15204.f46579) {
                    this.f6339.m11951(c66157.f20363, "invalid.bootstrapmethod", new Object[0]);
                    throw null;
                }
                arrayList.add(this.f35012.m9311(c66157.f20360));
                this.f6341.m18126();
            }
        }
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    private C15869 m28643() {
        C15869 m28681;
        C6615 c6615 = this.f6341;
        EnumC15204 enumC15204 = c6615.f20355;
        EnumC15204 enumC152042 = EnumC15204.f46579;
        if (enumC15204 == enumC152042) {
            return this.f35012.m9311(c6615.f20360);
        }
        EnumC16575 m28695 = this.f6340.m28695();
        this.f6341.m18132(EnumC15204.f46597);
        C6615 c66152 = this.f6341;
        if (c66152.f20355 == enumC152042) {
            m28681 = this.f35012.m9311(c66152.f20360);
            this.f6341.m18126();
        } else {
            m28681 = this.f6340.m28681(m28695);
        }
        this.f6341.m18132(EnumC15204.f46479);
        return m28681;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28652(Consumer consumer) {
        C6615 c6615 = this.f6341;
        if (c6615.f20355 == EnumC15204.f46597) {
            c6615.m18126();
        }
        consumer.n(this.f35025.m52383(EnumC10932.f32947, null, true));
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m28677() {
        C3046 c3046 = this.f35012;
        EnumC4662 enumC4662 = EnumC4662.f14819;
        c3046.m9312(enumC4662.m13646());
        final String m45776 = this.f6339.m45776();
        C15869 m9313 = this.f35012.m9313(new Function() { // from class: l.ۘܰۚ
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Boolean bool;
                String str = (String) obj;
                boolean z = false;
                if (str.contains(m45776)) {
                    Object[] objArr = {".java", ".jcod", ".jasm", ".class"};
                    ArrayList arrayList = new ArrayList(4);
                    int i = 0;
                    while (i < 4) {
                        Object obj2 = objArr[i];
                        i = C8954.m23073(obj2, arrayList, obj2, i, 1);
                    }
                    Iterator it = C20195.unmodifiableList(arrayList).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            bool = Boolean.FALSE;
                            break;
                        }
                        if (str.contains((String) it.next())) {
                            bool = Boolean.TRUE;
                            break;
                        }
                    }
                    if (bool.booleanValue()) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
        String str = m9313 != null ? (String) m9313.f49042.f7866 : null;
        C15869 m28690 = m28690();
        if (m28690.f49042 == null && m28690.f20943 != -1) {
            throw C19462.m44860(this.f6339, this.f6341.f20364, "SourceFile attribute incorrectly points to the ConstantPool", new Object[0]);
        }
        m28690.toString();
        if (str != null && !str.equals(m28690.f49042.f7866)) {
            this.f6339.mo11949(this.f6341.f20364, "The \"{0}\" attribute is already declared in the constant pool structure. A new value \"{1}\" is used.", enumC4662.m13646(), m28690.f49042.f7866);
        }
        C13813 c13813 = this.f35026;
        c13813.f41211 = new C19460(c13813.f37150, enumC4662, m28690);
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m28676() {
        C13813 c13813 = this.f35026;
        C9438 c9438 = new C9438(c13813.f37150, EnumC4662.f14810);
        c9438.f28618 = new StringBuilder();
        c9438.f28620 = new ArrayList();
        c9438.f28619 = EnumC20727.NONE;
        c13813.f41201 = c9438;
        this.f6341.m18132(EnumC15204.f46642);
        boolean z = true;
        boolean z2 = true;
        while (true) {
            int i = C13148.f39311[this.f6341.f20355.ordinal()];
            try {
                if (i != 1) {
                    if (i != 30) {
                        switch (i) {
                            case 33:
                                if (!z2) {
                                    throw C19462.m44860(this.f6339, this.f6341.f20363, "\"{0}\" token is expected", new Object[]{EnumC15204.f46479.m35967()});
                                }
                                int ordinal = c9438.f28619.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal != 1) {
                                        if (ordinal != 2) {
                                            throw new IncompatibleClassChangeError();
                                        }
                                        z = c9438.f28620.isEmpty();
                                    } else if (c9438.f28618.length() != 0) {
                                        z = false;
                                    }
                                }
                                if (z) {
                                    this.f6339.mo11949(this.f6341.f20363, "The SourceDebugExtension attribute has the empty debug_extension structure.", new Object[0]);
                                }
                                this.f6341.m18126();
                                return;
                            case 34:
                            case 35:
                                break;
                            case 36:
                                if (!z2) {
                                    throw C19462.m44860(this.f6339, this.f6341.f20363, "\"{0}\" token is expected", new Object[]{EnumC15204.f46479.m35967()});
                                }
                                try {
                                    String str = this.f6341.f20350;
                                    if (c9438.f28619 == EnumC20727.BYTE) {
                                        throw new IllegalArgumentException("The valid modified UTF-8 string is expected.");
                                    }
                                    c9438.f28618.append(str);
                                    c9438.f28619 = EnumC20727.UTF8;
                                    break;
                                } catch (IllegalArgumentException unused) {
                                    throw C19462.m44860(this.f6339, this.f6341.f20363, "\"{0}\" token is expected", new Object[]{EnumC15204.f46488.m35967()});
                                }
                            default:
                                if (z2) {
                                    this.f6339.mo9065(this.f6341.f20363, "Either \"{0}\" or \"{1}\" token is expected", EnumC15204.f46647.m35967(), EnumC15204.f46442.m35967());
                                } else {
                                    this.f6339.mo9065(this.f6341.f20363, "\"{0}\" token is expected", EnumC15204.f46479.m35967());
                                }
                                throw new C12136();
                        }
                        z2 = false;
                        this.f6341.m18126();
                    } else {
                        if (z2) {
                            throw C19462.m44860(this.f6339, this.f6341.f20363, "\"{0}\" token is expected", new Object[]{(c9438.f28619 == EnumC20727.BYTE ? EnumC15204.f46488 : EnumC15204.f46647).m35967()});
                        }
                        z2 = true;
                        this.f6341.m18126();
                    }
                }
                int i2 = this.f6341.f20360;
                if (c9438.f28619 == EnumC20727.UTF8) {
                    throw new IllegalArgumentException("The byte representation of the string is expected.");
                }
                c9438.f28620.add(Byte.valueOf((byte) i2));
                c9438.f28619 = EnumC20727.BYTE;
                z2 = false;
                this.f6341.m18126();
            } catch (IllegalArgumentException unused2) {
                throw C19462.m44860(this.f6339, this.f6341.f20363, "\"{0}\" token is expected", new Object[]{EnumC15204.f46647.m35967()});
            }
        }
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m28644() {
        C15869 m28682 = m28682(true);
        if (!m28682.m37607().m27255(EnumC10932.f32926, EnumC10932.f32947)) {
            m28650("Either a class name or Constant Pool index expected, got {0}");
            throw null;
        }
        this.f35026.m33161(m28682);
        m28682.toString();
        this.f6341.m18132(EnumC15204.f46479);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m28666(Consumer consumer) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            C15869 m28682 = m28682(true);
            if (!m28682.m37607().m27255(EnumC10932.f32926, EnumC10932.f32947)) {
                m28650("Either a class name or Constant Pool index expected, got {0}");
                throw null;
            }
            arrayList.add(m28682);
            m28682.toString();
            C6615 c6615 = this.f6341;
            if (c6615.f20355 != EnumC15204.f46591) {
                c6615.m18132(EnumC15204.f46479);
                consumer.n(arrayList);
                return;
            }
            c6615.m18126();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28653(C4682 c4682) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            C15869 m28690 = m28690();
            if (!m28690.m37607().m27254(EnumC10932.f32926)) {
                m28650("Either a field descriptor or Constant Pool index expected, got {0}");
                throw null;
            }
            arrayList.add(m28690);
            m28690.toString();
            C6615 c6615 = this.f6341;
            if (c6615.f20355 != EnumC15204.f46591) {
                c6615.m18132(EnumC15204.f46479);
                c4682.n(arrayList);
                return;
            }
            c6615.m18126();
        }
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m28673() {
        C15869 m9314;
        EnumC10932 enumC10932 = EnumC10932.f32947;
        C23732 c23732 = this.f35025;
        C15869 m52383 = c23732.m52383(enumC10932, null, true);
        C6615 c6615 = this.f6341;
        if (c6615.f20355 == EnumC15204.f46479) {
            this.f35026.m33157(m52383, (C15869) null);
            return;
        }
        c6615.m18132(EnumC15204.f46597);
        if (this.f6341.f20355.m35961(EnumC15204.f46579, EnumC15204.f46543)) {
            int i = this.f6341.f20360;
            m9314 = i != 0 ? this.f35012.m9311(i) : null;
            this.f6341.m18126();
        } else {
            m9314 = this.f35012.m9314(c23732.m52381(EnumC10932.f32943));
        }
        this.f35026.m33157(m52383, m9314);
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m28660() {
        C15869 m28690;
        this.f6341.m18132(EnumC15204.f46642);
        C1676 m33148 = this.f35026.m33148(this.f6341.f20363);
        while (true) {
            EnumC15204 enumC15204 = this.f6341.f20355;
            if (enumC15204 == EnumC15204.f46442) {
                if (m33148.isEmpty()) {
                    this.f6339.mo11949(this.f6341.f20363, "Record should have at least one component", new Object[0]);
                    this.f35026.m33165();
                }
                this.f6341.m18126();
                return;
            }
            ArrayList m51696 = enumC15204 == EnumC15204.f46559 ? this.f35022.m51696() : null;
            this.f6341.m18132(EnumC15204.f46646);
            C15869 m286902 = m28690();
            this.f6341.m18132(EnumC15204.f46597);
            C15869 m286903 = m28690();
            int i = C13148.f39311[this.f6341.f20355.ordinal()];
            if (i == 30 || i == 31) {
                this.f6341.m18126();
                C6615 c6615 = this.f6341;
                if (c6615.f20355 == EnumC15204.f46530) {
                    c6615.m18126();
                    m28690 = m28690();
                } else {
                    m33148.m5677(m286902, m286903, null, m51696);
                }
            } else if (i != 37) {
                m28690 = null;
            } else {
                this.f6341.m18126();
                C6615 c66152 = this.f6341;
                if (c66152.f20355 == EnumC15204.f46530) {
                    c66152.m18126();
                }
                m28690 = m28690();
            }
            m33148.m5677(m286902, m286903, m28690, m51696);
            EnumC15204 enumC152042 = this.f6341.f20355;
            EnumC15204 enumC152043 = EnumC15204.f46591;
            EnumC15204 enumC152044 = EnumC15204.f46479;
            if (!enumC152042.m35961(enumC152043, enumC152044)) {
                this.f6339.m11951(this.f6341.f20363, "Either \"{0}\" or \"{1}\" token is expected", "<" + enumC152044.m35962() + ">", "<" + enumC152043.m35962() + ">");
                throw null;
            }
            this.f6341.m18126();
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m28671(int i) {
        if (i != 0) {
            this.f6339.mo11949(this.f6341.f20363, "Modifier(s) are ignored as they cannot be applied to a group of inner classes", new Object[0]);
        }
        this.f6341.m18132(EnumC15204.f46642);
        while (true) {
            C6615 c6615 = this.f6341;
            if (c6615.f20355 == EnumC15204.f46442) {
                if (this.f35026.f41204 == null) {
                    this.f6339.mo11949(c6615.f20363, "InnerClasses group should have at least one inner class", new Object[0]);
                }
                this.f6341.m18126();
                return;
            }
            m28672(0);
            EnumC15204 enumC15204 = this.f6341.f20355;
            EnumC15204 enumC152042 = EnumC15204.f46591;
            EnumC15204 enumC152043 = EnumC15204.f46479;
            if (!enumC15204.m35961(enumC152042, enumC152043)) {
                this.f6339.m11951(this.f6341.f20363, "Either \"{0}\" or \"{1}\" token is expected", "<" + enumC152043.m35962() + ">", "<" + enumC152042.m35962() + ">");
                throw null;
            }
            this.f6341.m18126();
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m28672(int i) {
        C13813 c13813 = this.f35026;
        long j = this.f6341.f20363;
        C3917 c3917 = (C3917) c13813.m30112();
        int m16950 = EnumC6073.m16950(i, EnumC6073.f18592, EnumC6073.f18612);
        EnumC6073[] enumC6073Arr = EnumC6073.f18620;
        if (((~EnumC6073.m16931(enumC6073Arr)) & m16950) != 0) {
            c3917.mo11949(j, "Invalid modifier(s) for an inner class {0}", EnumC6073.m16951(m16950 & (~EnumC6073.m16931(enumC6073Arr)), EnumC20185.INNER_CLASS));
        }
        int m28686 = m28686();
        if (i != 0 && m28686 != 0) {
            C3917 c39172 = this.f6339;
            long j2 = this.f6341.f20363;
            String m16932 = EnumC6073.m16932(i | m28686, EnumC20185.INNER_CLASS);
            int length = m16932.length();
            int i2 = 0;
            while (i2 < length) {
                int codePointAt = m16932.codePointAt(i2);
                if (!Character.isWhitespace(codePointAt)) {
                    break;
                } else {
                    i2 += Character.charCount(codePointAt);
                }
            }
            while (length > i2) {
                int codePointBefore = Character.codePointBefore(m16932, length);
                if (!Character.isWhitespace(codePointBefore)) {
                    break;
                } else {
                    length -= Character.charCount(codePointBefore);
                }
            }
            c39172.mo11949(j2, "Combined \"{0}\" modifiers apply to the InnerClass", m16932.substring(i2, length));
        }
        int i3 = i | m28686;
        EnumC15204 enumC15204 = this.f6341.f20355;
        if (enumC15204 == EnumC15204.f46533) {
            m28665(i3, this.f35012.m9311(0));
            return;
        }
        if (enumC15204 == EnumC15204.f46611 && enumC15204.m35966()) {
            m28647(i3, m28690());
            return;
        }
        C6615 c6615 = this.f6341;
        EnumC15204 enumC152042 = c6615.f20355;
        if (enumC152042 == EnumC15204.f46579) {
            C15869 m9311 = this.f35012.m9311(c6615.f20360);
            if (!(m9311.f49042 instanceof C22096)) {
                m28665(i3, this.f35012.m9311(0));
                return;
            } else {
                this.f6341.m18126();
                m28647(i3, m9311);
                return;
            }
        }
        if (!enumC152042.m35966()) {
            m28658();
            throw null;
        }
        C15869 m9312 = this.f35012.m9312(this.f6341.f20355.m35967());
        this.f6341.m18126();
        m28647(i3, m9312);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28647(int i, C15869 c15869) {
        C6615 c6615 = this.f6341;
        if (c6615.f20355 == EnumC15204.f46608) {
            c6615.m18126();
            m28665(i, c15869);
        } else {
            m28658();
            throw null;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m28665(int i, C15869 c15869) {
        C15869 c158692;
        EnumC15204 enumC15204 = this.f6341.f20355;
        EnumC15204 enumC152042 = EnumC15204.f46579;
        if (enumC15204 == enumC152042 || enumC15204 == EnumC15204.f46533) {
            C23732 c23732 = this.f35025;
            C15869 m52383 = enumC15204 == enumC152042 ? c23732.m52383(EnumC10932.f32947, null, false) : null;
            C6615 c6615 = this.f6341;
            EnumC15204 enumC152043 = c6615.f20355;
            EnumC15204 enumC152044 = EnumC15204.f46533;
            if (enumC152043 == enumC152044) {
                c6615.m18126();
                m52383 = c23732.m52383(EnumC10932.f32947, null, true);
            }
            C6615 c66152 = this.f6341;
            EnumC15204 enumC152045 = c66152.f20355;
            EnumC15204 enumC152046 = EnumC15204.f46479;
            if (enumC152045 == enumC152046) {
                C15869 m9311 = this.f35012.m9311(0);
                m28648(i, c15869, m52383, m9311);
                this.f35026.m33151(i, c15869, m52383, m9311);
                return;
            }
            if (enumC152045 != EnumC15204.f46565) {
                m28658();
                throw null;
            }
            c66152.m18126();
            C6615 c66153 = this.f6341;
            EnumC15204 enumC152047 = c66153.f20355;
            if (enumC152047 == enumC152044 || enumC152047 == enumC152042) {
                if (enumC152047 == enumC152044) {
                    c66153.m18126();
                    c158692 = c23732.m52383(EnumC10932.f32947, null, true);
                } else {
                    c158692 = null;
                }
                if (this.f6341.f20355 == enumC152042) {
                    c158692 = c23732.m52383(EnumC10932.f32947, null, false);
                }
                if (this.f6341.f20355 == enumC152046) {
                    m28648(i, c15869, m52383, c158692);
                    this.f35026.m33151(i, c15869, m52383, c158692);
                    return;
                } else {
                    m28658();
                    throw null;
                }
            }
            m28658();
            throw null;
        }
        m28658();
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28648(int i, C15869 c15869, C15869 c158692, C15869 c158693) {
        AbstractC2465 abstractC2465;
        this.f6339.m45775("[" + EnumC6073.m16951(i, EnumC20185.INNER_CLASS) + "], ", new Object[0]);
        if (c15869 != this.f35012.m9311(0) && (abstractC2465 = c15869.f49042) != null) {
            this.f6339.m45775(abstractC2465 + " =\n\t\t", new Object[0]);
        }
        C15869 c158694 = (C15869) ((C17157) c158692.f49042).f7866;
        AbstractC2465 abstractC24652 = c158694.f49042;
        if (abstractC24652 == null) {
            this.f6339.m45775("<#cpx-unresolved> ", new Object[0]);
        } else if (abstractC24652.f7866 == null) {
            this.f6339.m45775("<#cpx-0> ", new Object[0]);
        } else {
            this.f6339.m45775(c158694.f49042.f7866 + " ", new Object[0]);
        }
        if (c158693 != this.f35012.m9311(0) && c158693.f20943 != 0) {
            AbstractC2465 abstractC24653 = ((C15869) ((C17157) c158693.f49042).f7866).f49042;
            if (abstractC24653 == null) {
                this.f6339.m45775("\n\t\tof <#cpx-unresolved>  ", new Object[0]);
            } else {
                C22096 c22096 = (C22096) abstractC24653;
                if (c22096.f7866 == null) {
                    this.f6339.m45775("\n\t\tof <#cpx-0>  ", new Object[0]);
                } else {
                    this.f6339.m45775("\n\t\tof " + ((String) c22096.f7866), new Object[0]);
                }
            }
        }
        this.f6339.m45775("\n", new Object[0]);
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m28658() {
        throw C19462.m44860(this.f6339, this.f6341.f20363, "Invalid declaration of Inner Class", new Object[0]);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28654(EnumC15204 enumC15204, EnumC15204 enumC152042) {
        int i = 1;
        while (true) {
            this.f6341.m18126();
            C6615 c6615 = this.f6341;
            EnumC15204 enumC152043 = c6615.f20355;
            if (enumC152043 == enumC15204) {
                i++;
            } else if (enumC152043 == enumC152042) {
                i--;
                if (i == 0) {
                    return;
                }
            } else if (enumC152043 == EnumC15204.f46554) {
                this.f6339.mo9065(c6615.f20363, "Unbalanced parentheses", new Object[0]);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x05a4, code lost:
    
        m28662();
        java.lang.String.format("scanner position %d", java.lang.Long.valueOf(r17.f6341.f20363));
        r0 = new l.C12136();
        r0.m29561();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x05c1, code lost:
    
        throw r0;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m28664(int r18) {
        /*
            Method dump skipped, instructions count: 1614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11738.m28664(int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C1426 m28659() {
        C1426 c1426 = new C1426();
        C6615 c6615 = this.f6341;
        EnumC15204 enumC15204 = c6615.f20355;
        if (enumC15204 != EnumC15204.f46611) {
            if (enumC15204 != EnumC15204.f46579) {
                throw C20094.m46318(this.f6339, c6615.f20363, "Either a module name or Constant Pool index expected, got {0}", new Object[]{C21639.m48906(this.f6341.f20355, new StringBuilder("\""), "\"")});
            }
            c1426.f20042 = Integer.valueOf(c6615.f20360);
            this.f6341.m18126();
            return c1426;
        }
        String str = "";
        while (this.f6341.f20355.m35968()) {
            c1426.f20043 = ((String) c1426.f20043) + str + this.f6341.f20357;
            this.f6341.m18131();
            EnumC15204 enumC152042 = this.f6341.f20355;
            if (enumC152042 != EnumC15204.f46599) {
                return c1426;
            }
            str = Character.toString((char) enumC152042.m35965());
            this.f6341.m18131();
        }
        throw C20094.m46318(this.f6339, this.f6341.f20363, "Either a module name or Constant Pool index expected, got {0}", new Object[]{C21639.m48906(this.f6341.f20355, new StringBuilder("\""), "\"")});
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fe, code lost:
    
        throw l.C20094.m46318(r14.f6339, r14.f6341.f20363, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x021e, code lost:
    
        throw l.C20094.m46318(r14.f6339, r14.f6341.f20363, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0245, code lost:
    
        throw l.C20094.m46318(r14.f6339, r14.f6341.f20363, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x029c, code lost:
    
        r15.m18132(l.EnumC15204.f46442);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02a3, code lost:
    
        if (r14.f35020 == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02a5, code lost:
    
        r14.f35012.m9333();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02ae, code lost:
    
        if (r14.f35026.f41211 != null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02b0, code lost:
    
        r15 = r14.f6339.m45777();
        r0 = r14.f35026;
        r2 = new l.C8732(r0.f37150, r15);
        r2.m22573(r14.f35026.f37150, new l.C8916(0));
        r0.f41211 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02e9, code lost:
    
        r14.f35026.m33155(r14.f35023);
        r14.f35016.add(r14.f35026);
        r14.f35026 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02f9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02ce, code lost:
    
        r15 = r14.f35026;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02d2, code lost:
    
        if (r15.f41211 != null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02d4, code lost:
    
        r1 = r14.f35012;
        r15.f41211 = new l.C19460(r1, l.EnumC4662.f14819, r1.m9312(r14.f6339.m45777()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d1, code lost:
    
        throw l.C20094.m46318(r14.f6339, r14.f6341.f20363, "Module statement \"requires [transitive | static | mandated | synthetic] ModuleName;\" expected", new java.lang.Object[0]);
     */
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m28678(int r15) {
        /*
            Method dump skipped, instructions count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11738.m28678(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b1, code lost:
    
        throw l.C20094.m46318(r6.f6339, r6.f6341.f20363, r12, new java.lang.Object[0]);
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m28651(java.util.function.BiConsumer r7, l.InterfaceC6093 r8, l.InterfaceC6093 r9, l.EnumC15204 r10, boolean r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11738.m28651(java.util.function.BiConsumer, l.ۛܰۚ, l.ۛܰۚ, l.ܶۨۚ, boolean, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x003e, code lost:
    
        throw l.C20094.m46318(r5.f6339, r5.f6341.f20363, r8, new java.lang.Object[0]);
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.HashSet m28645(l.InterfaceC10327 r6, l.InterfaceC6093 r7, java.lang.String r8, boolean r9) {
        /*
            r5 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.call()
            r6 = 0
            r1 = 0
            r2 = 1
        Lb:
            l.ۜ۟ۚ r3 = r5.f6341
            l.ܶۨۚ r3 = r3.f20355
            l.ܶۨۚ r4 = l.EnumC15204.f46479
            if (r3 == r4) goto L68
            int[] r4 = l.C13148.f39311
            int r3 = r3.ordinal()
            r3 = r4[r3]
            r4 = 3
            if (r3 == r4) goto L4c
            r4 = 4
            if (r3 == r4) goto L4c
            r4 = 31
            if (r3 != r4) goto L3f
            if (r1 != 0) goto L32
            if (r2 != 0) goto L32
            if (r9 != 0) goto L32
            l.ۜ۟ۚ r1 = r5.f6341
            r1.m18126()
            r1 = 1
            goto Lb
        L32:
            l.ۘۨۚ r7 = r5.f6339
            l.ۜ۟ۚ r9 = r5.f6341
            long r0 = r9.f20363
            java.lang.Object[] r6 = new java.lang.Object[r6]
            l.۫ۗۚ r6 = l.C20094.m46318(r7, r0, r8, r6)
            throw r6
        L3f:
            l.ۘۨۚ r7 = r5.f6339
            l.ۜ۟ۚ r9 = r5.f6341
            long r0 = r9.f20363
            java.lang.Object[] r6 = new java.lang.Object[r6]
            l.۫ۗۚ r6 = l.C20094.m46318(r7, r0, r8, r6)
            throw r6
        L4c:
            if (r2 != 0) goto L5e
            if (r1 == 0) goto L51
            goto L5e
        L51:
            l.ۘۨۚ r7 = r5.f6339
            l.ۜ۟ۚ r9 = r5.f6341
            long r0 = r9.f20363
            java.lang.Object[] r6 = new java.lang.Object[r6]
            l.۫ۗۚ r6 = l.C20094.m46318(r7, r0, r8, r6)
            throw r6
        L5e:
            l.֨᩺ۚ r1 = r7.get()
            r0.add(r1)
            r1 = 0
            r2 = 0
            goto Lb
        L68:
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto L71
            if (r1 != 0) goto L71
            return r0
        L71:
            l.ۘۨۚ r7 = r5.f6339
            l.ۜ۟ۚ r9 = r5.f6341
            long r0 = r9.f20363
            java.lang.Object[] r6 = new java.lang.Object[r6]
            l.۫ۗۚ r6 = l.C20094.m46318(r7, r0, r8, r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11738.m28645(l.ۤܰۚ, l.ۛܰۚ, java.lang.String, boolean):java.util.HashSet");
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m28656() {
        while (true) {
            this.f6339.m45762(new Supplier() { // from class: l.۠ܰۚ
                @Override // java.util.function.Supplier
                public final Object get() {
                    return "recoverFile: scanner.token=" + C11738.this.f6341.f20355;
                }
            });
            int i = C13148.f39311[this.f6341.f20355.ordinal()];
            if (i != 2 && i != 19) {
                switch (i) {
                    case 38:
                        return;
                    case 39:
                        m28654(EnumC15204.f46642, EnumC15204.f46442);
                        this.f6341.m18126();
                        break;
                    case 40:
                        m28654(EnumC15204.f46524, EnumC15204.f46630);
                        this.f6341.m18126();
                        break;
                    case 41:
                        m28654(EnumC15204.f46583, EnumC15204.f46618);
                        this.f6341.m18126();
                        break;
                    default:
                        this.f6341.m18126();
                        break;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m28662() {
        if (this.f35020) {
            this.f35012.m9333();
            this.f35026.m33164();
            if (this.f35026.f41211 == null) {
                String m45777 = this.f6339.m45777();
                final String m45776 = this.f6339.m45776();
                C13813 c13813 = this.f35026;
                C8732 c8732 = new C8732(c13813.f37150, m45777);
                c8732.m22573(this.f35026.f37150, new Function() { // from class: l.ۗܰۚ
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public /* synthetic */ Function mo22274andThen(Function function) {
                        return C20696.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public /* synthetic */ Function compose(Function function) {
                        return C20696.$default$compose(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        Boolean bool;
                        String str = (String) obj;
                        boolean z = false;
                        if (str.contains(m45776)) {
                            Object[] objArr = {".java", ".jcod", ".jasm", ".class"};
                            ArrayList arrayList = new ArrayList(4);
                            int i = 0;
                            while (i < 4) {
                                Object obj2 = objArr[i];
                                i = C8954.m23073(obj2, arrayList, obj2, i, 1);
                            }
                            Iterator it = C20195.unmodifiableList(arrayList).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    bool = Boolean.FALSE;
                                    break;
                                }
                                if (str.contains((String) it.next())) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                            }
                            if (bool.booleanValue()) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                });
                c13813.f41211 = c8732;
            }
        } else {
            C13813 c138132 = this.f35026;
            if (c138132.f41211 == null) {
                C3046 c3046 = this.f35012;
                c138132.f41211 = new C19460(c3046, EnumC4662.f14819, c3046.m9312(this.f6339.m45777()));
            }
        }
        this.f35026.m33162();
        this.f35016.add(this.f35026);
        C13813 c138133 = new C13813(this.f6339, C22301.m50033(this.f35017));
        this.f35026 = c138133;
        this.f35012 = c138133.f37150;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13813[] m28685() {
        return (C13813[]) this.f35016.toArray(new C13813[0]);
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m28674() {
        EnumC15204 enumC15204;
        ArrayList arrayList;
        if (this.f6341.f20355.m35961(EnumC15204.f46621, EnumC15204.f46559, EnumC15204.f46600)) {
            boolean z = true;
            while (true) {
                try {
                    EnumC15204 enumC152042 = this.f6341.f20355;
                    if (enumC152042 == EnumC15204.f46554 || !z) {
                        break;
                    }
                    int i = C13148.f39311[enumC152042.ordinal()];
                    if (i == 30) {
                        this.f6341.m18126();
                    } else if (i != 67) {
                        if (i == 43) {
                            this.f6341.m18126();
                            C6615 c6615 = this.f6341;
                            long j = c6615.f20363;
                            String str = c6615.f20357;
                            c6615.m18132(EnumC15204.f46611);
                            EnumC15204 enumC152043 = this.f6341.f20355;
                            EnumC15204 enumC152044 = EnumC15204.f46479;
                            if (enumC152043 != enumC152044) {
                                m28675();
                                this.f6341.m18132(enumC152044);
                            }
                            if (this.f35011 == null) {
                                this.f35011 = str;
                                this.f35015 = str + "/";
                            } else {
                                this.f6339.mo9065(j, "Package statement repeated", new Object[0]);
                            }
                        } else if (i == 44) {
                            this.f6341.m18126();
                            m28657();
                            this.f35020 = true;
                        }
                        z = false;
                    } else {
                        this.f35024 = this.f35022.m51696();
                    }
                } catch (C12136 unused) {
                    m28656();
                }
            }
            while (true) {
                C6615 c66152 = this.f6341;
                enumC15204 = c66152.f20355;
                if (enumC15204 != EnumC15204.f46479) {
                    break;
                } else {
                    c66152.m18126();
                }
            }
            if (enumC15204 != EnumC15204.f46554) {
                if (this.f35011 != null || (arrayList = this.f35024) == null) {
                    return;
                }
                this.f35019 = arrayList;
                this.f35024 = null;
                return;
            }
            this.f6339.m45778("Scanner:  EOF", new Object[0]);
            if (this.f6339.m45777().contains("package-info")) {
                this.f6339.m45762(new Supplier() { // from class: l.֨ܰۚ
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return C11738.m28663(C11738.this);
                    }
                });
                int m16978 = EnumC6073.f18619.m16978() | EnumC6073.f18617.m16978();
                if (this.f35026.f41195.m50045() > 49) {
                    m16978 |= EnumC6073.f18612.m16978();
                }
                C13813 c13813 = this.f35026;
                String m23341 = C9045.m23341(new StringBuilder(), this.f35015, "package-info");
                c13813.f37140 = m16978;
                c13813.f41194 = m23341;
                c13813.f41195.m50039();
                ArrayList arrayList2 = this.f35024;
                if (arrayList2 != null) {
                    this.f35026.m30109(arrayList2);
                }
                if (this.f35020) {
                    this.f35012.m9333();
                    if (this.f35026.f41211 == null) {
                        String m45777 = this.f6339.m45777();
                        C13813 c138132 = this.f35026;
                        C8732 c8732 = new C8732(c138132.f37150, m45777);
                        c8732.m22573(this.f35026.f37150, new C3053(5));
                        c138132.f41211 = c8732;
                    }
                } else {
                    C13813 c138133 = this.f35026;
                    if (c138133.f41211 == null) {
                        C3046 c3046 = this.f35012;
                        c138133.f41211 = new C19460(c3046, EnumC4662.f14819, c3046.m9312(this.f6339.m45777()));
                    }
                }
                C13813 c138134 = this.f35026;
                C22986 c22986 = c138134.f41206;
                C3046 c30462 = c138134.f37150;
                String str2 = c138134.f41194;
                c30462.getClass();
                EnumC10932 enumC10932 = EnumC10932.f32947;
                c22986.m51137(c30462.m9314((AbstractC2465) new C17157(enumC10932, c30462.m9312(str2))));
                C6491 c6491 = c22986.f74008;
                C6491 c64912 = c22986.f74006;
                C15869 m9314 = c30462.m9314((AbstractC2465) new C17157(enumC10932, c30462.m9312("java/lang/Object")));
                if (c64912.f20043 != null) {
                    c64912.f20043 = m9314;
                } else {
                    c6491.f20043 = m9314;
                }
                c30462.m9328();
                C15869 m9329 = c30462.m9329(c22986.m51138());
                if (c64912.f20043 != null) {
                    c64912.f20043 = m9329;
                } else {
                    c6491.f20043 = m9329;
                }
                c22986.m51137(c30462.m9329(c22986.m51139()));
                c30462.m9324();
                this.f35016.add(this.f35026);
                this.f35026 = null;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m28663(C11738 c11738) {
        return "Creating \"package-info.jasm\": package: " + c11738.f35011 + " " + c11738.f35026.f41195.m50035();
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private String m28668() {
        if (!this.f6341.f20355.m35961(EnumC15204.f46569, EnumC15204.f46585)) {
            return null;
        }
        boolean z = false;
        String str = null;
        while (true) {
            EnumC15204 enumC15204 = this.f6341.f20355;
            if (enumC15204 == EnumC15204.f46554) {
                return str;
            }
            int i = C13148.f39311[enumC15204.ordinal()];
            if (i != 2 && i != 4) {
                if (i == 30) {
                    if (str == null) {
                        this.f6339.m11951(this.f6341.f20363, "\"{0}\" token is expected", z ? "CLASSNAME" : "FILENAME");
                        throw null;
                    }
                    this.f6341.m18126();
                    return str.concat(z ? ".class" : "");
                }
                switch (i) {
                    case 70:
                        if (str != null) {
                            this.f6339.m11951(this.f6341.f20363, "\"{0}\" token is expected", EnumC15204.f46479.m35967());
                            throw null;
                        }
                        break;
                    case 71:
                        if (str != null) {
                            this.f6339.m11951(this.f6341.f20363, "\"{0}\" token is expected", EnumC15204.f46479.m35962());
                            throw null;
                        }
                        z = true;
                        break;
                    case 72:
                        if (str != null) {
                            str = str.concat(".");
                            break;
                        } else {
                            str = ".";
                            break;
                        }
                    default:
                        if (str == null) {
                            this.f6339.m11951(this.f6341.f20363, "\"{0}\" token is expected", z ? "CLASSNAME" : "FILENAME");
                            throw null;
                        }
                        this.f6339.m11951(this.f6341.f20363, "\"{0}\" token is expected", EnumC15204.f46479.m35962());
                        throw null;
                }
            } else if (str == null) {
                str = this.f6341.f20350;
            } else {
                StringBuilder m15339 = C5368.m15339(str);
                m15339.append(this.f6341.f20350);
                str = m15339.toString();
            }
            this.f6341.m18126();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0070, code lost:
    
        r6.f6339.mo9065(r6.f6341.f20363, "Class, module or interface declaration expected", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        throw new l.C12136();
     */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m28693() {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11738.m28693():void");
    }
}

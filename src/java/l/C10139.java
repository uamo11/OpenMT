package l;

import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.q;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.stateless.b;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.HashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.params.DHParameters;

/* compiled from: 57L9 */
/* renamed from: l.ۤ۟֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10139 {

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C4314 f30510 = new C4314();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f30511;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public HashMap f30512;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22364 f30513;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C20661 f30514;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C6136 f30515;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC10370[] f30516;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C0758 f30517;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C6319 f30518;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10139 m25473(C2903 c2903) {
        C10139 c10139 = (C10139) c2903.m8838(f30510);
        return c10139 == null ? new C10139(c2903) : c10139;
    }

    public C10139(C2903 c2903) {
        HashMap hashMap = new HashMap(EnumC18550.m43090());
        this.f30512 = hashMap;
        HashMap hashMap2 = new HashMap(EnumC18550.m43090());
        this.f30511 = hashMap2;
        AbstractC10370[] abstractC10370Arr = new AbstractC10370[EnumC18550.m43090()];
        this.f30516 = abstractC10370Arr;
        c2903.m8841(f30510, this);
        C20661 m47250 = C20661.m47250(c2903);
        this.f30514 = m47250;
        C6136 m17057 = C6136.m17057(c2903);
        this.f30515 = m17057;
        this.f30513 = C22364.m50099(c2903);
        this.f30518 = C6319.m17456(c2903);
        this.f30517 = new C0758(m17057.f18867, AbstractC4308.f13885, -1, m47250.f66475);
        EnumC18550 enumC18550 = EnumC18550.f57577;
        m25475(enumC18550, BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
        EnumC18550 enumC185502 = EnumC18550.f57520;
        m25475(enumC185502, "-");
        EnumC18550 enumC185503 = EnumC18550.f57488;
        m25475(enumC185503, "!");
        EnumC18550 enumC185504 = EnumC18550.f57507;
        m25475(enumC185504, "~");
        m25475(EnumC18550.f57536, "++");
        m25475(EnumC18550.f57492, "--");
        EnumC18550 enumC185505 = EnumC18550.f57499;
        m25475(enumC185505, "++");
        EnumC18550 enumC185506 = EnumC18550.f57567;
        m25475(enumC185506, "--");
        EnumC18550 enumC185507 = EnumC18550.f57560;
        m25475(enumC185507, "<*nullchk*>");
        EnumC18550 enumC185508 = EnumC18550.f57479;
        m25475(enumC185508, "||");
        EnumC18550 enumC185509 = EnumC18550.f57565;
        m25475(enumC185509, "&&");
        EnumC18550 enumC1855010 = EnumC18550.f57559;
        m25475(enumC1855010, "==");
        EnumC18550 enumC1855011 = EnumC18550.f57570;
        m25475(enumC1855011, "!=");
        EnumC18550 enumC1855012 = EnumC18550.f57539;
        m25475(enumC1855012, "<");
        EnumC18550 enumC1855013 = EnumC18550.f57572;
        m25475(enumC1855013, ">");
        EnumC18550 enumC1855014 = EnumC18550.f57505;
        m25475(enumC1855014, "<=");
        EnumC18550 enumC1855015 = EnumC18550.f57544;
        m25475(enumC1855015, ">=");
        EnumC18550 enumC1855016 = EnumC18550.f57538;
        m25475(enumC1855016, "|");
        EnumC18550 enumC1855017 = EnumC18550.f57484;
        m25475(enumC1855017, "^");
        EnumC18550 enumC1855018 = EnumC18550.f57528;
        m25475(enumC1855018, a.p);
        EnumC18550 enumC1855019 = EnumC18550.f57512;
        m25475(enumC1855019, "<<");
        EnumC18550 enumC1855020 = EnumC18550.f57527;
        m25475(enumC1855020, ">>");
        EnumC18550 enumC1855021 = EnumC18550.f57546;
        m25475(enumC1855021, ">>>");
        EnumC18550 enumC1855022 = EnumC18550.f57545;
        m25475(enumC1855022, BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
        EnumC18550 enumC1855023 = EnumC18550.f57485;
        abstractC10370Arr[enumC1855023.m43095()] = m17057.f18802;
        EnumC18550 enumC1855024 = EnumC18550.f57583;
        abstractC10370Arr[enumC1855024.m43095()] = m17057.f18835;
        EnumC18550 enumC1855025 = EnumC18550.f57547;
        abstractC10370Arr[enumC1855025.m43095()] = m17057.f18803;
        EnumC18550 enumC1855026 = EnumC18550.f57551;
        m25475(enumC1855026, "%");
        C22133 c22133 = new C22133(this, enumC18550);
        EnumC15076 enumC15076 = EnumC15076.DOUBLE;
        c22133.m9415(enumC15076, enumC15076, 0);
        EnumC15076 enumC150762 = EnumC15076.FLOAT;
        c22133.m9415(enumC150762, enumC150762, 0);
        EnumC15076 enumC150763 = EnumC15076.LONG;
        c22133.m9415(enumC150763, enumC150763, 0);
        EnumC15076 enumC150764 = EnumC15076.INT;
        c22133.m9415(enumC150764, enumC150764, 0);
        C22133 c221332 = new C22133(this, enumC185502);
        c221332.m9415(enumC15076, enumC15076, 119);
        c221332.m9415(enumC150762, enumC150762, 118);
        c221332.m9415(enumC150763, enumC150763, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION);
        c221332.m9415(enumC150764, enumC150764, 116);
        C22133 c221333 = new C22133(this, enumC185504, new C15690(3));
        c221333.m9415(enumC150763, enumC150763, 131);
        c221333.m9415(enumC150764, enumC150764, 130);
        C12960 c12960 = new C12960(this, enumC185505);
        c12960.m9415(enumC15076, enumC15076, 99);
        c12960.m9415(enumC150762, enumC150762, 98);
        c12960.m9415(enumC150763, enumC150763, 97);
        c12960.m9415(enumC150764, enumC150764, 96);
        EnumC15076 enumC150765 = EnumC15076.CHAR;
        c12960.m9415(enumC150765, enumC150765, 96);
        EnumC15076 enumC150766 = EnumC15076.SHORT;
        c12960.m9415(enumC150766, enumC150766, 96);
        EnumC15076 enumC150767 = EnumC15076.BYTE;
        c12960.m9415(enumC150767, enumC150767, 96);
        C12960 c129602 = new C12960(this, enumC185506);
        c129602.m9415(enumC15076, enumC15076, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged);
        c129602.m9415(enumC150762, enumC150762, IShizukuService.Stub.TRANSACTION_attachUserService);
        c129602.m9415(enumC150763, enumC150763, 101);
        c129602.m9415(enumC150764, enumC150764, 100);
        c129602.m9415(enumC150765, enumC150765, 100);
        c129602.m9415(enumC150766, enumC150766, 100);
        c129602.m9415(enumC150767, enumC150767, 100);
        C21428 c21428 = new C21428(this, enumC185503);
        EnumC15076 enumC150768 = EnumC15076.BOOLEAN;
        c21428.m9415(enumC150768, enumC150768, 257);
        C12255 c12255 = new C12255(this, enumC185507);
        EnumC15076 enumC150769 = EnumC15076.OBJECT;
        c12255.m9415(enumC150769, enumC150769, 276);
        AbstractC3083[] abstractC3083Arr = {c22133, c221332, c221333, c12960, c129602, c21428, c12255};
        int i = 0;
        for (int i2 = 7; i < i2; i2 = 7) {
            AbstractC3083 abstractC3083 = abstractC3083Arr[i];
            AbstractC10370 abstractC10370 = abstractC3083.f48633;
            hashMap.put(abstractC10370, ((C2609) C13843.getOrDefault(hashMap, abstractC10370, C2609.m8239())).m8246(abstractC3083));
            i++;
        }
        C6611 c6611 = new C6611(this, enumC1855022);
        EnumC15076 enumC1507610 = EnumC15076.STRING;
        c6611.m34338(enumC1507610, enumC150769, enumC1507610, 256);
        c6611.m34338(enumC150769, enumC1507610, enumC1507610, 256);
        c6611.m34338(enumC1507610, enumC1507610, enumC1507610, 256);
        c6611.m34338(enumC1507610, enumC150764, enumC1507610, 256);
        c6611.m34338(enumC1507610, enumC150763, enumC1507610, 256);
        c6611.m34338(enumC1507610, enumC150762, enumC1507610, 256);
        c6611.m34338(enumC1507610, enumC15076, enumC1507610, 256);
        c6611.m34338(enumC1507610, enumC150768, enumC1507610, 256);
        EnumC15076 enumC1507611 = EnumC15076.BOT;
        c6611.m34338(enumC1507610, enumC1507611, enumC1507610, 256);
        c6611.m34338(enumC150764, enumC1507610, enumC1507610, 256);
        c6611.m34338(enumC150763, enumC1507610, enumC1507610, 256);
        c6611.m34338(enumC150762, enumC1507610, enumC1507610, 256);
        c6611.m34338(enumC15076, enumC1507610, enumC1507610, 256);
        c6611.m34338(enumC150768, enumC1507610, enumC1507610, 256);
        c6611.m34338(enumC1507611, enumC1507610, enumC1507610, 256);
        C16488 c16488 = new C16488(this, enumC1855022);
        c16488.m34338(enumC15076, enumC15076, enumC15076, 99);
        c16488.m34338(enumC150762, enumC150762, enumC150762, 98);
        c16488.m34338(enumC150763, enumC150763, enumC150763, 97);
        c16488.m34338(enumC150764, enumC150764, enumC150764, 96);
        C16488 c164882 = new C16488(this, enumC1855023);
        c164882.m34338(enumC15076, enumC15076, enumC15076, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged);
        c164882.m34338(enumC150762, enumC150762, enumC150762, IShizukuService.Stub.TRANSACTION_attachUserService);
        c164882.m34338(enumC150763, enumC150763, enumC150763, 101);
        c164882.m34338(enumC150764, enumC150764, enumC150764, 100);
        C16488 c164883 = new C16488(this, enumC1855024);
        c164883.m34338(enumC15076, enumC15076, enumC15076, IShizukuService.Stub.TRANSACTION_updateFlagsForUid);
        c164883.m34338(enumC150762, enumC150762, enumC150762, IShizukuService.Stub.TRANSACTION_getFlagsForUid);
        c164883.m34338(enumC150763, enumC150763, enumC150763, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult);
        c164883.m34338(enumC150764, enumC150764, enumC150764, IShizukuService.Stub.TRANSACTION_isHidden);
        C16488 c164884 = new C16488(this, enumC1855025);
        c164884.m34338(enumC15076, enumC15076, enumC15076, UMErrorCode.E_UM_BE_CREATE_FAILED);
        c164884.m34338(enumC150762, enumC150762, enumC150762, UMErrorCode.E_UM_BE_JSON_FAILED);
        c164884.m34338(enumC150763, enumC150763, enumC150763, 109);
        c164884.m34338(enumC150764, enumC150764, enumC150764, 108);
        C16488 c164885 = new C16488(this, enumC1855026);
        c164885.m34338(enumC15076, enumC15076, enumC15076, 115);
        c164885.m34338(enumC150762, enumC150762, enumC150762, 114);
        c164885.m34338(enumC150763, enumC150763, enumC150763, UMErrorCode.E_UM_BE_RAW_OVERSIZE);
        c164885.m34338(enumC150764, enumC150764, enumC150764, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        C1672 c1672 = new C1672(this, enumC1855018);
        c1672.m34338(enumC150768, enumC150768, enumC150768, 126);
        C16488 c164886 = new C16488(this, enumC1855018, new C15690(3));
        c164886.m34338(enumC150763, enumC150763, enumC150763, 127);
        c164886.m34338(enumC150764, enumC150764, enumC150764, 126);
        C1672 c16722 = new C1672(this, enumC1855016);
        c16722.m34338(enumC150768, enumC150768, enumC150768, 128);
        C16488 c164887 = new C16488(this, enumC1855016, new C15690(3));
        c164887.m34338(enumC150763, enumC150763, enumC150763, 129);
        c164887.m34338(enumC150764, enumC150764, enumC150764, 128);
        C1672 c16723 = new C1672(this, enumC1855017);
        c16723.m34338(enumC150768, enumC150768, enumC150768, 130);
        C16488 c164888 = new C16488(this, enumC1855017, new C15690(3));
        c164888.m34338(enumC150763, enumC150763, enumC150763, 131);
        c164888.m34338(enumC150764, enumC150764, enumC150764, 130);
        C23544 c23544 = new C23544(this, enumC1855019);
        c23544.m34338(enumC150764, enumC150764, enumC150764, UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
        c23544.m34338(enumC150764, enumC150763, enumC150764, BottomAppBarTopEdgeTreatment.ANGLE_UP);
        c23544.m34338(enumC150763, enumC150764, enumC150763, UMErrorCode.E_UM_BE_EMPTY_URL_PATH);
        c23544.m34338(enumC150763, enumC150763, enumC150763, 271);
        C23544 c235442 = new C23544(this, enumC1855020);
        c235442.m34338(enumC150764, enumC150764, enumC150764, 122);
        c235442.m34338(enumC150764, enumC150763, enumC150764, 272);
        c235442.m34338(enumC150763, enumC150764, enumC150763, 123);
        c235442.m34338(enumC150763, enumC150763, enumC150763, 273);
        C23544 c235443 = new C23544(this, enumC1855021);
        c235443.m34338(enumC150764, enumC150764, enumC150764, 124);
        c235443.m34338(enumC150764, enumC150763, enumC150764, 274);
        c235443.m34338(enumC150763, enumC150764, enumC150763, q.h);
        c235443.m34338(enumC150763, enumC150763, enumC150763, b.g);
        C16488 c164889 = new C16488(this, enumC1855012);
        c164889.m34338(enumC15076, enumC15076, enumC150768, 152, 155);
        c164889.m34338(enumC150762, enumC150762, enumC150768, 150, 155);
        c164889.m34338(enumC150763, enumC150763, enumC150768, 148, 155);
        c164889.m34338(enumC150764, enumC150764, enumC150768, 161);
        C16488 c1648810 = new C16488(this, enumC1855013);
        c1648810.m34338(enumC15076, enumC15076, enumC150768, 151, 157);
        c1648810.m34338(enumC150762, enumC150762, enumC150768, 149, 157);
        c1648810.m34338(enumC150763, enumC150763, enumC150768, 148, 157);
        c1648810.m34338(enumC150764, enumC150764, enumC150768, 163);
        C16488 c1648811 = new C16488(this, enumC1855014);
        c1648811.m34338(enumC15076, enumC15076, enumC150768, 152, 158);
        c1648811.m34338(enumC150762, enumC150762, enumC150768, 150, 158);
        c1648811.m34338(enumC150763, enumC150763, enumC150768, 148, 158);
        c1648811.m34338(enumC150764, enumC150764, enumC150768, 164);
        C16488 c1648812 = new C16488(this, enumC1855015);
        c1648812.m34338(enumC15076, enumC15076, enumC150768, 151, 156);
        c1648812.m34338(enumC150762, enumC150762, enumC150768, 149, 156);
        c1648812.m34338(enumC150763, enumC150763, enumC150768, 148, 156);
        c1648812.m34338(enumC150764, enumC150764, enumC150768, 162);
        C10845 c10845 = new C10845(this, enumC1855010);
        c10845.m34338(enumC150769, enumC150769, enumC150768, 165);
        c10845.m34338(enumC150768, enumC150768, enumC150768, 159);
        c10845.m34338(enumC15076, enumC15076, enumC150768, 151, 153);
        c10845.m34338(enumC150762, enumC150762, enumC150768, 149, 153);
        c10845.m34338(enumC150763, enumC150763, enumC150768, 148, 153);
        c10845.m34338(enumC150764, enumC150764, enumC150768, 159);
        C10845 c108452 = new C10845(this, enumC1855011);
        c108452.m34338(enumC150769, enumC150769, enumC150768, 166);
        c108452.m34338(enumC150768, enumC150768, enumC150768, DHParameters.DEFAULT_MINIMUM_LENGTH);
        c108452.m34338(enumC15076, enumC15076, enumC150768, 151, EnumC17734.f54268);
        c108452.m34338(enumC150762, enumC150762, enumC150768, 149, EnumC17734.f54268);
        c108452.m34338(enumC150763, enumC150763, enumC150768, 148, EnumC17734.f54268);
        c108452.m34338(enumC150764, enumC150764, enumC150768, DHParameters.DEFAULT_MINIMUM_LENGTH);
        C1672 c16724 = new C1672(this, enumC185509);
        c16724.m34338(enumC150768, enumC150768, enumC150768, 258);
        C1672 c16725 = new C1672(this, enumC185508);
        c16725.m34338(enumC150768, enumC150768, enumC150768, 259);
        AbstractC14371[] abstractC14371Arr = {c6611, c16488, c164882, c164883, c164884, c164885, c1672, c164886, c16722, c164887, c16723, c164888, c23544, c235442, c235443, c164889, c1648810, c1648811, c1648812, c10845, c108452, c16724, c16725};
        for (int i3 = 0; i3 < 23; i3++) {
            AbstractC14371 abstractC14371 = abstractC14371Arr[i3];
            AbstractC10370 abstractC103702 = abstractC14371.f48633;
            hashMap2.put(abstractC103702, ((C2609) C13843.getOrDefault(hashMap2, abstractC103702, C2609.m8239())).m8246(abstractC14371));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m25480(AbstractC4308 abstractC4308) {
        AbstractC4308 m17559 = this.f30518.m17559(abstractC4308);
        int i = C7500.f23094[m17559.mo3258().ordinal()];
        return (i == 1 || i == 2 || i == 3) ? this.f30514.f66452 : m17559;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m25481(AbstractC4308 abstractC4308, AbstractC4308 abstractC43082) {
        C6319 c6319 = this.f30518;
        AbstractC4308 m17559 = c6319.m17559(abstractC4308);
        AbstractC4308 m175592 = c6319.m17559(abstractC43082);
        boolean mo12914 = m17559.mo12914();
        C20661 c20661 = this.f30514;
        if (!mo12914 || !m175592.mo12914()) {
            return c6319.m17550(m17559, m175592) ? m17559 : c20661.f66526;
        }
        EnumC9454 enumC9454 = EnumC9454.DOUBLE;
        if (m17559.m12913(enumC9454) || m175592.m12913(enumC9454)) {
            return c20661.f66499;
        }
        EnumC9454 enumC94542 = EnumC9454.FLOAT;
        if (m17559.m12913(enumC94542) || m175592.m12913(enumC94542)) {
            return c20661.f66483;
        }
        EnumC9454 enumC94543 = EnumC9454.LONG;
        if (m17559.m12913(enumC94543) || m175592.m12913(enumC94543)) {
            return c20661.f66470;
        }
        return c20661.f66452;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0758 m25478(final AbstractC12612 abstractC12612, final EnumC18550 enumC18550, final AbstractC4308 abstractC4308) {
        Predicate predicate = new Predicate() { // from class: l.ۤܰ֨
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate2) {
                return C19285.$default$and(this, predicate2);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate2) {
                return C19285.$default$or(this, predicate2);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((AbstractC3083) obj).test(AbstractC4308.this);
            }
        };
        C7688 c7688 = new C7688(1, abstractC4308);
        return (C0758) C5378.stream((C2609) this.f30512.get(m25482(enumC18550))).filter(predicate).map(c7688).findFirst().orElseGet(new Supplier() { // from class: l.ۛܰ֨
            @Override // java.util.function.Supplier
            public final Object get() {
                C0758 m25468;
                m25468 = C10139.this.m25468(abstractC12612, enumC18550, abstractC4308);
                return m25468;
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0758 m25477(final AbstractC0764 abstractC0764, final EnumC18550 enumC18550, final AbstractC4308 abstractC4308, final AbstractC4308 abstractC43082) {
        C10762 c10762 = new C10762(abstractC4308, abstractC43082);
        C16405 c16405 = new C16405(1, abstractC4308, abstractC43082);
        return (C0758) C5378.stream((C2609) this.f30511.get(m25482(enumC18550))).filter(c10762).map(c16405).findFirst().orElseGet(new Supplier() { // from class: l.ۨܰ֨
            @Override // java.util.function.Supplier
            public final Object get() {
                C0758 m25468;
                m25468 = C10139.this.m25468(abstractC0764, enumC18550, abstractC4308, abstractC43082);
                return m25468;
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0758 m25471(final C10139 c10139, AbstractC10370 abstractC10370, C2609 c2609, EnumC15076 enumC15076, int[] iArr) {
        int i;
        C2609 c26092 = (C2609) C5378.stream(c2609).map(new Function() { // from class: l.۫ܰ֨
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                AbstractC4308 m35695;
                m35695 = ((EnumC15076) obj).m35695(C10139.this.f30514);
                return m35695;
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }
        }).collect(C2609.m8240());
        C20661 c20661 = c10139.f30514;
        C10658 c10658 = new C10658(c26092, enumC15076.m35695(c20661), C2609.m8239(), c20661.f66481);
        int length = iArr.length;
        C12171.m29642(length == 1 || length == 2);
        if (length == 1) {
            i = iArr[0];
        } else {
            i = (iArr[0] << 9) | iArr[1];
        }
        return new C0758(abstractC10370, c10658, i, c20661.f66475);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C0758 m25468(InterfaceC3109 interfaceC3109, EnumC18550 enumC18550, AbstractC4308... abstractC4308Arr) {
        C12281 c12281;
        if (C16958.of((Object[]) abstractC4308Arr).noneMatch(new C13144())) {
            AbstractC10370 m25482 = m25482(enumC18550);
            if (abstractC4308Arr.length == 1) {
                AbstractC4308 abstractC4308 = abstractC4308Arr[0];
                C12281 c122812 = C6241.f19132;
                c12281 = new C12281("compiler", "operator.cant.be.applied", m25482, abstractC4308);
            } else {
                AbstractC4308 abstractC43082 = abstractC4308Arr[0];
                AbstractC4308 abstractC43083 = abstractC4308Arr[1];
                C12281 c122813 = C6241.f19132;
                c12281 = new C12281("compiler", "operator.cant.be.applied.1", m25482, abstractC43082, abstractC43083);
            }
            this.f30513.m7273(interfaceC3109, c12281);
        }
        return this.f30517;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 m25482(EnumC18550 enumC18550) {
        return this.f30516[enumC18550.m43095()];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0758 m25479(C15532 c15532) {
        return (C0758) C5378.stream(this.f30511.values()).flatMap(new C5894(5)).map(new C23022(0, c15532)).distinct().filter(new C13849(0, this)).findFirst().get();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m25475(EnumC18550 enumC18550, String str) {
        AbstractC12486 abstractC12486 = this.f30515.f18880;
        abstractC12486.getClass();
        char[] charArray = str.toCharArray();
        this.f30516[enumC18550.m43095()] = abstractC12486.mo15927(charArray, charArray.length);
    }
}

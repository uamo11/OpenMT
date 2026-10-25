package l;

import android.util.Pair;
import android.util.SparseArray;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* compiled from: K8QR */
/* renamed from: l.۬ۖۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12825 implements InterfaceC1368 {

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final C8353 f38475;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f38476 = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f38477;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f38478;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17714 f38479;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f38481;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f38484;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f38485;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f38486;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List f38487;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final byte[] f38488;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C2948 f38491;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f38495;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f38496;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C17714 f38498;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f38502;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC6950 f38503;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f38504;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f38506;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final C9248 f38507;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f38509;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f38510;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f38514;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C3671 f38483 = new C3671(1);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17714 f38493 = new C17714(16);

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C17714 f38512 = new C17714(C16509.f50737);

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C17714 f38500 = new C17714(6);

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C17714 f38513 = new C17714();

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f38511 = new ArrayDeque();

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f38482 = new ArrayDeque();

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final SparseArray f38505 = new SparseArray();

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public AbstractC14545 f38489 = AbstractC14545.of();

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f38490 = -9223372036854775807L;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f38497 = -9223372036854775807L;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public long f38494 = -9223372036854775807L;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f38508 = InterfaceC21830.f69942;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383[] f38501 = new InterfaceC19383[0];

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383[] f38499 = new InterfaceC19383[0];

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C23565 f38492 = new C23565(new C9209(this));

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C9836 f38515 = new C9836();

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public long f38480 = -1;

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4838() {
    }

    @Override // l.InterfaceC1368
    /* renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    static {
        C1297 c1297 = new C1297();
        c1297.m4465("application/x-emsg");
        f38475 = c1297.m4440();
    }

    public C12825(InterfaceC6950 interfaceC6950, int i, C9248 c9248, List list) {
        this.f38503 = interfaceC6950;
        this.f38509 = i;
        this.f38507 = c9248;
        this.f38487 = C20195.unmodifiableList(list);
        byte[] bArr = new byte[16];
        this.f38488 = bArr;
        this.f38498 = new C17714(bArr);
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) {
        InterfaceC3860 m40116 = C17099.m40116((C16184) interfaceC8424);
        this.f38489 = m40116 != null ? AbstractC14545.of((Object) m40116) : AbstractC14545.of();
        return m40116 == null;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ܳ */
    public final List mo4842() {
        return this.f38489;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        int i;
        int i2 = this.f38509;
        if ((i2 & 32) == 0) {
            interfaceC21830 = new C9067(interfaceC21830, this.f38503);
        }
        this.f38508 = interfaceC21830;
        m31199();
        InterfaceC19383[] interfaceC19383Arr = new InterfaceC19383[2];
        this.f38501 = interfaceC19383Arr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            interfaceC19383Arr[0] = this.f38508.mo3429(100, 5);
            i = 1;
            i3 = 101;
        } else {
            i = 0;
        }
        InterfaceC19383[] interfaceC19383Arr2 = (InterfaceC19383[]) C3603.m11033(i, this.f38501);
        this.f38501 = interfaceC19383Arr2;
        for (InterfaceC19383 interfaceC19383 : interfaceC19383Arr2) {
            interfaceC19383.mo8456(f38475);
        }
        List list = this.f38487;
        this.f38499 = new InterfaceC19383[list.size()];
        while (i4 < this.f38499.length) {
            InterfaceC19383 mo3429 = this.f38508.mo3429(i3, 3);
            mo3429.mo8456((C8353) list.get(i4));
            this.f38499[i4] = mo3429;
            i4++;
            i3++;
        }
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        SparseArray sparseArray = this.f38505;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((C2948) sparseArray.valueAt(i)).m8982();
        }
        this.f38482.clear();
        this.f38484 = 0;
        this.f38492.m52031();
        this.f38497 = j2;
        this.f38511.clear();
        m31199();
    }

    /* JADX WARN: Code restructure failed: missing block: B:345:0x009c, code lost:
    
        r6 = r2.f9356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x00a6, code lost:
    
        if (r26.f38510 != 3) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x00a8, code lost:
    
        r26.f38514 = r2.m8981();
        r7 = r2.f9352.f66352.f43020;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x00ba, code lost:
    
        if (l.C11003.equals(r7.f25614, "video/avc") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x00be, code lost:
    
        if ((r12 & 64) == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x00cf, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x00d0, code lost:
    
        r26.f38478 = !r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x00d8, code lost:
    
        if (r2.f9357 >= r2.f9360) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x00da, code lost:
    
        r27.mo22070(r26.f38514);
        r1 = r2.f9353;
        r4 = r2.m8980();
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x00e5, code lost:
    
        if (r4 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x00e8, code lost:
    
        r5 = r1.f20115;
        r4 = r4.f75273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x00ec, code lost:
    
        if (r4 == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x00ee, code lost:
    
        r5.m41478(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x00f1, code lost:
    
        r4 = r2.f9357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x00f5, code lost:
    
        if (r1.f20121 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x00fb, code lost:
    
        if (r1.f20117[r4] == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x00fd, code lost:
    
        r5.m41478(r5.m41464() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x010a, code lost:
    
        if (r2.m8978() != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x010c, code lost:
    
        r26.f38491 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x010f, code lost:
    
        r26.f38510 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0112, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x011a, code lost:
    
        if (r2.f9352.f66352.f43013 != 1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x011c, code lost:
    
        r26.f38514 -= 8;
        r27.mo22070(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0135, code lost:
    
        if ("audio/ac4".equals(r2.f9352.f66352.f43020.f25614) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0137, code lost:
    
        r26.f38486 = r2.m8974(r26.f38514, 7);
        l.C13653.m32807(r26.f38514, r5);
        r6.mo8453(7, r5);
        r26.f38486 += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0157, code lost:
    
        r26.f38514 += r26.f38486;
        r26.f38510 = 4;
        r26.f38495 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x014e, code lost:
    
        r26.f38486 = r2.m8974(r26.f38514, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x00cd, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x00c7, code lost:
    
        if (l.C11003.equals(r7.f25614, "video/hevc") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x00cb, code lost:
    
        if ((r12 & 128) == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0163, code lost:
    
        r3 = r2.f9352.f66352;
        r14 = r2.m8979();
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x016b, code lost:
    
        if (r13 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x016d, code lost:
    
        r14 = r13.m23731(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0171, code lost:
    
        r5 = r3.f43021;
        r3 = r3.f43020;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0175, code lost:
    
        if (r5 == 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0177, code lost:
    
        r7 = r26.f38500;
        r12 = r7.m41482();
        r12[0] = 0;
        r12[1] = 0;
        r12[r9] = 0;
        r9 = 4 - r5;
        r16 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x018b, code lost:
    
        r17 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0191, code lost:
    
        if (r26.f38486 >= r26.f38514) goto L487;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0193, code lost:
    
        r11 = r26.f38495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0195, code lost:
    
        if (r11 != 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x019a, code lost:
    
        if (r26.f38499.length > 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x019e, code lost:
    
        if (r26.f38478 != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x01a1, code lost:
    
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x01b8, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x01b9, code lost:
    
        r27.readFully(r12, r9, r5 + r11);
        r7.m41484(0);
        r2 = r7.m41493();
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x01c6, code lost:
    
        if (r2 < 0) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x01c8, code lost:
    
        r26.f38495 = r2 - r11;
        r2 = r26.f38512;
        r2.m41484(0);
        r6.mo8453(4, r2);
        r26.f38486 += 4;
        r26.f38514 += r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x01e2, code lost:
    
        if (r26.f38499.length <= 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x01e4, code lost:
    
        if (r11 <= 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x01e6, code lost:
    
        r2 = r12[4];
        r13 = r3.f25614;
        r19 = r5;
        r5 = r3.f25619;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x01f2, code lost:
    
        if (l.C11003.equals(r13, "video/avc") != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x01f8, code lost:
    
        if (l.C9786.m24803(r5, "video/avc") == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x01fb, code lost:
    
        r28 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x020b, code lost:
    
        if (l.C11003.equals(r3.f25614, "video/hevc") != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0211, code lost:
    
        if (l.C9786.m24803(r5, "video/hevc") == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0221, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0222, code lost:
    
        r26.f38496 = r2;
        r6.mo8453(r11, r7);
        r26.f38486 += r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x022c, code lost:
    
        if (r11 <= 0) goto L490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0230, code lost:
    
        if (r26.f38478 != false) goto L491;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0236, code lost:
    
        if (l.C16509.m38888(r12, r11, r3) == false) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0238, code lost:
    
        r26.f38478 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x02af, code lost:
    
        r9 = r28;
        r11 = r17;
        r2 = r18;
        r5 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0219, code lost:
    
        if (((r2 & 126) >> 1) != 39) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x021b, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x01fe, code lost:
    
        r28 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0203, code lost:
    
        if ((r2 & com.umeng.analytics.pro.bo.j) == 6) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x021d, code lost:
    
        r19 = r5;
        r28 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0244, code lost:
    
        throw l.C9080.m23440("Invalid NAL length", (java.lang.Throwable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x01a4, code lost:
    
        r11 = l.C16509.m38881(r3);
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x01b3, code lost:
    
        if ((r5 + r11) > (r26.f38514 - r26.f38486)) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x01b5, code lost:
    
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0245, code lost:
    
        r18 = r2;
        r19 = r5;
        r28 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x024d, code lost:
    
        if (r26.f38496 == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x024f, code lost:
    
        r2 = r26.f38513;
        r2.m41481(r11);
        r27.readFully(r2.m41482(), 0, r26.f38495);
        r6.mo8453(r26.f38495, r2);
        r5 = r26.f38495;
        r9 = l.C16509.m38880(r2.m41483(), r2.m41482());
        r2.m41484(0);
        r2.m41486(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x027a, code lost:
    
        if (r3.f25617 != (-1)) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0280, code lost:
    
        if (r4.m52035() == 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0282, code lost:
    
        r4.m52032(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0291, code lost:
    
        r4.m52033(r14, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x029a, code lost:
    
        if ((r18.m8973() & 4) == 0) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x029c, code lost:
    
        r4.m52034();
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x02a5, code lost:
    
        r26.f38486 += r5;
        r26.f38495 -= r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0286, code lost:
    
        r9 = r4.m52035();
        r11 = r3.f25617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x028c, code lost:
    
        if (r9 == r11) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x028e, code lost:
    
        r4.m52032(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x02a0, code lost:
    
        r5 = r6.mo8451((l.InterfaceC9765) r27, r11, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x02b9, code lost:
    
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x02d4, code lost:
    
        r1 = r18.m8973();
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x02da, code lost:
    
        if (r26.f38478 != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x02dc, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x02df, code lost:
    
        r22 = r1;
        r1 = r18.m8980();
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x02e5, code lost:
    
        if (r1 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x02e7, code lost:
    
        r1 = r1.f75269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x02eb, code lost:
    
        r6.mo8455(r14, r22, r26.f38514, 0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x02fe, code lost:
    
        if (r17.isEmpty() != false) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0300, code lost:
    
        r1 = (l.C4359) r17.removeFirst();
        r26.f38484 -= r1.f14021;
        r2 = r1.f14020;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0311, code lost:
    
        if (r1.f14019 == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0313, code lost:
    
        r2 = r2 + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0314, code lost:
    
        r4 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0316, code lost:
    
        if (r16 == null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0318, code lost:
    
        r2 = r4.m23731(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x031c, code lost:
    
        r12 = r26.f38501;
        r13 = r12.length;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0321, code lost:
    
        if (r11 >= r13) goto L495;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x0323, code lost:
    
        r12[r11].mo8455(r2, 1, r1.f14021, r26.f38484, null);
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0337, code lost:
    
        r16 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x033e, code lost:
    
        if (r18.m8978() != false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0340, code lost:
    
        r26.f38491 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0343, code lost:
    
        r26.f38510 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x0347, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x02ea, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x02bc, code lost:
    
        r18 = r2;
        r17 = r11;
        r16 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x02c2, code lost:
    
        r2 = r26.f38486;
        r3 = r26.f38514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x02c6, code lost:
    
        if (r2 >= r3) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x02c8, code lost:
    
        r26.f38486 += r6.mo8451((l.InterfaceC9765) r27, r3 - r2, false);
     */
    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo4837(l.InterfaceC8424 r27, l.C23615 r28) {
        /*
            Method dump skipped, instructions count: 2061
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12825.mo4837(l.۠᩷ۧ, l.᩻ۢۧ):int");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m31199() {
        this.f38510 = 0;
        this.f38502 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:394:0x07e1, code lost:
    
        m31199();
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x07e5, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0431  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m31196(long r49) {
        /*
            Method dump skipped, instructions count: 2022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12825.m31196(long):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31198(C17714 c17714, int i, C6516 c6516) {
        c17714.m41484(i + 8);
        int m41493 = c17714.m41493();
        int i2 = C21998.f70423;
        if ((m41493 & 1) != 0) {
            throw C9080.m23441("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (m41493 & 2) != 0;
        int m41492 = c17714.m41492();
        if (m41492 == 0) {
            Arrays.fill(c6516.f20117, 0, c6516.f20127, false);
            return;
        }
        int i3 = c6516.f20127;
        C17714 c177142 = c6516.f20115;
        if (m41492 != i3) {
            StringBuilder m32308 = C13325.m32308(m41492, "Senc sample count ", " is different from fragment sample count");
            m32308.append(c6516.f20127);
            throw C9080.m23440(m32308.toString(), (Throwable) null);
        }
        Arrays.fill(c6516.f20117, 0, m41492, z);
        c177142.m41481(c17714.m41457());
        c6516.f20121 = true;
        c6516.f20126 = true;
        c17714.m41461(0, c177142.m41483(), c177142.m41482());
        c177142.m41484(0);
        c6516.f20126 = false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Pair m31194(long j, C17714 c17714) {
        long m41466;
        long m414662;
        c17714.m41484(8);
        int m49483 = C21998.m49483(c17714.m41493());
        c17714.m41478(4);
        long m41479 = c17714.m41479();
        if (m49483 == 0) {
            m41466 = c17714.m41479();
            m414662 = c17714.m41479();
        } else {
            m41466 = c17714.m41466();
            m414662 = c17714.m41466();
        }
        long j2 = m414662 + j;
        String str = C3603.f11424;
        long m11017 = C3603.m11017(m41466, 1000000L, m41479, RoundingMode.DOWN);
        c17714.m41478(2);
        int m41464 = c17714.m41464();
        int[] iArr = new int[m41464];
        long[] jArr = new long[m41464];
        long[] jArr2 = new long[m41464];
        long[] jArr3 = new long[m41464];
        long j3 = j2;
        long j4 = m11017;
        int i = 0;
        while (i < m41464) {
            int m41493 = c17714.m41493();
            if ((m41493 & Integer.MIN_VALUE) != 0) {
                throw C9080.m23440("Unhandled indirect reference", (Throwable) null);
            }
            long m414792 = c17714.m41479();
            iArr[i] = m41493 & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            long j5 = m41466 + m414792;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            j4 = C3603.m11017(j5, 1000000L, m41479, RoundingMode.DOWN);
            jArr4[i] = j4 - jArr5[i];
            c17714.m41478(4);
            j3 += r21[i];
            i++;
            jArr3 = jArr5;
            iArr = iArr;
            m41464 = m41464;
            jArr = jArr;
            jArr2 = jArr4;
            m41466 = j5;
        }
        return Pair.create(Long.valueOf(m11017), new C21125(iArr, jArr, jArr2, jArr3));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19643 m31195(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C7836 c7836 = (C7836) list.get(i);
            if (c7836.f45441 == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] m41482 = c7836.f24238.m41482();
                C1577 m26945 = C10750.m26945(m41482);
                UUID uuid = m26945 == null ? null : m26945.f5584;
                if (uuid == null) {
                    C19956.m46037("Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C18937(uuid, null, "video/mp4", m41482));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C19643(arrayList);
    }
}

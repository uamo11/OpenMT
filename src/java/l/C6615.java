package l;

import java.util.List;
import java.util.function.Predicate;

/* compiled from: 43ZG */
/* renamed from: l.ۜ۟ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6615 extends C1860 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f20349;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f20350;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f20351;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C17904 f20352;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f20353;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Predicate f20354;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public EnumC15204 f20355;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f20356;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f20357;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f20358;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C17198 f20359;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f20360;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f20361;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public char[] f20362 = new char[32];

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f20363;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f20364;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f20365;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public double f20366;

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ܿ۟ۚ] */
    public C6615(C3917 c3917) {
        C17904 c17904 = new C17904(0);
        this.f20352 = c17904;
        this.f20359 = new Predicate() { // from class: l.ܿ۟ۚ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C6615.m18123(C6615.this, (Integer) obj);
            }
        };
        this.f6339 = c3917;
        this.f20354 = c17904;
        this.f20361 = c3917.f12499.m37675();
        m18133();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m18123(C6615 c6615, Integer num) {
        boolean z = num.intValue() == 92 || num.intValue() == 58 || num.intValue() == 64;
        if (z) {
            c6615.m18121(92);
        }
        return z;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18131() {
        C17904 c17904 = this.f20352;
        try {
            this.f20354 = this.f20359;
            m18126();
        } finally {
            this.f20354 = c17904;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18126() {
        int[] iArr;
        this.f20364 = this.f20363;
        int i = 1;
        while (true) {
            m18133();
            iArr = C23548.f75603;
            if (iArr[this.f20355.ordinal()] != 1) {
                break;
            } else {
                i *= this.f20360;
            }
        }
        switch (iArr[this.f20355.ordinal()]) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                this.f20353 = i;
                break;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18132(EnumC15204 enumC15204) {
        m18129(enumC15204);
        m18126();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m18134(EnumC15204 enumC15204) {
        if (this.f20355 == EnumC15204.f46611 && this.f20350.equals(enumC15204.m35967())) {
            m18126();
        } else {
            this.f6339.m11951(this.f20363, "\"{0}\" token is expected", C21639.m48906(enumC15204, new StringBuilder("\""), "\""));
            throw null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18128(List list, EnumC15204... enumC15204Arr) {
        boolean z;
        boolean m18130 = m18130(enumC15204Arr);
        int i = 0;
        String[] strArr = (String[]) list.toArray(new String[0]);
        if (this.f20355 == EnumC15204.f46611) {
            for (String str : strArr) {
                if (this.f20350.equals(str)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (m18130 || z) {
            return;
        }
        this.f6339.mo9065(this.f20363, "One of {0} tokens is expected", String.format("[ %s,%s ]", (String) C5378.stream(list).map(new C23519(8)).collect(C22976.joining(",")), C22311.stream(enumC15204Arr).map(new C14375(i)).collect(C22976.joining(","))));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m18130(EnumC15204... enumC15204Arr) {
        for (EnumC15204 enumC15204 : enumC15204Arr) {
            if (this.f20355 == enumC15204) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18129(EnumC15204 enumC15204) {
        EnumC15204 enumC152042 = this.f20355;
        if (enumC152042 != enumC15204) {
            EnumC15204 enumC152043 = EnumC15204.f46611;
            if (enumC15204 == enumC152043 && enumC152042.m35966()) {
                return;
            }
            this.f6339.m45778("expect: " + enumC15204 + " instead of " + this.f20355, new Object[0]);
            if (enumC15204 == enumC152043) {
                this.f6339.mo9065(this.f20363, "Jasm identifier expected", new Object[0]);
            } else {
                this.f6339.mo9065(this.f20363, "\"{0}\" token is expected", C21639.m48906(enumC15204, new StringBuilder("<"), ">"));
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m18121(int i) {
        int i2 = this.f20358;
        char[] cArr = this.f20362;
        if (i2 == cArr.length) {
            char[] cArr2 = new char[cArr.length * 2];
            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
            this.f20362 = cArr2;
        }
        char[] cArr3 = this.f20362;
        int i3 = this.f20358;
        this.f20358 = i3 + 1;
        cArr3[i3] = (char) i;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private String m18125() {
        int i = this.f20358;
        char[] cArr = new char[i];
        System.arraycopy(this.f20362, 0, cArr, 0, i);
        return new String(cArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        r12.f20361 = r12.f6339.f12499.m37675();
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x004a, code lost:
    
        r12.f20361 = r12.f6339.f12499.m37675();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x002c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x0029. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0041  */
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m18124() {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6615.m18124():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0103, code lost:
    
        r9.f6339.mo9065(r9.f6339.m11948(), "Invalid escape character", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011f, code lost:
    
        r10 = m18125();
        r9.f20357 = r10;
        r9.f20350 = r10;
        r10 = (l.EnumC15204) l.EnumC15204.m35948(r10, l.EnumC19440.KEYWORD).orElse(l.EnumC15204.f46611);
        r9.f20355 = r10;
        l.C11003.toString(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013a, code lost:
    
        return;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m18122(char[] r10) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6615.m18122(char[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0724, code lost:
    
        m18122((char[]) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0727, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0588, code lost:
    
        if (r0 != 48) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x058a, code lost:
    
        r2 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x058f, code lost:
    
        r21.f20349 = r2;
        r10 = r0 - 48;
        r21.f20358 = 0;
        m18121(r0);
        r0 = false;
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x059b, code lost:
    
        r5 = r21.f6339.f12499.m37675();
        r21.f20361 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x05a9, code lost:
    
        if (r5 == r4) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x05ad, code lost:
    
        if (r5 == 76) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x05b1, code lost:
    
        if (r5 == 88) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x05b5, code lost:
    
        if (r5 == 108) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x05b9, code lost:
    
        if (r5 == 120) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x05bc, code lost:
    
        switch(r5) {
            case 48: goto L275;
            case 49: goto L275;
            case 50: goto L275;
            case 51: goto L275;
            case 52: goto L275;
            case 53: goto L275;
            case 54: goto L275;
            case 55: goto L275;
            case 56: goto L274;
            case 57: goto L274;
            default: goto L271;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x05bf, code lost:
    
        switch(r5) {
            case 65: goto L310;
            case 66: goto L310;
            case 67: goto L310;
            case 68: goto L306;
            case 69: goto L306;
            case 70: goto L306;
            default: goto L272;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x05c2, code lost:
    
        switch(r5) {
            case 97: goto L310;
            case 98: goto L310;
            case 99: goto L310;
            case 100: goto L306;
            case 101: goto L306;
            case 102: goto L306;
            default: goto L444;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x05c5, code lost:
    
        r21.f20360 = (int) r10;
        r21.f20355 = l.EnumC15204.f46543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x068c, code lost:
    
        if (java.lang.Character.isLetterOrDigit(r21.f20361) != false) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0692, code lost:
    
        if (r21.f20361 != 46) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0695, code lost:
    
        r3 = r21.f20349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0697, code lost:
    
        if (r3 != 8) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0699, code lost:
    
        if (r2 == false) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x069b, code lost:
    
        r21.f20360 = 0;
        r21.f20355 = l.EnumC15204.f46543;
        r1 = r21.f6339;
        r1.mo9065(r1.m11948(), "Invalid character in octal number", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x06af, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x06b0, code lost:
    
        if (r0 != false) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x06b6, code lost:
    
        if (r21.f20355 != l.EnumC15204.f46543) goto L490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x06ba, code lost:
    
        if (r3 != 10) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x06c0, code lost:
    
        if ((r21.f20360 - 1) >= (-1)) goto L491;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x06c3, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x06cd, code lost:
    
        if (((-4294967296L) & r10) == 0) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x06d3, code lost:
    
        r21.f20360 = 0;
        r21.f20351 = r2;
        r21.f6339.mo9065(r21.f20363, "Numeric overflow", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x06e1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x06d1, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x06e2, code lost:
    
        r1 = r21.f6339;
        r1.mo9065(r1.m11948(), "Invalid character \"{0}\" in number", java.lang.Character.toString((char) r21.f20361));
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x06f7, code lost:
    
        r1 = r21.f6339.f12499.m37675();
        r21.f20361 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0705, code lost:
    
        if (java.lang.Character.isLetterOrDigit(r1) != false) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x070b, code lost:
    
        if (r21.f20361 == 46) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x070d, code lost:
    
        r21.f20360 = 0;
        r21.f20355 = l.EnumC15204.f46543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0713, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x062f, code lost:
    
        r4 = '<';
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0633, code lost:
    
        if (r21.f20349 == 16) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x063b, code lost:
    
        m18121(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0640, code lost:
    
        if (r21.f20349 == 16) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0643, code lost:
    
        if (r0 != false) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x064b, code lost:
    
        if ((r10 >>> r4) == 0) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x064e, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0651, code lost:
    
        r10 = (((r10 << 4) + 10) + java.lang.Character.toLowerCase((char) r21.f20361)) - 97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x066c, code lost:
    
        r4 = 46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0650, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0635, code lost:
    
        m18124();
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0638, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0639, code lost:
    
        r4 = '<';
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x05ce, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x05cf, code lost:
    
        m18121(r5);
        r5 = r21.f20349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x05d8, code lost:
    
        if (r5 != 10) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x05da, code lost:
    
        if (r0 != false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x05e1, code lost:
    
        if (((r10 * 10) / 10) == r10) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x05e4, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x05e7, code lost:
    
        r10 = (r10 * 10) + (r21.f20361 - 48);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x05ef, code lost:
    
        if (r0 != false) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x05f9, code lost:
    
        if ((r10 - 1) >= (-1)) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x05fc, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x05ff, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x05e6, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0602, code lost:
    
        if (r5 != 8) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0604, code lost:
    
        if (r0 != false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x060c, code lost:
    
        if ((r10 >>> 61) == 0) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x060f, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0612, code lost:
    
        r3 = r10 << 3;
        r5 = r21.f20361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x062a, code lost:
    
        r10 = (r5 - 48) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0611, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0618, code lost:
    
        if (r0 != false) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0620, code lost:
    
        if ((r10 >>> 60) == 0) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0623, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0626, code lost:
    
        r3 = r10 << 4;
        r5 = r21.f20361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0625, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0671, code lost:
    
        r21.f20361 = r21.f6339.f12499.m37675();
        r21.f20351 = r10;
        r21.f20355 = l.EnumC15204.f46625;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0664, code lost:
    
        if (r21.f20358 != 1) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0668, code lost:
    
        if (r21.f20349 != 8) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x066a, code lost:
    
        r21.f20349 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0684, code lost:
    
        if (r21.f20349 != 16) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0714, code lost:
    
        m18124();
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0717, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x058d, code lost:
    
        r2 = 10;
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m18133() {
        /*
            Method dump skipped, instructions count: 2013
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6615.m18133():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18127(String str) {
        if (this.f6339.m45768()) {
            EnumC15204 enumC15204 = this.f20355;
            if (enumC15204 == null) {
                this.f6339.m45778(str.concat("<<<NULL TOKEN>>>"), new Object[0]);
                return;
            }
            this.f6339.m45775(str.concat(enumC15204.toString()), new Object[0]);
            int i = C23548.f75603[this.f20355.ordinal()];
            if (i == 2) {
                this.f6339.m45778(" = {intValue}: " + this.f20360, new Object[0]);
                return;
            }
            if (i == 4) {
                this.f6339.m45778(" = {floatValue}: " + this.f20365, new Object[0]);
                return;
            }
            if (i == 5) {
                this.f6339.m45778(" = {doubleValue}: " + this.f20366, new Object[0]);
                return;
            }
            if (i != 8) {
                if (i != 9) {
                    this.f6339.m45778("", new Object[0]);
                    return;
                } else {
                    this.f6339.m45778(C9045.m23341(new StringBuilder(" = {stringValue}: \""), this.f20350, "\""), new Object[0]);
                    return;
                }
            }
            C3917 c3917 = this.f6339;
            StringBuilder sb = new StringBuilder(" = '");
            sb.append(this.f20350);
            sb.append("' {idValue = '");
            c3917.m45778(C9045.m23341(sb, this.f20357, "'}"), new Object[0]);
        }
    }
}

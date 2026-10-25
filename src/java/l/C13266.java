package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Collection;

/* compiled from: 98AW */
/* renamed from: l.۬ܿ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C13266 extends AbstractC20250 {

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f39727 = 0;

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f39728;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public C21818 f39729;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public C11339 f39730 = new C11339();

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76958;
    }

    @Override // l.AbstractC3817
    /* renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector_res_0x7f120797);
        mo23259("...");
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0279, code lost:
    
        r25 = r4;
        r27 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x027d, code lost:
    
        r4 = r27.m42207();
        r0 = r27.m42210().iterator();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0290, code lost:
    
        if (r0.hasNext() == false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0292, code lost:
    
        r10 = (l.C3545) r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x029c, code lost:
    
        if (r10.isDirectory() != false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x029e, code lost:
    
        if (r6 == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02a0, code lost:
    
        r13 = l.C21665.m48935(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02a9, code lost:
    
        r8 = r8 + r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02a5, code lost:
    
        r13 = r10.m10793();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02ad, code lost:
    
        r0 = new l.C19277(r8);
        r0.m44459(new l.C1909(r32));
        r8 = r27.m42210().iterator();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02c8, code lost:
    
        if (r8.hasNext() == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02ca, code lost:
    
        r13 = (l.C3545) r8.next();
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02da, code lost:
    
        if (r12.contains(r13.getName()) == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02e0, code lost:
    
        if (r13.isDirectory() != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02e2, code lost:
    
        if (r6 == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02e4, code lost:
    
        r13 = l.C21665.m48935(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02ed, code lost:
    
        r0.m44458(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02e9, code lost:
    
        r13 = r13.m10793();
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02f0, code lost:
    
        r18 = r6;
        r14 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0354, code lost:
    
        r27 = r14;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02fa, code lost:
    
        r14 = new java.lang.StringBuilder();
        r18 = r6;
        r14.append(l.C4925.m14327(bin.mt.plus.R.string.MT_Protector_res_0x7f120ac0));
        r14.append(com.google.android.material.motion.MotionUtils.EASING_TYPE_FORMAT_START);
        r14.append(r9);
        r14.append("/");
        r14.append(r4);
        r14.append(com.google.android.material.motion.MotionUtils.EASING_TYPE_FORMAT_END);
        mo11546(r14.toString());
        mo11520(r13.getName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x032d, code lost:
    
        r14 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x032f, code lost:
    
        l.C21665.m48936(r14, r3, r13, r7, new l.C3389(r32, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0336, code lost:
    
        if (mo1526() == false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0338, code lost:
    
        r0 = l.C17222.m40521();
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x033c, code lost:
    
        r14.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x033f, code lost:
    
        r2 = r25.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0347, code lost:
    
        if (r2.hasNext() == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0349, code lost:
    
        l.C0349.m1793((l.C18090) r2.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0353, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03c7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03d1, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x035a, code lost:
    
        r14 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x035c, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x035f, code lost:
    
        if (r20 == null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0361, code lost:
    
        l.C10025.m25200(r32.f39729, r20, r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x036c, code lost:
    
        if (mo1526() == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x036e, code lost:
    
        r0 = l.C17222.m40521();
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0372, code lost:
    
        r14.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0375, code lost:
    
        r2 = r25.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x037d, code lost:
    
        if (r2.hasNext() == false) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x037f, code lost:
    
        l.C0349.m1793((l.C18090) r2.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0389, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x038a, code lost:
    
        l.C18838.m43524(r16);
        r0 = new l.C17558();
        r0.m41050(r16);
        r32.f39729.m49175(r16, new l.RunnableC15602(3, r32, r16), r14);
        r0.m41052(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x03ab, code lost:
    
        r14.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03ae, code lost:
    
        r0 = r25.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03b6, code lost:
    
        if (r0.hasNext() == false) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03b8, code lost:
    
        l.C0349.m1793((l.C18090) r0.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03c6, code lost:
    
        return m11545();
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03c9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03ca, code lost:
    
        r14 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f6, code lost:
    
        r0 = l.C17222.m40521();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01fa, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01fd, code lost:
    
        r27.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0200, code lost:
    
        r2 = r25.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0208, code lost:
    
        if (r2.hasNext() == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x020a, code lost:
    
        l.C0349.m1793((l.C18090) r2.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0214, code lost:
    
        return r0;
     */
    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C17222 mo2780() {
        /*
            Method dump skipped, instructions count: 1014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13266.mo2780():l.ܿ۠ۢ");
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        if (c17222.m40526()) {
            if (m11542(c16560)) {
                c16560.m39041();
            }
            if (m11525(c165602)) {
                c165602.m39000((Collection) this.f39730.m28013());
                c165602.m39015();
            }
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C21818 c21818;
        AbstractC15440 abstractC15440 = this.f39728;
        if (abstractC15440 != null) {
            abstractC15440.mo23552();
        }
        if (!c17222.m40526() && (c21818 = this.f39729) != null) {
            C0349.m1793(c21818.m49176());
            this.f39729.m49174().mo23552();
        }
        C15528.m36596();
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector_res_0x7f120a28, C4925.m14327(R.string.MT_Protector_res_0x7f12052f).toLowerCase());
    }
}

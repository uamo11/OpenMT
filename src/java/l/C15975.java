package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import net.sf.sevenzipjbinding.IInArchive;

/* compiled from: A1YB */
/* renamed from: l.ܺܰܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C15975 extends AbstractC22366 {

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f49290 = 0;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public boolean f49296;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public boolean f49297;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public String f49298;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public boolean f49299;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public C17558 f49292 = new C17558();

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public C4586 f49293 = new C4586(false);

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public HashSet f49294 = new HashSet();

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public C16340 f49300 = new C16340();

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public HashSet f49291 = new HashSet();

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public final HashSet f49295 = new HashSet();

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        String[] m11558 = m11558("ARG_PATHS");
        return m11558.length == 1 ? C4925.m14306(R.string.MT_Protector_res_0x7f120a2b, C9523.m24404(m11558[0])) : C4925.m14306(R.string.MT_Protector_res_0x7f120a2a, m11531("extractDir"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f5 A[Catch: all -> 0x0234, TRY_LEAVE, TryCatch #3 {all -> 0x0234, blocks: (B:111:0x01de, B:112:0x01ee, B:114:0x01f5), top: B:110:0x01de, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0706 A[Catch: all -> 0x0754, TryCatch #2 {all -> 0x0754, blocks: (B:348:0x05bb, B:350:0x05cf, B:351:0x05fc, B:395:0x0614, B:397:0x0619, B:398:0x062a, B:353:0x0642, B:355:0x064d, B:365:0x06c9, B:367:0x0706, B:369:0x070a, B:370:0x070d, B:372:0x0712, B:373:0x0723, B:379:0x0685, B:381:0x068a, B:385:0x06a3, B:387:0x06b1, B:389:0x06b7, B:406:0x0757, B:407:0x075f, B:409:0x0765, B:412:0x0773), top: B:347:0x05bb }] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0704 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.io.InputStream] */
    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C17222 mo2780() {
        /*
            Method dump skipped, instructions count: 2061
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15975.mo2780():l.ܿ۠ۢ");
    }

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76954;
    }

    @Override // l.AbstractC3817
    /* renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector_res_0x7f120797);
        mo11520("...");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37773(C15975 c15975, AbstractC15440 abstractC15440, int i, IInArchive iInArchive, AbstractC15440 abstractC154402, String[] strArr, C9627[] c9627Arr) {
        boolean m14321 = C4925.m14321();
        ArrayList arrayList = new ArrayList();
        C0393 c0393 = new C0393();
        C18390.m42815(null, null, new C20916(c15975, c15975, iInArchive, abstractC154402, arrayList, c9627Arr, strArr, abstractC15440, m14321, c0393, i));
        if (c15975.mo1526()) {
            return;
        }
        c15975.m11536(R.string.MT_Protector_res_0x7f12037a);
        C19277 c19277 = new C19277(arrayList.size());
        c19277.m44459(new C19164(c15975));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4007 c4007 = (C4007) it.next();
            c19277.m44460(1);
            String str = strArr[c4007.m12080()];
            c15975.mo11520(str);
            AbstractC15440 m36526 = abstractC15440.m36526(str);
            c15975.m37774(m36526);
            if (c4007.m12084() >= 0 && m14321 && m36526.mo27912()) {
                m36526.mo18537(c4007.m12084());
            }
            c15975.m37777(str);
        }
        ArrayList arrayList2 = new ArrayList();
        for (C9627 c9627 : c9627Arr) {
            if (c9627 != null) {
                arrayList2.add(c9627);
            }
        }
        c15975.m37770(abstractC15440, i, arrayList2, c0393);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m37768(AbstractC15440 abstractC15440, String str, long j, long j2) {
        int mo13490;
        boolean m38488 = this.f49300.m38488(abstractC15440);
        C4586 c4586 = this.f49293;
        if (c4586.mo13492(m38488)) {
            mo13490 = c4586.mo13490(str, C22306.m50047(j, j2), C22306.m50048(abstractC15440), abstractC15440.mo29016(), m38488);
        } else {
            C22306 c22306 = C22306.f72317;
            mo13490 = c4586.mo13490(str, c22306, c22306, false, m38488);
        }
        if (c4586.mo1526()) {
            cancel();
        }
        return mo13490;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37770(AbstractC15440 abstractC15440, int i, ArrayList arrayList, C0393 c0393) {
        if (arrayList.isEmpty()) {
            return;
        }
        m11536(R.string.MT_Protector_res_0x7f12037a);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C9627 c9627 = (C9627) it.next();
            if (!mo1526()) {
                String str = c9627.f29181;
                String concat = str.concat("/");
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        AbstractC15440 m36526 = abstractC15440.m36526(str);
                        if (!m36526.mo23120()) {
                            mo11520(str);
                            m37774(m36526.m36536());
                            m36526.mo27934(c0393.m1889(str, c9627.f29182));
                            if (!c9627.f29180) {
                                int i2 = C14463.f44330;
                                C14463.m34554(m36526.mo23554(), true);
                            }
                            m37777(m36526.mo23554().substring(i));
                        }
                    } else {
                        C9627 c96272 = (C9627) it2.next();
                        if (c96272 == c9627 || !c96272.f29181.startsWith(concat)) {
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void m37777(String str) {
        int indexOf = str.indexOf(47);
        HashSet hashSet = this.f49294;
        if (indexOf == -1) {
            hashSet.add(str);
        } else {
            hashSet.add(str.substring(0, indexOf));
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        if (c17222.m40526()) {
            boolean z = this.f49297;
            HashSet hashSet = this.f49294;
            if (z) {
                if (m11525(c165602)) {
                    c165602.m39041();
                    c165602.m39000((Collection) hashSet);
                    c165602.m39015();
                    return;
                }
                return;
            }
            if (m11542(c16560)) {
                c16560.m39041();
                c16560.m39000((Collection) hashSet);
                c16560.m39015();
            }
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m37776(AbstractC15440 abstractC15440) {
        if (this.f49295.add(abstractC15440.mo23554())) {
            try {
                C17721.m41504(abstractC15440, EnumC16309.MODIFY_DIRECTORY);
                if (!abstractC15440.mo23120() && !abstractC15440.mo23546()) {
                    throw new IOException(C4153.m12552(abstractC15440, new StringBuilder("Cannot create extract directory: ")));
                }
            } catch (Exception e) {
                throw new IOException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m37774(AbstractC15440 abstractC15440) {
        if (abstractC15440 == null) {
            return;
        }
        String mo23554 = abstractC15440.mo23554();
        HashSet hashSet = this.f49291;
        if (hashSet.contains(mo23554)) {
            return;
        }
        if (!abstractC15440.mo23120()) {
            abstractC15440.mo23546();
        }
        hashSet.add(abstractC15440.mo23554());
        do {
            abstractC15440 = abstractC15440.m36536();
            if (abstractC15440 == null) {
                return;
            }
        } while (hashSet.add(abstractC15440.mo23554()));
    }
}

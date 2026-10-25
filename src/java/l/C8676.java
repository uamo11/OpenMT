package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: C12B */
/* renamed from: l.ۡۚܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C8676 extends AbstractC6138 {

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public String f26458;

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76965;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector_res_0x7f120a2d, m11517("saveAsPath"), m11556("title"));
    }

    @Override // l.AbstractC3817
    /* renamed from: ᩷ */
    public final void mo2782() {
        mo11546(m11556("title"));
        m11555(R.string.MT_Protector_res_0x7f1207a7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        r18 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        throw new java.io.IOException("Comparing encrypted files is not supported");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        r18 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
    
        r3 = r4.m42210().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a3, code lost:
    
        if (r3.hasNext() == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a5, code lost:
    
        r7 = (l.C3545) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00af, code lost:
    
        if (r7.isDirectory() != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b5, code lost:
    
        if (r7.m10808() != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ca, code lost:
    
        r17 = r3;
        r16 = r4;
        r13 = r15;
        r19 = r15;
        r15 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00da, code lost:
    
        r6.put(r7.getName(), new l.C20671(r7.getName(), r7.getSize(), new l.C23492(r7), r13, r7));
        r14 = r15;
        r4 = r16;
        r3 = r17;
        r15 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0111, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011a, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f0, code lost:
    
        throw new java.io.IOException(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f1, code lost:
    
        r16 = r4;
        r20.f26458 = l.C8198.m21696(r0.mo23554(), r2.mo23554(), r5, r6, new l.C9382(r20));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0106, code lost:
    
        r16.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0109, code lost:
    
        r18.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0110, code lost:
    
        return m11545();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0113, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0118, code lost:
    
        r16 = r4;
     */
    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C17222 mo2780() {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8676.mo2780():l.ܿ۠ۢ");
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        if (c17222.m40526()) {
            if (this.f26458.isEmpty()) {
                C21374.m48463(R.string.MT_Protector_res_0x7f1206ed);
                return;
            }
            String str = this.f26458;
            String m11556 = m11556("title");
            String m115562 = m11556("saveAsPath");
            int i = C7017.f21654;
            ActivityC14946.m35399(main, str, m11556, m115562, "syntax:INTERNAL:".concat("FolderComparison"));
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }
}

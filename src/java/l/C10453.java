package l;

import java.util.ArrayList;

/* compiled from: S776 */
/* renamed from: l.ۤᩳۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10453 implements InterfaceC13965 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f31382;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10753 f31383;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f31384;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C22447 f31385;

    public C10453() {
        C10753 c10753 = new C10753(true);
        this.f31383 = c10753;
        this.f31384 = new ArrayList();
        C22447 c22447 = new C22447();
        this.f31385 = c22447;
        c10753.setOutput(c22447);
        c10753.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", false);
    }

    @Override // l.InterfaceC13965
    /* renamed from: ۧ */
    public final void mo1294(String str) {
        this.f31382++;
        this.f31384.add(str);
        C10753 c10753 = this.f31383;
        c10753.startTag(null, str);
        if (this.f31382 == 1) {
            c10753.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        }
    }

    @Override // l.InterfaceC13965
    /* renamed from: ֫ */
    public final void mo1290(String str) {
        this.f31383.endTag(null, str);
        C18473.m42953(this.f31384, 1);
        this.f31382--;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r0 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        r8 = l.C13979.m33450(r0.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012a, code lost:
    
        if (r0 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0113, code lost:
    
        if (r2.equals("fraction") == false) goto L85;
     */
    @Override // l.InterfaceC13965
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1291(java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10453.mo1291(java.lang.String, java.lang.String):void");
    }

    @Override // l.InterfaceC13965
    public final void text(String str) {
        this.f31383.text(str);
    }
}

package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: J4L7 */
/* renamed from: l.ۗ۫ܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3236 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6058 f10181;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f10182;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f10183;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f10184;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C22933 f10185;

    public C3236(C6058 c6058, int[] iArr, Runnable runnable) {
        this.f10181 = c6058;
        this.f10182 = iArr;
        this.f10184 = runnable;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        Main main;
        main = this.f10181.f18567;
        C22933 c22933 = new C22933(main);
        c22933.m51049(R.string.MT_Protector_res_0x7f120528);
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        this.f10185 = c22933;
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C6058 c6058;
        C16560 c16560;
        InterfaceC17889 interfaceC17889;
        C13113 c13113;
        C10292[] c10292Arr;
        int[] iArr = this.f10182;
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i = 0;
        while (true) {
            c6058 = this.f10181;
            if (i >= length) {
                break;
            }
            int i2 = iArr[i];
            c10292Arr = c6058.f18565;
            arrayList.add((InterfaceC15334) c10292Arr[i2].f31002.get());
            i++;
        }
        c16560 = c6058.f18563;
        AbstractC13921 mo6020 = c16560.m39044().mo6020();
        C5458 c5458 = new C5458(arrayList);
        try {
            interfaceC17889 = c6058.f18561;
            mo6020.mo7641(null, interfaceC17889, new C4647(this, c5458));
            c5458.close();
            if (this.f10183 || this.f10185.m51053()) {
                return;
            }
            this.f10185.m51045(100);
            c13113 = c6058.f18562;
            c13113.m31779(arrayList, iArr);
        } catch (Throwable th) {
            try {
                c5458.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        if (this.f10183 || this.f10185.m51053()) {
            return;
        }
        this.f10184.run();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        Main main;
        main = this.f10181.f18567;
        main.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        this.f10185.m51051();
        C21374.m48465();
    }
}

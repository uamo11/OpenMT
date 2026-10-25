package l;

import bin.mt.plus.R;
import java.io.BufferedOutputStream;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: I1KV */
/* renamed from: l.᩵ܰ᩷, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19512 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f63053;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC21628 f63054;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f63055;

    public C19512(ViewOnClickListenerC21628 viewOnClickListenerC21628, String str, HashSet hashSet) {
        this.f63054 = viewOnClickListenerC21628;
        this.f63055 = str;
        this.f63053 = hashSet;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267((AbstractActivityC3346) this.f63054.requireActivity(), R.string.MT_Protector_res_0x7f1208d2);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C19452 c19452;
        C8918 c8918 = new C8918(this.f63055);
        try {
            C13533 c13533 = new C13533(new BufferedOutputStream(c8918.m23007()));
            Iterator it = this.f63053.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                c8918.m23012(str + ".xml");
                c19452 = this.f63054.f69432;
                c13533.write(c19452.m44856(str));
                c13533.flush();
            }
            c8918.close();
        } catch (Throwable th) {
            try {
                c8918.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C21374.m48457(R.string.MT_Protector_res_0x7f1208d1);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C3764 c3764;
        c3764 = this.f63054.f69427;
        c3764.m11384((Throwable) exc);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}

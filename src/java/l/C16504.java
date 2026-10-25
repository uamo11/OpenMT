package l;

import android.os.SystemClock;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: M1KQ */
/* renamed from: l.ܽ۟᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16504 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f50718;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f50719;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f50720;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19328 f50721;

    public C16504(C19328 c19328, ActivityC17169 activityC17169, int i) {
        this.f50721 = c19328;
        this.f50718 = activityC17169;
        this.f50720 = i;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f50718, this.f50720);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C19328 c19328;
        C19452 c19452;
        C19452 c194522;
        while (true) {
            c19328 = this.f50721;
            c19452 = c19328.f60766;
            if (c19452 != null) {
                break;
            } else {
                SystemClock.sleep(10L);
            }
        }
        c194522 = c19328.f60766;
        Collection m44857 = c194522.m44857();
        this.f50719 = new ArrayList(m44857.size());
        Iterator it = m44857.iterator();
        while (it.hasNext()) {
            this.f50719.add(new C23560((String) it.next()));
        }
        c19328.f60760 = false;
        c19328.f60764 = false;
        c19328.m44520(this.f50719);
        C19328.m44529(c19328);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C15798 c15798;
        ArrayList arrayList = this.f50719;
        C19328 c19328 = this.f50721;
        c19328.f60758 = arrayList;
        c15798 = c19328.f60765;
        c15798.notifyDataSetChanged();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C3764 c3764;
        List list;
        C15798 c15798;
        C19452 c19452;
        C19328 c19328 = this.f50721;
        c3764 = c19328.f60767;
        c3764.m11384((Throwable) exc);
        boolean z = exc instanceof C5672;
        if (z) {
            C5672 c5672 = (C5672) exc;
            C19287 m44466 = C19287.m44466(c5672.f17514, c5672.f17513);
            m44466.f60678 = false;
            this.f50718.m40354(c5672.m15979(), m44466);
            c19452 = c19328.f60766;
            c19452.m44818(c5672.m15979());
        }
        if (z || (exc instanceof C1580)) {
            C21374.m48457(R.string.MT_Protector_res_0x7f1201cf);
        }
        list = c19328.f60758;
        if (list == null) {
            c19328.f60758 = Collections.EMPTY_LIST;
            c19328.f60760 = false;
            c19328.f60764 = false;
            c15798 = c19328.f60765;
            c15798.notifyDataSetChanged();
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}

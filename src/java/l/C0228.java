package l;

import android.content.DialogInterface;
import android.util.Pair;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: 6B6V */
/* renamed from: l.֡ۛܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0228 extends AbstractC7548 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f1488;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f1489;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5168 f1491;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f1492;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22933 f1493;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f1494;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f1496;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f1490 = new ArrayList();

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public HashSet f1495 = new HashSet();

    public C0228(C5168 c5168, C16560 c16560, List list, Runnable runnable) {
        AbstractC15440 abstractC15440;
        this.f1491 = c5168;
        this.f1489 = c16560;
        this.f1488 = list;
        this.f1494 = runnable;
        abstractC15440 = c5168.f51870;
        this.f1496 = abstractC15440.m36526(C4303.m12893(c5168.m39741()));
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C22933 c22933 = new C22933(this.f1489.m39056());
        c22933.mo49542((Runnable) null);
        c22933.m51049(R.string.MT_Protector_res_0x7f12037a);
        c22933.m51040("...");
        c22933.mo49547();
        this.f1493 = c22933;
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C5168 c5168;
        C2346 c2346;
        C2346 c23462;
        AbstractC15440 abstractC15440 = this.f1496;
        if (abstractC15440.mo23119()) {
            abstractC15440.mo23552();
        }
        abstractC15440.m36508();
        List<C10211> list = this.f1488;
        C4488 c4488 = new C4488(list.size());
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c5168 = this.f1491;
            if (!hasNext) {
                break;
            }
            C10211 c10211 = (C10211) it.next();
            String m25626 = c10211.m25626();
            String m25625 = c10211.m25625();
            boolean m25621 = c10211.m25621();
            String str = m25625.substring(1) + m25626;
            c2346 = c5168.f16173;
            C4007 entry = c2346.getEntry(str);
            if (entry == null) {
                if (m25621) {
                    c23462 = c5168.f16173;
                    entry = c23462.getEntry(m25626);
                } else {
                    entry = null;
                }
            }
            if (entry == null) {
                c10211.m25619();
            } else {
                c4488.mo2318(entry.m12080(), Pair.create(c10211, entry));
            }
        }
        C18390.m42816(c4488.keySet(), new C19280(this, c5168, this.f1493, c4488));
        if (this.f1493.m51053()) {
            return;
        }
        for (C10211 c102112 : list) {
            if (c102112.m25627() && c102112.m25622() == null) {
                throw new IOException("Extract file failed: " + c102112.m25626());
            }
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        if (this.f1493.m51053()) {
            this.f1496.mo23552();
        } else {
            this.f1492 = true;
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f1496.mo23552();
        this.f1489.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        this.f1493.m51051();
        C15528.m36596();
        if (!this.f1492) {
            return;
        }
        C5168 c5168 = this.f1491;
        Iterator it = c5168.m39739().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ArrayList arrayList = this.f1490;
            if (hasNext) {
                C5977 c5977 = (C5977) it.next();
                if (!this.f1495.contains(c5977.m16770())) {
                    arrayList.add(c5977);
                }
            } else {
                c5168.m39736((List) arrayList);
                try {
                    this.f1494.run();
                    return;
                } catch (Throwable th) {
                    this.f1489.m39056().m10223(th, (DialogInterface.OnDismissListener) null);
                    return;
                }
            }
        }
    }
}

package l;

import android.os.SystemClock;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: M1KQ */
/* renamed from: l.ۜۜۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6598 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15063 f20319;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f20320;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20321;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C22933 f20322;

    public C6598(C15063 c15063, int i) {
        this.f20319 = c15063;
        this.f20321 = i;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        List list;
        C0247 c0247;
        C15063 c15063 = this.f20319;
        C22933 c22933 = new C22933((AbstractActivityC3346) c15063.requireActivity());
        c22933.m51049(this.f20321);
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        this.f20322 = c22933;
        list = c15063.f45998;
        if (list != null) {
            c15063.f45998 = null;
            c0247 = c15063.f45999;
            c0247.notifyDataSetChanged();
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C15063 c15063;
        C12366 c12366;
        C12366 c123662;
        C12366 c123663;
        while (true) {
            c15063 = this.f20319;
            c12366 = c15063.f45992;
            if (c12366 != null) {
                break;
            } else {
                SystemClock.sleep(10L);
            }
        }
        c123662 = c15063.f45992;
        c123662.m30051();
        c123663 = c15063.f45992;
        final C23531 c23531 = new C23531(this);
        c123663.getClass();
        final Set newSetFromMap = Collections.newSetFromMap(new ConcurrentMapC10942());
        ArrayList m30049 = c123663.m30049();
        final C19277 c19277 = new C19277(m30049.size());
        c19277.m44459(c23531);
        ExecutorService executorService = C1802.f6211;
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(C17615.f53826);
        Iterator it = m30049.iterator();
        while (it.hasNext()) {
            final InterfaceC13508 interfaceC13508 = (InterfaceC13508) it.next();
            newFixedThreadPool.submit(new Runnable() { // from class: l.᩶ۧۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C12366.m30007(InterfaceC8693.this, c19277, interfaceC13508, newSetFromMap);
                }
            });
        }
        C1802.m5992(newFixedThreadPool);
        C4925.m14315(new Runnable() { // from class: l.ܿۜۢ
            @Override // java.lang.Runnable
            public final void run() {
                C6598 c6598 = C6598.this;
                c6598.f20322.m51048();
                c6598.f20322.m51049(R.string.MT_Protector_res_0x7f1207a7);
                c6598.f20322.m51041(true);
            }
        });
        ArrayList arrayList = new ArrayList(newSetFromMap.size());
        this.f20320 = arrayList;
        Iterator it2 = newSetFromMap.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C15769((String) it2.next()));
        }
        Collections.sort(arrayList, new C14358());
        c15063.f45994 = false;
        c15063.f46000 = false;
        c15063.m35604(arrayList);
        C15063.m35612(c15063);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C0247 c0247;
        ArrayList arrayList = this.f20320;
        C15063 c15063 = this.f20319;
        c15063.f45998 = arrayList;
        c0247 = c15063.f45999;
        c0247.notifyDataSetChanged();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C3764 c3764;
        c3764 = this.f20319.f46001;
        c3764.m11384((Throwable) exc);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        C12366 c12366;
        c12366 = this.f20319.f45992;
        c12366.m30061();
        this.f20322.m51051();
    }
}

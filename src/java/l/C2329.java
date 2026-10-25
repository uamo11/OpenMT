package l;

import android.view.View;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: LAQJ */
/* renamed from: l.ۖۚܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2329 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C14197 f7467;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f7468;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10671 f7469;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22789 f7470 = new C22789();

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C22933 f7471;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C12906 f7472;

    public C2329(C10671 c10671, AbstractC15440 abstractC15440) {
        this.f7469 = c10671;
        this.f7468 = abstractC15440;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C10671 c10671 = this.f7469;
        C22933 c22933 = new C22933(c10671.f32087);
        c22933.m51049(R.string.MT_Protector_res_0x7f120797);
        c22933.m51040(c10671.getFileName());
        c22933.mo49541(new View.OnClickListener() { // from class: l.ۡۚܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2329.this.f7471.m51051();
            }
        });
        c22933.mo49547();
        this.f7471 = c22933;
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        String str;
        String str2;
        ArrayList arrayList;
        C4021 m43525;
        C22789 c22789 = this.f7470;
        C10671 c10671 = this.f7469;
        C20549.m47082(c10671.f32088, c10671.f32089);
        boolean z = false;
        String m31436 = C12925.m31436(false);
        if (m31436 == null) {
            m31436 = "su";
        }
        C12906 c12906 = new C12906(m31436, false);
        this.f7472 = c12906;
        str = c10671.f32090;
        C11356.m28104(c12906, "0", str);
        AbstractC15440 abstractC15440 = this.f7468;
        abstractC15440.m36508();
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(C17615.f53826);
        try {
            C18090 c18090 = new C18090(c10671.f32088);
            try {
                c22789.m50867(c18090, c10671.f32089);
                ArrayList arrayList2 = c22789.f73580;
                ArrayList arrayList3 = c22789.f73578;
                this.f7471.m51049(R.string.MT_Protector_res_0x7f1204bd);
                C19277 c19277 = new C19277(c22789.f73579);
                c19277.m44459(new InterfaceC2343() { // from class: l.ܺۚܿ
                    @Override // l.InterfaceC2343
                    /* renamed from: ֫ */
                    public final void mo6264(int i) {
                        C2329 c2329 = C2329.this;
                        c2329.f7471.m51045(i);
                        if (i == 100) {
                            c2329.f7471.m51041(true);
                        }
                    }
                });
                this.f7467 = new C14197(c18090.m42196(), c19277);
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    C3545 c3545 = (C3545) it.next();
                    newFixedThreadPool.submit(new RunnableC23370(this.f7467, c3545, abstractC15440.m36526(C16999.m39860(c3545.getName(), z)), true));
                    z = false;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("pm install-create -r -d ");
                str2 = c10671.f32090;
                sb.append(C11356.m28107(str2));
                String m7595 = m7595(sb.toString());
                if (!m7595.contains("Success")) {
                    throw new Exception(m7595);
                }
                Matcher matcher = Pattern.compile("\\[(\\d+)]").matcher(m7595);
                if (!matcher.find()) {
                    throw new Exception(m7595);
                }
                int parseInt = Integer.parseInt(matcher.group(1));
                int i = 0;
                while (i < arrayList3.size()) {
                    try {
                        RunnableC23370 runnableC23370 = (RunnableC23370) this.f7467.f42857.poll(500L, TimeUnit.MILLISECONDS);
                        if (runnableC23370 != null) {
                            AbstractC15440 abstractC154402 = runnableC23370.f75070;
                            String m23755 = C9255.m23755(abstractC154402.mo23554());
                            long mo23127 = abstractC154402.mo23127();
                            String name = abstractC154402.getName();
                            if (c22789.f73581 == null && (m43525 = C18838.m43525(abstractC154402)) != null) {
                                c22789.f73581 = m43525.m12094();
                            }
                            StringBuilder sb2 = new StringBuilder();
                            arrayList = arrayList3;
                            sb2.append("cat ");
                            sb2.append(m23755);
                            sb2.append(" | pm install-write -S ");
                            sb2.append(mo23127);
                            sb2.append(" ");
                            sb2.append(parseInt);
                            sb2.append(" ");
                            sb2.append(name);
                            String m75952 = m7595(sb2.toString());
                            abstractC154402.mo23552();
                            if (!m75952.contains("Success")) {
                                throw new Exception(m75952);
                            }
                            i++;
                        } else {
                            arrayList = arrayList3;
                            C14197 c14197 = this.f7467;
                            if (c14197.f42854) {
                                throw new CancellationException();
                            }
                            c14197.m33866();
                        }
                        arrayList3 = arrayList;
                    } catch (Exception e) {
                        m7595("pm install-abandon " + parseInt);
                        throw e;
                    }
                }
                this.f7467.m33866();
                C20549.m47078(m7595("pm install-commit " + parseInt));
                if (!arrayList2.isEmpty()) {
                    this.f7471.m51041(false);
                    C14197 c141972 = this.f7467;
                    C19277 c192772 = new C19277(c22789.f73582);
                    C22933 c22933 = this.f7471;
                    C11003.requireNonNull(c22933);
                    c192772.m44459(new C23595(c22933));
                    c141972.f42855 = c192772;
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        C3545 c35452 = (C3545) it2.next();
                        newFixedThreadPool.submit(new RunnableC23370(this.f7467, c35452, C16293.f50120.m36526(C16999.m39860(c35452.getName(), false)), false));
                    }
                    C1802.m5992(newFixedThreadPool);
                    this.f7467.m33866();
                }
                c18090.close();
            } finally {
            }
        } finally {
            if (!newFixedThreadPool.isShutdown()) {
                C14197 c141973 = this.f7467;
                if (c141973 != null) {
                    c141973.f42854 = true;
                }
                newFixedThreadPool.shutdownNow();
                newFixedThreadPool.awaitTermination(1L, TimeUnit.DAYS);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m7595(String str) {
        C12906 c12906 = this.f7472;
        c12906.getClass();
        return c12906.mo25342(0L, str).m29682();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        if (this.f7471.m51053()) {
            return;
        }
        C10671 c10671 = this.f7469;
        C20549.m47079(c10671.f32087, c10671.getFileName(), this.f7470.f73581);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (exc instanceof CancellationException) {
            return;
        }
        this.f7469.m26776(exc);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        this.f7471.m51051();
        this.f7468.mo23552();
        C12906 c12906 = this.f7472;
        if (c12906 != null) {
            c12906.close();
        }
    }
}

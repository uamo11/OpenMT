package l;

import android.os.Bundle;
import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: M1KQ */
/* renamed from: l.᩵۟᩷, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C19328 extends ComponentCallbacksC9205 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int[] f60757;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f60758;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f60759;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f60760;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C13132 f60761;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f60762;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f60763;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f60764;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15798 f60765;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C19452 f60766;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C3764 f60767;

    public C19328() {
        super(R.layout.MT_Protector_res_0x7f0d01e2);
        this.f60759 = true;
    }

    @Override // l.ComponentCallbacksC9205
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3764 c3764 = (C3764) new C4741(requireActivity()).m13885(C3764.class);
        this.f60767 = c3764;
        c3764.m11411().m1668(this, new InterfaceC1008() { // from class: l.֫۟᩷
            @Override // l.InterfaceC1008
            /* renamed from: ֫ */
            public final void mo1617(Object obj) {
                C19328.m44526(C19328.this, (C19452) obj);
            }
        });
        this.f60765 = new C15798(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44526(C19328 c19328, C19452 c19452) {
        c19328.f60766 = c19452;
        c19328.f60767.m11391(c19328, new C6367(c19328));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44521(C19328 c19328) {
        if (c19328.f60759) {
            c19328.f60759 = false;
            c19328.f60764 = false;
            c19328.f60760 = false;
            try {
                AbstractC15440 m27330 = c19328.f60766.m44854().m27330("strings");
                if (m27330.mo23120()) {
                    byte[] m36506 = m27330.m36506();
                    int i = C3878.f12396;
                    C12951 c12951 = new C12951(C3878.m11708(m36506, m36506.length));
                    if (c12951.readInt() == 830747697) {
                        int readInt = c12951.readInt();
                        c19328.f60758 = new ArrayList(readInt);
                        for (int i2 = 0; i2 < readInt; i2++) {
                            if (c12951.m31498()) {
                                c19328.f60764 = true;
                                c19328.f60758.add(new C23560(c12951.m31504(), c12951.m31504()));
                            } else {
                                c19328.f60758.add(new C23560(c12951.m31504()));
                            }
                        }
                        c19328.m44537();
                        AbstractC15440 m273302 = c19328.f60766.m44854().m27330("strings_changed");
                        if (c19328.f60764) {
                            m273302.getClass();
                            m273302.m36503(new byte[]{1}, 0, 1);
                        } else {
                            m273302.mo23552();
                        }
                        c19328.f60765.notifyDataSetChanged();
                        return;
                    }
                }
            } catch (Throwable th) {
                C3764 c3764 = c19328.f60767;
                if (c3764 != null) {
                    c3764.m11384(th);
                }
            }
            c19328.m44544(R.string.MT_Protector_res_0x7f120528);
        }
    }

    @Override // l.ComponentCallbacksC9205
    public final void onViewCreated(View view, Bundle bundle) {
        C13132 c13132 = (C13132) view.findViewById(R.id.MT_Protector_res_0x7f0a0486);
        this.f60761 = c13132;
        c13132.setTag("RecyclerView3");
        this.f60761.setAdapter(this.f60765);
        this.f60767.m11394(getViewLifecycleOwner(), new C7516(0, this));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44534(C19328 c19328) {
        c19328.f60761.scrollToPosition(0);
        c19328.f60765.m37255();
    }

    @Override // l.ComponentCallbacksC9205
    public final void onDestroyView() {
        super.onDestroyView();
        this.f60761.setAdapter(null);
        this.f60761 = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44544(final int i) {
        final ActivityC17169 activityC17169 = (ActivityC17169) requireActivity();
        Runnable runnable = new Runnable() { // from class: l.ۧ۟᩷
            @Override // java.lang.Runnable
            public final void run() {
                new C16504(C19328.this, activityC17169, i).m20274();
            }
        };
        if (activityC17169.m40366()) {
            if (this.f60758 == null) {
                this.f60758 = Collections.EMPTY_LIST;
                this.f60760 = false;
                this.f60764 = false;
                this.f60765.notifyDataSetChanged();
            }
            activityC17169.m40363(runnable);
            return;
        }
        runnable.run();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m44547() {
        m44520(this.f60758);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m44520(List list) {
        String str;
        String str2;
        C10130 m43030 = C18515.m43030(830747697);
        m43030.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C23560 c23560 = (C23560) it.next();
            m43030.m25425(c23560.f75636);
            str = c23560.f75635;
            m43030.m25423((CharSequence) str);
            if (c23560.f75636) {
                str2 = c23560.f75634;
                m43030.m25423((CharSequence) str2);
            }
        }
        AbstractC15440 m27330 = this.f60766.m44854().m27330("strings");
        try {
            byte[] m25444 = m43030.m25444();
            int i = C3878.f12396;
            m27330.m36502(C3878.m11707(m25444, m25444.length));
        } catch (IOException e) {
            C3764 c3764 = this.f60767;
            if (c3764 != null) {
                c3764.m11384((Throwable) e);
            }
        }
        AbstractC15440 m273302 = this.f60766.m44854().m27330("strings_changed");
        if (!this.f60764) {
            m273302.mo23552();
            return;
        }
        try {
            m273302.getClass();
            m273302.m36503(new byte[]{1}, 0, 1);
        } catch (IOException e2) {
            C3764 c37642 = this.f60767;
            if (c37642 != null) {
                c37642.m11384((Throwable) e2);
            }
        }
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m44529(C19328 c19328) {
        AbstractC15440 m27330 = c19328.f60766.m44854().m27330("stringsFilter");
        if (!c19328.f60760) {
            m27330.mo23552();
            return;
        }
        C10130 m43030 = C18515.m43030(1143374470);
        m43030.m25423((CharSequence) c19328.f60762);
        m43030.writeInt(c19328.f60763);
        for (int i = 0; i < c19328.f60763; i++) {
            m43030.writeInt(c19328.f60757[i]);
        }
        try {
            m27330.m36496(m43030);
        } catch (IOException e) {
            if (c19328.f60767 != null) {
                c19328.f60767.m11384((Throwable) e);
            }
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m44537() {
        AbstractC15440 m27330 = this.f60766.m44854().m27330("stringsFilter");
        if (m27330.mo23120()) {
            C12951 m36528 = m27330.m36528();
            if (m36528.readInt() == 1143374470) {
                this.f60760 = true;
                this.f60762 = m36528.m31504();
                int readInt = m36528.readInt();
                this.f60763 = readInt;
                int[] iArr = this.f60757;
                if (iArr == null || iArr.length < readInt) {
                    this.f60757 = new int[readInt];
                }
                for (int i = 0; i < this.f60763; i++) {
                    this.f60757[i] = m36528.readInt();
                }
            }
        }
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m44530(C19328 c19328) {
        new C17916(c19328, (AbstractActivityC3346) c19328.requireActivity(), c19328.f60760, C2353.m7663()).m40707();
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static void m44538(C19328 c19328) {
        String str;
        String str2;
        ActivityC17169 activityC17169 = (ActivityC17169) c19328.requireActivity();
        C22933 c22933 = new C22933(activityC17169);
        c22933.m51049(R.string.MT_Protector_res_0x7f1207a7);
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        final C14387 c14387 = new C14387(c19328, c22933, activityC17169);
        final C2727 c2727 = new C2727();
        for (C23560 c23560 : c19328.f60758) {
            if (c23560.f75636) {
                str = c23560.f75635;
                str2 = c23560.f75634;
                c2727.put(str, str2);
            }
        }
        final C19452 c19452 = c19328.f60766;
        new Thread(new Runnable() { // from class: l.ܰۨ᩷
            @Override // java.lang.Runnable
            public final void run() {
                final InterfaceC21403 interfaceC21403 = c14387;
                C19452 c194522 = C19452.this;
                final C9200 c9200 = new C9200(c194522, true);
                try {
                    c9200.f27877 = c194522.m44833();
                    final C22108 c22108 = new C22108();
                    final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    c194522.m44822(concurrentLinkedQueue, "", true, (Set) null);
                    interfaceC21403.mo22515(0);
                    final C19277 c19277 = new C19277(concurrentLinkedQueue.size());
                    c19277.m44459(new C21847(interfaceC21403));
                    final C2727 c27272 = c2727;
                    Runnable runnable = new Runnable() { // from class: l.ۨۨ᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC1438 interfaceC1438;
                            while (true) {
                                ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                                if (concurrentLinkedQueue2.isEmpty() || (interfaceC1438 = (InterfaceC1438) concurrentLinkedQueue2.poll()) == null || interfaceC21403.mo22513()) {
                                    return;
                                }
                                c19277.m44460(1);
                                String mo4946 = interfaceC1438.mo4946();
                                List<C24032> m23633 = c9200.m23633(interfaceC1438.getPath());
                                String str3 = null;
                                if (m23633 != null) {
                                    StringBuilder sb = new StringBuilder(mo4946.length());
                                    int i = 0;
                                    int i2 = 0;
                                    for (C24032 c24032 : m23633) {
                                        if (c24032.f77861 == 1) {
                                            String str4 = (String) c27272.getOrDefault(c24032.f77864, null);
                                            if (str4 != null) {
                                                sb.append((CharSequence) mo4946, i2, c24032.f77862);
                                                sb.append(C10753.m26948(str4));
                                                i2 = c24032.f77859;
                                                i++;
                                            }
                                        }
                                    }
                                    if (i != 0) {
                                        c22108.m49685(i);
                                        if (i2 < mo4946.length()) {
                                            sb.append((CharSequence) mo4946, i2, mo4946.length());
                                        }
                                        str3 = sb.toString();
                                    }
                                }
                                if (str3 != null) {
                                    interfaceC1438.mo4947(str3);
                                }
                            }
                        }
                    };
                    c194522.m44830(false);
                    C3058.m9358((int) (C17615.f53826 * 0.66f), runnable);
                    c194522.m44830(true);
                    C4925.m14315(new RunnableC2180(3, interfaceC21403, c22108));
                } catch (Exception e) {
                    C4925.m14315(new Runnable() { // from class: l.ۛۨ᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            Exception exc = e;
                            InterfaceC21403 interfaceC214032 = interfaceC21403;
                            C9200.this.m23634(interfaceC214032.mo22516(), exc);
                            interfaceC214032.mo22514();
                        }
                    });
                }
            }
        }).start();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC19902 m44545() {
        return this.f60765;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m44546() {
        return this.f60758;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m44548() {
        boolean z;
        Iterator it = this.f60758.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((C23560) it.next()).f75636) {
                z = true;
                break;
            }
        }
        this.f60764 = z;
    }
}

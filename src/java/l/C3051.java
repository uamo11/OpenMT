package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.util.function.Consumer;
import net.sf.sevenzipjbinding.IInArchive;

/* compiled from: NB79 */
/* renamed from: l.ۗۛܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3051 extends C3695 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f9595;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f9596;

    public C3051(final C2346 c2346) {
        ConcurrentMapC10942 concurrentMapC10942 = new ConcurrentMapC10942();
        this.f9595 = concurrentMapC10942;
        C5378.stream(c2346.m7657()).map(new C7990()).filter(new C15044()).forEach(new Consumer() { // from class: l.᩸ۛܳ
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void n(Object obj) {
                C3051.m9345(C3051.this, (C4462) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }
        });
        if (concurrentMapC10942.isEmpty()) {
            return;
        }
        C1802.f6208.submit(new Runnable() { // from class: l.᩹ۛܳ
            @Override // java.lang.Runnable
            public final void run() {
                C3051.m9344(C3051.this, c2346);
            }
        });
    }

    @Override // l.C3695
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo9349(InterfaceC17889 interfaceC17889, int i) {
        return C12347.m29964(((C10231) interfaceC17889).m25859());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9345(C3051 c3051, C4462 c4462) {
        int i;
        ConcurrentMapC10942 concurrentMapC10942 = c3051.f9595;
        i = c4462.f14226;
        concurrentMapC10942.put(Integer.valueOf(i), c4462);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9344(C3051 c3051, C2346 c2346) {
        String str;
        for (int i : C5378.stream(c3051.f9595.keySet()).mapToInt(new C12473()).toArray()) {
            C4462 c4462 = (C4462) c3051.f9595.get(Integer.valueOf(i));
            if (c4462 != null) {
                str = c4462.f14224;
                if (C3695.m11252(str)) {
                    c3051.f9595.remove(Integer.valueOf(i));
                    synchronized (c4462) {
                        c4462.notifyAll();
                    }
                } else {
                    continue;
                }
            }
        }
        if (c3051.f9595.isEmpty()) {
            return;
        }
        int[] array = C5378.stream(c3051.f9595.keySet()).mapToInt(new C12473()).toArray();
        IInArchive iInArchive = null;
        try {
            iInArchive = c2346.m7658();
            iInArchive.extract(array, false, new C19985(c3051, iInArchive));
        } catch (IOException unused) {
        } catch (Throwable th) {
            c3051.f9595.clear();
            C0349.m1793(iInArchive);
            throw th;
        }
        c3051.f9595.clear();
        C0349.m1793(iInArchive);
    }

    @Override // l.C3695, l.InterfaceC10834
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo9351(InterfaceC17889 interfaceC17889) {
        if (interfaceC17889.mo36969()) {
            return C12347.m29965(((C10231) interfaceC17889).m25859());
        }
        return 0;
    }

    @Override // l.C3695, l.InterfaceC10834
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11813 mo9350(AbstractC16891 abstractC16891, InterfaceC17889 interfaceC17889, int i) {
        C4007 m25859 = ((C10231) interfaceC17889).m25859();
        int m12080 = m25859.m12080();
        C4462 c4462 = (C4462) this.f9595.get(Integer.valueOf(m12080));
        if (c4462 != null) {
            do {
                synchronized (c4462) {
                    try {
                        c4462.wait(1000L);
                    } catch (InterruptedException unused) {
                    }
                }
            } while (this.f9595.containsKey(Integer.valueOf(m12080)));
        }
        String m29964 = C12347.m29964(m25859);
        if (i == 1) {
            return m9343(m29964, C19883.f64187, C19883.f64215);
        }
        if (i == 2) {
            return m9343(m29964, C19883.f64187, C19883.f64215);
        }
        if (i == 3) {
            C19883 c19883 = C19883.f64196;
            C11813 m9343 = m9343(m29964, c19883, c19883);
            if (m9343 != c19883.f64250) {
                interfaceC17889.mo36975(R.id.MT_Protector_res_0x7f0a02a4, Boolean.TRUE);
            }
            return m9343;
        }
        throw new RuntimeException();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11813 m9343(String str, C19883 c19883, C19883 c198832) {
        if (C3695.m11253(str)) {
            return c198832.f64250;
        }
        C11813 m28875 = C11813.m28875(C13110.m31773(str));
        return m28875 == null ? c19883.f64250 : m28875;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m9352() {
        this.f9596 = true;
    }
}

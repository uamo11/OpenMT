package l;

import android.os.SystemClock;
import java.util.ArrayList;

/* compiled from: RB4Y */
/* renamed from: l.۟ۧ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7420 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f22797 = new ThreadLocal();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C13769 f22801;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3432 f22800 = new C3432();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f22798 = new ArrayList();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10243 f22799 = new C10243(this);

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f22802 = false;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC11654 m19943() {
        if (this.f22801 == null) {
            this.f22801 = new C13769(this.f22799);
        }
        return this.f22801;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19945(AbstractC1234 abstractC1234) {
        this.f22800.remove(abstractC1234);
        ArrayList arrayList = this.f22798;
        int indexOf = arrayList.indexOf(abstractC1234);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
            this.f22802 = true;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19944(long j) {
        ArrayList arrayList;
        long uptimeMillis = SystemClock.uptimeMillis();
        int i = 0;
        while (true) {
            arrayList = this.f22798;
            if (i >= arrayList.size()) {
                break;
            }
            InterfaceC6009 interfaceC6009 = (InterfaceC6009) arrayList.get(i);
            if (interfaceC6009 != null) {
                C3432 c3432 = this.f22800;
                Long l2 = (Long) c3432.getOrDefault(interfaceC6009, null);
                if (l2 != null) {
                    if (l2.longValue() < uptimeMillis) {
                        c3432.remove(interfaceC6009);
                    }
                }
                interfaceC6009.mo4071(j);
            }
            i++;
        }
        if (!this.f22802) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            } else {
                this.f22802 = false;
                return;
            }
        }
    }
}

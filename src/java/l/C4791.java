package l;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: 38N3 */
/* renamed from: l.ۙܿۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4791 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f15188 = new CopyOnWriteArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13976(InterfaceC3380 interfaceC3380) {
        InterfaceC3380 interfaceC33802;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f15188;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C20314 c20314 = (C20314) it.next();
            interfaceC33802 = c20314.f65606;
            if (interfaceC33802 == interfaceC3380) {
                c20314.m46595();
                copyOnWriteArrayList.remove(c20314);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13974(final long j, final int i, final long j2) {
        boolean z;
        Handler handler;
        Iterator it = this.f15188.iterator();
        while (it.hasNext()) {
            final C20314 c20314 = (C20314) it.next();
            z = c20314.f65607;
            if (!z) {
                handler = c20314.f65605;
                handler.post(new Runnable() { // from class: l.᩹ܿۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC3380 interfaceC3380;
                        long j3 = j2;
                        interfaceC3380 = C20314.this.f65606;
                        interfaceC3380.mo10312(j, i, j3);
                    }
                });
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13975(Handler handler, InterfaceC3380 interfaceC3380) {
        interfaceC3380.getClass();
        m13976(interfaceC3380);
        this.f15188.add(new C20314(handler, interfaceC3380));
    }
}

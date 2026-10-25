package l;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: 38V0 */
/* renamed from: l.ܶۛ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15036 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f45820;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15894 f45821;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f45822;

    public C15036() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public C15036(CopyOnWriteArrayList copyOnWriteArrayList, int i, C15894 c15894) {
        this.f45820 = copyOnWriteArrayList;
        this.f45822 = i;
        this.f45821 = c15894;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15036 m35560(int i, C15894 c15894) {
        return new C15036(this.f45820, i, c15894);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35565(InterfaceC21388 interfaceC21388) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f45820;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C7982 c7982 = (C7982) it.next();
            if (c7982.f24653 == interfaceC21388) {
                copyOnWriteArrayList.remove(c7982);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35563(Handler handler, InterfaceC21388 interfaceC21388) {
        handler.getClass();
        C7982 c7982 = new C7982();
        c7982.f24652 = handler;
        c7982.f24653 = interfaceC21388;
        this.f45820.add(c7982);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.᩸ۛ֫] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35562(final int i) {
        Iterator it = this.f45820.iterator();
        while (it.hasNext()) {
            C7982 c7982 = (C7982) it.next();
            final ?? r2 = c7982.f24653;
            C3603.m11023(c7982.f24652, new Runnable() { // from class: l.ۚۛ֫
                /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.᩸ۛ֫] */
                @Override // java.lang.Runnable
                public final void run() {
                    C15036 c15036 = C15036.this;
                    r2.mo21129(c15036.f45822, c15036.f45821, i);
                }
            });
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35561() {
        Iterator it = this.f45820.iterator();
        while (it.hasNext()) {
            C7982 c7982 = (C7982) it.next();
            C3603.m11023(c7982.f24652, new RunnableC3239(1, this, c7982.f24653));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.᩸ۛ֫] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35564(final Exception exc) {
        Iterator it = this.f45820.iterator();
        while (it.hasNext()) {
            C7982 c7982 = (C7982) it.next();
            final ?? r2 = c7982.f24653;
            C3603.m11023(c7982.f24652, new Runnable() { // from class: l.֨ۛ֫
                /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.᩸ۛ֫] */
                @Override // java.lang.Runnable
                public final void run() {
                    C15036 c15036 = C15036.this;
                    r2.mo21130(c15036.f45822, c15036.f45821, exc);
                }
            });
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m35566() {
        Iterator it = this.f45820.iterator();
        while (it.hasNext()) {
            C7982 c7982 = (C7982) it.next();
            C3603.m11023(c7982.f24652, new RunnableC12103(1, this, c7982.f24653));
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m35567() {
        Iterator it = this.f45820.iterator();
        while (it.hasNext()) {
            C7982 c7982 = (C7982) it.next();
            C3603.m11023(c7982.f24652, new RunnableC9960(2, this, c7982.f24653));
        }
    }
}

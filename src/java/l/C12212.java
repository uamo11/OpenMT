package l;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: 0B2V */
/* renamed from: l.۫ۛ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12212 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Runnable f36445;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f36444 = new CopyOnWriteArrayList();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f36446 = new HashMap();

    public C12212(Runnable runnable) {
        this.f36445 = runnable;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29705(Menu menu) {
        Iterator it = this.f36444.iterator();
        while (it.hasNext()) {
            ((InterfaceC11507) it.next()).mo28340(menu);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29700(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f36444.iterator();
        while (it.hasNext()) {
            ((InterfaceC11507) it.next()).mo28338(menu, menuInflater);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m29704(MenuItem menuItem) {
        Iterator it = this.f36444.iterator();
        while (it.hasNext()) {
            if (((InterfaceC11507) it.next()).mo28339(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29699(Menu menu) {
        Iterator it = this.f36444.iterator();
        while (it.hasNext()) {
            ((InterfaceC11507) it.next()).mo28337(menu);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29701(InterfaceC11507 interfaceC11507) {
        this.f36444.add(interfaceC11507);
        this.f36445.run();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29702(final InterfaceC11507 interfaceC11507, InterfaceC23586 interfaceC23586) {
        m29701(interfaceC11507);
        AbstractC7379 lifecycle = interfaceC23586.getLifecycle();
        HashMap hashMap = this.f36446;
        C12917 c12917 = (C12917) hashMap.remove(interfaceC11507);
        if (c12917 != null) {
            c12917.m31379();
        }
        hashMap.put(interfaceC11507, new C12917(lifecycle, new InterfaceC17236() { // from class: l.ۗۛ
            @Override // l.InterfaceC17236
            /* renamed from: ֫ */
            public final void mo2195(InterfaceC23586 interfaceC235862, EnumC22901 enumC22901) {
                C12212 c12212 = C12212.this;
                c12212.getClass();
                if (enumC22901 == EnumC22901.ON_DESTROY) {
                    c12212.m29706(interfaceC11507);
                }
            }
        }));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29703(final InterfaceC11507 interfaceC11507, InterfaceC23586 interfaceC23586, final EnumC13728 enumC13728) {
        AbstractC7379 lifecycle = interfaceC23586.getLifecycle();
        HashMap hashMap = this.f36446;
        C12917 c12917 = (C12917) hashMap.remove(interfaceC11507);
        if (c12917 != null) {
            c12917.m31379();
        }
        hashMap.put(interfaceC11507, new C12917(lifecycle, new InterfaceC17236() { // from class: l.ۙۛ
            @Override // l.InterfaceC17236
            /* renamed from: ֫ */
            public final void mo2195(InterfaceC23586 interfaceC235862, EnumC22901 enumC22901) {
                C12212.m29698(C12212.this, enumC13728, interfaceC11507, enumC22901);
            }
        }));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29698(C12212 c12212, EnumC13728 enumC13728, InterfaceC11507 interfaceC11507, EnumC22901 enumC22901) {
        if (enumC22901 == EnumC22901.m50988(enumC13728)) {
            c12212.m29701(interfaceC11507);
            return;
        }
        if (enumC22901 == EnumC22901.ON_DESTROY) {
            c12212.m29706(interfaceC11507);
        } else if (enumC22901 == EnumC22901.m50984(enumC13728)) {
            c12212.f36444.remove(interfaceC11507);
            c12212.f36445.run();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29706(InterfaceC11507 interfaceC11507) {
        this.f36444.remove(interfaceC11507);
        C12917 c12917 = (C12917) this.f36446.remove(interfaceC11507);
        if (c12917 != null) {
            c12917.m31379();
        }
        this.f36445.run();
    }
}

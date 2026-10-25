package l;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: Q8Q4 */
/* renamed from: l.ۢ᩻ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9919 implements InterfaceC17182 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1451 f29994;

    @Override // l.InterfaceC17182
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ void mo25025() {
    }

    public C9919(C1451 c1451) {
        this.f29994 = c1451;
    }

    @Override // l.InterfaceC17182
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo25028() {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.f29994.f5175;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((InterfaceC4274) it.next()).mo8769();
        }
    }

    @Override // l.InterfaceC17182
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void mo25027() {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.f29994.f5175;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((InterfaceC4274) it.next()).mo8768();
        }
    }

    @Override // l.InterfaceC17182
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo25026(C6404 c6404) {
        CopyOnWriteArraySet copyOnWriteArraySet;
        copyOnWriteArraySet = this.f29994.f5175;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((InterfaceC4274) it.next()).mo8756(c6404);
        }
    }
}

package l;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: DB8V */
/* renamed from: l.ܿᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17501 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile ActivityC23809 f53464;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArraySet f53465 = new CopyOnWriteArraySet();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40888(InterfaceC14678 interfaceC14678) {
        ActivityC23809 activityC23809 = this.f53464;
        if (activityC23809 != null) {
            interfaceC14678.mo15594(activityC23809);
        }
        this.f53465.add(interfaceC14678);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40889(ActivityC23809 activityC23809) {
        this.f53464 = activityC23809;
        Iterator it = this.f53465.iterator();
        while (it.hasNext()) {
            ((InterfaceC14678) it.next()).mo15594(activityC23809);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40887() {
        this.f53464 = null;
    }
}

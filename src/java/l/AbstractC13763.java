package l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: MAWV */
/* renamed from: l.ܰۤ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC13763 extends AbstractC19286 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f41063 = AtomicReferenceFieldUpdater.newUpdater(AbstractC13763.class, Object.class, "_consensus");
    public volatile /* synthetic */ Object _consensus = C22936.f73915;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo33081(Object obj, Object obj2);

    /* renamed from: ۧ */
    public abstract C15050 mo31783(Object obj);

    @Override // l.AbstractC19286
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo33080(Object obj) {
        Object obj2 = this._consensus;
        C15050 c15050 = C22936.f73915;
        if (obj2 == c15050) {
            C15050 mo31783 = mo31783(obj);
            obj2 = this._consensus;
            if (obj2 == c15050) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f41063;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, c15050, mo31783)) {
                        obj2 = mo31783;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != c15050) {
                        obj2 = this._consensus;
                        break;
                    }
                }
            }
        }
        mo33081(obj, obj2);
        return obj2;
    }
}

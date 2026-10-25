package l;

import java.util.Comparator;

/* compiled from: Y6J0 */
/* renamed from: l.ۤܿܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C10439 implements Comparator {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31366;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f31366) {
            case 0:
                return Integer.compare(((C20317) obj).mo2870(), ((C20317) obj2).mo2870());
            default:
                AbstractC15440 abstractC15440 = (AbstractC15440) obj;
                AbstractC15440 abstractC154402 = (AbstractC15440) obj2;
                boolean mo23113 = abstractC15440.mo23113();
                return mo23113 == abstractC154402.mo23113() ? abstractC15440.getName().compareToIgnoreCase(abstractC154402.getName()) : mo23113 ? -1 : 1;
        }
    }
}

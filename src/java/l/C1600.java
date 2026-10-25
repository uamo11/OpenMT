package l;

import java.util.List;
import java.util.ListIterator;

/* compiled from: O3K3 */
/* renamed from: l.֫ۙܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1600 extends C14048 implements ListIterator {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10773 f5652;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private ListIterator m5459() {
        m33656();
        return (ListIterator) this.f42462;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1600(C10773 c10773) {
        super(c10773);
        this.f5652 = c10773;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1600(C10773 c10773, int i) {
        super(c10773, ((List) c10773.f23787).listIterator(i));
        this.f5652 = c10773;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m5459().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return m5459().previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return m5459().nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m5459().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m5459().set(obj);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C10773 c10773 = this.f5652;
        boolean isEmpty = c10773.isEmpty();
        m5459().add(obj);
        AbstractC16416.m38682(c10773.f32423);
        if (isEmpty) {
            c10773.m20600();
        }
    }
}

package l;

import java.util.AbstractList;

/* compiled from: 45V6 */
/* renamed from: l.ۖ۟֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC2377 extends AbstractList {
    /* renamed from: ֫ */
    public abstract Object mo7047(int i);

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException();
        }
        return mo7047(i);
    }
}

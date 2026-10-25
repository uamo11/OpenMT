package l;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: I31W */
/* renamed from: l.ۡۙܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C8656 extends AbstractC8405 {
    public static final long serialVersionUID = 0;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient int f26422;

    @Override // l.AbstractC14299, l.InterfaceC0353
    public final /* bridge */ /* synthetic */ Collection values() {
        throw null;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static C8656 m22419() {
        C8656 c8656 = new C8656(C16374.m38556(12));
        C22061.m49620(3, "expectedValuesPerKey");
        c8656.f26422 = 3;
        return c8656;
    }

    @Override // l.AbstractC16416
    /* renamed from: ᩻ */
    public final Collection mo13497() {
        return new ArrayList(this.f26422);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        C3758.m11381(this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f26422 = 3;
        int readInt = objectInputStream.readInt();
        m38685((Map) C16374.m38561());
        for (int i = 0; i < readInt; i++) {
            List list = get(objectInputStream.readObject());
            int readInt2 = objectInputStream.readInt();
            for (int i2 = 0; i2 < readInt2; i2++) {
                list.add(objectInputStream.readObject());
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22420(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return !collection.isEmpty() && get(obj).addAll(collection);
        }
        Iterator it = iterable.iterator();
        return it.hasNext() && C4648.m13614(get(obj), it);
    }
}

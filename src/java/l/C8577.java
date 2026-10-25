package l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* compiled from: 97L */
/* renamed from: l.ۡ֫ᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C8577 extends AbstractC17539 implements InterfaceC22841, InterfaceC8886 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19161 f26199;

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C8180.convert(spliterator());
    }

    public C8577(C19161 c19161) {
        this.f26199 = c19161;
    }

    @Override // l.AbstractC11462, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC12063 iterator() {
        return new C17749(this.f26199);
    }

    @Override // l.InterfaceC22841
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC12063 mo22286() {
        return new C14220(this.f26199);
    }

    @Override // l.AbstractC11462, java.util.Collection, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC19825, l.InterfaceC4323, java.util.Set, l.InterfaceC8886
    public final InterfaceC7975 spliterator() {
        return new C17043(this.f26199);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        char c;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Character)) {
            return false;
        }
        char charValue = ((Character) entry.getKey()).charValue();
        Object value = entry.getValue();
        C19161 c19161 = this.f26199;
        if (charValue == 0) {
            return c19161.f60384 && C11003.equals(c19161.f60386[c19161.f60377], value);
        }
        char[] cArr = c19161.f60376;
        int m32766 = C13630.m32766((int) charValue) & c19161.f60381;
        char c2 = cArr[m32766];
        if (c2 == 0) {
            return false;
        }
        if (charValue == c2) {
            return C11003.equals(c19161.f60386[m32766], value);
        }
        do {
            m32766 = (m32766 + 1) & c19161.f60381;
            c = cArr[m32766];
            if (c == 0) {
                return false;
            }
        } while (charValue != c);
        return C11003.equals(c19161.f60386[m32766], value);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Character)) {
            return false;
        }
        char charValue = ((Character) entry.getKey()).charValue();
        Object value = entry.getValue();
        C19161 c19161 = this.f26199;
        if (charValue == 0) {
            if (!c19161.f60384 || !C11003.equals(c19161.f60386[c19161.f60377], value)) {
                return false;
            }
            c19161.m44240();
            return true;
        }
        char[] cArr = c19161.f60376;
        int m32766 = C13630.m32766((int) charValue) & c19161.f60381;
        char c = cArr[m32766];
        if (c == 0) {
            return false;
        }
        if (c == charValue) {
            if (!C11003.equals(c19161.f60386[m32766], value)) {
                return false;
            }
            c19161.m44243(m32766);
            return true;
        }
        while (true) {
            m32766 = (m32766 + 1) & c19161.f60381;
            char c2 = cArr[m32766];
            if (c2 == 0) {
                return false;
            }
            if (c2 == charValue && C11003.equals(c19161.f60386[m32766], value)) {
                c19161.m44243(m32766);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f26199.f60379;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f26199.clear();
    }

    @Override // l.AbstractC11462, java.lang.Iterable, l.InterfaceC1144, l.InterfaceC4323
    public final void forEach(Consumer consumer) {
        C19161 c19161 = this.f26199;
        if (c19161.f60384) {
            consumer.n(new C9283(c19161, c19161.f60377));
        }
        char[] cArr = c19161.f60376;
        int i = c19161.f60377;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (cArr[i2] != 0) {
                consumer.n(new C9283(c19161, i2));
            }
            i = i2;
        }
    }
}

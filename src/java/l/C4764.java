package l;

import java.util.Iterator;

/* compiled from: 49EX */
/* renamed from: l.ۙܽۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4764 extends AbstractC3353 implements Iterable {
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C20287(this);
    }

    public final String toString() {
        return "Directory{fileId=" + this.f10615 + ", fileName='" + this.f10614.m39097() + "'}";
    }
}

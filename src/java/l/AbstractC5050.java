package l;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

/* compiled from: N673 */
/* renamed from: l.ۚ֫᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC5050 implements InterfaceC15234 {
    public InterfaceC5214 a;
    public int b;
    public InterfaceC15234 c;
    public InterfaceC15234 d;
    public Deque e;

    @Override // l.InterfaceC15234
    public final int characteristics() {
        return 64;
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ Comparator getComparator() {
        return C2536.$default$getComparator(this);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C2536.$default$getExactSizeIfKnown(this);
    }

    @Override // l.InterfaceC15234
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C2536.$default$hasCharacteristics(this, i);
    }

    public AbstractC5050(InterfaceC5214 interfaceC5214) {
        this.a = interfaceC5214;
    }

    public final Deque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int o = this.a.o();
        while (true) {
            o--;
            if (o < this.b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.a.a(o));
        }
    }

    public static InterfaceC5214 a(Deque deque) {
        while (true) {
            ArrayDeque arrayDeque = (ArrayDeque) deque;
            InterfaceC5214 interfaceC5214 = (InterfaceC5214) arrayDeque.pollFirst();
            if (interfaceC5214 == null) {
                return null;
            }
            if (interfaceC5214.o() != 0) {
                int o = interfaceC5214.o();
                while (true) {
                    o--;
                    if (o >= 0) {
                        arrayDeque.addFirst(interfaceC5214.a(o));
                    }
                }
            } else if (interfaceC5214.count() > 0) {
                return interfaceC5214;
            }
        }
    }

    public final boolean c() {
        if (this.a == null) {
            return false;
        }
        if (this.d != null) {
            return true;
        }
        InterfaceC15234 interfaceC15234 = this.c;
        if (interfaceC15234 == null) {
            Deque b = b();
            this.e = b;
            InterfaceC5214 a = a(b);
            if (a != null) {
                this.d = a.spliterator();
                return true;
            }
            this.a = null;
            return false;
        }
        this.d = interfaceC15234;
        return true;
    }

    @Override // l.InterfaceC15234
    public final InterfaceC15234 trySplit() {
        InterfaceC5214 interfaceC5214 = this.a;
        if (interfaceC5214 == null || this.d != null) {
            return null;
        }
        InterfaceC15234 interfaceC15234 = this.c;
        if (interfaceC15234 != null) {
            return interfaceC15234.trySplit();
        }
        if (this.b < interfaceC5214.o() - 1) {
            InterfaceC5214 interfaceC52142 = this.a;
            int i = this.b;
            this.b = i + 1;
            return interfaceC52142.a(i).spliterator();
        }
        InterfaceC5214 a = this.a.a(this.b);
        this.a = a;
        if (a.o() == 0) {
            InterfaceC15234 spliterator = this.a.spliterator();
            this.c = spliterator;
            return spliterator.trySplit();
        }
        InterfaceC5214 interfaceC52143 = this.a;
        this.b = 1;
        return interfaceC52143.a(0).spliterator();
    }

    @Override // l.InterfaceC15234
    public final long estimateSize() {
        long j = 0;
        if (this.a == null) {
            return 0L;
        }
        InterfaceC15234 interfaceC15234 = this.c;
        if (interfaceC15234 != null) {
            return interfaceC15234.estimateSize();
        }
        for (int i = this.b; i < this.a.o(); i++) {
            j += this.a.a(i).count();
        }
        return j;
    }

    @Override // l.InterfaceC15234
    public /* bridge */ /* synthetic */ InterfaceC1124 trySplit() {
        return (InterfaceC1124) trySplit();
    }

    @Override // l.InterfaceC15234
    public /* bridge */ /* synthetic */ InterfaceC18764 trySplit() {
        return (InterfaceC18764) trySplit();
    }

    @Override // l.InterfaceC15234
    public /* bridge */ /* synthetic */ InterfaceC0418 trySplit() {
        return (InterfaceC0418) trySplit();
    }

    @Override // l.InterfaceC15234
    public /* bridge */ /* synthetic */ InterfaceC8160 trySplit() {
        return (InterfaceC8160) trySplit();
    }
}

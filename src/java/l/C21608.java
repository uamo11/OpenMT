package l;

import java.util.function.Predicate;

/* compiled from: J1IP */
/* renamed from: l.᩸۬᩷, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final /* synthetic */ class C21608 implements Predicate {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69385;

    public /* synthetic */ C21608(int i) {
        this.f69385 = i;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        switch (this.f69385) {
        }
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        String m36561;
        int i;
        switch (this.f69385) {
            case 0:
                String name = ((AbstractC15440) obj).getName();
                if (name.toLowerCase().endsWith(".zip") && (m36561 = C15472.m36561(4, 0, name)) != null && !m36561.isEmpty()) {
                    while (true) {
                        if (i < m36561.length()) {
                            char charAt = m36561.charAt(i);
                            i = ((charAt >= '0' && charAt <= '9') || (i == 0 && charAt == '-')) ? i + 1 : 0;
                        } else {
                            if (m36561.length() < 19) {
                                return true;
                            }
                            try {
                                Long.parseLong(m36561);
                                return true;
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
                return false;
            default:
                int i2 = ActivityC17169.f52595;
                return !((AbstractC14346) obj).m34237();
        }
    }
}

package l;

import java.util.function.Predicate;

/* compiled from: N673 */
/* renamed from: l.ܽܽ᩵, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16771 extends AbstractC2703 {
    public final /* synthetic */ EnumC20342 c;
    public final /* synthetic */ Predicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16771(EnumC20342 enumC20342, Predicate predicate) {
        super(enumC20342);
        this.c = enumC20342;
        this.d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a) {
            return;
        }
        boolean test = this.d.test(obj);
        EnumC20342 enumC20342 = this.c;
        if (test == enumC20342.a) {
            this.a = true;
            this.b = enumC20342.b;
        }
    }
}

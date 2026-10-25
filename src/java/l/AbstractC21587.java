package l;

/* compiled from: UAXR */
/* renamed from: l.᩸۫᩵, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC21587 extends AbstractC2975 implements InterfaceC17373 {
    public /* synthetic */ AbstractC21587(int i) {
        this();
    }

    /* renamed from: ۘ */
    public abstract AbstractC21587 mo36043();

    public AbstractC21587() {
    }

    @Override // l.AbstractC2975
    public String toString() {
        AbstractC21587 abstractC21587;
        String str;
        int i = C9613.f29157;
        AbstractC21587 abstractC215872 = C3763.f11853;
        if (this == abstractC215872) {
            str = "Dispatchers.Main";
        } else {
            try {
                abstractC21587 = abstractC215872.mo36043();
            } catch (UnsupportedOperationException unused) {
                abstractC21587 = null;
            }
            str = this == abstractC21587 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + C11024.m27354(this);
    }
}

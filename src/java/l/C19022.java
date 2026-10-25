package l;

import java.util.ArrayList;
import java.util.List;

/* compiled from: H528 */
/* renamed from: l.ᩴ᩸ۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19022 implements InterfaceC19043 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19728 f59930;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f59931;

    public C19022(C19728 c19728, int i) {
        this.f59930 = c19728;
        this.f59931 = i;
    }

    @Override // l.InterfaceC19043
    /* renamed from: ֫ */
    public final C11261 mo8631(String str, EnumC16715 enumC16715) {
        C19728 c19728 = this.f59930;
        List[] listArr = c19728.f63746;
        int i = this.f59931;
        List list = listArr[i];
        if (list == null) {
            list = new ArrayList(5);
            c19728.f63746[i] = list;
        }
        C11261 c11261 = new C11261(str, enumC16715);
        list.add(c11261);
        return c11261;
    }
}

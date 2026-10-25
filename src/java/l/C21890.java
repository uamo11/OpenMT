package l;

import java.util.Comparator;

/* compiled from: O7HC */
/* renamed from: l.᩸᩺ۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C21890 implements Comparator {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f70084;

    public /* synthetic */ C21890(int i) {
        this.f70084 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f70084) {
            case 0:
                return Long.compare(((C3545) obj2).getSize(), ((C3545) obj).getSize());
            default:
                C4574 c4574 = (C4574) obj;
                C4574 c45742 = (C4574) obj2;
                int i = C18954.f59772;
                boolean startsWith = c4574.m13432().startsWith("_");
                return startsWith == c45742.m13432().startsWith("_") ? Integer.compare(c4574.m13433(), c45742.m13433()) : startsWith ? 1 : -1;
        }
    }
}

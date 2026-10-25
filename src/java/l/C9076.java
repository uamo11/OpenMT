package l;

import java.util.Comparator;

/* compiled from: AAGU */
/* renamed from: l.ۡᩴ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C9076 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C4574 c4574 = (C4574) obj;
        C4574 c45742 = (C4574) obj2;
        int i = C18954.f59772;
        boolean startsWith = c4574.m13432().startsWith("_");
        return startsWith == c45742.m13432().startsWith("_") ? c4574.m13432().compareToIgnoreCase(c45742.m13432()) : startsWith ? 1 : -1;
    }
}

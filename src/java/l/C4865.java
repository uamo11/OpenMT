package l;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: 85A3 */
/* renamed from: l.ۙ᩶֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4865 extends C0176 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3454 f15380;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4865(C3454 c3454, C3454 c34542, EnumC14993 enumC14993) {
        super(c34542, enumC14993);
        this.f15380 = c3454;
    }

    @Override // l.AbstractC10056
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo14223(int i) {
        C3454 c3454;
        c3454 = this.f15380.f10941;
        c3454.getClass();
        int m6855 = new C2085(this).m6855(i);
        C20388 c20388 = new C20388();
        ArrayList arrayList = this.f30234;
        Collections.sort(arrayList, c20388);
        this.f30236 = ((C11258) arrayList.get(0)).f16030;
        return m6855;
    }
}

package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;

/* compiled from: L78E */
/* renamed from: l.ۢܿۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C9727 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9021 f29476;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24716(C1965 c1965) {
        int i = c1965.f6586;
        int i2 = c1965.f6591;
        C9021 c9021 = this.f29476;
        ArrayList arrayList = c9021.f27386;
        if (c9021.f27384 == null) {
            CharSequence charSequence = c1965.f6587;
            c9021.f27384 = charSequence instanceof String ? c1965 : new C1965(c1965.f6585, i2, i, charSequence.toString());
        }
        c9021.f27385++;
        if (arrayList.size() >= 2) {
            c9021.f27387 = true;
            return;
        }
        CharSequence charSequence2 = c1965.f6587;
        int codePointCount = i - i2 > 240 ? UMErrorCode.E_UM_BE_EMPTY_URL_PATH : Character.codePointCount(charSequence2, i2, i);
        int m21642 = codePointCount > 120 ? C8163.m21642(i2, 0, charSequence2) : C8163.m21642(i2, -((120 - codePointCount) / 2), charSequence2);
        String m21636 = C8163.m21636(m21642, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, charSequence2);
        arrayList.add(new C0950(m21636, m21642, c1965.f6591, c1965.f6586, m21642 > 0 || m21636.length() + m21642 < charSequence2.length()));
    }
}

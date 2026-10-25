package l;

import android.util.TypedValue;
import com.google.android.material.chip.Chip;

/* compiled from: Z4GT */
/* renamed from: l.᩸۬ۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21598 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15246 m48775(XmlResourceParserC10269 xmlResourceParserC10269, int[] iArr, C12534 c12534) {
        C15246 c15246 = new C15246(xmlResourceParserC10269, iArr.length);
        int attributeCount = xmlResourceParserC10269.getAttributeCount();
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            int i3 = 0;
            while (true) {
                if (i3 >= attributeCount) {
                    break;
                }
                if (xmlResourceParserC10269.getAttributeNameResource(i3) == i2) {
                    int i4 = i * 2;
                    int m26023 = xmlResourceParserC10269.m26023(i3);
                    int m26020 = xmlResourceParserC10269.m26020(i3);
                    if (m26023 == 1) {
                        TypedValue typedValue = new TypedValue();
                        c12534.m30770(m26020, typedValue, true);
                        int i5 = typedValue.type;
                        int i6 = typedValue.data;
                        if (i5 == 3) {
                            int m10321 = xmlResourceParserC10269.m26018().m32186(typedValue.string.toString()).m10321();
                            m26023 = i5;
                            m26020 = m10321;
                        } else {
                            m26023 = i5;
                            m26020 = i6;
                        }
                    }
                    int[] iArr2 = c15246.f46794;
                    iArr2[i4] = m26023;
                    iArr2[i4 + 1] = m26020;
                } else {
                    i3++;
                }
            }
        }
        return c15246;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23418 m48776(C15246 c15246, XmlResourceParserC10269 xmlResourceParserC10269, String str, int i) {
        if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, str) != null) {
            TypedValue typedValue = new TypedValue();
            c15246.m36210(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return C18480.m42965(typedValue.data);
            }
            if (i2 == 1 || i2 == 2) {
                return C18480.m42965(-16777216);
            }
        }
        return C18480.m42965(0);
    }
}

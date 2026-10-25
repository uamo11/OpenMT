package l;

import java.util.HashMap;

/* compiled from: Y7SB */
/* renamed from: l.ܳ᩺֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14827 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f45227 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m35234(StringBuilder sb) {
        String sb2 = sb.toString();
        HashMap hashMap = this.f45227;
        Integer num = (Integer) hashMap.get(sb2);
        if (num == null) {
            num = 0;
        }
        int intValue = num.intValue() + 1;
        hashMap.put(sb2, Integer.valueOf(intValue));
        return intValue;
    }
}

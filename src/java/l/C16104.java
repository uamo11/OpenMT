package l;

import com.google.android.material.chip.Chip;
import java.util.HashMap;
import java.util.Map;

/* compiled from: 569Z */
/* renamed from: l.ܺᩳܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16104 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C11459 f49638 = C11459.m28260("xmlns:(\\w+)\\s*=\\s*\"([^\"]*?)\"");

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f49639 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38011(CharSequence charSequence) {
        HashMap hashMap = this.f49639;
        hashMap.clear();
        C12164 matcher = f49638.matcher(charSequence);
        while (matcher.find()) {
            hashMap.put(matcher.group(1), matcher.group(2));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m38010(String str) {
        String str2 = (String) this.f49639.get(str);
        return str2 == null ? "" : str2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m38009() {
        HashMap hashMap = this.f49639;
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((String) entry.getValue()).equals(Chip.NAMESPACE_ANDROID)) {
                return (String) entry.getKey();
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (((String) entry2.getValue()).equals("http://schemas.android.com/apk/res-auto")) {
                return (String) entry2.getKey();
            }
        }
        return "android";
    }
}

package l;

import java.util.HashMap;

/* compiled from: 5BM7 */
/* renamed from: l.۠ۖۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C7884 extends AbstractC5447 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f24430 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0828 m21166(String str, String str2) {
        HashMap hashMap = this.f24430;
        C0828 c0828 = (C0828) hashMap.get(str);
        if (c0828 != null) {
            return c0828;
        }
        C0828 c08282 = new C0828(str);
        c08282.m3086(str, str2);
        hashMap.put(str, c08282);
        return c08282;
    }
}

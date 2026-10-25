package l;

import android.view.View;
import java.util.HashMap;

/* compiled from: T1A5 */
/* renamed from: l.ܶ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14867 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f45351 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m35271(View view, String str) {
        HashMap hashMap = this.f45351;
        if (!hashMap.containsKey(view)) {
            return Float.NaN;
        }
        HashMap hashMap2 = (HashMap) hashMap.get(view);
        if (!hashMap2.containsKey(str)) {
            return Float.NaN;
        }
        float[] fArr = (float[]) hashMap2.get(str);
        if (fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }
}

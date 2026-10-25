package l;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: 51RR */
/* renamed from: l.᩺ܶۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23066 implements Serializable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f74196;

    public C23066(Bundle bundle) {
        this.f74196 = new HashMap();
        for (String str : bundle.keySet()) {
            this.f74196.put(str, bundle.getString(str));
        }
    }

    public C23066(HashMap hashMap) {
        this.f74196 = new HashMap(hashMap);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseData{time=");
        HashMap hashMap = this.f74196;
        sb.append((String) hashMap.get("time"));
        sb.append(", name=");
        sb.append((String) hashMap.get("interface_name"));
        sb.append('}');
        return sb.toString();
    }
}

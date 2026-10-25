package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: N673 */
/* renamed from: l.ܰۚᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13618 {
    public Set a;
    public Map b;
    public boolean c;

    public final boolean b(String str) {
        return this.c || ((HashSet) this.a).contains(str);
    }

    public final void a(Object obj, String str) {
        ((HashMap) this.b).put(str, obj);
    }
}

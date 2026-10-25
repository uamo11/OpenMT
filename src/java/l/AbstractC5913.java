package l;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;

/* compiled from: C6YQ */
/* renamed from: l.ۛ۟ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC5913 implements InterfaceC7324 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final HashSet f18145 = new HashSet();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f18146;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f18147;

    /* renamed from: ۧ */
    public abstract boolean mo9442();

    public AbstractC5913(String str, String str2) {
        this.f18147 = str;
        this.f18146 = str2;
        f18145.add(this);
    }

    @Override // l.InterfaceC7324
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo16572() {
        return this.f18147;
    }

    @Override // l.InterfaceC7324
    public final boolean isSupported() {
        return mo9442() || mo16573();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean mo16573() {
        HashSet hashSet = C15084.f46074;
        String str = this.f18146;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":dev");
        return hashSet.contains(sb.toString());
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Set m16571() {
        return C20195.unmodifiableSet(f18145);
    }
}

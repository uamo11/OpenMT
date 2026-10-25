package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: X72G */
/* renamed from: l.᩻᩸֫, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23959 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f77718 = new HashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f77719 = new ArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52786(C23959 c23959, Uri uri) {
        if (uri == null) {
            c23959.m52789("exo_redir");
        } else {
            c23959.m52784((Object) uri.toString(), "exo_redir");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52790(String str, String str2) {
        m52784((Object) str2, str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52785(C23959 c23959, long j) {
        c23959.m52784(Long.valueOf(j), "exo_len");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52788(long j, String str) {
        m52784(Long.valueOf(j), str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52789(String str) {
        this.f77719.add(str);
        this.f77718.remove(str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m52791() {
        return C20195.unmodifiableList(new ArrayList(this.f77719));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Map m52787() {
        HashMap hashMap = new HashMap(this.f77718);
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return C20195.unmodifiableMap(hashMap);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m52784(Object obj, String str) {
        obj.getClass();
        this.f77718.put(str, obj);
        this.f77719.remove(str);
    }
}

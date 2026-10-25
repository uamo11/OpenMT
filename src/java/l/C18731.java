package l;

import android.net.Uri;
import java.util.LinkedHashMap;

/* compiled from: M7MY */
/* renamed from: l.ᩴۨ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18731 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f59205 = new C3914(5, 1.0f, false);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m43382(Uri uri) {
        if (uri == null) {
            return null;
        }
        return (byte[]) this.f59205.get(uri);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43381(Uri uri, byte[] bArr) {
        uri.getClass();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] m43383(Uri uri) {
        uri.getClass();
        return (byte[]) this.f59205.remove(uri);
    }
}

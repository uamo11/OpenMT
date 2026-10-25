package l;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

/* compiled from: I22G */
/* renamed from: l.᩸ۘ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21326 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C4392 f68721;

    public C21326(String str, int i, int i2) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            C19915 c19915 = new C19915(str, i, i2);
            C22031.m49574(i, i2, str);
            this.f68721 = c19915;
            return;
        }
        this.f68721 = new C4392(str, i, i2);
    }

    public C21326(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String m45832 = C19915.m45832(remoteUserInfo);
        if (m45832 == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(m45832)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.f68721 = new C19915(remoteUserInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21326)) {
            return false;
        }
        return this.f68721.equals(((C21326) obj).f68721);
    }

    public final int hashCode() {
        return this.f68721.hashCode();
    }
}

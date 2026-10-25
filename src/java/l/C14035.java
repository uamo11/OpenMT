package l;

import android.app.Person;
import android.os.PersistableBundle;

/* compiled from: 374 */
/* renamed from: l.ܰ᩶, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14035 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C4656 f42430;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f42431;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f42432;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f42433;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public CharSequence f42434;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f42435;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14035 m33648(PersistableBundle persistableBundle) {
        return C11920.m29083(persistableBundle);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final PersistableBundle m33650() {
        return C11920.m29082(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Person m33649() {
        return C23208.m51502(this);
    }

    public final int hashCode() {
        String str = this.f42435;
        return str != null ? str.hashCode() : C11003.hash(this.f42434, this.f42432, Boolean.valueOf(this.f42431), Boolean.valueOf(this.f42433));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C14035)) {
            return false;
        }
        C14035 c14035 = (C14035) obj;
        String str = this.f42435;
        String str2 = c14035.f42435;
        if (str == null && str2 == null) {
            return C11003.equals(C11003.toString(this.f42434), C11003.toString(c14035.f42434)) && C11003.equals(this.f42432, c14035.f42432) && Boolean.valueOf(this.f42431).equals(Boolean.valueOf(c14035.f42431)) && Boolean.valueOf(this.f42433).equals(Boolean.valueOf(c14035.f42433));
        }
        return C11003.equals(str, str2);
    }
}

package l;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.bouncycastle.asn1.util.ASN1Dump;

/* compiled from: 15HS */
/* renamed from: l.᩵ۨۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19444 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    @SuppressLint({"UnknownNullness"})
    public View f62890;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f62889 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f62888 = new ArrayList();

    @Deprecated
    public C19444() {
    }

    public C19444(View view) {
        this.f62890 = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19444)) {
            return false;
        }
        C19444 c19444 = (C19444) obj;
        return this.f62890 == c19444.f62890 && this.f62889.equals(c19444.f62889);
    }

    public final int hashCode() {
        return this.f62889.hashCode() + (this.f62890.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder m19190 = C7166.m19190("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        m19190.append(this.f62890);
        m19190.append("\n");
        String m37867 = C16014.m37867(m19190.toString(), "    values:");
        HashMap hashMap = this.f62889;
        for (String str : hashMap.keySet()) {
            m37867 = m37867 + ASN1Dump.TAB + str + ": " + hashMap.get(str) + "\n";
        }
        return m37867;
    }
}

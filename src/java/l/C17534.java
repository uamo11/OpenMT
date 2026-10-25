package l;

import bin.mt.json.JSONArray;
import com.google.android.material.motion.MotionUtils;

/* compiled from: OAYY */
/* renamed from: l.ܿᩴܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17534 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f53547;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f53548;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f53549;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17534)) {
            return false;
        }
        C17534 c17534 = (C17534) obj;
        return this.f53548 == c17534.f53548 && this.f53549 == c17534.f53549 && C11233.m27802((Object) this.f53547, (Object) c17534.f53547);
    }

    public final int hashCode() {
        return this.f53547.hashCode() + (((this.f53548 * 31) + (this.f53549 ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkStorageInfo(id=");
        sb.append(this.f53548);
        sb.append(", isDir=");
        sb.append(this.f53549);
        sb.append(", backupTag=");
        return C9045.m23341(sb, this.f53547, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public C17534(int i, String str, boolean z) {
        this.f53548 = i;
        this.f53549 = z;
        this.f53547 = str;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m40974() {
        return this.f53548;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m40975() {
        return this.f53549;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m40972() {
        return this.f53547;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C17534(l.AbstractC3577 r3, boolean r4) {
        /*
            r2 = this;
            int r0 = r3.f11356
            java.lang.String r3 = r3.mo6365()
            java.lang.String r1 = "getBackupTag(...)"
            l.C11233.m27803(r3, r1)
            r2.<init>(r0, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17534.<init>(l.ۗ᩻᩻, boolean):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C17534(bin.mt.json.JSONArray r4) {
        /*
            r3 = this;
            r0 = 0
            int r0 = r4.getInt(r0)
            r1 = 1
            boolean r1 = r4.getBoolean(r1)
            r2 = 2
            java.lang.String r4 = r4.getString(r2)
            java.lang.String r2 = "getString(...)"
            l.C11233.m27803(r4, r2)
            r3.<init>(r0, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17534.<init>(bin.mt.json.JSONArray):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17534 m40973(AbstractC3577 abstractC3577) {
        return new C17534(abstractC3577, this.f53549);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final JSONArray m40976() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(this.f53548);
        jSONArray.add(this.f53549);
        jSONArray.add(this.f53547);
        return jSONArray;
    }
}

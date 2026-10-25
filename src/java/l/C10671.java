package l;

import android.content.DialogInterface;
import android.content.Intent;
import com.alipay.sdk.m.y.l;
import java.util.List;

/* compiled from: LAQJ */
/* renamed from: l.ۧ֨ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10671 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f32087;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f32088;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List f32089;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f32090;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f32091;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f32092;

    public C10671() {
        throw null;
    }

    public C10671(AbstractActivityC3346 abstractActivityC3346, AbstractC15440 abstractC15440, boolean z, String str, List list, String str2) {
        this.f32087 = abstractActivityC3346;
        this.f32088 = abstractC15440;
        this.f32092 = z;
        this.f32091 = str;
        this.f32089 = list;
        this.f32090 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10671)) {
            return false;
        }
        C10671 c10671 = (C10671) obj;
        return this.f32092 == c10671.f32092 && C11003.equals(this.f32087, c10671.f32087) && C11003.equals(this.f32088, c10671.f32088) && C11003.equals(this.f32091, c10671.f32091) && C11003.equals(this.f32089, c10671.f32089) && C11003.equals(this.f32090, c10671.f32090);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f32090) + ((C11003.hashCode(this.f32089) + C20361.m46680((C11003.hashCode(this.f32088) + ((C11003.hashCode(this.f32087) + ((this.f32092 ? 1231 : 1237) * 31)) * 31)) * 31, 31, this.f32091)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f32087, this.f32088, Boolean.valueOf(this.f32092), this.f32091, this.f32089, this.f32090};
        String[] split = "activity;file;isApks;packageName;selectedApkNames;installerPackageName".length() == 0 ? new String[0] : "activity;file;isApks;packageName;selectedApkNames;installerPackageName".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C10671.class, sb, "[");
        for (int i = 0; i < split.length; i++) {
            sb.append(split[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != split.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26773() {
        if (this.f32090.isEmpty()) {
            return;
        }
        C4925.m14315(new RunnableC5258(2));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26775(Intent intent) {
        this.f32087.startActivity(intent);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26776(Exception exc) {
        this.f32087.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26774(int i) {
        this.f32087.m10235(i);
    }

    public final String getFileName() {
        return this.f32088.getName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
    
        if (r1.versionCode < 54100) goto L30;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m26777(final l.EnumC5856 r7) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10671.m26777(l.ۛۚܿ):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26778(EnumC5856 enumC5856) {
        m26777(enumC5856.m16416());
    }
}

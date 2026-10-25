package l;

import android.content.Intent;
import android.graphics.Bitmap;
import bin.mt.plus.R;
import bin.mt.plus.ShortcutActivity;

/* compiled from: 592B */
/* renamed from: l.ۤ᩹᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10591 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f31791;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f31792;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f31793;

    public C10591(AbstractActivityC3346 abstractActivityC3346, boolean z) {
        this.f31791 = abstractActivityC3346;
        this.f31793 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (((java.lang.Boolean) r0).booleanValue() != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f1, code lost:
    
        if (r0.equals("0") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0116, code lost:
    
        if (r0 != null) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x018c  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m26605() {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10591.m26605():boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26604(C10591 c10591) {
        AbstractActivityC3346 abstractActivityC3346 = c10591.f31791;
        C22474.m50422(abstractActivityC3346, abstractActivityC3346.getPackageName());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m26606(Intent intent, String str, Bitmap bitmap, String str2) {
        boolean z = this.f31793;
        if (z) {
            str2 = C16014.m37867(str2, ":dynamic");
        }
        String m34530 = C14460.m34530(str2);
        AbstractActivityC3346 abstractActivityC3346 = this.f31791;
        C13581 c13581 = new C13581(abstractActivityC3346, m34530);
        c13581.m32661(str);
        c13581.m32662(C4656.m13628(bitmap));
        c13581.m32660(intent);
        C7232 m32659 = c13581.m32659();
        if (z) {
            if (!C16362.m38514(abstractActivityC3346, m32659)) {
                C21374.m48457(R.string.MT_Protector_res_0x7f120207);
                return false;
            }
            ShortcutActivity.m137(m32659.m19332(), bitmap);
            C21374.m48457(R.string.MT_Protector_res_0x7f12020a);
            return true;
        }
        if (!C16362.m38518(abstractActivityC3346, m32659)) {
            C21374.m48457(R.string.MT_Protector_res_0x7f120207);
            return false;
        }
        if (this.f31792 == 0) {
            C21374.m48457(R.string.MT_Protector_res_0x7f12020a);
            return true;
        }
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120491);
        buildDialog.m44416(R.string.MT_Protector_res_0x7f120208);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
        buildDialog.m44438();
        return true;
    }
}

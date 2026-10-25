package l;

/* compiled from: P1U8 */
/* renamed from: l.᩻۬ۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23714 implements InterfaceC8898 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object f76788;

    public /* synthetic */ C23714(Object obj) {
        this.f76788 = obj;
    }

    @Override // l.InterfaceC8898
    /* renamed from: ֫ */
    public void mo1225(C2966 c2966) {
        c2966.m45792((C15952) this.f76788);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String m52290(int r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L3b
            r1 = 1
            if (r8 == r1) goto L28
            r1 = 2
            if (r8 == r1) goto L15
            r9 = 4
            if (r8 == r9) goto Le
            r2 = r0
            goto L42
        Le:
            java.lang.String r8 = "content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS"
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L41
        L15:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "content://com.vivo.vms.IdProvider/IdentifierId/AAID_"
            r8.<init>(r1)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L41
        L28:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "content://com.vivo.vms.IdProvider/IdentifierId/VAID_"
            r8.<init>(r1)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L41
        L3b:
            java.lang.String r8 = "content://com.vivo.vms.IdProvider/IdentifierId/OAID"
            android.net.Uri r8 = android.net.Uri.parse(r8)
        L41:
            r2 = r8
        L42:
            java.lang.Object r8 = r7.f76788
            android.content.Context r8 = (android.content.Context) r8
            android.content.ContentResolver r1 = r8.getContentResolver()
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)
            if (r8 == 0) goto L68
            boolean r9 = r8.moveToNext()
            if (r9 == 0) goto L65
            java.lang.String r9 = "value"
            int r9 = r8.getColumnIndex(r9)
            java.lang.String r9 = r8.getString(r9)
            r0 = r9
        L65:
            r8.close()
        L68:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23714.m52290(int, java.lang.String):java.lang.String");
    }
}

package com.alipay.sdk.m.d;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class e implements com.alipay.sdk.m.c.b {
    public static final String a = "content://cn.nubia.provider.deviceid.dataid/oaid";

    @Override // com.alipay.sdk.m.c.b
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        Cursor query = context.getContentResolver().query(Uri.parse("content://cn.nubia.provider.deviceid.dataid/oaid"), null, null, null, null);
        if (query != null) {
            r0 = query.moveToNext() ? query.getString(query.getColumnIndex("device_ids_grndid")) : null;
            query.close();
        }
        return r0;
    }
}

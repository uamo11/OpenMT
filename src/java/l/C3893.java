package l;

import android.app.Application;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: 94XI */
/* renamed from: l.ۘۧ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3893 extends AbstractC2482 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Application f12453;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Uri f12454;

    @Override // l.AbstractC2482
    /* renamed from: ֫ */
    public final String mo7970() {
        Throwable th;
        Exception e;
        Cursor cursor;
        Object obj = "_display_name";
        Object obj2 = null;
        try {
        } catch (Throwable th2) {
            obj2 = obj;
            th = th2;
        }
        try {
            try {
                cursor = this.f12453.getContentResolver().query(this.f12454, new String[]{"_display_name"}, null, null, null);
            } catch (Exception unused) {
                return null;
            }
            try {
                if (!cursor.moveToFirst() || cursor.isNull(0)) {
                    try {
                        C20094.m46319(cursor);
                        return null;
                    } catch (RuntimeException e2) {
                        throw e2;
                    }
                }
                String string = cursor.getString(0);
                try {
                    C20094.m46319(cursor);
                    return string;
                } catch (RuntimeException e3) {
                    throw e3;
                }
            } catch (Exception e4) {
                e = e4;
                e.toString();
                Cursor cursor2 = cursor;
                obj = cursor2;
                if (cursor2 != null) {
                    try {
                        Cursor cursor3 = cursor2;
                        C20094.m46319(cursor3);
                        obj = cursor3;
                    } catch (RuntimeException e5) {
                        throw e5;
                    }
                }
                return null;
            }
        } catch (Exception e6) {
            e = e6;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            Cursor cursor4 = (Cursor) obj2;
            if (cursor4 != null) {
                try {
                    C20094.m46319(cursor4);
                } catch (RuntimeException e7) {
                    throw e7;
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    public C3893(Application application, Uri uri) {
        this.f12453 = application;
        this.f12454 = uri;
    }
}

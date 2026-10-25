package l;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.umeng.analytics.pro.aq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: SB10 */
/* renamed from: l.ۛ۫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6047 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C4636 f18544 = new C4636(0);

    /* JADX WARN: Finally extract failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17981 m16878(Context context, C11692 c11692) {
        Cursor cursor;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String m28585 = c11692.m28585();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(m28585, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(C20094.m46315("No package found for authority: ", m28585));
        }
        if (!resolveContentProvider.packageName.equals(c11692.m28587())) {
            StringBuilder m9834 = C3200.m9834("Found content provider ", m28585, ", but package was not ");
            m9834.append(c11692.m28587());
            throw new PackageManager.NameNotFoundException(m9834.toString());
        }
        Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        C4636 c4636 = f18544;
        Collections.sort(arrayList, c4636);
        List m28583 = c11692.m28583() != null ? c11692.m28583() : C2252.m7456(resources, 0);
        int i = 0;
        loop1: while (true) {
            cursor = null;
            if (i >= m28583.size()) {
                resolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) m28583.get(i));
            Collections.sort(arrayList2, c4636);
            if (arrayList.size() == arrayList2.size()) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                        break;
                    }
                }
                break loop1;
            }
            i++;
        }
        if (resolveContentProvider == null) {
            return new C17981(1, null);
        }
        String str = resolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        InterfaceC3225 c13102 = Build.VERSION.SDK_INT < 24 ? new C13102(context, build) : new C10281(context, build);
        try {
            cursor = c13102.mo9895(build, new String[]{aq.d, "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, new String[]{c11692.m28586()});
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex(aq.d);
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    arrayList3.add(new C17275(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, columnIndex != -1 ? cursor.getInt(columnIndex) : 0));
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            c13102.close();
            return new C17981(0, (C17275[]) arrayList3.toArray(new C17275[0]));
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            c13102.close();
            throw th;
        }
    }
}

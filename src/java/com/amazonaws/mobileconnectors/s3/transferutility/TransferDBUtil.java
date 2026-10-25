package com.amazonaws.mobileconnectors.s3.transferutility;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.aq;
import java.io.File;
import java.util.ArrayList;
import l.C12524;
import l.C4860;

/* loaded from: classes.dex */
public class TransferDBUtil {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static TransferDBBase f290;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Log f289 = LogFactory.m302(TransferDBUtil.class);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object f288 = new Object();

    public TransferDBUtil(Context context) {
        new C12524();
        synchronized (f288) {
            if (f290 == null) {
                f290 = new TransferDBBase(context);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m361(TransferRecord transferRecord) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(aq.d, Integer.valueOf(transferRecord.f328));
        contentValues.put("state", transferRecord.f312.toString());
        contentValues.put("bytes_total", Long.valueOf(transferRecord.f325));
        contentValues.put("bytes_current", Long.valueOf(transferRecord.f319));
        return f290.m357(m369(transferRecord.f328), contentValues, null, null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m365(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("bytes_current", Long.valueOf(j));
        f290.m357(m369(i), contentValues, null, null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m360(int i, TransferState transferState) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("state", transferState.toString());
        if (TransferState.FAILED.equals(transferState)) {
            return f290.m357(m369(i), contentValues, "state not in (?,?,?,?,?) ", new String[]{TransferState.COMPLETED.toString(), TransferState.PENDING_NETWORK_DISCONNECT.toString(), TransferState.PAUSED.toString(), TransferState.CANCELED.toString(), TransferState.WAITING_FOR_NETWORK.toString()});
        }
        return f290.m357(m369(i), contentValues, null, null);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m370(int i, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("multipart_id", str);
        f290.m357(m369(i), contentValues, null, null);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m367(int i, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("etag", str);
        f290.m357(m369(i), contentValues, null, null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Cursor m362(TransferType transferType, TransferState[] transferStateArr) {
        String sb;
        String str;
        String[] strArr;
        int length = transferStateArr.length;
        if (length <= 0) {
            f289.mo291("Cannot create a string of 0 or less placeholders.");
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder((length * 2) - 1);
            sb2.append("?");
            for (int i = 1; i < length; i++) {
                sb2.append(",?");
            }
            sb = sb2.toString();
        }
        int i2 = 0;
        if (transferType == TransferType.ANY) {
            str = C4860.m14172("state in (", sb, MotionUtils.EASING_TYPE_FORMAT_END);
            strArr = new String[length];
            while (i2 < length) {
                strArr[i2] = transferStateArr[i2].toString();
                i2++;
            }
        } else {
            String m14172 = C4860.m14172("state in (", sb, ") and type=?");
            String[] strArr2 = new String[length + 1];
            while (i2 < length) {
                strArr2[i2] = transferStateArr[i2].toString();
                i2++;
            }
            strArr2[i2] = transferType.toString();
            str = m14172;
            strArr = strArr2;
        }
        TransferDBBase transferDBBase = f290;
        return transferDBBase.m358(transferDBBase.m359(), str, strArr);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static TransferRecord m372(int i) {
        Cursor m358;
        Cursor cursor = null;
        TransferRecord transferRecord = null;
        try {
            m358 = f290.m358(m369(i), null, null);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (m358.moveToFirst()) {
                transferRecord = new TransferRecord(i);
                transferRecord.m383(m358);
            }
            m358.close();
            return transferRecord;
        } catch (Throwable th2) {
            th = th2;
            cursor = m358;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static long m371(int i) {
        Cursor cursor = null;
        try {
            cursor = f290.m358(m366(i), null, null);
            long j = 0;
            while (cursor.moveToNext()) {
                if (TransferState.PART_COMPLETED.equals(TransferState.m388(cursor.getString(cursor.getColumnIndexOrThrow("state"))))) {
                    j += cursor.getLong(cursor.getColumnIndexOrThrow("bytes_total"));
                }
            }
            cursor.close();
            return j;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m364(int i) {
        f290.m356(m369(i));
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static ArrayList m368(int i) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = f290.m358(m366(i), null, null);
            while (cursor.moveToNext()) {
                arrayList.add(new PartETag(cursor.getInt(cursor.getColumnIndexOrThrow("part_num")), cursor.getString(cursor.getColumnIndexOrThrow("etag"))));
            }
            cursor.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m363(int i, String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = f290.m358(m366(i), null, null);
            while (cursor.moveToNext()) {
                if (!TransferState.PART_COMPLETED.equals(TransferState.m388(cursor.getString(cursor.getColumnIndexOrThrow("state"))))) {
                    UploadPartRequest uploadPartRequest = new UploadPartRequest();
                    uploadPartRequest.m674(cursor.getInt(cursor.getColumnIndexOrThrow(aq.d)));
                    cursor.getInt(cursor.getColumnIndexOrThrow("main_upload_id"));
                    uploadPartRequest.m678(cursor.getString(cursor.getColumnIndexOrThrow("bucket_name")));
                    uploadPartRequest.m683(cursor.getString(cursor.getColumnIndexOrThrow("key")));
                    uploadPartRequest.m688(str);
                    uploadPartRequest.m676(new File(cursor.getString(cursor.getColumnIndexOrThrow("file"))));
                    uploadPartRequest.m675(cursor.getLong(cursor.getColumnIndexOrThrow("file_offset")));
                    uploadPartRequest.m687(cursor.getInt(cursor.getColumnIndexOrThrow("part_num")));
                    uploadPartRequest.m682(cursor.getLong(cursor.getColumnIndexOrThrow("bytes_total")));
                    cursor.getInt(cursor.getColumnIndexOrThrow("is_last_part"));
                    arrayList.add(uploadPartRequest);
                }
            }
            cursor.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Uri m369(int i) {
        return Uri.parse(f290.m359() + "/" + i);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Uri m366(int i) {
        return Uri.parse(f290.m359() + "/part/" + i);
    }
}

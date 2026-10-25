package l;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.system.Os;
import com.alipay.sdk.m.n.c;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.d;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPOutputStream;

/* compiled from: D98Y */
/* renamed from: l.ܺ֨ۢ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class BinderC15603 extends AbstractBinderC13611 {
    @InterfaceC4801
    public BinderC15603() {
        attachInterface(this, "bin.mt.shell.IShizukuCommand");
    }

    @Override // l.InterfaceC7262
    /* renamed from: ֫ */
    public final int mo19481() {
        return Os.getuid();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36785(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36786(Process process) {
        if (process == null) {
            return;
        }
        try {
            process.destroy();
        } catch (Exception unused) {
        }
        try {
            if (Build.VERSION.SDK_INT < 26 || !process.isAlive()) {
                return;
            }
            process.destroyForcibly();
        } catch (Exception unused2) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(3:2|3|4)|(3:43|44|(11:46|47|48|7|30|31|(2:33|(4:35|36|14|15))(1:38)|37|36|14|15))|6|7|30|31|(0)(0)|37|36|14|15|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
    
        r4 = r1;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a7, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075 A[Catch: all -> 0x00a6, InterruptedException -> 0x00a9, TryCatch #9 {InterruptedException -> 0x00a9, all -> 0x00a6, blocks: (B:31:0x003a, B:33:0x0075, B:35:0x007c, B:37:0x0092, B:38:0x008f), top: B:30:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f A[Catch: all -> 0x00a6, InterruptedException -> 0x00a9, TRY_ENTER, TryCatch #9 {InterruptedException -> 0x00a9, all -> 0x00a6, blocks: (B:31:0x003a, B:33:0x0075, B:35:0x007c, B:37:0x0092, B:38:0x008f), top: B:30:0x003a }] */
    @Override // l.InterfaceC7262
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle mo19482(int r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.BinderC15603.mo19482(int, java.lang.String, java.lang.String):android.os.Bundle");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Bundle m36787(int i, String str, String str2) {
        Bundle m36783 = m36783(str, i, str2, false);
        long j = 16;
        long length = ((str == null || str.length() == 0) ? 16L : (str.length() * 2) + 16) + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        if (str2 != null && str2.length() != 0) {
            j = 16 + (str2.length() * 2);
        }
        if (length + j > Math.max(0, 245760)) {
            Parcel obtain = Parcel.obtain();
            try {
                m36783.writeToParcel(obtain, 0);
                int dataSize = obtain.dataSize();
                obtain.recycle();
                if (dataSize > 262144) {
                    Bundle m367832 = m36783(str, i, str2, true);
                    obtain = Parcel.obtain();
                    try {
                        m367832.writeToParcel(obtain, 0);
                        return obtain.dataSize() <= 262144 ? m367832 : m36783("", 2, "Command output too large after compression", false);
                    } finally {
                    }
                }
            } finally {
            }
        }
        return m36783;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bundle m36783(String str, int i, String str2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt(c.a, i);
        m36784(bundle, "output", "output_gzip", str, z);
        m36784(bundle, d.O, "error_gzip", str2, z);
        return bundle;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36784(Bundle bundle, String str, String str2, String str3, boolean z) {
        if (str3 == null) {
            str3 = "";
        }
        if (!z || str3.length() == 0) {
            bundle.putString(str, str3);
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(str3.getBytes(StandardCharsets.UTF_8));
                gZIPOutputStream.close();
                bundle.putByteArray(str2, byteArrayOutputStream.toByteArray());
            } finally {
            }
        } catch (IOException unused) {
            bundle.putString(str, "Command output too large after compression");
        }
    }
}

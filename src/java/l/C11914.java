package l;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.storage.StorageManager;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: X13G */
/* renamed from: l.ۨ᩵ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C11914 extends ContentProvider {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static Set f35615 = Collections.EMPTY_SET;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final String f35616 = C4925.m14337().concat(".fp");

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final String[] f35617 = {"_display_name", "_size"};

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29048(ArrayList arrayList) {
        Set set;
        if (arrayList == null || arrayList.isEmpty()) {
            set = Collections.EMPTY_SET;
        } else {
            set = new HashSet(arrayList);
        }
        f35615 = set;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Uri m29045(String str) {
        if (!f35615.isEmpty()) {
            m29048((ArrayList) null);
        }
        return new Uri.Builder().scheme("content").authority(f35616).path(str).build();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Uri m29046(AbstractC15440 abstractC15440) {
        if (C4925.f15523.getBoolean("apk_installation_prevents_deletion", false)) {
            String encodeToString = Base64.encodeToString(abstractC15440.m36511().getBytes(StandardCharsets.UTF_8), 11);
            long currentTimeMillis = System.currentTimeMillis();
            return m29045(String.format("%s%08X/%s/%s", "/NOT_DELETE/", Long.valueOf(((int) (currentTimeMillis ^ (currentTimeMillis >>> 32))) & 4294967295L), encodeToString, abstractC15440.getName()));
        }
        return m29045(abstractC15440.mo23554());
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        if (!providerInfo.authority.equals(f35616)) {
            throw new RuntimeException();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m29047(Uri uri) {
        String str;
        String path = uri.getPath();
        C11003.requireNonNull(path);
        if (path.startsWith("/NOT_DELETE/")) {
            path = path.substring(21);
            int lastIndexOf = path.lastIndexOf(47);
            if (lastIndexOf > 0) {
                str = path.substring(lastIndexOf);
                path = path.substring(0, lastIndexOf);
            } else {
                str = "";
            }
            try {
                path = new String(Base64.decode(path, 11), StandardCharsets.UTF_8) + str;
            } catch (Throwable unused) {
            }
        }
        return C16999.m39866(path, new String[0]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003e, code lost:
    
        if (r5.equals("_data") == false) goto L22;
     */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.database.Cursor query(android.net.Uri r11, java.lang.String[] r12, java.lang.String r13, java.lang.String[] r14, java.lang.String r15) {
        /*
            r10 = this;
            l.C11003.toString(r11)
            java.util.Arrays.toString(r12)
            java.util.Arrays.toString(r14)
            l.ܶ᩵ܿ r13 = m29047(r11)
            if (r12 != 0) goto L11
            java.lang.String[] r12 = l.C11914.f35617
        L11:
            int r14 = r12.length
            java.lang.String[] r14 = new java.lang.String[r14]
            int r15 = r12.length
            java.lang.Object[] r15 = new java.lang.Object[r15]
            int r0 = r12.length
            r1 = 0
            r2 = 0
            r3 = 0
        L1b:
            r4 = 1
            if (r2 >= r0) goto L8e
            r5 = r12[r2]
            r5.getClass()
            int r6 = r5.hashCode()
            java.lang.String r7 = "_size"
            java.lang.String r8 = "_data"
            java.lang.String r9 = "_display_name"
            switch(r6) {
                case -488395321: goto L41;
                case 90810505: goto L3a;
                case 91265248: goto L31;
                default: goto L30;
            }
        L30:
            goto L4a
        L31:
            boolean r4 = r5.equals(r7)
            if (r4 != 0) goto L38
            goto L4a
        L38:
            r4 = 2
            goto L4b
        L3a:
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L4b
            goto L4a
        L41:
            boolean r4 = r5.equals(r9)
            if (r4 != 0) goto L48
            goto L4a
        L48:
            r4 = 0
            goto L4b
        L4a:
            r4 = -1
        L4b:
            switch(r4) {
                case 0: goto L80;
                case 1: goto L5e;
                case 2: goto L4f;
                default: goto L4e;
            }
        L4e:
            goto L8b
        L4f:
            r14[r3] = r7
            int r4 = r3 + 1
            long r5 = r13.mo23127()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r15[r3] = r5
            goto L8a
        L5e:
            java.lang.String r4 = r11.getPath()
            l.C11003.requireNonNull(r4)
            java.lang.String r5 = "/NOT_DELETE/"
            boolean r4 = r4.startsWith(r5)
            if (r4 != 0) goto L8b
            java.util.Set r4 = l.C11914.f35615
            boolean r4 = r4.contains(r11)
            if (r4 != 0) goto L8b
            r14[r3] = r8
            int r4 = r3 + 1
            java.lang.String r5 = r13.mo23554()
            r15[r3] = r5
            goto L8a
        L80:
            r14[r3] = r9
            int r4 = r3 + 1
            java.lang.String r5 = r13.getName()
            r15[r3] = r5
        L8a:
            r3 = r4
        L8b:
            int r2 = r2 + 1
            goto L1b
        L8e:
            java.lang.String[] r11 = new java.lang.String[r3]
            java.lang.System.arraycopy(r14, r1, r11, r1, r3)
            java.lang.Object[] r12 = new java.lang.Object[r3]
            java.lang.System.arraycopy(r15, r1, r12, r1, r3)
            android.database.MatrixCursor r13 = new android.database.MatrixCursor
            r13.<init>(r11, r4)
            r13.addRow(r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11914.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        C11003.toString(uri);
        AbstractC15440 m29047 = m29047(uri);
        int lastIndexOf = m29047.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(m29047.getName().substring(lastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        String path = uri.getPath();
        C11003.requireNonNull(path);
        if (path.startsWith("/NOT_DELETE/")) {
            return 1;
        }
        return C16999.m39866(path, new String[0]).mo23552() ? 1 : 0;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ParcelFileDescriptor m29049(AbstractC15440 abstractC15440) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        Object systemService = C4925.m14335().getSystemService("storage");
        if (!(systemService instanceof StorageManager)) {
            return null;
        }
        StorageManager storageManager = (StorageManager) systemService;
        long mo23127 = abstractC15440.mo23127();
        C23411 m36513 = abstractC15440.m36513("r");
        try {
            return storageManager.openProxyFileDescriptor(268435456, new ProxyFileDescriptorCallbackC6269(mo23127, m36513), C1802.m5993());
        } catch (IOException unused) {
            C0349.m1793(m36513);
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        C11003.toString(uri);
        try {
            AbstractC15440 m29047 = m29047(uri);
            ParcelFileDescriptor mo27921 = m29047.mo27921(str);
            if (mo27921 != null) {
                return mo27921;
            }
            ParcelFileDescriptor m29049 = m29049(m29047);
            if (m29049 != null) {
                return m29049;
            }
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            C1802.f6208.execute(new RunnableC9960(3, m29047.mo27926(), new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1])));
            return createPipe[0];
        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e2) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException(e2.getMessage());
            fileNotFoundException.initCause(e2);
            throw fileNotFoundException;
        }
    }
}

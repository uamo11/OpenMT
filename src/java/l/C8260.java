package l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.DocumentsProvider;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import android.webkit.MimeTypeMap;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.o;
import com.google.android.material.motion.MotionUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: N9SR */
/* renamed from: l.۠ܶܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C8260 extends DocumentsProvider {

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final String[] f25418 = {"root_id", "mime_types", "flags", "icon", "title", ErrorBundle.SUMMARY_ENTRY, "document_id"};

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final String[] f25419 = {"document_id", "mime_type", "_display_name", "last_modified", "flags", "_size", "mt_extras"};

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public File f25420;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f25421;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public File f25422;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public File f25423;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public File f25424;

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.provider.DocumentsProvider, android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        this.f25421 = context.getPackageName();
        File parentFile = context.getFilesDir().getParentFile();
        this.f25422 = parentFile;
        String path = parentFile.getPath();
        if (path.startsWith("/data/user/")) {
            this.f25420 = new File(C20087.m46305(11, path, new StringBuilder("/data/user_de/")));
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            this.f25423 = externalFilesDir.getParentFile();
        }
        this.f25424 = context.getObbDir();
    }

    @Override // android.provider.DocumentsProvider
    public final String createDocument(String str, String str2, String str3) {
        StringBuilder sb;
        File m21860 = m21860(str, true);
        if (m21860 != null) {
            File file = new File(m21860, str3);
            int i = 2;
            while (file.exists()) {
                StringBuilder m19190 = C7166.m19190(str3, " (");
                m19190.append(i);
                m19190.append(MotionUtils.EASING_TYPE_FORMAT_END);
                file = new File(m21860, m19190.toString());
                i++;
            }
            try {
                if ("vnd.android.document/directory".equals(str2) ? file.mkdir() : file.createNewFile()) {
                    if (str.endsWith("/")) {
                        sb = new StringBuilder();
                        sb.append(str);
                    } else {
                        sb = new StringBuilder();
                        sb.append(str);
                        sb.append("/");
                    }
                    sb.append(file.getName());
                    return sb.toString();
                }
            } catch (IOException unused) {
            }
        }
        throw new FileNotFoundException(C19462.m44858("Failed to create document in ", str, " with name ", str3));
    }

    @Override // android.provider.DocumentsProvider
    public final void deleteDocument(String str) {
        File m21860 = m21860(str, true);
        if (m21860 == null || !m21862(m21860)) {
            throw new FileNotFoundException("Failed to delete document ".concat(str));
        }
    }

    @Override // android.provider.DocumentsProvider
    public final String getDocumentType(String str) {
        File m21860 = m21860(str, true);
        return m21860 == null ? "vnd.android.document/directory" : m21863(m21860);
    }

    @Override // android.provider.DocumentsProvider
    public final String moveDocument(String str, String str2, String str3) {
        File m21860 = m21860(str, true);
        File m218602 = m21860(str3, true);
        if (m21860 != null && m218602 != null) {
            File file = new File(m218602, m21860.getName());
            if (!file.exists() && m21860.renameTo(file)) {
                StringBuilder m15339 = str3.endsWith("/") ? C5368.m15339(str3) : C7166.m19190(str3, "/");
                m15339.append(file.getName());
                return m15339.toString();
            }
        }
        throw new FileNotFoundException(C19462.m44858("Filed to move document ", str, " to ", str3));
    }

    @Override // android.provider.DocumentsProvider
    public final String renameDocument(String str, String str2) {
        File m21860 = m21860(str, true);
        if (m21860 == null || !m21860.renameTo(new File(m21860.getParentFile(), str2))) {
            throw new FileNotFoundException(C19462.m44858("Failed to rename document ", str, " to ", str2));
        }
        return str.substring(0, str.lastIndexOf(47, str.length() - 2)) + "/" + str2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private File m21860(String str, boolean z) {
        String substring;
        if (str.startsWith(this.f25421)) {
            String substring2 = str.substring(this.f25421.length());
            if (substring2.startsWith("/")) {
                substring2 = substring2.substring(1);
            }
            File file = null;
            if (substring2.isEmpty()) {
                return null;
            }
            int indexOf = substring2.indexOf(47);
            if (indexOf == -1) {
                substring = "";
            } else {
                String substring3 = substring2.substring(0, indexOf);
                substring = substring2.substring(indexOf + 1);
                substring2 = substring3;
            }
            if (substring2.equalsIgnoreCase(e.m)) {
                file = new File(this.f25422, substring);
            } else if (substring2.equalsIgnoreCase("android_data") && this.f25423 != null) {
                file = new File(this.f25423, substring);
            } else if (substring2.equalsIgnoreCase("android_obb") && this.f25424 != null) {
                file = new File(this.f25424, substring);
            } else if (substring2.equalsIgnoreCase("user_de_data") && this.f25420 != null) {
                file = new File(this.f25420, substring);
            }
            if (file == null) {
                throw new FileNotFoundException(str.concat(" not found"));
            }
            if (!z) {
                return file;
            }
            try {
                Os.lstat(file.getPath());
                return file;
            } catch (Exception unused) {
                throw new FileNotFoundException(str.concat(" not found"));
            }
        }
        throw new FileNotFoundException(str.concat(" not found"));
    }

    @Override // android.provider.DocumentsProvider
    public final Cursor queryRoots(String[] strArr) {
        ApplicationInfo applicationInfo = getContext().getApplicationInfo();
        String charSequence = applicationInfo.loadLabel(getContext().getPackageManager()).toString();
        if (strArr == null) {
            strArr = f25418;
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        MatrixCursor.RowBuilder newRow = matrixCursor.newRow();
        newRow.add("root_id", this.f25421);
        newRow.add("document_id", this.f25421);
        newRow.add(ErrorBundle.SUMMARY_ENTRY, this.f25421);
        newRow.add("flags", 17);
        newRow.add("title", charSequence);
        newRow.add("mime_types", "*/*");
        newRow.add("icon", Integer.valueOf(applicationInfo.icon));
        return matrixCursor;
    }

    @Override // android.provider.DocumentsProvider
    public final Cursor queryDocument(String str, String[] strArr) {
        if (strArr == null) {
            strArr = f25419;
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        m21861(matrixCursor, str, null);
        return matrixCursor;
    }

    @Override // android.provider.DocumentsProvider
    public final Cursor queryChildDocuments(String str, String[] strArr, String str2) {
        if (str.endsWith("/")) {
            str = C15472.m36561(1, 0, str);
        }
        if (strArr == null) {
            strArr = f25419;
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        File m21860 = m21860(str, true);
        if (m21860 == null) {
            m21861(matrixCursor, str.concat("/data"), this.f25422);
            File file = this.f25423;
            if (file != null && file.exists()) {
                m21861(matrixCursor, str.concat("/android_data"), this.f25423);
            }
            File file2 = this.f25424;
            if (file2 != null && file2.exists()) {
                m21861(matrixCursor, str.concat("/android_obb"), this.f25424);
            }
            File file3 = this.f25420;
            if (file3 != null && file3.exists()) {
                m21861(matrixCursor, str.concat("/user_de_data"), this.f25420);
                return matrixCursor;
            }
        } else {
            File[] listFiles = m21860.listFiles();
            if (listFiles == null) {
                throw new FileNotFoundException("Failed to list directory ".concat(str));
            }
            for (File file4 : listFiles) {
                StringBuilder m19190 = C7166.m19190(str, "/");
                m19190.append(file4.getName());
                m21861(matrixCursor, m19190.toString(), file4);
            }
        }
        return matrixCursor;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004f, code lost:
    
        if (r3.equals("r") == false) goto L29;
     */
    @Override // android.provider.DocumentsProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.ParcelFileDescriptor openDocument(java.lang.String r2, java.lang.String r3, android.os.CancellationSignal r4) {
        /*
            r1 = this;
            r4 = 0
            java.io.File r0 = r1.m21860(r2, r4)
            if (r0 == 0) goto L74
            r3.getClass()
            int r2 = r3.hashCode()
            switch(r2) {
                case 114: goto L49;
                case 119: goto L3e;
                case 3653: goto L33;
                case 3786: goto L28;
                case 3805: goto L1d;
                case 113359: goto L12;
                default: goto L11;
            }
        L11:
            goto L51
        L12:
            java.lang.String r2 = "rwt"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1b
            goto L51
        L1b:
            r4 = 5
            goto L52
        L1d:
            java.lang.String r2 = "wt"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L26
            goto L51
        L26:
            r4 = 4
            goto L52
        L28:
            java.lang.String r2 = "wa"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L31
            goto L51
        L31:
            r4 = 3
            goto L52
        L33:
            java.lang.String r2 = "rw"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L3c
            goto L51
        L3c:
            r4 = 2
            goto L52
        L3e:
            java.lang.String r2 = "w"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L47
            goto L51
        L47:
            r4 = 1
            goto L52
        L49:
            java.lang.String r2 = "r"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L52
        L51:
            r4 = -1
        L52:
            switch(r4) {
                case 0: goto L6d;
                case 1: goto L6a;
                case 2: goto L67;
                case 3: goto L64;
                case 4: goto L6a;
                case 5: goto L61;
                default: goto L55;
            }
        L55:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Invalid mode: "
            java.lang.String r3 = r4.concat(r3)
            r2.<init>(r3)
            throw r2
        L61:
            r2 = 1006632960(0x3c000000, float:0.0078125)
            goto L6f
        L64:
            r2 = 704643072(0x2a000000, float:1.1368684E-13)
            goto L6f
        L67:
            r2 = 939524096(0x38000000, float:3.0517578E-5)
            goto L6f
        L6a:
            r2 = 738197504(0x2c000000, float:1.8189894E-12)
            goto L6f
        L6d:
            r2 = 268435456(0x10000000, float:2.524355E-29)
        L6f:
            android.os.ParcelFileDescriptor r2 = android.os.ParcelFileDescriptor.open(r0, r2)
            return r2
        L74:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException
            java.lang.String r4 = " not found"
            java.lang.String r2 = r2.concat(r4)
            r3.<init>(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8260.openDocument(java.lang.String, java.lang.String, android.os.CancellationSignal):android.os.ParcelFileDescriptor");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if ((android.system.Os.lstat(r5.getPath()).st_mode & 61440) == 40960) goto L17;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m21862(java.io.File r5) {
        /*
            boolean r0 = r5.isDirectory()
            if (r0 == 0) goto L32
            java.lang.String r0 = r5.getPath()     // Catch: android.system.ErrnoException -> L1a
            android.system.StructStat r0 = android.system.Os.lstat(r0)     // Catch: android.system.ErrnoException -> L1a
            int r0 = r0.st_mode     // Catch: android.system.ErrnoException -> L1a
            r1 = 61440(0xf000, float:8.6096E-41)
            r0 = r0 & r1
            r1 = 40960(0xa000, float:5.7397E-41)
            if (r0 != r1) goto L1b
            goto L32
        L1a:
        L1b:
            java.io.File[] r0 = r5.listFiles()
            if (r0 == 0) goto L32
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L24:
            if (r3 >= r1) goto L32
            r4 = r0[r3]
            boolean r4 = m21862(r4)
            if (r4 != 0) goto L2f
            return r2
        L2f:
            int r3 = r3 + 1
            goto L24
        L32:
            boolean r5 = r5.delete()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8260.m21862(java.io.File):boolean");
    }

    @Override // android.provider.DocumentsProvider
    public final void removeDocument(String str, String str2) {
        deleteDocument(str);
    }

    @Override // android.provider.DocumentsProvider
    public final boolean isChildDocument(String str, String str2) {
        return str2.startsWith(str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m21863(File file) {
        if (file.isDirectory()) {
            return "vnd.android.document/directory";
        }
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(lastIndexOf + 1).toLowerCase());
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.provider.DocumentsProvider, android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        String str3;
        int hashCode;
        Bundle call = super.call(str, str2, bundle);
        if (call != null) {
            return call;
        }
        if (!str.startsWith("mt:")) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        try {
            List<String> pathSegments = ((Uri) bundle.getParcelable("uri")).getPathSegments();
            str3 = pathSegments.size() >= 4 ? pathSegments.get(3) : pathSegments.get(1);
            hashCode = str.hashCode();
        } catch (Exception e) {
            bundle2.putBoolean(o.c, false);
            bundle2.putString("message", e.toString());
        }
        if (hashCode == -1645162251) {
            if (str.equals("mt:setPermissions")) {
                File m21860 = m21860(str3, true);
                if (m21860 == null) {
                    bundle2.putBoolean(o.c, false);
                } else {
                    try {
                        Os.chmod(m21860.getPath(), bundle.getInt("permissions"));
                        bundle2.putBoolean(o.c, true);
                    } catch (ErrnoException e2) {
                        bundle2.putBoolean(o.c, false);
                        bundle2.putString("message", e2.getMessage());
                    }
                }
                return bundle2;
            }
            bundle2.putBoolean(o.c, false);
            bundle2.putString("message", "Unsupported method: ".concat(str));
            return bundle2;
        }
        if (hashCode != 214442514) {
            if (hashCode == 1713485102 && str.equals("mt:setLastModified")) {
                File m218602 = m21860(str3, true);
                if (m218602 == null) {
                    bundle2.putBoolean(o.c, false);
                } else {
                    bundle2.putBoolean(o.c, m218602.setLastModified(bundle.getLong("time")));
                }
                return bundle2;
            }
        } else if (str.equals("mt:createSymlink")) {
            File m218603 = m21860(str3, false);
            if (m218603 == null) {
                bundle2.putBoolean(o.c, false);
            } else {
                try {
                    Os.symlink(bundle.getString(MotionUtils.EASING_TYPE_PATH), m218603.getPath());
                    bundle2.putBoolean(o.c, true);
                } catch (ErrnoException e3) {
                    bundle2.putBoolean(o.c, false);
                    bundle2.putString("message", e3.getMessage());
                }
            }
            return bundle2;
        }
        bundle2.putBoolean(o.c, false);
        bundle2.putString("message", "Unsupported method: ".concat(str));
        return bundle2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21861(MatrixCursor matrixCursor, String str, File file) {
        int i;
        String name;
        boolean z = false;
        if (file == null) {
            file = m21860(str, true);
        }
        if (file == null) {
            MatrixCursor.RowBuilder newRow = matrixCursor.newRow();
            newRow.add("document_id", this.f25421);
            newRow.add("_display_name", this.f25421);
            newRow.add("_size", 0L);
            newRow.add("mime_type", "vnd.android.document/directory");
            newRow.add("last_modified", 0);
            newRow.add("flags", 0);
            return;
        }
        if (file.isDirectory()) {
            if (file.canWrite()) {
                i = 8;
            }
            i = 0;
        } else {
            if (file.canWrite()) {
                i = 2;
            }
            i = 0;
        }
        if (file.getParentFile().canWrite()) {
            i |= 68;
        }
        String path = file.getPath();
        if (path.equals(this.f25422.getPath())) {
            name = e.m;
        } else {
            File file2 = this.f25423;
            if (file2 == null || !path.equals(file2.getPath())) {
                File file3 = this.f25424;
                if (file3 == null || !path.equals(file3.getPath())) {
                    File file4 = this.f25420;
                    if (file4 == null || !path.equals(file4.getPath())) {
                        name = file.getName();
                        z = true;
                    } else {
                        name = "user_de_data";
                    }
                } else {
                    name = "android_obb";
                }
            } else {
                name = "android_data";
            }
        }
        MatrixCursor.RowBuilder newRow2 = matrixCursor.newRow();
        newRow2.add("document_id", str);
        newRow2.add("_display_name", name);
        newRow2.add("_size", Long.valueOf(file.length()));
        newRow2.add("mime_type", m21863(file));
        newRow2.add("last_modified", Long.valueOf(file.lastModified()));
        newRow2.add("flags", Integer.valueOf(i));
        newRow2.add("mt_path", file.getAbsolutePath());
        if (z) {
            try {
                StringBuilder sb = new StringBuilder();
                StructStat lstat = Os.lstat(path);
                sb.append(lstat.st_mode);
                sb.append("|");
                sb.append(lstat.st_uid);
                sb.append("|");
                sb.append(lstat.st_gid);
                if ((lstat.st_mode & 61440) == 40960) {
                    sb.append("|");
                    sb.append(Os.readlink(path));
                }
                newRow2.add("mt_extras", sb.toString());
            } catch (Exception unused) {
            }
        }
    }
}

package l;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: 3650 */
/* renamed from: l.᩹ۙ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C22049 extends ContentProvider {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f70675 = new Object();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f70676;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC14992 f70677;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String[] f70673 = {"_display_name", "_size"};

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final File f70672 = new File("/");

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final HashMap f70674 = new HashMap();

    @Override // android.content.ContentProvider
    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
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
        String str = providerInfo.authority.split(l.b)[0];
        synchronized (this.f70675) {
            this.f70676 = str;
        }
        HashMap hashMap = f70674;
        synchronized (hashMap) {
            hashMap.remove(str);
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File mo35518 = m49608().mo35518(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f70673;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? mo35518.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(mo35518.length());
            }
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File mo35518 = m49608().mo35518(uri);
        int lastIndexOf = mo35518.getName().lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(mo35518.getName().substring(lastIndexOf + 1));
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
        return m49608().mo35518(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File mo35518 = m49608().mo35518(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                throw new IllegalArgumentException(C20094.m46315("Invalid mode: ", str));
            }
            i = 1006632960;
        }
        return ParcelFileDescriptor.open(mo35518, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InterfaceC14992 m49608() {
        InterfaceC14992 interfaceC14992;
        synchronized (this.f70675) {
            if (this.f70676 == null) {
                throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
            }
            if (this.f70677 == null) {
                this.f70677 = m49609(getContext(), this.f70676);
            }
            interfaceC14992 = this.f70677;
        }
        return interfaceC14992;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC14992 m49609(Context context, String str) {
        InterfaceC14992 interfaceC14992;
        HashMap hashMap = f70674;
        synchronized (hashMap) {
            interfaceC14992 = (InterfaceC14992) hashMap.get(str);
            if (interfaceC14992 == null) {
                try {
                    try {
                        interfaceC14992 = m49610(context, str);
                        hashMap.put(str, interfaceC14992);
                    } catch (XmlPullParserException e) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                    }
                } catch (IOException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return interfaceC14992;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C21344 m49610(Context context, String str) {
        C21344 c21344 = new C21344();
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider == null) {
            throw new IllegalArgumentException(C20094.m46315("Couldn't find meta-data for provider with authority ", str));
        }
        XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = loadXmlMetaData.next();
            if (next == 1) {
                return c21344;
            }
            if (next == 2) {
                String name = loadXmlMetaData.getName();
                File file = null;
                String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                String attributeValue2 = loadXmlMetaData.getAttributeValue(null, MotionUtils.EASING_TYPE_PATH);
                if ("root-path".equals(name)) {
                    file = f70672;
                } else if ("files-path".equals(name)) {
                    file = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    file = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                    if (externalFilesDirs.length > 0) {
                        file = externalFilesDirs[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] externalCacheDirs = context.getExternalCacheDirs();
                    if (externalCacheDirs.length > 0) {
                        file = externalCacheDirs[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] m21242 = C7937.m21242(context);
                    if (m21242.length > 0) {
                        file = m21242[0];
                    }
                }
                if (file != null) {
                    String str2 = new String[]{attributeValue2}[0];
                    if (str2 != null) {
                        file = new File(file, str2);
                    }
                    c21344.m48377(file, attributeValue);
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m49607(String str) {
        return (str.length() <= 0 || C7416.m19937(1, str) != '/') ? str : C15472.m36561(1, 0, str);
    }
}

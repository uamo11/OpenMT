package l;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.material.badge.BadgeState;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* compiled from: 77BV */
/* renamed from: l.ۜ᩵ۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6970 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f21484 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C20844 f21485 = C20844.f67485;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static List f21486;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static long f21487;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14730 m18838(InterfaceC17889 interfaceC17889) {
        String str;
        int mo9351 = f21485.mo9351(interfaceC17889);
        switch (mo9351) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                str = "full";
                break;
            case 7:
            case 8:
            case 10:
            case 11:
                str = BadgeState.BADGE_RESOURCE_TAG;
                break;
            case 9:
            default:
                str = null;
                break;
        }
        if (str == null || !m18842(interfaceC17889, mo9351)) {
            return null;
        }
        return new C14730(str, m18836(interfaceC17889, mo9351));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C23903 m18841(String str) {
        String str2;
        ApplicationInfo applicationInfo;
        Bitmap m40790;
        C9555 m18837 = m18837(str);
        if (m18837 != null) {
            C20844 c20844 = f21485;
            int mo9351 = c20844.mo9351(m18837);
            switch (mo9351) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    str2 = "full";
                    break;
                case 7:
                case 8:
                case 10:
                case 11:
                    str2 = BadgeState.BADGE_RESOURCE_TAG;
                    break;
                case 9:
                default:
                    str2 = null;
                    break;
            }
            if (str2 != null && m18842(m18837, mo9351)) {
                boolean m18839 = false;
                if ("full".equals(str2)) {
                    C11813 mo9350 = c20844.mo9350((AbstractC16891) null, m18837, mo9351);
                    String m18836 = m18836(m18837, mo9351);
                    if (mo9351 == 1 || mo9351 == 2) {
                        m18839 = m18839(mo9350, C19883.f64215.f64250);
                    } else if (mo9351 == 4) {
                        m18839 = m18839(mo9350, C19883.f64188.f64250);
                    } else if (mo9351 == 5) {
                        m18839 = m18839(mo9350, C19883.f64205.f64250);
                    }
                    if (m18839) {
                        return new C23903("damaged", null, m18836);
                    }
                    if (!m18839(mo9350, m18837.mo36973().m7317().f64250)) {
                        return new C23903("png", m18840(mo9350.m28877()), m18836);
                    }
                } else {
                    String m188362 = m18836(m18837, mo9351);
                    if (mo9351 != 7) {
                        if (mo9351 != 8) {
                            if (mo9351 != 10) {
                                if (mo9351 == 11 && m188362 != null && (m40790 = C17447.m40790(m18837.mo24433())) != null) {
                                    return new C23903("png", m18840(m18834(new BitmapDrawable(C4925.m14338(), m40790))), m188362);
                                }
                            } else if (m188362 != null) {
                                return m18843(m188362);
                            }
                        } else if (m188362 != null) {
                            String path = m18837.getPath();
                            File file = new File(path, "base.apk");
                            if (!file.exists()) {
                                File[] listFiles = new File(path).listFiles();
                                if (listFiles != null) {
                                    File m18835 = m18835(listFiles);
                                    if (m18835 == null) {
                                        int length = listFiles.length;
                                        int i = 0;
                                        while (true) {
                                            if (i < length) {
                                                File file2 = listFiles[i];
                                                File file3 = new File(file2, "base.apk");
                                                if (file2.isDirectory() && file3.exists()) {
                                                    m18835 = file3;
                                                } else {
                                                    i++;
                                                }
                                            }
                                        }
                                    }
                                    if (m18835 == null) {
                                        for (File file4 : listFiles) {
                                            if (!file4.isDirectory() || (m18835 = m18835(file4.listFiles())) == null) {
                                            }
                                        }
                                    }
                                    file = m18835;
                                } else {
                                    if (Build.VERSION.SDK_INT >= 34) {
                                        long uptimeMillis = SystemClock.uptimeMillis();
                                        if (f21486 == null || uptimeMillis - f21487 > 10000) {
                                            try {
                                                f21486 = (List) C5378.stream(C4925.m14320().getInstalledPackages(0)).map(new C16599(2)).filter(new C17553(0)).collect(C22976.toList());
                                            } catch (RuntimeException unused) {
                                                f21486 = Collections.EMPTY_LIST;
                                            }
                                            f21487 = uptimeMillis;
                                        }
                                        for (String str3 : f21486) {
                                            if (str3.startsWith(path)) {
                                                File file5 = new File(str3);
                                                if (file5.exists()) {
                                                    file = file5;
                                                }
                                            }
                                        }
                                    }
                                    file = null;
                                }
                            }
                            if (file == null) {
                                return null;
                            }
                            try {
                                PackageManager m14320 = C4925.m14320();
                                PackageInfo packageArchiveInfo = m14320.getPackageArchiveInfo(file.getPath(), 1);
                                if (packageArchiveInfo != null && (applicationInfo = packageArchiveInfo.applicationInfo) != null) {
                                    applicationInfo.publicSourceDir = file.getPath();
                                    applicationInfo.sourceDir = file.getPath();
                                    C3816.m11502(applicationInfo.icon, applicationInfo.packageName);
                                    return new C23903("png", m18840(m18834(applicationInfo.loadIcon(m14320))), m188362);
                                }
                                return null;
                            } catch (Throwable unused2) {
                                return null;
                            }
                        }
                    } else if (m188362 != null) {
                        return m18843(m188362);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9555 m18837(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        C2499 c2499 = C2499.f7958;
        InterfaceC17889 mo7638 = c2499.mo7638(str);
        if (mo7638 != null || str.endsWith("/")) {
            return (C9555) mo7638;
        }
        return (C9555) c2499.mo7638(str.concat("/"));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b A[RETURN] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m18842(l.InterfaceC17889 r5, int r6) {
        /*
            if (r6 != 0) goto L3
            goto L2c
        L3:
            l.ܶ᩵ܿ r0 = r5.mo24433()
            r1 = 1
            switch(r6) {
                case 1: goto Lc;
                case 2: goto L18;
                case 3: goto L18;
                case 4: goto L18;
                case 5: goto L18;
                case 6: goto L18;
                case 7: goto L2b;
                case 8: goto L2b;
                case 9: goto Lb;
                case 10: goto L2b;
                case 11: goto L18;
                default: goto Lb;
            }
        Lb:
            goto L2c
        Lc:
            long r5 = r5.getSize()
            r2 = 268435456(0x10000000, double:1.32624737E-315)
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 <= 0) goto L18
            goto L2c
        L18:
            r0.getClass()
            boolean r5 = r0 instanceof l.C6849
            if (r5 == 0) goto L2b
            android.content.SharedPreferences r5 = l.ApplicationC20075.f65010
            if (r5 == 0) goto L2b
            java.lang.String r6 = "external_storage_thumb_enable"
            boolean r5 = r5.getBoolean(r6, r1)
            if (r5 == 0) goto L2c
        L2b:
            return r1
        L2c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6970.m18842(l.ᩳۜܳ, int):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m18839(C11813 c11813, C11813 c118132) {
        if (c11813 == c118132) {
            return true;
        }
        return (c11813 == null || c118132 == null || c11813.m28877() != c118132.m28877()) ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m18836(InterfaceC17889 interfaceC17889, int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 11:
                C20844 c20844 = C20844.f67485;
                String path = interfaceC17889.getPath();
                long size = interfaceC17889.getSize();
                long time = interfaceC17889.getTime();
                int i2 = C13110.f39245;
                return C14460.m34530(path + size + time).toLowerCase();
            case 7:
                return interfaceC17889.getName();
            case 8:
                return interfaceC17889.getPath();
            case 10:
                if (interfaceC17889 instanceof C9555) {
                    try {
                        C4027 m24434 = ((C9555) interfaceC17889).m24434();
                        Uri uri = m24434 == null ? null : m24434.f12779;
                        if (uri != null) {
                            int i3 = C18844.f59431;
                            if (uri.getAuthority().endsWith(".MTDataFilesProvider")) {
                                return C18844.m43539(uri);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            case 9:
            default:
                return null;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C23903 m18843(String str) {
        try {
            PackageInfo packageInfo = C4925.m14320().getPackageInfo(str, 1);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                C3816.m11502(applicationInfo.icon, str);
            }
            return new C23903("png", m18840(m18834(RunnableC5974.m16749(packageInfo))), str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static File m18835(File[] fileArr) {
        if (fileArr == null) {
            return null;
        }
        for (File file : fileArr) {
            if (file.isFile() && file.getName().toLowerCase().endsWith(".apk")) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m18840(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m18834(Drawable drawable) {
        int m27878 = C11266.m27878(32.0f);
        int m278782 = C11266.m27878(15.0f);
        Bitmap createBitmap = Bitmap.createBitmap(m27878, m27878, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect copyBounds = drawable.copyBounds();
        drawable.setBounds(m278782, m278782, m27878, m27878);
        drawable.draw(canvas);
        drawable.setBounds(copyBounds);
        return createBitmap;
    }
}

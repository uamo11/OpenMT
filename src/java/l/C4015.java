package l;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: W8T8 */
/* renamed from: l.ۘܶ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4015 extends AbstractC2399 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C3104 f12746;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f12747;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AssetFileDescriptor f12748;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Context f12749;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public FileInputStream f12750;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f12751;

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    public C4015(Context context) {
        super(false);
        this.f12749 = context.getApplicationContext();
    }

    @Override // l.InterfaceC21449
    /* renamed from: ֫ */
    public final long mo1620(C3104 c3104) {
        Resources resourcesForApplication;
        int parseInt;
        int i;
        Resources resources;
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        this.f12746 = c3104;
        m7774(c3104);
        Uri uri = c3104.f9711;
        long j = c3104.f9713;
        long j2 = c3104.f9718;
        Uri normalizeScheme = uri.normalizeScheme();
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Context context = this.f12749;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new C2604("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new C2604("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                throw new C2604("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new C2604("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new C2604("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(C22870.m50967(packageName, ":", path), "raw", null);
                if (parseInt == 0) {
                    throw new C2604("Resource not found.", null, 2005);
                }
            }
            i = parseInt;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i);
            if (openRawResourceFd == null) {
                throw new C2604("Resource is compressed: " + normalizeScheme, null, 2000);
            }
            this.f12748 = openRawResourceFd;
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f12748.getFileDescriptor());
            this.f12750 = fileInputStream;
            try {
                if (length != -1 && j2 > length) {
                    throw new C2604(null, null, 2008);
                }
                long startOffset = this.f12748.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (skip != j2) {
                    throw new C2604(null, null, 2008);
                }
                if (length == -1) {
                    convertMaybeLegacyFileChannelFromLibrary = C12084.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                    if (convertMaybeLegacyFileChannelFromLibrary.size() == 0) {
                        this.f12751 = -1L;
                    } else {
                        long size = convertMaybeLegacyFileChannelFromLibrary.size() - convertMaybeLegacyFileChannelFromLibrary.position();
                        this.f12751 = size;
                        if (size < 0) {
                            throw new C2604(null, null, 2008);
                        }
                    }
                } else {
                    long j3 = length - skip;
                    this.f12751 = j3;
                    if (j3 < 0) {
                        throw new C22154(2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.f12751;
                    this.f12751 = j4 == -1 ? j : Math.min(j4, j);
                }
                this.f12747 = true;
                m7776(c3104);
                return j != -1 ? j : this.f12751;
            } catch (C2604 e2) {
                throw e2;
            } catch (IOException e3) {
                throw new C2604(null, e3, 2000);
            }
        } catch (Resources.NotFoundException e4) {
            throw new C2604(null, e4, 2005);
        }
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f12751;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new C2604(null, e, 2000);
                }
            }
            FileInputStream fileInputStream = this.f12750;
            String str = C3603.f11424;
            int read = fileInputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.f12751;
                if (j2 != -1) {
                    this.f12751 = j2 - read;
                }
                m7777(read);
                return read;
            }
            if (this.f12751 != -1) {
                throw new C2604("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }

    @Override // l.InterfaceC21449
    /* renamed from: ܿ */
    public final Uri mo1621() {
        C3104 c3104 = this.f12746;
        if (c3104 != null) {
            return c3104.f9711;
        }
        return null;
    }

    @Override // l.InterfaceC21449
    public final void close() {
        this.f12746 = null;
        try {
            try {
                FileInputStream fileInputStream = this.f12750;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f12750 = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f12748;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f12748 = null;
                        if (this.f12747) {
                            this.f12747 = false;
                            m7775();
                        }
                    }
                } catch (IOException e) {
                    throw new C2604(null, e, 2000);
                }
            } catch (IOException e2) {
                throw new C2604(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.f12750 = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f12748;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f12748 = null;
                    if (this.f12747) {
                        this.f12747 = false;
                        m7775();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new C2604(null, e3, 2000);
                }
            } finally {
                this.f12748 = null;
                if (this.f12747) {
                    this.f12747 = false;
                    m7775();
                }
            }
        }
    }
}

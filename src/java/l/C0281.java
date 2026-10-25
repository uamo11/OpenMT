package l;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: R8K9 */
/* renamed from: l.֡۠֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0281 extends AbstractC2399 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f1616;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Uri f1617;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f1618;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AssetFileDescriptor f1619;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ContentResolver f1620;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public FileInputStream f1621;

    public C0281(Context context) {
        super(false);
        this.f1620 = context.getContentResolver();
    }

    @Override // l.InterfaceC21449
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo1620(C3104 c3104) {
        int i;
        AssetFileDescriptor openAssetFileDescriptor;
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        try {
            try {
                Uri uri = c3104.f9711;
                long j = c3104.f9713;
                long j2 = c3104.f9718;
                Uri normalizeScheme = uri.normalizeScheme();
                this.f1617 = normalizeScheme;
                m7774(c3104);
                boolean equals = C11003.equals(normalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.f1620;
                if (equals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.f1619 = openAssetFileDescriptor;
                if (openAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new C19333(2000, new IOException("Could not open file descriptor for: " + normalizeScheme));
                    } catch (IOException e) {
                        e = e;
                        if (e instanceof FileNotFoundException) {
                            i = 2005;
                        }
                        throw new C19333(i, e);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f1621 = fileInputStream;
                if (length != -1 && j2 > length) {
                    throw new C19333(2008, null);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (skip != j2) {
                    throw new C19333(2008, null);
                }
                if (length == -1) {
                    convertMaybeLegacyFileChannelFromLibrary = C12084.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                    long size = convertMaybeLegacyFileChannelFromLibrary.size();
                    if (size == 0) {
                        this.f1618 = -1L;
                    } else {
                        long position = size - convertMaybeLegacyFileChannelFromLibrary.position();
                        this.f1618 = position;
                        if (position < 0) {
                            throw new C19333(2008, null);
                        }
                    }
                } else {
                    long j3 = length - skip;
                    this.f1618 = j3;
                    if (j3 < 0) {
                        throw new C19333(2008, null);
                    }
                }
                if (j != -1) {
                    long j4 = this.f1618;
                    this.f1618 = j4 == -1 ? j : Math.min(j4, j);
                }
                this.f1616 = true;
                m7776(c3104);
                return j != -1 ? j : this.f1618;
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (C19333 e3) {
            throw e3;
        }
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f1618;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new C19333(2000, e);
                }
            }
            FileInputStream fileInputStream = this.f1621;
            String str = C3603.f11424;
            int read = fileInputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.f1618;
                if (j2 != -1) {
                    this.f1618 = j2 - read;
                }
                m7777(read);
                return read;
            }
        }
        return -1;
    }

    @Override // l.InterfaceC21449
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Uri mo1621() {
        return this.f1617;
    }

    @Override // l.InterfaceC21449
    public final void close() {
        this.f1617 = null;
        try {
            try {
                FileInputStream fileInputStream = this.f1621;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f1621 = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f1619;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.f1619 = null;
                        if (this.f1616) {
                            this.f1616 = false;
                            m7775();
                        }
                    }
                } catch (IOException e) {
                    throw new C19333(2000, e);
                }
            } catch (IOException e2) {
                throw new C19333(2000, e2);
            }
        } catch (Throwable th) {
            this.f1621 = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f1619;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f1619 = null;
                    if (this.f1616) {
                        this.f1616 = false;
                        m7775();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new C19333(2000, e3);
                }
            } finally {
                this.f1619 = null;
                if (this.f1616) {
                    this.f1616 = false;
                    m7775();
                }
            }
        }
    }
}

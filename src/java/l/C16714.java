package l;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: G1W6 */
/* renamed from: l.ܽܶ֫, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16714 extends AbstractC2399 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Uri f51332;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public RandomAccessFile f51333;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f51334;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f51335;

    @Override // l.InterfaceC21449
    /* renamed from: ֫ */
    public final long mo1620(C3104 c3104) {
        Uri uri = c3104.f9711;
        long j = c3104.f9718;
        this.f51332 = uri;
        m7774(c3104);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f51333 = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long j2 = c3104.f9713;
                if (j2 == -1) {
                    j2 = this.f51333.length() - j;
                }
                this.f51334 = j2;
                if (j2 < 0) {
                    throw new C11071(null, null, 2008);
                }
                this.f51335 = true;
                m7776(c3104);
                return this.f51334;
            } catch (IOException e) {
                throw new C11071(2000, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new C11071(((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005, e2);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder m10501 = C3435.m10501("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            m10501.append(fragment);
            throw new C11071(m10501.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new C11071(2006, e3);
        } catch (RuntimeException e4) {
            throw new C11071(2000, e4);
        }
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f51334;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f51333;
            String str = C3603.f11424;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.f51334 -= read;
                m7777(read);
            }
            return read;
        } catch (IOException e) {
            throw new C11071(2000, e);
        }
    }

    @Override // l.InterfaceC21449
    /* renamed from: ܿ */
    public final Uri mo1621() {
        return this.f51332;
    }

    @Override // l.InterfaceC21449
    public final void close() {
        this.f51332 = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f51333;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new C11071(2000, e);
            }
        } finally {
            this.f51333 = null;
            if (this.f51335) {
                this.f51335 = false;
                m7775();
            }
        }
    }
}

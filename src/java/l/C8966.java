package l;

import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: 59S0 */
/* renamed from: l.ۡܶܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C8966 extends AbstractC9155 {

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f27235;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f27236;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public transient C4027 f27237;

    @Override // l.AbstractC15440
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C8966 mo23124() {
        return this;
    }

    @Override // l.AbstractC15440
    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public final boolean mo23126() {
        return true;
    }

    public C8966(File file, Uri uri, C4027 c4027) {
        super(file, uri);
        this.f27237 = c4027;
        this.f27236 = c4027.f12783;
        String path = file.getPath();
        this.f27235 = path.length() != 18 ? false : path.equalsIgnoreCase(c4027.m12120());
    }

    @Override // l.AbstractC9155
    /* renamed from: ֫ */
    public C8966 mo18536(File file, Uri uri) {
        return new C8966(file, uri, m23116());
    }

    /* renamed from: ֫ܽ, reason: not valid java name and contains not printable characters */
    public final C4027 m23116() {
        C4027 c4027 = this.f27237;
        if (c4027 != null) {
            return c4027;
        }
        C4027 m43531 = C18844.m43531(this.f27236);
        C11003.requireNonNull(m43531);
        this.f27237 = m43531;
        return m43531;
    }

    @Override // l.AbstractC9155, l.C14798
    /* renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public void mo23125() {
        super.mo23125();
        String str = mo31567().getPathSegments().get(3);
        C4027 m23116 = m23116();
        synchronized (m23116.f12780) {
            Iterator it = m23116.f12780.values().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next())) {
                    it.remove();
                }
            }
        }
        C1802.m5991(new RunnableC16622(2, m23116), m23116, 500L);
    }

    @Override // l.AbstractC9155
    /* renamed from: ᩺ۧ, reason: not valid java name and contains not printable characters */
    public final void mo23128() {
        Cursor query = C4925.m14336().query(m23116().f12779, new String[]{"document_id", "_display_name"}, null, null, null);
        if (query == null) {
            try {
                C1204.m4048(this);
            } catch (Throwable th) {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (query != null) {
            query.close();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m23121(File file, Uri uri, boolean z) {
        String substring = file.getPath().substring(19);
        boolean z2 = !z && file.getName().equals(C14609.m34870(uri));
        C4027 m23116 = m23116();
        String m12121 = m23116.m12121(substring, z2);
        String str = uri.getPathSegments().get(3);
        if (m12121.equals(str)) {
            return;
        }
        m23116.f12780.put(C9045.m23341(new StringBuilder(), m23116.f12778, substring), str);
        C1802.m5991(new RunnableC16622(2, m23116), m23116, 500L);
    }

    @Override // l.AbstractC9155
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo23115(File file, Uri uri, boolean z) {
        m23121(file, uri, z);
    }

    @Override // l.C14798
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo23114(Uri uri, boolean z) {
        super.mo23114(uri, z);
        m23121(new File(this.f27709.getPath()), uri, z);
    }

    @Override // l.AbstractC9155, l.C14798, l.AbstractC15440
    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public final boolean mo23113() {
        if (this.f27235) {
            return true;
        }
        return super.mo23113();
    }

    @Override // l.AbstractC9155, l.C14798, l.AbstractC15440
    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public final long mo23117() {
        if (this.f27235) {
            return 0L;
        }
        return super.mo23117();
    }

    @Override // l.AbstractC9155, l.C14798, l.AbstractC15440
    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public final boolean mo23119() {
        if (this.f27235) {
            return false;
        }
        return super.mo23119();
    }

    @Override // l.AbstractC9155, l.C14798, l.AbstractC15440
    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean mo23120() {
        if (this.f27235) {
            return true;
        }
        return super.mo23120();
    }

    /* renamed from: ܳܽ, reason: not valid java name and contains not printable characters */
    public final boolean m23123() {
        return this.f27235;
    }

    @Override // l.AbstractC9155, l.C14798, l.AbstractC15440
    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public final long mo23127() {
        if (this.f27235) {
            return -1L;
        }
        return super.mo23127();
    }

    @Override // l.AbstractC9155
    /* renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo23122() {
        return "com.android.mtp.documents".equals(mo31567().getAuthority());
    }

    @Override // l.AbstractC9155
    /* renamed from: ۟ۧ, reason: not valid java name and contains not printable characters */
    public boolean mo23118() {
        if (this.f27235) {
            return true;
        }
        C4027 m23116 = m23116();
        Uri uri = m23116.f12779;
        Uri m34869 = C14609.m34869(uri);
        String path = this.f27709.getPath();
        int length = m23116.m12120().length() + 1;
        boolean z = true;
        while (length < path.length()) {
            int indexOf = path.indexOf(47, length);
            if (indexOf < 0) {
                indexOf = path.length();
            }
            String substring = path.substring(length, indexOf);
            Cursor query = C4925.m14336().query(C14609.m34867(m34869), new String[]{"document_id", "_display_name", "mime_type"}, null, null, null);
            if (query == null) {
                throw new IOException("Provider directory is unavailable");
            }
            Uri uri2 = null;
            while (query.moveToNext()) {
                try {
                    String string = query.getString(1);
                    String string2 = query.getString(0);
                    if (string == null || string2 == null) {
                        throw new IOException("Provider returned invalid child identity");
                    }
                    if (substring.equals(string)) {
                        Uri buildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, string2);
                        if (uri2 != null && !uri2.equals(buildDocumentUriUsingTree)) {
                            throw new IOException("Provider path has ambiguous child names");
                        }
                        uri2 = buildDocumentUriUsingTree;
                        z = "vnd.android.document/directory".equals(query.getString(2));
                    }
                } catch (Throwable th) {
                    if (query != null) {
                        try {
                            query.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            query.close();
            if (uri2 == null) {
                return false;
            }
            if (indexOf < path.length() && !z) {
                throw new IOException("Provider path parent is not a directory");
            }
            length = indexOf + 1;
            m34869 = uri2;
        }
        if (!m34869.equals(mo31567())) {
            mo23114(m34869, z);
        }
        return true;
    }
}

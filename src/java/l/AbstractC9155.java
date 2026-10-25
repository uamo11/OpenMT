package l;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import com.alipay.sdk.app.OpenAuthTask;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: O9SL */
/* renamed from: l.ۡ᩸ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC9155 extends C14798 {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String[] f27708;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final File f27709;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C9861 f27710;

    /* renamed from: ֫ */
    public abstract AbstractC9155 mo18536(File file, Uri uri);

    /* renamed from: ֫ */
    public void mo23115(File file, Uri uri, boolean z) {
    }

    /* renamed from: ۟ۧ */
    public boolean mo23118() {
        return true;
    }

    @Override // l.AbstractC15440
    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo23547() {
        return true;
    }

    /* renamed from: ۨۧ */
    public boolean mo23122() {
        return false;
    }

    /* renamed from: ᩺ۧ */
    public void mo23128() {
    }

    public AbstractC9155(File file, Uri uri) {
        super(uri);
        this.f27709 = file;
    }

    @Override // l.AbstractC15440
    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 mo23559() {
        return mo18536(this.f27709.getAbsoluteFile(), mo31567());
    }

    @Override // l.AbstractC15440
    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final String mo23544() {
        return this.f27709.getAbsolutePath();
    }

    @Override // l.C14798, l.AbstractC15440
    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean mo23545() {
        if (C10975.m27285()) {
            return ((Boolean) C14798.m35183(new Callable() { // from class: l.᩷᩸ܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Boolean valueOf;
                    AbstractC9155 abstractC9155 = AbstractC9155.this;
                    valueOf = Boolean.valueOf(!r1.mo23120() && r1.m23539());
                    return valueOf;
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return !mo23120() && m23539();
    }

    /* renamed from: ܳܽ, reason: not valid java name and contains not printable characters */
    private boolean m23539() {
        AbstractC15440 m36536 = m36536();
        if (m36536 != null && m36536.mo31568()) {
            Uri mo31567 = m36536.mo31567();
            File file = this.f27709;
            Uri m52452 = C23782.m52452(mo31567, "*/*", file.getName());
            if (m52452 != null) {
                if (C11003.equals(C14609.m34870(m52452), file.getName())) {
                    return true;
                }
                if (C11003.equals(C23782.m52459(m52452), file.getName())) {
                    mo23114(m52452, false);
                    return true;
                }
                C23782.m52458(m52452);
            }
        }
        return false;
    }

    @Override // l.C14798, l.AbstractC15440
    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo23546() {
        if (C10975.m27285()) {
            return ((Boolean) C14798.m35183(new Callable() { // from class: l.᩻᩸ܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    boolean m23537;
                    m23537 = AbstractC9155.this.m23537();
                    return Boolean.valueOf(m23537);
                }
            }, Boolean.FALSE, 500)).booleanValue();
        }
        return m23537();
    }

    @Override // l.AbstractC15440
    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC10503 mo23558() {
        return new C2805(this);
    }

    /* renamed from: ۗۧ */
    public AbstractC9155 mo18538() {
        AbstractC15440 m36536 = m36536();
        if (m36536 instanceof AbstractC9155) {
            return (AbstractC9155) m36536;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* renamed from: ֫ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m23537() {
        /*
            r5 = this;
            boolean r0 = r5.mo23120()
            if (r0 == 0) goto Lb
            boolean r0 = r5.mo23113()
            return r0
        Lb:
            l.ܶ᩵ܿ r0 = r5.m36514()
            boolean r1 = r0 instanceof l.AbstractC9155
            r2 = 0
            if (r1 == 0) goto L22
            l.ۡ᩸ܿ r0 = (l.AbstractC9155) r0
            boolean r1 = r0.m23537()
            if (r1 != 0) goto L1d
            goto L63
        L1d:
            android.net.Uri r0 = r0.mo31567()
            goto L30
        L22:
            boolean r0 = r0.mo23546()
            if (r0 == 0) goto L63
            android.net.Uri r0 = r5.mo31567()
            android.net.Uri r0 = l.C14609.m34872(r0)
        L30:
            java.io.File r1 = r5.f27709
            java.lang.String r3 = r1.getName()
            java.lang.String r4 = "vnd.android.document/directory"
            android.net.Uri r0 = l.C23782.m52452(r0, r4, r3)
            if (r0 == 0) goto L63
            java.lang.String r3 = l.C14609.m34870(r0)
            java.lang.String r4 = r1.getName()
            boolean r3 = l.C11003.equals(r3, r4)
            r4 = 1
            if (r3 == 0) goto L4e
            return r4
        L4e:
            java.lang.String r3 = l.C23782.m52459(r0)
            java.lang.String r1 = r1.getName()
            boolean r1 = l.C11003.equals(r3, r1)
            if (r1 == 0) goto L60
            r5.mo23114(r0, r4)
            return r4
        L60:
            l.C23782.m52458(r0)
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC9155.m23537():boolean");
    }

    @Override // l.C14798, l.AbstractC15440
    public final String getName() {
        return this.f27709.getName();
    }

    @Override // l.C14798, l.AbstractC15440
    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final String mo23554() {
        return this.f27709.getPath();
    }

    @Override // l.C14798, l.AbstractC15440
    public final String getParent() {
        return this.f27709.getParent();
    }

    @Override // l.C14798, l.AbstractC15440
    /* renamed from: ۤ */
    public boolean mo23120() {
        if (this.f27710 != null) {
            return true;
        }
        return super.mo23120();
    }

    @Override // l.C14798, l.AbstractC15440
    /* renamed from: ۠֫ */
    public boolean mo23119() {
        if (this.f27710 != null) {
            return !r0.f29833;
        }
        return super.mo23119();
    }

    @Override // l.C14798, l.AbstractC15440
    /* renamed from: ֨֫ */
    public boolean mo23113() {
        C9861 c9861 = this.f27710;
        if (c9861 != null) {
            return c9861.f29833;
        }
        return super.mo23113();
    }

    @Override // l.C14798, l.AbstractC15440
    /* renamed from: ᩺֫ */
    public long mo23127() {
        C9861 c9861 = this.f27710;
        if (c9861 != null) {
            return c9861.f29832;
        }
        return super.mo23127();
    }

    @Override // l.C14798, l.AbstractC15440
    /* renamed from: ۛ֫ */
    public long mo23117() {
        C9861 c9861 = this.f27710;
        if (c9861 != null) {
            return c9861.f29834;
        }
        return super.mo23117();
    }

    @Override // l.C14798, l.AbstractC15440
    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean mo23552() {
        if (C23782.m52458(mo31567())) {
            mo23125();
            return true;
        }
        if (!mo23113()) {
            return false;
        }
        Iterator it = ((ArrayList) mo23549(true)).iterator();
        while (it.hasNext()) {
            if (!((AbstractC9155) ((AbstractC15440) it.next())).m23540()) {
                return false;
            }
        }
        if (!C23782.m52458(mo31567())) {
            return false;
        }
        mo23125();
        return true;
    }

    /* renamed from: ᩻ܽ, reason: not valid java name and contains not printable characters */
    private boolean m23540() {
        if (mo23113()) {
            Iterator it = ((ArrayList) mo23549(true)).iterator();
            while (it.hasNext()) {
                if (!((AbstractC9155) ((AbstractC15440) it.next())).m23540()) {
                    return false;
                }
            }
        }
        if (!C23782.m52458(mo31567())) {
            return false;
        }
        mo23125();
        return true;
    }

    @Override // l.C14798, l.AbstractC15440
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo23551(final AbstractC15440 abstractC15440) {
        if (C10975.m27285()) {
            return ((Boolean) C14798.m35183(new Callable() { // from class: l.ۜ᩸ܿ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(AbstractC9155.this.m23556(abstractC15440));
                }
            }, Boolean.FALSE, OpenAuthTask.Duplex)).booleanValue();
        }
        return m23556(abstractC15440);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m23556(AbstractC15440 abstractC15440) {
        Uri moveDocument;
        if (abstractC15440.mo23547()) {
            AbstractC9155 abstractC9155 = (AbstractC9155) abstractC15440;
            File file = abstractC9155.f27709;
            if (C11003.equals(mo18539(), abstractC9155.mo18539()) && (!abstractC9155.mo23120() || abstractC9155.mo23552())) {
                File file2 = this.f27709;
                try {
                    if (C11003.equals(file2.getParent(), file.getParent())) {
                        String name = file.getName();
                        Uri renameDocument = DocumentsContract.renameDocument(C4925.m14336(), mo31567(), name);
                        if (renameDocument != null) {
                            if (C14609.m34870(renameDocument).equals(name)) {
                                mo23125();
                                return true;
                            }
                            if (C11003.equals(C23782.m52459(renameDocument), name)) {
                                mo23125();
                                return true;
                            }
                            DocumentsContract.renameDocument(C4925.m14336(), renameDocument, file2.getName());
                            return false;
                        }
                    } else {
                        AbstractC15440 m36536 = m36536();
                        AbstractC15440 m365362 = abstractC9155.m36536();
                        if (m36536 != null && m365362 != null && (moveDocument = DocumentsContract.moveDocument(C4925.m14336(), mo31567(), m36536.mo31567(), m365362.mo31567())) != null) {
                            if (C14609.m34870(moveDocument).equals(file.getName())) {
                                mo23125();
                                return true;
                            }
                            if (C11003.equals(C23782.m52459(moveDocument), file.getName())) {
                                mo23125();
                                return true;
                            }
                            DocumentsContract.moveDocument(C4925.m14336(), moveDocument, m365362.mo31567(), m36536.mo31567());
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    /* renamed from: ۛۧ */
    public String mo18539() {
        Uri mo31567 = mo31567();
        return new Uri.Builder().scheme("content").authority(mo31567.getAuthority()).appendPath("tree").appendPath(mo31567.getPathSegments().get(1)).build().toString();
    }

    @Override // l.C14798, l.AbstractC15440
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List mo23549(boolean z) {
        Cursor query;
        ArrayList arrayList = new ArrayList();
        ContentResolver m14336 = C4925.m14336();
        Uri m34867 = C14609.m34867(mo31567());
        String[] strArr = this.f27708;
        if (strArr == null) {
            strArr = mo23548();
            this.f27708 = strArr;
        }
        try {
            query = m14336.query(m34867, strArr, null, null, null);
            try {
            } finally {
            }
        } catch (Exception unused) {
        }
        if (query == null) {
            mo23128();
            if (query != null) {
            }
            return arrayList;
        }
        HashSet hashSet = mo23122() ? new HashSet() : null;
        while (query.moveToNext()) {
            String string = query.getString(0);
            String string2 = query.getString(1);
            if (z || !string2.startsWith(".")) {
                if (hashSet == null || hashSet.add(string2)) {
                    File file = new File(this.f27709, string2);
                    Uri buildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(mo31567(), string);
                    AbstractC15440 mo23543 = mo23543(file, buildDocumentUriUsingTree, query);
                    mo23115(file, buildDocumentUriUsingTree, mo23543.mo23113());
                    arrayList.add(mo23543);
                }
            }
        }
        query.close();
        return arrayList;
    }

    /* renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public String[] mo23548() {
        return new String[]{"document_id", "_display_name", "mime_type", "_size", "last_modified"};
    }

    /* renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public String[] mo23553() {
        return new String[]{"mime_type", "_size", "last_modified"};
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12619 mo23541(Cursor cursor) {
        return m23542(cursor, 0, 1, 2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C12619 mo23550(Cursor cursor) {
        return m23542(cursor, 2, 3, 4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12619 m23542(Cursor cursor, int i, int i2, int i3) {
        EnumC3447 enumC3447;
        String string = cursor.isNull(i) ? null : cursor.getString(i);
        if ("vnd.android.document/directory".equals(string)) {
            enumC3447 = EnumC3447.DIRECTORY;
        } else if (string == null || string.isEmpty()) {
            enumC3447 = EnumC3447.OTHER;
        } else {
            enumC3447 = EnumC3447.REGULAR;
        }
        EnumC3447 enumC34472 = enumC3447;
        return new C12619(this, enumC34472, (enumC34472 == EnumC3447.DIRECTORY || cursor.isNull(i2)) ? -1L : cursor.getLong(i2), cursor.isNull(i3) ? -1L : cursor.getLong(i3), null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 mo23543(File file, Uri uri, Cursor cursor) {
        AbstractC9155 mo18536 = mo18536(file, uri);
        C9861 c9861 = new C9861();
        c9861.f29833 = "vnd.android.document/directory".equals(cursor.isNull(2) ? null : cursor.getString(2));
        c9861.f29832 = cursor.isNull(3) ? -1L : cursor.getLong(3);
        c9861.f29834 = cursor.isNull(4) ? -1L : cursor.getLong(4);
        mo18536.f27710 = c9861;
        return mo18536;
    }

    @Override // l.C14798, l.AbstractC15440
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final OutputStream mo23555(boolean z) {
        if (mo23120() || m23539()) {
            return C4925.m14336().openOutputStream(mo31567(), z ? "wa" : "wt");
        }
        throw new FileNotFoundException(mo31567().toString());
    }

    @Override // l.C14798, l.AbstractC15440
    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC2245 mo23557(String str) {
        if (!str.equals("r") && !mo23120() && !m23539()) {
            throw new FileNotFoundException(mo31567().toString());
        }
        return C0127.m1198(mo31567(), str);
    }

    @Override // l.C14798
    /* renamed from: ᩶ۧ */
    public void mo23125() {
        super.mo23125();
        this.f27710 = null;
    }
}

package l;

import android.database.Cursor;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: K6MS */
/* renamed from: l.ܰ᩺ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14126 extends AbstractC22967 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14798 f42607;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f42608;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f42609;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Uri f42610;

    @Override // l.AbstractC22967
    /* renamed from: ۘ */
    public final boolean mo6176() {
        return true;
    }

    public C14126(String str, String str2, C14798 c14798, Uri uri) {
        this.f42608 = str;
        this.f42609 = str2;
        this.f42607 = c14798;
        this.f42610 = uri;
    }

    @Override // l.AbstractC22967
    /* renamed from: ᩻ */
    public final String mo6180() {
        return this.f42608;
    }

    @Override // l.AbstractC22967
    /* renamed from: ᩳ */
    public final String mo6177() {
        return this.f42609;
    }

    @Override // l.AbstractC22967
    /* renamed from: ᩴ */
    public final InputStream mo6178() {
        return this.f42607.mo27926();
    }

    @Override // l.AbstractC22967
    /* renamed from: ᩵ */
    public final C11679 mo6179() {
        try {
            Cursor query = C4925.m14336().query(this.f42610, null, null, null, null);
            long j = -1;
            long j2 = 0;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        int columnIndex = query.getColumnIndex("_size");
                        int columnIndex2 = query.getColumnIndex("last_modified");
                        if (columnIndex >= 0 && !query.isNull(columnIndex)) {
                            j = Math.max(-1L, query.getLong(columnIndex));
                        }
                        if (columnIndex2 >= 0 && !query.isNull(columnIndex2)) {
                            j2 = query.getLong(columnIndex2);
                        }
                    }
                } finally {
                }
            }
            long j3 = j2;
            C11679 c11679 = new C11679(this.f42608, j, j3);
            if (query != null) {
                query.close();
            }
            return c11679;
        } catch (RuntimeException e) {
            throw new IOException("Could not query image content metadata", e);
        }
    }
}

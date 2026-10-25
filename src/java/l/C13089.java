package l;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* compiled from: 66M9 */
/* renamed from: l.۬ۨۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13089 extends AbstractC22967 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ File f39188;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f39189;

    public C13089(File file, String str) {
        this.f39189 = str;
        this.f39188 = file;
    }

    @Override // l.AbstractC22967
    /* renamed from: ᩻ */
    public final String mo6180() {
        return this.f39189;
    }

    @Override // l.AbstractC22967
    /* renamed from: ᩳ */
    public final String mo6177() {
        return this.f39188.getName();
    }

    @Override // l.AbstractC22967
    /* renamed from: ᩴ */
    public final InputStream mo6178() {
        return new FileInputStream(this.f39188);
    }

    @Override // l.AbstractC22967
    /* renamed from: ۜ */
    public final File mo17660() {
        return this.f39188;
    }

    @Override // l.AbstractC22967
    /* renamed from: ᩵ */
    public final C11679 mo6179() {
        File canonicalFile = this.f39188.getCanonicalFile();
        if (!canonicalFile.isFile()) {
            throw new FileNotFoundException("Image source is not a regular file");
        }
        return new C11679("file:" + canonicalFile.getPath(), canonicalFile.length(), canonicalFile.lastModified());
    }
}

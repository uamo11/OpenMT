package l;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;

/* compiled from: N17O */
/* renamed from: l.᩸᩶ܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21813 extends AbstractC6478 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f69890;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f69891;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f69892;

    public C21813(ParcelFileDescriptor parcelFileDescriptor, String str, String str2, boolean z) {
        super(parcelFileDescriptor);
        this.f69892 = str;
        this.f69890 = str2;
        this.f69891 = z;
    }

    @Override // l.InterfaceC2245
    public final String getName() {
        return new File(this.f69892).getName();
    }

    @Override // l.InterfaceC2245
    /* renamed from: ۡ */
    public final InterfaceC2245 mo7437() {
        return C3468.m10607(this.f69891).m45388(this.f69892, this.f69890);
    }

    @Override // l.AbstractC6478, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f69890.equals("r")) {
            try {
                super.close();
            } catch (IOException unused) {
            }
        } else {
            super.close();
        }
    }
}

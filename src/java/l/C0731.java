package l;

import net.sf.sevenzipjbinding.IOutCreateArchive7z;
import net.sf.sevenzipjbinding.IOutUpdateArchive7z;
import net.sf.sevenzipjbinding.impl.OutArchiveImpl;

/* compiled from: HB62 */
/* renamed from: l.֡᩺᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0731 extends OutArchiveImpl implements IOutCreateArchive7z, IOutUpdateArchive7z {

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f2754;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Boolean f2755;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f2752 = -1;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f2753 = -1;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f2751 = true;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f2757 = -1;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f2756 = -1;

    @Override // net.sf.sevenzipjbinding.impl.OutArchiveImpl, net.sf.sevenzipjbinding.IOutFeatureSetLevel
    public final void setLevel(int i) {
        this.f2752 = i;
    }

    @Override // net.sf.sevenzipjbinding.IOutFeatureSetMultithreading
    public final void setThreadCount(int i) {
        this.f2753 = i;
    }

    @Override // net.sf.sevenzipjbinding.IOutFeatureSetEncryptHeader
    public final void setHeaderEncryption(boolean z) {
        this.f2755 = Boolean.valueOf(z);
    }

    @Override // net.sf.sevenzipjbinding.IOutFeatureSetSolid
    public final void setSolid(boolean z) {
        this.f2751 = z;
    }

    @Override // net.sf.sevenzipjbinding.IOutFeatureSetSolid
    public final void setSolidFiles(int i) {
        this.f2757 = i;
    }

    @Override // net.sf.sevenzipjbinding.IOutFeatureSetSolid
    public final void setSolidSize(long j) {
        this.f2756 = j;
    }

    @Override // net.sf.sevenzipjbinding.IOutFeatureSetSolid
    public final void setSolidExtension(boolean z) {
        this.f2754 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // net.sf.sevenzipjbinding.impl.OutArchiveImpl
    public final void applyFeatures() {
        String str;
        ensureOpened();
        Boolean bool = this.f2755;
        int booleanValue = bool == null ? -1 : bool.booleanValue();
        if (this.f2751) {
            StringBuilder sb = new StringBuilder();
            if (this.f2754) {
                sb.append("E");
            }
            int i = this.f2757;
            if (i != -1) {
                sb.append(i);
                sb.append("F");
            }
            long j = this.f2756;
            if (j != -1) {
                sb.append(j);
                sb.append("B");
            }
            str = sb.length() > 0 ? sb.toString() : null;
        } else {
            str = "";
        }
        nativeSet7z(this.f2752, booleanValue, this.f2753, str);
    }
}

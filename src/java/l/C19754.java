package l;

import android.graphics.Matrix;
import android.graphics.Paint;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* compiled from: UBKO */
/* renamed from: l.᩵᩹ۡ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19754 extends AbstractC0702 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f63800;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f63801;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f63802;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f63803;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f63804;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f63805;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Matrix f63806;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f63807;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f63808;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Matrix f63809;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f63810;

    /* JADX WARN: Multi-variable type inference failed */
    public C19754(C19754 c19754, C2727 c2727) {
        C4231 c4231;
        this.f63809 = new Matrix();
        this.f63800 = new ArrayList();
        this.f63805 = 0.0f;
        this.f63808 = 0.0f;
        this.f63807 = 0.0f;
        this.f63810 = 1.0f;
        this.f63801 = 1.0f;
        this.f63803 = 0.0f;
        this.f63802 = 0.0f;
        Matrix matrix = new Matrix();
        this.f63806 = matrix;
        this.f63804 = null;
        this.f63805 = c19754.f63805;
        this.f63808 = c19754.f63808;
        this.f63807 = c19754.f63807;
        this.f63810 = c19754.f63810;
        this.f63801 = c19754.f63801;
        this.f63803 = c19754.f63803;
        this.f63802 = c19754.f63802;
        String str = c19754.f63804;
        this.f63804 = str;
        if (str != null) {
            c2727.put(str, this);
        }
        matrix.set(c19754.f63806);
        ArrayList arrayList = c19754.f63800;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C19754) {
                this.f63800.add(new C19754((C19754) obj, c2727));
            } else {
                if (!(obj instanceof C19048)) {
                    if (!(obj instanceof C4231)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    c4231 = new C4231((C4231) obj);
                } else {
                    C19048 c19048 = (C19048) obj;
                    C19048 c190482 = new C19048(c19048);
                    c190482.f59989 = 0.0f;
                    c190482.f59993 = 1.0f;
                    c190482.f59990 = 1.0f;
                    c190482.f59991 = 0.0f;
                    c190482.f59983 = 1.0f;
                    c190482.f59984 = 0.0f;
                    c190482.f59992 = Paint.Cap.BUTT;
                    c190482.f59987 = Paint.Join.MITER;
                    c190482.f59986 = 4.0f;
                    c190482.f59985 = c19048.f59985;
                    c190482.f59989 = c19048.f59989;
                    c190482.f59993 = c19048.f59993;
                    c190482.f59988 = c19048.f59988;
                    c190482.f17420 = c19048.f17420;
                    c190482.f59990 = c19048.f59990;
                    c190482.f59991 = c19048.f59991;
                    c190482.f59983 = c19048.f59983;
                    c190482.f59984 = c19048.f59984;
                    c190482.f59992 = c19048.f59992;
                    c190482.f59987 = c19048.f59987;
                    c190482.f59986 = c19048.f59986;
                    c4231 = c190482;
                }
                this.f63800.add(c4231);
                Object obj2 = c4231.f17423;
                if (obj2 != null) {
                    c2727.put(obj2, c4231);
                }
            }
        }
    }

    public C19754() {
        this.f63809 = new Matrix();
        this.f63800 = new ArrayList();
        this.f63805 = 0.0f;
        this.f63808 = 0.0f;
        this.f63807 = 0.0f;
        this.f63810 = 1.0f;
        this.f63801 = 1.0f;
        this.f63803 = 0.0f;
        this.f63802 = 0.0f;
        this.f63806 = new Matrix();
        this.f63804 = null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m45456() {
        return this.f63804;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45455(XmlResourceParserC10269 xmlResourceParserC10269, C12534 c12534) {
        C15246 m48775 = C21598.m48775(xmlResourceParserC10269, C2842.f9076, c12534);
        float f = this.f63805;
        if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "rotation") != null) {
            f = m48775.m36212(f, 5);
        }
        this.f63805 = f;
        this.f63808 = m48775.m36212(this.f63808, 1);
        this.f63807 = m48775.m36212(this.f63807, 2);
        float f2 = this.f63810;
        if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "scaleX") != null) {
            f2 = m48775.m36212(f2, 3);
        }
        this.f63810 = f2;
        float f3 = this.f63801;
        if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "scaleY") != null) {
            f3 = m48775.m36212(f3, 4);
        }
        this.f63801 = f3;
        float f4 = this.f63803;
        if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "translateX") != null) {
            f4 = m48775.m36212(f4, 6);
        }
        this.f63803 = f4;
        float f5 = this.f63802;
        if (xmlResourceParserC10269.getAttributeValue(Chip.NAMESPACE_ANDROID, "translateY") != null) {
            f5 = m48775.m36212(f5, 7);
        }
        this.f63802 = f5;
        String m36209 = m48775.m36209(0);
        if (m36209 != null) {
            this.f63804 = m36209;
        }
        Matrix matrix = this.f63806;
        matrix.reset();
        matrix.postTranslate(-this.f63808, -this.f63807);
        matrix.postScale(this.f63810, this.f63801);
        matrix.postRotate(this.f63805, 0.0f, 0.0f);
        matrix.postTranslate(this.f63803 + this.f63808, this.f63802 + this.f63807);
    }

    @Override // l.AbstractC0702
    /* renamed from: ֫ */
    public final boolean mo2788() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f63800;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC0702) arrayList.get(i)).mo2788()) {
                return true;
            }
            i++;
        }
    }

    @Override // l.AbstractC0702
    /* renamed from: ֫ */
    public final boolean mo2789(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.f63800;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((AbstractC0702) arrayList.get(i)).mo2789(iArr);
            i++;
        }
    }
}

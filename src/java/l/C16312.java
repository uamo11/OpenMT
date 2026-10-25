package l;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RectF;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

/* compiled from: SB7W */
/* renamed from: l.ܽ֨ܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C16312 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9383 f50224 = null;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12617 f50222 = new C12617();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public HashMap f50223 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16312 m38391(InputStream inputStream) {
        return new C2908().m8890(inputStream, false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C16312 m38394(InputStream inputStream) {
        return new C2908().m8890(inputStream, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Picture m38396(int i, int i2) {
        Picture picture = new Picture();
        Canvas beginRecording = picture.beginRecording(i, i2);
        C17703 c17703 = new C17703();
        c17703.f54176 = new C16997(0.0f, 0.0f, i, i2);
        new C18430(beginRecording, false).m42900(this, c17703);
        picture.endRecording();
        return picture;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38402(Canvas canvas, RectF rectF) {
        C17703 c17703 = new C17703();
        c17703.f54176 = new C16997(rectF.left, rectF.top, rectF.width(), rectF.height());
        new C18430(canvas, true).m42900(this, c17703);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38401(Canvas canvas) {
        C17703 c17703 = new C17703();
        if (c17703.f54176 == null) {
            c17703.f54176 = new C16997(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new C18430(canvas, true).m42900(this, c17703);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float m38410() {
        if (this.f50224 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        return m38395().f52134;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38406(float f) {
        C9383 c9383 = this.f50224;
        if (c9383 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        c9383.f28498 = new C0769(f);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m38405() {
        if (this.f50224 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        return m38395().f52131;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38399(float f) {
        C9383 c9383 = this.f50224;
        if (c9383 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        c9383.f28501 = new C0769(f);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38400(float f, float f2) {
        C9383 c9383 = this.f50224;
        if (c9383 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        c9383.f68869 = new C16997(0.0f, 0.0f, f, f2);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final RectF m38408() {
        C9383 c9383 = this.f50224;
        if (c9383 == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        C16997 c16997 = c9383.f68869;
        if (c16997 == null) {
            return null;
        }
        return new RectF(c16997.f52132, c16997.f52133, c16997.m39856(), c16997.m39857());
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9383 m38409() {
        return this.f50224;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38403(C9383 c9383) {
        this.f50224 = c9383;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC19261 m38398(String str) {
        String substring;
        if (str == null) {
            return null;
        }
        String m38393 = m38393(str);
        if (m38393.length() <= 1 || !m38393.startsWith("#") || (substring = m38393.substring(1)) == null || substring.length() == 0) {
            return null;
        }
        if (substring.equals(this.f50224.f60633)) {
            return this.f50224;
        }
        HashMap hashMap = this.f50223;
        if (hashMap.containsKey(substring)) {
            return (AbstractC19261) hashMap.get(substring);
        }
        AbstractC19261 m38392 = m38392(this.f50224, substring);
        hashMap.put(substring, m38392);
        return m38392;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m38393(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", "").replace("\\A", "\n");
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private C16997 m38395() {
        EnumC7265 enumC7265;
        EnumC7265 enumC72652;
        EnumC7265 enumC72653;
        EnumC7265 enumC72654;
        float f;
        EnumC7265 enumC72655;
        C9383 c9383 = this.f50224;
        C0769 c0769 = c9383.f28498;
        C0769 c07692 = c9383.f28501;
        if (c0769 == null || c0769.m2934() || (enumC7265 = c0769.f2854) == (enumC72652 = EnumC7265.percent) || enumC7265 == (enumC72653 = EnumC7265.em) || enumC7265 == (enumC72654 = EnumC7265.ex)) {
            return new C16997(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float m2928 = c0769.m2928(96.0f);
        if (c07692 != null) {
            if (c07692.m2934() || (enumC72655 = c07692.f2854) == enumC72652 || enumC72655 == enumC72653 || enumC72655 == enumC72654) {
                return new C16997(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            f = c07692.m2928(96.0f);
        } else {
            C16997 c16997 = this.f50224.f68869;
            f = c16997 != null ? (c16997.f52131 * m2928) / c16997.f52134 : m2928;
        }
        return new C16997(0.0f, 0.0f, m2928, f);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38404(C12617 c12617) {
        this.f50222.m30878(c12617);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m38397() {
        return this.f50222.m30877();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m38407() {
        return !this.f50222.m30880();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC19261 m38392(InterfaceC3738 interfaceC3738, String str) {
        AbstractC19261 m38392;
        AbstractC19261 abstractC19261 = (AbstractC19261) interfaceC3738;
        if (str.equals(abstractC19261.f60633)) {
            return abstractC19261;
        }
        for (Object obj : interfaceC3738.getChildren()) {
            if (obj instanceof AbstractC19261) {
                AbstractC19261 abstractC192612 = (AbstractC19261) obj;
                if (str.equals(abstractC192612.f60633)) {
                    return abstractC192612;
                }
                if ((obj instanceof InterfaceC3738) && (m38392 = m38392((InterfaceC3738) obj, str)) != null) {
                    return m38392;
                }
            }
        }
        return null;
    }
}

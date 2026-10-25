package l;

import android.view.View;
import java.util.HashMap;

/* compiled from: C1X6 */
/* renamed from: l.ܿ֡ۘ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16989 extends C11346 {

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f52119;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public AbstractC7112 f52120;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public String f52121;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public Object f52122;

    @Override // l.C11346
    /* renamed from: ۧ */
    public final C11346 mo28076(long j) {
        throw null;
    }

    static {
        HashMap hashMap = new HashMap();
        f52119 = hashMap;
        hashMap.put("alpha", C7817.f24171);
        hashMap.put("pivotX", C7817.f24177);
        hashMap.put("pivotY", C7817.f24180);
        hashMap.put("translationX", C7817.f24175);
        hashMap.put("translationY", C7817.f24179);
        hashMap.put("rotation", C7817.f24182);
        hashMap.put("rotationX", C7817.f24181);
        hashMap.put("rotationY", C7817.f24178);
        hashMap.put("scaleX", C7817.f24184);
        hashMap.put("scaleY", C7817.f24174);
        hashMap.put("scrollX", C7817.f24183);
        hashMap.put("scrollY", C7817.f24176);
        hashMap.put("x", C7817.f24172);
        hashMap.put("y", C7817.f24173);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16989 m39820(Object obj, float... fArr) {
        C16989 c16989 = new C16989();
        c16989.f52122 = obj;
        C21224[] c21224Arr = c16989.f33964;
        if (c21224Arr != null) {
            C21224 c21224 = c21224Arr[0];
            String str = c21224.f68410;
            c21224.f68410 = "alpha";
            c16989.f33963.remove(str);
            c16989.f33963.put("alpha", c21224);
        }
        c16989.f52121 = "alpha";
        c16989.f33952 = false;
        c16989.mo28073(fArr);
        return c16989;
    }

    @Override // l.C11346
    /* renamed from: ֫ */
    public final void mo28073(float... fArr) {
        C21224[] c21224Arr = this.f33964;
        if (c21224Arr == null || c21224Arr.length == 0) {
            AbstractC7112 abstractC7112 = this.f52120;
            if (abstractC7112 != null) {
                int i = C21224.f68404;
                m28074(new C14872(abstractC7112, fArr));
                return;
            }
            String str = this.f52121;
            int i2 = C21224.f68404;
            C14872 c14872 = new C14872(str);
            c14872.mo35307(fArr);
            m28074(c14872);
            return;
        }
        super.mo28073(fArr);
    }

    @Override // l.C11346
    /* renamed from: ᩳ */
    public final void mo28081() {
        Object obj = this.f52122;
        if (this.f33952) {
            return;
        }
        if (this.f52120 == null && C7670.f23677 && (obj instanceof View)) {
            String str = this.f52121;
            HashMap hashMap = f52119;
            if (hashMap.containsKey(str)) {
                AbstractC7112 abstractC7112 = (AbstractC7112) hashMap.get(this.f52121);
                C21224[] c21224Arr = this.f33964;
                if (c21224Arr != null) {
                    C21224 c21224 = c21224Arr[0];
                    String str2 = c21224.f68410;
                    c21224.f68405 = abstractC7112;
                    this.f33963.remove(str2);
                    this.f33963.put(this.f52121, c21224);
                }
                if (this.f52120 != null) {
                    this.f52121 = abstractC7112.m19129();
                }
                this.f52120 = abstractC7112;
                this.f33952 = false;
            }
        }
        int length = this.f33964.length;
        for (int i = 0; i < length; i++) {
            this.f33964[i].m48182(obj);
        }
        super.mo28081();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39821(long j) {
        super.mo28076(j);
    }

    @Override // l.C11346
    /* renamed from: ֫ */
    public final void mo28069(float f) {
        super.mo28069(f);
        int length = this.f33964.length;
        for (int i = 0; i < length; i++) {
            this.f33964[i].mo35306(this.f52122);
        }
    }

    @Override // l.C11346, l.AbstractC23192
    /* renamed from: clone */
    public final Object mo28082clone() {
        return (C16989) super.mo28082clone();
    }

    @Override // l.C11346, l.AbstractC23192
    /* renamed from: clone */
    public final C11346 mo28082clone() {
        return (C16989) super.mo28082clone();
    }

    @Override // l.C11346, l.AbstractC23192
    /* renamed from: clone */
    public final AbstractC23192 mo28082clone() {
        return (C16989) super.mo28082clone();
    }

    @Override // l.C11346
    public final String toString() {
        String str = "ObjectAnimator@" + Integer.toHexString(hashCode()) + ", target " + this.f52122;
        if (this.f33964 != null) {
            for (int i = 0; i < this.f33964.length; i++) {
                StringBuilder m19190 = C7166.m19190(str, "\n    ");
                m19190.append(this.f33964[i].toString());
                str = m19190.toString();
            }
        }
        return str;
    }
}

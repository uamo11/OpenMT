package l;

import com.google.android.material.motion.MotionUtils;

/* compiled from: O44L */
/* renamed from: l.᩺᩷۠, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23237 extends AbstractC7715 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14439 f74665;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C1034 f74666;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C23237(l.C14439 r1, l.AbstractC4308 r2, java.lang.Object r3) {
        /*
            r0 = this;
            r0.f74665 = r1
            int r2 = l.C1365.m4782(r2)
            r0.<init>(r1, r2)
            switch(r2) {
                case 0: goto L4b;
                case 1: goto L3d;
                case 2: goto L2f;
                case 3: goto L21;
                case 4: goto L18;
                case 5: goto L4b;
                case 6: goto L4b;
                case 7: goto L4b;
                default: goto Lc;
            }
        Lc:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "unsupported tag: "
            java.lang.String r2 = l.C19370.m44628(r2, r3)
            r1.<init>(r2)
            throw r1
        L18:
            java.lang.String r3 = (java.lang.String) r3
            l.֨ۢ۠ r1 = l.C5268.m15194(r3)
            r0.f74666 = r1
            return
        L21:
            java.lang.Double r3 = (java.lang.Double) r3
            r3.getClass()
            l.֨ۢ۠ r1 = new l.֨ۢ۠
            r2 = 6
            r1.<init>(r2, r3)
            r0.f74666 = r1
            return
        L2f:
            java.lang.Float r3 = (java.lang.Float) r3
            r3.getClass()
            l.֨ۢ۠ r1 = new l.֨ۢ۠
            r2 = 4
            r1.<init>(r2, r3)
            r0.f74666 = r1
            return
        L3d:
            java.lang.Long r3 = (java.lang.Long) r3
            r3.getClass()
            l.֨ۢ۠ r1 = new l.֨ۢ۠
            r2 = 5
            r1.<init>(r2, r3)
            r0.f74666 = r1
            return
        L4b:
            java.lang.Integer r3 = (java.lang.Integer) r3
            r3.getClass()
            l.֨ۢ۠ r1 = new l.֨ۢ۠
            r2 = 3
            r1.<init>(r2, r3)
            r0.f74666 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23237.<init>(l.ܳۢ۠, l.ۙ֨֨, java.lang.Object):void");
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m51561() {
        C1034 c1034 = this.f74666;
        C14439 c14439 = this.f74665;
        int i = this.f23845;
        if (i == 1 || i == 3) {
            C1365 c1365 = c14439.f44254;
            c1365.m4805(20, c1365.f4968.m29891((InterfaceC8090) c1034), (InterfaceC21496) c1034);
        } else {
            c14439.f44254.m4809(c1034);
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private Number m51562() {
        return (Number) this.f74666.f3779;
    }

    @Override // l.AbstractC7715
    /* renamed from: ᩳ */
    public final AbstractC7715 mo5817() {
        AbstractC7715[] abstractC7715Arr;
        C14439 c14439 = this.f74665;
        int i = this.f23845;
        switch (i) {
            case 0:
            case 5:
            case 6:
            case 7:
                int intValue = m51562().intValue();
                if (-1 <= intValue && intValue <= 5) {
                    c14439.f44254.m4824(intValue + 3);
                    break;
                } else if (-128 <= intValue && intValue <= 127) {
                    c14439.f44254.m4804(16, intValue, (InterfaceC8090) null);
                    break;
                } else if (-32768 > intValue || intValue > 32767) {
                    m51561();
                    break;
                } else {
                    c14439.f44254.m4805(17, intValue, (InterfaceC21496) null);
                    break;
                }
                break;
            case 1:
                long longValue = m51562().longValue();
                if (longValue == 0 || longValue == 1) {
                    c14439.f44254.m4824(((int) longValue) + 9);
                    break;
                } else {
                    m51561();
                    break;
                }
                break;
            case 2:
                float floatValue = m51562().floatValue();
                if (floatValue != 0.0f || 1.0f / floatValue <= 0.0f) {
                    double d = floatValue;
                    if (d != 1.0d && d != 2.0d) {
                        m51561();
                        break;
                    }
                }
                c14439.f44254.m4824(((int) floatValue) + 11);
                break;
            case 3:
                double doubleValue = m51562().doubleValue();
                if ((doubleValue == 0.0d && 1.0d / doubleValue > 0.0d) || doubleValue == 1.0d) {
                    c14439.f44254.m4824(((int) doubleValue) + 14);
                    break;
                } else {
                    m51561();
                    break;
                }
            case 4:
                m51561();
                break;
            default:
                C12171.m29636();
                throw null;
        }
        abstractC7715Arr = c14439.f44255;
        return abstractC7715Arr[i];
    }

    @Override // l.AbstractC7715
    /* renamed from: ܿ */
    public final C6304 mo17363() {
        return this.f74665.m34467(m51562().intValue() != 0 ? 167 : 168);
    }

    @Override // l.AbstractC7715
    /* renamed from: ֫ */
    public final AbstractC7715 mo20665(int i) {
        int i2 = this.f23845;
        if (i2 != i) {
            C14439 c14439 = this.f74665;
            if (i != 0) {
                if (i == 1) {
                    return new C23237(c14439, c14439.f44259.f66470, Long.valueOf(m51562().longValue()));
                }
                if (i == 2) {
                    return new C23237(c14439, c14439.f44259.f66483, Float.valueOf(m51562().floatValue()));
                }
                if (i == 3) {
                    return new C23237(c14439, c14439.f44259.f66499, Double.valueOf(m51562().doubleValue()));
                }
                if (i == 5) {
                    return new C23237(c14439, c14439.f44259.f66502, Integer.valueOf((byte) m51562().intValue()));
                }
                if (i == 6) {
                    return new C23237(c14439, c14439.f44259.f66454, Integer.valueOf((char) m51562().intValue()));
                }
                if (i == 7) {
                    return new C23237(c14439, c14439.f44259.f66513, Integer.valueOf((short) m51562().intValue()));
                }
                return super.mo20665(i);
            }
            if (C1365.m4795(i2) != 0) {
                return new C23237(c14439, c14439.f44259.f66452, Integer.valueOf(m51562().intValue()));
            }
        }
        return this;
    }

    public final String toString() {
        return "immediate(" + this.f74666 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}

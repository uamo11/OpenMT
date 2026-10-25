package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: J1YX */
/* renamed from: l.ܳ᩶᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C14761 extends AbstractC22366 {

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f45075 = 0;

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public C18090 f45076;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f45077 = new ArrayList();

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public long f45078;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public C21818 f45079;

    @Override // l.AbstractC3817
    /* renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76957;
    }

    @Override // l.AbstractC3817
    /* renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector_res_0x7f120a2d, m11517("zipPath"), C4925.m14327(R.string.MT_Protector_res_0x7f1205f9));
    }

    @Override // l.AbstractC3817
    /* renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector_res_0x7f120797);
        mo11520("...");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    public final C17222 mo2780() {
        char c;
        String m11556 = m11556("zipPath");
        C12951 m31485 = C12951.m31485(m11560(e.m));
        String m31506 = m31485.m31506();
        int readInt = m31485.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        int i = 0;
        while (true) {
            boolean z = true;
            c = 1;
            if (i >= readInt) {
                break;
            }
            String m315062 = m31485.m31506();
            String m315063 = m31485.m31506();
            byte readByte = m31485.readByte();
            String concat = m31506.concat(m315062);
            String concat2 = m31506.concat(m315063);
            boolean z2 = (readByte & 1) != 0;
            if ((readByte & 2) == 0) {
                z = false;
            }
            arrayList.add(new C18290(concat, concat2, z2, z));
            i++;
        }
        int readInt2 = m31485.readInt();
        HashSet hashSet = new HashSet(readInt2);
        for (int i2 = 0; i2 < readInt2; i2++) {
            hashSet.add(m31485.m31506());
        }
        C11667 m11533 = m11533();
        boolean m11552 = m11552("keepApkSigBlock");
        AbstractC15440 m39866 = C16999.m39866(m11556, new String[0]);
        this.f45076 = new C18090(m39866);
        C21818 m50499 = C22523.m50499(m39866, m11533 != null);
        this.f45079 = m50499;
        C8918 m49176 = m50499.m49176();
        if (m11533 == null && m11552 && this.f45076.m42201()) {
            m49176.m23016(this.f45076);
        }
        if (this.f45076.m42212()) {
            m49176.m23025();
        }
        Collection<C3545> m42210 = this.f45076.m42210();
        C17584 c17584 = new C17584(this, C22523.m50496(m42210));
        int i3 = 0;
        for (C3545 c3545 : m42210) {
            if (mo1526()) {
                return C17222.m40521();
            }
            if (!hashSet.contains(c3545.getName())) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && !((C18290) it.next()).m42627(c3545)) {
                }
                i3++;
                mo11546(C4925.m14327(R.string.MT_Protector_res_0x7f120ac0) + MotionUtils.EASING_TYPE_FORMAT_START + i3 + "/" + m42210.size() + MotionUtils.EASING_TYPE_FORMAT_END);
                mo11520(c3545.getName());
                if (c3545.isDirectory()) {
                    m49176.m23013(c3545);
                } else {
                    C22523.m50503(c3545, this.f45076, m49176, c17584);
                    this.f45078 += c3545.m10793();
                }
            }
        }
        m50129(100);
        mo11538(100);
        m49176.close();
        if (m11533 != null) {
            C10025.m25200(this.f45079, m11533, this);
        }
        if (mo1526()) {
            return C17222.m40521();
        }
        C18838.m43524(m39866);
        C17558 c17558 = new C17558();
        c17558.m41050(m39866);
        this.f45079.m49175(m39866, new RunnableC16460(c == true ? 1 : 0, this, m39866), this.f45076);
        c17558.m41052(m39866);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String m42626 = ((C18290) it2.next()).m42626();
            if (m42626 != null) {
                this.f45077.add(m42626);
            }
        }
        return C17222.m40520();
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
        if (c17222.m40526() && m11542(c16560)) {
            c16560.m39041();
            c16560.m39000((Collection) this.f45077);
            c16560.m39015();
        }
    }

    @Override // l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C21818 c21818;
        if (!c17222.m40526() && (c21818 = this.f45079) != null) {
            C0349.m1793(c21818.m49176());
            this.f45079.m49174().mo23552();
        }
        C0349.m1793(this.f45076);
        C15528.m36596();
    }
}

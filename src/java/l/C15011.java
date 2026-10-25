package l;

import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: R5YB */
/* renamed from: l.ܶۙ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15011 extends AbstractC7548 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f45773;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11667 f45774;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f45775;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C21818 f45776;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f45777;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public HashSet f45778 = new HashSet();

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC21363 f45779;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Collection f45780;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C18090 f45781;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C22022 f45782;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f45783;

    public C15011(AbstractC21363 abstractC21363, C11667 c11667, boolean z) {
        this.f45779 = abstractC21363;
        this.f45774 = c11667;
        this.f45773 = z;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C16560 c16560;
        c16560 = this.f45779.f68812;
        C22022 c22022 = new C22022(c16560.m39056());
        c22022.m49558(R.string.MT_Protector_res_0x7f120797);
        c22022.m49556("...");
        c22022.mo49542((Runnable) null);
        c22022.m49548();
        this.f45782 = c22022;
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C10738 c10738;
        List list;
        List list2;
        boolean z;
        List list3;
        HashSet hashSet;
        C16560 c16560;
        C3545 c3545;
        C3545 c35452;
        C10738 c107382;
        int i;
        C11667 c11667;
        C8918 c8918;
        int i2;
        boolean z2;
        AbstractC21363 abstractC21363 = this.f45779;
        c10738 = abstractC21363.f68813;
        AbstractC15440 m39866 = C16999.m39866(c10738.m26937(), new String[0]);
        C17721.m41504(m39866, EnumC16309.MODIFY_FILE);
        C18090 c18090 = new C18090(m39866);
        this.f45781 = c18090;
        this.f45780 = c18090.m42210();
        C11667 c116672 = this.f45774;
        C21818 m50499 = C22523.m50499(m39866, c116672 != null);
        this.f45776 = m50499;
        C8918 m49176 = m50499.m49176();
        if (c116672 == null && this.f45773 && this.f45781.m42201()) {
            m49176.m23016(this.f45781);
        }
        if (this.f45781.m42212()) {
            m49176.m23025();
        }
        list = abstractC21363.f68810;
        int size = ((ArrayList) list).size();
        this.f45783 = 0L;
        list2 = abstractC21363.f68810;
        Iterator it = ((ArrayList) list2).iterator();
        while (it.hasNext()) {
            this.f45783 = ((C5977) it.next()).m16768().mo23127() + this.f45783;
        }
        this.f45775 = 0L;
        C8918 m491762 = this.f45776.m49176();
        C15313 c15313 = new C15313();
        z = abstractC21363.f68809;
        if (z) {
            c15313.m36337(this.f45781);
        }
        list3 = abstractC21363.f68810;
        Iterator it2 = ((ArrayList) list3).iterator();
        int i3 = 0;
        while (true) {
            boolean hasNext = it2.hasNext();
            hashSet = this.f45778;
            if (!hasNext) {
                break;
            }
            C5977 c5977 = (C5977) it2.next();
            if (this.f45782.m51053()) {
                break;
            }
            int i4 = i3 + 1;
            String m16770 = c5977.m16770();
            AbstractC15440 m16768 = c5977.m16768();
            Iterator it3 = it2;
            Iterator it4 = this.f45780.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    c3545 = null;
                    break;
                }
                c3545 = (C3545) it4.next();
                Iterator it5 = it4;
                if (c3545.getName().equals(m16770)) {
                    break;
                } else {
                    it4 = it5;
                }
            }
            if (c3545 == null) {
                z2 = abstractC21363.f68809;
                m491762.m23018(z2 ? C21665.m48934(m16770, c15313) : 8);
                m491762.m23026((String) null);
                c35452 = new C3545(m16770);
            } else {
                m491762.m23018(c3545.m10767());
                if (c3545.m10808()) {
                    c107382 = abstractC21363.f68813;
                    m491762.m23026(c107382.m26938());
                } else {
                    m491762.m23026((String) null);
                }
                c35452 = c3545;
            }
            C15313 c153132 = c15313;
            C22022 c22022 = this.f45782;
            AbstractC15440 abstractC15440 = m39866;
            StringBuilder sb = new StringBuilder();
            AbstractC21363 abstractC213632 = abstractC21363;
            sb.append(C4925.m14327(R.string.MT_Protector_res_0x7f120032));
            sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
            sb.append(i4);
            sb.append("/");
            sb.append(size);
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            c22022.m49554(sb.toString());
            this.f45782.m49556(m16770);
            InputStream mo27926 = m16768.mo27926();
            try {
                long mo23127 = m16768.mo23127();
                c35452.m10805(mo23127);
                int i5 = i4;
                c35452.setTime(m16768.mo23117());
                m491762.m23013(c35452);
                byte[] bArr = new byte[4096];
                long j = 0;
                while (true) {
                    int read = mo27926.read(bArr);
                    if (read > 0) {
                        i = i5;
                        m491762.write(bArr, 0, read);
                        c11667 = c116672;
                        c8918 = m49176;
                        j += read;
                        this.f45782.m49549(j, c35452.getSize());
                        i2 = size;
                        byte[] bArr2 = bArr;
                        C3545 c35453 = c35452;
                        this.f45782.m49552(this.f45775 + j, this.f45783);
                        if (this.f45782.m51053()) {
                            break;
                        }
                        c116672 = c11667;
                        bArr = bArr2;
                        i5 = i;
                        m49176 = c8918;
                        size = i2;
                        c35452 = c35453;
                    } else {
                        i = i5;
                        c11667 = c116672;
                        c8918 = m49176;
                        i2 = size;
                        m491762.m23023();
                        break;
                    }
                }
                this.f45775 += mo23127;
                mo27926.close();
                hashSet.add(m16770);
                c116672 = c11667;
                it2 = it3;
                c15313 = c153132;
                m39866 = abstractC15440;
                i3 = i;
                abstractC21363 = abstractC213632;
                m49176 = c8918;
                size = i2;
            } finally {
            }
        }
        AbstractC21363 abstractC213633 = abstractC21363;
        final AbstractC15440 abstractC154402 = m39866;
        C11667 c116673 = c116672;
        C8918 c89182 = m49176;
        if (this.f45782.m51053()) {
            return;
        }
        C8918 m491763 = this.f45776.m49176();
        C7957 c7957 = new C7957(this, C22523.m50496(this.f45780));
        int i6 = 0;
        for (C3545 c35454 : this.f45780) {
            if (this.f45782.m51053()) {
                break;
            }
            i6++;
            if (hashSet.contains(c35454.getName())) {
                if (!c35454.isDirectory()) {
                    this.f45777 = c35454.m10793() + this.f45777;
                }
            } else {
                this.f45782.m49554(C4925.m14327(R.string.MT_Protector_res_0x7f120ac0) + MotionUtils.EASING_TYPE_FORMAT_START + i6 + "/" + this.f45780.size() + MotionUtils.EASING_TYPE_FORMAT_END);
                this.f45782.m49556(c35454.getName());
                if (c35454.isDirectory()) {
                    m491763.m23013(c35454);
                } else {
                    C22523.m50503(c35454, this.f45781, m491763, c7957);
                    this.f45777 = c35454.m10793() + this.f45777;
                }
            }
        }
        if (this.f45782.m51053()) {
            return;
        }
        c89182.close();
        if (c116673 != null) {
            c16560 = abstractC213633.f68812;
            C10025.m25193(c16560.m39056(), this.f45776, c116673, this.f45782);
        }
        C18838.m43524(abstractC154402);
        C17558 c17558 = new C17558();
        c17558.m41050(abstractC154402);
        this.f45776.m49175(abstractC154402, new Runnable() { // from class: l.֨ۙ᩻
            @Override // java.lang.Runnable
            public final void run() {
                C15011 c15011 = C15011.this;
                c15011.f45782.m49558(R.string.MT_Protector_res_0x7f120b85);
                c15011.f45782.m49556(abstractC154402.getName());
            }
        }, this.f45781);
        c17558.m41052(abstractC154402);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C16560 c16560;
        List list;
        List list2;
        C16560 c165602;
        C16560 c165603;
        boolean m51053 = this.f45782.m51053();
        AbstractC21363 abstractC21363 = this.f45779;
        if (!m51053) {
            c16560 = abstractC21363.f68812;
            c16560.m39041();
            list = abstractC21363.f68810;
            ArrayList arrayList = new ArrayList(((ArrayList) list).size());
            list2 = abstractC21363.f68810;
            Iterator it = ((ArrayList) list2).iterator();
            while (it.hasNext()) {
                arrayList.add(((C5977) it.next()).m16774());
            }
            c165602 = abstractC21363.f68812;
            c165602.m39000((Collection) arrayList);
            c165603 = abstractC21363.f68812;
            c165603.m39015();
            C12190 c12190 = (C12190) abstractC21363;
            Iterator it2 = c12190.f36345.iterator();
            while (it2.hasNext()) {
                ((C5977) it2.next()).m16771();
            }
            c12190.f36343.f32356 = false;
            return;
        }
        C21818 c21818 = this.f45776;
        if (c21818 != null) {
            C0349.m1793(c21818.m49176());
            this.f45776.m49174().mo23552();
        }
        abstractC21363.mo29665();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C21818 c21818 = this.f45776;
        if (c21818 != null) {
            C0349.m1793(c21818.m49176());
            this.f45776.m49174().mo23552();
        }
        C21374.m48464(exc.toString());
        this.f45779.mo29665();
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        C0349.m1793(this.f45781);
        this.f45782.m51051();
        C15528.m36596();
    }
}

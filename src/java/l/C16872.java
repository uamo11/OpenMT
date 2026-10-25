package l;

import android.widget.EditText;
import bin.mt.plus.R;
import java.util.HashSet;

/* compiled from: P676 */
/* renamed from: l.ܽ᩶ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16872 extends AbstractC15252 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public HashSet f51771;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f51772;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f51773;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f51774;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f51775;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f51776;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f51777;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f51778;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16872(ActivityC21107 activityC21107) {
        super(activityC21107);
        this.f51774 = activityC21107;
        HashSet hashSet = new HashSet();
        this.f51771 = hashSet;
        this.f51778 = false;
        this.f51776 = false;
        this.f51772 = true;
        this.f51777 = true;
        m36257(R.string.MT_Protector_res_0x7f12001e, R.string.MT_Protector_res_0x7f120391, R.string.MT_Protector_res_0x7f120240, R.string.MT_Protector_res_0x7f1201ec);
        hashSet.add("Ljava/lang/String;");
        hashSet.add("C");
        hashSet.add("Z");
        hashSet.add("B");
        hashSet.add("I");
        hashSet.add("S");
        hashSet.add("J");
        hashSet.add("D");
        hashSet.add("F");
        m36260(R.string.MT_Protector_res_0x7f120387);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39671(int i, C23062 c23062) {
        C18284 c18284;
        if (this.f51777) {
            this.f51777 = false;
            m36254(0).addTextChangedListener(new C2056(this));
            m36254(2).addTextChangedListener(new C11229(this));
        }
        this.f51775 = i;
        boolean m51223 = c23062.m51223();
        C18522 c18522 = c23062.f74187;
        this.f51773 = m51223;
        m36254(0).setText(EnumC7233.m19340(c23062.f74186));
        m36254(1).setText(c18522.f57398.m28273());
        m36254(2).setText(c18522.f57397.m50835());
        String str = null;
        if (this.f51773 && c23062.m51222()) {
            c18284 = this.f51774.f68093;
            AbstractC16404[] abstractC16404Arr = c18284.f56834.m27861().m32314().f19421;
            AbstractC16404 abstractC16404 = i < abstractC16404Arr.length ? abstractC16404Arr[i] : null;
            if (abstractC16404 == null) {
                m36259(3).setVisibility(8);
            } else {
                EditText m36254 = m36254(3);
                switch (C15523.f47453[abstractC16404.mo5435().ordinal()]) {
                    case 1:
                        if (!((C23209) abstractC16404).f74592) {
                            str = "false";
                            break;
                        } else {
                            str = "true";
                            break;
                        }
                    case 2:
                        str = String.valueOf((int) ((C14036) abstractC16404).f42436);
                        break;
                    case 3:
                        str = String.valueOf(((C7687) abstractC16404).f23735);
                        break;
                    case 4:
                        str = String.valueOf(((C1588) abstractC16404).f5627);
                        break;
                    case 5:
                        str = String.valueOf(((C14287) abstractC16404).f43066);
                        break;
                    case 6:
                        str = String.valueOf(((C23460) abstractC16404).f75291);
                        break;
                    case 7:
                        str = String.valueOf(((C6527) abstractC16404).f20170);
                        break;
                    case 8:
                        str = String.valueOf((int) ((C8644) abstractC16404).f26391);
                        break;
                    case 9:
                        str = ((C15698) abstractC16404).f48387.m28273();
                        break;
                }
                m36254.setText(str);
                m36259(3).setVisibility(0);
            }
        } else {
            m36254(3).setText((CharSequence) null);
            m36259(3).setVisibility(8);
        }
        m36262();
        m36258().setText(R.string.MT_Protector_res_0x7f12070a);
    }

    @Override // l.AbstractC15252
    /* renamed from: ܽ */
    public final boolean mo4060() {
        C18284 c18284;
        C18284 c182842;
        C18284 c182843;
        C18284 c182844;
        C18284 c182845;
        String[] split;
        C12609 c12609;
        C18284 c182846;
        C18284 c182847;
        C18284 c182848;
        C18284 c182849;
        C18284 c1828410;
        C18284 c1828411;
        C18284 c1828412;
        C18284 c1828413;
        String[] split2;
        int i = this.f51775;
        int i2 = 0;
        ActivityC21107 activityC21107 = this.f51774;
        if (i == -1) {
            String trim = m36254(0).getText().toString().trim();
            try {
                if (!trim.equals("") && (split = ActivityC21107.f68087.split(trim)) != null) {
                    int i3 = 0;
                    for (String str : split) {
                        i3 |= EnumC7233.m19338(str).getValue();
                    }
                    i2 = i3;
                }
                c18284 = activityC21107.f68093;
                C3454 c3454 = c18284.f56840;
                c182842 = activityC21107.f68093;
                C22755 m27862 = c182842.f56834.m27862();
                c182843 = activityC21107.f68093;
                C22755 m50831 = C22755.m50831(m36254(2).getText().toString().trim(), c182843.f56840);
                c182844 = activityC21107.f68093;
                C23062 c23062 = new C23062(C18522.m43041(c3454, m27862, m50831, C11467.m28270(m36254(1).getText().toString(), c182844.f56840)), i2);
                c182845 = activityC21107.f68093;
                c182845.f56834.m27863().m20246(c23062);
                ActivityC21107.f68088 = true;
                activityC21107.m48069();
            } catch (Exception unused) {
                C21374.m48457(R.string.MT_Protector_res_0x7f12001d);
                return false;
            }
        } else {
            boolean z = this.f51773;
            String trim2 = m36254(0).getText().toString().trim();
            if (z) {
                if (!trim2.contains("static")) {
                    trim2 = "static ".concat(trim2);
                }
            } else if (trim2.contains("static")) {
                trim2 = trim2.replace("static", "").replace(EnumC0121.f1143, " ").trim();
            }
            try {
                if (!trim2.equals("") && (split2 = ActivityC21107.f68087.split(trim2)) != null) {
                    int i4 = 0;
                    for (String str2 : split2) {
                        i4 |= EnumC7233.m19338(str2).getValue();
                    }
                    i2 = i4;
                }
                c182846 = activityC21107.f68093;
                C3454 c34542 = c182846.f56840;
                c182847 = activityC21107.f68093;
                C22755 m278622 = c182847.f56834.m27862();
                c182848 = activityC21107.f68093;
                C22755 m508312 = C22755.m50831(m36254(2).getText().toString().trim(), c182848.f56840);
                c182849 = activityC21107.f68093;
                C23062 c230622 = new C23062(C18522.m43041(c34542, m278622, m508312, C11467.m28270(m36254(1).getText().toString(), c182849.f56840)), i2);
                if (z) {
                    c1828412 = activityC21107.f68093;
                    c1828412.f56834.m27863().m20243(this.f51775, c230622, m36254(3).getText().toString());
                    c1828413 = activityC21107.f68093;
                    c1828413.f56836.set(this.f51775, c230622);
                } else {
                    c1828410 = activityC21107.f68093;
                    c1828410.f56834.m27863().m20242(this.f51775, c230622);
                    c1828411 = activityC21107.f68093;
                    c1828411.f56835.set(this.f51775, c230622);
                }
                ActivityC21107.f68088 = true;
            } catch (Exception unused2) {
                C21374.m48457(R.string.MT_Protector_res_0x7f12001d);
                return false;
            }
        }
        c12609 = activityC21107.f68092;
        c12609.notifyDataSetChanged();
        return true;
    }
}

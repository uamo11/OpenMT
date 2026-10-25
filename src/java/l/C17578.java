package l;

import android.widget.EditText;
import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: P676 */
/* renamed from: l.ܿ᩶ܽ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17578 extends AbstractC15252 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f53726;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f53727;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C13889 f53728;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17578(ActivityC21107 activityC21107) {
        super(activityC21107);
        this.f53727 = activityC21107;
        m36257(R.string.MT_Protector_res_0x7f12001e, R.string.MT_Protector_res_0x7f120627, R.string.MT_Protector_res_0x7f120240, R.string.MT_Protector_res_0x7f120803);
        m36254(3).setInputType(2);
        m36260(R.string.MT_Protector_res_0x7f120619);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41101(int i, C13889 c13889) {
        this.f53726 = i;
        this.f53728 = c13889;
        m36254(0).setText(EnumC7233.m19343(c13889.f41403));
        EditText m36254 = m36254(1);
        C22050 c22050 = c13889.f41402;
        m36254.setText(c22050.f70681.m28273());
        m36254(2).setText(c22050.f70680.m31312());
        C4160 c4160 = c13889.f41404;
        if (c4160 != null) {
            m36254(3).setText(String.valueOf(c4160.f13572));
        } else {
            m36259(3).setVisibility(8);
        }
        m36262();
        m36258().setText(R.string.MT_Protector_res_0x7f12070a);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m41102() {
        this.f53726 = -1;
        this.f53728 = null;
        m36254(0).setText("public");
        m36254(1).setText("newMethod");
        m36254(2).setText("()V");
        m36254(3).setText("0");
        m36262();
        m36258().setText(R.string.MT_Protector_res_0x7f120203);
    }

    @Override // l.AbstractC15252
    /* renamed from: ܽ */
    public final boolean mo4060() {
        int i;
        C18284 c18284;
        C18284 c182842;
        C18284 c182843;
        C18284 c182844;
        C18284 c182845;
        C18284 c182846;
        C18284 c182847;
        C4160 c4160;
        C18284 c182848;
        C18284 c182849;
        String[] split;
        C12609 c12609;
        int i2;
        C18284 c1828410;
        C18284 c1828411;
        C18284 c1828412;
        C18284 c1828413;
        C18284 c1828414;
        C18284 c1828415;
        C18284 c1828416;
        C18284 c1828417;
        C18284 c1828418;
        C18284 c1828419;
        String[] split2;
        int i3 = this.f53726;
        ActivityC21107 activityC21107 = this.f53727;
        if (i3 == -1) {
            String trim = m36254(0).getText().toString().trim();
            try {
                if (trim.equals("") || (split = ActivityC21107.f68087.split(trim)) == null) {
                    i = 0;
                } else {
                    i = 0;
                    for (String str : split) {
                        i |= EnumC7233.m19338(str).getValue();
                    }
                }
                String[] split3 = ActivityC21107.f68086.split(m36254(2).getText().toString());
                if (split3[split3.length - 1].equals("")) {
                    C21374.m48459((CharSequence) "No Return Type Exception");
                    return false;
                }
                c18284 = activityC21107.f68093;
                C13582 m30905 = C12639.m30905(split3[split3.length - 2], c18284.f56840);
                c182842 = activityC21107.f68093;
                C22755 m50831 = C22755.m50831(split3[split3.length - 1], c182842.f56840);
                c182843 = activityC21107.f68093;
                C3454 c3454 = c182843.f56840;
                c182844 = activityC21107.f68093;
                C22755 m27862 = c182844.f56834.m27862();
                c182845 = activityC21107.f68093;
                C12877 m31309 = C12877.m31309(c182845.f56840, m50831, m30905);
                c182846 = activityC21107.f68093;
                C22050 m49611 = C22050.m49611(c3454, m27862, m31309, C11467.m28270(m36254(1).getText().toString(), c182846.f56840));
                int parseInt = Integer.parseInt(m36254(3).getText().toString().trim());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C9141(EnumC23915.f77361));
                c182847 = activityC21107.f68093;
                if ((c182847.f56834.f33738 & EnumC7233.INTERFACE.getValue()) == 0 && (EnumC7233.ABSTRACT.getValue() & i) == 0) {
                    c182849 = activityC21107.f68093;
                    c4160 = C4160.m12579(c182849.f56840, parseInt, arrayList);
                } else {
                    c4160 = null;
                }
                c182848 = activityC21107.f68093;
                c182848.f56834.m27863().m20245(new C13889(m49611, i, c4160));
                activityC21107.m48063();
            } catch (Exception unused) {
                C21374.m48457(R.string.MT_Protector_res_0x7f12001d);
                return false;
            }
        } else {
            boolean m33300 = this.f53728.m33300();
            String trim2 = m36254(0).getText().toString().trim();
            if (m33300) {
                if (!trim2.contains("static")) {
                    trim2 = "static ".concat(trim2);
                }
            } else if (trim2.contains("static")) {
                trim2 = trim2.replace("static", "").replace(EnumC0121.f1143, " ").trim();
            }
            try {
                if (trim2.equals("") || (split2 = ActivityC21107.f68087.split(trim2)) == null) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    for (String str2 : split2) {
                        i2 |= EnumC7233.m19338(str2).getValue();
                    }
                }
                String[] split4 = ActivityC21107.f68086.split(m36254(2).getText().toString());
                if (split4[split4.length - 1].equals("")) {
                    C21374.m48459((CharSequence) "No Return Type Exception");
                    return false;
                }
                try {
                    c1828410 = activityC21107.f68093;
                    C13582 m309052 = C12639.m30905(split4[split4.length - 2], c1828410.f56840);
                    c1828411 = activityC21107.f68093;
                    C22755 m508312 = C22755.m50831(split4[split4.length - 1], c1828411.f56840);
                    c1828412 = activityC21107.f68093;
                    C3454 c34542 = c1828412.f56840;
                    c1828413 = activityC21107.f68093;
                    C22755 m278622 = c1828413.f56834.m27862();
                    c1828414 = activityC21107.f68093;
                    C12877 m313092 = C12877.m31309(c1828414.f56840, m508312, m309052);
                    c1828415 = activityC21107.f68093;
                    this.f53728 = new C13889(C22050.m49611(c34542, m278622, m313092, C11467.m28270(m36254(1).getText().toString(), c1828415.f56840)), i2, this.f53728.f41404);
                    if (m33300) {
                        c1828418 = activityC21107.f68093;
                        c1828418.f56834.m27863().m20241(this.f53726, this.f53728);
                        c1828419 = activityC21107.f68093;
                        c1828419.f56852.set(this.f53726, this.f53728);
                    } else {
                        c1828416 = activityC21107.f68093;
                        c1828416.f56834.m27863().m20248(this.f53726, this.f53728);
                        c1828417 = activityC21107.f68093;
                        c1828417.f56850.set(this.f53726, this.f53728);
                    }
                    try {
                        C4160 c41602 = this.f53728.f41404;
                        if (c41602 != null) {
                            c41602.f13572 = Integer.parseInt(m36254(3).getText().toString().trim());
                        }
                        ActivityC21107.f68088 = true;
                    } catch (Exception unused2) {
                        C21374.m48459((CharSequence) "Register Count Error");
                        return false;
                    }
                } catch (Exception unused3) {
                    C21374.m48459((CharSequence) "Method Name Or Descriptor Error");
                }
            } catch (Exception unused4) {
                C21374.m48457(R.string.MT_Protector_res_0x7f12001d);
            }
        }
        c12609 = activityC21107.f68092;
        c12609.notifyDataSetChanged();
        return true;
    }
}

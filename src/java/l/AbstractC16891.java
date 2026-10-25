package l;

import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: 969A */
/* renamed from: l.ܽ᩷ܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC16891 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14173 f51866;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f51867;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C11248 f51868;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f51869;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f51870;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f51871;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f51872;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f51873;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f51874;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f51875;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f51876;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f51877;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f51878;

    /* renamed from: ֡᩹֡, reason: not valid java name and contains not printable characters */
    private static final short[] f51858 = {349, 11054, 11045, 11042, 11106, 11041, 11064, 11106, 11068, 11040, 11065, 11071};

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final int[] f51861 = {0, 1, 4, 3, 2, 5, 6, 7, 8, 9};

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static volatile int f51863 = (int) (System.currentTimeMillis() % 10000000);

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final AtomicLong f51859 = new AtomicLong();

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC10942 f51862 = new ConcurrentMapC10942();

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final AbstractC10128 f51864 = new C15065(R.string.MT_Protector_res_0x7f1205f5, R.drawable.MT_Protector_res_0x7f08022b);

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final AbstractC10128 f51865 = new C21417(R.string.MT_Protector_res_0x7f120911, R.drawable.MT_Protector_res_0x7f080238);

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final AbstractC10128 f51860 = new C22122(R.string.MT_Protector_res_0x7f1203d7, R.drawable.MT_Protector_res_0x7f0801f9);

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final AbstractC10128 f51857 = new C20006(R.string.MT_Protector_res_0x7f12060b, R.drawable.MT_Protector_res_0x7f080242);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Runnable mo39734(boolean z) {
        return null;
    }

    /* renamed from: ֫ */
    public void mo15160(String str, boolean z) {
    }

    /* renamed from: ֫ */
    public abstract void mo6005(C16560 c16560, List list, Runnable runnable);

    /* renamed from: ֫ */
    public abstract void mo6006(C16560 c16560, C16560 c165602);

    /* renamed from: ֫ */
    public void mo15162(InterfaceC17889 interfaceC17889) {
    }

    /* renamed from: ֫֫ */
    public boolean mo15163() {
        return false;
    }

    /* renamed from: ۗ */
    public abstract String mo6007();

    /* renamed from: ۛ */
    public abstract List mo6010();

    /* renamed from: ۟ */
    public abstract boolean mo6011();

    /* renamed from: ۤ */
    public abstract List mo6012();

    /* renamed from: ۧ */
    public String mo35228(C16560 c16560) {
        return null;
    }

    /* renamed from: ۧ */
    public abstract AbstractC15440 mo6013(InterfaceC17889 interfaceC17889);

    /* renamed from: ۧ */
    public boolean mo35229() {
        return true;
    }

    /* renamed from: ۧ */
    public abstract boolean mo6014(String str);

    /* renamed from: ۧ֫ */
    public abstract boolean mo6015();

    /* renamed from: ۨ */
    public int mo15166() {
        return R.string.MT_Protector_res_0x7f12079b;
    }

    /* renamed from: ۫ */
    public abstract boolean mo6016();

    /* renamed from: ۬ */
    public boolean mo39505() {
        return false;
    }

    /* renamed from: ܰ */
    public void mo15167() {
    }

    /* renamed from: ܳ */
    public abstract C12244 mo6017();

    /* renamed from: ܽ */
    public abstract void mo6018(C16560 c16560);

    /* renamed from: ܽ */
    public boolean mo15170(String str) {
        return false;
    }

    /* renamed from: ᩶ */
    public abstract AbstractC13921 mo6020();

    /* renamed from: ᩺ */
    public abstract void mo6021();

    /* renamed from: ᩵ */
    public AbstractC1661 mo35231() {
        return new C0208(R.string.MT_Protector_res_0x7f120606, R.drawable.MT_Protector_res_0x7f08023e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        if (l.C11340.f33930 < 0) goto L64;
     */
    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List m39739() {
        /*
            Method dump skipped, instructions count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC16891.m39739():java.util.List");
    }

    public AbstractC16891(int i, String str) {
        this.f51871 = true;
        this.f51875 = Collections.EMPTY_LIST;
        this.f51868 = new C11248();
        synchronized (AbstractC16891.class) {
            int i2 = f51863;
            f51863 = i2 + 1;
            this.f51876 = i2;
        }
        this.f51872 = i;
        this.f51870 = mo39506();
        mo35230(str);
    }

    public AbstractC16891(C12951 c12951) {
        this.f51871 = true;
        this.f51875 = Collections.EMPTY_LIST;
        C11248 c11248 = new C11248();
        this.f51868 = c11248;
        this.f51876 = c12951.readInt();
        this.f51872 = c12951.readInt();
        mo35230(c12951.m31506());
        String m31503 = c12951.m31503();
        this.f51870 = m31503 == null ? null : C16999.m39866(m31503, new String[0]);
        this.f51874 = c12951.m31503();
        this.f51871 = c12951.m31498();
        c11248.m27820(c12951);
        int m31494 = c12951.m31494();
        ArrayList arrayList = new ArrayList(m31494);
        for (int i = 0; i < m31494; i++) {
            arrayList.add(new C5977(c12951));
        }
        m39736((List) arrayList);
    }

    /* renamed from: ֫ */
    public void mo6004(C10130 c10130) {
        c10130.writeInt(this.f51876);
        c10130.writeInt(this.f51872);
        c10130.m25439(this.f51878);
        AbstractC15440 abstractC15440 = this.f51870;
        c10130.m25424(abstractC15440 == null ? null : abstractC15440.mo23554());
        c10130.m25424(this.f51874);
        c10130.m25425(this.f51871);
        this.f51868.m27819(c10130);
        List m39739 = m39739();
        c10130.mo13231(m39739.size());
        Iterator it = m39739.iterator();
        while (it.hasNext()) {
            ((C5977) it.next()).m16769(c10130);
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m39746() {
        return this.f51876;
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m39732() {
        return this.f51872;
    }

    /* renamed from: ᩳ */
    public AbstractC15440 mo39506() {
        return C16293.f50113.m36535("_" + mo6007().toLowerCase());
    }

    /* renamed from: ܿ */
    public void mo35230(String str) {
        this.f51878 = m39731(str);
    }

    /* renamed from: ۙ */
    public String mo6009() {
        return m39728(this.f51878);
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String m39741() {
        return this.f51878;
    }

    /* renamed from: ᩹ */
    public String mo39508() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String m39742() {
        return mo39505() ? mo39508() : this.f51878;
    }

    /* renamed from: ᩸ */
    public String mo39507() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ۧ */
    public void mo14824(boolean z) {
        mo6020().mo7646(z);
    }

    /* renamed from: ֫ */
    public void mo26935(C2450 c2450, ArrayList arrayList) {
        if (c2450.m7923()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        C14173 c14173 = this.f51866;
        if (c14173 != null) {
            if (c14173.m33824("arsc")) {
                arrayList2.add(new C15584());
            } else if (this.f51866.m33824("dex")) {
                arrayList2.add(new C19114());
            } else if (this.f51866.m33824("folder")) {
                arrayList2.add(new C9942());
            } else if (this.f51866.m33824("zip") || this.f51866.m33823()) {
                arrayList2.add(new C15730());
            } else if (this.f51866.m33824("apk")) {
                arrayList2.add(new C19114());
                arrayList2.add(new C15730(R.string.MT_Protector_res_0x7f1205b6, R.drawable.MT_Protector_res_0x7f0801e2));
                arrayList2.add(new C15584());
                arrayList2.add(new C9236());
            } else {
                arrayList2.add(new C16436());
            }
            if (!this.f51866.m33824("folder")) {
                C14173 c141732 = this.f51866;
                if (c141732.f42801 == c141732.f42803) {
                    arrayList2.add(new C7119());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        int m39730 = m39730();
        if (arrayList2.size() % 2 != 0 && !C2326.m7584().mo1456(c2450)) {
            arrayList.set(m39730, (AbstractC1661) arrayList2.remove(0));
        }
        arrayList.addAll(arrayList2);
    }

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static int m39730() {
        int[] m35543 = DialogInterfaceOnDismissListenerC15010.m35543();
        int length = m35543.length;
        for (int i = 0; i < length; i++) {
            if (m35543[i] == 8) {
                return i;
            }
        }
        throw new IllegalArgumentException("Unknown item command id: 8");
    }

    /* renamed from: ֫ */
    public AbstractC1661 mo39503(C2450 c2450) {
        return C9214.m23655(c2450);
    }

    /* renamed from: ۧ */
    public AbstractC1661 mo15165(C2450 c2450) {
        return C4442.m13193();
    }

    /* renamed from: ֡ */
    public AbstractC1661 mo15159() {
        return C5853.m16412();
    }

    /* renamed from: ᩴ */
    public AbstractC1661 mo15172() {
        return C12203.m29684();
    }

    /* renamed from: ܺ */
    public AbstractC1661 mo15169() {
        return C19965.m46041();
    }

    /* renamed from: ۡ */
    public AbstractC1661 mo39504() {
        return C21376.m48469();
    }

    /* renamed from: ۘ */
    public AbstractC1661 mo6008() {
        return C12908.m31356();
    }

    /* renamed from: ۖ */
    public AbstractC1661 mo35227() {
        return C2326.m7584();
    }

    /* renamed from: ۢ */
    public AbstractC1661 mo15164() {
        return C15024.m35555();
    }

    /* renamed from: ֫ */
    public void mo35226(C16560 c16560, InterfaceC17889 interfaceC17889) {
        C19568.m45012(c16560, interfaceC17889);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39736(List list) {
        this.f51875 = (List) C11003.requireNonNullElse(list, Collections.EMPTY_LIST);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39735(ArrayList arrayList) {
        if (this.f51875.isEmpty()) {
            m39736((List) arrayList);
            return;
        }
        Set set = (Set) C5378.stream(arrayList).map(new C8011(0)).collect(C22976.toSet());
        ArrayList arrayList2 = new ArrayList();
        for (C5977 c5977 : this.f51875) {
            if (!set.contains(c5977.m16770().toLowerCase())) {
                arrayList2.add(c5977);
            }
        }
        arrayList2.addAll(arrayList);
        m39736((List) arrayList2);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m39740() {
        return this.f51874;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m39745(String str) {
        this.f51874 = C19568.m44997(str);
    }

    /* renamed from: ᩻ */
    public InterfaceC10834 mo14827() {
        return C3695.f11656;
    }

    /* renamed from: ֫ */
    public void mo15161(C16560 c16560, String str, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39737(final C16560 c16560) {
        List<C5977> m39739 = m39739();
        if (m39739.isEmpty()) {
            return;
        }
        long j = 0;
        boolean z = false;
        final AbstractC15440 abstractC15440 = null;
        for (C5977 c5977 : m39739) {
            if (c5977.m16773()) {
                c5977.m16771();
                if (abstractC15440 == null || c5977.m16772() > j) {
                    abstractC15440 = c5977.m16768();
                    j = c5977.m16772();
                }
                z = true;
            }
        }
        if (z) {
            c16560.m39042();
            SpannableString spannableString = new SpannableString(C4925.m14327(R.string.MT_Protector_res_0x7f120530));
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 17);
            SpannableString spannableString2 = new SpannableString(C4925.m14327(R.string.MT_Protector_res_0x7f120189));
            spannableString2.setSpan(new ForegroundColorSpan(C21943.f70269), 0, spannableString2.length(), 17);
            C19258 buildDialog = c16560.m39056().buildDialog();
            buildDialog.m44433(R.string.MT_Protector_res_0x7f120b7b);
            buildDialog.m44416(R.string.MT_Protector_res_0x7f120ab6);
            buildDialog.m44428(false);
            buildDialog.m44441(spannableString, new DialogInterface.OnClickListener() { // from class: l.֨ۜܳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    AbstractC16891.m39727(AbstractC16891.this, c16560, abstractC15440);
                }
            });
            buildDialog.m44425(spannableString2, (DialogInterface.OnClickListener) null);
            buildDialog.m44438();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39727(AbstractC16891 abstractC16891, C16560 c16560, AbstractC15440 abstractC15440) {
        C16560 m39026 = c16560.m39026();
        m39026.m39042();
        m39026.m39053(abstractC15440.getName());
        m39026.m39033(abstractC15440.m36511(), true);
        synchronized (abstractC16891) {
            abstractC16891.f51871 = false;
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m39744() {
        boolean z;
        synchronized (this) {
            boolean z2 = true;
            this.f51869 = true;
            AbstractC15440 abstractC15440 = this.f51870;
            z = false;
            if (abstractC15440 != null && this.f51871) {
                if (this.f51867 != 0) {
                    this.f51873 = true;
                } else {
                    if (abstractC15440 == null || !abstractC15440.mo23120()) {
                        z2 = false;
                    } else {
                        abstractC15440.mo23552();
                    }
                    z = z2;
                }
            }
        }
        if (z) {
            C15528.m36596();
        }
        Object mo6020 = mo6020();
        if (mo6020 instanceof AutoCloseable) {
            C0349.m1793((AutoCloseable) mo6020);
        }
        mo6021();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m39733(String str) {
        synchronized (this) {
            AbstractC15440 abstractC15440 = this.f51870;
            if (abstractC15440 != null && !this.f51869) {
                AbstractC15440 mo23559 = abstractC15440.mo23559();
                for (AbstractC15440 mo235592 = C16999.m39866(str, new String[0]).mo23559(); mo235592 != null; mo235592 = mo235592.m36536()) {
                    if (mo23559.equals(mo235592)) {
                        long incrementAndGet = f51859.incrementAndGet();
                        f51862.put(Long.valueOf(incrementAndGet), this);
                        this.f51867++;
                        return incrementAndGet;
                    }
                }
            }
            return 0L;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39726(long j) {
        AbstractC16891 abstractC16891;
        if (j == 0 || (abstractC16891 = (AbstractC16891) f51862.remove(Long.valueOf(j))) == null) {
            return;
        }
        synchronized (abstractC16891) {
            int i = abstractC16891.f51867;
            if (i <= 0) {
                return;
            }
            boolean z = true;
            int i2 = i - 1;
            abstractC16891.f51867 = i2;
            boolean z2 = false;
            if (i2 == 0 && abstractC16891.f51873) {
                abstractC16891.f51873 = false;
                AbstractC15440 abstractC15440 = abstractC16891.f51870;
                if (abstractC15440 == null || !abstractC15440.mo23120()) {
                    z = false;
                } else {
                    abstractC15440.mo23552();
                }
                z2 = z;
            }
            if (z2) {
                C4925.m14315(new RunnableC15608(0));
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC10128 m39743() {
        return new C4483(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC10128 m39725(int i, boolean z) {
        return new C3072(i, z);
    }

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC10128 m39729() {
        return new C12949(R.string.MT_Protector_res_0x7f1205e0, R.drawable.MT_Protector_res_0x7f080206);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39738(C16560 c16560, InterfaceC17889 interfaceC17889, InterfaceC7305 interfaceC7305) {
        C10211 c10211 = new C10211(interfaceC17889);
        mo6005(c16560, Collections.singletonList(c10211), new RunnableC9960(4, interfaceC7305, c10211));
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m39731(String str) {
        if (!str.startsWith("/")) {
            str = "/".concat(str);
        }
        return !str.endsWith("/") ? str.concat("/") : str;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m39728(String str) {
        if (str.length() <= 2000) {
            return str;
        }
        String[] split = str.split("/");
        StringBuilder sb = new StringBuilder("/");
        for (String str2 : split) {
            if (!str2.isEmpty()) {
                if (str2.length() > 500) {
                    str2 = str2.substring(0, 500);
                }
                sb.append(str2);
                sb.append('/');
            }
        }
        return sb.toString();
    }
}

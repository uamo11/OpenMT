package l;

import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import bin.mt.plus.Features;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BooleanSupplier;

/* compiled from: 22BV */
/* renamed from: l.ܽܽ᩻, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C16773 extends AbstractC16891 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static C16415 f51514;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static InterfaceC19944 f51515;

    /* renamed from: ܿ᩶᩷, reason: not valid java name and contains not printable characters */
    private static final short[] f51516;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static boolean f51517;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AbstractC10128 f51518;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC10128 f51519;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f51520;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f51521;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC10128 f51522;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC10128 f51523;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC10128 f51524;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC10128 f51525;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC10128 f51526;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC10128 f51527;

    @Override // l.AbstractC16891
    /* renamed from: ۗ */
    public final String mo6007() {
        return "local";
    }

    @Override // l.AbstractC16891
    /* renamed from: ۤ */
    public native List mo6012();

    @Override // l.AbstractC16891
    /* renamed from: ۧ֫ */
    public final boolean mo6015() {
        return true;
    }

    @Override // l.AbstractC16891
    /* renamed from: ۫ */
    public final boolean mo6016() {
        return true;
    }

    @Override // l.AbstractC16891
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 mo39506() {
        return null;
    }

    @Override // l.AbstractC16891
    /* renamed from: ᩺ */
    public final void mo6021() {
    }

    static {
        ApplicationC12518.m30701(128);
        f51516 = new short[]{5018, -16851, -16829, -16788, -16794, -16784, -16787, -16789, -16794, -16851, -16794, -16797, -16778, -16797, -16829, -16788, -16794, -16784, -16787, -16789, -16794, -16851, -16794, -16797, -16778, -16797, -16829, -16788, -16794, -16784, -16787, -16789, -16794, -16851, -16787, -16800, -16800, -10634, 13630, -11338, -16829, -16788, -16794, -16784, -16787, -16789, -16794, -16851, -16787, -16800, -16800};
        new C22254().m20274();
        f51514 = new C16415("local", null);
        f51515 = new C4615();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m39498(String str) {
        InputStream resourceAsStream = C16773.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            return false;
        }
        C0349.m1793(resourceAsStream);
        return true;
    }

    public C16773(String str) {
        super(0, str);
        InterfaceC19944 interfaceC19944 = f51515;
        this.f51518 = new C3204(this, interfaceC19944);
        this.f51524 = new C13081(this, interfaceC19944);
        this.f51525 = new C12376(this);
        this.f51526 = new C10260(this);
        this.f51523 = new C6026(this);
        this.f51522 = new C11130(this);
        this.f51519 = new C15197(this);
        this.f51527 = new C21549(this);
    }

    public C16773(C12951 c12951) {
        super(c12951);
        InterfaceC19944 interfaceC19944 = f51515;
        this.f51518 = new C3204(this, interfaceC19944);
        this.f51524 = new C13081(this, interfaceC19944);
        this.f51525 = new C12376(this);
        this.f51526 = new C10260(this);
        this.f51523 = new C6026(this);
        this.f51522 = new C11130(this);
        this.f51519 = new C15197(this);
        this.f51527 = new C21549(this);
    }

    @Override // l.AbstractC16891
    /* renamed from: ֫ */
    public final void mo6004(C10130 c10130) {
        super.mo6004(c10130);
    }

    @Override // l.AbstractC16891
    /* renamed from: ܿ */
    public final void mo35230(String str) {
        super.mo35230(str);
        if (mo39505()) {
            C11003.requireNonNull(f51514.f50494);
            str = AbstractC16891.m39731(f51514.f50494);
            this.f51520 = str;
        } else {
            this.f51520 = null;
        }
        try {
            this.f51521 = C20402.m46728(str);
        } catch (IOException unused) {
            this.f51521 = str;
        }
    }

    @Override // l.AbstractC16891
    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String mo39508() {
        return this.f51520;
    }

    @Override // l.AbstractC16891
    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean mo39505() {
        return m39741().startsWith("//SEARCH//");
    }

    @Override // l.AbstractC16891
    /* renamed from: ۟ */
    public final boolean mo6011() {
        return (this.f51521.startsWith("/proc/") || this.f51521.startsWith("/dev/")) ? false : true;
    }

    @Override // l.AbstractC16891
    /* renamed from: ۧ */
    public final String mo35228(C16560 c16560) {
        try {
            C5292 c5292 = new C5292(this.f51521);
            long m15219 = c5292.m15219();
            long m15220 = c5292.m15220();
            if (m15220 == 0) {
                return null;
            }
            return C4925.m14306(R.string.MT_Protector_res_0x7f1202bf, C22927.m51020(m15220 - m15219), C22927.m51020(m15220));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // l.AbstractC16891
    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String mo39507() {
        return this.f51521;
    }

    @Override // l.AbstractC16891
    /* renamed from: ۙ */
    public final String mo6009() {
        if (mo39505()) {
            return AbstractC16891.m39728(this.f51520) + " - " + C4925.m14327(R.string.MT_Protector_res_0x7f120900);
        }
        return super.mo6009();
    }

    @Override // l.AbstractC16891
    /* renamed from: ᩶ */
    public final AbstractC13921 mo6020() {
        return C2499.f7958;
    }

    @Override // l.AbstractC16891
    /* renamed from: ۧ */
    public final void mo14824(boolean z) {
        ArrayList arrayList;
        super.mo14824(z);
        C18838.m43521();
        if (mo39505()) {
            C16415 c16415 = f51514;
            synchronized (c16415) {
                arrayList = new ArrayList(c16415.f50492);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C9555) ((C12182) it.next()).m29658()).m24432();
            }
        }
    }

    @Override // l.AbstractC16891
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC1661 mo39503(C2450 c2450) {
        AbstractC1661 m23655 = C9214.m23655(c2450);
        if (m23655 == C22081.m49676()) {
            m23655 = new C22081();
        }
        return m23655.mo5603(new C1431());
    }

    @Override // l.AbstractC16891
    /* renamed from: ۧ */
    public final AbstractC1661 mo15165(C2450 c2450) {
        AbstractC1661 c17909;
        if (!c2450.m7919().m39035(b.k)) {
            c17909 = new C17909(R.string.MT_Protector_res_0x7f1205ec, R.drawable.MT_Protector_res_0x7f0801e5);
            c17909.m5604();
        } else {
            c17909 = new C1894("local");
        }
        return c17909.mo5603(new C14380());
    }

    @Override // l.AbstractC16891
    /* renamed from: ֡ */
    public final AbstractC1661 mo15159() {
        return new C8031();
    }

    @Override // l.AbstractC16891
    /* renamed from: ᩴ */
    public final AbstractC1661 mo15172() {
        if (mo39505()) {
            C12448 c12448 = new C12448(R.string.MT_Protector_res_0x7f120530, R.drawable.MT_Protector_res_0x7f08021a);
            c12448.m5604();
            return c12448;
        }
        return new C18615();
    }

    @Override // l.AbstractC16891
    /* renamed from: ܺ */
    public final AbstractC1661 mo15169() {
        C12720 c12720 = new C12720(R.string.MT_Protector_res_0x7f1205ca, R.drawable.MT_Protector_res_0x7f0801e6);
        c12720.f38273 = new ArrayList();
        return c12720;
    }

    @Override // l.AbstractC16891
    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC1661 mo39504() {
        if (mo39505()) {
            return new C10332(R.string.MT_Protector_res_0x7f120530, R.drawable.MT_Protector_res_0x7f080219);
        }
        return new C24009(R.string.MT_Protector_res_0x7f1205be, R.drawable.MT_Protector_res_0x7f080254);
    }

    @Override // l.AbstractC16891
    /* renamed from: ۘ */
    public final AbstractC1661 mo6008() {
        return new DialogInterfaceOnDismissListenerC8215();
    }

    @Override // l.AbstractC16891
    /* renamed from: ۢ */
    public final AbstractC1661 mo15164() {
        return new C1099(R.string.MT_Protector_res_0x7f1205ae, R.drawable.MT_Protector_res_0x7f0801cf);
    }

    @Override // l.AbstractC16891
    /* renamed from: ֫ */
    public final void mo35226(final C16560 c16560, InterfaceC17889 interfaceC17889) {
        C18739 c18739;
        if (!C9255.m23780()) {
            AbstractC15440 mo24433 = interfaceC17889.mo24433();
            if (mo24433 instanceof C12993) {
                final C12993 c12993 = (C12993) mo24433;
                if (C9255.m23770()) {
                    final C16477 mo24428 = interfaceC17889.mo24428();
                    int m38842 = mo24428.m38842();
                    if ((mo24428.m38838() < 10000 || (m38842 & 4) == 0) && (m38842 & 36) == 0) {
                        c18739 = new C18739(c16560, new BooleanSupplier() { // from class: l.ᩴۧ᩻
                            @Override // java.util.function.BooleanSupplier
                            public final boolean getAsBoolean() {
                                C12993 c129932 = C12993.this;
                                C16477 c16477 = mo24428;
                                int m388422 = c16477.m38842();
                                boolean z = false;
                                if ((c16477.m38838() < 10000 || (m388422 & 4) == 0) && (m388422 & 36) == 0) {
                                    try {
                                        c129932.mo27926().close();
                                    } catch (IOException unused) {
                                        z = true;
                                    }
                                }
                                return !z;
                            }
                        }, interfaceC17889, new Runnable() { // from class: l.᩵ۧ᩻
                            @Override // java.lang.Runnable
                            public final void run() {
                                Main m39056 = C16560.this.m39056();
                                C16477 c16477 = mo24428;
                                C19445.m44786(m39056, c12993.mo23554(), C10881.m27180(c16477.m38842()), c16477.m38837(), c16477.m38833());
                            }
                        });
                    } else {
                        C19568.m45012(c16560, interfaceC17889);
                        return;
                    }
                } else if (Build.VERSION.SDK_INT >= 30 && c12993.mo31568()) {
                    final Uri mo31567 = c12993.mo31567();
                    c18739 = new C18739(c16560, new BooleanSupplier() { // from class: l.֡ۧ᩻
                        @Override // java.util.function.BooleanSupplier
                        public final boolean getAsBoolean() {
                            try {
                                ParcelFileDescriptor openFileDescriptor = C4925.m14336().openFileDescriptor(mo31567, "r");
                                if (openFileDescriptor != null) {
                                    openFileDescriptor.close();
                                }
                                return true;
                            } catch (Exception e) {
                                String message = e.getMessage();
                                return message == null || !message.contains("Permission denied");
                            }
                        }
                    }, interfaceC17889, new Runnable() { // from class: l.ۚۧ᩻
                        @Override // java.lang.Runnable
                        public final void run() {
                            C19445.m44786(C16560.this.m39056(), c12993.mo23554(), "unknown", "unknown", "unknown");
                        }
                    });
                }
                c18739.m20274();
                return;
            }
            if (mo24433 instanceof C11893) {
                C11893 c11893 = (C11893) mo24433;
                try {
                    StructStat lstat = Os.lstat(c11893.m29018());
                    int i = lstat.st_mode;
                    boolean z = false;
                    if ((lstat.st_gid < 10000 || (i & 4) == 0) && (i & 36) == 0) {
                        try {
                            c11893.mo27926().close();
                        } catch (IOException unused) {
                            z = true;
                        }
                    }
                    if (z) {
                        C19445.m44786(c16560.m39056(), c11893.mo23554(), C10881.m27180(lstat.st_mode), Features.m56(lstat.st_uid), Features.m56(lstat.st_gid));
                        return;
                    }
                } catch (ErrnoException unused2) {
                }
            }
        }
        C19568.m45012(c16560, interfaceC17889);
    }

    @Override // l.AbstractC16891
    /* renamed from: ֫ */
    public final void mo15162(InterfaceC17889 interfaceC17889) {
        String path = interfaceC17889.getPath();
        C9068 c9068 = C9068.f27496;
        C11233.m27805(path, MotionUtils.EASING_TYPE_PATH);
        C9068.m23402(path, (C17534) null);
    }

    @Override // l.AbstractC16891
    /* renamed from: ֫ */
    public final void mo15160(String str, boolean z) {
        C9068 c9068 = C9068.f27496;
        C11233.m27805(str, MotionUtils.EASING_TYPE_PATH);
        C9068.m23402(str, (C17534) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x014e, code lost:
    
        if ("apk".equals(r7) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015a, code lost:
    
        if ("jar".equals(r7) != false) goto L73;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0064. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0195 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bc  */
    @Override // l.AbstractC16891
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo26935(l.C2450 r11, java.util.ArrayList r12) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16773.mo26935(l.ۖۢܳ, java.util.ArrayList):void");
    }

    @Override // l.AbstractC16891
    /* renamed from: ᩻ */
    public final InterfaceC10834 mo14827() {
        return C20844.f67485;
    }

    @Override // l.AbstractC16891
    /* renamed from: ܳ */
    public final C12244 mo6017() {
        if (mo39505()) {
            return new C12244(C4925.m14327(R.string.MT_Protector_res_0x7f120900), this.f51520, C19883.f64194);
        }
        String m39741 = m39741();
        return new C12244(C9523.m24392(m39741), m39741, C19883.f64181);
    }

    @Override // l.AbstractC16891
    /* renamed from: ۧ */
    public final AbstractC15440 mo6013(InterfaceC17889 interfaceC17889) {
        return interfaceC17889.mo24433();
    }

    @Override // l.AbstractC16891
    /* renamed from: ֫ */
    public final void mo6005(C16560 c16560, List list, Runnable runnable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C10211 c10211 = (C10211) it.next();
            AbstractC15440 m39866 = C16999.m39866(c10211.m25623(), new String[0]);
            c10211.m25620(m39866);
            arrayList.add(new C5977(m39866, m39866.getName(), m39866.mo23554()));
        }
        m39736((List) arrayList);
        try {
            runnable.run();
        } catch (Throwable th) {
            c16560.m39056().m10223(th, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC16891
    /* renamed from: ֫֫ */
    public final boolean mo15163() {
        return (C15871.m37616() || mo39505()) ? false : true;
    }

    @Override // l.AbstractC16891
    /* renamed from: ֫ */
    public final void mo15161(C16560 c16560, String str, boolean z) {
        boolean z2;
        Main m39056;
        String concat;
        if (mo39505()) {
            return;
        }
        try {
            C17721.m41503(this.f51521, EnumC16309.MODIFY_DIRECTORY_LINKED);
            AbstractC15440 m39866 = str.startsWith("/") ? C16999.m39866(str, new String[0]) : C16999.m39866(m39741(), str);
            if (m39866.mo23120()) {
                if (m39866.mo23113()) {
                    throw new C1637(R.string.MT_Protector_res_0x7f1203fc);
                }
                throw new C1637(R.string.MT_Protector_res_0x7f1203a1);
            }
            if (z) {
                z2 = m39866.mo23546();
            } else {
                AbstractC15440 m36536 = m39866.m36536();
                z2 = (m36536 == null || m36536.mo23120() || m36536.mo23546()) && m39866.mo23545();
            }
            if (!z2) {
                if (z) {
                    m39056 = c16560.m39056();
                    concat = "Failed to create directory: ".concat(str);
                } else {
                    m39056 = c16560.m39056();
                    concat = "Failed to create file: ".concat(str);
                }
                m39056.m10221(concat, false);
                C15528.m36596();
                return;
            }
            c16560.m39053(m39866.getName());
            if (str.indexOf(47) == -1) {
                C15528.m36596();
            } else {
                c16560.m39033(m39866.getParent(), true);
            }
        } catch (C1637 e) {
            c16560.m39056().m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC16891
    /* renamed from: ֫ */
    public final void mo6006(C16560 c16560, C16560 c165602) {
        c16560.m38998("local");
        if (!c165602.m39035("local")) {
            C9340 m39016 = c16560.m39016();
            m39016.m24060(c165602, m39016.m24080(), false);
        }
        c16560.m39018();
    }

    @Override // l.AbstractC16891
    /* renamed from: ۧ */
    public final boolean mo6014(String str) {
        AbstractC15440 m39866 = C16999.m39866(str, new String[0]);
        return m39866.mo23120() && !m39866.mo23113();
    }

    @Override // l.AbstractC16891
    /* renamed from: ܽ */
    public final void mo6018(C16560 c16560) {
        if (c16560.m39037()) {
            return;
        }
        List<C5977> m39739 = m39739();
        if (m39739.isEmpty()) {
            return;
        }
        m39736((List) null);
        boolean mo39505 = mo39505();
        ArrayList arrayList = new ArrayList();
        for (C5977 c5977 : m39739) {
            if (c5977.m16773()) {
                arrayList.add(mo39505 ? c5977.m16770() : c5977.m16774());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (mo39505) {
            c16560.m38999(arrayList);
        } else {
            c16560.m39000((Collection) arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39495(C12951 c12951) {
        C16415 c16415 = new C16415("local", c12951.m31503());
        c16415.f50491 = c12951.readInt();
        int readInt = c12951.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            String m31506 = c12951.m31506();
            String m315062 = c12951.m31506();
            AbstractC15440 m39866 = C16999.m39866(m31506, new String[0]);
            if (m39866 instanceof InterfaceC21855) {
                m39866 = ((InterfaceC21855) m39866).mo27913();
            }
            arrayList.add(new C12182(new C9555(m39866), m315062));
        }
        BitSet valueOf = BitSet.valueOf(c12951.m31496());
        for (int i2 = 0; i2 < readInt; i2++) {
            if (valueOf.get(i2)) {
                ((C12182) arrayList.get(i2)).f36324 = true;
            }
        }
        c16415.f50492 = arrayList;
        f51514 = c16415;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m39499(C10130 c10130) {
        ArrayList arrayList;
        C16415 c16415 = f51514;
        c10130.m25424(c16415.f50494);
        c10130.writeInt(c16415.f50491);
        synchronized (c16415) {
            arrayList = new ArrayList(c16415.f50492);
        }
        c10130.writeInt(arrayList.size());
        BitSet bitSet = new BitSet(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C12182 c12182 = (C12182) arrayList.get(i);
            c10130.m25439(c12182.m29658().getPath());
            c10130.m25439(c12182.m29662());
            bitSet.set(i, c12182.f36324);
        }
        c10130.m25434(bitSet.toByteArray());
    }

    @Override // l.AbstractC16891
    /* renamed from: ۛ */
    public final List mo6010() {
        return Arrays.asList(AbstractC16891.f51864, this.f51518, this.f51524, this.f51525, AbstractC16891.f51865, AbstractC16891.f51860, AbstractC16891.f51857, this.f51519, this.f51522, this.f51526, this.f51523, this.f51527);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m39496(final C16560 c16560, final int i) {
        C13698 m27502 = C11083.m27502();
        boolean z = false;
        if (!m27502.m32947()) {
            C11083 m128 = c16560.m39056().m128();
            String str = C16999.m39866(m39741(), new String[0]).mo31566().m31565() + "/*";
            if (m27502.m32949()) {
                m128.m27513(str, false, m27502, new Runnable() { // from class: l.֨ۧ᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        C16773.this.m39496(c16560, i);
                    }
                });
                return;
            } else {
                m128.m27515(str);
                return;
            }
        }
        C8055 c8055 = new C8055();
        List<PackageInfo> installedPackages = C4925.m14320().getInstalledPackages(0);
        HashMap hashMap = new HashMap(installedPackages.size());
        for (PackageInfo packageInfo : installedPackages) {
            hashMap.put(packageInfo.packageName, packageInfo);
        }
        if (Build.VERSION.SDK_INT == 33) {
            Iterator it = C16999.m39866(c16560.m39058(), new String[0]).mo23549(true).iterator();
            while (it.hasNext()) {
                c8055.m21436((AbstractC15440) it.next());
            }
        } else {
            Iterator<PackageInfo> it2 = installedPackages.iterator();
            while (it2.hasNext()) {
                String str2 = it2.next().packageName;
                if (!str2.equals("android")) {
                    c8055.m21436(C16999.m39866(c16560.m39058(), str2));
                }
            }
            z = true;
        }
        List m21438 = c8055.m21438();
        if (m21438.isEmpty()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f12003b);
            return;
        }
        ArrayList arrayList = new ArrayList(m21438.size());
        Iterator it3 = m21438.iterator();
        while (it3.hasNext()) {
            PackageInfo packageInfo2 = (PackageInfo) hashMap.get(((C12993) it3.next()).getName());
            if (packageInfo2 != null) {
                arrayList.add(packageInfo2);
            }
        }
        Collections.sort(arrayList, new C4636(1));
        C9719 c9719 = new C9719(c16560.m39056(), arrayList);
        c9719.m24712(i);
        c9719.m24713(new C21597(m21438, c16560));
        if (z) {
            c9719.m24714(new ViewOnClickListenerC22302(1, c16560));
        }
        c9719.m24711();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39494(List list, C16560 c16560, ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Set set = (Set) C5378.stream(arrayList).map(new C7915(2)).collect(C22976.toSet());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C12993 c12993 = (C12993) it.next();
            if (set.contains(c12993.getName())) {
                linkedHashSet.add(c12993.m31565());
            }
        }
        if (linkedHashSet.isEmpty()) {
            return;
        }
        c16560.m39056().m128().m27514(linkedHashSet);
    }
}

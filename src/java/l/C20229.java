package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* compiled from: I1KV */
/* renamed from: l.᩶ܳۢ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20229 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4706 f65434;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f65435;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f65436;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22933 f65437;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10220 f65438;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Collection f65439;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C22108 f65440;

    public C20229(C4706 c4706, HashMap hashMap, C10220 c10220, boolean z, Collection collection) {
        this.f65434 = c4706;
        this.f65436 = hashMap;
        this.f65438 = c10220;
        this.f65435 = z;
        this.f65439 = collection;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C22933 c22933 = new C22933(this.f65434.f14941);
        c22933.m51049(R.string.MT_Protector_res_0x7f1207a7);
        c22933.mo49547();
        this.f65437 = c22933;
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C12366 c12366;
        C12366 c123662;
        boolean z;
        final String str;
        final String str2;
        final String str3;
        final String str4;
        String str5;
        String str6;
        C12366 c123663;
        String str7;
        ViewOnClickListenerC7528 viewOnClickListenerC7528 = this.f65434.f14939;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f65436;
        for (Map.Entry entry : hashMap2.entrySet()) {
            String str8 = (String) entry.getKey();
            c123663 = viewOnClickListenerC7528.f23168;
            InterfaceC13508 m30066 = c123663.m30066(str8);
            C11003.requireNonNull(m30066);
            try {
                C7980 mo31674 = m30066.mo31674();
                C11003.requireNonNull(mo31674);
                str8 = mo31674.getType();
                str7 = str8.substring(1, str8.length() - 1);
            } catch (Exception unused) {
                str7 = str8;
            }
            hashMap.put(str7, (String) entry.getValue());
        }
        c12366 = viewOnClickListenerC7528.f23168;
        c12366.m30032(hashMap2);
        c123662 = viewOnClickListenerC7528.f23168;
        C22933 c22933 = this.f65437;
        C11003.requireNonNull(c22933);
        C23595 c23595 = new C23595(c22933);
        final C2727 c2727 = new C2727(hashMap.size());
        final C2727 c27272 = new C2727(hashMap.size());
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            z = this.f65435;
            if (!hasNext) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            c2727.put(C9045.m23341(new StringBuilder("L"), (String) entry2.getKey(), l.b), "L" + ((String) entry2.getValue()) + l.b);
            c2727.put(C9045.m23341(new StringBuilder("L"), (String) entry2.getKey(), "<"), "L" + ((String) entry2.getValue()) + "<");
            c2727.put(C9045.m23341(new StringBuilder("L"), (String) entry2.getKey(), "\","), "L" + ((String) entry2.getValue()) + "\",");
            if (z) {
                c27272.put(((String) entry2.getKey()).replace('/', '.'), ((String) entry2.getValue()).replace('/', '.'));
            }
        }
        C10220 c10220 = this.f65438;
        if (c10220 != null) {
            Object obj = c10220.f30698;
            Object obj2 = c10220.f30697;
            StringBuilder sb = new StringBuilder("L");
            String str9 = (String) obj2;
            sb.append(str9);
            str = sb.toString();
            StringBuilder sb2 = new StringBuilder("L");
            String str10 = (String) obj;
            sb2.append(str10);
            String sb3 = sb2.toString();
            if (z) {
                str5 = str9.replace('/', '.');
                str6 = str10.replace('/', '.');
            } else {
                str5 = null;
                str6 = null;
            }
            str3 = str5;
            str4 = str6;
            str2 = sb3;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        final C22108 c22108 = new C22108();
        final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        c123662.m30033(concurrentLinkedQueue, "", true, (Predicate) null);
        c23595.mo6264(0);
        final C19277 c19277 = new C19277(concurrentLinkedQueue.size());
        c19277.m44459(c23595);
        final C11459 m28260 = C11459.m28260("L[^;:<\r\n()]+(;|<|\",)");
        Runnable runnable = new Runnable() { // from class: l.ܿܽۢ
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC13508 interfaceC13508;
                String str11;
                String str12;
                C22706 c22706 = new C22706();
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = concurrentLinkedQueue;
                    if (concurrentLinkedQueue2.isEmpty() || (interfaceC13508 = (InterfaceC13508) concurrentLinkedQueue2.poll()) == null) {
                        return;
                    }
                    c19277.m44460(1);
                    String mo31675 = interfaceC13508.mo31675();
                    C11003.requireNonNull(mo31675);
                    C12164 matcher = m28260.matcher((CharSequence) mo31675);
                    c22706.m50718();
                    int i = 0;
                    int i2 = 0;
                    int i3 = 0;
                    while (matcher.find()) {
                        String group = matcher.group();
                        if (TextUtils.indexOf(mo31675, "const-string", mo31675.lastIndexOf(10, matcher.start()) + 1, matcher.start()) == -1) {
                            String str13 = (String) c2727.getOrDefault(group, null);
                            if (str13 == null && (str12 = str) != null && group.startsWith(str12)) {
                                StringBuilder m15339 = C5368.m15339(str2);
                                m15339.append(group.substring(str12.length()));
                                str13 = m15339.toString();
                            }
                            if (str13 != null) {
                                c22706.append((CharSequence) mo31675.substring(i2, matcher.start()));
                                c22706.append((CharSequence) str13);
                                i2 = matcher.end();
                                i3++;
                            }
                        }
                    }
                    if (i2 != 0) {
                        c22706.append((CharSequence) mo31675.substring(i2));
                        mo31675 = c22706.toString();
                    }
                    c22706.m50718();
                    C12572 c12572 = new C12572(mo31675);
                    while (c12572.m30816()) {
                        String str14 = (String) c27272.getOrDefault(c12572.f37888, null);
                        if (str14 == null && (str11 = str3) != null && c12572.f37888.startsWith(str11)) {
                            StringBuilder m153392 = C5368.m15339(str4);
                            m153392.append(c12572.f37888.substring(str11.length()));
                            str14 = m153392.toString();
                        }
                        if (str14 != null) {
                            c22706.append((CharSequence) mo31675.substring(i, c12572.f37890));
                            try {
                                C14020.m33624(c22706, str14);
                            } catch (IOException unused2) {
                            }
                            i = c12572.f37886;
                            i3++;
                        }
                    }
                    if (i != 0) {
                        c22706.append((CharSequence) mo31675.substring(i));
                        mo31675 = c22706.toString();
                    }
                    if (i3 > 0) {
                        interfaceC13508.mo31670(mo31675);
                        c22108.m49685(i3);
                    }
                }
            }
        };
        c123662.m30024();
        c123662.m30042(false);
        C3058.m9358((int) (C17615.f53826 * 0.66f), runnable);
        c123662.m30042(true);
        c123662.m30061();
        this.f65440 = c22108;
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C4706 c4706 = this.f65434;
        ViewOnClickListenerC7528 viewOnClickListenerC7528 = c4706.f14939;
        viewOnClickListenerC7528.m20215();
        viewOnClickListenerC7528.m20214(this.f65439);
        c4706.f14941.m10218(R.string.MT_Protector_res_0x7f120491, viewOnClickListenerC7528.getString(R.string.MT_Protector_res_0x7f120289, Integer.valueOf(this.f65440.f71773), Integer.valueOf(this.f65440.f71772)), false);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C3764 c3764;
        ViewOnClickListenerC7528 viewOnClickListenerC7528 = this.f65434.f14939;
        viewOnClickListenerC7528.m20215();
        c3764 = viewOnClickListenerC7528.f23162;
        c3764.m11384((Throwable) exc);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        this.f65437.m51051();
        ((ActivityC17169) this.f65434.f14941).m40349();
    }
}

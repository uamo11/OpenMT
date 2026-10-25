package l;

import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: 316P */
/* renamed from: l.ᩴܶۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18838 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C1315 f59422 = new C1315(50);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C3048 f59423 = new C3048();

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b1, code lost:
    
        if (l.C3016.m9243(r7, "/data/") != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a9  */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final l.C4021 m43525(l.AbstractC15440 r25) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18838.m43525(l.ܶ᩵ܿ):l.ۘܶۡ");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final void m43524(AbstractC15440 abstractC15440) {
        C11233.m27805(abstractC15440, "file");
        String str = abstractC15440.mo23554() + ":" + abstractC15440.mo23117() + ":" + abstractC15440.mo23127();
        f59422.m4558(str);
        C8177.m21653(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m43521() {
        C1315 c1315 = f59422;
        Set entrySet = c1315.m4555().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if (((Map.Entry) obj).getValue() instanceof Integer) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c1315.m4558(((Map.Entry) it.next()).getKey());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43522(String str) {
        int i;
        C1315 c1315 = f59422;
        Object m4553 = c1315.m4553(str);
        if (m4553 instanceof Integer) {
            i = Integer.valueOf(((Number) m4553).intValue() + 1);
        } else {
            i = 1;
        }
        c1315.m4554(str, i);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m43523(ApplicationInfo applicationInfo) {
        String charSequence;
        CharSequence charSequence2 = applicationInfo.nonLocalizedLabel;
        if (charSequence2 != null) {
            return charSequence2.toString();
        }
        if (applicationInfo.labelRes != 0) {
            try {
                C18090 c18090 = new C18090(applicationInfo.sourceDir, new C16014(0));
                try {
                    C12534 c12534 = new C12534(0, new C23326(c18090.m42193(c18090.m42211("resources.arsc"), (C19277) null)));
                    int i = applicationInfo.labelRes;
                    if (((i >>> 24) & 255) == 1) {
                        charSequence = C4925.m14338().getString(i);
                    } else {
                        TypedValue typedValue = new TypedValue();
                        c12534.m30770(i, typedValue, true);
                        charSequence = typedValue.coerceToString().toString();
                    }
                    if (charSequence != null) {
                        c18090.close();
                        return charSequence;
                    }
                    C8058 c8058 = C8058.f24861;
                    c18090.close();
                } finally {
                }
            } catch (Exception unused) {
            }
        }
        String str = applicationInfo.name;
        if (str != null) {
            return str;
        }
        String str2 = applicationInfo.packageName;
        C11233.m27803(str2, "packageName");
        return str2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int m43519(ApplicationInfo applicationInfo) {
        if (Build.VERSION.SDK_INT >= 24) {
            return applicationInfo.minSdkVersion;
        }
        try {
            C18090 c18090 = new C18090(applicationInfo.sourceDir);
            try {
                int m49977 = C22263.m49977(C15206.m35978(c18090.m42193(c18090.m42211("AndroidManifest.xml"), (C19277) null)));
                c18090.close();
                return m49977;
            } finally {
            }
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m43520(final AbstractC15440 abstractC15440) {
        long j;
        try {
            C23411 m36513 = abstractC15440.m36513("r");
            try {
                long length = m36513.length();
                j = length - 22;
                long max = Math.max(0L, length - 65557);
                while (true) {
                    if (j < max) {
                        j = -1;
                        break;
                    }
                    m36513.seek(j);
                    if (m36513.readInt() == 101010256) {
                        break;
                    }
                    j--;
                }
                m36513.close();
            } finally {
            }
        } catch (IOException unused) {
            j = -1;
        }
        if (j == -1) {
            return null;
        }
        try {
            return (AbstractC15440) C1802.f6209.submit(new Callable() { // from class: l.ۖܶۡ
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
                java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
                 */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    AbstractC15440 m36535 = C16293.f50110.m36535(".apk");
                    AbstractC15440 abstractC154402 = AbstractC15440.this;
                    try {
                        if (abstractC154402.mo23127() > 1048576) {
                            C18090 c18090 = new C18090(abstractC154402);
                            try {
                                C8918 c8918 = new C8918(m36535);
                                try {
                                    c8918.m23025();
                                    C3545 m42211 = c18090.m42211("resources.arsc");
                                    c18090.m42211("AndroidManifest.xml");
                                    HashSet hashSet = new HashSet();
                                    Iterator it = new C23326(c18090.m42193(m42211, (C19277) null)).mo21936().iterator();
                                    while (it.hasNext()) {
                                        for (C23535 c23535 : ((C17891) it.next()).mo12850()) {
                                            String typeName = c23535.getTypeName();
                                            if (typeName != null) {
                                                switch (typeName.hashCode()) {
                                                    case -891985903:
                                                        if (typeName.equals("string")) {
                                                            break;
                                                        } else {
                                                            break;
                                                        }
                                                    case -475309713:
                                                        if (typeName.equals("plurals")) {
                                                            break;
                                                        } else {
                                                            break;
                                                        }
                                                    case 3355:
                                                        if (typeName.equals("id")) {
                                                            break;
                                                        } else {
                                                            break;
                                                        }
                                                    case 3004913:
                                                        if (typeName.equals("attr")) {
                                                            break;
                                                        } else {
                                                            break;
                                                        }
                                                    case 3029738:
                                                        if (typeName.equals("bool")) {
                                                            break;
                                                        } else {
                                                            break;
                                                        }
                                                    case 109780401:
                                                        if (typeName.equals("style")) {
                                                            break;
                                                        } else {
                                                            break;
                                                        }
                                                    case 1958052158:
                                                        if (typeName.equals("integer")) {
                                                            break;
                                                        } else {
                                                            break;
                                                        }
                                                }
                                            }
                                            Iterator it2 = c23535.mo2872().iterator();
                                            while (it2.hasNext()) {
                                                Iterator it3 = ((C6393) it2.next()).mo18746().iterator();
                                                while (it3.hasNext()) {
                                                    for (C6602 c6602 : ((C12038) it3.next()).values()) {
                                                        if (c6602.mo5009()) {
                                                            try {
                                                                String value = c6602.mo5008().getValue();
                                                                C11233.m27803(value, "getValue(...)");
                                                                hashSet.add(value);
                                                            } catch (Exception unused2) {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    hashSet.add("AndroidManifest.xml");
                                    hashSet.add("resources.arsc");
                                    Collection m42210 = c18090.m42210();
                                    C11233.m27803(m42210, "getEntries(...)");
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj : m42210) {
                                        if (hashSet.contains(((C3545) obj).getName())) {
                                            arrayList.add(obj);
                                        }
                                    }
                                    Iterator it4 = arrayList.iterator();
                                    while (it4.hasNext()) {
                                        c8918.m23014((C3545) it4.next(), c18090);
                                    }
                                    C8058 c8058 = C8058.f24861;
                                    c8918.close();
                                    c18090.close();
                                    return m36535;
                                } finally {
                                }
                            } finally {
                            }
                        } else {
                            abstractC154402.m36500(m36535, (C17558) null, (InterfaceC5627) null);
                            return m36535;
                        }
                    } catch (Throwable unused3) {
                        return null;
                    }
                }
            }).get();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            C11233.m27799(cause);
            throw cause;
        }
    }
}

package l;

import com.umeng.analytics.pro.am;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: 8AVO */
/* renamed from: l.֫֫ܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C1517 implements InterfaceC19157 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f5376;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC18451[] f5377;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10690 f5378;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public transient long[] f5379;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Class f5380;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC18451[] f5381;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ConcurrentMapC10942 f5382;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public transient int[] f5383;

    /* JADX WARN: Code restructure failed: missing block: B:216:0x06dd, code lost:
    
        if (r2.length() > 0) goto L309;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0573 A[EDGE_INSN: B:122:0x0573->B:123:0x0573 BREAK  A[LOOP:3: B:66:0x03e4->B:104:0x0568], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x05b5 A[EDGE_INSN: B:142:0x05b5->B:143:0x05b5 BREAK  A[LOOP:4: B:124:0x0582->B:135:0x05b2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x07c7 A[LOOP:12: B:246:0x07c5->B:247:0x07c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1517(l.C23389 r45, java.lang.Class r46, java.lang.reflect.Type r47) {
        /*
            Method dump skipped, instructions count: 2007
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1517.<init>(l.᩻֫ܺ, java.lang.Class, java.lang.reflect.Type):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m5203(C11556 c11556, Type type) {
        Object newInstance;
        boolean z = type instanceof Class;
        Class cls = this.f5380;
        if (z && cls.isInterface()) {
            return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{(Class) type}, new C21434(0, (c11556.f34488.f22495 & EnumC13671.OrderedField.f40811) != 0));
        }
        C10690 c10690 = this.f5378;
        Constructor constructor = c10690.f32181;
        int i = c10690.f32183;
        Method method = c10690.f32182;
        if ((constructor == null && method == null) || (method != null && i > 0)) {
            return null;
        }
        try {
            if (i != 0) {
                newInstance = constructor.newInstance(c11556.f34496.f42885);
            } else if (constructor != null) {
                newInstance = constructor.newInstance(null);
            } else {
                newInstance = method.invoke(null, null);
            }
            if (c11556 != null && (c11556.f34488.f22495 & EnumC13671.InitStringFieldAsEmpty.f40811) != 0) {
                for (C15896 c15896 : c10690.f32179) {
                    if (c15896.f49114 == String.class) {
                        Method method2 = c15896.f49127;
                        if (method2 != null) {
                            method2.invoke(newInstance, "");
                        } else {
                            c15896.f49124.set(newInstance, "");
                        }
                    }
                }
            }
            return newInstance;
        } catch (Exception e) {
            throw new C15082("create instance error, class ".concat(cls.getName()), (Throwable) e);
        }
    }

    @Override // l.InterfaceC19157
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object mo5204(C11556 c11556, Type type, Object obj) {
        return m5199(c11556, type, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01aa A[Catch: IllegalAccessException -> 0x0359, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:9:0x0025, B:11:0x0029, B:13:0x0034, B:14:0x0040, B:16:0x0044, B:19:0x0053, B:23:0x004f, B:26:0x005f, B:29:0x006e, B:30:0x006a, B:31:0x0076, B:32:0x0038, B:35:0x0081, B:38:0x0089, B:40:0x00b0, B:41:0x00b7, B:43:0x00bb, B:46:0x00ca, B:47:0x00c6, B:50:0x00d5, B:53:0x00e4, B:54:0x00e0, B:55:0x00eb, B:56:0x00b4, B:59:0x0092, B:61:0x009c, B:64:0x00ab, B:65:0x00a7, B:67:0x00f2, B:68:0x010a, B:71:0x010b, B:73:0x0111, B:75:0x011b, B:76:0x0127, B:78:0x012d, B:81:0x013c, B:83:0x0138, B:86:0x0148, B:89:0x0157, B:91:0x0153, B:92:0x015f, B:94:0x011f, B:95:0x0164, B:97:0x0168, B:100:0x0198, B:102:0x01aa, B:103:0x01b5, B:105:0x01bb, B:108:0x01ca, B:110:0x01c6, B:113:0x01d6, B:116:0x01e5, B:118:0x01e1, B:119:0x01ed, B:121:0x01ae, B:122:0x017b, B:125:0x0188, B:132:0x01a4, B:133:0x01f2, B:135:0x01f8, B:138:0x0202, B:141:0x023b, B:143:0x0244, B:146:0x0253, B:148:0x024f, B:151:0x025f, B:154:0x026e, B:156:0x026a, B:157:0x0276, B:159:0x020c, B:164:0x0219, B:166:0x0227, B:167:0x0233, B:169:0x027b, B:170:0x0295, B:174:0x029a, B:177:0x02a4, B:179:0x02b6, B:182:0x02c5, B:184:0x02c1, B:187:0x02d1, B:190:0x02e0, B:192:0x02dc, B:193:0x02e8, B:195:0x02ec, B:198:0x02f6, B:201:0x0305, B:202:0x0329, B:205:0x0335, B:210:0x033c, B:211:0x0341, B:214:0x0346, B:219:0x034d, B:220:0x0352, B:222:0x0301, B:225:0x0310, B:228:0x031f, B:229:0x031b, B:230:0x0326), top: B:8:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01bb A[Catch: IllegalAccessException -> 0x0359, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:9:0x0025, B:11:0x0029, B:13:0x0034, B:14:0x0040, B:16:0x0044, B:19:0x0053, B:23:0x004f, B:26:0x005f, B:29:0x006e, B:30:0x006a, B:31:0x0076, B:32:0x0038, B:35:0x0081, B:38:0x0089, B:40:0x00b0, B:41:0x00b7, B:43:0x00bb, B:46:0x00ca, B:47:0x00c6, B:50:0x00d5, B:53:0x00e4, B:54:0x00e0, B:55:0x00eb, B:56:0x00b4, B:59:0x0092, B:61:0x009c, B:64:0x00ab, B:65:0x00a7, B:67:0x00f2, B:68:0x010a, B:71:0x010b, B:73:0x0111, B:75:0x011b, B:76:0x0127, B:78:0x012d, B:81:0x013c, B:83:0x0138, B:86:0x0148, B:89:0x0157, B:91:0x0153, B:92:0x015f, B:94:0x011f, B:95:0x0164, B:97:0x0168, B:100:0x0198, B:102:0x01aa, B:103:0x01b5, B:105:0x01bb, B:108:0x01ca, B:110:0x01c6, B:113:0x01d6, B:116:0x01e5, B:118:0x01e1, B:119:0x01ed, B:121:0x01ae, B:122:0x017b, B:125:0x0188, B:132:0x01a4, B:133:0x01f2, B:135:0x01f8, B:138:0x0202, B:141:0x023b, B:143:0x0244, B:146:0x0253, B:148:0x024f, B:151:0x025f, B:154:0x026e, B:156:0x026a, B:157:0x0276, B:159:0x020c, B:164:0x0219, B:166:0x0227, B:167:0x0233, B:169:0x027b, B:170:0x0295, B:174:0x029a, B:177:0x02a4, B:179:0x02b6, B:182:0x02c5, B:184:0x02c1, B:187:0x02d1, B:190:0x02e0, B:192:0x02dc, B:193:0x02e8, B:195:0x02ec, B:198:0x02f6, B:201:0x0305, B:202:0x0329, B:205:0x0335, B:210:0x033c, B:211:0x0341, B:214:0x0346, B:219:0x034d, B:220:0x0352, B:222:0x0301, B:225:0x0310, B:228:0x031f, B:229:0x031b, B:230:0x0326), top: B:8:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ae A[Catch: IllegalAccessException -> 0x0359, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:9:0x0025, B:11:0x0029, B:13:0x0034, B:14:0x0040, B:16:0x0044, B:19:0x0053, B:23:0x004f, B:26:0x005f, B:29:0x006e, B:30:0x006a, B:31:0x0076, B:32:0x0038, B:35:0x0081, B:38:0x0089, B:40:0x00b0, B:41:0x00b7, B:43:0x00bb, B:46:0x00ca, B:47:0x00c6, B:50:0x00d5, B:53:0x00e4, B:54:0x00e0, B:55:0x00eb, B:56:0x00b4, B:59:0x0092, B:61:0x009c, B:64:0x00ab, B:65:0x00a7, B:67:0x00f2, B:68:0x010a, B:71:0x010b, B:73:0x0111, B:75:0x011b, B:76:0x0127, B:78:0x012d, B:81:0x013c, B:83:0x0138, B:86:0x0148, B:89:0x0157, B:91:0x0153, B:92:0x015f, B:94:0x011f, B:95:0x0164, B:97:0x0168, B:100:0x0198, B:102:0x01aa, B:103:0x01b5, B:105:0x01bb, B:108:0x01ca, B:110:0x01c6, B:113:0x01d6, B:116:0x01e5, B:118:0x01e1, B:119:0x01ed, B:121:0x01ae, B:122:0x017b, B:125:0x0188, B:132:0x01a4, B:133:0x01f2, B:135:0x01f8, B:138:0x0202, B:141:0x023b, B:143:0x0244, B:146:0x0253, B:148:0x024f, B:151:0x025f, B:154:0x026e, B:156:0x026a, B:157:0x0276, B:159:0x020c, B:164:0x0219, B:166:0x0227, B:167:0x0233, B:169:0x027b, B:170:0x0295, B:174:0x029a, B:177:0x02a4, B:179:0x02b6, B:182:0x02c5, B:184:0x02c1, B:187:0x02d1, B:190:0x02e0, B:192:0x02dc, B:193:0x02e8, B:195:0x02ec, B:198:0x02f6, B:201:0x0305, B:202:0x0329, B:205:0x0335, B:210:0x033c, B:211:0x0341, B:214:0x0346, B:219:0x034d, B:220:0x0352, B:222:0x0301, B:225:0x0310, B:228:0x031f, B:229:0x031b, B:230:0x0326), top: B:8:0x0025 }] */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object m5201(l.C11556 r17, java.lang.reflect.Type r18, java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1517.m5201(l.ۨ۟ۡ, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private java.lang.Object m5199(l.C11556 r48, java.lang.reflect.Type r49, java.lang.Object r50) {
        /*
            Method dump skipped, instructions count: 2179
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1517.m5199(l.ۨ۟ۡ, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC18451 m5205(String str) {
        if (str == null) {
            return null;
        }
        boolean z = this.f5378.f32185;
        int i = 0;
        AbstractC18451[] abstractC18451Arr = this.f5377;
        if (z) {
            while (i < abstractC18451Arr.length) {
                AbstractC18451 abstractC18451 = abstractC18451Arr[i];
                if (abstractC18451.f57230.f49123.equalsIgnoreCase(str)) {
                    return abstractC18451;
                }
                i++;
            }
            return null;
        }
        int length = abstractC18451Arr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int compareTo = abstractC18451Arr[i3].f57230.f49123.compareTo(str);
            if (compareTo < 0) {
                i2 = i3 + 1;
            } else {
                if (compareTo <= 0) {
                    return abstractC18451Arr[i3];
                }
                length = i3 - 1;
            }
        }
        HashMap hashMap = this.f5376;
        if (hashMap != null) {
            return (AbstractC18451) hashMap.get(str);
        }
        if (this.f5379 == null) {
            long[] jArr = new long[abstractC18451Arr.length];
            for (int i4 = 0; i4 < abstractC18451Arr.length; i4++) {
                jArr[i4] = C19426.m44747(abstractC18451Arr[i4].f57230.f49123);
            }
            Arrays.sort(jArr);
            this.f5379 = jArr;
        }
        int binarySearch = Arrays.binarySearch(this.f5379, C19426.m44747(str));
        if (binarySearch >= 0) {
            if (this.f5383 == null) {
                int[] iArr = new int[this.f5379.length];
                Arrays.fill(iArr, -1);
                while (i < abstractC18451Arr.length) {
                    int binarySearch2 = Arrays.binarySearch(this.f5379, C19426.m44747(abstractC18451Arr[i].f57230.f49123));
                    if (binarySearch2 >= 0) {
                        iArr[binarySearch2] = i;
                    }
                    i++;
                }
                this.f5383 = iArr;
            }
            int i5 = this.f5383[binarySearch];
            if (i5 != -1) {
                return abstractC18451Arr[i5];
            }
        }
        return m5200(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m5198(C11556 c11556, String str, Object obj, Type type, HashMap hashMap) {
        Type type2;
        C7322 c7322 = c11556.f34488;
        AbstractC18451 m5205 = m5205(str);
        if (m5205 == null) {
            m5205 = m5200(str);
        }
        int i = EnumC13671.SupportNonPublicField.f40811;
        Class cls = this.f5380;
        if (m5205 == null && ((c7322.f22495 & i) != 0 || (i & this.f5378.f32175) != 0)) {
            if (this.f5382 == null) {
                ConcurrentMapC10942 concurrentMapC10942 = new ConcurrentMapC10942(1, 0.75f, 1);
                for (Class cls2 = cls; cls2 != null && cls2 != Object.class; cls2 = cls2.getSuperclass()) {
                    for (Field field : cls2.getDeclaredFields()) {
                        String name = field.getName();
                        if (m5205(name) == null) {
                            int modifiers = field.getModifiers();
                            if ((modifiers & 16) == 0 && (modifiers & 8) == 0) {
                                concurrentMapC10942.put(name, field);
                            }
                        }
                    }
                }
                this.f5382 = concurrentMapC10942;
            }
            Object obj2 = this.f5382.get(str);
            if (obj2 != null) {
                if (obj2 instanceof AbstractC18451) {
                    m5205 = (AbstractC18451) obj2;
                } else {
                    Field field2 = (Field) obj2;
                    field2.setAccessible(true);
                    m5205 = new C10145(cls, new C15896(str, field2.getDeclaringClass(), field2.getType(), field2.getGenericType(), field2, 0, 0));
                    this.f5382.put(str, m5205);
                }
            }
        }
        if (m5205 != null) {
            c7322.m19635();
            m5205.mo17833(c11556, obj, type, hashMap);
            return true;
        }
        if ((c7322.f22495 & EnumC13671.IgnoreNotMatch.f40811) == 0) {
            throw new C15082("setter not found, class " + cls.getName() + ", property " + str);
        }
        c7322.m19635();
        ArrayList arrayList = c11556.f34489;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            type2 = null;
            while (it.hasNext()) {
                type2 = ((InterfaceC3634) it.next()).m11127();
            }
        } else {
            type2 = null;
        }
        if (type2 != null) {
            c11556.m28435((String) null, type2);
        } else {
            c11556.m28434((Object) null);
        }
        if (obj instanceof InterfaceC15627) {
            ((InterfaceC15627) obj).m36828();
            return false;
        }
        ArrayList arrayList2 = c11556.f34491;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((InterfaceC2223) it2.next()).m7402();
            }
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private AbstractC18451 m5200(String str) {
        boolean z;
        long m44747 = C19426.m44747(str);
        long[] jArr = this.f5379;
        AbstractC18451[] abstractC18451Arr = this.f5377;
        if (jArr == null) {
            long[] jArr2 = new long[abstractC18451Arr.length];
            for (int i = 0; i < abstractC18451Arr.length; i++) {
                jArr2[i] = C19426.m44747(abstractC18451Arr[i].f57230.f49123);
            }
            Arrays.sort(jArr2);
            this.f5379 = jArr2;
        }
        int binarySearch = Arrays.binarySearch(this.f5379, m44747);
        if (binarySearch < 0) {
            z = str.startsWith(am.ae);
            if (z) {
                binarySearch = Arrays.binarySearch(this.f5379, C19426.m44747(str.substring(2)));
            }
        } else {
            z = false;
        }
        if (binarySearch >= 0) {
            if (this.f5383 == null) {
                int[] iArr = new int[this.f5379.length];
                Arrays.fill(iArr, -1);
                for (int i2 = 0; i2 < abstractC18451Arr.length; i2++) {
                    int binarySearch2 = Arrays.binarySearch(this.f5379, C19426.m44747(abstractC18451Arr[i2].f57230.f49123));
                    if (binarySearch2 >= 0) {
                        iArr[binarySearch2] = i2;
                    }
                }
                this.f5383 = iArr;
            }
            int i3 = this.f5383[binarySearch];
            if (i3 != -1) {
                AbstractC18451 abstractC18451 = abstractC18451Arr[i3];
                Class cls = abstractC18451.f57230.f49114;
                if (!z || cls == Boolean.TYPE || cls == Boolean.class) {
                    return abstractC18451;
                }
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x01fc, code lost:
    
        r4 = java.lang.Double.parseDouble(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0281  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5202(java.util.Map r18, l.C23389 r19) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1517.m5202(java.util.Map, l.᩻֫ܺ):java.lang.Object");
    }
}

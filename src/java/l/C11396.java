package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: DAVS */
/* renamed from: l.ۨ֫ܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11396 implements InterfaceC16602 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f34092;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12806[] f34093;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12806[] f34094;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f34095;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f34096;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final char[] f34091 = {'t', 'r', 'u', 'e'};

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final char[] f34090 = {'f', 'a', 'l', 's', 'e'};

    public C11396(Class cls) {
        EnumC4500 enumC4500;
        String str;
        String str2;
        int modifiers = cls.getModifiers();
        this.f34092 = 0;
        InterfaceC12261 interfaceC12261 = (InterfaceC12261) cls.getAnnotation(InterfaceC12261.class);
        if (interfaceC12261 != null) {
            this.f34092 = EnumC20837.m47652(interfaceC12261.serialzeFeatures());
            str = interfaceC12261.typeName();
            if (str.length() == 0) {
                str = null;
                str2 = null;
            } else {
                str2 = null;
                for (Class superclass = cls.getSuperclass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                    InterfaceC12261 interfaceC122612 = (InterfaceC12261) superclass.getAnnotation(InterfaceC12261.class);
                    if (interfaceC122612 == null) {
                        break;
                    }
                    str2 = interfaceC122612.typeKey();
                    if (str2.length() != 0) {
                        break;
                    }
                }
                for (Class<?> cls2 : cls.getInterfaces()) {
                    InterfaceC12261 interfaceC122613 = (InterfaceC12261) cls2.getAnnotation(InterfaceC12261.class);
                    if (interfaceC122613 != null) {
                        str2 = interfaceC122613.typeKey();
                        if (str2.length() != 0) {
                            break;
                        }
                    }
                }
                if (str2 != null && str2.length() == 0) {
                    str2 = null;
                }
            }
            enumC4500 = interfaceC12261.naming();
            if (enumC4500 == EnumC4500.CamelCase) {
                enumC4500 = null;
            }
        } else {
            enumC4500 = null;
            str = null;
            str2 = null;
        }
        this.f34095 = str;
        this.f34096 = str2;
        ArrayList m44739 = C19426.m44739(cls, modifiers, interfaceC12261, false, enumC4500);
        ArrayList arrayList = new ArrayList();
        Iterator it = m44739.iterator();
        while (it.hasNext()) {
            arrayList.add(new C12806((C15896) it.next()));
        }
        C12806[] c12806Arr = (C12806[]) arrayList.toArray(new C12806[arrayList.size()]);
        this.f34093 = c12806Arr;
        String[] orders = interfaceC12261 != null ? interfaceC12261.orders() : null;
        if (orders != null && orders.length != 0) {
            ArrayList m447392 = C19426.m44739(cls, modifiers, interfaceC12261, true, enumC4500);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = m447392.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new C12806((C15896) it2.next()));
            }
            this.f34094 = (C12806[]) arrayList2.toArray(new C12806[arrayList2.size()]);
            return;
        }
        C12806[] c12806Arr2 = new C12806[c12806Arr.length];
        System.arraycopy(c12806Arr, 0, c12806Arr2, 0, c12806Arr.length);
        Arrays.sort(c12806Arr2);
        if (Arrays.equals(c12806Arr2, c12806Arr)) {
            this.f34094 = c12806Arr;
        } else {
            this.f34094 = c12806Arr2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c7, code lost:
    
        if (r9.f44379 != null) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x05dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02a0 A[Catch: all -> 0x0178, Exception -> 0x0180, LOOP:5: B:171:0x029a->B:173:0x02a0, LOOP_END, TRY_LEAVE, TryCatch #13 {Exception -> 0x0180, all -> 0x0178, blocks: (B:83:0x016a, B:111:0x0171, B:115:0x018a, B:116:0x018e, B:118:0x0194, B:128:0x01be, B:134:0x01fd, B:137:0x0204, B:139:0x020b, B:140:0x0211, B:141:0x0215, B:143:0x021b, B:152:0x023e, B:155:0x0245, B:157:0x024c, B:158:0x0252, B:159:0x0258, B:161:0x025e, B:168:0x0279, B:170:0x0294, B:171:0x029a, B:173:0x02a0, B:371:0x0280, B:373:0x0287, B:381:0x01c9, B:383:0x01d7, B:384:0x01e7), top: B:82:0x016a }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03d8 A[Catch: all -> 0x0383, Exception -> 0x038a, TryCatch #15 {Exception -> 0x038a, all -> 0x0383, blocks: (B:180:0x02ca, B:182:0x02da, B:184:0x02e5, B:186:0x02e9, B:189:0x02ee, B:191:0x02f1, B:197:0x039d, B:199:0x03a1, B:203:0x03a9, B:205:0x03ad, B:208:0x03c1, B:210:0x03c5, B:212:0x03b1, B:214:0x03b5, B:218:0x03d8, B:220:0x03e1, B:221:0x03e4, B:223:0x03f7, B:226:0x0401, B:311:0x02f5, B:313:0x02fb, B:315:0x0306, B:317:0x030a, B:320:0x030f, B:322:0x0312, B:325:0x031a, B:327:0x0322, B:329:0x032d, B:331:0x0331, B:334:0x0338, B:336:0x033b, B:338:0x0340, B:339:0x0345, B:341:0x034d, B:343:0x0358, B:345:0x035c, B:348:0x0363, B:350:0x0366, B:352:0x036b, B:354:0x0370, B:356:0x0374), top: B:179:0x02ca }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x058f A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:90:0x052d, B:279:0x04ae, B:281:0x04b3, B:283:0x04bc, B:286:0x04c0, B:287:0x04c5, B:288:0x04cb, B:290:0x04d1, B:291:0x04d5, B:292:0x04db, B:295:0x04e5, B:297:0x04ee, B:301:0x0504, B:302:0x0508, B:304:0x050d, B:305:0x0519, B:306:0x051d, B:307:0x0523, B:401:0x0562, B:405:0x0573, B:406:0x0577, B:408:0x057d, B:411:0x058a, B:413:0x058f, B:415:0x0598, B:416:0x059e, B:418:0x05a7, B:419:0x05aa), top: B:89:0x052d }] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x05a7 A[Catch: all -> 0x05b7, Exception -> 0x05bb, TryCatch #11 {Exception -> 0x05bb, all -> 0x05b7, blocks: (B:90:0x052d, B:279:0x04ae, B:281:0x04b3, B:283:0x04bc, B:286:0x04c0, B:287:0x04c5, B:288:0x04cb, B:290:0x04d1, B:291:0x04d5, B:292:0x04db, B:295:0x04e5, B:297:0x04ee, B:301:0x0504, B:302:0x0508, B:304:0x050d, B:305:0x0519, B:306:0x051d, B:307:0x0523, B:401:0x0562, B:405:0x0573, B:406:0x0577, B:408:0x057d, B:411:0x058a, B:413:0x058f, B:415:0x0598, B:416:0x059e, B:418:0x05a7, B:419:0x05aa), top: B:89:0x052d }] */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f4 A[Catch: all -> 0x05c7, Exception -> 0x05cf, TryCatch #16 {Exception -> 0x05cf, all -> 0x05c7, blocks: (B:29:0x0080, B:31:0x0089, B:32:0x008c, B:34:0x0097, B:36:0x00a0, B:37:0x00a6, B:40:0x00b3, B:43:0x00ba, B:45:0x00c1, B:47:0x00c5, B:50:0x00f0, B:52:0x00f4, B:53:0x00f8, B:55:0x00fe, B:59:0x010e, B:61:0x0117, B:64:0x0121, B:67:0x012b, B:70:0x0135, B:435:0x00c9, B:439:0x00da, B:441:0x00e1, B:442:0x00e9, B:443:0x00d3), top: B:28:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0117 A[Catch: all -> 0x05c7, Exception -> 0x05cf, TryCatch #16 {Exception -> 0x05cf, all -> 0x05c7, blocks: (B:29:0x0080, B:31:0x0089, B:32:0x008c, B:34:0x0097, B:36:0x00a0, B:37:0x00a6, B:40:0x00b3, B:43:0x00ba, B:45:0x00c1, B:47:0x00c5, B:50:0x00f0, B:52:0x00f4, B:53:0x00f8, B:55:0x00fe, B:59:0x010e, B:61:0x0117, B:64:0x0121, B:67:0x012b, B:70:0x0135, B:435:0x00c9, B:439:0x00da, B:441:0x00e1, B:442:0x00e9, B:443:0x00d3), top: B:28:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // l.InterfaceC16602
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3046(l.C5751 r40, java.lang.Object r41, java.lang.Object r42, java.lang.reflect.Type r43) {
        /*
            Method dump skipped, instructions count: 1530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11396.mo3046(l.ۛ֫ܺ, java.lang.Object, java.lang.Object, java.lang.reflect.Type):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m28160(Object obj) {
        C12806[] c12806Arr = this.f34094;
        LinkedHashMap linkedHashMap = new LinkedHashMap(c12806Arr.length);
        for (C12806 c12806 : c12806Arr) {
            linkedHashMap.put(c12806.f38443.f49123, c12806.m31114(obj));
        }
        return linkedHashMap;
    }
}

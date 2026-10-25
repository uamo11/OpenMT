package l;

import bin.mt.plus.R;
import java.io.File;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedHashMap;

/* compiled from: 27Y0 */
/* renamed from: l.ܶ᩷ۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C15472 implements InterfaceC7961, InterfaceC19977, InterfaceC7550, InterfaceC21013, InterfaceC0300 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36562(Class cls, Hashtable hashtable, String str, Class cls2, String str2) {
        hashtable.put(str, cls.getName());
        hashtable.put(str2, cls2.getName());
    }

    @Override // l.InterfaceC0300
    public void accept(Object obj) {
        C15843.m37499((File) obj);
    }

    @Override // l.InterfaceC19977
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo36563() {
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m36561(int i, int i2, String str) {
        return str.substring(i2, str.length() - i);
    }

    @Override // l.InterfaceC7961
    public void invoke(Object obj) {
        ((InterfaceC1131) obj).getClass();
    }

    @Override // l.InterfaceC7550
    /* renamed from: ֫ */
    public CharSequence mo7073(C2095 c2095) {
        C19246 c19246 = (C19246) c2095;
        int i = c19246.m11313().getInt(c19246.m6911(), 0);
        boolean[] zArr = {(i & 1) != 0, (i & 2) != 0};
        String[] split = c19246.m6886().getString(R.string.MT_Protector_res_0x7f1203a9).split("\\|");
        if (split.length != 4) {
            throw new IllegalArgumentException(Arrays.toString(split));
        }
        StringBuilder sb = new StringBuilder();
        if (zArr[0]) {
            sb.append(split[1]);
        } else {
            sb.append(split[0]);
        }
        sb.append(", ");
        if (zArr[1]) {
            sb.append(split[3]);
        } else {
            sb.append(split[2]);
        }
        return sb.toString();
    }

    @Override // l.InterfaceC21013
    /* renamed from: ۧ */
    public Object mo12796() {
        return new LinkedHashMap();
    }
}

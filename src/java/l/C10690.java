package l;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: OAUY */
/* renamed from: l.ۧ֫ܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10690 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Constructor f32174;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f32175;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String f32176;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f32177;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String[] f32178;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C15896[] f32179;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f32180;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Constructor f32181;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Method f32182;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f32183;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15896[] f32184;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f32185 = false;

    public C10690(Class cls, Constructor constructor, Constructor constructor2, Method method, C15896[] c15896Arr, C15896[] c15896Arr2, InterfaceC12261 interfaceC12261, String[] strArr) {
        int i;
        boolean z;
        int i2 = 0;
        this.f32181 = constructor;
        this.f32174 = constructor2;
        this.f32182 = method;
        this.f32179 = c15896Arr;
        if (strArr != null && strArr.length == c15896Arr.length) {
            this.f32178 = null;
        } else {
            this.f32178 = strArr;
        }
        if (interfaceC12261 != null) {
            String typeName = interfaceC12261.typeName();
            this.f32180 = typeName.length() <= 0 ? cls.getName() : typeName;
            String typeKey = interfaceC12261.typeKey();
            this.f32176 = typeKey.length() > 0 ? typeKey : null;
            i = 0;
            for (EnumC13671 enumC13671 : interfaceC12261.parseFeatures()) {
                i |= enumC13671.f40811;
            }
        } else {
            this.f32180 = cls.getName();
            this.f32176 = null;
            i = 0;
        }
        String str = this.f32176;
        if (str != null) {
            C19426.m44747(str);
        }
        this.f32175 = i;
        if (interfaceC12261 != null) {
            EnumC13671[] parseFeatures = interfaceC12261.parseFeatures();
            z = false;
            for (EnumC13671 enumC136712 : parseFeatures) {
                if (enumC136712 == EnumC13671.SupportArrayToBean) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        this.f32177 = z;
        this.f32184 = Arrays.equals(c15896Arr, c15896Arr2) ? c15896Arr : c15896Arr2;
        if (constructor != null) {
            i2 = constructor.getParameterTypes().length;
        } else if (method != null) {
            i2 = method.getParameterTypes().length;
        }
        this.f32183 = i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26815(ArrayList arrayList, C15896 c15896) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C15896 c158962 = (C15896) arrayList.get(i);
            if (c158962.f49123.equals(c15896.f49123) && (!c158962.f49116 || c15896.f49116)) {
                return;
            }
        }
        arrayList.add(c15896);
    }
}

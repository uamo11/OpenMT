package l;

import com.alipay.sdk.m.y.q;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Enumeration;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: TAVX */
/* renamed from: l.۟֫ܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7162 implements InterfaceC16602, InterfaceC19157 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C7162 f21961 = new C7162();

    @Override // l.InterfaceC16602
    /* renamed from: ֫ */
    public final void mo3046(C5751 c5751, Object obj, Object obj2, Type type) {
        C6725 c6725 = c5751.f17696;
        if (obj == null) {
            if (type == Character.TYPE || type == Character.class) {
                c5751.m16189("");
                return;
            } else if ((c6725.f20878 & EnumC20837.WriteNullListAsEmpty.f67472) != 0 && Enumeration.class.isAssignableFrom(C19426.m44730(type))) {
                c6725.write("[]");
                return;
            } else {
                c6725.m18296();
                return;
            }
        }
        if (obj instanceof Pattern) {
            c5751.m16189(((Pattern) obj).pattern());
            return;
        }
        if (obj instanceof TimeZone) {
            c5751.m16189(((TimeZone) obj).getID());
            return;
        }
        if (obj instanceof Currency) {
            c5751.m16189(((Currency) obj).getCurrencyCode());
            return;
        }
        if (obj instanceof Class) {
            c5751.m16189(((Class) obj).getName());
            return;
        }
        if (obj instanceof Character) {
            Character ch = (Character) obj;
            if (ch.charValue() == 0) {
                c5751.m16189(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
                return;
            } else {
                c5751.m16189(ch.toString());
                return;
            }
        }
        int i = 0;
        if (obj instanceof SimpleDateFormat) {
            String pattern = ((SimpleDateFormat) obj).toPattern();
            if ((c6725.f20878 & EnumC20837.WriteClassName.f67472) != 0 && obj.getClass() != type) {
                c6725.write(123);
                c6725.m18299("@type", false);
                c5751.m16189(obj.getClass().getName());
                c6725.write(44);
                c6725.m18299("val", false);
                c6725.m18297(pattern);
                c6725.write(q.h);
                return;
            }
            c6725.m18297(pattern);
            return;
        }
        if (obj instanceof InterfaceC22139) {
            ((InterfaceC22139) obj).mo14986(c6725);
            return;
        }
        if (obj instanceof InterfaceC8028) {
            c6725.write(((InterfaceC8028) obj).mo14987());
            return;
        }
        if (obj instanceof InterfaceC9985) {
            ((InterfaceC9985) obj).m25148();
            return;
        }
        if (obj instanceof Enumeration) {
            Type type2 = ((c6725.f20878 & EnumC20837.WriteClassName.f67472) == 0 || !(type instanceof ParameterizedType)) ? null : ((ParameterizedType) type).getActualTypeArguments()[0];
            Enumeration enumeration = (Enumeration) obj;
            C14485 c14485 = c5751.f17704;
            c5751.m16190(c14485, obj, obj2);
            try {
                c6725.write(91);
                while (enumeration.hasMoreElements()) {
                    Object nextElement = enumeration.nextElement();
                    int i2 = i + 1;
                    if (i != 0) {
                        c6725.write(44);
                    }
                    if (nextElement == null) {
                        c6725.m18296();
                    } else {
                        c5751.f17702.m52187(nextElement.getClass()).mo3046(c5751, nextElement, Integer.valueOf(i), type2);
                    }
                    i = i2;
                }
                c6725.write(93);
                return;
            } finally {
                c5751.f17704 = c14485;
            }
        }
        c5751.m16189(obj.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x014c, code lost:
    
        return new java.lang.StackTraceElement(r7, r8, r9, r14);
     */
    @Override // l.InterfaceC19157
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5204(l.C11556 r13, java.lang.reflect.Type r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7162.mo5204(l.ۨ۟ۡ, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }
}

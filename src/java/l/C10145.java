package l;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/* compiled from: JAVC */
/* renamed from: l.ۤ۟ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10145 extends AbstractC18451 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC19157 f30522;

    public C10145() {
        throw null;
    }

    @Override // l.AbstractC18451
    /* renamed from: ֫ */
    public final void mo17833(C11556 c11556, Object obj, Type type, Map map) {
        Object mo5204;
        Class cls;
        C23389 c23389 = c11556.f34495;
        InterfaceC19157 interfaceC19157 = this.f30522;
        C15896 c15896 = this.f57230;
        if (interfaceC19157 == null) {
            this.f30522 = c23389.m51837(c15896.f49114, c15896.f49121);
        }
        Type type2 = c15896.f49121;
        String str = c15896.f49123;
        boolean z = type instanceof ParameterizedType;
        if (z) {
            type2 = C15896.m37670(this.f57227, type, type2);
            this.f30522 = c23389.m51838(type2);
        }
        if ((type2 instanceof ParameterizedType) && z) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            ParameterizedType parameterizedType2 = (ParameterizedType) type;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Type rawType = parameterizedType2.getRawType();
            if ((rawType instanceof Class) && C19426.m44744(actualTypeArguments, ((Class) rawType).getTypeParameters(), parameterizedType2.getActualTypeArguments())) {
                type2 = new C18720(actualTypeArguments, parameterizedType.getOwnerType(), parameterizedType.getRawType());
            }
        }
        String str2 = c15896.f49118;
        if (str2 != null && (this.f30522 instanceof C19863)) {
            mo5204 = C19863.m45686(c11556, type2, str2);
        } else {
            mo5204 = this.f30522.mo5204(c11556, type2, str);
        }
        if (c11556.f34490 == 1) {
            C5911 m28449 = c11556.m28449();
            m28449.f18142 = this;
            m28449.f18143 = c11556.f34496;
            c11556.f34490 = 0;
            return;
        }
        if (obj == null) {
            map.put(str, mo5204);
            return;
        }
        if (mo5204 == null && ((cls = c15896.f49114) == Byte.TYPE || cls == Short.TYPE || cls == Float.TYPE || cls == Double.TYPE)) {
            return;
        }
        mo17832(obj, mo5204);
    }
}

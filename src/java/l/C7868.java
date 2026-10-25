package l;

import com.alipay.sdk.m.u0.b;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: XAPG */
/* renamed from: l.۠֫ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7868 extends AbstractC21980 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12102 f24399;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0106 f24400;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC21275 f24401;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f24402;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f24403;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f24404;

    @Override // l.AbstractC21980
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC21980 mo21142(String str, InterfaceC16233 interfaceC16233) {
        return this;
    }

    public C7868(Object obj, String str, String str2, C0106 c0106, EnumC21275 enumC21275) {
        Collection collection;
        C11233.m27805(obj, b.d);
        C11233.m27805(str, "tag");
        C11233.m27805(c0106, "logger");
        C11233.m27805(enumC21275, "verificationMode");
        this.f24403 = obj;
        this.f24404 = str;
        this.f24402 = str2;
        this.f24400 = c0106;
        this.f24401 = enumC21275;
        String m49461 = AbstractC21980.m49461(obj, str2);
        C11233.m27805(m49461, "message");
        C12102 c12102 = new C12102(m49461);
        StackTraceElement[] stackTrace = c12102.getStackTrace();
        C11233.m27803(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(C18307.m42645(length, "Requested element count ", " is less than zero.").toString());
        }
        if (length == 0) {
            collection = C8969.f27244;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                collection = C22874.m50971(stackTrace);
            } else if (length == 1) {
                collection = C1913.m6273(stackTrace[length2 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length);
                for (int i = length2 - length; i < length2; i++) {
                    arrayList.add(stackTrace[i]);
                }
                collection = arrayList;
            }
        }
        Object[] array = collection.toArray(new StackTraceElement[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        c12102.setStackTrace((StackTraceElement[]) array);
        this.f24399 = c12102;
    }

    @Override // l.AbstractC21980
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo21141() {
        int i = C0812.f2957[this.f24401.ordinal()];
        if (i == 1) {
            throw this.f24399;
        }
        if (i != 2) {
            if (i == 3) {
                return null;
            }
            throw new C8764();
        }
        String m49461 = AbstractC21980.m49461(this.f24403, this.f24402);
        this.f24400.getClass();
        C11233.m27805(this.f24404, "tag");
        C11233.m27805(m49461, "message");
        return null;
    }
}

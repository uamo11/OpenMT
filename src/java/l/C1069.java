package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/* compiled from: K3OA */
/* renamed from: l.֨ۧ֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1069 extends AbstractC3186 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f3918;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Stack f3919;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10242 f3920;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1069(C10242 c10242, EnumC12358 enumC12358, int i, int i2) {
        super(c10242, enumC12358, Integer.valueOf(i));
        this.f3920 = c10242;
        this.f3919 = new Stack();
        this.f3918 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1069(C10242 c10242, EnumC12358 enumC12358) {
        super(c10242, enumC12358, 0);
        this.f3920 = c10242;
        this.f3919 = new Stack();
        this.f3918 = 0;
    }

    @Override // l.AbstractC3186
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1069) && super.equals(obj) && this.f3918 == ((C1069) obj).f3918;
    }

    @Override // l.AbstractC3186
    public final int hashCode() {
        return (super.hashCode() * 31) + this.f3918;
    }

    @Override // l.AbstractC3186
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String mo3639() {
        C20826 c20826;
        C20826 c208262;
        C20826 c208263;
        EnumC12358 enumC12358 = this.f10052;
        int ordinal = enumC12358.ordinal();
        int i = this.f3918;
        Object obj = this.f10053;
        C10242 c10242 = this.f3920;
        switch (ordinal) {
            case 8:
                StringBuilder sb = new StringBuilder();
                String m25960 = c10242.m25960(((Integer) obj).intValue());
                c20826 = c10242.f30885;
                sb.append(C10242.m25947(m25960, c20826.f67424));
                sb.append(".");
                sb.append(c10242.m25964(i));
                return sb.toString();
            case 9:
            case 10:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c10242.m25957(enumC12358));
                String m259602 = c10242.m25960(((Integer) obj).intValue());
                c208262 = c10242.f30885;
                sb2.append(C10242.m25947(m259602, c208262.f67424));
                sb2.append(".");
                sb2.append(c10242.m25964(i));
                return sb2.toString();
            case 11:
                return c10242.getName(((Integer) obj).intValue()) + ":" + c10242.m25964(i);
            case 12:
                return C10242.m25948(c10242, ((Integer) obj).intValue()) + ":" + c10242.m25964(i);
            case 13:
            default:
                return "UnknownTag";
            case 14:
            case 15:
                int intValue = ((Integer) obj).intValue();
                try {
                    c208263 = c10242.f30885;
                    C13500 c13500 = (C13500) ((AbstractC9701) c208263.f67411.f22796.get(intValue));
                    return c10242.m25964(c13500.f40311) + ":" + c10242.m25964(i) + m3636(c13500, "{", l.d);
                } catch (IndexOutOfBoundsException unused) {
                    return C18307.m42645(intValue, "<Invalid bootstrap method index:", ">");
                } catch (NullPointerException unused2) {
                    return "<Missing BootstrapMethods attribute>";
                }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m3636(C13500 c13500, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int size = c13500.f40312.size();
        sb.append(str);
        if (size > 0) {
            int i = 0;
            while (i < size) {
                int intValue = ((Integer) c13500.f40312.get(i)).intValue();
                boolean z = i != size + (-1);
                String str3 = "";
                String str4 = z ? "^" : "";
                if (z) {
                    str3 = "⾀";
                }
                sb.append(m3635(intValue, str4, str3));
                i++;
            }
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m3635(int i, String str, String str2) {
        AbstractC19898 abstractC19898;
        ArrayList arrayList;
        String format;
        String concat;
        C10242 c10242 = this.f3920;
        if (c10242.m25968(i)) {
            arrayList = c10242.f30882;
            AbstractC3186 abstractC3186 = (AbstractC3186) arrayList.get(i);
            Stack stack = this.f3919;
            if (stack.search(this) == -1) {
                stack.push(this);
                String concat2 = "".concat(c10242.m25961(i)).concat(str);
                stack.pop();
                return concat2;
            }
            if (abstractC3186 instanceof C1069) {
                format = String.format("%-8s %d:#%d; ", abstractC3186.f10052.m29986(), abstractC3186.f10053, Integer.valueOf(((C1069) abstractC3186).f3918));
            } else {
                format = String.format("%-8s #%d; ", abstractC3186.f10052.m29986(), abstractC3186.f10053);
            }
            String str3 = "circular reference to " + abstractC3186.f10052.m29986() + " #" + i;
            if (c10242.f29326) {
                concat = "".concat(c10242.m24657(25, format)).concat("<").concat(str3).concat(">").concat(str);
            } else {
                concat = "".concat(c10242.m24657(25, format)).concat(" // <").concat(str3).concat(">").concat(str2);
            }
            abstractC3186.m9800(new IOException(str3));
            return concat;
        }
        abstractC19898 = c10242.f30883;
        return abstractC19898.m45769("??? The entry is missing from the constant_pool table", new Object[0]);
    }

    @Override // l.AbstractC3186
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3637(InterfaceC1134 interfaceC1134, int i) {
        super.mo3637(interfaceC1134, i);
        m3634();
    }

    @Override // l.AbstractC3186
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo3638(InterfaceC1134 interfaceC1134, int i) {
        super.mo3638(interfaceC1134, i);
        m3634();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m3634() {
        String str;
        String str2;
        C10242 c10242 = this.f3920;
        boolean z = c10242.f29343;
        EnumC12358 enumC12358 = this.f10052;
        int i = this.f3918;
        Object obj = this.f10053;
        if (z) {
            switch (enumC12358.ordinal()) {
                case 8:
                case 9:
                case 10:
                    c10242.m24666("#%d.#%d;", obj, Integer.valueOf(i));
                    break;
                case 11:
                    c10242.m24666("#%d:#%d;", obj, Integer.valueOf(i));
                    break;
                case 12:
                case 14:
                case 15:
                    c10242.m24666("%d:#%d;", obj, Integer.valueOf(i));
                    break;
                case 13:
                default:
                    c10242.m24661(this.f10050, String.format("%d:#%d;", obj, Integer.valueOf(i)));
                    StringBuilder sb = new StringBuilder(" // unknown tag: ");
                    str2 = enumC12358.f37042;
                    sb.append(str2);
                    c10242.m24662(sb.toString());
                    break;
            }
        }
        switch (enumC12358.ordinal()) {
            case 8:
            case 9:
            case 10:
                c10242.m24661(this.f10050, String.format("#%d.#%d;", obj, Integer.valueOf(i)));
                c10242.m24662(" // " + mo3639());
                break;
            case 11:
                c10242.m24661(this.f10050, String.format("#%d:#%d;", obj, Integer.valueOf(i)));
                c10242.m24662(" // " + mo3639());
                break;
            case 12:
                c10242.m24661(this.f10050, String.format("%d:#%d;", obj, Integer.valueOf(i)));
                c10242.m24662(" // " + mo3639());
                break;
            case 13:
            default:
                c10242.m24661(this.f10050, String.format("%d:#%d;", obj, Integer.valueOf(i)));
                StringBuilder sb2 = new StringBuilder(" // unknown tag: ");
                str = enumC12358.f37042;
                sb2.append(str);
                c10242.m24662(sb2.toString());
                break;
            case 14:
            case 15:
                c10242.m24661(this.f10050, String.format("%d:#%d;", obj, Integer.valueOf(i)));
                c10242.m24666(" // #%d:%s", obj, c10242.m25964(i));
                break;
        }
    }
}

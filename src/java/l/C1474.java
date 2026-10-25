package l;

import com.alipay.sdk.m.y.l;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: 473S */
/* renamed from: l.֫֡ܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1474 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Map f5273;

    public C1474(Map map) {
        this.f5273 = map;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1474) && C11003.equals(this.f5273, ((C1474) obj).f5273);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f5273);
    }

    public final String toString() {
        Object[] objArr = {this.f5273};
        String[] split = "files".length() == 0 ? new String[0] : "files".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C1474.class, sb, "[");
        for (int i = 0; i < split.length; i++) {
            sb.append(split[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != split.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m5103(AbstractC13921 abstractC13921) {
        LinkedHashMap m39855;
        C12616 m39852;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.f5273);
            if (abstractC13921 instanceof C2346) {
                for (C8696 c8696 : ((C2346) abstractC13921).m7649()) {
                    if (!c8696.m22480()) {
                        return false;
                    }
                    AbstractC15440 m22478 = c8696.m22478();
                    C13843.putIfAbsent(linkedHashMap, m22478.mo23554(), new C12616(m22478.mo23554(), c8696.length(), c8696.m22479()));
                }
            }
            m39855 = C16996.m39855(abstractC13921);
            if (!linkedHashMap.keySet().equals(m39855.keySet())) {
                return false;
            }
            for (AbstractC15440 abstractC15440 : m39855.values()) {
                C12616 c12616 = (C12616) linkedHashMap.get(abstractC15440.mo23554());
                m39852 = C16996.m39852(abstractC15440);
                if (!c12616.equals(m39852)) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}

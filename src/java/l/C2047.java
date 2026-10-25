package l;

import com.thegrizzlylabs.sardineandroid.model.Multistatus;
import com.thegrizzlylabs.sardineandroid.model.Response;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: 6AAS */
/* renamed from: l.֫᩶ۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2047 implements InterfaceC11220 {
    @Override // l.InterfaceC11220
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo6721(C18621 c18621) {
        AbstractC16863.m39633(c18621);
        AbstractC0275 m43170 = c18621.m43170();
        if (m43170 == null) {
            throw new C11988("No entity found in response", c18621.m43177(), c18621.m43171());
        }
        List<Response> response = ((Multistatus) C14746.m35045(Multistatus.class, m43170.m1611())).getResponse();
        ArrayList arrayList = new ArrayList(response.size());
        for (Response response2 : response) {
            try {
                arrayList.add(new C8460(response2));
            } catch (URISyntaxException unused) {
                response2.getHref();
            }
        }
        return arrayList;
    }
}

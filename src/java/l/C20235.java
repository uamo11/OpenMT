package l;

import java.util.Date;
import net.sf.sevenzipjbinding.impl.OutItem;
import net.sf.sevenzipjbinding.impl.OutItemFactory;

/* compiled from: 4B3Z */
/* renamed from: l.᩶ܳᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C20235 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static OutItem m46482(InterfaceC4712 interfaceC4712, int i, OutItemFactory outItemFactory) {
        OutItem outItem = (OutItem) outItemFactory.createOutItem();
        C3301 mo9862 = interfaceC4712.mo9862(i);
        String str = mo9862.f10350;
        if (str.endsWith("/")) {
            outItem.setPropertyIsDir(Boolean.TRUE);
        } else {
            outItem.setDataSize(Long.valueOf(mo9862.f10348));
        }
        outItem.setPropertyLastModificationTime(new Date(mo9862.f10351));
        outItem.setPropertyPath(str);
        String str2 = mo9862.f10349;
        if (str2 != null) {
            outItem.setPropertySymLink(str2);
        }
        return outItem;
    }
}

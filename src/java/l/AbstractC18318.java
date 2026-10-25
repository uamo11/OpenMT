package l;

/* compiled from: 4BJX */
/* renamed from: l.ᩳ᩸ۚ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC18318 extends AbstractC21162 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f56956;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f56957;

    public AbstractC18318(String str, String str2, boolean z) {
        C16990.m39823(str);
        C16990.m39823(str2);
        this.f56956 = C23340.m51751(str);
        boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
        str2 = z2 ? C15472.m36561(1, 1, str2) : str2;
        this.f56957 = z ? C23340.m51751(str2) : z2 ? C23340.m51750(str2) : C23340.m51751(str2);
    }
}

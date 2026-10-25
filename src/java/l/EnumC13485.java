package l;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.simpleframework.xml.strategy.Name;

/* compiled from: G3L1 */
/* renamed from: l.ܰ֨۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum EnumC13485 {
    SOURCE("source"),
    CLASS(Name.LABEL),
    REDUNDANT("redundant");


    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f40272;

    EnumC13485(String str) {
        this.f40272 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumSet m32519(String[] strArr) {
        EnumSet noneOf = EnumSet.noneOf(EnumC13485.class);
        List asList = Arrays.asList(strArr);
        if (asList.contains(ProviderConfigurationPermission.ALL_STR)) {
            noneOf = EnumSet.allOf(EnumC13485.class);
        }
        for (EnumC13485 enumC13485 : values()) {
            if (asList.contains(enumC13485.f40272)) {
                noneOf.add(enumC13485);
            } else {
                if (asList.contains("-" + enumC13485.f40272)) {
                    noneOf.remove(enumC13485);
                }
            }
        }
        return noneOf;
    }
}

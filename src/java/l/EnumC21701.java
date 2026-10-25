package l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* compiled from: A451 */
/* renamed from: l.᩸ܽ۠, reason: contains not printable characters */
/* loaded from: classes.dex */
public enum EnumC21701 {
    SUCCESS("success"),
    FAILURE("failure"),
    APPLICABLE("applicable"),
    INAPPLICABLE("inapplicable"),
    DEFERRED_INST("deferred-inference"),
    PREDEF("predef"),
    OBJECT_INIT("object-init"),
    INTERNAL(UMModuleRegister.INNER);


    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f69613;

    EnumC21701(String str) {
        this.f69613 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumSet m48990(C11781 c11781) {
        String m28824 = c11781.m28824("debug.verboseResolution");
        EnumSet noneOf = EnumSet.noneOf(EnumC21701.class);
        if (m28824 == null) {
            return noneOf;
        }
        if (m28824.contains(ProviderConfigurationPermission.ALL_STR)) {
            noneOf = EnumSet.allOf(EnumC21701.class);
        }
        List asList = Arrays.asList(m28824.split(","));
        for (EnumC21701 enumC21701 : values()) {
            if (asList.contains(enumC21701.f69613)) {
                noneOf.add(enumC21701);
            } else {
                if (asList.contains("-" + enumC21701.f69613)) {
                    noneOf.remove(enumC21701);
                }
            }
        }
        return noneOf;
    }
}

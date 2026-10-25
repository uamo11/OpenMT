package l;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* compiled from: E9ZE */
/* renamed from: l.᩻ܰۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C23730 extends C9620 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static EnumSet f76837 = EnumSet.of(EnumC20909.NTLMSSP_NEGOTIATE_NTLM, EnumC20909.NTLMSSP_NEGOTIATE_UNICODE);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Set f76838;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C19498 f76839;

    public C23730(Set set, C19498 c19498) {
        EnumSet copyOf = EnumSet.copyOf((Collection) set);
        this.f76838 = copyOf;
        copyOf.addAll(f76837);
        this.f76839 = c19498;
    }
}

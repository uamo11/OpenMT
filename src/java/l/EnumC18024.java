package l;

import java.util.EnumSet;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '᩶' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: M43N */
/* renamed from: l.ᩳۨ֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class EnumC18024 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC18024 f56195;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC18024 f56196;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC18024[] f56197;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumSet f56198;

    public static EnumC18024 valueOf(String str) {
        return (EnumC18024) Enum.valueOf(EnumC18024.class, str);
    }

    public static EnumC18024[] values() {
        return (EnumC18024[]) f56197.clone();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC18024[] m42072() {
        return new EnumC18024[]{f56196, f56195};
    }

    static {
        EnumC10969 enumC10969 = EnumC10969.f33008;
        f56196 = new EnumC18024("EQ_LOWER", 0, EnumSet.of(enumC10969, EnumC10969.f33007));
        f56195 = new EnumC18024("EQ_UPPER", 1, EnumSet.of(enumC10969, EnumC10969.f33009));
        f56197 = m42072();
    }

    public EnumC18024(String str, int i, EnumSet enumSet) {
        this.f56198 = enumSet;
    }
}

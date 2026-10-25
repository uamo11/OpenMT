package l;

import android.net.Uri;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: I749 */
/* renamed from: l.ܽ֨ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class EnumC16306 {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final EnumC16306 f50168 = new C1490();

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC16306 f50166 = new C10663();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC16306[] f50167 = m38369();

    public /* synthetic */ EnumC16306(String str, int i, int i2) {
        this(str, i);
    }

    /* renamed from: ֫ */
    public abstract long mo5158();

    /* renamed from: ֫ */
    public abstract boolean mo5159(Uri uri);

    /* renamed from: ֫ */
    public abstract boolean mo5160(String str);

    public EnumC16306(String str, int i) {
    }

    public static EnumC16306 valueOf(String str) {
        return (EnumC16306) Enum.valueOf(EnumC16306.class, str);
    }

    public static EnumC16306[] values() {
        return (EnumC16306[]) f50167.clone();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC16306[] m38369() {
        return new EnumC16306[]{f50168, f50166};
    }
}

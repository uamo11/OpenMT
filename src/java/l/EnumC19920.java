package l;

import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.motion.MotionUtils;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Locale;
import java.util.function.Predicate;
import moe.shizuku.server.IShizukuService;
import net.engio.mbassy.listener.MessageHandler;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ۢۧ' uses external variables
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
/* compiled from: 37RB */
/* renamed from: l.᩶ۘ۠, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class EnumC19920 implements InterfaceC9995, Predicate {

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64367;

    /* renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64368;

    /* renamed from: ֡ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64369;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64370;

    /* renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64371;

    /* renamed from: ֨ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64372;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64373;

    /* renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64374;

    /* renamed from: ֫ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64375;

    /* renamed from: ֫ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64376;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64377;

    /* renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64378;

    /* renamed from: ۖܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64379;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64380;

    /* renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64382;

    /* renamed from: ۗܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64383;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64384;

    /* renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64385;

    /* renamed from: ۘܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64386;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64387;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64388;

    /* renamed from: ۙۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64389;

    /* renamed from: ۙܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64390;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64391;

    /* renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64392;

    /* renamed from: ۚܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64393;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64394;

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64395;

    /* renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64396;

    /* renamed from: ۛܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64397;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64398;

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64399;

    /* renamed from: ۜܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64400;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64401;

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64402;

    /* renamed from: ۟ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64403;

    /* renamed from: ۟ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64404;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64405;

    /* renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64406;

    /* renamed from: ۠ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64407;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64408;

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64409;

    /* renamed from: ۡܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64410;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64411;

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64412;

    /* renamed from: ۢܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64413;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64414;

    /* renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64416;

    /* renamed from: ۤܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64417;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64418;

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64419;

    /* renamed from: ۧܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64420;

    /* renamed from: ۧᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64421;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64422;

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64423;

    /* renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64424;

    /* renamed from: ۨܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64425;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64426;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64427;

    /* renamed from: ۫ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64428;

    /* renamed from: ۫ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64429;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64430;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64431;

    /* renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64432;

    /* renamed from: ۬ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64433;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64434;

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64435;

    /* renamed from: ܰۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64436;

    /* renamed from: ܰܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64437;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64438;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64439;

    /* renamed from: ܳܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64440;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64441;

    /* renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64442;

    /* renamed from: ܶܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64443;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64444;

    /* renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64445;

    /* renamed from: ܺܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64446;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64447;

    /* renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64448;

    /* renamed from: ܽܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64449;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64450;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64451;

    /* renamed from: ܿܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64452;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64453;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64454;

    /* renamed from: ᩳܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64455;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64456;

    /* renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64457;

    /* renamed from: ᩴܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64458;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64459;

    /* renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64460;

    /* renamed from: ᩵ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64461;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC19920[] f64462;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64463;

    /* renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64464;

    /* renamed from: ᩶ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64465;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64466;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64467;

    /* renamed from: ᩷ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64468;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64469;

    /* renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64470;

    /* renamed from: ᩸ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64471;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64472;

    /* renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64473;

    /* renamed from: ᩹ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64474;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64475;

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64476;

    /* renamed from: ᩺ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64477;

    /* renamed from: ᩺ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64478;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64479;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64480;

    /* renamed from: ᩻ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64481;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f64482;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC21331 f64483;

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64381 = new EnumC19920("EOF", 0);

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC19920 f64415 = new EnumC19920("ERROR", 1);

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m45838() {
        return "Token";
    }

    @Override // java.util.function.Predicate
    /* renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public boolean test(EnumC19920 enumC19920) {
        return this == enumC19920;
    }

    public static EnumC19920 valueOf(String str) {
        return (EnumC19920) Enum.valueOf(EnumC19920.class, str);
    }

    public static EnumC19920[] values() {
        return (EnumC19920[]) f64462.clone();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC19920[] m45837() {
        return new EnumC19920[]{f64381, f64415, f64412, f64387, f64394, f64418, f64447, f64453, f64479, f64398, f64466, f64408, f64456, f64459, f64391, f64370, f64441, f64463, f64388, f64395, f64476, f64435, f64402, f64419, f64448, f64409, f64445, f64378, f64385, f64457, f64460, f64406, f64428, f64416, f64424, f64449, f64455, f64452, f64468, f64446, f64369, f64393, f64474, f64465, f64390, f64383, f64433, f64429, f64397, f64478, f64404, f64376, f64421, f64368, f64442, f64374, f64469, f64411, f64372, f64425, f64423, f64396, f64437, f64414, f64444, f64470, f64413, f64392, f64481, f64371, f64400, f64410, f64384, f64405, f64472, f64431, f64454, f64473, f64422, f64417, f64440, f64377, f64427, f64464, f64451, f64475, f64430, f64401, f64420, f64471, f64403, f64407, f64458, f64379, f64380, f64434, f64450, f64477, f64389, f64439, f64399, f64375, f64443, f64461, f64386, f64426, f64373, f64438, f64436, f64382, f64480, f64467, f64432, f64367};
    }

    static {
        EnumC21331 enumC21331 = EnumC21331.NAMED;
        f64412 = new EnumC19920("IDENTIFIER", 2, enumC21331);
        f64387 = new EnumC19920("ABSTRACT", 3, "abstract");
        f64394 = new EnumC19920("ASSERT", 4, "assert", enumC21331);
        f64418 = new EnumC19920("BOOLEAN", 5, ClassTransform.BOOLEAN, enumC21331);
        f64447 = new EnumC19920("BREAK", 6, "break");
        f64453 = new EnumC19920("BYTE", 7, ClassTransform.BYTE, enumC21331);
        f64479 = new EnumC19920("CASE", 8, "case");
        f64398 = new EnumC19920("CATCH", 9, "catch");
        f64466 = new EnumC19920("CHAR", 10, ClassTransform.CHARACTER, enumC21331);
        f64408 = new EnumC19920("CLASS", 11, Name.LABEL);
        f64456 = new EnumC19920("CONST", 12, "const");
        f64459 = new EnumC19920("CONTINUE", 13, "continue");
        f64391 = new EnumC19920("DEFAULT", 14, "default");
        f64370 = new EnumC19920("DO", 15, "do");
        f64441 = new EnumC19920("DOUBLE", 16, ClassTransform.DOUBLE, enumC21331);
        f64463 = new EnumC19920("ELSE", 17, "else");
        f64388 = new EnumC19920("ENUM", 18, "enum", enumC21331);
        f64395 = new EnumC19920("EXTENDS", 19, "extends");
        f64476 = new EnumC19920("FINAL", 20, "final");
        f64435 = new EnumC19920("FINALLY", 21, "finally");
        f64402 = new EnumC19920("FLOAT", 22, ClassTransform.FLOAT, enumC21331);
        f64419 = new EnumC19920("FOR", 23, "for");
        f64448 = new EnumC19920("GOTO", 24, "goto");
        f64409 = new EnumC19920("IF", 25, "if");
        f64445 = new EnumC19920("IMPLEMENTS", 26, "implements");
        f64378 = new EnumC19920("IMPORT", 27, "import");
        f64385 = new EnumC19920("INSTANCEOF", 28, "instanceof");
        f64457 = new EnumC19920("INT", 29, ClassTransform.INTEGER, enumC21331);
        f64460 = new EnumC19920("INTERFACE", 30, "interface");
        f64406 = new EnumC19920("LONG", 31, ClassTransform.LONG, enumC21331);
        f64428 = new EnumC19920("NATIVE", 32, UMConfigure.WRAPER_TYPE_NATIVE);
        f64416 = new EnumC19920("NEW", 33, "new");
        f64424 = new EnumC19920("PACKAGE", 34, "package");
        f64449 = new EnumC19920("PRIVATE", 35, "private");
        f64455 = new EnumC19920("PROTECTED", 36, "protected");
        f64452 = new EnumC19920("PUBLIC", 37, "public");
        f64468 = new EnumC19920("RETURN", 38, "return");
        f64446 = new EnumC19920("SHORT", 39, ClassTransform.SHORT, enumC21331);
        f64369 = new EnumC19920("STATIC", 40, "static");
        f64393 = new EnumC19920("STRICTFP", 41, "strictfp");
        f64474 = new EnumC19920("SUPER", 42, "super", enumC21331);
        f64465 = new EnumC19920("SWITCH", 43, "switch");
        f64390 = new EnumC19920("SYNCHRONIZED", 44, MessageHandler.Properties.IsSynchronized);
        f64383 = new EnumC19920("THIS", 45, "this", enumC21331);
        f64433 = new EnumC19920("THROW", 46, "throw");
        f64429 = new EnumC19920("THROWS", 47, "throws");
        f64397 = new EnumC19920("TRANSIENT", 48, "transient");
        f64478 = new EnumC19920("TRY", 49, "try");
        f64404 = new EnumC19920("VOID", 50, ClassTransform.VOID, enumC21331);
        f64376 = new EnumC19920("VOLATILE", 51, "volatile");
        f64421 = new EnumC19920("WHILE", 52, "while");
        EnumC21331 enumC213312 = EnumC21331.NUMERIC;
        f64368 = new EnumC19920("INTLITERAL", 53, enumC213312);
        f64442 = new EnumC19920("LONGLITERAL", 54, enumC213312);
        f64374 = new EnumC19920("FLOATLITERAL", 55, enumC213312);
        f64469 = new EnumC19920("DOUBLELITERAL", 56, enumC213312);
        f64411 = new EnumC19920("CHARLITERAL", 57, enumC213312);
        f64372 = new EnumC19920("STRINGLITERAL", 58, EnumC21331.STRING);
        f64425 = new EnumC19920("TRUE", 59, "true", enumC21331);
        f64423 = new EnumC19920("FALSE", 60, "false", enumC21331);
        f64396 = new EnumC19920("NULL", 61, "null", enumC21331);
        f64437 = new EnumC19920("UNDERSCORE", 62, "_", enumC21331);
        f64414 = new EnumC19920("ARROW", 63, "->");
        f64444 = new EnumC19920("COLCOL", 64, "::");
        f64470 = new EnumC19920("LPAREN", 65, MotionUtils.EASING_TYPE_FORMAT_START);
        f64413 = new EnumC19920("RPAREN", 66, MotionUtils.EASING_TYPE_FORMAT_END);
        f64392 = new EnumC19920("LBRACE", 67, "{");
        f64481 = new EnumC19920("RBRACE", 68, l.d);
        f64371 = new EnumC19920("LBRACKET", 69, "[");
        f64400 = new EnumC19920("RBRACKET", 70, "]");
        f64410 = new EnumC19920("SEMI", 71, l.b);
        f64384 = new EnumC19920("COMMA", 72, ",");
        f64405 = new EnumC19920("DOT", 73, ".");
        f64472 = new EnumC19920("ELLIPSIS", 74, "...");
        f64431 = new EnumC19920("EQ", 75, "=");
        f64454 = new EnumC19920("GT", 76, ">");
        f64473 = new EnumC19920("LT", 77, "<");
        f64422 = new EnumC19920("BANG", 78, "!");
        f64417 = new EnumC19920("TILDE", 79, "~");
        f64440 = new EnumC19920("QUES", 80, "?");
        f64377 = new EnumC19920("COLON", 81, ":");
        f64427 = new EnumC19920("EQEQ", 82, "==");
        f64464 = new EnumC19920("LTEQ", 83, "<=");
        f64451 = new EnumC19920("GTEQ", 84, ">=");
        f64475 = new EnumC19920("BANGEQ", 85, "!=");
        f64430 = new EnumC19920("AMPAMP", 86, "&&");
        f64401 = new EnumC19920("BARBAR", 87, "||");
        f64420 = new EnumC19920("PLUSPLUS", 88, "++");
        f64471 = new EnumC19920("SUBSUB", 89, "--");
        f64403 = new EnumC19920("PLUS", 90, BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
        f64407 = new EnumC19920("SUB", 91, "-");
        f64458 = new EnumC19920("STAR", 92, "*");
        f64379 = new EnumC19920("SLASH", 93, "/");
        f64380 = new EnumC19920("AMP", 94, a.p);
        f64434 = new EnumC19920("BAR", 95, "|");
        f64450 = new EnumC19920("CARET", 96, "^");
        f64477 = new EnumC19920("PERCENT", 97, "%");
        f64389 = new EnumC19920("LTLT", 98, "<<");
        f64439 = new EnumC19920("GTGT", 99, ">>");
        f64399 = new EnumC19920("GTGTGT", 100, ">>>");
        f64375 = new EnumC19920("PLUSEQ", 101, "+=");
        f64443 = new EnumC19920("SUBEQ", IShizukuService.Stub.TRANSACTION_attachUserService, "-=");
        f64461 = new EnumC19920("STAREQ", IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, "*=");
        f64386 = new EnumC19920("SLASHEQ", IShizukuService.Stub.TRANSACTION_isHidden, "/=");
        f64426 = new EnumC19920("AMPEQ", IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, "&=");
        f64373 = new EnumC19920("BAREQ", IShizukuService.Stub.TRANSACTION_getFlagsForUid, "|=");
        f64438 = new EnumC19920("CARETEQ", IShizukuService.Stub.TRANSACTION_updateFlagsForUid, "^=");
        f64436 = new EnumC19920("PERCENTEQ", 108, "%=");
        f64382 = new EnumC19920("LTLTEQ", 109, "<<=");
        f64480 = new EnumC19920("GTGTEQ", UMErrorCode.E_UM_BE_JSON_FAILED, ">>=");
        f64467 = new EnumC19920("GTGTGTEQ", UMErrorCode.E_UM_BE_CREATE_FAILED, ">>>=");
        f64432 = new EnumC19920("MONKEYS_AT", UMErrorCode.E_UM_BE_DEFLATE_FAILED, "@");
        f64367 = new EnumC19920("CUSTOM", UMErrorCode.E_UM_BE_RAW_OVERSIZE);
        f64462 = m45837();
    }

    public EnumC19920(String str, int i) {
        this(str, i, null, EnumC21331.DEFAULT);
    }

    public EnumC19920(String str, int i, String str2) {
        this(str, i, str2, EnumC21331.DEFAULT);
    }

    public EnumC19920(String str, int i, EnumC21331 enumC21331) {
        this(str, i, null, enumC21331);
    }

    public EnumC19920(String str, int i, String str2, EnumC21331 enumC21331) {
        this.f64482 = str2;
        this.f64483 = enumC21331;
    }

    @Override // java.lang.Enum
    public String toString() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "token.end-of-input";
        }
        if (ordinal == 1) {
            return "token.bad-symbol";
        }
        if (ordinal == 2) {
            return "token.identifier";
        }
        switch (ordinal) {
            case 53:
                return "token.integer";
            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                return "token.long-integer";
            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                return "token.float";
            case 56:
                return "token.double";
            case 57:
                return "token.character";
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                return "token.string";
            default:
                switch (ordinal) {
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                        return C9045.m23341(new StringBuilder("'"), this.f64482, "'");
                    default:
                        return this.f64482;
                }
        }
    }

    @Override // l.InterfaceC9995
    /* renamed from: ֫ */
    public String mo21946(Locale locale, InterfaceC11406 interfaceC11406) {
        if (this.f64482 != null) {
            return toString();
        }
        return ((C14602) interfaceC11406).m34854(locale, "compiler.misc." + toString(), new Object[0]);
    }
}

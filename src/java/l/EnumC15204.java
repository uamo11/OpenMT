package l;

import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.u0.b;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import com.alipay.sdk.m.y.q;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.d;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.internal.c;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.Predicate;
import moe.shizuku.server.IShizukuService;
import net.engio.mbassy.listener.MessageHandler;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '۬ۧ' uses external variables
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
/* compiled from: O7F0 */
/* renamed from: l.ܶۨۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class EnumC15204 {

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46438;

    /* renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46439;

    /* renamed from: ֡ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46440;

    /* renamed from: ֡ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46441;

    /* renamed from: ֡ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46442;

    /* renamed from: ֡ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46443;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46444;

    /* renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46445;

    /* renamed from: ֨ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46446;

    /* renamed from: ֨ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46447;

    /* renamed from: ֨ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46448;

    /* renamed from: ֨ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46449;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46450;

    /* renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46451;

    /* renamed from: ֫ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46452;

    /* renamed from: ֫ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46453;

    /* renamed from: ֫ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46454;

    /* renamed from: ֫ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46455;

    /* renamed from: ֫᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46456;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46457;

    /* renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46458;

    /* renamed from: ۖܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46459;

    /* renamed from: ۖܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46460;

    /* renamed from: ۖܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46461;

    /* renamed from: ۖᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46462;

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46463;

    /* renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46464;

    /* renamed from: ۗܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46465;

    /* renamed from: ۗܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46466;

    /* renamed from: ۗܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46467;

    /* renamed from: ۗᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46468;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46469;

    /* renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46470;

    /* renamed from: ۘܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46471;

    /* renamed from: ۘܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46472;

    /* renamed from: ۘܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46473;

    /* renamed from: ۘᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46474;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46475;

    /* renamed from: ۙۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46476;

    /* renamed from: ۙܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46477;

    /* renamed from: ۙܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46478;

    /* renamed from: ۙܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46479;

    /* renamed from: ۙᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46480;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46481;

    /* renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46482;

    /* renamed from: ۚܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46483;

    /* renamed from: ۚܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46484;

    /* renamed from: ۚܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46485;

    /* renamed from: ۚᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46486;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46487;

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46488;

    /* renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46489;

    /* renamed from: ۛܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46490;

    /* renamed from: ۛܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46491;

    /* renamed from: ۛܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46492;

    /* renamed from: ۛᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46493;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46494;

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46495;

    /* renamed from: ۜܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46496;

    /* renamed from: ۜܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46497;

    /* renamed from: ۜܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46498;

    /* renamed from: ۜᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46499;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46500;

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46501;

    /* renamed from: ۟ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46502;

    /* renamed from: ۟ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46503;

    /* renamed from: ۟ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46504;

    /* renamed from: ۟ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46505;

    /* renamed from: ۟ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46506;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46507;

    /* renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46508;

    /* renamed from: ۠ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46509;

    /* renamed from: ۠ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46510;

    /* renamed from: ۠ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46511;

    /* renamed from: ۠ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46512;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46513;

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46514;

    /* renamed from: ۡܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46515;

    /* renamed from: ۡܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46516;

    /* renamed from: ۡܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46517;

    /* renamed from: ۡᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46518;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46519;

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46520;

    /* renamed from: ۢܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46521;

    /* renamed from: ۢܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46522;

    /* renamed from: ۢܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46523;

    /* renamed from: ۢᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46524;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46525;

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46526;

    /* renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46527;

    /* renamed from: ۤܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46528;

    /* renamed from: ۤܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46529;

    /* renamed from: ۤܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46530;

    /* renamed from: ۤᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46531;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46532;

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46533;

    /* renamed from: ۧܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46534;

    /* renamed from: ۧܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46535;

    /* renamed from: ۧܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46536;

    /* renamed from: ۧᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46537;

    /* renamed from: ۧ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46538;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final EnumSet f46539;

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46540;

    /* renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46541;

    /* renamed from: ۨܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46542;

    /* renamed from: ۨܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46543;

    /* renamed from: ۨܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46544;

    /* renamed from: ۨᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46545;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC15204[] f46546;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46547;

    /* renamed from: ۫ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46548;

    /* renamed from: ۫ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46549;

    /* renamed from: ۫ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46550;

    /* renamed from: ۫ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46551;

    /* renamed from: ۫ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46552;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46553;

    /* renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46554;

    /* renamed from: ۬ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46555;

    /* renamed from: ۬ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46556;

    /* renamed from: ۬ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46557;

    /* renamed from: ۬ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46558;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46559;

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46560;

    /* renamed from: ܰۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46561;

    /* renamed from: ܰܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46562;

    /* renamed from: ܰܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46563;

    /* renamed from: ܰܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46564;

    /* renamed from: ܰᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46565;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46566;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46567;

    /* renamed from: ܳܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46568;

    /* renamed from: ܳܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46569;

    /* renamed from: ܳܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46570;

    /* renamed from: ܳᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46571;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46572;

    /* renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46573;

    /* renamed from: ܶܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46574;

    /* renamed from: ܶܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46575;

    /* renamed from: ܶܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46576;

    /* renamed from: ܶᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46577;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46578;

    /* renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46579;

    /* renamed from: ܺܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46580;

    /* renamed from: ܺܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46581;

    /* renamed from: ܺܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46582;

    /* renamed from: ܺᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46583;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46584;

    /* renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46585;

    /* renamed from: ܽܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46586;

    /* renamed from: ܽܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46587;

    /* renamed from: ܽܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46588;

    /* renamed from: ܽᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46589;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46590;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46591;

    /* renamed from: ܿܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46592;

    /* renamed from: ܿܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46593;

    /* renamed from: ܿܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46594;

    /* renamed from: ܿᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46595;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46596;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46597;

    /* renamed from: ᩳܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46598;

    /* renamed from: ᩳܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46599;

    /* renamed from: ᩳܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46600;

    /* renamed from: ᩳᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46601;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46602;

    /* renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46603;

    /* renamed from: ᩴܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46604;

    /* renamed from: ᩴܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46605;

    /* renamed from: ᩴܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46606;

    /* renamed from: ᩴᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46607;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46608;

    /* renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46609;

    /* renamed from: ᩵ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46610;

    /* renamed from: ᩵ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46611;

    /* renamed from: ᩵ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46612;

    /* renamed from: ᩵ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46613;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46614;

    /* renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46615;

    /* renamed from: ᩶ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46616;

    /* renamed from: ᩶ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46617;

    /* renamed from: ᩶ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46618;

    /* renamed from: ᩶ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46619;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46620;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46621;

    /* renamed from: ᩷ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46622;

    /* renamed from: ᩷ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46623;

    /* renamed from: ᩷ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46624;

    /* renamed from: ᩷ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46625;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46626;

    /* renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46627;

    /* renamed from: ᩸ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46628;

    /* renamed from: ᩸ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46629;

    /* renamed from: ᩸ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46630;

    /* renamed from: ᩸ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46631;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46632;

    /* renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46633;

    /* renamed from: ᩹ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46634;

    /* renamed from: ᩹ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46635;

    /* renamed from: ᩹ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46636;

    /* renamed from: ᩹ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46637;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46638;

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46639;

    /* renamed from: ᩺ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46640;

    /* renamed from: ᩺ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46641;

    /* renamed from: ᩺ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46642;

    /* renamed from: ᩺ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46643;

    /* renamed from: ᩺ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46644;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46645;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46646;

    /* renamed from: ᩻ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46647;

    /* renamed from: ᩻ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46648;

    /* renamed from: ᩻ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46649;

    /* renamed from: ᩻ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC15204 f46650;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final EnumSet f46651;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f46652;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Integer f46653;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f46654;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f46655;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC19440 f46656;

    public static EnumC15204 valueOf(String str) {
        return (EnumC15204) Enum.valueOf(EnumC15204.class, str);
    }

    public static EnumC15204[] values() {
        return (EnumC15204[]) f46546.clone();
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC15204[] m35958() {
        return new EnumC15204[]{f46554, f46591, f46608, f46513, f46620, f46578, f46590, f46469, f46519, f46457, f46602, f46566, f46645, f46494, f46495, f46588, f46638, f46507, f46626, f46481, f46631, f46548, f46460, f46605, f46563, f46462, f46550, f46518, f46636, f46465, f46487, f46496, f46445, f46448, f46486, f46639, f46649, f46637, f46493, f46444, f46517, f46523, f46558, f46531, f46552, f46624, f46498, f46599, f46607, f46584, f46468, f46575, f46470, f46514, f46502, f46532, f46472, f46611, f46614, f46488, f46451, f46557, f46543, f46625, f46522, f46627, f46647, f46547, f46501, f46467, f46529, f46499, f46623, f46573, f46641, f46632, f46574, f46587, f46471, f46622, f46545, f46604, f46521, f46484, f46633, f46516, f46503, f46508, f46515, f46540, f46609, f46463, f46520, f46576, f46628, f46560, f46497, f46610, f46598, f46453, f46603, f46490, f46510, f46533, f46569, f46585, f46535, f46447, f46491, f46600, f46464, f46474, f46440, f46500, f46582, f46606, f46461, f46621, f46592, f46446, f46580, f46577, f46648, f46562, f46525, f46509, f46454, f46438, f46479, f46597, f46612, f46642, f46442, f46524, f46630, f46583, f46618, f46640, f46489, f46541, f46527, f46567, f46634, f46504, f46478, f46635, f46617, f46613, f46593, f46564, f46601, f46579, f46458, f46551, f46572, f46629, f46512, f46466, f46565, f46459, f46568, f46439, f46542, f46443, f46559, f46594, f46528, f46553, f46475, f46619, f46530, f46480, f46485, f46646, f46570, f46643, f46615, f46544, f46511, f46561, f46483, f46555, f46473, f46538, f46536, f46596, f46556, f46456, f46616, f46589, f46452, f46534, f46537, f46571, f46650, f46455, f46586, f46492, f46449, f46482, f46644, f46581, f46476, f46506, f46526, f46505, f46595, f46477, f46450, f46441, f46549};
    }

    static {
        EnumC21556 enumC21556 = EnumC21556.MISC;
        EnumC21556 enumC215562 = EnumC21556.CLASS_NAME;
        EnumC21556 enumC215563 = EnumC21556.MODULE_NAME;
        f46554 = new EnumC15204("EOF", 0, -1, "EOF", "EOF", EnumSet.of(enumC21556, enumC215562, enumC215563));
        EnumC21556 enumC215564 = EnumC21556.OPERATOR;
        f46591 = new EnumC15204("COMMA", 1, 0, "COMMA", ",", EnumSet.of(enumC215564));
        f46608 = new EnumC15204("ASSIGN", 2, 1, "ASSIGN", "=", EnumSet.of(enumC215564));
        f46513 = new EnumC15204("ASGMUL", 3, 2, "ASGMUL", "*=", EnumSet.of(enumC215564));
        f46620 = new EnumC15204("ASGDIV", 4, 3, "ASGDIV", "/=", EnumSet.of(enumC215564));
        f46578 = new EnumC15204("ASGREM", 5, 4, "ASGREM", "%=", EnumSet.of(enumC215564));
        f46590 = new EnumC15204("ASGADD", 6, 5, "ASGADD", "+=", EnumSet.of(enumC215564));
        f46469 = new EnumC15204("ASGSUB", 7, 6, "ASGSUB", "-=", EnumSet.of(enumC215564));
        f46519 = new EnumC15204("ASGLSHIFT", 8, 7, "ASGLSHIFT", "<<=", EnumSet.of(enumC215564));
        f46457 = new EnumC15204("ASGRSHIFT", 9, 8, "ASGRSHIFT", ">>=", EnumSet.of(enumC215564));
        f46602 = new EnumC15204("ASGURSHIFT", 10, 9, "ASGURSHIFT", "<<<=", EnumSet.of(enumC215564));
        f46566 = new EnumC15204("ASGBITAND", 11, 10, "ASGBITAND", "&=", EnumSet.of(enumC215564));
        f46645 = new EnumC15204("ASGBITOR", 12, 11, "ASGBITOR", "|=", EnumSet.of(enumC215564));
        f46494 = new EnumC15204("ASGBITXOR", 13, 12, "ASGBITXOR", "^=", EnumSet.of(enumC215564));
        f46495 = new EnumC15204("COND", 14, 13, "COND", "?:", EnumSet.of(enumC215564));
        f46588 = new EnumC15204("OR", 15, 14, "OR", "||", EnumSet.of(enumC215564));
        f46638 = new EnumC15204("AND", 16, 15, "AND", "&&", EnumSet.of(enumC215564));
        f46507 = new EnumC15204("BITOR", 17, 16, "BITOR", "|", EnumSet.of(enumC215564));
        f46626 = new EnumC15204("BITXOR", 18, 17, "BITXOR", "^", EnumSet.of(enumC215564));
        f46481 = new EnumC15204("BITAND", 19, 18, "BITAND", a.p, EnumSet.of(enumC215564));
        f46631 = new EnumC15204("NE", 20, 19, "NE", "!=", EnumSet.of(enumC215564));
        f46548 = new EnumC15204("EQ", 21, 20, "EQ", "==", EnumSet.of(enumC215564));
        f46460 = new EnumC15204("GE", 22, 21, "GE", ">=", EnumSet.of(enumC215564));
        f46605 = new EnumC15204("GT", 23, 22, "GT", ">", EnumSet.of(enumC215564));
        f46563 = new EnumC15204("LE", 24, 23, "LE", "<=", EnumSet.of(enumC215564));
        f46462 = new EnumC15204("LT", 25, 24, "LT", "<", EnumSet.of(enumC215564));
        f46550 = new EnumC15204("INSTANCEOF", 26, 25, "INSTANCEOF", "instanceof", EnumSet.of(enumC215564));
        f46518 = new EnumC15204("LSHIFT", 27, 26, "LSHIFT", "<<", EnumSet.of(enumC215564));
        f46636 = new EnumC15204("RSHIFT", 28, 27, "RSHIFT", ">>", EnumSet.of(enumC215564));
        f46465 = new EnumC15204("URSHIFT", 29, 28, "URSHIFT", "<<<", EnumSet.of(enumC215564));
        f46487 = new EnumC15204("ADD", 30, 29, "ADD", BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, EnumSet.of(enumC215564));
        f46496 = new EnumC15204("SUB", 31, 30, "SUB", "-", EnumSet.of(enumC215564));
        f46445 = new EnumC15204("DIV", 32, 31, "DIV", "/", EnumSet.of(enumC215564));
        f46448 = new EnumC15204("REM", 33, 32, "REM", "%", EnumSet.of(enumC215564));
        f46486 = new EnumC15204("MUL", 34, 33, "MUL", "*", EnumSet.of(enumC215564));
        f46639 = new EnumC15204("CAST", 35, 34, "CAST", "cast", EnumSet.of(enumC215564, enumC215562, enumC215563));
        f46649 = new EnumC15204("POS", 36, 35, "POS", BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, EnumSet.of(enumC215564));
        f46637 = new EnumC15204("NEG", 37, 36, "NEG", "-", EnumSet.of(enumC215564));
        f46493 = new EnumC15204("NOT", 38, 37, "NOT", "!", EnumSet.of(enumC215564));
        f46444 = new EnumC15204("BITNOT", 39, 38, "BITNOT", "~", EnumSet.of(enumC215564));
        f46517 = new EnumC15204("PREINC", 40, 39, "PREINC", "++", EnumSet.of(enumC215564));
        f46523 = new EnumC15204("PREDEC", 41, 40, "PREDEC", "--", EnumSet.of(enumC215564));
        f46558 = new EnumC15204("NEWARRAY", 42, 41, "NEWARRAY", "new", EnumSet.of(enumC215564));
        f46531 = new EnumC15204("NEWINSTANCE", 43, 42, "NEWINSTANCE", "new", EnumSet.of(enumC215564));
        f46552 = new EnumC15204("NEWFROMNAME", 44, 43, "NEWFROMNAME", "new", EnumSet.of(enumC215564));
        f46624 = new EnumC15204("POSTINC", 45, 44, "POSTINC", "++", EnumSet.of(enumC215564));
        f46498 = new EnumC15204("POSTDEC", 46, 45, "POSTDEC", "--", EnumSet.of(enumC215564));
        f46599 = new EnumC15204("FIELD", 47, 46, "FIELD", "field", EnumSet.of(enumC215564, enumC215562, enumC215563));
        f46607 = new EnumC15204("METHOD", 48, 47, "METHOD", e.s, EnumSet.of(enumC215564, enumC215562, enumC215563));
        f46584 = new EnumC15204("ARRAYACCESS", 49, 48, "ARRAYACCESS", "[]", EnumSet.of(enumC215564));
        f46468 = new EnumC15204("NEW", 50, 49, "NEW", "new", EnumSet.of(enumC215564));
        f46575 = new EnumC15204("INC", 51, 50, "INC", "++", EnumSet.of(enumC215564));
        f46470 = new EnumC15204("DEC", 52, 51, "DEC", "--", EnumSet.of(enumC215564));
        f46514 = new EnumC15204("CONVERT", 53, 55, "CONVERT", "convert", EnumSet.of(enumC215564, enumC215562, enumC215563));
        f46502 = new EnumC15204("EXPR", 54, 56, "EXPR", "expr", EnumSet.of(enumC215564, enumC215562, enumC215563));
        f46532 = new EnumC15204("ARRAY", 55, 57, "ARRAY", "array", EnumSet.of(enumC215564, enumC215562, enumC215563));
        f46472 = new EnumC15204("GOTO", 56, 58, "GOTO", "goto", EnumSet.of(enumC215564));
        EnumC21556 enumC215565 = EnumC21556.VALUE;
        EnumC21556 enumC215566 = EnumC21556.JASM_IDENT;
        EnumSet of = EnumSet.of(enumC215565, enumC215562, enumC215563, enumC215566);
        EnumC19440 enumC19440 = EnumC19440.VALUE;
        f46611 = new EnumC15204("IDENT", 57, 60, "IDENT", "Identifier", of, enumC19440);
        f46614 = new EnumC15204("BOOLEANVAL", 58, 61, "BOOLEANVAL", "Boolean", EnumSet.of(enumC215565, enumC215562, enumC215563), enumC19440);
        f46488 = new EnumC15204("BYTEVAL", 59, 62, "BYTEVAL", "Byte", EnumSet.of(enumC215565, enumC215562, enumC215563));
        f46451 = new EnumC15204("CHARVAL", 60, 63, "CHARVAL", "Char", EnumSet.of(enumC215565, enumC215562, enumC215563));
        f46557 = new EnumC15204("SHORTVAL", 61, 64, "SHORTVAL", "Short", EnumSet.of(enumC215565, enumC215562, enumC215563));
        f46543 = new EnumC15204("INTVAL", 62, 65, "INTVAL", "Integer", EnumSet.of(enumC215565, enumC215562, enumC215563), enumC19440);
        f46625 = new EnumC15204("LONGVAL", 63, 66, "LONGVAL", "Long", EnumSet.of(enumC215565, enumC215562, enumC215563), enumC19440);
        f46522 = new EnumC15204("FLOATVAL", 64, 67, "FLOATVAL", "Float", EnumSet.of(enumC215565, enumC215562, enumC215563), enumC19440);
        f46627 = new EnumC15204("DOUBLEVAL", 65, 68, "DOUBLEVAL", "Double", EnumSet.of(enumC215565, enumC215562, enumC215563), enumC19440);
        f46647 = new EnumC15204("STRINGVAL", 66, 69, "STRINGVAL", "String", EnumSet.of(enumC215565, enumC215562, enumC215563), enumC19440);
        EnumC21556 enumC215567 = EnumC21556.TYPE;
        f46547 = new EnumC15204("BYTE", 67, 70, "BYTE", ClassTransform.BYTE, EnumSet.of(enumC215567));
        f46501 = new EnumC15204("CHAR", 68, 71, "CHAR", ClassTransform.CHARACTER, EnumSet.of(enumC215567));
        f46467 = new EnumC15204("SHORT", 69, 72, "SHORT", ClassTransform.SHORT, EnumSet.of(enumC215567));
        f46529 = new EnumC15204("INT", 70, 73, "INT", ClassTransform.INTEGER, EnumSet.of(enumC215567));
        f46499 = new EnumC15204("LONG", 71, 74, "LONG", ClassTransform.LONG, EnumSet.of(enumC215567));
        f46623 = new EnumC15204("FLOAT", 72, 75, "FLOAT", ClassTransform.FLOAT, EnumSet.of(enumC215567));
        f46573 = new EnumC15204("DOUBLE", 73, 76, "DOUBLE", ClassTransform.DOUBLE, EnumSet.of(enumC215567));
        f46641 = new EnumC15204("VOID", 74, 77, "VOID", ClassTransform.VOID, EnumSet.of(enumC215567));
        f46632 = new EnumC15204("BOOLEAN", 75, 78, "BOOLEAN", ClassTransform.BOOLEAN, EnumSet.of(enumC215567));
        EnumC21556 enumC215568 = EnumC21556.EXPRESSION;
        f46574 = new EnumC15204("TRUE", 76, 80, "TRUE", "true", EnumSet.of(enumC215568, enumC215562, enumC215563));
        f46587 = new EnumC15204("FALSE", 77, 81, "FALSE", "false", EnumSet.of(enumC215568, enumC215562, enumC215563));
        f46471 = new EnumC15204("THIS", 78, 82, "THIS", "this", EnumSet.of(enumC215568));
        EnumC21556 enumC215569 = EnumC21556.MODIFIER;
        EnumSet of2 = EnumSet.of(enumC215569);
        EnumC19440 enumC194402 = EnumC19440.KEYWORD;
        f46622 = new EnumC15204("SUPER", 79, 83, "SUPER", "super", of2, enumC194402);
        f46545 = new EnumC15204("NULL", 80, 84, "NULL", "null", EnumSet.of(enumC215568, enumC215562, enumC215563));
        EnumC21556 enumC2155610 = EnumC21556.DECLARATION;
        f46604 = new EnumC15204("THIS_CLASS", 81, 85, "this_class", "this_class", EnumSet.of(enumC2155610, enumC215562, enumC215563), enumC194402);
        f46521 = new EnumC15204("SUPER_CLASS", 82, 86, "super_class", "super_class", EnumSet.of(enumC2155610, enumC215562, enumC215563), enumC194402);
        EnumC21556 enumC2155611 = EnumC21556.STATEMENT;
        f46484 = new EnumC15204("IF", 83, 90, "IF", "if", EnumSet.of(enumC2155611));
        f46633 = new EnumC15204("ELSE", 84, 91, "ELSE", "else", EnumSet.of(enumC2155611));
        f46516 = new EnumC15204("FOR", 85, 92, "FOR", "for", EnumSet.of(enumC2155611));
        f46503 = new EnumC15204("WHILE", 86, 93, "WHILE", "while", EnumSet.of(enumC2155611));
        f46508 = new EnumC15204("DO", 87, 94, "DO", "do", EnumSet.of(enumC2155611));
        f46515 = new EnumC15204("SWITCH", 88, 95, "SWITCH", "switch", EnumSet.of(enumC2155611));
        f46540 = new EnumC15204("CASE", 89, 96, "CASE", "case", EnumSet.of(enumC2155611));
        f46609 = new EnumC15204("DEFAULT", 90, 97, "DEFAULT", "default", EnumSet.of(enumC2155611), enumC194402);
        f46463 = new EnumC15204("BREAK", 91, 98, "BREAK", "break", EnumSet.of(enumC2155611));
        f46520 = new EnumC15204("CONTINUE", 92, 99, "CONTINUE", "continue", EnumSet.of(enumC2155611));
        f46576 = new EnumC15204("RETURN", 93, 100, "RETURN", "return", EnumSet.of(enumC2155611));
        f46628 = new EnumC15204("TRY", 94, 101, "TRY", "try", EnumSet.of(enumC2155611));
        f46560 = new EnumC15204("CATCH", 95, Integer.valueOf(IShizukuService.Stub.TRANSACTION_attachUserService), "CATCH", "catch", EnumSet.of(enumC2155611));
        f46497 = new EnumC15204("FINALLY", 96, Integer.valueOf(IShizukuService.Stub.TRANSACTION_dispatchPackageChanged), "FINALLY", "finally", EnumSet.of(enumC2155611));
        f46610 = new EnumC15204("THROW", 97, Integer.valueOf(IShizukuService.Stub.TRANSACTION_isHidden), "THROW", "throw", EnumSet.of(enumC2155611));
        f46598 = new EnumC15204("STAT", 98, Integer.valueOf(IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult), "STAT", c.h, EnumSet.of(enumC2155611, enumC215562, enumC215563));
        f46453 = new EnumC15204("EXPRESSION", 99, Integer.valueOf(IShizukuService.Stub.TRANSACTION_getFlagsForUid), "EXPRESSION", "expression", EnumSet.of(enumC2155611, enumC215562, enumC215563));
        f46603 = new EnumC15204("DECLARATION", 100, Integer.valueOf(IShizukuService.Stub.TRANSACTION_updateFlagsForUid), "DECLARATION", "declaration", EnumSet.of(enumC2155611, enumC215562, enumC215563));
        f46490 = new EnumC15204("VARDECLARATION", 101, 108, "VARDECLARATION", "vdeclaration", EnumSet.of(enumC2155611, enumC215562, enumC215563));
        f46510 = new EnumC15204("IMPORT", IShizukuService.Stub.TRANSACTION_attachUserService, Integer.valueOf(UMErrorCode.E_UM_BE_JSON_FAILED), "IMPORT", "import", EnumSet.of(enumC2155610, enumC215562, enumC215563));
        f46533 = new EnumC15204("CLASS", IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, Integer.valueOf(UMErrorCode.E_UM_BE_CREATE_FAILED), "CLASS", Name.LABEL, EnumSet.of(enumC2155610, enumC215562, enumC215563), enumC194402);
        f46569 = new EnumC15204("FILE", IShizukuService.Stub.TRANSACTION_isHidden, 52, "FILE", "file", EnumSet.of(enumC2155610, enumC215562, enumC215563), enumC194402);
        f46585 = new EnumC15204("CLASS_FILE", IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, 53, "CLASSFILE", "classfile", EnumSet.of(enumC2155610, enumC215562, enumC215563), enumC194402);
        f46535 = new EnumC15204("EXTENDS", IShizukuService.Stub.TRANSACTION_getFlagsForUid, Integer.valueOf(UMErrorCode.E_UM_BE_DEFLATE_FAILED), "EXTENDS", "extends", EnumSet.of(enumC2155610, enumC215562, enumC215563), enumC194402);
        f46447 = new EnumC15204("IMPLEMENTS", IShizukuService.Stub.TRANSACTION_updateFlagsForUid, Integer.valueOf(UMErrorCode.E_UM_BE_RAW_OVERSIZE), "IMPLEMENTS", "implements", EnumSet.of(enumC2155610, enumC215562, enumC215563), enumC194402);
        f46491 = new EnumC15204("INTERFACE", 108, 114, "INTERFACE", "interface", EnumSet.of(enumC2155610, enumC215562, enumC215563), enumC194402);
        f46600 = new EnumC15204("PACKAGE", 109, 115, "PACKAGE", "package", EnumSet.of(enumC2155610), enumC194402);
        f46464 = new EnumC15204("ENUM", UMErrorCode.E_UM_BE_JSON_FAILED, 116, "ENUM", "enum", EnumSet.of(enumC2155610), enumC194402);
        f46474 = new EnumC15204("MANDATED", UMErrorCode.E_UM_BE_CREATE_FAILED, Integer.valueOf(BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION), "MANDATED", "mandated", EnumSet.of(enumC2155610, enumC215562), enumC194402);
        f46440 = new EnumC15204("THROWS", UMErrorCode.E_UM_BE_DEFLATE_FAILED, 118, "THROWS", "throws", EnumSet.of(enumC2155610), enumC194402);
        f46500 = new EnumC15204("ANNOTATION_ACCESS", UMErrorCode.E_UM_BE_RAW_OVERSIZE, 119, "ANNOTATION_ACCESS", "annotation", EnumSet.of(enumC215569, enumC215562, enumC215563), enumC194402);
        f46582 = new EnumC15204("PRIVATE", 114, Integer.valueOf(UMErrorCode.E_UM_BE_NOT_MAINPROCESS), "PRIVATE", "private", EnumSet.of(enumC215569), enumC194402);
        f46606 = new EnumC15204("PUBLIC", 115, Integer.valueOf(UMErrorCode.E_UM_BE_EMPTY_URL_PATH), "PUBLIC", "public", EnumSet.of(enumC215569), enumC194402);
        f46461 = new EnumC15204("PROTECTED", 116, 122, "PROTECTED", "protected", EnumSet.of(enumC215569), enumC194402);
        f46621 = new EnumC15204("CONST", BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 123, "CONST", "const", EnumSet.of(enumC2155610), enumC194402);
        f46592 = new EnumC15204("STATIC", 118, 124, "STATIC", "static", EnumSet.of(enumC215569), enumC194402);
        f46446 = new EnumC15204("TRANSIENT", 119, Integer.valueOf(q.h), "TRANSIENT", "transient", EnumSet.of(enumC215569, enumC215562, enumC215563), enumC194402);
        f46580 = new EnumC15204("SYNCHRONIZED", UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 126, "SYNCHRONIZED", MessageHandler.Properties.IsSynchronized, EnumSet.of(enumC215569), enumC194402);
        f46577 = new EnumC15204("NATIVE", UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 127, "NATIVE", UMConfigure.WRAPER_TYPE_NATIVE, EnumSet.of(enumC215569), enumC194402);
        f46648 = new EnumC15204("FINAL", 122, 128, "FINAL", "final", EnumSet.of(enumC215569), enumC194402);
        f46562 = new EnumC15204("VOLATILE", 123, 129, "VOLATILE", "volatile", EnumSet.of(enumC215569), enumC194402);
        f46525 = new EnumC15204("ABSTRACT", 124, 130, "ABSTRACT", "abstract", EnumSet.of(enumC215569), enumC194402);
        f46509 = new EnumC15204("TRANSITIVE", q.h, 131, "TRANSITIVE", "transitive", EnumSet.of(enumC215569, enumC215562), enumC194402);
        f46454 = new EnumC15204("OPEN", 126, 132, "OPEN", "open", EnumSet.of(enumC215569, enumC215562), enumC194402);
        EnumC21556 enumC2155612 = EnumC21556.PUNCTUATION;
        f46438 = new EnumC15204("AT_SIGN", 127, 133, "AT", "@", EnumSet.of(enumC2155612), enumC19440);
        f46479 = new EnumC15204("SEMICOLON", 128, 134, "SEMICOLON", l.b, EnumSet.of(enumC2155612), enumC19440);
        f46597 = new EnumC15204("COLON", 129, 135, "COLON", ":", EnumSet.of(enumC2155612), enumC19440);
        f46612 = new EnumC15204("QUESTIONMARK", 130, 136, "QUESTIONMARK", "?", EnumSet.of(enumC2155612));
        f46642 = new EnumC15204("LBRACE", 131, 137, "LBRACE", "{", EnumSet.of(enumC2155612), enumC19440);
        f46442 = new EnumC15204("RBRACE", 132, 138, "RBRACE", l.d, EnumSet.of(enumC2155612), enumC19440);
        f46524 = new EnumC15204("LPAREN", 133, 139, "LPAREN", MotionUtils.EASING_TYPE_FORMAT_START, EnumSet.of(enumC2155612));
        f46630 = new EnumC15204("RPAREN", 134, 140, "RPAREN", MotionUtils.EASING_TYPE_FORMAT_END, EnumSet.of(enumC2155612));
        f46583 = new EnumC15204("LSQBRACKET", 135, 141, "LSQBRACKET", "[", EnumSet.of(enumC2155612));
        f46618 = new EnumC15204("RSQBRACKET", 136, 142, "RSQBRACKET", "]", EnumSet.of(enumC2155612));
        f46640 = new EnumC15204("ESCAPED_COLON", 137, 201, "ESCCOLON", "\\:", EnumSet.of(enumC2155612));
        f46489 = new EnumC15204("ESCAPED_ATSIGH", 138, 202, "ESCATSIGH", "\\@", EnumSet.of(enumC2155612));
        f46541 = new EnumC15204("ESCAPED_BACKSLASH", 139, 203, "ESCBACKSLASH", "\\\\", EnumSet.of(enumC2155612));
        f46527 = new EnumC15204("ERROR", 140, 145, "ERROR", d.O, EnumSet.of(enumC215569, enumC215562, enumC215563));
        f46567 = new EnumC15204("COMMENT", 141, 146, "COMMENT", "comment", EnumSet.of(enumC215569, enumC215562, enumC215563));
        f46634 = new EnumC15204("TYPE", 142, 147, "TYPE", "type", EnumSet.of(enumC215569, enumC215562, enumC215563));
        f46504 = new EnumC15204("LENGTH", 143, 148, "LENGTH", "Length", Name.LENGTH, EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46478 = new EnumC15204("INLINERETURN", 144, 149, "INLINERETURN", "inline-return", EnumSet.of(enumC215569));
        f46635 = new EnumC15204("INLINEMETHOD", 145, 150, "INLINEMETHOD", "inline-method", EnumSet.of(enumC215569));
        f46617 = new EnumC15204("INLINENEWINSTANCE", 146, 151, "INLINENEWINSTANCE", "inline-new", EnumSet.of(enumC215569));
        f46613 = new EnumC15204("METHODREF", 147, 152, "METHODREF", "Method", "Methodref", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46593 = new EnumC15204("FIELDREF", 148, 153, "FIELD", "Field", "Fieldref", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46564 = new EnumC15204("STACK", 149, Integer.valueOf(EnumC17734.f54268), "STACK", "stack", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46601 = new EnumC15204("LOCAL", 150, 155, "LOCAL", "locals", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46579 = new EnumC15204("CPINDEX", 151, 156, "CPINDEX", "CPINDEX", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563));
        f46458 = new EnumC15204("CPNAME", 152, 157, "CPNAME", "CPName", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563));
        f46551 = new EnumC15204("SIGN", 153, 158, "SIGN", "SIGN", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563));
        f46572 = new EnumC15204("BITS", EnumC17734.f54268, 159, "BITS", "bits", EnumSet.of(enumC21556, enumC215566, enumC215562, enumC215563), enumC194402);
        f46629 = new EnumC15204("INF", 155, Integer.valueOf(DHParameters.DEFAULT_MINIMUM_LENGTH), "INF", "Inf", "Infinity", EnumSet.of(enumC21556, enumC215562, enumC215563), enumC194402);
        f46512 = new EnumC15204("NAN", 156, 161, "NAN", "NaN", EnumSet.of(enumC21556, enumC215566, enumC215562, enumC215563), enumC194402);
        f46466 = new EnumC15204("INNERCLASS", 157, 162, "INNERCLASS", "InnerClass", "InnerClasses", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46565 = new EnumC15204("OF", 158, 163, "OF", "of", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46459 = new EnumC15204("SYNTHETIC", 159, 164, "SYNTHETIC", "synthetic", EnumSet.of(enumC215569, enumC215566, enumC215562), enumC194402);
        f46568 = new EnumC15204("STRICT", DHParameters.DEFAULT_MINIMUM_LENGTH, 165, "STRICT", "strict", EnumSet.of(enumC215569, enumC215566, enumC215562, enumC215563), enumC194402);
        f46439 = new EnumC15204("DEPRECATED", 161, 166, "DEPRECATED", "deprecated", EnumSet.of(enumC215569, enumC215566, enumC215562), enumC194402);
        f46542 = new EnumC15204("VERSION", 162, 167, "VERSION", "version", EnumSet.of(enumC2155610, enumC215566, enumC215562), enumC194402);
        f46443 = new EnumC15204("MODULE", 163, 168, "MODULE", am.e, EnumSet.of(enumC2155610, enumC215562), enumC194402);
        f46559 = new EnumC15204("ANNOTATION", 164, 169, "ANNOTATION", "@", EnumSet.of(enumC21556));
        f46594 = new EnumC15204("PARAM_NAME", 165, 170, "PARAM_NAME", "#", EnumSet.of(enumC21556));
        f46528 = new EnumC15204("VARARGS", 166, 171, "VARARGS", "varargs", EnumSet.of(enumC215569, enumC215562, enumC215563), enumC194402);
        f46553 = new EnumC15204("BRIDGE", 167, 172, "BRIDGE", "bridge", EnumSet.of(enumC215569, enumC215562, enumC215563), enumC194402);
        f46475 = new EnumC15204("BOOTSTRAPMETHOD", 168, 173, "BOOTSTRAPMETHOD", "BootstrapMethod", "BootstrapMethods", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46619 = new EnumC15204("NESTHOST", 169, 174, "NESTHOST", "NestHost", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46530 = new EnumC15204("SIGNATURE", 170, Integer.valueOf(HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS), "SIGNATURE", "Signature", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46480 = new EnumC15204("NESTMEMBERS", 171, Integer.valueOf(PicnicEngine.MAX_AUX_BYTES), "NESTMEMBERS", "NestMembers", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46485 = new EnumC15204("RECORD", 172, 177, "RECORD", "Record", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46646 = new EnumC15204("COMPONENT", 173, 178, "COMPONENT", "Component", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46570 = new EnumC15204("PERMITTEDSUBCLASSES", 174, 179, "PERMITTEDSUBCLASSES", "PermittedSubclasses", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46643 = new EnumC15204("SOURCEFILE", HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, 180, "SOURCEFILE", "SourceFile", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46615 = new EnumC15204("ENCLOSINGMETHOD", PicnicEngine.MAX_AUX_BYTES, 181, "ENCLOSINGMETHOD", "EnclosingMethod", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46544 = new EnumC15204("SOURCEDEBUGEXTENSION", 177, 182, "SOURCEDEBUGEXTENSION", "SourceDebugExtension", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46511 = new EnumC15204("REQUIRES", 178, 183, "REQUIRES", "requires", EnumSet.of(enumC2155610, enumC215566, enumC215562), enumC194402);
        f46561 = new EnumC15204("EXPORTS", 179, 184, "EXPORTS", "exports", EnumSet.of(enumC2155610, enumC215566, enumC215562), enumC194402);
        f46483 = new EnumC15204("TO", 180, 185, "TO", "to", EnumSet.of(enumC2155610, enumC215566, enumC215562), enumC194402);
        f46555 = new EnumC15204("USES", 181, 186, "USES", "uses", EnumSet.of(enumC2155610, enumC215566, enumC215562), enumC194402);
        f46473 = new EnumC15204("PROVIDES", 182, 187, "PROVIDES", "provides", EnumSet.of(enumC2155610, enumC215566, enumC215562), enumC194402);
        f46538 = new EnumC15204("WITH", 183, 188, "WITH", "with", EnumSet.of(enumC2155610, enumC215566, enumC215562), enumC194402);
        f46536 = new EnumC15204("OPENS", 184, 189, "OPENS", "opens", EnumSet.of(enumC2155610, enumC215566, enumC215562), enumC194402);
        EnumC10679 enumC10679 = EnumC10679.ARRAY;
        String m26808 = enumC10679.m26808();
        String m268082 = enumC10679.m26808();
        EnumC21556 enumC2155613 = EnumC21556.TYPE_PATH_KIND;
        f46596 = new EnumC15204("ARRAY_TYPEPATH", 185, 190, m26808, m268082, EnumSet.of(enumC2155613, enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        EnumC10679 enumC106792 = EnumC10679.INNER_TYPE;
        f46556 = new EnumC15204("INNER_TYPE_TYPEPATH", 186, 191, enumC106792.m26808(), enumC106792.m26808(), EnumSet.of(enumC2155613, enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        EnumC10679 enumC106793 = EnumC10679.WILDCARD;
        f46456 = new EnumC15204("WILDCARD_TYPEPATH", 187, 192, enumC106793.m26808(), enumC106793.m26808(), EnumSet.of(enumC2155613, enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        EnumC10679 enumC106794 = EnumC10679.TYPE_ARGUMENT;
        f46616 = new EnumC15204("TYPE_ARGUMENT_TYPEPATH", 188, 193, enumC106794.m26808(), enumC106794.m26808(), EnumSet.of(enumC2155613, enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46589 = new EnumC15204("LOADABLEDESCRIPTORS", 189, 203, "LOADABLEDESCRIPTORS", "LoadableDescriptors", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46452 = new EnumC15204("STACKMAPTABLE_HEADER", 190, 208, "STACKMAPTABLE", "StackMapTable", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46534 = new EnumC15204("STACKMAP_HEADER", 191, 209, "STACKMAP", "StackMap", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46537 = new EnumC15204("LINETABLE_HEADER", 192, 210, "LINETABLE", "LineTable", "LineNumberTable", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46571 = new EnumC15204("LOCALVARIABLES_HEADER", 193, Integer.valueOf(Primes.SMALL_FACTOR_LIMIT), "LOCALVARIABLES", "LocalVariables", "LocalVariableTable", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46650 = new EnumC15204("LOCALVARIABLETYPES_HEADER", 194, 212, "LOCALVARIABLETYPES", "LocalVariableTypes", "LocalVariableTypeTable", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46455 = new EnumC15204("LINE", 195, 214, "LINE", "line", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46586 = new EnumC15204("START", 196, 215, "START", "Start", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46492 = new EnumC15204("SLOT", 197, 216, "SLOT", "Slot", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46449 = new EnumC15204("NAME", 198, Integer.valueOf(IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION), "NAME", "Name", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46482 = new EnumC15204("DESCRIPTOR", 199, 218, "DESCRIPTOR", "Descriptor", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46644 = new EnumC15204("NUMBEROFENTRIES", 200, 219, "NUMBEROFENTRIES", "number_of_entries", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46581 = new EnumC15204("FRAMETYPE", 201, 220, "FRAMETYPE", "frame_type", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46476 = new EnumC15204("ENTRYTYPE", 202, 221, "ENTRYTYPE", "entry_type", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46506 = new EnumC15204("OFFSETDELTA", 203, 222, "OFFSETDELTA", "offset_delta", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46526 = new EnumC15204("BYTECODEOFFSET", 204, 223, "BYTECODEOFFSET", "offset", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46505 = new EnumC15204("STACKMAP", 205, Integer.valueOf(BERTags.FLAGS), "STACKMAP", "stack_map", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46595 = new EnumC15204("LOCALSMAP", 206, Integer.valueOf(HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS), "LOCALSMAP", "locals_map", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46477 = new EnumC15204("UNSETFIELDS", 207, 226, "UNSETFIELDS", "unset_fields", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46450 = new EnumC15204("ARGUMENTS", 208, 227, "ARGUMENTS", "Arguments", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46441 = new EnumC15204("IDENTITY", 209, 228, "IDENTITY", "identity", EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46549 = new EnumC15204("VALUE", 210, 229, "VALUE", b.d, EnumSet.of(enumC2155610, enumC215566, enumC215562, enumC215563), enumC194402);
        f46546 = m35958();
        f46539 = EnumSet.allOf(EnumC15204.class);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16646 m35948(final String str, final EnumC19440 enumC19440) {
        return C5378.stream(f46539).filter(new Predicate() { // from class: l.֨ۨۚ
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

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m35956;
                m35956 = EnumC15204.m35956(EnumC19440.this, (EnumC15204) obj);
                return m35956;
            }
        }).filter(new Predicate() { // from class: l.۠ۨۚ
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

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m35953;
                m35953 = EnumC15204.m35953(str, (EnumC15204) obj);
                return m35953;
            }
        }).findFirst();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m35956(EnumC19440 enumC19440, EnumC15204 enumC15204) {
        return enumC15204.f46656 == enumC19440;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m35953(String str, EnumC15204 enumC15204) {
        if (enumC15204.f46654.equals(str)) {
            return true;
        }
        String str2 = enumC15204.f46655;
        return str2 != null && str2.equals(str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Set m35952(final EnumC21556 enumC21556) {
        return (Set) C5378.stream(f46539).filter(new Predicate() { // from class: l.֡ۨۚ
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

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m35955;
                m35955 = EnumC15204.m35955(EnumC21556.this, (EnumC15204) obj);
                return m35955;
            }
        }).collect(C22976.toSet());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m35955(EnumC21556 enumC21556, EnumC15204 enumC15204) {
        return enumC15204.f46651.contains(enumC21556);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Set m35947(final EnumC19440 enumC19440) {
        return (Set) C5378.stream(f46539).filter(new Predicate() { // from class: l.ۚۨۚ
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

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean m35957;
                m35957 = EnumC15204.m35957(EnumC19440.this, (EnumC15204) obj);
                return m35957;
            }
        }).collect(C22976.toSet());
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m35957(EnumC19440 enumC19440, EnumC15204 enumC15204) {
        return enumC15204.f46656.equals(enumC19440);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m35961(EnumC15204... enumC15204Arr) {
        return enumC15204Arr != null && Arrays.asList(enumC15204Arr).contains(this);
    }

    public EnumC15204(String str, int i, Integer num, String str2, String str3, EnumSet enumSet) {
        this(str, i, num, str2, str3, null, enumSet, EnumC19440.TOKEN);
    }

    public EnumC15204(String str, int i, Integer num, String str2, String str3, EnumSet enumSet, EnumC19440 enumC19440) {
        this(str, i, num, str2, str3, null, enumSet, enumC19440);
    }

    public EnumC15204(String str, int i, Integer num, String str2, String str3, String str4, EnumSet enumSet, EnumC19440 enumC19440) {
        this.f46653 = num;
        this.f46652 = str2;
        this.f46654 = str3;
        this.f46651 = enumSet;
        this.f46656 = enumC19440;
        this.f46655 = str4;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String m35962() {
        return this.f46652;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String m35967() {
        return this.f46654;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m35959() {
        return this.f46655;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m35960(EnumC21556 enumC21556) {
        return this.f46651.contains(enumC21556);
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int m35965() {
        return this.f46653.intValue();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean m35966() {
        return this.f46651.contains(EnumC21556.JASM_IDENT);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean m35968() {
        return this.f46651.contains(EnumC21556.MODULE_NAME);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m35964() {
        return this.f46651.contains(EnumC21556.CLASS_NAME);
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean m35963() {
        return this.f46651.contains(EnumC21556.TYPE_PATH_KIND);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "<" + this.f46652 + "> [" + this.f46653 + "]";
    }
}

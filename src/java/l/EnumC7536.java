package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.o;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.bouncycastle.pqc.crypto.newhope.Params;
import org.bouncycastle.pqc.crypto.sphincs.Horst;

/* compiled from: 11N5 */
/* renamed from: l.۟ܳ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum EnumC7536 {
    COMMON,
    LATIN,
    GREEK,
    CYRILLIC,
    ARMENIAN,
    HEBREW,
    ARABIC,
    SYRIAC,
    THAANA,
    DEVANAGARI,
    BENGALI,
    GURMUKHI,
    GUJARATI,
    ORIYA,
    TAMIL,
    TELUGU,
    KANNADA,
    MALAYALAM,
    SINHALA,
    THAI,
    LAO,
    TIBETAN,
    MYANMAR,
    GEORGIAN,
    HANGUL,
    ETHIOPIC,
    CHEROKEE,
    CANADIAN_ABORIGINAL,
    OGHAM,
    RUNIC,
    KHMER,
    MONGOLIAN,
    HIRAGANA,
    KATAKANA,
    BOPOMOFO,
    HAN,
    YI,
    OLD_ITALIC,
    GOTHIC,
    DESERET,
    INHERITED,
    TAGALOG,
    HANUNOO,
    BUHID,
    TAGBANWA,
    LIMBU,
    TAI_LE,
    LINEAR_B,
    UGARITIC,
    SHAVIAN,
    OSMANYA,
    CYPRIOT,
    BRAILLE,
    BUGINESE,
    COPTIC,
    NEW_TAI_LUE,
    GLAGOLITIC,
    TIFINAGH,
    SYLOTI_NAGRI,
    OLD_PERSIAN,
    KHAROSHTHI,
    BALINESE,
    CUNEIFORM,
    PHOENICIAN,
    PHAGS_PA,
    NKO,
    SUNDANESE,
    BATAK,
    LEPCHA,
    OL_CHIKI,
    VAI,
    SAURASHTRA,
    KAYAH_LI,
    REJANG,
    LYCIAN,
    CARIAN,
    LYDIAN,
    CHAM,
    TAI_THAM,
    TAI_VIET,
    AVESTAN,
    EGYPTIAN_HIEROGLYPHS,
    SAMARITAN,
    MANDAIC,
    LISU,
    BAMUM,
    JAVANESE,
    MEETEI_MAYEK,
    IMPERIAL_ARAMAIC,
    OLD_SOUTH_ARABIAN,
    INSCRIPTIONAL_PARTHIAN,
    INSCRIPTIONAL_PAHLAVI,
    OLD_TURKIC,
    BRAHMI,
    KAITHI,
    MEROITIC_HIEROGLYPHS,
    MEROITIC_CURSIVE,
    SORA_SOMPENG,
    CHAKMA,
    SHARADA,
    TAKRI,
    MIAO,
    UNKNOWN;


    /* renamed from: ۗܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC7536[] f23197;

    /* renamed from: ۙܽ, reason: not valid java name and contains not printable characters */
    public static final int[] f23204;

    /* renamed from: ᩶ܽ, reason: not valid java name and contains not printable characters */
    public static HashMap f23271;

    static {
        EnumC7536 enumC7536 = COMMON;
        EnumC7536 enumC75362 = LATIN;
        EnumC7536 enumC75363 = GREEK;
        EnumC7536 enumC75364 = CYRILLIC;
        EnumC7536 enumC75365 = ARMENIAN;
        EnumC7536 enumC75366 = HEBREW;
        EnumC7536 enumC75367 = ARABIC;
        EnumC7536 enumC75368 = SYRIAC;
        EnumC7536 enumC75369 = THAANA;
        EnumC7536 enumC753610 = DEVANAGARI;
        EnumC7536 enumC753611 = BENGALI;
        EnumC7536 enumC753612 = GURMUKHI;
        EnumC7536 enumC753613 = GUJARATI;
        EnumC7536 enumC753614 = ORIYA;
        EnumC7536 enumC753615 = TAMIL;
        EnumC7536 enumC753616 = TELUGU;
        EnumC7536 enumC753617 = KANNADA;
        EnumC7536 enumC753618 = MALAYALAM;
        EnumC7536 enumC753619 = SINHALA;
        EnumC7536 enumC753620 = THAI;
        EnumC7536 enumC753621 = LAO;
        EnumC7536 enumC753622 = TIBETAN;
        EnumC7536 enumC753623 = MYANMAR;
        EnumC7536 enumC753624 = GEORGIAN;
        EnumC7536 enumC753625 = HANGUL;
        EnumC7536 enumC753626 = ETHIOPIC;
        EnumC7536 enumC753627 = CHEROKEE;
        EnumC7536 enumC753628 = CANADIAN_ABORIGINAL;
        EnumC7536 enumC753629 = OGHAM;
        EnumC7536 enumC753630 = RUNIC;
        EnumC7536 enumC753631 = KHMER;
        EnumC7536 enumC753632 = MONGOLIAN;
        EnumC7536 enumC753633 = HIRAGANA;
        EnumC7536 enumC753634 = KATAKANA;
        EnumC7536 enumC753635 = BOPOMOFO;
        EnumC7536 enumC753636 = HAN;
        EnumC7536 enumC753637 = YI;
        EnumC7536 enumC753638 = OLD_ITALIC;
        EnumC7536 enumC753639 = GOTHIC;
        EnumC7536 enumC753640 = DESERET;
        EnumC7536 enumC753641 = INHERITED;
        EnumC7536 enumC753642 = TAGALOG;
        EnumC7536 enumC753643 = HANUNOO;
        EnumC7536 enumC753644 = BUHID;
        EnumC7536 enumC753645 = TAGBANWA;
        EnumC7536 enumC753646 = LIMBU;
        EnumC7536 enumC753647 = TAI_LE;
        EnumC7536 enumC753648 = LINEAR_B;
        EnumC7536 enumC753649 = UGARITIC;
        EnumC7536 enumC753650 = SHAVIAN;
        EnumC7536 enumC753651 = OSMANYA;
        EnumC7536 enumC753652 = CYPRIOT;
        EnumC7536 enumC753653 = BRAILLE;
        EnumC7536 enumC753654 = BUGINESE;
        EnumC7536 enumC753655 = COPTIC;
        EnumC7536 enumC753656 = NEW_TAI_LUE;
        EnumC7536 enumC753657 = GLAGOLITIC;
        EnumC7536 enumC753658 = TIFINAGH;
        EnumC7536 enumC753659 = SYLOTI_NAGRI;
        EnumC7536 enumC753660 = OLD_PERSIAN;
        EnumC7536 enumC753661 = KHAROSHTHI;
        EnumC7536 enumC753662 = BALINESE;
        EnumC7536 enumC753663 = CUNEIFORM;
        EnumC7536 enumC753664 = PHOENICIAN;
        EnumC7536 enumC753665 = PHAGS_PA;
        EnumC7536 enumC753666 = NKO;
        EnumC7536 enumC753667 = SUNDANESE;
        EnumC7536 enumC753668 = BATAK;
        EnumC7536 enumC753669 = LEPCHA;
        EnumC7536 enumC753670 = OL_CHIKI;
        EnumC7536 enumC753671 = VAI;
        EnumC7536 enumC753672 = SAURASHTRA;
        EnumC7536 enumC753673 = KAYAH_LI;
        EnumC7536 enumC753674 = REJANG;
        EnumC7536 enumC753675 = LYCIAN;
        EnumC7536 enumC753676 = CARIAN;
        EnumC7536 enumC753677 = LYDIAN;
        EnumC7536 enumC753678 = CHAM;
        EnumC7536 enumC753679 = TAI_THAM;
        EnumC7536 enumC753680 = TAI_VIET;
        EnumC7536 enumC753681 = AVESTAN;
        EnumC7536 enumC753682 = EGYPTIAN_HIEROGLYPHS;
        EnumC7536 enumC753683 = SAMARITAN;
        EnumC7536 enumC753684 = MANDAIC;
        EnumC7536 enumC753685 = LISU;
        EnumC7536 enumC753686 = BAMUM;
        EnumC7536 enumC753687 = JAVANESE;
        EnumC7536 enumC753688 = MEETEI_MAYEK;
        EnumC7536 enumC753689 = IMPERIAL_ARAMAIC;
        EnumC7536 enumC753690 = OLD_SOUTH_ARABIAN;
        EnumC7536 enumC753691 = INSCRIPTIONAL_PARTHIAN;
        EnumC7536 enumC753692 = INSCRIPTIONAL_PAHLAVI;
        EnumC7536 enumC753693 = OLD_TURKIC;
        EnumC7536 enumC753694 = BRAHMI;
        EnumC7536 enumC753695 = KAITHI;
        EnumC7536 enumC753696 = MEROITIC_HIEROGLYPHS;
        EnumC7536 enumC753697 = MEROITIC_CURSIVE;
        EnumC7536 enumC753698 = SORA_SOMPENG;
        EnumC7536 enumC753699 = CHAKMA;
        EnumC7536 enumC7536100 = SHARADA;
        EnumC7536 enumC7536101 = TAKRI;
        EnumC7536 enumC7536102 = MIAO;
        EnumC7536 enumC7536103 = UNKNOWN;
        f23204 = new int[]{0, 65, 91, 97, 123, 170, 171, 186, 187, 192, 215, 216, 247, 248, 697, 736, 741, 746, 748, 768, 880, 884, 885, 894, EnumC3478.f11019, 901, 902, 903, 904, 994, 1008, 1024, 1157, 1159, 1329, 1417, 1418, 1425, 1536, 1548, 1549, 1563, 1566, 1567, 1568, 1600, 1601, 1611, 1622, 1632, 1642, 1648, 1649, 1757, 1758, Params.POLY_BYTES, 1872, 1920, 1984, 2048, 2112, 2208, 2304, 2385, 2387, 2404, 2406, 2433, 2561, 2689, 2817, 2946, 3073, 3202, 3330, 3458, 3585, 3647, 3648, 3713, 3840, 4053, 4057, 4096, 4256, 4347, 4348, o.a.k, 4608, 5024, 5120, 5760, 5792, 5867, 5870, 5888, 5920, 5941, 5952, 5984, 6016, 6144, 6146, 6148, 6149, 6150, 6320, 6400, 6480, 6528, 6624, 6656, 6688, 6912, 7040, 7104, 7168, 7248, 7360, 7376, 7379, 7380, 7393, 7394, 7401, 7405, 7406, 7412, 7413, 7424, 7462, 7467, 7468, 7517, 7522, 7526, 7531, 7544, 7545, 7615, 7616, 7680, 7936, 8192, 8204, 8206, 8305, 8308, 8319, 8320, 8336, 8352, 8400, 8448, 8486, 8487, 8490, 8492, 8498, 8499, 8526, 8527, 8544, 8585, 10240, 10496, 11264, 11360, 11392, 11520, 11568, 11648, 11744, 11776, 11904, 12272, 12293, 12294, 12295, 12296, 12321, 12330, 12334, 12336, 12344, 12348, 12353, 12441, 12443, 12445, 12448, 12449, 12539, 12541, 12549, 12593, 12688, 12704, 12736, 12784, 12800, 12832, 12896, 12927, 13008, 13144, Horst.HORST_SIGBYTES, 19904, 19968, 40960, 42192, 42240, 42560, 42656, 42752, 42786, 42888, 42891, 43008, 43056, 43072, 43136, 43232, 43264, 43312, 43360, 43392, 43520, 43616, 43648, 43744, 43777, 43968, 44032, 55292, 63744, 64256, 64275, 64285, 64336, 64830, 64848, 65021, 65024, 65040, 65056, 65072, 65136, 65279, 65313, 65339, 65345, 65371, 65382, 65392, 65393, 65438, 65440, 65504, 65536, 65792, 65856, 65936, 66045, 66176, 66208, 66304, 66352, 66432, 66464, 66560, 66640, 66688, 67584, 67648, 67840, 67872, 67968, 68000, 68096, 68192, 68352, 68416, 68448, 68608, 69216, 69632, 69760, 69840, 69888, 70016, 71296, 73728, 77824, 92160, 93952, 110592, 110593, 118784, 119143, 119146, 119163, 119171, 119173, 119180, 119210, 119214, 119296, 119552, 126464, 126976, 127488, 127489, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT, 917505, 917760, 918000};
        f23197 = new EnumC7536[]{enumC7536, enumC75362, enumC7536, enumC75362, enumC7536, enumC75362, enumC7536, enumC75362, enumC7536, enumC75362, enumC7536, enumC75362, enumC7536, enumC75362, enumC7536, enumC75362, enumC7536, enumC753635, enumC7536, enumC753641, enumC75363, enumC7536, enumC75363, enumC7536, enumC75363, enumC7536, enumC75363, enumC7536, enumC75363, enumC753655, enumC75363, enumC75364, enumC753641, enumC75364, enumC75365, enumC7536, enumC75365, enumC75366, enumC75367, enumC7536, enumC75367, enumC7536, enumC75367, enumC7536, enumC75367, enumC7536, enumC75367, enumC753641, enumC75367, enumC7536, enumC75367, enumC753641, enumC75367, enumC7536, enumC75367, enumC75368, enumC75367, enumC75369, enumC753666, enumC753683, enumC753684, enumC75367, enumC753610, enumC753641, enumC753610, enumC7536, enumC753610, enumC753611, enumC753612, enumC753613, enumC753614, enumC753615, enumC753616, enumC753617, enumC753618, enumC753619, enumC753620, enumC7536, enumC753620, enumC753621, enumC753622, enumC7536, enumC753622, enumC753623, enumC753624, enumC7536, enumC753624, enumC753625, enumC753626, enumC753627, enumC753628, enumC753629, enumC753630, enumC7536, enumC753630, enumC753642, enumC753643, enumC7536, enumC753644, enumC753645, enumC753631, enumC753632, enumC7536, enumC753632, enumC7536, enumC753632, enumC753628, enumC753646, enumC753647, enumC753656, enumC753631, enumC753654, enumC753679, enumC753662, enumC753667, enumC753668, enumC753669, enumC753670, enumC753667, enumC753641, enumC7536, enumC753641, enumC7536, enumC753641, enumC7536, enumC753641, enumC7536, enumC753641, enumC7536, enumC75362, enumC75363, enumC75364, enumC75362, enumC75363, enumC75362, enumC75363, enumC75362, enumC75364, enumC75362, enumC75363, enumC753641, enumC75362, enumC75363, enumC7536, enumC753641, enumC7536, enumC75362, enumC7536, enumC75362, enumC7536, enumC75362, enumC7536, enumC753641, enumC7536, enumC75363, enumC7536, enumC75362, enumC7536, enumC75362, enumC7536, enumC75362, enumC7536, enumC75362, enumC7536, enumC753653, enumC7536, enumC753657, enumC75362, enumC753655, enumC753624, enumC753658, enumC753626, enumC75364, enumC7536, enumC753636, enumC7536, enumC753636, enumC7536, enumC753636, enumC7536, enumC753636, enumC753641, enumC753625, enumC7536, enumC753636, enumC7536, enumC753633, enumC753641, enumC7536, enumC753633, enumC7536, enumC753634, enumC7536, enumC753634, enumC753635, enumC753625, enumC7536, enumC753635, enumC7536, enumC753634, enumC753625, enumC7536, enumC753625, enumC7536, enumC753634, enumC7536, enumC753636, enumC7536, enumC753636, enumC753637, enumC753685, enumC753671, enumC75364, enumC753686, enumC7536, enumC75362, enumC7536, enumC75362, enumC753659, enumC7536, enumC753665, enumC753672, enumC753610, enumC753673, enumC753674, enumC753625, enumC753687, enumC753678, enumC753623, enumC753680, enumC753688, enumC753626, enumC753688, enumC753625, enumC7536103, enumC753636, enumC75362, enumC75365, enumC75366, enumC75367, enumC7536, enumC75367, enumC7536, enumC753641, enumC7536, enumC753641, enumC7536, enumC75367, enumC7536, enumC75362, enumC7536, enumC75362, enumC7536, enumC753634, enumC7536, enumC753634, enumC7536, enumC753625, enumC7536, enumC753648, enumC7536, enumC75363, enumC7536, enumC753641, enumC753675, enumC753676, enumC753638, enumC753639, enumC753649, enumC753660, enumC753640, enumC753650, enumC753651, enumC753652, enumC753689, enumC753664, enumC753677, enumC753696, enumC753697, enumC753661, enumC753690, enumC753681, enumC753691, enumC753692, enumC753693, enumC75367, enumC753694, enumC753695, enumC753698, enumC753699, enumC7536100, enumC7536101, enumC753663, enumC753682, enumC753686, enumC7536102, enumC753634, enumC753633, enumC7536, enumC753641, enumC7536, enumC753641, enumC7536, enumC753641, enumC7536, enumC753641, enumC7536, enumC75363, enumC7536, enumC75367, enumC7536, enumC753633, enumC7536, enumC753636, enumC7536, enumC753641, enumC7536103};
        HashMap hashMap = new HashMap(128);
        f23271 = hashMap;
        hashMap.put("ARAB", enumC75367);
        f23271.put("ARMI", enumC753689);
        f23271.put("ARMN", enumC75365);
        f23271.put("AVST", enumC753681);
        f23271.put("BALI", enumC753662);
        f23271.put("BAMU", enumC753686);
        f23271.put("BATK", enumC753668);
        f23271.put("BENG", enumC753611);
        f23271.put("BOPO", enumC753635);
        f23271.put("BRAI", enumC753653);
        f23271.put("BRAH", enumC753694);
        f23271.put("BUGI", enumC753654);
        f23271.put("BUHD", enumC753644);
        f23271.put("CAKM", enumC753699);
        f23271.put("CANS", enumC753628);
        f23271.put("CARI", enumC753676);
        f23271.put("CHAM", enumC753678);
        f23271.put("CHER", enumC753627);
        f23271.put("COPT", enumC753655);
        f23271.put("CPRT", enumC753652);
        f23271.put("CYRL", enumC75364);
        f23271.put("DEVA", enumC753610);
        f23271.put("DSRT", enumC753640);
        f23271.put("EGYP", enumC753682);
        f23271.put("ETHI", enumC753626);
        f23271.put("GEOR", enumC753624);
        f23271.put("GLAG", enumC753657);
        f23271.put("GOTH", enumC753639);
        f23271.put("GREK", enumC75363);
        f23271.put("GUJR", enumC753613);
        f23271.put("GURU", enumC753612);
        f23271.put("HANG", enumC753625);
        f23271.put("HANI", enumC753636);
        f23271.put("HANO", enumC753643);
        f23271.put("HEBR", enumC75366);
        f23271.put("HIRA", enumC753633);
        f23271.put("ITAL", enumC753638);
        f23271.put("JAVA", enumC753687);
        f23271.put("KALI", enumC753673);
        f23271.put("KANA", enumC753634);
        f23271.put("KHAR", enumC753661);
        f23271.put("KHMR", enumC753631);
        f23271.put("KNDA", enumC753617);
        f23271.put("KTHI", enumC753695);
        f23271.put("LANA", enumC753679);
        f23271.put("LAOO", enumC753621);
        f23271.put("LATN", enumC75362);
        f23271.put("LEPC", enumC753669);
        f23271.put("LIMB", enumC753646);
        f23271.put("LINB", enumC753648);
        f23271.put("LISU", enumC753685);
        f23271.put("LYCI", enumC753675);
        f23271.put("LYDI", enumC753677);
        f23271.put("MAND", enumC753684);
        f23271.put("MERC", enumC753697);
        f23271.put("MERO", enumC753696);
        f23271.put("MLYM", enumC753618);
        f23271.put("MONG", enumC753632);
        f23271.put("MTEI", enumC753688);
        f23271.put("MYMR", enumC753623);
        f23271.put("NKOO", enumC753666);
        f23271.put("OGAM", enumC753629);
        f23271.put("OLCK", enumC753670);
        f23271.put("ORKH", enumC753693);
        f23271.put("ORYA", enumC753614);
        f23271.put("OSMA", enumC753651);
        f23271.put("PHAG", enumC753665);
        f23271.put("PLRD", enumC7536102);
        f23271.put("PHLI", enumC753692);
        f23271.put("PHNX", enumC753664);
        f23271.put("PRTI", enumC753691);
        f23271.put("RJNG", enumC753674);
        f23271.put("RUNR", enumC753630);
        f23271.put("SAMR", enumC753683);
        f23271.put("SARB", enumC753690);
        f23271.put("SAUR", enumC753672);
        f23271.put("SHAW", enumC753650);
        f23271.put("SHRD", enumC7536100);
        f23271.put("SINH", enumC753619);
        f23271.put("SORA", enumC753698);
        f23271.put("SUND", enumC753667);
        f23271.put("SYLO", enumC753659);
        f23271.put("SYRC", enumC75368);
        f23271.put("TAGB", enumC753645);
        f23271.put("TALE", enumC753647);
        f23271.put("TAKR", enumC7536101);
        f23271.put("TALU", enumC753656);
        f23271.put("TAML", enumC753615);
        f23271.put("TAVT", enumC753680);
        f23271.put("TELU", enumC753616);
        f23271.put("TFNG", enumC753658);
        f23271.put("TGLG", enumC753642);
        f23271.put("THAA", enumC75369);
        f23271.put("THAI", enumC753620);
        f23271.put("TIBT", enumC753622);
        f23271.put("UGAR", enumC753649);
        f23271.put("VAII", enumC753671);
        f23271.put("XPEO", enumC753660);
        f23271.put("XSUX", enumC753663);
        f23271.put("YIII", enumC753637);
        f23271.put("ZINH", enumC753641);
        f23271.put("ZYYY", enumC7536);
        f23271.put("ZZZZ", enumC7536103);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC7536 m20220(int i) {
        if (!Character.isValidCodePoint(i)) {
            throw new IllegalArgumentException();
        }
        if (C2164.m7146(i) == 0) {
            return UNKNOWN;
        }
        int binarySearch = Arrays.binarySearch(f23204, i);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return f23197[binarySearch];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC7536 m20221(String str) {
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        EnumC7536 enumC7536 = (EnumC7536) f23271.get(upperCase);
        return enumC7536 != null ? enumC7536 : valueOf(upperCase);
    }
}

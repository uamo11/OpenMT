package l;

import com.alipay.sdk.m.u0.b;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* compiled from: 96Q1 */
/* renamed from: l.֫۫ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1823 extends AbstractC3254 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C21631 f6250;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C5883[] f6252;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C17878 f6251 = new C17878();

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final String[] f6253 = {"document", b.d, "object", "member", "array"};

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C15279 f6255 = new C15279(new String[]{null, null, null, null, null, null, null, null, "'break'", "'case'", "'catch'", "'class'", "'const'", "'continue'", "'debugger'", "'default'", "'delete'", "'do'", "'else'", "'export'", "'extends'", "'finally'", "'for'", "'function'", "'if'", "'import'", "'in'", "'instanceof'", "'new'", "'return'", "'super'", "'switch'", "'this'", "'throw'", "'try'", "'typeof'", "'var'", "'void'", "'while'", "'with'", "'yield'", "'let'", "'static'", "'enum'", "'await'", "'async'", "'of'", "'from'", "'get'", "'set'", "'type'", "'interface'", "'namespace'", "'module'", "'declare'", "'abstract'", "'public'", "'private'", "'protected'", "'readonly'", "'override'", "'accessor'", "'implements'", "'constructor'", "'as'", "'satisfies'", "'asserts'", "'is'", "'keyof'", "'infer'", "'unique'", "'unknown'", "'never'", "'any'", "'number'", "'string'", "'boolean'", "'symbol'", "'object'", "'undefined'", "'global'", "'require'", "'out'", "'using'", "'null'", "'true'", "'false'", "'('", "')'", "'['", "']'", "'{'", "'}'", "';'", "','", "':'", "'...'", "'?.'", "'.'", "'=>'", "'++'", "'--'", "'**='", "'**'", "'&&='", "'||='", "'??='", "'&&'", "'||'", "'??'", "'==='", "'!=='", "'=='", "'!='", "'<='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'+'", "'-'", "'*'", "'/'", "'%'", "'&'", "'|'", "'^'", "'!'", "'~'", "'='", "'?'", "'@'"}, new String[]{null, "Hashbang", "HtmlComment", "LineComment", "BlockComment", "Regex", "StringLiteral", "TemplateStart", "Break", "Case", "Catch", "Class", "Const", "Continue", "Debugger", "Default", "Delete", "Do", "Else", "Export", "Extends", "Finally", "For", "Function", "If", "Import", "In", "Instanceof", "New", "Return", "Super", "Switch", "This", "Throw", "Try", "Typeof", "Var", "Void", "While", "With", "Yield", "Let", "Static", "Enum", "Await", "Async", "Of", "From", "Get", "Set", "Type", "Interface", "Namespace", "Module", "Declare", "Abstract", "Public", "Private", "Protected", "Readonly", "Override", "Accessor", "Implements", "Constructor", "As", "Satisfies", "Asserts", "Is", "Keyof", "Infer", "Unique", "Unknown", "Never", "Any", "Number", "String", "Boolean", "Symbol", "Object", "Undefined", "Global", "Require", "Out", "Using", "Null", "True", "False", "LParen", "RParen", "LBracket", "RBracket", "LBrace", "RBrace", "Semi", "Comma", "Colon", "Ellipsis", "OptionalDot", "Dot", "Arrow", "PlusPlus", "MinusMinus", "PowerAssign", "Power", "AndAssign", "OrAssign", "NullAssign", "And", "Or", "Nullish", "StrictEqual", "StrictNotEqual", "Equal", "NotEqual", "LessEqual", "Less", "Greater", "PlusAssign", "MinusAssign", "MultiplyAssign", "DivideAssign", "ModAssign", "BitAndAssign", "BitOrAssign", "BitXorAssign", "Plus", "Minus", "Multiply", "Divide", "Mod", "BitAnd", "BitOr", "BitXor", "Not", "BitNot", "Assign", "Question", "At", "NumberLiteral", "PrivateIdentifier", "Identifier", "Whitespace", "Unexpected", "TemplateEnd", "TemplateExpression", "TemplateText"}, null);

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    @Deprecated
    public static final String[] f6254 = new String[146];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f6254;
            if (i2 >= strArr.length) {
                break;
            }
            C15279 c15279 = f6255;
            String m36284 = c15279.m36284(i2);
            strArr[i2] = m36284;
            if (m36284 == null) {
                strArr[i2] = c15279.m36285(i2);
            }
            if (strArr[i2] == null) {
                strArr[i2] = "<INVALID>";
            }
            i2++;
        }
        C21631 m17025 = new C6108().m17025("\u0004\u0001\u0091>\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0011\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0018\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u001e\b\u0002\n\u0002\f\u0002!\t\u0002\u0001\u0002\u0003\u0002$\b\u0002\u0003\u0002&\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u00042\b\u0004\n\u0004\f\u00045\t\u0004\u0001\u0004\u0003\u00048\b\u0004\u0003\u0004:\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000E\u0000\n\u0001\u0000\u0000\u0000\u0002\u0017\u0001\u0000\u0000\u0000\u0004\u0019\u0001\u0000\u0000\u0000\u0006)\u0001\u0000\u0000\u0000\b-\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b\f\u0005\u0000\u0000\u0001\f\u0001\u0001\u0000\u0000\u0000\r\u0018\u0003\u0004\u0002\u0000\u000e\u0018\u0003\b\u0004\u0000\u000f\u0011\u0005~\u0000\u0000\u0010\u000f\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0018\u0005\u008a\u0000\u0000\u0013\u0018\u0005\u0006\u0000\u0000\u0014\u0018\u0005U\u0000\u0000\u0015\u0018\u0005V\u0000\u0000\u0016\u0018\u0005T\u0000\u0000\u0017\r\u0001\u0000\u0000\u0000\u0017\u000e\u0001\u0000\u0000\u0000\u0017\u0010\u0001\u0000\u0000\u0000\u0017\u0013\u0001\u0000\u0000\u0000\u0017\u0014\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0003\u0001\u0000\u0000\u0000\u0019%\u0005[\u0000\u0000\u001a\u001f\u0003\u0006\u0003\u0000\u001b\u001c\u0005^\u0000\u0000\u001c\u001e\u0003\u0006\u0003\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"$\u0005^\u0000\u0000#\"\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%\u001a\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&'\u0001\u0000\u0000\u0000'(\u0005\\\u0000\u0000(\u0005\u0001\u0000\u0000\u0000)*\u0005\u0006\u0000\u0000*+\u0005_\u0000\u0000+,\u0003\u0002\u0001\u0000,\u0007\u0001\u0000\u0000\u0000-9\u0005Y\u0000\u0000.3\u0003\u0002\u0001\u0000/0\u0005^\u0000\u000002\u0003\u0002\u0001\u00001/\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000068\u0005^\u0000\u000076\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u00009.\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0005Z\u0000\u0000<\t\u0001\u0000\u0000\u0000\b\u0010\u0017\u001f#%379".toCharArray());
        f6250 = m17025;
        f6252 = new C5883[m17025.f69442.size()];
        while (true) {
            C21631 c21631 = f6250;
            if (i >= c21631.f69442.size()) {
                return;
            }
            f6252[i] = new C5883(c21631.m48892(i), i);
            i++;
        }
    }

    @Override // l.AbstractC18809
    @Deprecated
    /* renamed from: ۜ */
    public final String[] mo1329() {
        return f6254;
    }

    @Override // l.AbstractC18809
    /* renamed from: ᩷ */
    public final C15279 mo1331() {
        return f6255;
    }

    @Override // l.AbstractC18809
    /* renamed from: ܳ */
    public final String[] mo4239() {
        return f6253;
    }

    @Override // l.AbstractC18809
    /* renamed from: ܽ */
    public final C21631 mo1330() {
        return f6250;
    }

    public C1823(C1875 c1875) {
        super(c1875);
        this.f59356 = new C23313(this, f6250, f6252, f6251);
    }

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final void m6048() {
        C11721 c11721 = new C11721(m43462(), this.f29205);
        mo24562((C8931) c11721, 0, 0);
        try {
            m24561(c11721);
            m43459(10);
            m6045();
            m43459(11);
            m24572(-1);
        } catch (C2581 e) {
            this.f29204.m39231(this, e);
            this.f29204.mo26269(this, e);
        } finally {
            mo24571();
        }
    }

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final void m6045() {
        C7487 c7487 = new C7487(m43462(), this.f29205);
        mo24562((C8931) c7487, 2, 1);
        try {
            m43459(23);
            this.f29204.mo26270(this);
            int mo6203 = this.f29208.mo6203(1);
            if (mo6203 == 6) {
                m24561(c7487);
                m43459(19);
                m24572(6);
            } else if (mo6203 == 89) {
                m24561(c7487);
                m43459(14);
                m6046();
            } else if (mo6203 == 91) {
                m24561(c7487);
                m43459(13);
                m6047();
            } else if (mo6203 == 126 || mo6203 == 138) {
                m24561(c7487);
                m43459(16);
                this.f29204.mo26270(this);
                if (this.f29208.mo6203(1) == 126) {
                    m43459(15);
                    m24572(126);
                }
                m43459(18);
                m24572(138);
            } else {
                switch (mo6203) {
                    case 84:
                        m24561(c7487);
                        m43459(22);
                        m24572(84);
                        break;
                    case 85:
                        m24561(c7487);
                        m43459(20);
                        m24572(85);
                        break;
                    case HRSS1373Polynomial.K /* 86 */:
                        m24561(c7487);
                        m43459(21);
                        m24572(86);
                        break;
                    default:
                        throw new C20926(this);
                }
            }
        } catch (C2581 e) {
            this.f29204.m39231(this, e);
            this.f29204.mo26269(this, e);
        } finally {
            mo24571();
        }
    }

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final void m6047() {
        C13836 c13836 = new C13836(m43462(), this.f29205);
        mo24562((C8931) c13836, 4, 2);
        try {
            m24561(c13836);
            m43459(25);
            m24572(91);
            m43459(37);
            this.f29204.mo26270(this);
            if (this.f29208.mo6203(1) == 6) {
                m43459(26);
                m6044();
                m43459(31);
                this.f29204.mo26270(this);
                int mo22933 = ((C23313) m43460()).mo22933(2, this.f29208, this.f29205);
                while (mo22933 != 2 && mo22933 != 0) {
                    if (mo22933 == 1) {
                        m43459(27);
                        m24572(94);
                        m43459(28);
                        m6044();
                    }
                    m43459(33);
                    this.f29204.mo26270(this);
                    mo22933 = ((C23313) m43460()).mo22933(2, this.f29208, this.f29205);
                }
                m43459(35);
                this.f29204.mo26270(this);
                if (this.f29208.mo6203(1) == 94) {
                    m43459(34);
                    m24572(94);
                }
            }
            m43459(39);
            m24572(92);
        } catch (C2581 e) {
            this.f29204.m39231(this, e);
            this.f29204.mo26269(this, e);
        } finally {
            mo24571();
        }
    }

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final void m6044() {
        C23009 c23009 = new C23009(m43462(), this.f29205);
        mo24562((C8931) c23009, 6, 3);
        try {
            m24561(c23009);
            m43459(41);
            m24572(6);
            m43459(42);
            m24572(95);
            m43459(43);
            m6045();
        } catch (C2581 e) {
            this.f29204.m39231(this, e);
            this.f29204.mo26269(this, e);
        } finally {
            mo24571();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
    
        if (((1 << r0) & 18018796555993255L) != 0) goto L9;
     */
    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6046() {
        /*
            r6 = this;
            l.ۛ۬ۢ r0 = new l.ۛ۬ۢ
            l.ۡܳ֡ r1 = r6.f29205
            int r2 = r6.m43462()
            r0.<init>(r2, r1)
            r1 = 8
            r2 = 4
            r6.mo24562(r0, r1, r2)
            r6.m24561(r0)     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            r0 = 45
            r6.m43459(r0)     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            r0 = 89
            r6.m24572(r0)     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            r0 = 57
            r6.m43459(r0)     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            l.ܽܳ֡ r0 = r6.f29204     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            r0.mo26270(r6)     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            l.֫ܳ֡ r0 = r6.f29208     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            r1 = 1
            int r0 = r0.mo6203(r1)     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            r2 = 6
            if (r0 == r2) goto L47
            int r0 = r0 + (-84)
            r2 = r0 & (-64)
            if (r2 != 0) goto Lb4
            r2 = 1
            long r2 = r2 << r0
            r4 = 18018796555993255(0x400400000000a7, double:1.781797425757786E-307)
            long r2 = r2 & r4
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto Lb4
        L47:
            r0 = 46
            r6.m43459(r0)     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            r6.m6045()     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            r0 = 51
            r6.m43459(r0)     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            l.ܽܳ֡ r0 = r6.f29204     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            r0.mo26270(r6)     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            l.ۨܳ֡ r0 = r6.m43460()     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            l.᩺᩻֡ r0 = (l.C23313) r0     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            l.֫ܳ֡ r2 = r6.f29208     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            l.ۡܳ֡ r3 = r6.f29205     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            r4 = 5
            int r0 = r0.mo22933(r4, r2, r3)     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
        L68:
            r2 = 2
            r3 = 94
            if (r0 == r2) goto L9a
            if (r0 == 0) goto L9a
            if (r0 != r1) goto L81
            r0 = 47
            r6.m43459(r0)     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            r6.m24572(r3)     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            r0 = 48
            r6.m43459(r0)     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            r6.m6045()     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
        L81:
            r0 = 53
            r6.m43459(r0)     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            l.ܽܳ֡ r0 = r6.f29204     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            r0.mo26270(r6)     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            l.ۨܳ֡ r0 = r6.m43460()     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            l.᩺᩻֡ r0 = (l.C23313) r0     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            l.֫ܳ֡ r2 = r6.f29208     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            l.ۡܳ֡ r3 = r6.f29205     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            int r0 = r0.mo22933(r4, r2, r3)     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            goto L68
        L9a:
            r0 = 55
            r6.m43459(r0)     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            l.ܽܳ֡ r0 = r6.f29204     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            r0.mo26270(r6)     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            l.֫ܳ֡ r0 = r6.f29208     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            int r0 = r0.mo6203(r1)     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            if (r0 != r3) goto Lb4
            r0 = 54
            r6.m43459(r0)     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            r6.m24572(r3)     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
        Lb4:
            r0 = 59
            r6.m43459(r0)     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            r0 = 90
            r6.m24572(r0)     // Catch: java.lang.Throwable -> Lc2 l.C2581 -> Lc4
            r6.mo24571()
            return
        Lc2:
            r0 = move-exception
            goto Ld3
        Lc4:
            r0 = move-exception
            l.ܽܳ֡ r1 = r6.f29204     // Catch: java.lang.Throwable -> Lc2
            r1.m39231(r6, r0)     // Catch: java.lang.Throwable -> Lc2
            l.ܽܳ֡ r1 = r6.f29204     // Catch: java.lang.Throwable -> Lc2
            r1.mo26269(r6, r0)     // Catch: java.lang.Throwable -> Lc2
            r6.mo24571()
            return
        Ld3:
            r6.mo24571()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1823.m6046():void");
    }
}

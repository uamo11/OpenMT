package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import moe.shizuku.server.IShizukuService;

/* compiled from: H6PC */
/* renamed from: l.۠ܰۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC8213 extends AbstractC23747 {

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Map f25291;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayDeque f25292;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC0463 f25293;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ArrayDeque f25294;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f25295;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f25296;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f25297;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public String f25298;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayDeque f25299;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f25300;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayDeque f25301;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f25302;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f25303;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f25304;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f25305;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayDeque f25306;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC0463 f25307;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f25308;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("f'", 1);
        hashMap.put("rf'", 3);
        C15942.m37720(hashMap, "fr'", 3, 5, "f\"");
        hashMap.put("rf\"", 7);
        hashMap.put("fr\"", 7);
        hashMap.put("f'''", 9);
        hashMap.put("rf'''", 11);
        C15942.m37720(hashMap, "fr'''", 11, 13, "f\"\"\"");
        hashMap.put("rf\"\"\"", 15);
        hashMap.put("fr\"\"\"", 15);
        hashMap.put("t'", 2);
        hashMap.put("rt'", 4);
        C15942.m37720(hashMap, "tr'", 4, 6, "t\"");
        hashMap.put("rt\"", 8);
        hashMap.put("tr\"", 8);
        hashMap.put("t'''", 10);
        hashMap.put("rt'''", 12);
        C15942.m37720(hashMap, "tr'''", 12, 14, "t\"\"\"");
        hashMap.put("rt\"\"\"", 16);
        hashMap.put("tr\"\"\"", 16);
        f25291 = C20195.unmodifiableMap(hashMap);
    }

    public AbstractC8213(InterfaceC23125 interfaceC23125) {
        super(interfaceC23125);
        this.f25298 = "";
        this.f25306 = new ArrayDeque();
        this.f25299 = new ArrayDeque();
        this.f25297 = 0;
        this.f25295 = 0;
        this.f25302 = 0;
        this.f25301 = new ArrayDeque();
        this.f25292 = new ArrayDeque();
        this.f25305 = "";
        this.f25304 = 0;
        this.f25296 = 0;
        this.f25294 = new ArrayDeque();
        this.f25300 = false;
        this.f25308 = false;
        this.f25303 = false;
        this.f25293 = null;
        this.f25307 = null;
    }

    @Override // l.AbstractC23747, l.InterfaceC1169
    public final InterfaceC0463 nextToken() {
        int i = this.f25297;
        ArrayDeque arrayDeque = this.f25299;
        if (i != -1) {
            m21749();
            ArrayDeque arrayDeque2 = this.f25306;
            if (arrayDeque2.isEmpty()) {
                arrayDeque2.push(0);
                if (this.f25293.getType() == 11) {
                    m21749();
                }
                String str = this.f25298;
                if (!str.isEmpty()) {
                    C13952 c13952 = new C13952(this.f76882, 1, 1, 0, 0);
                    c13952.m33390(str);
                    c13952.m33393(0);
                    c13952.m33391(-1);
                    m21741(c13952);
                }
                while (true) {
                    if (this.f25293.getType() == -1) {
                        break;
                    }
                    if (this.f25293.mo2050() == 0) {
                        if (this.f25293.getType() != 102) {
                            if (this.f25297 == 104 && m21743(((InterfaceC0463) arrayDeque.peekLast()).getText()) != 0) {
                                m21746("first statement indented");
                                m21739(2, " ERROR: first statement indented", this.f25293);
                            }
                        } else {
                            C13952 c139522 = new C13952(this.f25293);
                            c139522.m33389(1);
                            m21741(c139522);
                        }
                    } else {
                        m21741(this.f25293);
                    }
                    m21749();
                }
            }
            int type = this.f25293.getType();
            ArrayDeque arrayDeque3 = this.f25294;
            if (type == -1) {
                int i2 = this.f25295;
                if (i2 > 0) {
                    if (i2 != 3 && i2 != 102) {
                        m21739(IShizukuService.Stub.TRANSACTION_attachUserService, (String) null, this.f25307);
                    }
                    m21745(0);
                }
                m21741(this.f25293);
            } else if (type == 6 || type == 9) {
                String text = this.f25293.getText();
                if (text.length() >= 2) {
                    text = text.substring(text.length() - 2);
                }
                text.getClass();
                if (text.equals("{{")) {
                    m21744(14, 1, "{");
                } else if (text.equals("}}")) {
                    m21744(17, 1, l.d);
                }
                m21741(this.f25293);
            } else if (type == 58) {
                if (!arrayDeque3.isEmpty() && ((Integer) this.f25301.peek()).intValue() == 0) {
                    C13952 c139523 = new C13952(this.f25293);
                    c139523.m33396(19);
                    c139523.m33390(":");
                    c139523.m33394(c139523.mo2054());
                    this.f25293 = c139523;
                    int type2 = this.f25307.getType();
                    if (type2 == 6 || type2 == 9) {
                        C13952 c139524 = new C13952(this.f25307);
                        c139524.m33390("=" + c139524.getText());
                        c139524.m33395(c139524.mo2054() - 1);
                        c139524.m33391(c139524.mo2049() - 1);
                        this.f25307 = c139524;
                    } else {
                        m21741(this.f25293);
                        m21738(this.f25304, 0, "=");
                    }
                }
                m21741(this.f25293);
            } else if (type != 102) {
                if (type != 106) {
                    switch (type) {
                        case 12:
                        case 13:
                        case 14:
                            this.f25302++;
                            m21741(this.f25293);
                            break;
                        case 15:
                        case 16:
                        case 17:
                            this.f25302--;
                            m21741(this.f25293);
                            break;
                        default:
                            m21741(this.f25293);
                            break;
                    }
                } else {
                    m21746("token recognition error at: '" + this.f25293.getText() + "'");
                    m21741(this.f25293);
                }
            } else if (!arrayDeque3.isEmpty()) {
                m21741(this.f25293);
            } else if (this.f25302 <= 0) {
                InterfaceC0463 c139525 = new C13952(this.f25293);
                boolean z = this.f25307.getType() == 104;
                if (z) {
                    m21749();
                }
                int type3 = this.f25307.getType();
                if (type3 != 102 && type3 != 103) {
                    m21741(c139525);
                    if (z) {
                        int m21743 = this.f25307.getType() == -1 ? 0 : m21743(this.f25293.getText());
                        if (m21743 != -1) {
                            m21741(this.f25293);
                            m21745(m21743);
                        } else {
                            m21746("inconsistent use of tabs and spaces in indentation");
                            m21739(IShizukuService.Stub.TRANSACTION_getFlagsForUid, " ERROR: ".concat("inconsistent use of tabs and spaces in indentation"), this.f25307);
                        }
                    } else {
                        m21745(0);
                    }
                } else {
                    C13952 c139526 = new C13952(c139525);
                    c139526.m33389(1);
                    m21741(c139526);
                    if (z) {
                        m21741(this.f25293);
                    }
                }
            } else {
                C13952 c139527 = new C13952(this.f25293);
                c139527.m33389(1);
                m21741(c139527);
            }
            if (!arrayDeque3.isEmpty() && this.f25307.getType() == 17) {
                int type4 = this.f25293.getType();
                if (type4 == 17) {
                    String str2 = this.f25305;
                    C2569 c2569 = ((C9625) this).f29175;
                    C9625 c9625 = new C9625(new C3980(new C11837(str2, new RunnableC6802(c2569)), c2569), c2569);
                    c9625.m43458();
                    C8919 c8919 = new C8919(c9625, c2569);
                    C15973 c15973 = new C15973(c8919, c2569);
                    c15973.m43458();
                    c15973.m4188();
                    if (c15973.m24574() != 0) {
                        c8919.mo6201(0);
                        C15973 c159732 = new C15973(c8919, c2569);
                        c159732.m43458();
                        c159732.m4290();
                        if (c159732.m24574() != 0) {
                            m21739(this.f25304, "", this.f25307);
                        }
                    }
                } else if (type4 == 19) {
                    m21739(this.f25304, "", this.f25307);
                }
            }
        }
        return (InterfaceC0463) arrayDeque.pollFirst();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m21747(int i) {
        this.f76889.m41111(this.f76881);
        this.f76881 = i;
        this.f25294.push(Integer.valueOf(this.f25296));
        this.f25296 = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r1.isEmpty() != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0091, code lost:
    
        r0 = r10.f25293.getType();
        r5 = r10.f25301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009b, code lost:
    
        if (r0 == 19) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009f, code lost:
    
        if (r0 == 58) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a3, code lost:
    
        if (r0 == 102) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a5, code lost:
    
        switch(r0) {
            case 12: goto L58;
            case 13: goto L58;
            case 14: goto L57;
            case 15: goto L56;
            case 16: goto L56;
            case 17: goto L50;
            default: goto L49;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a8, code lost:
    
        m21740(r10.f25293.getText());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b3, code lost:
    
        r0 = r10.f25296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b5, code lost:
    
        if (r0 == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b7, code lost:
    
        switch(r0) {
            case 17: goto L54;
            case 18: goto L54;
            case 19: goto L54;
            case 20: goto L54;
            case 21: goto L54;
            case 22: goto L54;
            case 23: goto L54;
            case 24: goto L54;
            case 25: goto L54;
            case 26: goto L54;
            case 27: goto L54;
            case 28: goto L54;
            case 29: goto L54;
            case 30: goto L54;
            case 31: goto L54;
            case 32: goto L54;
            default: goto L53;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ba, code lost:
    
        m21746("f-string: single '}' is not allowed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c1, code lost:
    
        m21748();
        m21748();
        m21742();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cc, code lost:
    
        m21748();
        m21742();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d4, code lost:
    
        m21740(r10.f25293.getText());
        r5.push(java.lang.Integer.valueOf(((java.lang.Integer) r5.pop()).intValue() - 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f1, code lost:
    
        r10.f25292.push("{");
        r5.push(0);
        m21747(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0102, code lost:
    
        m21740(r10.f25293.getText());
        r5.push(java.lang.Integer.valueOf(((java.lang.Integer) r5.pop()).intValue() + 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x011f, code lost:
    
        m21740(r10.f25293.getText());
        r0 = new l.C13952(r10.f25293);
        r0.m33389(1);
        r10.f25293 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0136, code lost:
    
        m21740(r10.f25293.getText());
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0149, code lost:
    
        if (((java.lang.Integer) r5.peek()).intValue() == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0157, code lost:
    
        switch(((java.lang.Integer) r1.peek()).intValue()) {
            case 1: goto L81;
            case 2: goto L80;
            case 3: goto L79;
            case 4: goto L78;
            case 5: goto L77;
            case 6: goto L76;
            case 7: goto L75;
            case 8: goto L74;
            case 9: goto L73;
            case 10: goto L72;
            case 11: goto L71;
            case 12: goto L70;
            case 13: goto L69;
            case 14: goto L68;
            case 15: goto L67;
            case 16: goto L66;
            case 17: goto L81;
            case 18: goto L80;
            case 19: goto L79;
            case 20: goto L78;
            case 21: goto L77;
            case 22: goto L76;
            case 23: goto L75;
            case 24: goto L74;
            case 25: goto L73;
            case 26: goto L72;
            case 27: goto L71;
            case 28: goto L70;
            case 29: goto L69;
            case 30: goto L68;
            case 31: goto L67;
            case 32: goto L66;
            default: goto L85;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x015c, code lost:
    
        m21747(32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0163, code lost:
    
        m21747(31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0169, code lost:
    
        m21747(30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x016f, code lost:
    
        m21747(29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0175, code lost:
    
        m21747(28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x017b, code lost:
    
        m21747(27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0181, code lost:
    
        m21747(26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0187, code lost:
    
        m21747(25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x018d, code lost:
    
        m21747(24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0193, code lost:
    
        m21747(23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0199, code lost:
    
        m21747(22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x019f, code lost:
    
        m21747(21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a5, code lost:
    
        m21747(20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ab, code lost:
    
        m21747(19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01af, code lost:
    
        m21747(18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01b5, code lost:
    
        m21747(17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x005c, code lost:
    
        if (r0.equals("\\{") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0087, code lost:
    
        if (r0 != 9) goto L42;
     */
    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m21749() {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC8213.m21749():void");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m21745(int i) {
        int intValue = ((Integer) this.f25306.peek()).intValue();
        if (i > intValue) {
            m21739(2, (String) null, this.f25307);
            this.f25306.push(Integer.valueOf(i));
            return;
        }
        while (i < intValue) {
            this.f25306.pop();
            intValue = ((Integer) this.f25306.peek()).intValue();
            if (i <= intValue) {
                m21739(3, (String) null, this.f25307);
            } else {
                m21746("inconsistent dedent");
                m21739(IShizukuService.Stub.TRANSACTION_getFlagsForUid, " ERROR: ".concat("inconsistent dedent"), this.f25307);
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m21743(String str) {
        int i = 0;
        for (char c : str.toCharArray()) {
            if (c == '\t') {
                this.f25308 = true;
                i += 8 - (i % 8);
            } else if (c == '\f') {
                i = 0;
            } else if (c == ' ') {
                this.f25300 = true;
                i++;
            }
        }
        if (!this.f25308 || !this.f25300 || this.f25303) {
            return i;
        }
        this.f25303 = true;
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21740(String str) {
        this.f25292.push(((String) this.f25292.pop()) + str);
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m21737() {
        Integer num = (Integer) f25291.get(this.f25293.getText().toLowerCase());
        if (num != null) {
            m21747(num.intValue());
            return;
        }
        m21746("internal error: unknown interpolated string literal prefix: " + this.f25293.getText());
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m21742() {
        this.f25301.pop();
        this.f25305 = C16014.m37867((String) this.f25292.pop(), l.d);
        if (this.f25292.isEmpty()) {
            return;
        }
        StringBuilder m15339 = C5368.m15339((String) this.f25292.pop());
        m15339.append(this.f25305);
        this.f25292.push(m15339.toString());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m21744(int i, int i2, String str) {
        String m36561 = C15472.m36561(1, 0, this.f25293.getText());
        C13952 c13952 = new C13952(this.f25293);
        c13952.m33390(m36561);
        c13952.m33394(c13952.mo2053() - 1);
        m21741(c13952);
        m21738(i, i2, str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21738(int i, int i2, String str) {
        C13952 c13952 = new C13952(this.f25293);
        c13952.m33396(i);
        c13952.m33390(str);
        c13952.m33389(i2);
        c13952.m33391(c13952.mo2049() + 1);
        c13952.m33395(c13952.mo2054() + 1);
        c13952.m33394(c13952.mo2054());
        this.f25293 = c13952;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m21748() {
        m52395();
        this.f25296 = ((Integer) this.f25294.pop()).intValue();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21739(int i, String str, InterfaceC0463 interfaceC0463) {
        C13952 c13952 = new C13952(interfaceC0463);
        c13952.m33396(i);
        c13952.m33389(0);
        c13952.m33394(interfaceC0463.mo2054() - 1);
        if (str == null) {
            str = "<" + C1157.f4189.m36285(i) + ">";
        }
        c13952.m33390(str);
        m21741(c13952);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21741(InterfaceC0463 interfaceC0463) {
        this.f25297 = interfaceC0463.getType();
        if (interfaceC0463.mo2050() == 0) {
            this.f25295 = this.f25297;
        }
        this.f25299.addLast(interfaceC0463);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m21746(String str) {
        m43461().mo1935(this, Integer.valueOf(this.f25293.getType()), this.f25293.getLine(), this.f25293.mo2049(), C20094.m46315(" LEXER ERROR: ", str), (C2581) null);
    }
}

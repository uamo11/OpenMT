package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.HashSet;

/* compiled from: R7CK */
/* renamed from: l.۬ᩳ֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13269 extends AbstractC11817 {

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f39737 = 0;

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public final boolean f39738;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public C3392 f39739;

    public C13269(C20826 c20826) {
        super(c20826);
        this.f39738 = C11133.m27616(EnumC1960.CP_INDEX);
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m32235() {
        C3392 c3392 = this.f39739;
        return c3392 == null ? "N/A" : c3392.m10344();
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m32233() {
        C3392 c3392 = this.f39739;
        if (c3392 == null) {
            return null;
        }
        return c3392.f10733.m14014();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m32236(String str) {
        StringBuilder sb = new StringBuilder(25);
        C3392 c3392 = this.f39739;
        boolean z = this.f39738;
        String str2 = " */";
        if (c3392 == null) {
            sb.append(EnumC15204.f46443.m35967());
            sb.append(' ');
            if (z) {
                sb.append("#?? /* " + m32235() + " */");
            } else {
                sb.append(m32235());
            }
            if (str.length() > 0) {
                sb.append(' ');
                sb.append(str);
            }
        } else {
            sb.append(EnumC6073.m16932(c3392.f10733.m4336(), EnumC20185.MODULE));
            sb.append(EnumC15204.f46443.m35967());
            sb.append(' ');
            if (z) {
                Integer valueOf = Integer.valueOf(this.f39739.f10733.m4929());
                String m10344 = this.f39739.m10344();
                if (this.f39739.f10733.m14014() != null) {
                    str2 = "@" + this.f39739.f10733.m14014() + " */";
                }
                sb.append(String.format("#%d /* %s%s%s", valueOf, m10344, str2, str.length() > 0 ? " ".concat(str) : ""));
            } else {
                sb.append(this.f39739.m10344());
                if (str.length() > 0) {
                    sb.append(' ');
                    sb.append(str);
                }
                if (this.f39739.f10733.m14014() != null) {
                    sb.append("// @");
                    sb.append(this.f39739.f10733.m14014());
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32234(DataInputStream dataInputStream) {
        boolean z = this.f29352;
        try {
            int readUnsignedShort = dataInputStream.readUnsignedShort();
            int i = 7;
            C19621 c19621 = new C19621(this.f35264.m25969(readUnsignedShort), readUnsignedShort, dataInputStream.readUnsignedShort(), this.f35264.m25965(dataInputStream.readUnsignedShort(), new C15420(i)));
            try {
                int readUnsignedShort2 = dataInputStream.readUnsignedShort();
                for (int i2 = 0; i2 < readUnsignedShort2; i2++) {
                    int readUnsignedShort3 = dataInputStream.readUnsignedShort();
                    c19621.f63356.add(new C0569(this.f35264.m25969(readUnsignedShort3), readUnsignedShort3, dataInputStream.readUnsignedShort(), this.f35264.m25965(dataInputStream.readUnsignedShort(), new C15420(i))));
                }
            } catch (IOException unused) {
                if (z) {
                    this.f35255.m45770().mo32596("Invalid requires table", new Object[0]);
                } else {
                    throw new C4375(this.f35255.m45770(), "Invalid requires table", new Object[0]);
                }
            }
            try {
                int readUnsignedShort4 = dataInputStream.readUnsignedShort();
                if (readUnsignedShort4 > 0) {
                    for (int i3 = 0; i3 < readUnsignedShort4; i3++) {
                        int readUnsignedShort5 = dataInputStream.readUnsignedShort();
                        String m25970 = this.f35264.m25970(readUnsignedShort5);
                        int readUnsignedShort6 = dataInputStream.readUnsignedShort();
                        int readUnsignedShort7 = dataInputStream.readUnsignedShort();
                        if (readUnsignedShort7 > 0) {
                            HashSet hashSet = new HashSet(readUnsignedShort7);
                            for (int i4 = 0; i4 < readUnsignedShort7; i4++) {
                                int readUnsignedShort8 = dataInputStream.readUnsignedShort();
                                EnumC12358 enumC12358 = EnumC12358.CONSTANT_NULL;
                                hashSet.add(new C22442(readUnsignedShort8, this.f35264.m25969(readUnsignedShort8)));
                            }
                            c19621.m45070(readUnsignedShort5, readUnsignedShort6, m25970, hashSet);
                        } else {
                            c19621.m45069(readUnsignedShort5, readUnsignedShort6, m25970);
                        }
                    }
                }
            } catch (IOException unused2) {
                if (z) {
                    this.f35255.m45770().mo32596("Invalid exports table", new Object[0]);
                } else {
                    throw new C4375(this.f35255.m45770(), "Invalid exports table", new Object[0]);
                }
            }
            try {
                int readUnsignedShort9 = dataInputStream.readUnsignedShort();
                if (readUnsignedShort9 > 0) {
                    for (int i5 = 0; i5 < readUnsignedShort9; i5++) {
                        int readUnsignedShort10 = dataInputStream.readUnsignedShort();
                        String m259702 = this.f35264.m25970(readUnsignedShort10);
                        int readUnsignedShort11 = dataInputStream.readUnsignedShort();
                        int readUnsignedShort12 = dataInputStream.readUnsignedShort();
                        if (readUnsignedShort12 > 0) {
                            HashSet hashSet2 = new HashSet(readUnsignedShort12);
                            for (int i6 = 0; i6 < readUnsignedShort12; i6++) {
                                int readUnsignedShort13 = dataInputStream.readUnsignedShort();
                                EnumC12358 enumC123582 = EnumC12358.CONSTANT_NULL;
                                hashSet2.add(new C22442(readUnsignedShort13, this.f35264.m25969(readUnsignedShort13)));
                            }
                            c19621.m45080(readUnsignedShort10, readUnsignedShort11, m259702, hashSet2);
                        } else {
                            c19621.m45079(readUnsignedShort10, readUnsignedShort11, m259702);
                        }
                    }
                }
            } catch (IOException unused3) {
                if (z) {
                    this.f35255.m45770().mo32596("Invalid opens table", new Object[0]);
                } else {
                    throw new C4375(this.f35255.m45770(), "Invalid opens table", new Object[0]);
                }
            }
            try {
                int readUnsignedShort14 = dataInputStream.readUnsignedShort();
                if (readUnsignedShort14 > 0) {
                    for (int i7 = 0; i7 < readUnsignedShort14; i7++) {
                        int readUnsignedShort15 = dataInputStream.readUnsignedShort();
                        c19621.f63350.add(new C20326(readUnsignedShort15, this.f35264.m25960(readUnsignedShort15)));
                    }
                }
            } catch (IOException unused4) {
                if (z) {
                    this.f35255.m45770().mo32596("Invalid uses table", new Object[0]);
                } else {
                    throw new C4375(this.f35255.m45770(), "Invalid uses table", new Object[0]);
                }
            }
            try {
                int readUnsignedShort16 = dataInputStream.readUnsignedShort();
                if (readUnsignedShort16 > 0) {
                    for (int i8 = 0; i8 < readUnsignedShort16; i8++) {
                        int readUnsignedShort17 = dataInputStream.readUnsignedShort();
                        String m25960 = this.f35264.m25960(readUnsignedShort17);
                        int readUnsignedShort18 = dataInputStream.readUnsignedShort();
                        HashSet hashSet3 = new HashSet(readUnsignedShort18);
                        for (int i9 = 0; i9 < readUnsignedShort18; i9++) {
                            int readUnsignedShort19 = dataInputStream.readUnsignedShort();
                            EnumC12358 enumC123583 = EnumC12358.CONSTANT_NULL;
                            hashSet3.add(new C22442(readUnsignedShort19, this.f35264.m25960(readUnsignedShort19)));
                        }
                        c19621.m45071(readUnsignedShort17, m25960, hashSet3);
                    }
                }
            } catch (IOException unused5) {
                if (z) {
                    this.f35255.m45770().mo32596("Invalid provides table", new Object[0]);
                } else {
                    throw new C4375(this.f35255.m45770(), "Invalid provides table", new Object[0]);
                }
            }
            this.f39739 = c19621.m45067();
        } catch (IOException unused6) {
            if (z) {
                this.f35255.m45770().mo32596("Invalid Module attributes table", new Object[0]);
                return;
            }
            throw new C4375(this.f35255.m45770(), "Invalid Module attributes table", new Object[0]);
        }
    }

    @Override // l.AbstractC9701, l.InterfaceC17482
    /* renamed from: ۧ */
    public final void mo3021() {
        C3392 c3392 = this.f39739;
        if (c3392 != null) {
            String c33922 = c3392.toString();
            if (c33922.isEmpty()) {
                return;
            }
            m24662(c33922);
        }
    }
}

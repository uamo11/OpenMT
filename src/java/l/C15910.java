package l;

import com.alipay.sdk.m.y.q;
import java.io.DataInputStream;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* compiled from: H7CX */
/* renamed from: l.ܺۨۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15910 extends AbstractC14539 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3917 f49148;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15910(C3917 c3917, DataInputStream dataInputStream) {
        super(dataInputStream);
        this.f49148 = c3917;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m37674() {
        try {
            return this.f44543.charAt(this.f44540);
        } catch (StringIndexOutOfBoundsException unused) {
            return -1;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m37675() {
        String str = this.f44543;
        int i = this.f44540;
        this.f44542 = (this.f44541 << 32) | i;
        try {
            char charAt = str.charAt(i);
            int i2 = this.f44540 + 1;
            this.f44540 = i2;
            if (charAt == '\n') {
                this.f44541++;
                return charAt;
            }
            if (charAt != '\r') {
                return charAt;
            }
            if (str.charAt(i2) == '\n') {
                this.f44540++;
            }
            this.f44541++;
            return charAt;
        } catch (StringIndexOutOfBoundsException unused) {
            return -1;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m37673() {
        char charAt;
        C3917 c3917 = this.f49148;
        String str = this.f44543;
        while (true) {
            try {
                charAt = str.charAt(this.f44540);
                if (charAt != 'u') {
                    break;
                }
                this.f44540++;
            } catch (StringIndexOutOfBoundsException unused) {
                c3917.mo9065(this.f44542, "Invalid escape character", new Object[0]);
                return -1;
            }
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i < 4) {
                switch (charAt) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    case '8':
                    case '9':
                        i2 = ((i2 << 4) + charAt) - 48;
                        continue;
                        int i3 = this.f44540 + 1;
                        this.f44540 = i3;
                        charAt = str.charAt(i3);
                        i++;
                    default:
                        switch (charAt) {
                            case 'A':
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'E':
                            case 'F':
                                i2 = (((i2 << 4) + 10) + charAt) - 65;
                                continue;
                                int i32 = this.f44540 + 1;
                                this.f44540 = i32;
                                charAt = str.charAt(i32);
                                i++;
                            default:
                                switch (charAt) {
                                    case 'a':
                                    case 'b':
                                    case q.f /* 99 */:
                                    case 'd':
                                    case 'e':
                                    case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                                        i2 = (((i2 << 4) + 10) + charAt) - 97;
                                        continue;
                                        continue;
                                        continue;
                                        int i322 = this.f44540 + 1;
                                        this.f44540 = i322;
                                        charAt = str.charAt(i322);
                                        i++;
                                    default:
                                        c3917.mo9065(this.f44542, "Invalid escape character", new Object[0]);
                                        break;
                                }
                        }
                }
                c3917.mo9065(this.f44542, "Invalid escape character", new Object[0]);
                return -1;
            }
        }
        return i2;
    }
}

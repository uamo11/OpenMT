package l;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* compiled from: B8Q6 */
/* renamed from: l.᩹᩵ۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22493 implements InterfaceC9773 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17714 f72817 = new C17714();

    @Override // l.InterfaceC9773
    public final /* synthetic */ void reset() {
    }

    @Override // l.InterfaceC9773
    /* renamed from: ֫ */
    public final /* synthetic */ InterfaceC13571 mo6617(int i, int i2, byte[] bArr) {
        return C14710.m35002(this, bArr, i2);
    }

    @Override // l.InterfaceC9773
    /* renamed from: ֫ */
    public final void mo6618(byte[] bArr, int i, int i2, C21062 c21062, InterfaceC23483 interfaceC23483) {
        C19811 m49383;
        C17714 c17714 = this.f72817;
        c17714.m41462(i2 + i, bArr);
        c17714.m41484(i);
        ArrayList arrayList = new ArrayList();
        while (c17714.m41457() > 0) {
            C22632.m50630("Incomplete Mp4Webvtt Top Level box header found.", c17714.m41457() >= 8);
            int m41493 = c17714.m41493();
            if (c17714.m41493() == 1987343459) {
                int i3 = m41493 - 8;
                CharSequence charSequence = null;
                C21927 c21927 = null;
                while (i3 > 0) {
                    C22632.m50630("Incomplete vtt cue box header found.", i3 >= 8);
                    int m414932 = c17714.m41493();
                    int m414933 = c17714.m41493();
                    int i4 = m414932 - 8;
                    byte[] m41482 = c17714.m41482();
                    int m41485 = c17714.m41485();
                    String str = C3603.f11424;
                    String str2 = new String(m41482, m41485, i4, StandardCharsets.UTF_8);
                    c17714.m41478(i4);
                    i3 = (i3 - 8) - i4;
                    if (m414933 == 1937011815) {
                        c21927 = C23198.m51480(str2);
                    } else if (m414933 == 1885436268) {
                        charSequence = C23198.m51476((String) null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (c21927 != null) {
                    c21927.m49389(charSequence);
                    m49383 = c21927.m49383();
                } else {
                    Pattern pattern = C23198.f74573;
                    C11910 c11910 = new C11910();
                    c11910.f35605 = charSequence;
                    m49383 = c11910.m29043().m49383();
                }
                arrayList.add(m49383);
            } else {
                c17714.m41478(m41493 - 8);
            }
        }
        interfaceC23483.accept(new C12866(-9223372036854775807L, -9223372036854775807L, arrayList));
    }
}

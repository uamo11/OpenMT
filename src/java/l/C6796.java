package l;

import android.content.ContextWrapper;
import android.graphics.Point;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: 18S9 */
/* renamed from: l.ۜܰ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6796 extends AbstractC3498 implements InterfaceC20908 {

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final ContextWrapper f21085;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f21086;

    @Override // l.InterfaceC1381
    public final String getName() {
        return "BitmapFactoryImageDecoder";
    }

    @Override // l.AbstractC3498
    /* renamed from: ֫ */
    public final C8437 mo11(C21843 c21843, AbstractC20432 abstractC20432, boolean z) {
        AbstractC2563 abstractC2563 = (AbstractC2563) abstractC20432;
        ByteBuffer byteBuffer = c21843.f69995;
        byteBuffer.getClass();
        C22632.m50634(byteBuffer.hasArray());
        C22632.m50631(byteBuffer.arrayOffset() == 0);
        try {
            int i = this.f21086;
            if (i == -1) {
                ContextWrapper contextWrapper = this.f21085;
                if (contextWrapper != null) {
                    Point m11018 = C3603.m11018(contextWrapper);
                    int i2 = m11018.x;
                    int i3 = m11018.y;
                    C8353 c8353 = c21843.f69994;
                    if (c8353 != null) {
                        int i4 = c8353.f25638;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                        int i5 = c8353.f25607;
                        if (i5 != -1) {
                            i3 *= i5;
                        }
                    }
                    i = (Math.max(i2, i3) * 2) - 1;
                } else {
                    i = 4096;
                }
            }
            abstractC2563.f8105 = C3810.m11492(byteBuffer.remaining(), i, byteBuffer.array());
            abstractC2563.f65926 = c21843.f69997;
            return null;
        } catch (C9080 e) {
            return new C9619("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new C9619(e2);
        }
    }

    public C6796(ContextWrapper contextWrapper) {
        super(new C21843[1], new AbstractC2563[1]);
        this.f21085 = contextWrapper;
        this.f21086 = -1;
    }

    @Override // l.AbstractC3498
    /* renamed from: ᩳ */
    public final C21843 mo16() {
        return new C21843(1, 0);
    }

    @Override // l.AbstractC3498
    /* renamed from: ܿ */
    public final AbstractC20432 mo15() {
        return new C14556(this);
    }

    @Override // l.AbstractC3498
    /* renamed from: ֫ */
    public final C8437 mo10(Throwable th) {
        return new C9619("Unexpected decode error", th);
    }
}

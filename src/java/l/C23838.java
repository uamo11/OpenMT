package l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import java.nio.ByteBuffer;

/* compiled from: F43P */
/* renamed from: l.᩻ܿ۠, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23838 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ByteBuffer f77134;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m52535(int i) {
        ByteBuffer allocate;
        if (i < 20480) {
            i = UMModuleRegister.PUSH_EVENT_VALUE_HIGH;
        }
        ByteBuffer byteBuffer = this.f77134;
        if (byteBuffer != null && byteBuffer.capacity() >= i) {
            allocate = (ByteBuffer) this.f77134.clear();
        } else {
            allocate = ByteBuffer.allocate((i + i) >> 1);
        }
        this.f77134 = null;
        return allocate;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52536(ByteBuffer byteBuffer) {
        this.f77134 = byteBuffer;
    }
}

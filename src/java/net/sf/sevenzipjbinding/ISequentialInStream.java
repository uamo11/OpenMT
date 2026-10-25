package net.sf.sevenzipjbinding;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface ISequentialInStream extends Closeable {
    int read(ByteBuffer byteBuffer);
}

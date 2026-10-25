package net.sf.sevenzipjbinding;

import java.io.Closeable;

/* loaded from: classes.dex */
public interface IOutCreateArchive extends IOutArchiveBase, Closeable {
    void createArchive(ISequentialOutStream iSequentialOutStream, int i, IOutCreateCallback iOutCreateCallback);

    ArchiveFormat getArchiveFormat();
}

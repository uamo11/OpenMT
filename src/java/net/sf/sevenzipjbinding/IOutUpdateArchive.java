package net.sf.sevenzipjbinding;

/* loaded from: classes.dex */
public interface IOutUpdateArchive extends IOutArchiveBase {
    ArchiveFormat getArchiveFormat();

    IInArchive getConnectedInArchive();

    void updateItems(ISequentialOutStream iSequentialOutStream, int i, IOutCreateCallback iOutCreateCallback);
}

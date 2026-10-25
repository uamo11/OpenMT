package net.sf.sevenzipjbinding.impl;

import java.util.Date;
import l.C21899;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.IOutArchive;
import net.sf.sevenzipjbinding.IOutItem7z;
import net.sf.sevenzipjbinding.IOutItemBZip2;
import net.sf.sevenzipjbinding.IOutItemBase;
import net.sf.sevenzipjbinding.IOutItemGZip;
import net.sf.sevenzipjbinding.IOutItemTar;
import net.sf.sevenzipjbinding.IOutItemZip;
import net.sf.sevenzipjbinding.PropID;

/* loaded from: classes.dex */
public class OutItemFactory {
    public static final Long ZERO = 0L;
    public int index;
    public IOutArchive outArchive;

    private void fillDefaultValuesBZip2(IOutItemBZip2 iOutItemBZip2) {
    }

    private void fillDefaultValuesGZip(IOutItemGZip iOutItemGZip) {
    }

    public OutItemFactory(IOutArchive iOutArchive, int i) {
        this.outArchive = iOutArchive;
        this.index = i;
    }

    public IOutItemBase createOutItem() {
        return createOutItemIntern();
    }

    private OutItem createOutItemIntern() {
        OutItem outItem = new OutItem(this.outArchive, this.index);
        fillDefaultValues(outItem);
        return outItem;
    }

    private void fillDefaultValues(OutItem outItem) {
        if (this.outArchive.getConnectedInArchive() != null) {
            outItem.setUpdateOldArchiveItemIndex(-1);
            Boolean bool = Boolean.TRUE;
            outItem.setUpdateIsNewData(bool);
            outItem.setUpdateIsNewProperties(bool);
        }
        outItem.setDataSize(ZERO);
        outItem.setPropertyLastModificationTime(new Date());
        int i = C21899.f70110[outItem.getArchiveFormat().ordinal()];
        if (i == 1) {
            fillDefaultValues7z(outItem);
            return;
        }
        if (i == 2) {
            fillDefaultValuesZip(outItem);
            return;
        }
        if (i == 3) {
            fillDefaultValuesBZip2(outItem);
            return;
        }
        if (i == 4) {
            fillDefaultValuesGZip(outItem);
        } else {
            if (i == 5) {
                fillDefaultValuesTar(outItem);
                return;
            }
            throw new RuntimeException("No default values strategy for the archive format '" + outItem.getArchiveFormat() + "'");
        }
    }

    private void fillDefaultValues7z(IOutItem7z iOutItem7z) {
        Boolean bool = Boolean.FALSE;
        iOutItem7z.setPropertyIsAnti(bool);
        iOutItem7z.setPropertyIsDir(bool);
        iOutItem7z.setPropertyAttributes(0);
    }

    private void fillDefaultValuesZip(IOutItemZip iOutItemZip) {
        iOutItemZip.setPropertyIsDir(Boolean.FALSE);
        iOutItemZip.setPropertyAttributes(0);
    }

    private void fillDefaultValuesTar(IOutItemTar iOutItemTar) {
        iOutItemTar.setPropertyIsDir(Boolean.FALSE);
    }

    public IOutItemBase createOutItem(int i) {
        if (this.outArchive.getConnectedInArchive() == null) {
            throw new RuntimeException("Not an update operation");
        }
        OutItem createOutItemIntern = createOutItemIntern();
        createOutItemIntern.setUpdateOldArchiveItemIndex(Integer.valueOf(i));
        Boolean bool = Boolean.FALSE;
        createOutItemIntern.setUpdateIsNewData(bool);
        createOutItemIntern.setUpdateIsNewProperties(bool);
        return createOutItemIntern;
    }

    public IOutItemBase createOutItemAndCloneProperties(int i) {
        IInArchive connectedInArchive = this.outArchive.getConnectedInArchive();
        if (connectedInArchive == null) {
            throw new RuntimeException("Not an update operation");
        }
        OutItem createOutItemIntern = createOutItemIntern();
        createOutItemIntern.setUpdateOldArchiveItemIndex(Integer.valueOf(i));
        createOutItemIntern.setUpdateIsNewData(Boolean.FALSE);
        createOutItemIntern.setUpdateIsNewProperties(Boolean.TRUE);
        createOutItemIntern.setPropertyPath((String) connectedInArchive.getProperty(i, PropID.PATH));
        createOutItemIntern.setPropertyAttributes((Integer) connectedInArchive.getProperty(i, PropID.ATTRIBUTES));
        createOutItemIntern.setPropertyPosixAttributes((Integer) connectedInArchive.getProperty(i, PropID.POSIX_ATTRIB));
        createOutItemIntern.setPropertyUser((String) connectedInArchive.getProperty(i, PropID.USER));
        createOutItemIntern.setPropertyGroup((String) connectedInArchive.getProperty(i, PropID.GROUP));
        createOutItemIntern.setPropertyCreationTime((Date) connectedInArchive.getProperty(i, PropID.CREATION_TIME));
        createOutItemIntern.setPropertyLastModificationTime((Date) connectedInArchive.getProperty(i, PropID.LAST_MODIFICATION_TIME));
        createOutItemIntern.setPropertyLastAccessTime((Date) connectedInArchive.getProperty(i, PropID.LAST_ACCESS_TIME));
        createOutItemIntern.setPropertyIsAnti((Boolean) connectedInArchive.getProperty(i, PropID.IS_ANTI));
        createOutItemIntern.setPropertyIsDir((Boolean) connectedInArchive.getProperty(i, PropID.IS_FOLDER));
        return createOutItemIntern;
    }
}

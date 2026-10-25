package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.pqc.crypto.xmss.HashTreeAddress;
import org.bouncycastle.pqc.crypto.xmss.LTreeAddress;

/* loaded from: classes2.dex */
public class XMSSVerifierUtil {
    public static XMSSNode getRootNodeFromSignature(WOTSPlus wOTSPlus, int i, byte[] bArr, XMSSReducedSignature xMSSReducedSignature, OTSHashAddress oTSHashAddress, int i2) {
        if (bArr.length != wOTSPlus.getParams().getTreeDigestSize()) {
            throw new IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
        }
        if (xMSSReducedSignature == null) {
            throw new NullPointerException("signature == null");
        }
        if (oTSHashAddress == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        LTreeAddress lTreeAddress = (LTreeAddress) ((LTreeAddress.Builder) ((LTreeAddress.Builder) new LTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress())).withTreeAddress(oTSHashAddress.getTreeAddress())).withLTreeAddress(oTSHashAddress.getOTSAddress()).build();
        HashTreeAddress hashTreeAddress = (HashTreeAddress) ((HashTreeAddress.Builder) ((HashTreeAddress.Builder) new HashTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress())).withTreeAddress(oTSHashAddress.getTreeAddress())).withTreeIndex(oTSHashAddress.getOTSAddress()).build();
        XMSSNode[] xMSSNodeArr = new XMSSNode[2];
        xMSSNodeArr[0] = XMSSNodeUtil.lTree(wOTSPlus, wOTSPlus.getPublicKeyFromSignature(bArr, xMSSReducedSignature.getWOTSPlusSignature(), oTSHashAddress), lTreeAddress);
        for (int i3 = 0; i3 < i; i3++) {
            HashTreeAddress hashTreeAddress2 = (HashTreeAddress) ((HashTreeAddress.Builder) ((HashTreeAddress.Builder) ((HashTreeAddress.Builder) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress.getLayerAddress())).withTreeAddress(hashTreeAddress.getTreeAddress())).withTreeHeight(i3).withTreeIndex(hashTreeAddress.getTreeIndex()).withKeyAndMask(hashTreeAddress.getKeyAndMask())).build();
            double floor = Math.floor(i2 / (1 << i3)) % 2.0d;
            HashTreeAddress.Builder withTreeHeight = ((HashTreeAddress.Builder) ((HashTreeAddress.Builder) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress2.getLayerAddress())).withTreeAddress(hashTreeAddress2.getTreeAddress())).withTreeHeight(hashTreeAddress2.getTreeHeight());
            int treeIndex = hashTreeAddress2.getTreeIndex();
            if (floor == 0.0d) {
                hashTreeAddress = (HashTreeAddress) ((HashTreeAddress.Builder) withTreeHeight.withTreeIndex(treeIndex / 2).withKeyAndMask(hashTreeAddress2.getKeyAndMask())).build();
                XMSSNode randomizeHash = XMSSNodeUtil.randomizeHash(wOTSPlus, xMSSNodeArr[0], (XMSSNode) xMSSReducedSignature.getAuthPath().get(i3), hashTreeAddress);
                xMSSNodeArr[1] = randomizeHash;
                xMSSNodeArr[1] = new XMSSNode(randomizeHash.getHeight() + 1, xMSSNodeArr[1].getValue());
            } else {
                hashTreeAddress = (HashTreeAddress) ((HashTreeAddress.Builder) withTreeHeight.withTreeIndex((treeIndex - 1) / 2).withKeyAndMask(hashTreeAddress2.getKeyAndMask())).build();
                XMSSNode randomizeHash2 = XMSSNodeUtil.randomizeHash(wOTSPlus, (XMSSNode) xMSSReducedSignature.getAuthPath().get(i3), xMSSNodeArr[0], hashTreeAddress);
                xMSSNodeArr[1] = randomizeHash2;
                xMSSNodeArr[1] = new XMSSNode(randomizeHash2.getHeight() + 1, xMSSNodeArr[1].getValue());
            }
            xMSSNodeArr[0] = xMSSNodeArr[1];
        }
        return xMSSNodeArr[0];
    }
}

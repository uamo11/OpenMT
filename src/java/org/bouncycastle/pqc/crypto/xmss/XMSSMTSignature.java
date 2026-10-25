package org.bouncycastle.pqc.crypto.xmss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Encodable;

/* loaded from: classes2.dex */
public final class XMSSMTSignature implements XMSSStoreableObjectInterface, Encodable {
    public final long index;
    public final XMSSMTParameters params;
    public final byte[] random;
    public final List reducedSignatures;

    public class Builder {
        public final XMSSMTParameters params;
        public long index = 0;
        public byte[] random = null;
        public List reducedSignatures = null;
        public byte[] signature = null;

        public Builder(XMSSMTParameters xMSSMTParameters) {
            this.params = xMSSMTParameters;
        }

        public XMSSMTSignature build() {
            return new XMSSMTSignature(this);
        }

        public Builder withIndex(long j) {
            this.index = j;
            return this;
        }

        public Builder withRandom(byte[] bArr) {
            this.random = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withReducedSignatures(List list) {
            this.reducedSignatures = list;
            return this;
        }

        public Builder withSignature(byte[] bArr) {
            this.signature = Arrays.clone(bArr);
            return this;
        }
    }

    public XMSSMTSignature(Builder builder) {
        XMSSMTParameters xMSSMTParameters = builder.params;
        this.params = xMSSMTParameters;
        if (xMSSMTParameters == null) {
            throw new NullPointerException("params == null");
        }
        int treeDigestSize = xMSSMTParameters.getTreeDigestSize();
        byte[] bArr = builder.signature;
        if (bArr == null) {
            this.index = builder.index;
            byte[] bArr2 = builder.random;
            if (bArr2 == null) {
                this.random = new byte[treeDigestSize];
            } else {
                if (bArr2.length != treeDigestSize) {
                    throw new IllegalArgumentException("size of random needs to be equal to size of digest");
                }
                this.random = bArr2;
            }
            List list = builder.reducedSignatures;
            if (list != null) {
                this.reducedSignatures = list;
                return;
            } else {
                this.reducedSignatures = new ArrayList();
                return;
            }
        }
        int len = xMSSMTParameters.getWOTSPlus().getParams().getLen();
        int ceil = (int) Math.ceil(xMSSMTParameters.getHeight() / 8.0d);
        int height = ((xMSSMTParameters.getHeight() / xMSSMTParameters.getLayers()) + len) * treeDigestSize;
        if (bArr.length != ceil + treeDigestSize + (xMSSMTParameters.getLayers() * height)) {
            throw new IllegalArgumentException("signature has wrong size");
        }
        long bytesToXBigEndian = XMSSUtil.bytesToXBigEndian(bArr, 0, ceil);
        this.index = bytesToXBigEndian;
        if (!XMSSUtil.isIndexValid(xMSSMTParameters.getHeight(), bytesToXBigEndian)) {
            throw new IllegalArgumentException("index out of bounds");
        }
        this.random = XMSSUtil.extractBytesAtOffset(bArr, ceil, treeDigestSize);
        this.reducedSignatures = new ArrayList();
        for (int i = ceil + treeDigestSize; i < bArr.length; i += height) {
            this.reducedSignatures.add(new XMSSReducedSignature.Builder(this.params.getXMSSParameters()).withReducedSignature(XMSSUtil.extractBytesAtOffset(bArr, i, height)).build());
        }
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        return toByteArray();
    }

    public long getIndex() {
        return this.index;
    }

    public byte[] getRandom() {
        return XMSSUtil.cloneArray(this.random);
    }

    public List getReducedSignatures() {
        return this.reducedSignatures;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface
    public byte[] toByteArray() {
        int treeDigestSize = this.params.getTreeDigestSize();
        int len = this.params.getWOTSPlus().getParams().getLen();
        int ceil = (int) Math.ceil(this.params.getHeight() / 8.0d);
        int height = ((this.params.getHeight() / this.params.getLayers()) + len) * treeDigestSize;
        byte[] bArr = new byte[ceil + treeDigestSize + (this.params.getLayers() * height)];
        XMSSUtil.copyBytesAtOffset(bArr, XMSSUtil.toBytesBigEndian(this.index, ceil), 0);
        XMSSUtil.copyBytesAtOffset(bArr, this.random, ceil);
        int i = ceil + treeDigestSize;
        Iterator it = this.reducedSignatures.iterator();
        while (it.hasNext()) {
            XMSSUtil.copyBytesAtOffset(bArr, ((XMSSReducedSignature) it.next()).toByteArray(), i);
            i += height;
        }
        return bArr;
    }
}

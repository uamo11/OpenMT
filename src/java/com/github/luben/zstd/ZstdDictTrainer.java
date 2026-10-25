package com.github.luben.zstd;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ZstdDictTrainer {
    public final int allocatedSize;
    public final int dictSize;
    public long filledSize;
    public int level;
    public final List sampleSizes;
    public final ByteBuffer trainingSamples;

    public synchronized boolean addSample(byte[] bArr) {
        if (this.filledSize + bArr.length > this.allocatedSize) {
            return false;
        }
        this.trainingSamples.put(bArr);
        this.sampleSizes.add(Integer.valueOf(bArr.length));
        this.filledSize += bArr.length;
        return true;
    }

    public ZstdDictTrainer(int i, int i2) {
        this(i, i2, Zstd.defaultCompressionLevel());
    }

    public ZstdDictTrainer(int i, int i2, int i3) {
        this.trainingSamples = ByteBuffer.allocateDirect(i);
        this.sampleSizes = new ArrayList();
        this.allocatedSize = i;
        this.dictSize = i2;
        this.level = i3;
    }

    public ByteBuffer trainSamplesDirect() {
        return trainSamplesDirect(false);
    }

    public synchronized ByteBuffer trainSamplesDirect(boolean z) {
        ByteBuffer allocateDirect;
        allocateDirect = ByteBuffer.allocateDirect(this.dictSize);
        long trainFromBufferDirect = Zstd.trainFromBufferDirect(this.trainingSamples, copyToIntArray(this.sampleSizes), allocateDirect, z, this.level);
        if (Zstd.isError(trainFromBufferDirect)) {
            allocateDirect.limit(0);
            throw new ZstdException(trainFromBufferDirect);
        }
        allocateDirect.limit(Long.valueOf(trainFromBufferDirect).intValue());
        return allocateDirect;
    }

    public byte[] trainSamples() {
        return trainSamples(false);
    }

    public byte[] trainSamples(boolean z) {
        ByteBuffer trainSamplesDirect = trainSamplesDirect(z);
        byte[] bArr = new byte[trainSamplesDirect.remaining()];
        trainSamplesDirect.get(bArr);
        return bArr;
    }

    private int[] copyToIntArray(List list) {
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        return iArr;
    }
}

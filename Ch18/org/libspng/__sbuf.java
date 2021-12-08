// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class __sbuf {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("_base"),
        C_INT.withName("_size"),
        MemoryLayout.paddingLayout(32)
    ).withName("__sbuf");
    public static MemoryLayout $LAYOUT() {
        return __sbuf.$struct$LAYOUT;
    }
    static final VarHandle _base$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("_base")));
    public static VarHandle _base$VH() {
        return __sbuf._base$VH;
    }
    public static MemoryAddress _base$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)__sbuf._base$VH.get(seg);
    }
    public static void _base$set( MemorySegment seg, MemoryAddress x) {
        __sbuf._base$VH.set(seg, x);
    }
    public static MemoryAddress _base$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)__sbuf._base$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _base$set(MemorySegment seg, long index, MemoryAddress x) {
        __sbuf._base$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle _size$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("_size"));
    public static VarHandle _size$VH() {
        return __sbuf._size$VH;
    }
    public static int _size$get(MemorySegment seg) {
        return (int)__sbuf._size$VH.get(seg);
    }
    public static void _size$set( MemorySegment seg, int x) {
        __sbuf._size$VH.set(seg, x);
    }
    public static int _size$get(MemorySegment seg, long index) {
        return (int)__sbuf._size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void _size$set(MemorySegment seg, long index, int x) {
        __sbuf._size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.ofScope(scope)); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.ofScope(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}



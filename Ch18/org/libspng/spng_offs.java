// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class spng_offs {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("x"),
        C_INT.withName("y"),
        C_CHAR.withName("unit_specifier"),
        MemoryLayout.paddingLayout(24)
    ).withName("spng_offs");
    public static MemoryLayout $LAYOUT() {
        return spng_offs.$struct$LAYOUT;
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return spng_offs.x$VH;
    }
    public static int x$get(MemorySegment seg) {
        return (int)spng_offs.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, int x) {
        spng_offs.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)spng_offs.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        spng_offs.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return spng_offs.y$VH;
    }
    public static int y$get(MemorySegment seg) {
        return (int)spng_offs.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, int x) {
        spng_offs.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)spng_offs.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        spng_offs.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle unit_specifier$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("unit_specifier"));
    public static VarHandle unit_specifier$VH() {
        return spng_offs.unit_specifier$VH;
    }
    public static byte unit_specifier$get(MemorySegment seg) {
        return (byte)spng_offs.unit_specifier$VH.get(seg);
    }
    public static void unit_specifier$set( MemorySegment seg, byte x) {
        spng_offs.unit_specifier$VH.set(seg, x);
    }
    public static byte unit_specifier$get(MemorySegment seg, long index) {
        return (byte)spng_offs.unit_specifier$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void unit_specifier$set(MemorySegment seg, long index, byte x) {
        spng_offs.unit_specifier$VH.set(seg.asSlice(index*sizeof()), x);
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



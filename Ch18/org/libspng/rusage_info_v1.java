// Generated by jextract

package org.libspng;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class rusage_info_v1 {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(16, C_CHAR).withName("ri_uuid"),
        C_LONG_LONG.withName("ri_user_time"),
        C_LONG_LONG.withName("ri_system_time"),
        C_LONG_LONG.withName("ri_pkg_idle_wkups"),
        C_LONG_LONG.withName("ri_interrupt_wkups"),
        C_LONG_LONG.withName("ri_pageins"),
        C_LONG_LONG.withName("ri_wired_size"),
        C_LONG_LONG.withName("ri_resident_size"),
        C_LONG_LONG.withName("ri_phys_footprint"),
        C_LONG_LONG.withName("ri_proc_start_abstime"),
        C_LONG_LONG.withName("ri_proc_exit_abstime"),
        C_LONG_LONG.withName("ri_child_user_time"),
        C_LONG_LONG.withName("ri_child_system_time"),
        C_LONG_LONG.withName("ri_child_pkg_idle_wkups"),
        C_LONG_LONG.withName("ri_child_interrupt_wkups"),
        C_LONG_LONG.withName("ri_child_pageins"),
        C_LONG_LONG.withName("ri_child_elapsed_abstime")
    ).withName("rusage_info_v1");
    public static MemoryLayout $LAYOUT() {
        return rusage_info_v1.$struct$LAYOUT;
    }
    public static MemorySegment ri_uuid$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle ri_user_time$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_user_time"));
    public static VarHandle ri_user_time$VH() {
        return rusage_info_v1.ri_user_time$VH;
    }
    public static long ri_user_time$get(MemorySegment seg) {
        return (long)rusage_info_v1.ri_user_time$VH.get(seg);
    }
    public static void ri_user_time$set( MemorySegment seg, long x) {
        rusage_info_v1.ri_user_time$VH.set(seg, x);
    }
    public static long ri_user_time$get(MemorySegment seg, long index) {
        return (long)rusage_info_v1.ri_user_time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_user_time$set(MemorySegment seg, long index, long x) {
        rusage_info_v1.ri_user_time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_system_time$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_system_time"));
    public static VarHandle ri_system_time$VH() {
        return rusage_info_v1.ri_system_time$VH;
    }
    public static long ri_system_time$get(MemorySegment seg) {
        return (long)rusage_info_v1.ri_system_time$VH.get(seg);
    }
    public static void ri_system_time$set( MemorySegment seg, long x) {
        rusage_info_v1.ri_system_time$VH.set(seg, x);
    }
    public static long ri_system_time$get(MemorySegment seg, long index) {
        return (long)rusage_info_v1.ri_system_time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_system_time$set(MemorySegment seg, long index, long x) {
        rusage_info_v1.ri_system_time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_pkg_idle_wkups$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_pkg_idle_wkups"));
    public static VarHandle ri_pkg_idle_wkups$VH() {
        return rusage_info_v1.ri_pkg_idle_wkups$VH;
    }
    public static long ri_pkg_idle_wkups$get(MemorySegment seg) {
        return (long)rusage_info_v1.ri_pkg_idle_wkups$VH.get(seg);
    }
    public static void ri_pkg_idle_wkups$set( MemorySegment seg, long x) {
        rusage_info_v1.ri_pkg_idle_wkups$VH.set(seg, x);
    }
    public static long ri_pkg_idle_wkups$get(MemorySegment seg, long index) {
        return (long)rusage_info_v1.ri_pkg_idle_wkups$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_pkg_idle_wkups$set(MemorySegment seg, long index, long x) {
        rusage_info_v1.ri_pkg_idle_wkups$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_interrupt_wkups$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_interrupt_wkups"));
    public static VarHandle ri_interrupt_wkups$VH() {
        return rusage_info_v1.ri_interrupt_wkups$VH;
    }
    public static long ri_interrupt_wkups$get(MemorySegment seg) {
        return (long)rusage_info_v1.ri_interrupt_wkups$VH.get(seg);
    }
    public static void ri_interrupt_wkups$set( MemorySegment seg, long x) {
        rusage_info_v1.ri_interrupt_wkups$VH.set(seg, x);
    }
    public static long ri_interrupt_wkups$get(MemorySegment seg, long index) {
        return (long)rusage_info_v1.ri_interrupt_wkups$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_interrupt_wkups$set(MemorySegment seg, long index, long x) {
        rusage_info_v1.ri_interrupt_wkups$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_pageins$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_pageins"));
    public static VarHandle ri_pageins$VH() {
        return rusage_info_v1.ri_pageins$VH;
    }
    public static long ri_pageins$get(MemorySegment seg) {
        return (long)rusage_info_v1.ri_pageins$VH.get(seg);
    }
    public static void ri_pageins$set( MemorySegment seg, long x) {
        rusage_info_v1.ri_pageins$VH.set(seg, x);
    }
    public static long ri_pageins$get(MemorySegment seg, long index) {
        return (long)rusage_info_v1.ri_pageins$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_pageins$set(MemorySegment seg, long index, long x) {
        rusage_info_v1.ri_pageins$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_wired_size$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_wired_size"));
    public static VarHandle ri_wired_size$VH() {
        return rusage_info_v1.ri_wired_size$VH;
    }
    public static long ri_wired_size$get(MemorySegment seg) {
        return (long)rusage_info_v1.ri_wired_size$VH.get(seg);
    }
    public static void ri_wired_size$set( MemorySegment seg, long x) {
        rusage_info_v1.ri_wired_size$VH.set(seg, x);
    }
    public static long ri_wired_size$get(MemorySegment seg, long index) {
        return (long)rusage_info_v1.ri_wired_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_wired_size$set(MemorySegment seg, long index, long x) {
        rusage_info_v1.ri_wired_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_resident_size$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_resident_size"));
    public static VarHandle ri_resident_size$VH() {
        return rusage_info_v1.ri_resident_size$VH;
    }
    public static long ri_resident_size$get(MemorySegment seg) {
        return (long)rusage_info_v1.ri_resident_size$VH.get(seg);
    }
    public static void ri_resident_size$set( MemorySegment seg, long x) {
        rusage_info_v1.ri_resident_size$VH.set(seg, x);
    }
    public static long ri_resident_size$get(MemorySegment seg, long index) {
        return (long)rusage_info_v1.ri_resident_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_resident_size$set(MemorySegment seg, long index, long x) {
        rusage_info_v1.ri_resident_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_phys_footprint$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_phys_footprint"));
    public static VarHandle ri_phys_footprint$VH() {
        return rusage_info_v1.ri_phys_footprint$VH;
    }
    public static long ri_phys_footprint$get(MemorySegment seg) {
        return (long)rusage_info_v1.ri_phys_footprint$VH.get(seg);
    }
    public static void ri_phys_footprint$set( MemorySegment seg, long x) {
        rusage_info_v1.ri_phys_footprint$VH.set(seg, x);
    }
    public static long ri_phys_footprint$get(MemorySegment seg, long index) {
        return (long)rusage_info_v1.ri_phys_footprint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_phys_footprint$set(MemorySegment seg, long index, long x) {
        rusage_info_v1.ri_phys_footprint$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_proc_start_abstime$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_proc_start_abstime"));
    public static VarHandle ri_proc_start_abstime$VH() {
        return rusage_info_v1.ri_proc_start_abstime$VH;
    }
    public static long ri_proc_start_abstime$get(MemorySegment seg) {
        return (long)rusage_info_v1.ri_proc_start_abstime$VH.get(seg);
    }
    public static void ri_proc_start_abstime$set( MemorySegment seg, long x) {
        rusage_info_v1.ri_proc_start_abstime$VH.set(seg, x);
    }
    public static long ri_proc_start_abstime$get(MemorySegment seg, long index) {
        return (long)rusage_info_v1.ri_proc_start_abstime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_proc_start_abstime$set(MemorySegment seg, long index, long x) {
        rusage_info_v1.ri_proc_start_abstime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_proc_exit_abstime$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_proc_exit_abstime"));
    public static VarHandle ri_proc_exit_abstime$VH() {
        return rusage_info_v1.ri_proc_exit_abstime$VH;
    }
    public static long ri_proc_exit_abstime$get(MemorySegment seg) {
        return (long)rusage_info_v1.ri_proc_exit_abstime$VH.get(seg);
    }
    public static void ri_proc_exit_abstime$set( MemorySegment seg, long x) {
        rusage_info_v1.ri_proc_exit_abstime$VH.set(seg, x);
    }
    public static long ri_proc_exit_abstime$get(MemorySegment seg, long index) {
        return (long)rusage_info_v1.ri_proc_exit_abstime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_proc_exit_abstime$set(MemorySegment seg, long index, long x) {
        rusage_info_v1.ri_proc_exit_abstime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_child_user_time$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_child_user_time"));
    public static VarHandle ri_child_user_time$VH() {
        return rusage_info_v1.ri_child_user_time$VH;
    }
    public static long ri_child_user_time$get(MemorySegment seg) {
        return (long)rusage_info_v1.ri_child_user_time$VH.get(seg);
    }
    public static void ri_child_user_time$set( MemorySegment seg, long x) {
        rusage_info_v1.ri_child_user_time$VH.set(seg, x);
    }
    public static long ri_child_user_time$get(MemorySegment seg, long index) {
        return (long)rusage_info_v1.ri_child_user_time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_child_user_time$set(MemorySegment seg, long index, long x) {
        rusage_info_v1.ri_child_user_time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_child_system_time$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_child_system_time"));
    public static VarHandle ri_child_system_time$VH() {
        return rusage_info_v1.ri_child_system_time$VH;
    }
    public static long ri_child_system_time$get(MemorySegment seg) {
        return (long)rusage_info_v1.ri_child_system_time$VH.get(seg);
    }
    public static void ri_child_system_time$set( MemorySegment seg, long x) {
        rusage_info_v1.ri_child_system_time$VH.set(seg, x);
    }
    public static long ri_child_system_time$get(MemorySegment seg, long index) {
        return (long)rusage_info_v1.ri_child_system_time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_child_system_time$set(MemorySegment seg, long index, long x) {
        rusage_info_v1.ri_child_system_time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_child_pkg_idle_wkups$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_child_pkg_idle_wkups"));
    public static VarHandle ri_child_pkg_idle_wkups$VH() {
        return rusage_info_v1.ri_child_pkg_idle_wkups$VH;
    }
    public static long ri_child_pkg_idle_wkups$get(MemorySegment seg) {
        return (long)rusage_info_v1.ri_child_pkg_idle_wkups$VH.get(seg);
    }
    public static void ri_child_pkg_idle_wkups$set( MemorySegment seg, long x) {
        rusage_info_v1.ri_child_pkg_idle_wkups$VH.set(seg, x);
    }
    public static long ri_child_pkg_idle_wkups$get(MemorySegment seg, long index) {
        return (long)rusage_info_v1.ri_child_pkg_idle_wkups$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_child_pkg_idle_wkups$set(MemorySegment seg, long index, long x) {
        rusage_info_v1.ri_child_pkg_idle_wkups$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_child_interrupt_wkups$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_child_interrupt_wkups"));
    public static VarHandle ri_child_interrupt_wkups$VH() {
        return rusage_info_v1.ri_child_interrupt_wkups$VH;
    }
    public static long ri_child_interrupt_wkups$get(MemorySegment seg) {
        return (long)rusage_info_v1.ri_child_interrupt_wkups$VH.get(seg);
    }
    public static void ri_child_interrupt_wkups$set( MemorySegment seg, long x) {
        rusage_info_v1.ri_child_interrupt_wkups$VH.set(seg, x);
    }
    public static long ri_child_interrupt_wkups$get(MemorySegment seg, long index) {
        return (long)rusage_info_v1.ri_child_interrupt_wkups$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_child_interrupt_wkups$set(MemorySegment seg, long index, long x) {
        rusage_info_v1.ri_child_interrupt_wkups$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_child_pageins$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_child_pageins"));
    public static VarHandle ri_child_pageins$VH() {
        return rusage_info_v1.ri_child_pageins$VH;
    }
    public static long ri_child_pageins$get(MemorySegment seg) {
        return (long)rusage_info_v1.ri_child_pageins$VH.get(seg);
    }
    public static void ri_child_pageins$set( MemorySegment seg, long x) {
        rusage_info_v1.ri_child_pageins$VH.set(seg, x);
    }
    public static long ri_child_pageins$get(MemorySegment seg, long index) {
        return (long)rusage_info_v1.ri_child_pageins$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_child_pageins$set(MemorySegment seg, long index, long x) {
        rusage_info_v1.ri_child_pageins$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ri_child_elapsed_abstime$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ri_child_elapsed_abstime"));
    public static VarHandle ri_child_elapsed_abstime$VH() {
        return rusage_info_v1.ri_child_elapsed_abstime$VH;
    }
    public static long ri_child_elapsed_abstime$get(MemorySegment seg) {
        return (long)rusage_info_v1.ri_child_elapsed_abstime$VH.get(seg);
    }
    public static void ri_child_elapsed_abstime$set( MemorySegment seg, long x) {
        rusage_info_v1.ri_child_elapsed_abstime$VH.set(seg, x);
    }
    public static long ri_child_elapsed_abstime$get(MemorySegment seg, long index) {
        return (long)rusage_info_v1.ri_child_elapsed_abstime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ri_child_elapsed_abstime$set(MemorySegment seg, long index, long x) {
        rusage_info_v1.ri_child_elapsed_abstime$VH.set(seg.asSlice(index*sizeof()), x);
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



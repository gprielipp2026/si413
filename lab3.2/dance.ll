; ModuleID = 'preamble.c'
source_filename = "preamble.c"
target datalayout = "e-m:e-p270:32:32-p271:32:32-p272:64:64-i64:64-i128:128-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

@stdin = external global ptr, align 8
@stderr = external global ptr, align 8
@.str = private unnamed_addr constant [49 x i8] c"Runtime error: Got EOF when attempting to input\0A\00", align 1
@.str.1 = private unnamed_addr constant [5 x i8] c"True\00", align 1
@.str.2 = private unnamed_addr constant [6 x i8] c"False\00", align 1

; Function Attrs: noinline nounwind optnone uwtable
define dso_local ptr @assign(ptr noundef %0) #0 {
  %2 = alloca ptr, align 8
  %3 = alloca i64, align 8
  %4 = alloca ptr, align 8
  store ptr %0, ptr %2, align 8
  %5 = load ptr, ptr %2, align 8
  %6 = call i64 @strlen(ptr noundef %5) #6
  store i64 %6, ptr %3, align 8
  %7 = load i64, ptr %3, align 8
  %8 = add nsw i64 %7, 1
  %9 = mul i64 1, %8
  %10 = call noalias ptr @malloc(i64 noundef %9) #7
  store ptr %10, ptr %4, align 8
  %11 = load ptr, ptr %4, align 8
  %12 = load ptr, ptr %2, align 8
  %13 = call ptr @strcpy(ptr noundef %11, ptr noundef %12) #8
  %14 = load ptr, ptr %4, align 8
  ret ptr %14
}

; Function Attrs: nounwind willreturn memory(read)
declare i64 @strlen(ptr noundef) #1

; Function Attrs: nounwind allocsize(0)
declare noalias ptr @malloc(i64 noundef) #2

; Function Attrs: nounwind
declare ptr @strcpy(ptr noundef, ptr noundef) #3

; Function Attrs: noinline nounwind optnone uwtable
define dso_local ptr @reassign(ptr noundef %0, ptr noundef %1) #0 {
  %3 = alloca ptr, align 8
  %4 = alloca ptr, align 8
  store ptr %0, ptr %3, align 8
  store ptr %1, ptr %4, align 8
  %5 = load ptr, ptr %3, align 8
  %6 = load ptr, ptr %5, align 8
  call void @free(ptr noundef %6) #8
  %7 = load ptr, ptr %4, align 8
  %8 = call ptr @assign(ptr noundef %7)
  ret ptr %8
}

; Function Attrs: nounwind
declare void @free(ptr noundef) #3

; Function Attrs: noinline nounwind optnone uwtable
define dso_local ptr @reverse_string(ptr noundef %0) #0 {
  %2 = alloca ptr, align 8
  %3 = alloca i32, align 4
  %4 = alloca ptr, align 8
  %5 = alloca i32, align 4
  store ptr %0, ptr %2, align 8
  %6 = load ptr, ptr %2, align 8
  %7 = call i64 @strlen(ptr noundef %6) #6
  %8 = trunc i64 %7 to i32
  store i32 %8, ptr %3, align 4
  %9 = load i32, ptr %3, align 4
  %10 = add nsw i32 %9, 1
  %11 = sext i32 %10 to i64
  %12 = call noalias ptr @malloc(i64 noundef %11) #7
  store ptr %12, ptr %4, align 8
  store i32 0, ptr %5, align 4
  br label %13

13:                                               ; preds = %30, %1
  %14 = load i32, ptr %5, align 4
  %15 = load i32, ptr %3, align 4
  %16 = icmp slt i32 %14, %15
  br i1 %16, label %17, label %33

17:                                               ; preds = %13
  %18 = load ptr, ptr %2, align 8
  %19 = load i32, ptr %3, align 4
  %20 = load i32, ptr %5, align 4
  %21 = sub nsw i32 %19, %20
  %22 = sub nsw i32 %21, 1
  %23 = sext i32 %22 to i64
  %24 = getelementptr inbounds i8, ptr %18, i64 %23
  %25 = load i8, ptr %24, align 1
  %26 = load ptr, ptr %4, align 8
  %27 = load i32, ptr %5, align 4
  %28 = sext i32 %27 to i64
  %29 = getelementptr inbounds i8, ptr %26, i64 %28
  store i8 %25, ptr %29, align 1
  br label %30

30:                                               ; preds = %17
  %31 = load i32, ptr %5, align 4
  %32 = add nsw i32 %31, 1
  store i32 %32, ptr %5, align 4
  br label %13, !llvm.loop !6

33:                                               ; preds = %13
  %34 = load ptr, ptr %4, align 8
  %35 = load i32, ptr %3, align 4
  %36 = sext i32 %35 to i64
  %37 = getelementptr inbounds i8, ptr %34, i64 %36
  store i8 0, ptr %37, align 1
  %38 = load ptr, ptr %4, align 8
  ret ptr %38
}

; Function Attrs: noinline nounwind optnone uwtable
define dso_local ptr @concat_strings(ptr noundef %0, ptr noundef %1) #0 {
  %3 = alloca ptr, align 8
  %4 = alloca ptr, align 8
  %5 = alloca ptr, align 8
  store ptr %0, ptr %3, align 8
  store ptr %1, ptr %4, align 8
  %6 = load ptr, ptr %3, align 8
  %7 = call i64 @strlen(ptr noundef %6) #6
  %8 = load ptr, ptr %4, align 8
  %9 = call i64 @strlen(ptr noundef %8) #6
  %10 = add i64 %7, %9
  %11 = add i64 %10, 1
  %12 = call noalias ptr @malloc(i64 noundef %11) #7
  store ptr %12, ptr %5, align 8
  %13 = load ptr, ptr %5, align 8
  %14 = load ptr, ptr %3, align 8
  %15 = call ptr @strcpy(ptr noundef %13, ptr noundef %14) #8
  %16 = load ptr, ptr %5, align 8
  %17 = load ptr, ptr %4, align 8
  %18 = call ptr @strcat(ptr noundef %16, ptr noundef %17) #8
  %19 = load ptr, ptr %5, align 8
  ret ptr %19
}

; Function Attrs: nounwind
declare ptr @strcat(ptr noundef, ptr noundef) #3

; Function Attrs: noinline nounwind optnone uwtable
define dso_local ptr @read_line() #0 {
  %1 = alloca ptr, align 8
  %2 = alloca i64, align 8
  %3 = alloca i64, align 8
  store ptr null, ptr %1, align 8
  %4 = load ptr, ptr @stdin, align 8
  %5 = call i64 @getline(ptr noundef %1, ptr noundef %2, ptr noundef %4)
  store i64 %5, ptr %3, align 8
  %6 = load i64, ptr %3, align 8
  %7 = icmp sle i64 %6, 0
  br i1 %7, label %8, label %11

8:                                                ; preds = %0
  %9 = load ptr, ptr @stderr, align 8
  %10 = call i32 (ptr, ptr, ...) @fprintf(ptr noundef %9, ptr noundef @.str) #8
  call void @exit(i32 noundef 7) #9
  unreachable

11:                                               ; preds = %0
  %12 = load ptr, ptr %1, align 8
  %13 = load i64, ptr %3, align 8
  %14 = sub nsw i64 %13, 1
  %15 = getelementptr inbounds i8, ptr %12, i64 %14
  store i8 0, ptr %15, align 1
  %16 = load ptr, ptr %1, align 8
  ret ptr %16
}

declare i64 @getline(ptr noundef, ptr noundef, ptr noundef) #4

; Function Attrs: nounwind
declare i32 @fprintf(ptr noundef, ptr noundef, ...) #3

; Function Attrs: noreturn nounwind
declare void @exit(i32 noundef) #5

; Function Attrs: noinline nounwind optnone uwtable
define dso_local void @print_bool(i1 noundef zeroext %0) #0 {
  %2 = alloca i8, align 1
  %3 = zext i1 %0 to i8
  store i8 %3, ptr %2, align 1
  %4 = load i8, ptr %2, align 1
  %5 = trunc i8 %4 to i1
  br i1 %5, label %6, label %8

6:                                                ; preds = %1
  %7 = call i32 @puts(ptr noundef @.str.1)
  br label %10

8:                                                ; preds = %1
  %9 = call i32 @puts(ptr noundef @.str.2)
  br label %10

10:                                               ; preds = %8, %6
  ret void
}

declare i32 @puts(ptr noundef) #4

; Function Attrs: noinline nounwind optnone uwtable
define dso_local zeroext i1 @string_less(ptr noundef %0, ptr noundef %1) #0 {
  %3 = alloca ptr, align 8
  %4 = alloca ptr, align 8
  store ptr %0, ptr %3, align 8
  store ptr %1, ptr %4, align 8
  %5 = load ptr, ptr %3, align 8
  %6 = load ptr, ptr %4, align 8
  %7 = call i32 @strcmp(ptr noundef %5, ptr noundef %6) #6
  %8 = icmp slt i32 %7, 0
  ret i1 %8
}

; Function Attrs: nounwind willreturn memory(read)
declare i32 @strcmp(ptr noundef, ptr noundef) #1

; Function Attrs: noinline nounwind optnone uwtable
define dso_local zeroext i1 @string_contains(ptr noundef %0, ptr noundef %1) #0 {
  %3 = alloca ptr, align 8
  %4 = alloca ptr, align 8
  store ptr %0, ptr %3, align 8
  store ptr %1, ptr %4, align 8
  %5 = load ptr, ptr %3, align 8
  %6 = load ptr, ptr %4, align 8
  %7 = call ptr @strstr(ptr noundef %5, ptr noundef %6) #6
  %8 = icmp ne ptr %7, null
  ret i1 %8
}

; Function Attrs: nounwind willreturn memory(read)
declare ptr @strstr(ptr noundef, ptr noundef) #1

attributes #0 = { noinline nounwind optnone uwtable "frame-pointer"="all" "min-legal-vector-width"="0" "no-trapping-math"="true" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+cmov,+cx8,+fxsr,+mmx,+sse,+sse2,+x87" "tune-cpu"="generic" }
attributes #1 = { nounwind willreturn memory(read) "frame-pointer"="all" "no-trapping-math"="true" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+cmov,+cx8,+fxsr,+mmx,+sse,+sse2,+x87" "tune-cpu"="generic" }
attributes #2 = { nounwind allocsize(0) "frame-pointer"="all" "no-trapping-math"="true" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+cmov,+cx8,+fxsr,+mmx,+sse,+sse2,+x87" "tune-cpu"="generic" }
attributes #3 = { nounwind "frame-pointer"="all" "no-trapping-math"="true" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+cmov,+cx8,+fxsr,+mmx,+sse,+sse2,+x87" "tune-cpu"="generic" }
attributes #4 = { "frame-pointer"="all" "no-trapping-math"="true" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+cmov,+cx8,+fxsr,+mmx,+sse,+sse2,+x87" "tune-cpu"="generic" }
attributes #5 = { noreturn nounwind "frame-pointer"="all" "no-trapping-math"="true" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+cmov,+cx8,+fxsr,+mmx,+sse,+sse2,+x87" "tune-cpu"="generic" }
attributes #6 = { nounwind willreturn memory(read) }
attributes #7 = { nounwind allocsize(0) }
attributes #8 = { nounwind }
attributes #9 = { noreturn nounwind }

!llvm.module.flags = !{!0, !1, !2, !3, !4}
!llvm.ident = !{!5}

!0 = !{i32 1, !"wchar_size", i32 4}
!1 = !{i32 8, !"PIC Level", i32 2}
!2 = !{i32 7, !"PIE Level", i32 2}
!3 = !{i32 7, !"uwtable", i32 2}
!4 = !{i32 7, !"frame-pointer", i32 2}
!5 = !{!"Ubuntu clang version 22.0.0 (++20251015042503+856555bfd843-1~exp1~20251015042630.2731)"}
!6 = distinct !{!6, !7}
!7 = !{!"llvm.loop.mustprogress"}
declare ptr @strdup(ptr)

define i32 @main() {
  %reg1 = call ptr @strdup(ptr @lit1)
  call i32 @puts(ptr %reg1)
  call void @free(ptr %reg1)
  %reg2 = call ptr @read_line()
  %reg3 = call ptr @strdup(ptr @lit2)
  %reg4 = call ptr @concat_strings(ptr %reg2, ptr %reg3)
  call void @free(ptr %reg2)
  call void @free(ptr %reg3)
  %reg5 = call ptr @read_line()
  %reg6 = call ptr @concat_strings(ptr %reg4, ptr %reg5)
  call void @free(ptr %reg4)
  call void @free(ptr %reg5)
  %s.x_1 = alloca ptr
  %reg7 = call ptr @assign(ptr %reg6)
  store ptr %reg7, ptr %s.x_1
  call void @free(ptr %reg6)
  %reg8 = call ptr @strdup(ptr @lit3)
  %reg9 = load ptr, ptr %s.x_1
  %reg10 = call ptr @concat_strings(ptr %reg8, ptr %reg9)
  call void @free(ptr %reg8)
  call i32 @puts(ptr %reg10)
  call void @free(ptr %reg10)
  %reg11 = load ptr, ptr %s.x_1
  %reg12 = call ptr @strdup(ptr @lit4)
  %reg13 = call i1 @string_contains(ptr %reg11, ptr %reg12)
  call void @free(ptr %reg12)
  %b.y_1 = alloca i1
  store i1 %reg13, ptr %b.y_1
  %reg14 = load ptr, ptr %s.x_1
  %reg15 = call ptr @strdup(ptr @lit5)
  %reg16 = call i1 @string_less(ptr %reg14, ptr %reg15)
  call void @free(ptr %reg15)
  br i1 %reg16, label %if_1, label %else_1

if_1:
  %reg17 = load ptr, ptr %s.x_1
  %reg18 = call ptr @reverse_string(ptr %reg17)
  call i32 @puts(ptr %reg18)
  call void @free(ptr %reg18)
  %reg19 = and i1 false, false
  store i1 %reg19, ptr %b.y_1
  br label %done_1

else_1:
  br label %done_1

done_1:
  %reg20 = load i1, ptr %b.y_1
  call void @print_bool(i1 %reg20)
  %reg21 = load ptr, ptr %s.x_1
  %reg22 = call ptr @strdup(ptr @lit6)
  %reg23 = call i1 @string_contains(ptr %reg21, ptr %reg22)
  call void @free(ptr %reg22)
  %reg24 = alloca i1
  br i1 %reg23, label %true_2, label %false_2

true_2:
  %reg25 = load i1, ptr %b.y_1
  %reg26 = xor i1 %reg25, true
  store i1 %reg26, ptr %reg24
  br label %done_2

false_2:
  store i1 0, ptr %reg24
  br label %done_2

done_2:
  %reg27 = load i1, ptr %reg24
  call void @print_bool(i1 %reg27)
  %reg28 = call ptr @strdup(ptr @lit7)
  %s.timer_1 = alloca ptr
  %reg29 = call ptr @assign(ptr %reg28)
  store ptr %reg29, ptr %s.timer_1
  call void @free(ptr %reg28)
  br label %cond_3

cond_3:
  %reg30 = load ptr, ptr %s.timer_1
  %reg31 = call ptr @strdup(ptr @lit8)
  %reg32 = call i1 @string_contains(ptr %reg30, ptr %reg31)
  call void @free(ptr %reg31)
  %reg33 = xor i1 %reg32, true
  br i1 %reg33, label %loop_3, label %done_3

loop_3:
  %reg34 = load ptr, ptr %s.timer_1
  call i32 @puts(ptr %reg34)
  %reg35 = call ptr @strdup(ptr @lit9)
  call i32 @puts(ptr %reg35)
  call void @free(ptr %reg35)
  %reg36 = load ptr, ptr %s.timer_1
  %reg37 = call ptr @strdup(ptr @lit10)
  %reg38 = call ptr @concat_strings(ptr %reg36, ptr %reg37)
  call void @free(ptr %reg37)
  %reg39 = call ptr @reassign(ptr %s.timer_1, ptr %reg38)
  store ptr %reg39, ptr %s.timer_1
  call void @free(ptr %reg38)
  br label %cond_3

done_3:
  %reg40 = load ptr, ptr %s.timer_1
  call void @free(ptr %reg40)
  %reg41 = load ptr, ptr %s.x_1
  call void @free(ptr %reg41)
  ret i32 0
}
@lit1 = constant [22 x i8] c"enter two dance moves\00"
@lit2 = constant [2 x i8] c"m\00"
@lit3 = constant [14 x i8] c"Let's do the \00"
@lit4 = constant [3 x i8] c"mb\00"
@lit5 = constant [6 x i8] c"mambo\00"
@lit6 = constant [2 x i8] c"a\00"
@lit7 = constant [1 x i8] c"\00"
@lit8 = constant [4 x i8] c"...\00"
@lit9 = constant [4 x i8] c"cha\00"
@lit10 = constant [2 x i8] c".\00"

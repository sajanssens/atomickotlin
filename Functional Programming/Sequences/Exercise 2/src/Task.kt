// Sequences/Task2.kt
package sequencesExercise2

fun School.studentInstructors(
    student: Student
): Set<Instructor> =
    lessons
        .filter { student in it.students }
        .map { it.instructor }
        .toSet()

fun School.studentsOf(
    instructor: Instructor
): Set<Student> =
    lessons
        .filter { it.instructor == instructor }
        .flatMap { it.students }
        .toSet()

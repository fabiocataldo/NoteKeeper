package com.example.notekeeper

class DataManager {

    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()


    init {
        initializeCourses()
    }


    private fun initializeCourses(){

        var course = CourseInfo("android_intents", "Android Programming with intents")
        courses[course.courseId] = course

        course = CourseInfo("android_async", "Android Async Programming with intents")
        courses[course.courseId] = course

        course = CourseInfo("Java_Fundamentals", "Java Lang")
        courses.set(course.courseId, course)

        course = CourseInfo("Java_core", "Java Fundamentals: The Core Plataform")
        courses.set(course.courseId, course)
    }
}


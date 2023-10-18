class Nr2050ParallelCoursesIII {
    fun minimumTime(n: Int, relations: Array<IntArray>, time: IntArray): Int {
        val coursesMap = relations.groupBy({ it[1] }, { it[0] })
        val coursesEarliestEnd = arrayOfNulls<Int>(n + 1)
        fun getCourseTime(courseNumber: Int): Int = coursesEarliestEnd[courseNumber] ?: run {
            time[courseNumber - 1] + (coursesMap[courseNumber].orEmpty().fold(0) { acc, preCourseNumber ->
                acc.coerceAtLeast(getCourseTime(preCourseNumber))
            } )
        }.also { coursesEarliestEnd[courseNumber] = it }
        return (1..n).maxOf { getCourseTime(it) }
    }
}



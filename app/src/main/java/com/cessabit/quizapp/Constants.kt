package com.cessabit.quizapp

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong to ?",
            R.drawable.ic_flag_of_australia,
            "Australia",
            "Argentina",
            "New Zealand",
            "Armenia",
            1
        )
        questionsList.add(que1)
        val que2 = Question(
            1,
            "What country does this flag belong to ?",
            R.drawable.ic_flag_of_argentina,
            "India",
            "Argentina",
            "New Zealand",
            "Romania",
            2
        )
        questionsList.add(que2)
        val que3 = Question(
            1,
            "What country does this flag belong to ?",
            R.drawable.ic_flag_of_belgium,
            "India",
            "Argentina",
            "Belgium",
            "Australia",
            3
        )
        questionsList.add(que3)
        val que4 = Question(
            1,
            "What country does this flag belong to ?",
            R.drawable.ic_flag_of_brazil,
            "Brazil",
            "Australia",
            "Belgium",
            "India",
            1
        )
        questionsList.add(que4)
        val que5 = Question(
            1,
            "What country does this flag belong to ?",
            R.drawable.ic_flag_of_denmark,
            "Denmark",
            "Australia",
            "Brazil",
            "USA",
            1
        )
        questionsList.add(que5)
        return questionsList
    }
}
package com.cessabit.quizapp

object Constants {
    fun getQuestions():ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,"What country does this flag belong to ?",R.drawable.ic_flag_of_australia,"Australia","Argentina","New Zealand","Armenia",1

        )
        questionsList.add(que1)
        return questionsList
    }
}
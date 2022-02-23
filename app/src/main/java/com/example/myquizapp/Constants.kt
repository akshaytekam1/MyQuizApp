package com.example.myquizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String ="total_question"
    const val CORRECT_ANSWERS: String = "correct_answer"

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        //1
        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Australia",
            "USA",
            "England",
            "New zealand",
            1
        )
        questionList.add(que1)

        //2
        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Brazil",
            "Australia",
            "England",
            "New zealand",
            1
        )
        questionList.add(que2)

        //3
        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_cannada,
            "Canada",
            "Ireland",
            "USA",
            "New zealand",
            1
        )
        questionList.add(que3)

        //4
        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Denmark",
            "Greece",
            "England",
            "Mexico",
            1
        )
        questionList.add(que4)

        //5
        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_england,
            "England",
            "Canada",
            "England",
            "North Korea",
            1
        )
        questionList.add(que5)

        //6
        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_greece,
            "Greece",
            "Denmark",
            "Brazil",
            "India",
            1
        )
        questionList.add(que6)

        //7
        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_ireland,
            "Ireland",
            "Bhutan",
            "Pakistan",
            "Russia",
            1
        )
        questionList.add(que7)

        //8
        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_mexico,
            "Mexico",
            "China",
            "England",
            "Austria",
            1
        )
        questionList.add(que8)

        //9
        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_southkorea,
            "South Korea",
            "Japan",
            "south Africa",
            "Chad",
            1
        )
        questionList.add(que9)

        //10
        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_us,
            "USA",
            "Australia",
            "England",
            "New zealand",
            1
        )
        questionList.add(que10)

        return questionList
    }
}
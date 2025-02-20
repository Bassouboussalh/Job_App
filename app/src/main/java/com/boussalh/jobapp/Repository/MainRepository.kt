package com.boussalh.jobapp.Repository

import com.boussalh.jobapp.Model.JobModel

class MainRepository {
    //all of data in this class is for example, you can use your data with api service

    val location = listOf("LosAngles, USA", "NewYork,Usa")
    val category = listOf("all", "Acountant", "Programmer", "Write")

    val exampleText: String =
        "We are searching a talented and motivated this job to join our growing team. In this role, you will be responsible for this job and will be responsible for this job."
    val items = listOf(
        JobModel(
            "UI Designer",
            "ChabokSoft",
            "logo1",
            "Full-Time",
            "Remote",
            "Internship",
            "NewYork, USA",
            "\$38K - \$46K",
            "2",
            exampleText,
            exampleText
        ),
        JobModel(
            "Accountants",
            "KianSoft",
            "logo2",
            "Part-Time",
            "Remote",
            "in person",
            "LosAngles, USA",
            "\$26K - \$36K",
            "1",
            exampleText,
            exampleText
        ),
        JobModel(
            "The author of the news",
            "MakanSoft",
            "logo3",
            "Part-Time",
            "Remote",
            "Seniur level",
            "NewYork, USA",
            "\$20K - \$23K",
            "3",
            exampleText,
            exampleText
        ),
        JobModel(
            "Kotlin Programmer",
            "TestSoft",
            "logo4",
            "Full-Time",
            "Remote",
            "Internship",
            "LosAngles, USA",
            "\$38K - \$40K",
            "2",
            exampleText,
            exampleText
        )
    )
}
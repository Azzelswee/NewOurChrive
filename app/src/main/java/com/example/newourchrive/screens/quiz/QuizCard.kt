package com.example.newourchrive.screens.quiz

import androidx.activity.compose.BackHandler
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Ease
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavController
import com.example.newourchrive.R
import com.example.newourchrive.listOfQuestions.aiElectronicsQuestions
import com.example.newourchrive.listOfQuestions.analogElectronicsQuestions
import com.example.newourchrive.listOfQuestions.communicationSystemsQuestions
import com.example.newourchrive.listOfQuestions.digitalElectronicsQuestions
import com.example.newourchrive.listOfQuestions.dspElectronicsQuestions
import com.example.newourchrive.listOfQuestions.embeddedSystemsQuestions
import com.example.newourchrive.listOfQuestions.microwaveRadarQuestions
import com.example.newourchrive.listOfQuestions.quantumComputingQuestions
import com.example.newourchrive.listOfQuestions.questionNetAndSec
import com.example.newourchrive.listOfQuestions.questionPowerGen
import com.example.newourchrive.listOfQuestions.questionsAI
import com.example.newourchrive.listOfQuestions.questionsArduino
import com.example.newourchrive.listOfQuestions.questionsCV
import com.example.newourchrive.listOfQuestions.questionsCircuit
import com.example.newourchrive.listOfQuestions.questionsControl
import com.example.newourchrive.listOfQuestions.questionsControlAndMotionPlan
import com.example.newourchrive.listOfQuestions.questionsCySec
import com.example.newourchrive.listOfQuestions.questionsDAA
import com.example.newourchrive.listOfQuestions.questionsDBMS
import com.example.newourchrive.listOfQuestions.questionsDSA
import com.example.newourchrive.listOfQuestions.questionsEmergingTech
import com.example.newourchrive.listOfQuestions.questionsHRI
import com.example.newourchrive.listOfQuestions.questionsLocalizationAndMapping
import com.example.newourchrive.listOfQuestions.questionsML
import com.example.newourchrive.listOfQuestions.questionsMeasurement
import com.example.newourchrive.listOfQuestions.questionsPowerElectronics
import com.example.newourchrive.listOfQuestions.questionsProg
import com.example.newourchrive.listOfQuestions.questionsRenewEnergy
import com.example.newourchrive.listOfQuestions.questionsRobotApps
import com.example.newourchrive.listOfQuestions.questionsRoboticsFund
import com.example.newourchrive.listOfQuestions.questionsSafety
import com.example.newourchrive.listOfQuestions.questionsSoftEng
import com.example.newourchrive.listOfQuestions.questionsTrends
import com.example.newourchrive.listOfQuestions.questionsWebDev
import com.example.newourchrive.listOfQuestions.questionsdspPS
import com.example.newourchrive.listOfQuestions.semiconductorDevicesQuestions
import com.example.newourchrive.navigation.MainScreens
import com.example.newourchrive.screens.quiz.question.Question
import com.example.newourchrive.ui.theme.Gold
import com.example.newourchrive.ui.theme.Gray
import com.example.newourchrive.ui.theme.RedOrange
import kotlinx.coroutines.delay
import kotlin.random.Random


@Composable
fun QuizCard(
    navController: NavController,
    course: String?,
    program: String?
){
    var quizQuestions = emptyList<Question>()
    println("$course $program")
    when(program){
        "CS" -> {
            when(course){
                "DAA" -> quizQuestions = questionsDAA
                "CySec" -> quizQuestions = questionsCySec
                "Prog" -> quizQuestions = questionsProg
                "DSA" -> quizQuestions = questionsDSA
                "WebDev" -> quizQuestions = questionsWebDev
                "NetSec" -> quizQuestions = questionNetAndSec
                "DBMS" -> quizQuestions = questionsDBMS
                "ML" -> quizQuestions = questionsML
                "SE" -> quizQuestions = questionsSoftEng
            }
        }
        "R" -> {
            when(course){
                "AI" -> quizQuestions = questionsAI
                "A" -> quizQuestions = questionsArduino
                "RF" -> quizQuestions = questionsRoboticsFund
                "CV" -> quizQuestions = questionsCV
                "CMP" -> quizQuestions = questionsControlAndMotionPlan
                "LM" -> quizQuestions = questionsLocalizationAndMapping
                "HRI" -> quizQuestions = questionsHRI
                "RA" -> quizQuestions = questionsRobotApps
                "RT" -> quizQuestions = questionsTrends
            }
        }
        "EY" -> {
            when(course){
                "CRT" -> quizQuestions = questionsCircuit
                "S" -> quizQuestions = questionsSafety
                "PG" -> quizQuestions = questionPowerGen
                "RE" -> quizQuestions = questionsRenewEnergy
                "M" -> quizQuestions = questionsMeasurement
                "CRTL" -> quizQuestions = questionsControl
                "PE" -> quizQuestions = questionsPowerElectronics
                "ET" -> quizQuestions = questionsEmergingTech
                "DSPPS" -> quizQuestions = questionsdspPS
            }
        }
        "ES" -> {
            when(course){
                "AE" -> quizQuestions = analogElectronicsQuestions
                "DE" -> quizQuestions = digitalElectronicsQuestions
                "SCD" -> quizQuestions = semiconductorDevicesQuestions
                "DSPE" -> quizQuestions = dspElectronicsQuestions
                "CS" -> quizQuestions = communicationSystemsQuestions
                "MR" -> quizQuestions = microwaveRadarQuestions
                "ES" -> quizQuestions = embeddedSystemsQuestions
                "AI" -> quizQuestions = aiElectronicsQuestions
                "QC" -> quizQuestions = quantumComputingQuestions
            }
        }
    }
    val questions: ArrayList<Question> = ArrayList()
    quizQuestions.forEach {
        questions.add(it)
    }

    BackHandler {
        navController.popBackStack()
        navController.navigate(MainScreens.DASHBOARD.name)
    }
    QuestionCard(questions, course, navController = navController)


}

@Composable
fun QuestionCard(
    questions: ArrayList<Question>,
    course: String?,
    totalTime: Int = 10 ,
    navController: NavController
) {
    val answers: HashMap<Int, String> by remember {
        mutableStateOf(HashMap())
    }

    var tempQuestionList: ArrayList<Question> by remember {
        mutableStateOf(ArrayList())
    }
    var isNext by remember {
        mutableStateOf(false)
    }
    var questionSize by remember {
        mutableIntStateOf(questions.size)
    }

    var selectedOption by remember {
        mutableStateOf("")
    }

    var selectedQuestion by remember {
        mutableStateOf(questions.first())
    }

    val textMeasurer = rememberTextMeasurer()

    val redOrangeGradient = Brush.linearGradient(colors = listOf(Gold, RedOrange))
    var remainingTime by remember {
        mutableStateOf(totalTime)
    }
    var progress by remember {
        mutableFloatStateOf(1f)
    }


    val textLayoutResult =
        remember(remainingTime.toString()) { textMeasurer.measure(remainingTime.toString()) }

    // animation
    val progressAnimate by animateFloatAsState(
        targetValue = progress,
        animationSpec = tween(
            durationMillis = 1000,
            easing = LinearEasing
        ), label = "Circular bar Animation"
    )
    var count by remember {
        mutableIntStateOf(1)
    }
    val size by animateFloatAsState(
        targetValue = if (remainingTime == 0 && count <= 10) 0f else 1f,
        animationSpec = tween(
            durationMillis = 600,
            easing = Ease
        ), label = "Card Bounce Animation"
    )

    val targetColor by animateColorAsState(

        targetValue =
        if (remainingTime > 5) Color(0xFF4DCD79)
        else Color(0xFFFD1E00),
        animationSpec = tween(
            durationMillis = 1000,
            easing = LinearEasing
        ), label = "Color Animation"
    )




    LaunchedEffect(remainingTime, count) {

        if (remainingTime > 0) {
            delay(1000)
            remainingTime--
            progress = remainingTime.toFloat() / totalTime
        }
        if (remainingTime <= 0 && count < 10) {
            delay(500)
            selectedQuestion = questions.random()
            tempQuestionList.add(selectedQuestion)
            questions.remove(selectedQuestion)
            println(questions.contains(selectedQuestion))
            println(answers)
            println("Temp List $tempQuestionList")
            println("Perma List $questions")
            progress = remainingTime.toFloat() / totalTime
            remainingTime = totalTime
            count++

        }


    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(redOrangeGradient)
    ) {
        var isFinished by remember {
            mutableStateOf(false)
        }
        if (remainingTime <= 0 && count >= 10){

            LaunchedEffect(isFinished){
                delay(5000)
                isFinished = true
            }

            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){

                if(isFinished){
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ){
                        Text(
                            text = "${checkResults(answers, quizQuestions = tempQuestionList)}",
                            textAlign = TextAlign.Center,
                            fontSize = 50.sp,
                            color = Color.White,
                            style = MaterialTheme.typography.displayLarge,
                        )
                        Text(
                            text = "Correct Answers",
                            textAlign = TextAlign.Center,
                            fontSize = 30.sp,
                            color = Color.White,
                            style = MaterialTheme.typography.headlineLarge,
                        )
                        CorrectAnswers(tempQuestionList, answers, navController)

                    }
                    var launchCorrectAnswers by remember {
                        mutableStateOf(false)
                    }

                    var launchConfetti by remember {
                        mutableStateOf(true)
                    }
                    LaunchedEffect(key1 = launchConfetti, launchCorrectAnswers){
                        delay(5000)
                        launchCorrectAnswers = true
                        delay(30000)
                        launchConfetti = false
                    }

                    if(launchConfetti){
                        Confetti()
                    }


                } else {
                    Text(text = "Calculating Results...", color = Color.White, fontSize = 20.sp)

                    LinearProgressIndicator(
                        color = Color(0xFF1AF314),
                        strokeCap = StrokeCap.Round,
                        trackColor = Color.White,
                        modifier = Modifier.height(10.dp)
                    )
                    isFinished = false
                }

            }
        } else {
            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp)
                    .scale(size),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                ),
                border = BorderStroke(1.dp, Color.Black),

                ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
//                    if (course != null) {
//                        Text(
//                            text = course,
//                            modifier = Modifier
//                                .weight(1f)
//                                .padding(4.dp),
//                            textAlign = TextAlign.Center,
//                            fontSize = 20.sp,
//                            style = MaterialTheme.typography.displayLarge,
//                            color = Color.DarkGray
//                        )
//                    }


                    CircularProgressIndicator(
                        progress = { progressAnimate },
                        modifier = Modifier
                            .size(size = 70.dp)
                            .drawBehind {
                                drawText(
                                    textMeasurer = textMeasurer,
                                    text = "$remainingTime",
                                    topLeft = Offset(
                                        x = (center.x - (textLayoutResult.size.width / 2)) - 5,
                                        y = center.y - (textLayoutResult.size.height / 2) - 20
                                    ),
                                    style = TextStyle(
                                        textAlign = TextAlign.Center,
                                        fontFamily = FontFamily(
                                            Font(R.font.poppins_bold, FontWeight.Bold)
                                        ),
                                        fontSize = 25.sp,
                                        color = Gray
                                    )
                                )
                            },
                        color = targetColor,
                        strokeWidth = 5.dp,
                        trackColor = Color(0x11000000),
                        strokeCap = StrokeCap.Round
                    )

    //            Text(text = "Timer", modifier = Modifier
    //                .weight(1f)
    //                .background(Color.Cyan)
    //                .padding(4.dp), textAlign = TextAlign.Center, fontSize = 20.sp)
                    Text(
                        text = "$count/${questionSize} ",
                        modifier = Modifier
                            .wrapContentSize(),
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        letterSpacing = 5.sp
                    )

                }
                // Questions
                Column(
                    modifier = Modifier.padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    // Question
                    Text(
                        text = selectedQuestion.question,
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                    )

                    // Options
                    selectedQuestion.options.forEach { option ->
                        var colorBtn by remember {
                            mutableStateOf(RedOrange)
                        }
                        var isClicked by remember {
                            mutableStateOf(false)
                        }

                        LaunchedEffect(isClicked){
                            if(isClicked){
                                remainingTime = 0
                                isClicked = false
                            }


                        }
                        Button(
                            onClick = {
                                selectedOption = option
                                answers[selectedQuestion.questionID] = option
                                isClicked = true
                            },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(100.dp)
                                .padding(10.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor =
                                if (selectedOption == option){
                                    colorBtn
                                }
                                else {
                                    Color.White
                                },

                                contentColor = if (selectedOption == option) Color.White else Gray
                            ),
                            shape = RoundedCornerShape(10.dp),
                            border = BorderStroke(1.dp, Color.LightGray),
                            elevation = ButtonDefaults.buttonElevation(
                                pressedElevation = 20.dp,
                                focusedElevation = 10.dp,
                                defaultElevation = 5.dp
                            )
                        ) {

                            Text(
                                text = option,
                                style = MaterialTheme.typography.headlineLarge,
                                fontSize = 15.sp
                            )

                        }
                    }

                }

            }
        }
    }


}

@Composable
fun CorrectAnswers(
    questionList: List<Question>,
    answers: HashMap<Int, String>,
    navController: NavController
) {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .padding(vertical = 20.dp)
            .clip(RoundedCornerShape(20.dp))
            .verticalScroll(scrollState)
            .fillMaxSize(),

    ) {
        questionList.forEach { question ->

            Card(
                modifier = Modifier
                    .padding(vertical = 10.dp)
                    .shadow(16.dp, RoundedCornerShape(20.dp)),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {
                Column (
                    modifier = Modifier
                        .padding(20.dp)
                        .fillMaxWidth()
                ){

                    if(answers.containsKey(question.questionID)){
                        answers.entries.forEach {
                            if(question.questionID == it.key){
                                Text(text = question.question)
                                    Column(
                                        modifier = Modifier.padding(vertical = 20.dp)
                                    ) {
                                        for (option in question.options) {
                                            Column (
                                                modifier = Modifier.padding(vertical = 10.dp)
                                            ){

                                                if (option == it.value) {
                                                    Text("Your answer: ", fontWeight = FontWeight.Bold)
                                                    if (it.value == question.correctAnswer) {
                                                        Row {
                                                            Icon(
                                                                imageVector = Icons.Rounded.Check,
                                                                contentDescription = "Correct",
                                                                tint = Color(0xFF14AF14)
                                                            )

                                                            Text(text = option, color = Color(0xFF14AF14))
                                                        }

                                                    } else {
                                                        Row {
                                                            Icon(
                                                                imageVector = Icons.Rounded.Close,
                                                                contentDescription = "Incorrect",tint = Color.Red
                                                            )
                                                            Text(text = option, color = Color.Red)
                                                        }

                                                    }


                                                } else {
                                                    Text(text = option)
                                                }
                                            }
                                    }


                                }
                                Text(text = "Correct answer: ${question.correctAnswer}", fontStyle = FontStyle.Italic)
                            }


                        }
                    } else {
                        Text(text = "No Answer")
                        Text(question.question)

                            for (option in question.options) {
                                if(option == question.correctAnswer){
                                    Text(option, color = Color.LightGray)
                                }else {
                                    Text(text = option)
                                }
                            }

                        Text(text = "Correct answer: ${question.correctAnswer}")

                    }
                }

            }

        }
        Button(
            onClick = {
                navController.popBackStack()
                navController.navigate(MainScreens.DASHBOARD.name)
            },
            modifier = Modifier
                .padding(10.dp)
                .shadow(16.dp)
                .height(50.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Gold
            ),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(text = "BACK TO HOME", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.displayLarge, fontSize = 15.sp)
        }
    }


}


fun checkResults(answers: HashMap<Int, String>, quizQuestions: List<Question>): Int{
    var correctAnswers = 0
    quizQuestions.forEach {
            question ->
        answers.forEach { (k, s) ->
            if(k == question.questionID && s == question.correctAnswer){
                correctAnswers++
            }
        }
    }
    println("$correctAnswers Correct")
    return correctAnswers
}

@Composable
fun Confetti() {
    var confettiState by remember { mutableStateOf(emptyList<ConfettiParticle>()) }
    val density = LocalDensity.current.density
    LaunchedEffect(true) {

        val confettiList = List(20) {
            ConfettiParticle(
                x = Random.nextFloat() * 400 * density,
                y = Random.nextFloat() * 300 * density,
                rotation = Random.nextFloat() * 360,
                color = Color(Random.nextFloat(), Random.nextFloat(), Random.nextFloat())
            )
        }
        confettiState = confettiList

        while (true) {
            delay(16) // Update every 16 milliseconds (approximately 60 frames per second)
            confettiState = confettiState.map { it.move() }
        }
    }

    Canvas(
        modifier = Modifier
    ) {
        confettiState.forEach { confetti ->
            translate(left = confetti.x, top = confetti.y) {
                rotate(degrees = confetti.rotation ,pivot = Offset(-400f,-400f)) {
                    drawRect(color = confetti.color, size = Size(confetti.size.value,confetti.size.value))
                }
            }
        }
    }
}

data class ConfettiParticle(
    val x: Float,
    val y: Float,
    val rotation: Float,
    val color: Color
) {
    val size = 20.dp

    fun move(): ConfettiParticle {
        return copy(x = x, y = y, rotation = rotation + 1f)
    }
}




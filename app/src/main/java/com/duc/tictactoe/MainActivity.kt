@file:OptIn(ExperimentalFoundationApi::class)

package com.duc.tictactoe

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.duc.tictactoe.ui.theme.TicTacToeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TicTacToeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    var start by remember { mutableStateOf(false) }                             //title screen
                    Column() {
                        Button(
                            onClick = { if(start == false) {start = true} else {
                                start = false
                                PlayerAmountReset()
                            } },
                            modifier = Modifier
                                .height(35.dp)
                                .fillMaxWidth(),
                            colors = if(start == false) {
                                ButtonDefaults.buttonColors(Color.Green)
                            } else {
                                ButtonDefaults.buttonColors(Color.Red)
                            }
                        ) {
                            Text(text = if(start == false) {"start"}
                            else {"stop"})
                        }

                    }

                    if (start == false) {
                            TitleScreen()
                    } else  {
                        Field()
                    }
                }
            }
        }
    }
}


var playersAmount = 2
fun PlayerAmountReset() {
    playersAmount = 2
}
var name1 = ""
var name2 = ""
var name3 = ""
var name4 = ""
var name5 = ""
var name6 = ""
var name7 = ""
var name8 = ""
var name9 = ""
var name10 = ""

var color1 = ""
var color2 = ""
var color3 = ""
var color4 = ""
var color5 = ""
var color6 = ""
var color7 = ""
var color8 = ""
var color9 = ""
var color10 = ""


@Composable
fun TitleScreen() {
    var playersAmountDisplay by remember {
        mutableStateOf(2)
    }
    fun PlayerMinus() {
        if(playersAmountDisplay > 1) {
            playersAmount --
            playersAmountDisplay --
        } else {
            playersAmount = 20
            playersAmountDisplay = 20
        }
    }
    fun PlayerPlus() {
        if(playersAmountDisplay < 20) {
            playersAmount++
            playersAmountDisplay++
        } else {
            playersAmount = 1
            playersAmountDisplay = 1
        }
    }
    Box() {
        Column(modifier = Modifier.padding(start = 5.dp, top = 40.dp)) {
            Row() {
                var customName1 by remember{ mutableStateOf("")}
                OutlinedTextField(value = customName1, onValueChange = { newText ->
                    customName1 = newText.take(1)
                    name1 = customName1
                }, modifier = Modifier
                    .width(100.dp)
                    .height(50.dp),
                    singleLine = true
                )
                Text(text = "Letter ")

                var customColor1 by remember{ mutableStateOf("")}
                OutlinedTextField(value = customColor1, onValueChange = { newText ->
                    customColor1 = newText
                    color1 = customColor1
                }, modifier = Modifier
                    .width(100.dp)
                    .height(50.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Text(text = "Color 1")
            }
            Row() {
                var customName2 by remember{ mutableStateOf("")}
                OutlinedTextField(value = customName2, onValueChange = { newText ->
                    customName2 = newText.take(1)
                    name2 = customName2
                }, modifier = Modifier
                    .width(100.dp)
                    .height(50.dp),
                    singleLine = true
                )
                Text(text = "Letter ")

                var customColor2 by remember{ mutableStateOf("")}
                OutlinedTextField(value = customColor2, onValueChange = { newText ->
                    customColor2 = newText
                    color2 = customColor2
                }, modifier = Modifier
                    .width(100.dp)
                    .height(50.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Text(text = "Color 2")
            }
            Row() {
                var customName3 by remember{ mutableStateOf("")}
                OutlinedTextField(value = customName3, onValueChange = { newText ->
                    customName3 = newText.take(1)
                    name3 = customName3
                }, modifier = Modifier
                    .width(100.dp)
                    .height(50.dp),
                    singleLine = true
                )
                Text(text = "Letter ")

                var customColor3 by remember{ mutableStateOf("")}
                OutlinedTextField(value = customColor3, onValueChange = { newText ->
                    customColor3 = newText
                    color3 = customColor3
                }, modifier = Modifier
                    .width(100.dp)
                    .height(50.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Text(text = "Color 3")
            }
            Row() {
                var customName4 by remember{ mutableStateOf("")}
                OutlinedTextField(value = customName4, onValueChange = { newText ->
                    customName4 = newText.take(1)
                    name4 = customName4
                }, modifier = Modifier
                    .width(100.dp)
                    .height(50.dp),
                    singleLine = true
                )
                Text(text = "Letter ")

                var customColor4 by remember{ mutableStateOf("")}
                OutlinedTextField(value = customColor4, onValueChange = { newText ->
                    customColor4 = newText
                    color4 = customColor4
                }, modifier = Modifier
                    .width(100.dp)
                    .height(50.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Text(text = "Color 4")
            }
            Row() {
                var customName5 by remember{ mutableStateOf("")}
                OutlinedTextField(value = customName5, onValueChange = { newText ->
                    customName5 = newText.take(1)
                    name5 = customName5
                }, modifier = Modifier
                    .width(100.dp)
                    .height(50.dp),
                    singleLine = true
                )
                Text(text = "Letter ")

                var customColor5 by remember{ mutableStateOf("")}
                OutlinedTextField(value = customColor5, onValueChange = { newText ->
                    customColor5 = newText
                    color5 = customColor5
                }, modifier = Modifier
                    .width(100.dp)
                    .height(50.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Text(text = "Color 5")
            }
            Row() {
                var customName6 by remember{ mutableStateOf("")}
                OutlinedTextField(value = customName6, onValueChange = { newText ->
                    customName6 = newText.take(1)
                    name6 = customName6
                }, modifier = Modifier
                    .width(100.dp)
                    .height(50.dp),
                    singleLine = true
                )
                Text(text = "Letter ")

                var customColor6 by remember{ mutableStateOf("")}
                OutlinedTextField(value = customColor6, onValueChange = { newText ->
                    customColor6 = newText
                    color6 = customColor6
                }, modifier = Modifier
                    .width(100.dp)
                    .height(50.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Text(text = "Color 6")
            }
            Row() {
                var customName7 by remember{ mutableStateOf("")}
                OutlinedTextField(value = customName7, onValueChange = { newText ->
                    customName7 = newText.take(1)
                    name7 = customName7
                }, modifier = Modifier
                    .width(100.dp)
                    .height(50.dp),
                    singleLine = true
                )
                Text(text = "Letter ")

                var customColor7 by remember{ mutableStateOf("")}
                OutlinedTextField(value = customColor7, onValueChange = { newText ->
                    customColor7 = newText
                    color7 = customColor7
                }, modifier = Modifier
                    .width(100.dp)
                    .height(50.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Text(text = "Color 7")
            }
            Row() {
                var customName8 by remember{ mutableStateOf("")}
                OutlinedTextField(value = customName8, onValueChange = { newText ->
                    customName8 = newText.take(1)
                    name8 = customName8
                }, modifier = Modifier
                    .width(100.dp)
                    .height(50.dp),
                    singleLine = true
                )
                Text(text = "Letter ")

                var customColor8 by remember{ mutableStateOf("")}
                OutlinedTextField(value = customColor8, onValueChange = { newText ->
                    customColor8 = newText
                    color8 = customColor8
                }, modifier = Modifier
                    .width(100.dp)
                    .height(50.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Text(text = "Color 8")
            }
            Row() {
                var customName9 by remember{ mutableStateOf("")}
                OutlinedTextField(value = customName9, onValueChange = { newText ->
                    customName9 = newText.take(1)
                    name9 = customName9
                }, modifier = Modifier
                    .width(100.dp)
                    .height(50.dp)
                )
                Text(text = "Letter ")

                var customColor9 by remember{ mutableStateOf("")}
                OutlinedTextField(value = customColor9, onValueChange = { newText ->
                    customColor9 = newText
                    color9 = customColor9
                }, modifier = Modifier
                    .width(100.dp)
                    .height(50.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Text(text = "Color 9")
            }
            Row() {
                var customName10 by remember{ mutableStateOf("")}
                OutlinedTextField(value = customName10, onValueChange = { newText ->
                    customName10 = newText.take(1)
                    name10 = customName10
                }, modifier = Modifier
                    .width(100.dp)
                    .height(50.dp),
                    singleLine = true
                )
                Text(text = "Letter ")

                var customColor10 by remember{ mutableStateOf("")}
                OutlinedTextField(value = customColor10, onValueChange = { newText ->
                    customColor10 = newText
                    color10 = customColor10
                }, modifier = Modifier
                    .width(100.dp)
                    .height(50.dp),
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Text(text = "Color 10")
            }
        }

    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(top = 20.dp, end = 15.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.End
    ) {
        Spacer(modifier = Modifier.size(50.dp))
        Text(text = "$playersAmountDisplay players", modifier = Modifier.padding(bottom = 10.dp), color = Color.White)
        Button(onClick = { PlayerPlus() }, colors = ButtonDefaults.buttonColors(Color.White)) {
            Text(text = "+")
        }
        Button(onClick = { PlayerMinus() }, colors = ButtonDefaults.buttonColors(Color.White)) {
            Text(text = "-")
        }
    }
}




@OptIn(ExperimentalFoundationApi::class)
@SuppressLint("SuspiciousIndentation")
@Composable
fun Field() {
    val buttonColor = Color(0xFFcccccc)
    val gridSize = playersAmount + 1
    val textSize = 240.sp / gridSize
    val playerList = remember {
        mutableStateListOf(
            "X",
            "O",
            "F",
            "C",
            "K",
            "T",
            "B",
            "N",
            "U",
            "Z",
            "P",
            "R",
            "G",
            "J",
            "L",
            "H",
            "E",
            "A",
            "I",
            "M"
        )
    }

        if(name1 != "" && name1 != " ") { playerList[0] = name1 }
        if(name2 != "" && name2 != " ") { playerList[1] = name2 }
        if(name3 != "" && name3 != " ") { playerList[2] = name3 }
        if(name4 != "" && name4 != " ") { playerList[3] = name4 }
        if(name5 != "" && name5 != " ") { playerList[4] = name5 }
        if(name6 != "" && name6 != " ") { playerList[5] = name6 }
        if(name7 != "" && name7 != " ") { playerList[6] = name7 }
        if(name8 != "" && name8 != " ") { playerList[7] = name8 }
        if(name9 != "" && name9 != " ") { playerList[8] = name9 }
        if(name10 != "" && name10 != " ") { playerList[9] = name10 }

    val colorValueList = remember {
        mutableStateListOf(
            0xFFff0026,
            0xFF0008ff,
            0xFF09ff00,
            0xFFffea00,
            0xFFb700ff,
            0xFF00fff7,
            0xFFff0073,
            0xFFff8800,
            0xFF000000,
            0xFFffffff,
            0xFF00ff84,
            0xFF8c1c00,
            0xFF00598c,
            0xFF0e008c,
            0xFF008c05,
            0xFF8c0000,
            0xFF006e8c,
            0xFF608c00,
            0xFFff7dee,
            0xFF8c0033
        )
    }
    val colorList = remember {
        mutableStateListOf(colorValueList[0])
    }

    for(colorListAddRepeater in 1 until playersAmount) {
        colorList.add(colorValueList[colorListAddRepeater])
    }
        if(color1 != "")if(color1.toInt() in 1..20) { colorList[0] = colorValueList[color1.toInt()-1] }
        if(color2 != "")if(color2.toInt() in 1..20) { colorList[1] = colorValueList[color2.toInt()-1] }
        if(color3 != "")if(color3.toInt() in 1..20) { colorList[2] = colorValueList[color3.toInt()-1] }
        if(color4 != "")if(color4.toInt() in 1..20) { colorList[3] = colorValueList[color4.toInt()-1] }
        if(color5 != "")if(color5.toInt() in 1..20) { colorList[4] = colorValueList[color5.toInt()-1] }
        if(color6 != "")if(color6.toInt() in 1..20) { colorList[5] = colorValueList[color6.toInt()-1] }
        if(color7 != "")if(color7.toInt() in 1..20) { colorList[6] = colorValueList[color7.toInt()-1] }
        if(color8 != "")if(color8.toInt() in 1..20) { colorList[7] = colorValueList[color8.toInt()-1] }
        if(color9 != "")if(color9.toInt() in 1..20) { colorList[8] = colorValueList[color9.toInt()-1] }
        if(color10 != "")if(color10.toInt() in 1..20) { colorList[9] = colorValueList[color10.toInt()-1] }

    var playerNumber by remember { mutableStateOf(0) }
    var turns by remember { mutableStateOf(0) }
    var done by remember { mutableStateOf(false) }
    if (turns == gridSize * gridSize) {
        done = true
    }

    val list = remember {
        mutableStateListOf(
            -1
        )
    }
    if (list.size < gridSize * gridSize) {
        for (repeat in 0 until gridSize * gridSize - 1) {
            list.add(-1)
        }
    }

    Column(                                                                                                 // layout
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(5.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LazyVerticalGrid(
            cells = GridCells.Fixed(gridSize),
            verticalArrangement = Arrangement.spacedBy(1.dp),
            horizontalArrangement = Arrangement.spacedBy(1.dp)
        ) {
            itemsIndexed(list) { index, s ->
                Box(
                    modifier = Modifier
                        .background(color = buttonColor)
                        .clickable {
                            if (done == false) {
                                if (list[index] == -1) {
                                    list[index] = playerNumber
                                    if (playerNumber < playersAmount - 1) {
                                        playerNumber++
                                    } else {
                                        playerNumber = 0
                                    }
                                    turns++
                                }
                            }
                        }
                ) {
                    Text(                                                                                   // button text
                        text = if (list[index] != -1) {
                            playerList[list[index]]
                        } else {
                            ""
                        },
                        fontSize = textSize,
                        color = if (list[index] != -1) {
                            Color(colorList[list[index]])
                        } else {
                            Color.Black
                        },
                        modifier = Modifier
                            .align(Alignment.Center)
                    )
                }
            }
        }

        fun findWinner(): Int {                                                                             // find Winner
            fun checkEquals(a: Int, b: Int): Boolean {                                                      // compare numbers
                if (a >= list.size) return false
                if (b >= list.size) return false
                return list[a] == list[b]
            }
                                                                                                            // vertical check
            for (repeatVertical in 0 until list.size - gridSize * 2) {
                if (list[repeatVertical] != -1 && checkEquals(
                        repeatVertical,
                        repeatVertical + gridSize
                    ) && list[repeatVertical] == list[repeatVertical + gridSize + gridSize]
                ) return list[repeatVertical]
            }
                                                                                                            // diagonal right to left check
            val diagonalRTL = (0 until list.size).filter { index ->                                     // number filter
                (index + 1) % gridSize != 1 && (index + 1) % gridSize != 2
                        && index < gridSize * gridSize - gridSize * 2
            }
            for (repeatDiagonalRTL in diagonalRTL) {                                                        // number checker
                if (list[repeatDiagonalRTL] != -1 && checkEquals(
                        repeatDiagonalRTL,
                        repeatDiagonalRTL + gridSize - 1
                    ) && checkEquals(
                        repeatDiagonalRTL + gridSize - 1,
                        repeatDiagonalRTL + 2 * gridSize - 2
                    )
                ) return list[repeatDiagonalRTL]
            }
                                                                                                            // diagonal left to right check
            val diagonalLTR = (0 until list.size).filter { index ->                                     // number filter
                (index + 1) % gridSize != 0 && (index + 1) % gridSize != gridSize - 1
                        && index < gridSize * gridSize - gridSize * 2
            }
            for (repeatDiagonalLTR in diagonalLTR) {                                                        // number checker
                if (list[repeatDiagonalLTR] != -1 && checkEquals(
                        repeatDiagonalLTR,
                        repeatDiagonalLTR + gridSize + 1
                    ) && checkEquals(
                        repeatDiagonalLTR + gridSize + 1,
                        repeatDiagonalLTR + gridSize * 2 + 2
                    )
                ) return list[repeatDiagonalLTR]
            }
                                                                                                            // horizontal
            val horizontal = (0 until list.size).filter { index ->                                      // number filter
                (index + 1) % gridSize != 0 && (index + 1) % gridSize != gridSize - 1
            }
            for (repeatHorizontal in horizontal) {                                                          // number checker
                if (list[repeatHorizontal] != -1 && checkEquals(
                        repeatHorizontal,
                        repeatHorizontal + 1
                    ) && checkEquals(repeatHorizontal + 1, repeatHorizontal + 2)
                ) return list[repeatHorizontal]
            }

            return -1
        }

        val winner = findWinner()
        if (winner != -1) {
            done = true
        }
        Text(                                                                                               // descriptor text
            text = if (winner != -1) {
                "${playerList[winner]} wins"
            } else if (turns != gridSize * gridSize) {
                "player ${playerList[playerNumber]} turn"
            } else {
                "tie"
            },
            fontSize = 50.sp,
            color = if(done == false) {Color(colorList[playerNumber])}                                      // text color
        else if(winner != -1) {Color(colorList[winner])}
        else {Color.White}
        )

        Spacer(modifier = Modifier.size(20.dp))
        Button(                                                                                             // restart button
            onClick = {
                for (index in 0 until list.size) {
                    list[index] = -1
                }
                turns = 0
                playerNumber = 0
                done = false
            },
            modifier = Modifier
                .width(150.dp)
                .height(70.dp),
            colors = if (done == false) {
                ButtonDefaults.buttonColors(backgroundColor = Color(colorList[playerNumber])
                )
            } else {
                ButtonDefaults.buttonColors(backgroundColor = if(winner != -1) {Color(colorList[winner])} else {Color.White})
            }
        )
        {
            Text(
                text = "restart",
                fontSize = 24.sp
            )
        }
    }
}
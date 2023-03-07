package com.example.interfacelogin

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.interfacelogin.ui.theme.InterfaceLoginTheme

class MainActivitySignUp : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InterfaceLoginTheme {

                InterfaceLoginUp()
            }
        }
    }
}
@Composable
fun InterfaceLoginUp() {

    var username by rememberSaveable{
        mutableStateOf("")
    }

    var phone by rememberSaveable {
        mutableStateOf("")
    }

    var email by rememberSaveable {
        mutableStateOf("")
    }

    var password by rememberSaveable {
        mutableStateOf("")
    }

    var boxSelect by rememberSaveable {
        mutableStateOf(false)
    }

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {

        Column(
            modifier = Modifier.fillMaxSize()
        ) {

            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.End
            ){
                Column(
                    modifier = Modifier
                        .width(150.dp)
                        .height(50.dp)
                        .background(
                            color = Color(207, 6, 240),
                            shape = RoundedCornerShape(bottomStart = 20.dp)
                        )
                ) {
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = stringResource(id = R.string.signUp),
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(207,6,240)
                )
                Text(text = stringResource(id = R.string.subtitle_signUp),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray
                )
            }
            //Spacer(modifier = Modifier.height(40.dp))
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                OutlinedTextField(value = username, onValueChange = {
                    Log.i("Smartphone", it)
                    username = it
                },
                    label = { Text(text = stringResource(id = R.string.Username))},
                    modifier = Modifier
                        .padding(
                            start = 23.dp,
                            top = 33.dp,
                            end = 40.dp
                        )
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.user),
                            contentDescription = "",
                            modifier = Modifier.size(33.dp)
                        )
                    }
                )
                OutlinedTextField(value = phone, onValueChange = {
                    Log.i("Smartphone", it)
                    phone = it
                },
                    label = { Text(text = stringResource(id = R.string.phone))},
                    modifier = Modifier
                        .padding(
                            start = 23.dp,
                            top = 10.dp,
                            end = 40.dp
                        )
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.phone),
                            contentDescription = "",
                            modifier = Modifier.size(33.dp)
                        )
                    }
                )
                OutlinedTextField(value = email, onValueChange = {
                    Log.i("Smartphone", it)
                    email = it
                },
                    label = { Text(text = stringResource(id = R.string.email))},
                    modifier = Modifier
                        .padding(
                            start = 23.dp,
                            top = 10.dp,
                            end = 40.dp
                        )
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.email),
                            contentDescription = "",
                            modifier = Modifier.size(33.dp)
                        )
                    }
                )
                OutlinedTextField(value = password, onValueChange = {
                    Log.i("Smartphone", it)
                    password = it
                },
                    label = { Text(text = stringResource(id = R.string.password))},
                    modifier = Modifier
                        .padding(
                            start = 23.dp,
                            top = 10.dp,
                            end = 40.dp
                        )
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.seguranca),
                            contentDescription = "",
                            modifier = Modifier.size(33.dp)
                        )
                    }
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 5.dp)
            ) {
                Row (modifier = Modifier.fillMaxWidth()){
                    Checkbox(checked = boxSelect, onCheckedChange = {
                        boxSelect = it
                    },
                        modifier = Modifier.padding(start = 15.dp))

                    Spacer(modifier = Modifier.width(2.dp))

                    Text(text = stringResource(id = R.string.over),
                        modifier = Modifier.padding(top = 10.dp),
                        fontSize = 20.sp,
                        color = Color.Gray
                    )
                }
                Column( modifier = Modifier.fillMaxWidth()) {
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 40.dp, top = 10.dp, end = 40.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(207, 6, 240))

                    ) {
                        Text(
                            text = stringResource(id = R.string.button_createAccount),
                            modifier = Modifier.padding(10.dp),
                            fontSize = 20.sp,
                            color = Color.White
                        )
                    }
                    Spacer(modifier = Modifier.height(13.dp))
                    Row(modifier = Modifier
                        .fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Text(
                            text = stringResource(id = R.string.have_account),
                            fontSize = 18.sp,
                            color = Color.Gray
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = stringResource(id = R.string.signIn),
                            modifier = Modifier.padding(end = 10.dp),
                            fontSize = 18.sp,
                            color = Color(207, 6, 240)
                        )
                    }
                }
            }
            Column(modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Bottom
                ,horizontalAlignment = Alignment.Start) {
                Column(
                    modifier = Modifier
                        .width(150.dp)
                        .height(50.dp)
                        .background(
                            color = Color(207, 6, 240),
                            shape = RoundedCornerShape(topEnd = 20.dp)
                        )
                )
                {
                }
            }
        }
    }
}
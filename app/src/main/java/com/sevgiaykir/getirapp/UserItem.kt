package com.sevgiaykir.getirapp

import java.io.Serializable

data class UserItem(var user_id:Int,
                    var user_name:String,
                    var user_surname:String,
                    var user_address:String,
                    var user_mail:String,
                    var user_phone:String): Serializable {
}
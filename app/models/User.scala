package models

import com.fasterxml.jackson.annotation.JsonIgnore
import java.io.UnsupportedEncodingException
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import java.util.ArrayList
import java.util.Date
import java.util.List
import java.util.UUID
import User._
import play.api.http.Writeable

object User {

    def all() : List[User] = {
        null
    }
  
    def create(user_name: String, password: String) = {"[ut"}

    def get(id: Long) = { "get"}
  
    def delete(id: Long) = { "hey "}
}

class User()  {
    
}

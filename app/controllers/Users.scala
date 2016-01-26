package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json._
import models.User
//import com.wordnik.swagger.annotations._

//@Api(value = "api/users", description = "Operations about Users")
class Users extends Controller {


	def login(user_name:String, password: String) = Action {
  		val json = Json.obj(
  			"user_name" -> user_name,
  			"password" -> password)
    	Ok(json)
 	}

 	def get(id: Long) = Action {
 		Ok("hey")
 	}

 	def getAll() = Action {
 		//Ok(views.html.index(User.all().toString))
 		Ok("goo")
 	}

 	def create() = Action {
 		Ok(User.create("dh","d"))
 	}

 	def delete(id: Long) = Action {
 		Ok(User.delete(id))
 	}

}

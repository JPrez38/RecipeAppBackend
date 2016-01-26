package controllers

import com.fasterxml.jackson.databind.node.ObjectNode
import models.User
import play.Logger
import play.api.data._
import play.api.data.Forms._
import play.libs.F
import play.libs.Json
import play.mvc._
import play.libs.Json.toJson
import play.mvc.Controller.request
import play.mvc.Controller.response

class SecurityController extends Controller {

  val AUTH_TOKEN_HEADER = "X-AUTH-TOKEN"

  val AUTH_TOKEN = "authToken"

  // def getUser(): User = {
  //   Http.Context.current().args.get("user").asInstanceOf[User]
  // }

  // def login(): Result = {
  //   val loginForm = Form.form(classOf[Login]).bindFromRequest()
  //   if (loginForm.hasErrors()) {
  //     return badRequest(loginForm.errorsAsJson())
  //   }
  //   val login = loginForm.get
  //   val user = User.findByEmailAddressAndPassword(login.emailAddress, login.password)
  //   if (user == null) {
  //     unauthorized()
  //   } else {
  //     val authToken = user.createToken()
  //     val authTokenJson = Json.newObject()
  //     authTokenJson.put(AUTH_TOKEN, authToken)
  //     response().setCookie(AUTH_TOKEN, authToken)
  //     ok(authTokenJson)
  //   }
  // }

  // @Security.Authenticated(classOf[Secured])
  // def logout(): Result = {
  //   response().discardCookie(AUTH_TOKEN)
  //   getUser.deleteAuthToken()
  //   redirect("/")
  // }

  // class Login {

  //   @Constraints.Required
  //   @Constraints.Email
  //   var emailAddress: String = _

  //   @Constraints.Required
  //   var password: String = _
  // }
}


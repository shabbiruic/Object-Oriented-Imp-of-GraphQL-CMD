package Fields

// It is a scalar filed means it is not a composite it has just one piece of information it can act as a field
// in following queries i.e. which it extends
case class Login(fieldName:String="login") extends Field with FollowersEdgeNodeField with CollaboratorEdgeNodeField {
  override def buildField(): String =
    fieldName
}

object Login{
  def apply():Login=
  new Login()
}
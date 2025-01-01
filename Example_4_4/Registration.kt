class Registration() { //
    private var email: String=""
    private var password: String=""

    fun setMail(mail: String) {
        email = mail
    }

    fun setPass(pass: String) {
        if (pass.length > 5) {
            password = pass
        } else {
            println("Пароль не соответствует требованиям. Длина пароля должна быть не менее 6 символов.")
        }
    }
    fun getMail(): String {
        return email.uppercase()
    }
}

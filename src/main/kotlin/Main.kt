fun main(args: Array<String>) {
    var amount: Int = 99
    var comission : Int
    if (amount >= 1000) {
        comission = amount * 35/1000
    }  else {
        comission = 35
    }
    print("Ваша комиссия составит " + comission + " руб.")
}
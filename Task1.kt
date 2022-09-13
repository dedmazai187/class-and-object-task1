/*
Напишите класс прямоугольника (Rectangle) с полями width и height (ширина и высота), инициализирующимися через конструктор.
Добавьте в него функции, которые будут считать площадь (width*height) и периметр прямоугольника (2*(width+height))
Добавьте функцию, которая будет отвечать на вопрос является ли этот прямоугольник квадратом (равны ли его стороны)
Создайте объект класса Rectangle и проверьте работоспособность написанных функций

Для этой задачи есть видео с разбором.*/

// Создаём класс прямоугольник(Rectangle),с полями ширина и высота(width и height)

class Rectangle(val width:Double,val height:Double){  // создаём функцию которая вычесляет площадь
    fun area():Double{
       return width*height
    }
    fun perimeter():Double{
        return 2 *(width+height) // функция вычесляет периметр
    }
    fun isSquare(): Boolean{  //Добавьте функцию, которая будет отвечать на вопрос является ли этот прямоугольник квадратом (равны ли его стороны)
        return  width==height
    }
}

fun main() {
    val rectangle = Rectangle(3.2,5.8)
    val area = rectangle.area()

    println(rectangle.area())
    println(rectangle.isSquare())
    println(rectangle.perimeter())
}
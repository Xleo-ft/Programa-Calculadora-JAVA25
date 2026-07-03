void main() {
    IO.println("========================================");
    IO.println("Bienvenido a la calculadora de la PUCE ");
    IO.println("========================================");
    IO.println(" 1.Operacion de Suma\n 2.Operacion de Resta\n 3.Operacion de Multiplicacion\n 4.Operacion de Division");
    IO.println("========================================");
    int numopcion = Integer.parseInt(IO.readln("Ingresa el numero de opcion que quieres realizar :\n"));
    IO.println("========================================");

    switch (numopcion) {
        case 1:
            IO.println("Operacion de Adicion ");
            var num1 = IO.readln("Ingresa un numero : ");
            var num2 = IO.readln("Ingresa un numero : ");
            var resultadoSuma = Integer.parseInt(num1) + Integer.parseInt(num2);
            var salidaSuma = String.format("El resultado es : \n%s + %s = %d ", num1, num2, resultadoSuma);
            IO.println(salidaSuma);
            break;
        case 2:
            IO.println("Operacion de Sustraccion");
            var numresta1 = IO.readln("Ingresa un numero : ");
            var numresta2 = IO.readln("Ingresa un numero : ");
            var resultadoResta = Integer.parseInt(numresta1) - Integer.parseInt(numresta2);
            var salidaResta = String.format("El resultado es : \n%s - %s = %d ", numresta1, numresta2, resultadoResta);
            IO.println(salidaResta);
            break;
        case 3:
            IO.println("Operacion de Multiplicacion");
            var numMilti = IO.readln("Ingresa un numero : ");
            var numMulti2 = IO.readln("Ingresa un numero : ");
            var resultadoMulti = Integer.parseInt(numMilti) * Integer.parseInt(numMulti2);
            var salidaMulti = String.format("El resultado es : \n%s * %s = %d ", numMilti, numMulti2, resultadoMulti);
            IO.println(salidaMulti);
            break;
            case 4:
            IO.println("Operacion de Division");
            Double numDivision1 = Double.parseDouble(IO.readln("Ingresa un numero : "));
            Double numDivision2 = Double.parseDouble(IO.readln("Ingresa un numero : "));
            Double resultadoDivision = numDivision1 / numDivision2;
            String salidaDivision = String.format("El resultado es:\n%.2f / %.2f = %.2f", numDivision1, numDivision2, resultadoDivision);
            IO.println(salidaDivision);
            break;


    }

}

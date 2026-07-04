void main() {
    while (true) { // Bucle infinito hasta que el usuario decida salir
        IO.println("========================================");
        IO.println("Bienvenido  a la calculadora de la PUCE ");
        IO.println("========================================");
        IO.println(" 1.Operacion de Suma\n 2.Operacion de Resta\n 3.Operacion de Multiplicacion\n 4.Operacion de Division\n 5.Salir");
        IO.println("========================================");

        try {
            int numopcion = Integer.parseInt(IO.readln("Ingresa el numero de opcion que quieres realizar :\n"));
            IO.println("========================================");

            // Validación de rango
            if (numopcion < 1 || numopcion > 5) {
                IO.println("Error: Solo se permiten opciones entre 1 y 5.");
                continue; // Regresa al menú sin cerrar el programa
            }

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
                    if (numDivision2 == 0) {
                        IO.println("Error: No se puede dividir entre cero bro.");
                        continue; // Regresa al menú
                    }
                    Double resultadoDivision = numDivision1 / numDivision2;
                    String salidaDivision = String.format("El resultado es:\n%.2f / %.2f = %.2f", numDivision1, numDivision2, resultadoDivision);
                    IO.println(salidaDivision);
                    break;
                case 5:
                    IO.println("Saliendo de la calculadora... ¡Hasta pronto!");
                    return; // Termina el programa
            }
        } catch (NumberFormatException e) {
            IO.println("Error: Solo se permiten números enteros en la opción.");
            continue; // Regresa al menú
        }
    }
}

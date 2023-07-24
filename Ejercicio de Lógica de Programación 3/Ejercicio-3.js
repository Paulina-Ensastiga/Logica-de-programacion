// Función para calcular el factorial de un número de forma recursiva
function calcularFactorial(numero) {
    // Caso base: Si el número es 0 o 1, su factorial es 1
    if (numero === 0 || numero === 1) {
      return 1;
    } else {
      // Caso recursivo: Multiplicar el número por el factorial del número anterior
      return numero * calcularFactorial(numero - 1);
    }
  }
  
  // Función para obtener el número ingresado por el usuario y calcular el factorial
  function obtenerNumeroYFactorial() {
    let inputNumero = prompt("Ingrese un número para calcular su factorial:");
  
    // Convertir el valor ingresado a número
    const numero = parseInt(inputNumero);
  
    // Verificar si el valor ingresado es un número válido
    if (isNaN(numero)) {
      console.log("El valor ingresado no es un número válido. Por favor, intenta de nuevo.");
      return;
    }
  
    // Calcular el factorial del número
    const factorial = calcularFactorial(numero);
  
    // Mostrar el resultado en la consola o en el DOM
    console.log(factorial);
  }
  
  // Llamar a la función principal para obtener el número del usuario y calcular el factorial
  obtenerNumeroYFactorial();
  
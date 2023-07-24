// Función para calcular la serie de Fibonacci hasta cierta cantidad de números
function calcularFibonacci(cantidad) {
    let fibonacciSerie = [0, 1];
  
    // Calcular la serie de Fibonacci a partir del tercer número
    for (let i = 2; i < cantidad; i++) {
      const nextNumber = fibonacciSerie[i - 1] + fibonacciSerie[i - 2];
      fibonacciSerie.push(nextNumber);
    }
  
    return fibonacciSerie;
  }
  
  // Función para obtener la cantidad de números de la serie de Fibonacci
  function obtenerCantidadYFibonacci() {
    let inputCantidad = prompt("Ingrese la cantidad de números de la serie de Fibonacci:");
  
    // Convertir el valor ingresado a número
    const cantidad = parseInt(inputCantidad);
  
    // Verificar si el valor ingresado es un número válido
    if (isNaN(cantidad)) {
      console.log("El valor ingresado no es un número válido. Por favor, intenta de nuevo.");
      return;
    }
  
    // Calcular la serie de Fibonacci
    const fibonacciSerie = calcularFibonacci(cantidad);
  
    // Mostrar el resultado en la consola o en el DOM
    console.log(fibonacciSerie.join(', '));
  }
  
  // Llamar a la función principal para obtener la cantidad de números y calcular la serie de Fibonacci
  obtenerCantidadYFibonacci();
  
// Función para ordenar los números y mostrar los resultados
function ordenarNumeros(a, b, c) {
  const numbers = [a, b, c];
  numbers.sort((x, y) => x - y); // Ordenar de menor a mayor

  const isAllEqual = numbers[0] === numbers[2];
  console.log(numbers.join(', '));

  if (isAllEqual) {
    console.log("Los números son iguales.");
  } else {
    console.log(numbers.reverse().join(', ')); // Ordenar de mayor a menor
  }
}

// Función para obtener los datos ingresados por el usuario
function obtenerDatos() {
  let input1 = prompt("Ingrese el primer número:");
  let input2 = prompt("Ingrese el segundo número:");
  let input3 = prompt("Ingrese el tercer número:");

  // Convertir los datos ingresados a números
  const num1 = parseInt(input1);
  const num2 = parseInt(input2);
  const num3 = parseInt(input3);

  // Verificar si los datos ingresados son números válidos
  if (isNaN(num1) || isNaN(num2) || isNaN(num3)) {
    console.log("Alguno de los valores ingresados no es un número válido.");
    return;
  }

  // Llamar a la función para ordenar y mostrar los resultados
  ordenarNumeros(num1, num2, num3);
}

// Llamar a la función principal para obtener los datos del usuario
obtenerDatos();

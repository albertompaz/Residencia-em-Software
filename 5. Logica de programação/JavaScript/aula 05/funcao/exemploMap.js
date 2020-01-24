var fahrenheit = [0,32,45,50,65]

/*exemplo original
var celsius = fahrenheit.map(function(elem) {
    return Math.round((elem-32)*5/9)  // math.round é usado para arredondar o valor após a conta
})
*/

//exemplo mais simples
var celsius = fahrenheit.map(function(num) {
    return num*2
})

console.log (celsius)
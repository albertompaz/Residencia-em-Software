/*
//exemplo 01
var arr = [10,9,8,7,6];
for (var i = 0; i < arr.length; i++) {
   console.log(arr[i]);
}
*/

/*
//exemplo 02 (imprimindo os valores da matriz)
var arr = [
    [1,2], [3,4], [5,6]
  ];
  for (var i=0; i < arr.length; i++) {
    for (var j=0; j < arr[i].length; j++) {
      console.log(arr[i][j]);
    }
  } 

  console.log(arr[0][1])
*/

//exemplo 03 (multiplicando os valores entre si da matriz)
function multiplyAll(arr) {
    var product = 1;
    // Only change code below this line
      for (var i=0; i<arr.length; i++) {
        for (var j=0; j<arr[i].length; j++) {
          product = product*arr[i][j];
        }
      }
    // Only change code above this line
    return product;
  }
  
  // Modify values below to test your code
  multiplyAll([[1,2],[3,4],[5,6,7]]);
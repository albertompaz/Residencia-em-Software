function test (myCondition) {
  if (myCondition) {
     return "It was true";    // quando chega no primeiro return a função aborta retornando o que o return está informando, e não realizara o proximo return
  }
  return "It was false";
}

console.log(test(false));
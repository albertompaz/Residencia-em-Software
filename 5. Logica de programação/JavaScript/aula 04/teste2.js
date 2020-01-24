2function myFun() {
    console.log("Hello");
    return "World";
    console.log("byebye")
  }
  console.log(myFun());

  /*
  The above outputs "Hello" to the console, returns "World", 
  but "byebye"is never output, because the function exits at the returnstatement.
  */
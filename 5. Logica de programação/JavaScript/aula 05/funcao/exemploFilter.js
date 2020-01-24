function isBigEnough(value) {
    return value >= 10
}

var meuVetor = [1,2,6,4,22,5,15,8,80]

var filtered = meuVetor.filter(isBigEnough)

console.log(filtered)

/*  outro exemplo

var fruits = ['apple', 'banana', 'grapes', 'mango', 'orange'];


 / Array filters items based on search criteria (query)
 
function filterItems(query) {
    return fruits.filter(function(el) {
        return el.toLowerCase().indexOf(query.toLowerCase()) > -1;
    })
  }
  
  console.log(filterItems('ap')); // ['apple', 'grapes']
  console.log(filterItems('an')); // ['banana', 'mango', 'orange']

*/ 